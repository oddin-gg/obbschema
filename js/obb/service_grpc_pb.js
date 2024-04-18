// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var obb_markets_pb = require('../obb/markets_pb.js');
var obb_session_pb = require('../obb/session_pb.js');
var obb_popular_pb = require('../obb/popular_pb.js');

function serialize_obb_MarketRequest(arg) {
  if (!(arg instanceof obb_markets_pb.MarketRequest)) {
    throw new Error('Expected argument of type obb.MarketRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_obb_MarketRequest(buffer_arg) {
  return obb_markets_pb.MarketRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_obb_MarketResponse(arg) {
  if (!(arg instanceof obb_markets_pb.MarketResponse)) {
    throw new Error('Expected argument of type obb.MarketResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_obb_MarketResponse(buffer_arg) {
  return obb_markets_pb.MarketResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_obb_PopularCombinationRequest(arg) {
  if (!(arg instanceof obb_popular_pb.PopularCombinationRequest)) {
    throw new Error('Expected argument of type obb.PopularCombinationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_obb_PopularCombinationRequest(buffer_arg) {
  return obb_popular_pb.PopularCombinationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_obb_PopularCombinationResponse(arg) {
  if (!(arg instanceof obb_popular_pb.PopularCombinationResponse)) {
    throw new Error('Expected argument of type obb.PopularCombinationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_obb_PopularCombinationResponse(buffer_arg) {
  return obb_popular_pb.PopularCombinationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_obb_SessionRequest(arg) {
  if (!(arg instanceof obb_session_pb.SessionRequest)) {
    throw new Error('Expected argument of type obb.SessionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_obb_SessionRequest(buffer_arg) {
  return obb_session_pb.SessionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_obb_SessionResponse(arg) {
  if (!(arg instanceof obb_session_pb.SessionResponse)) {
    throw new Error('Expected argument of type obb.SessionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_obb_SessionResponse(buffer_arg) {
  return obb_session_pb.SessionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var obbService = exports.obbService = {
  markets: {
    path: '/obb.obb/Markets',
    requestStream: false,
    responseStream: false,
    requestType: obb_markets_pb.MarketRequest,
    responseType: obb_markets_pb.MarketResponse,
    requestSerialize: serialize_obb_MarketRequest,
    requestDeserialize: deserialize_obb_MarketRequest,
    responseSerialize: serialize_obb_MarketResponse,
    responseDeserialize: deserialize_obb_MarketResponse,
  },
  session: {
    path: '/obb.obb/Session',
    requestStream: true,
    responseStream: true,
    requestType: obb_session_pb.SessionRequest,
    responseType: obb_session_pb.SessionResponse,
    requestSerialize: serialize_obb_SessionRequest,
    requestDeserialize: deserialize_obb_SessionRequest,
    responseSerialize: serialize_obb_SessionResponse,
    responseDeserialize: deserialize_obb_SessionResponse,
  },
  popularCombinations: {
    path: '/obb.obb/PopularCombinations',
    requestStream: false,
    responseStream: false,
    requestType: obb_popular_pb.PopularCombinationRequest,
    responseType: obb_popular_pb.PopularCombinationResponse,
    requestSerialize: serialize_obb_PopularCombinationRequest,
    requestDeserialize: deserialize_obb_PopularCombinationRequest,
    responseSerialize: serialize_obb_PopularCombinationResponse,
    responseDeserialize: deserialize_obb_PopularCombinationResponse,
  },
};

exports.obbClient = grpc.makeGenericClientConstructor(obbService);
