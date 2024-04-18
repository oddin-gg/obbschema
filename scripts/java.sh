#!/usr/bin/env bash

echo "GENERATING JAVA"

rm -rf ./java/src/main/java/*

protoc ./proto/obb/*.proto -I ./proto --plugin=protoc-gen-grpc-java=./protoc-gen-grpc-java --grpc-java_out=./java/src/main/java --java_out=./java/src/main/java

cd ./java &&
./gradlew clean jar &&
cd .. &&
cp ./java/build/libs/obb_schema.jar ./java

echo "JAVA DONE"
