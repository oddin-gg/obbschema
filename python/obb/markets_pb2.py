# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: obb/markets.proto
# Protobuf Python Version: 5.27.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import runtime_version as _runtime_version
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
_runtime_version.ValidateProtobufRuntimeVersion(
    _runtime_version.Domain.PUBLIC,
    5,
    27,
    2,
    '',
    'obb/markets.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x11obb/markets.proto\x12\x03obb\",\n\x17\x41vailableMarketsRequest\x12\x11\n\tevent_urn\x18\x01 \x01(\t\"A\n\x18\x41vailableMarketsResponse\x12%\n\x07markets\x18\x01 \x03(\x0b\x32\x14.obb.AvailableMarket\"8\n\x0f\x41vailableMarket\x12\x11\n\tmarket_id\x18\x01 \x01(\r\x12\x12\n\nspecifiers\x18\x02 \x01(\tB\x1d\n\rcom.oddin.obbZ\x0coddin.gg/obbb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'obb.markets_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\rcom.oddin.obbZ\014oddin.gg/obb'
  _globals['_AVAILABLEMARKETSREQUEST']._serialized_start=26
  _globals['_AVAILABLEMARKETSREQUEST']._serialized_end=70
  _globals['_AVAILABLEMARKETSRESPONSE']._serialized_start=72
  _globals['_AVAILABLEMARKETSRESPONSE']._serialized_end=137
  _globals['_AVAILABLEMARKET']._serialized_start=139
  _globals['_AVAILABLEMARKET']._serialized_end=195
# @@protoc_insertion_point(module_scope)
