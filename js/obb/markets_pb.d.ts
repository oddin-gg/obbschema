// package: obb
// file: obb/markets.proto

import * as jspb from "google-protobuf";

export class MarketRequest extends jspb.Message {
  getEventId(): string;
  setEventId(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MarketRequest.AsObject;
  static toObject(includeInstance: boolean, msg: MarketRequest): MarketRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MarketRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MarketRequest;
  static deserializeBinaryFromReader(message: MarketRequest, reader: jspb.BinaryReader): MarketRequest;
}

export namespace MarketRequest {
  export type AsObject = {
    eventId: string,
  }
}

export class MarketResponse extends jspb.Message {
  clearMarketsList(): void;
  getMarketsList(): Array<Market>;
  setMarketsList(value: Array<Market>): void;
  addMarkets(value?: Market, index?: number): Market;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MarketResponse.AsObject;
  static toObject(includeInstance: boolean, msg: MarketResponse): MarketResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MarketResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MarketResponse;
  static deserializeBinaryFromReader(message: MarketResponse, reader: jspb.BinaryReader): MarketResponse;
}

export namespace MarketResponse {
  export type AsObject = {
    marketsList: Array<Market.AsObject>,
  }
}

export class Market extends jspb.Message {
  getMarketId(): number;
  setMarketId(value: number): void;

  getSpecifiers(): string;
  setSpecifiers(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Market.AsObject;
  static toObject(includeInstance: boolean, msg: Market): Market.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Market, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Market;
  static deserializeBinaryFromReader(message: Market, reader: jspb.BinaryReader): Market;
}

export namespace Market {
  export type AsObject = {
    marketId: number,
    specifiers: string,
  }
}

