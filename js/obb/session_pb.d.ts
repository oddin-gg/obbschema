// package: obb
// file: obb/session.proto

import * as jspb from "google-protobuf";
import * as obb_commons_pb from "../obb/commons_pb";

export class SessionRejectReason extends jspb.Message {
  getCode(): SessionRejectReason.CodeMap[keyof SessionRejectReason.CodeMap];
  setCode(value: SessionRejectReason.CodeMap[keyof SessionRejectReason.CodeMap]): void;

  getMessage(): string;
  setMessage(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SessionRejectReason.AsObject;
  static toObject(includeInstance: boolean, msg: SessionRejectReason): SessionRejectReason.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SessionRejectReason, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SessionRejectReason;
  static deserializeBinaryFromReader(message: SessionRejectReason, reader: jspb.BinaryReader): SessionRejectReason;
}

export namespace SessionRejectReason {
  export type AsObject = {
    code: SessionRejectReason.CodeMap[keyof SessionRejectReason.CodeMap],
    message: string,
  }

  export interface CodeMap {
    CODE_UNSPECIFIED: 0;
    CODE_INTERNAL: 1;
    CODE_INVALID_ARGUMENT: 2;
    CODE_INVALID_MARKET_COMBINATION: 3;
  }

  export const Code: CodeMap;
}

export class InvalidSessionReason extends jspb.Message {
  getCode(): InvalidSessionReason.CodeMap[keyof InvalidSessionReason.CodeMap];
  setCode(value: InvalidSessionReason.CodeMap[keyof InvalidSessionReason.CodeMap]): void;

  getMessage(): string;
  setMessage(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): InvalidSessionReason.AsObject;
  static toObject(includeInstance: boolean, msg: InvalidSessionReason): InvalidSessionReason.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: InvalidSessionReason, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): InvalidSessionReason;
  static deserializeBinaryFromReader(message: InvalidSessionReason, reader: jspb.BinaryReader): InvalidSessionReason;
}

export namespace InvalidSessionReason {
  export type AsObject = {
    code: InvalidSessionReason.CodeMap[keyof InvalidSessionReason.CodeMap],
    message: string,
  }

  export interface CodeMap {
    CODE_UNSPECIFIED: 0;
    CODE_INTERNAL: 1;
    CODE_INVALID_ARGUMENT: 2;
    CODE_EXPIRED: 3;
    CODE_NOT_FOUND: 4;
  }

  export const Code: CodeMap;
}

export class SessionRequest extends jspb.Message {
  hasCreate(): boolean;
  clearCreate(): void;
  getCreate(): SessionCreate | undefined;
  setCreate(value?: SessionCreate): void;

  hasKeepalive(): boolean;
  clearKeepalive(): void;
  getKeepalive(): obb_commons_pb.StreamKeepalive | undefined;
  setKeepalive(value?: obb_commons_pb.StreamKeepalive): void;

  hasInfo(): boolean;
  clearInfo(): void;
  getInfo(): SessionInfo | undefined;
  setInfo(value?: SessionInfo): void;

  getDataCase(): SessionRequest.DataCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SessionRequest.AsObject;
  static toObject(includeInstance: boolean, msg: SessionRequest): SessionRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SessionRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SessionRequest;
  static deserializeBinaryFromReader(message: SessionRequest, reader: jspb.BinaryReader): SessionRequest;
}

export namespace SessionRequest {
  export type AsObject = {
    create?: SessionCreate.AsObject,
    keepalive?: obb_commons_pb.StreamKeepalive.AsObject,
    info?: SessionInfo.AsObject,
  }

  export enum DataCase {
    DATA_NOT_SET = 0,
    CREATE = 1,
    KEEPALIVE = 2,
    INFO = 3,
  }
}

export class SessionResponse extends jspb.Message {
  hasCreate(): boolean;
  clearCreate(): void;
  getCreate(): SessionCreateState | undefined;
  setCreate(value?: SessionCreateState): void;

  hasKeepalive(): boolean;
  clearKeepalive(): void;
  getKeepalive(): obb_commons_pb.StreamKeepalive | undefined;
  setKeepalive(value?: obb_commons_pb.StreamKeepalive): void;

  hasInfo(): boolean;
  clearInfo(): void;
  getInfo(): SessionInfoState | undefined;
  setInfo(value?: SessionInfoState): void;

  getDataCase(): SessionResponse.DataCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SessionResponse.AsObject;
  static toObject(includeInstance: boolean, msg: SessionResponse): SessionResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SessionResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SessionResponse;
  static deserializeBinaryFromReader(message: SessionResponse, reader: jspb.BinaryReader): SessionResponse;
}

export namespace SessionResponse {
  export type AsObject = {
    create?: SessionCreateState.AsObject,
    keepalive?: obb_commons_pb.StreamKeepalive.AsObject,
    info?: SessionInfoState.AsObject,
  }

  export enum DataCase {
    DATA_NOT_SET = 0,
    CREATE = 1,
    KEEPALIVE = 2,
    INFO = 3,
  }
}

export class SessionCreate extends jspb.Message {
  getRequestId(): string;
  setRequestId(value: string): void;

  clearSelectionIdsList(): void;
  getSelectionIdsList(): Array<string>;
  setSelectionIdsList(value: Array<string>): void;
  addSelectionIds(value: string, index?: number): string;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SessionCreate.AsObject;
  static toObject(includeInstance: boolean, msg: SessionCreate): SessionCreate.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SessionCreate, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SessionCreate;
  static deserializeBinaryFromReader(message: SessionCreate, reader: jspb.BinaryReader): SessionCreate;
}

