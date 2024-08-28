// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var obb_markets_pb = require('../obb/markets_pb.js');
var obb_session_pb = require('../obb/session_pb.js');
var obb_popular_pb = require('../obb/popular_pb.js');

function serialize_obb_AvailableMarketsRequest(arg) {
  if (!(arg instanceof obb_markets_pb.AvailableMarketsRequest)) {
    throw new Error('Expected argument of type obb.AvailableMarketsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_obb_AvailableMarketsRequest(buffer_arg) {
  return obb_markets_pb.AvailableMarketsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_obb_AvailableMarketsResponse(arg) {
  if (!(arg instanceof obb_markets_pb.AvailableMarketsResponse)) {
    throw new Error('Expected argument of type obb.AvailableMarketsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_obb_AvailableMarketsResponse(buffer_arg) {
  return obb_markets_pb.AvailableMarketsResponse.deserializeBinary(new Uint8Array(buffer_arg));
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

function serialize_obb_SessionCreateRequest(arg) {
  if (!(arg instanceof obb_session_pb.SessionCreateRequest)) {
    throw new Error('Expected argument of type obb.SessionCreateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_obb_SessionCreateRequest(buffer_arg) {
  return obb_session_pb.SessionCreateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_obb_SessionCreateResponse(arg) {
  if (!(arg instanceof obb_session_pb.SessionCreateResponse)) {
    throw new Error('Expected argument of type obb.SessionCreateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_obb_SessionCreateResponse(buffer_arg) {
  return obb_session_pb.SessionCreateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_obb_SessionInfoRequest(arg) {
  if (!(arg instanceof obb_session_pb.SessionInfoRequest)) {
    throw new Error('Expected argument of type obb.SessionInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_obb_SessionInfoRequest(buffer_arg) {
  return obb_session_pb.SessionInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_obb_SessionInfoResponse(arg) {
  if (!(arg instanceof obb_session_pb.SessionInfoResponse)) {
    throw new Error('Expected argument of type obb.SessionInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_obb_SessionInfoResponse(buffer_arg) {
  return obb_session_pb.SessionInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var obbService = exports.obbService = {
  // Used to retrieve a list of available markets for a given event.
availableMarkets: {
    path: '/obb.obb/AvailableMarkets',
    requestStream: false,
    responseStream: false,
    requestType: obb_markets_pb.AvailableMarketsRequest,
    responseType: obb_markets_pb.AvailableMarketsResponse,
    requestSerialize: serialize_obb_AvailableMarketsRequest,
    requestDeserialize: deserialize_obb_AvailableMarketsRequest,
    responseSerialize: serialize_obb_AvailableMarketsResponse,
    responseDeserialize: deserialize_obb_AvailableMarketsResponse,
  },
  // Used for session creation.
sessionCreate: {
    path: '/obb.obb/SessionCreate',
    requestStream: false,
    responseStream: false,
    requestType: obb_session_pb.SessionCreateRequest,
    responseType: obb_session_pb.SessionCreateResponse,
    requestSerialize: serialize_obb_SessionCreateRequest,
    requestDeserialize: deserialize_obb_SessionCreateRequest,
    responseSerialize: serialize_obb_SessionCreateResponse,
    responseDeserialize: deserialize_obb_SessionCreateResponse,
  },
  // Used for extraction info about desired session based on session id.
sessionInfo: {
    path: '/obb.obb/SessionInfo',
    requestStream: false,
    responseStream: false,
    requestType: obb_session_pb.SessionInfoRequest,
    responseType: obb_session_pb.SessionInfoResponse,
    requestSerialize: serialize_obb_SessionInfoRequest,
    requestDeserialize: deserialize_obb_SessionInfoRequest,
    responseSerialize: serialize_obb_SessionInfoResponse,
    responseDeserialize: deserialize_obb_SessionInfoResponse,
  },
  // Used to get popular combinations of selections.
popularCombination: {
    path: '/obb.obb/PopularCombination',
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
