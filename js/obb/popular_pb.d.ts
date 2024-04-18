// package: obb
// file: obb/popular.proto

import * as jspb from "google-protobuf";

export class PopularCombinationRequest extends jspb.Message {
  getEventId(): string;
  setEventId(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PopularCombinationRequest.AsObject;
  static toObject(includeInstance: boolean, msg: PopularCombinationRequest): PopularCombinationRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PopularCombinationRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PopularCombinationRequest;
  static deserializeBinaryFromReader(message: PopularCombinationRequest, reader: jspb.BinaryReader): PopularCombinationRequest;
}

export namespace PopularCombinationRequest {
  export type AsObject = {
    eventId: string,
  }
}

export class PopularCombinationResponse extends jspb.Message {
  clearMarketsList(): void;
  getMarketsList(): Array<PopularCombinationMarket>;
  setMarketsList(value: Array<PopularCombinationMarket>): void;
  addMarkets(value?: PopularCombinationMarket, index?: number): PopularCombinationMarket;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PopularCombinationResponse.AsObject;
  static toObject(includeInstance: boolean, msg: PopularCombinationResponse): PopularCombinationResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PopularCombinationResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PopularCombinationResponse;
  static deserializeBinaryFromReader(message: PopularCombinationResponse, reader: jspb.BinaryReader): PopularCombinationResponse;
}

export namespace PopularCombinationResponse {
  export type AsObject = {
    marketsList: Array<PopularCombinationMarket.AsObject>,
  }
}

export class PopularCombinationMarket extends jspb.Message {
  getMarketId(): number;
  setMarketId(value: number): void;

  getSpecifiers(): string;
  setSpecifiers(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PopularCombinationMarket.AsObject;
  static toObject(includeInstance: boolean, msg: PopularCombinationMarket): PopularCombinationMarket.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PopularCombinationMarket, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PopularCombinationMarket;
  static deserializeBinaryFromReader(message: PopularCombinationMarket, reader: jspb.BinaryReader): PopularCombinationMarket;
}

export namespace PopularCombinationMarket {
  export type AsObject = {
    marketId: number,
    specifiers: string,
  }
}

