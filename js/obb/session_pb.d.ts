// package: obb
// file: obb/session.proto

import * as jspb from "google-protobuf";

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

export class SessionCreateRequest extends jspb.Message {
  clearSelectionIdsList(): void;
  getSelectionIdsList(): Array<string>;
  setSelectionIdsList(value: Array<string>): void;
  addSelectionIds(value: string, index?: number): string;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SessionCreateRequest.AsObject;
  static toObject(includeInstance: boolean, msg: SessionCreateRequest): SessionCreateRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SessionCreateRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SessionCreateRequest;
  static deserializeBinaryFromReader(message: SessionCreateRequest, reader: jspb.BinaryReader): SessionCreateRequest;
}

export namespace SessionCreateRequest {
  export type AsObject = {
    selectionIdsList: Array<string>,
  }
}

export class SessionCreateResponse extends jspb.Message {
  getSessionId(): string;
  setSessionId(value: string): void;

  hasCreated(): boolean;
  clearCreated(): void;
  getCreated(): SessionCreateResponse.SessionCreated | undefined;
  setCreated(value?: SessionCreateResponse.SessionCreated): void;

  hasRejected(): boolean;
  clearRejected(): void;
  getRejected(): SessionCreateResponse.SessionRejected | undefined;
  setRejected(value?: SessionCreateResponse.SessionRejected): void;

  getStatusCase(): SessionCreateResponse.StatusCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SessionCreateResponse.AsObject;
  static toObject(includeInstance: boolean, msg: SessionCreateResponse): SessionCreateResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SessionCreateResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SessionCreateResponse;
  static deserializeBinaryFromReader(message: SessionCreateResponse, reader: jspb.BinaryReader): SessionCreateResponse;
}

export namespace SessionCreateResponse {
  export type AsObject = {
    sessionId: string,
    created?: SessionCreateResponse.SessionCreated.AsObject,
    rejected?: SessionCreateResponse.SessionRejected.AsObject,
  }

  export class SessionCreated extends jspb.Message {
    clearSelectionsList(): void;
    getSelectionsList(): Array<SessionSelection>;
    setSelectionsList(value: Array<SessionSelection>): void;
    addSelections(value?: SessionSelection, index?: number): SessionSelection;

    getOdds(): number;
    setOdds(value: number): void;

    clearAvailableMarketsList(): void;
    getAvailableMarketsList(): Array<SessionMarket>;
    setAvailableMarketsList(value: Array<SessionMarket>): void;
    addAvailableMarkets(value?: SessionMarket, index?: number): SessionMarket;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): SessionCreated.AsObject;
    static toObject(includeInstance: boolean, msg: SessionCreated): SessionCreated.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: SessionCreated, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): SessionCreated;
    static deserializeBinaryFromReader(message: SessionCreated, reader: jspb.BinaryReader): SessionCreated;
  }

  export namespace SessionCreated {
    export type AsObject = {
      selectionsList: Array<SessionSelection.AsObject>,
      odds: number,
      availableMarketsList: Array<SessionMarket.AsObject>,
    }
  }

  export class SessionRejected extends jspb.Message {
    hasReason(): boolean;
    clearReason(): void;
    getReason(): SessionRejectReason | undefined;
    setReason(value?: SessionRejectReason): void;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): SessionRejected.AsObject;
    static toObject(includeInstance: boolean, msg: SessionRejected): SessionRejected.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: SessionRejected, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): SessionRejected;
    static deserializeBinaryFromReader(message: SessionRejected, reader: jspb.BinaryReader): SessionRejected;
  }

  export namespace SessionRejected {
    export type AsObject = {
      reason?: SessionRejectReason.AsObject,
    }
  }

  export enum StatusCase {
    STATUS_NOT_SET = 0,
    CREATED = 2,
    REJECTED = 3,
  }
}

export class SessionSelection extends jspb.Message {
  getSelectionId(): string;
  setSelectionId(value: string): void;

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
  getOutcomeId(): string;
  setOutcomeId(value: string): void;

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
    outcomeId: string,
    odds: number,
  }
}

export class SessionInfoRequest extends jspb.Message {
  getSessionId(): string;
  setSessionId(value: string): void;

  clearSelectionsList(): void;
  getSelectionsList(): Array<SessionSelection>;
  setSelectionsList(value: Array<SessionSelection>): void;
  addSelections(value?: SessionSelection, index?: number): SessionSelection;

  getOdds(): number;
  setOdds(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SessionInfoRequest.AsObject;
  static toObject(includeInstance: boolean, msg: SessionInfoRequest): SessionInfoRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SessionInfoRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SessionInfoRequest;
  static deserializeBinaryFromReader(message: SessionInfoRequest, reader: jspb.BinaryReader): SessionInfoRequest;
}

export namespace SessionInfoRequest {
  export type AsObject = {
    sessionId: string,
    selectionsList: Array<SessionSelection.AsObject>,
    odds: number,
  }
}

export class SessionInfoResponse extends jspb.Message {
  getSessionId(): string;
  setSessionId(value: string): void;

  hasValid(): boolean;
  clearValid(): void;
  getValid(): SessionInfoResponse.ValidSession | undefined;
  setValid(value?: SessionInfoResponse.ValidSession): void;

  hasInvalid(): boolean;
  clearInvalid(): void;
  getInvalid(): SessionInfoResponse.InvalidSession | undefined;
  setInvalid(value?: SessionInfoResponse.InvalidSession): void;

  getStatusCase(): SessionInfoResponse.StatusCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SessionInfoResponse.AsObject;
  static toObject(includeInstance: boolean, msg: SessionInfoResponse): SessionInfoResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SessionInfoResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SessionInfoResponse;
  static deserializeBinaryFromReader(message: SessionInfoResponse, reader: jspb.BinaryReader): SessionInfoResponse;
}

export namespace SessionInfoResponse {
  export type AsObject = {
    sessionId: string,
    valid?: SessionInfoResponse.ValidSession.AsObject,
    invalid?: SessionInfoResponse.InvalidSession.AsObject,
  }

  export class ValidSession extends jspb.Message {
    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): ValidSession.AsObject;
    static toObject(includeInstance: boolean, msg: ValidSession): ValidSession.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: ValidSession, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): ValidSession;
    static deserializeBinaryFromReader(message: ValidSession, reader: jspb.BinaryReader): ValidSession;
  }

  export namespace ValidSession {
    export type AsObject = {
    }
  }

  export class InvalidSession extends jspb.Message {
    hasReason(): boolean;
    clearReason(): void;
    getReason(): InvalidSessionReason | undefined;
    setReason(value?: InvalidSessionReason): void;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): InvalidSession.AsObject;
    static toObject(includeInstance: boolean, msg: InvalidSession): InvalidSession.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: InvalidSession, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): InvalidSession;
    static deserializeBinaryFromReader(message: InvalidSession, reader: jspb.BinaryReader): InvalidSession;
  }

  export namespace InvalidSession {
    export type AsObject = {
      reason?: InvalidSessionReason.AsObject,
    }
  }

  export enum StatusCase {
    STATUS_NOT_SET = 0,
    VALID = 2,
    INVALID = 3,
  }
}

export interface SessionStatusMap {
  SESSION_STATUS_UNSPECIFIED: 0;
  SESSION_STATUS_VALID: 1;
  SESSION_STATUS_INVALID: 2;
}

export const SessionStatus: SessionStatusMap;

