# Accelerator Log

## Options
```json
{
  "createResourceClaim" : true,
  "dbType" : "postgresql",
  "imageRegistry" : "akseutap3registry.azurecr.io",
  "petKind" : "Bird",
  "pkgName" : "org.moussaud.micropets.pets",
  "projectName" : "oiseau-service"
}
```
## Log
```
┏ engine (Chain)
┃  Info Running Chain(GeneratorValidationTransform, UniquePath)
┃ ┏ ┏ engine.transformations[0].validated (Combo)
┃ ┃ ┃  Info Combo running as Chain(Merge(merge), UniquePath(UseLast), chain...)
┃ ┃ ┃ engine.transformations[0].validated.<combo> (Chain)
┃ ┃ ┃  Info Running Chain(Merge, UniquePath, RewritePath)
┃ ┃ ┃ ┏ engine.transformations[0].validated.<combo>.transformations[0] (Merge)
┃ ┃ ┃ ┃  Info Running Merge(Combo, Combo, Combo, Combo, Combo, Combo)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.<combo>.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Include
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.<combo>.transformations[0].sources[0].include (Include)
┃ ┃ ┃ ┃ ┃  Info Will include [.mvn/**, mvnw, mvnw.cmd]
┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java matched [.mvn/**, mvnw, mvnw.cmd] -> included
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar matched [.mvn/**, mvnw, mvnw.cmd] -> included
┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties matched [.mvn/**, mvnw, mvnw.cmd] -> included
┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug Makefile didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug catalog-info.yaml didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug generate.json didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug git-push.sh didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug k8s/resources.yaml didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug mvnw matched [.mvn/**, mvnw, mvnw.cmd] -> included
┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd matched [.mvn/**, mvnw, mvnw.cmd] -> included
┃ ┃ ┃ ┃ ┃ Debug new_workload.sh didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug pet-silhouette-icons.png didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/Application.java didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKind.java didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindController.java didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindRepository.java didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindSummary.java didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/META-INF/additional-spring-configuration-metadata.json didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-postgres.yml didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/schema-h2.sql didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug src/main/resources/schema-postgres.sql didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┃ Debug templates/postgresql.yaml didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┗ Debug templates/postgresqlResourceClaim.yaml didn't match [.mvn/**, mvnw, mvnw.cmd] -> excluded
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.<combo>.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, chain...)
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.<combo>.transformations[0].sources[1].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.<combo>.transformations[0].sources[1].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [pom.xml]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Makefile didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog-info.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug generate.json didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug git-push.sh didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/resources.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug new_workload.sh didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pet-silhouette-icons.png didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [pom.xml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/Application.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKind.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindController.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindRepository.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindSummary.java didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/META-INF/additional-spring-configuration-metadata.json didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-postgres.yml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/schema-h2.sql didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/schema-postgres.sql didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug templates/postgresql.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug templates/postgresqlResourceClaim.yaml didn't match [pom.xml] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.<combo>.transformations[0].sources[1].<combo>.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┗ ┗  Info Will replace [PetKind->Bird, my-petservice->birds, pkgName->org.moussaud.micrope...(truncated)]
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.<combo>.transformations[0].sources[2] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, chain...)
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.<combo>.transformations[0].sources[2].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.<combo>.transformations[0].sources[2].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Makefile didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog-info.yaml matched [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug generate.json didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug git-push.sh matched [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/resources.yaml didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug new_workload.sh matched [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug pet-silhouette-icons.png didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/Application.java didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKind.java didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindController.java didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindRepository.java didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindSummary.java didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/META-INF/additional-spring-configuration-metadata.json didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-postgres.yml matched [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml matched [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/schema-h2.sql matched [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/schema-postgres.sql matched [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug templates/postgresql.yaml didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug templates/postgresqlResourceClaim.yaml didn't match [config/**, README.md, new_workload.sh, git-push.sh, Tiltfile, catalog-info.yaml, src/main/resources/schema-*.sql, src/main/resources/application.yml, src/main/resources/application-postgres.yml] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.<combo>.transformations[0].sources[2].<combo>.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┗ ┗  Info Will replace [PetKind->Bird, imageRegistry->akseutap3registry.az...(truncated), PET_KIND->Bird, my-petservice->birds, lowercasePetKind->birds]
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.<combo>.transformations[0].sources[3] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, chain...)
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.<combo>.transformations[0].sources[3].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText, OpenRewriteRecipe)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.<combo>.transformations[0].sources[3].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**/*.java]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Makefile didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog-info.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug generate.json didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug git-push.sh didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/resources.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug new_workload.sh didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pet-silhouette-icons.png didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/Application.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKind.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindController.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindRepository.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindSummary.java matched [**/*.java] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/META-INF/additional-spring-configuration-metadata.json didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-postgres.yml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/schema-h2.sql didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/schema-postgres.sql didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug templates/postgresql.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug templates/postgresqlResourceClaim.yaml didn't match [**/*.java] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.<combo>.transformations[0].sources[3].<combo>.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [PetKind->Bird, lowercasePetKind->birds]
┃ ┃ ┃ ┃ ┗ ╺ engine.transformations[0].validated.<combo>.transformations[0].sources[3].<combo>.transformations[2] (OpenRewriteRecipe)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.<combo>.transformations[0].sources[4] (Combo)
┃ ┃ ┃ ┃ ┃  Info Condition (#createResourceClaim && #dbType == 'postgresql') evaluated to true
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, chain...)
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.<combo>.transformations[0].sources[4].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Condition (#createResourceClaim && #dbType == 'postgresql') evaluated to true
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, YTT, RewritePath)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.<combo>.transformations[0].sources[4].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**/postgresqlResourceClaim.yaml]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Makefile didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog-info.yaml didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug generate.json didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug git-push.sh didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/resources.yaml didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug new_workload.sh didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pet-silhouette-icons.png didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/Application.java didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKind.java didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindController.java didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindRepository.java didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindSummary.java didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/META-INF/additional-spring-configuration-metadata.json didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-postgres.yml didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/schema-h2.sql didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/schema-postgres.sql didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug templates/postgresql.yaml didn't match [**/postgresqlResourceClaim.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug templates/postgresqlResourceClaim.yaml matched [**/postgresqlResourceClaim.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.<combo>.transformations[0].sources[4].<combo>.transformations[1] (YTT)
┃ ┃ ┃ ┃ ┃ ┃ Debug Wrote values file with json content:   {"imageRegistry":"akseutap3registry.azurecr.io","artifactVersion":"0.0.1-beta","createResourceClaim":true,"pkgName":"org.moussaud.micropets.pets","dbType":"postgresql","petKind":"Bird","artifactId":"oiseau-service","projectName":"oiseau-service"}
┃ ┃ ┃ ┃ ┃ ┗  Info Shelling out to YTT with args: [ytt, -f, /tmp/ytt-input2979080000799516950, --data-values-file, /tmp/accelerator-options14388116539752582.json, --output-files, /tmp/ytt-output16929421667648366425]
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.<combo>.transformations[0].sources[4].<combo>.transformations[2] (RewritePath)
┃ ┃ ┃ ┃ ┗ ┗ Debug Path 'templates/postgresqlResourceClaim.yaml' matched 'templates/postgresqlResourceClaim.yaml' with groups {g0=templates/postgresqlResourceClaim.yaml} and was rewritten to 'config/app-operator/postgresqlResourceClaim.yaml'
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.<combo>.transformations[0].sources[5] (Combo)
┃ ┃ ┃ ┃ ┃  Info Condition (#createResourceClaim && #dbType == 'postgresql') evaluated to true
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain(Include, chain...)
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.<combo>.transformations[0].sources[5].<combo> (Chain)
┃ ┃ ┃ ┃ ┃  Info Condition (#createResourceClaim && #dbType == 'postgresql') evaluated to true
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, YTT, RewritePath)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.<combo>.transformations[0].sources[5].<combo>.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**/postgresql.yaml]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Makefile didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog-info.yaml didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug generate.json didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug git-push.sh didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug k8s/resources.yaml didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug new_workload.sh didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pet-silhouette-icons.png didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/Application.java didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKind.java didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindController.java didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindRepository.java didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/renamethis/PetKindSummary.java didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/META-INF/additional-spring-configuration-metadata.json didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-postgres.yml didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yml didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/schema-h2.sql didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/schema-postgres.sql didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug templates/postgresql.yaml matched [**/postgresql.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┗ Debug templates/postgresqlResourceClaim.yaml didn't match [**/postgresql.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.<combo>.transformations[0].sources[5].<combo>.transformations[1] (YTT)
┃ ┃ ┃ ┃ ┃ ┃ Debug Wrote values file with json content:   {"imageRegistry":"akseutap3registry.azurecr.io","artifactVersion":"0.0.1-beta","createResourceClaim":true,"pkgName":"org.moussaud.micropets.pets","dbType":"postgresql","petKind":"Bird","artifactId":"oiseau-service","projectName":"oiseau-service"}
┃ ┃ ┃ ┃ ┃ ┗  Info Shelling out to YTT with args: [ytt, -f, /tmp/ytt-input14417890984268143345, --data-values-file, /tmp/accelerator-options5252566782815572139.json, --output-files, /tmp/ytt-output5713776639358275032]
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.<combo>.transformations[0].sources[5].<combo>.transformations[2] (RewritePath)
┃ ┃ ┃ ┗ ┗ ┗ Debug Path 'templates/postgresql.yaml' matched 'templates/postgresql.yaml' with groups {g0=templates/postgresql.yaml} and was rewritten to 'config/app-operator/postgresql.yaml'
┃ ┃ ┃ ╺ engine.transformations[0].validated.<combo>.transformations[1] (UniquePath)
┃ ┃ ┃ ┏ engine.transformations[0].validated.<combo>.transformations[2] (RewritePath)
┃ ┃ ┃ ┃ Debug Path 'src/main/java/org/moussaud/micropets/pets/PetKindController.java' matched '(.*)PetKind(.*)' with groups {g0=src/main/java/org/moussaud/micropets/pets/PetKindController.java, g1=src/main/java/org/moussaud/micropets/pets/, g2=Controller.java} and was rewritten to 'src/main/java/org/moussaud/micropets/pets/BirdController.java'
┃ ┃ ┃ ┃ Debug Path 'src/main/java/org/moussaud/micropets/pets/PetKindRepository.java' matched '(.*)PetKind(.*)' with groups {g0=src/main/java/org/moussaud/micropets/pets/PetKindRepository.java, g1=src/main/java/org/moussaud/micropets/pets/, g2=Repository.java} and was rewritten to 'src/main/java/org/moussaud/micropets/pets/BirdRepository.java'
┃ ┃ ┃ ┃ Debug Path 'src/main/java/org/moussaud/micropets/pets/PetKind.java' matched '(.*)PetKind(.*)' with groups {g0=src/main/java/org/moussaud/micropets/pets/PetKind.java, g1=src/main/java/org/moussaud/micropets/pets/, g2=.java} and was rewritten to 'src/main/java/org/moussaud/micropets/pets/Bird.java'
┃ ┗ ┗ ┗ Debug Path 'src/main/java/org/moussaud/micropets/pets/PetKindSummary.java' matched '(.*)PetKind(.*)' with groups {g0=src/main/java/org/moussaud/micropets/pets/PetKindSummary.java, g1=src/main/java/org/moussaud/micropets/pets/, g2=Summary.java} and was rewritten to 'src/main/java/org/moussaud/micropets/pets/BirdSummary.java'
┗ ╺ engine.transformations[1] (UniquePath)
```
