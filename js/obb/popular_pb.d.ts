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
  clearCombinationsList(): void;
  getCombinationsList(): Array<PopularCombination>;
  setCombinationsList(value: Array<PopularCombination>): void;
  addCombinations(value?: PopularCombination, index?: number): PopularCombination;

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
    combinationsList: Array<PopularCombination.AsObject>,
  }
}

export class PopularCombination extends jspb.Message {
  clearSelectionIdsList(): void;
  getSelectionIdsList(): Array<string>;
  setSelectionIdsList(value: Array<string>): void;
  addSelectionIds(value: string, index?: number): string;

  getOdds(): number;
  setOdds(value: number): void;

  getRawProbability(): number;
  setRawProbability(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PopularCombination.AsObject;
  static toObject(includeInstance: boolean, msg: PopularCombination): PopularCombination.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PopularCombination, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PopularCombination;
  static deserializeBinaryFromReader(message: PopularCombination, reader: jspb.BinaryReader): PopularCombination;
}

export namespace PopularCombination {
  export type AsObject = {
    selectionIdsList: Array<string>,
    odds: number,
    rawProbability: number,
  }
}

