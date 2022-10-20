#!/bin/bash

gh repo create my-birds-svc --public
git init
git remote add origin git@github.com:bmoussaud/my-birds-svc.git
git branch -M main
git add -A  .
git commit -m "initial commit"
git push -u origin main
open https://github.com/bmoussaud/my-birds-svc