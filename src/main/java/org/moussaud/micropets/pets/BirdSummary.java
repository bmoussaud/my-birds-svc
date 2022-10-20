package org.moussaud.micropets.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.function.Predicate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BirdSummary {

    @JsonProperty(value = "Total")
    int total = 0;

    @JsonProperty(value = "Hostname")
    String hostname;

    @JsonProperty(value = "Pets")
    List<Bird> pets = new ArrayList<>();

    public void addBird(Bird Bird) {
        pets.add(Bird);
        total = total + 1;
        this.hostname = getHostname();
        Bird.hostname = this.hostname;
        Bird.uri = String.format("/birds/v1/data/%d", Bird.index);
    }

    private String getHostname() {
        try {
            return InetAddress.getLocalHost().toString();
        } catch (UnknownHostException e) {
            return "Unknown";
        }
    }

    @Override
    public String toString() {
        return "BirdSummary [hostname=" + hostname + ", pets=" + pets + ", total=" + total + "]";
    }

    public BirdSummary filter() {
        Collections.shuffle(this.pets);
        Random random = new Random();
        int number = random.nextInt(pets.size());
        this.pets.removeIf(new Predicate<Bird>() {
            @Override
            public boolean test(Bird Bird) {
                return Bird.index > number;
            }
        });
        this.total = pets.size();
        return this;
    }

}
