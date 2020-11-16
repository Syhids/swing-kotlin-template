#!/bin/bash
distDir=./build/dist
./gradlew shadowJar
mkdir -p $distDir
rm -r $distDir/*
cp start.{sh,bat} $distDir
mv build/libs/shadow-1.0-SNAPSHOT-all.jar $distDir/program.jar
chmod +x $distDir/start.sh
cd $distDir
zip -r dist.zip .
echo "Build done. Executable is at $distDir"