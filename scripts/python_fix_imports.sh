#!/usr/bin/env bash

SED_INPLACE="$1"

# protocol buffers wond do the update https://github.com/protocolbuffers/protobuf/issues/9667
for file in ./proto/*
do
  dir="$(basename "${file}")"
  find ./python -type f -name "*.py" -exec $SED_INPLACE "s/from ${dir}/from obb_schema.${dir}/" {} +
done
