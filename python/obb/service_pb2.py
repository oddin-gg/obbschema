# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: obb/service.proto
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
    'obb/service.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from obb_schema.obb import markets_pb2 as obb_dot_markets__pb2
from obb_schema.obb import session_pb2 as obb_dot_session__pb2
from obb_schema.obb import popular_pb2 as obb_dot_popular__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x11obb/service.proto\x12\x03obb\x1a\x11obb/markets.proto\x1a\x11obb/session.proto\x1a\x11obb/popular.proto2\xb7\x02\n\x03obb\x12O\n\x10\x41vailableMarkets\x12\x1c.obb.AvailableMarketsRequest\x1a\x1d.obb.AvailableMarketsResponse\x12\x46\n\rSessionCreate\x12\x19.obb.SessionCreateRequest\x1a\x1a.obb.SessionCreateResponse\x12@\n\x0bSessionInfo\x12\x17.obb.SessionInfoRequest\x1a\x18.obb.SessionInfoResponse\x12U\n\x12PopularCombination\x12\x1e.obb.PopularCombinationRequest\x1a\x1f.obb.PopularCombinationResponseB\x1d\n\rcom.oddin.obbZ\x0coddin.gg/obbb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'obb.service_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\rcom.oddin.obbZ\014oddin.gg/obb'
  _globals['_OBB']._serialized_start=84
  _globals['_OBB']._serialized_end=395
# @@protoc_insertion_point(module_scope)
