// package: obb
// file: obb/markets.proto

import * as jspb from "google-protobuf";

export class AvailableMarketsRequest extends jspb.Message {
  getEventUrn(): string;
  setEventUrn(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AvailableMarketsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: AvailableMarketsRequest): AvailableMarketsRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: AvailableMarketsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AvailableMarketsRequest;
  static deserializeBinaryFromReader(message: AvailableMarketsRequest, reader: jspb.BinaryReader): AvailableMarketsRequest;
}

export namespace AvailableMarketsRequest {
  export type AsObject = {
    eventUrn: string,
  }
}

export class AvailableMarketsResponse extends jspb.Message {
  clearMarketsList(): void;
  getMarketsList(): Array<AvailableMarket>;
  setMarketsList(value: Array<AvailableMarket>): void;
  addMarkets(value?: AvailableMarket, index?: number): AvailableMarket;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AvailableMarketsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: AvailableMarketsResponse): AvailableMarketsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: AvailableMarketsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AvailableMarketsResponse;
  static deserializeBinaryFromReader(message: AvailableMarketsResponse, reader: jspb.BinaryReader): AvailableMarketsResponse;
}

export namespace AvailableMarketsResponse {
  export type AsObject = {
    marketsList: Array<AvailableMarket.AsObject>,
  }
}

export class AvailableMarket extends jspb.Message {
  getMarketId(): number;
  setMarketId(value: number): void;

  getSpecifiers(): string;
  setSpecifiers(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AvailableMarket.AsObject;
  static toObject(includeInstance: boolean, msg: AvailableMarket): AvailableMarket.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: AvailableMarket, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AvailableMarket;
  static deserializeBinaryFromReader(message: AvailableMarket, reader: jspb.BinaryReader): AvailableMarket;
}

export namespace AvailableMarket {
  export type AsObject = {
    marketId: number,
    specifiers: string,
  }
}

