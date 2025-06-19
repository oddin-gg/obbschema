#!/usr/bin/env bash


# Protocol buffers won't do the update:
#   https://github.com/protocolbuffers/protobuf/issues/973
#   https://github.com/protocolbuffers/protobuf/issues/881
for dir in $(find ./python -type d)
do
  touch ${dir}/__init__.py
done
