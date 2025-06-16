#!/usr/bin/env bash

# protocol buffers wond do the update https://github.com/protocolbuffers/protobuf/issues/9667
for file in ./proto/*
do
  dir="$(basename ${file})"
  sed -i '' -E "s/from ${dir}/from obb_schema.${dir}/" ./python/**/*.py
done
