# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: obb/service.proto
# Protobuf Python Version: 4.25.1
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from obb_schema.obb import markets_pb2 as obb_dot_markets__pb2
from obb_schema.obb import session_pb2 as obb_dot_session__pb2
from obb_schema.obb import popular_pb2 as obb_dot_popular__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x11obb/service.proto\x12\x03obb\x1a\x11obb/markets.proto\x1a\x11obb/session.proto\x1a\x11obb/popular.proto2\xcb\x01\n\x03obb\x12\x32\n\x07Markets\x12\x12.obb.MarketRequest\x1a\x13.obb.MarketResponse\x12\x38\n\x07Session\x12\x13.obb.SessionRequest\x1a\x14.obb.SessionResponse(\x01\x30\x01\x12V\n\x13PopularCombinations\x12\x1e.obb.PopularCombinationRequest\x1a\x1f.obb.PopularCombinationResponseB\x1d\n\rcom.oddin.obbZ\x0coddin.gg/obbb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'obb.service_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\rcom.oddin.obbZ\014oddin.gg/obb'
  _globals['_OBB']._serialized_start=84
  _globals['_OBB']._serialized_end=287
# @@protoc_insertion_point(module_scope)