export namespace SessionCreate {
  export type AsObject = {
    requestId: string,
    selectionIdsList: Array<string>,
  }
}

export class SessionCreateState extends jspb.Message {
  getRequestId(): string;
  setRequestId(value: string): void;

  getSessionId(): string;
  setSessionId(value: string): void;

  clearSelectionsList(): void;
  getSelectionsList(): Array<SessionSelection>;
  setSelectionsList(value: Array<SessionSelection>): void;
  addSelections(value?: SessionSelection, index?: number): SessionSelection;

  clearMarketsList(): void;
  getMarketsList(): Array<SessionMarket>;
  setMarketsList(value: Array<SessionMarket>): void;
  addMarkets(value?: SessionMarket, index?: number): SessionMarket;

  hasRejectReason(): boolean;
  clearRejectReason(): void;
  getRejectReason(): SessionRejectReason | undefined;
  setRejectReason(value?: SessionRejectReason): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SessionCreateState.AsObject;
  static toObject(includeInstance: boolean, msg: SessionCreateState): SessionCreateState.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SessionCreateState, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SessionCreateState;
  static deserializeBinaryFromReader(message: SessionCreateState, reader: jspb.BinaryReader): SessionCreateState;
}

export namespace SessionCreateState {
  export type AsObject = {
    requestId: string,
    sessionId: string,
    selectionsList: Array<SessionSelection.AsObject>,
    marketsList: Array<SessionMarket.AsObject>,
    rejectReason?: SessionRejectReason.AsObject,
  }
}

export class SessionSelection extends jspb.Message {
  getSelectionId(): string;
  setSelectionId(value: string): void;

  getOdds(): number;
  setOdds(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SessionSelection.AsObject;
  static toObject(includeInstance: boolean, msg: SessionSelection): SessionSelection.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SessionSelection, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SessionSelection;
  static deserializeBinaryFromReader(message: SessionSelection, reader: jspb.BinaryReader): SessionSelection;
}

export namespace SessionSelection {
  export type AsObject = {
    selectionId: string,
    odds: number,
  }
}

export class SessionMarket extends jspb.Message {
  getMarketId(): number;
  setMarketId(value: number): void;

  getSpecifiers(): string;
  setSpecifiers(value: string): void;

  clearOutcomesList(): void;
  getOutcomesList(): Array<SessionMarketOutcome>;
  setOutcomesList(value: Array<SessionMarketOutcome>): void;
  addOutcomes(value?: SessionMarketOutcome, index?: number): SessionMarketOutcome;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SessionMarket.AsObject;
  static toObject(includeInstance: boolean, msg: SessionMarket): SessionMarket.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SessionMarket, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SessionMarket;
  static deserializeBinaryFromReader(message: SessionMarket, reader: jspb.BinaryReader): SessionMarket;
}

export namespace SessionMarket {
  export type AsObject = {
    marketId: number,
    specifiers: string,
    outcomesList: Array<SessionMarketOutcome.AsObject>,
  }
}

export class SessionMarketOutcome extends jspb.Message {
  getOutcomeId(): number;
  setOutcomeId(value: number): void;

  getOdds(): number;
  setOdds(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SessionMarketOutcome.AsObject;
  static toObject(includeInstance: boolean, msg: SessionMarketOutcome): SessionMarketOutcome.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SessionMarketOutcome, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SessionMarketOutcome;
  static deserializeBinaryFromReader(message: SessionMarketOutcome, reader: jspb.BinaryReader): SessionMarketOutcome;
}

export namespace SessionMarketOutcome {
  export type AsObject = {
    outcomeId: number,
    odds: number,
  }
}

export class SessionInfo extends jspb.Message {
  getRequestId(): string;
  setRequestId(value: string): void;

  getSessionId(): string;
  setSessionId(value: string): void;

  clearSelectionsList(): void;
  getSelectionsList(): Array<SessionSelection>;
  setSelectionsList(value: Array<SessionSelection>): void;
  addSelections(value?: SessionSelection, index?: number): SessionSelection;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SessionInfo.AsObject;
  static toObject(includeInstance: boolean, msg: SessionInfo): SessionInfo.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SessionInfo, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SessionInfo;
  static deserializeBinaryFromReader(message: SessionInfo, reader: jspb.BinaryReader): SessionInfo;
}

export namespace SessionInfo {
  export type AsObject = {
    requestId: string,
    sessionId: string,
    selectionsList: Array<SessionSelection.AsObject>,
  }
}

export class SessionInfoState extends jspb.Message {
  getRequestId(): string;
  setRequestId(value: string): void;

  hasInvalidReason(): boolean;
  clearInvalidReason(): void;
  getInvalidReason(): InvalidSessionReason | undefined;
  setInvalidReason(value?: InvalidSessionReason): void;

  getStatus(): SessionStatusMap[keyof SessionStatusMap];
  setStatus(value: SessionStatusMap[keyof SessionStatusMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SessionInfoState.AsObject;
  static toObject(includeInstance: boolean, msg: SessionInfoState): SessionInfoState.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SessionInfoState, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SessionInfoState;
  static deserializeBinaryFromReader(message: SessionInfoState, reader: jspb.BinaryReader): SessionInfoState;
}

export namespace SessionInfoState {
  export type AsObject = {
    requestId: string,
    invalidReason?: InvalidSessionReason.AsObject,
    status: SessionStatusMap[keyof SessionStatusMap],
  }
}

export interface SessionStatusMap {
  SESSION_STATUS_UNSPECIFIED: 0;
  SESSION_STATUS_VALID: 1;
  SESSION_STATUS_INVALID: 2;
}

export const SessionStatus: SessionStatusMap;

