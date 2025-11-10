// package: obb
// file: obb/settings.proto

import * as jspb from "google-protobuf";

export class ClientSettings extends jspb.Message {
  getObbenabled(): boolean;
  setObbenabled(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ClientSettings.AsObject;
  static toObject(includeInstance: boolean, msg: ClientSettings): ClientSettings.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ClientSettings, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ClientSettings;
  static deserializeBinaryFromReader(message: ClientSettings, reader: jspb.BinaryReader): ClientSettings;
}

export namespace ClientSettings {
  export type AsObject = {
    obbenabled: boolean,
  }
}

export class GetClientSettingsRequest extends jspb.Message {
  getClientId(): number;
  setClientId(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetClientSettingsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetClientSettingsRequest): GetClientSettingsRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetClientSettingsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetClientSettingsRequest;
  static deserializeBinaryFromReader(message: GetClientSettingsRequest, reader: jspb.BinaryReader): GetClientSettingsRequest;
}

export namespace GetClientSettingsRequest {
  export type AsObject = {
    clientId: number,
  }
}

export class GetClientSettingsResponse extends jspb.Message {
  getClientId(): number;
  setClientId(value: number): void;

  hasSettings(): boolean;
  clearSettings(): void;
  getSettings(): ClientSettings | undefined;
  setSettings(value?: ClientSettings): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetClientSettingsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: GetClientSettingsResponse): GetClientSettingsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GetClientSettingsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetClientSettingsResponse;
  static deserializeBinaryFromReader(message: GetClientSettingsResponse, reader: jspb.BinaryReader): GetClientSettingsResponse;
}

export namespace GetClientSettingsResponse {
  export type AsObject = {
    clientId: number,
    settings?: ClientSettings.AsObject,
  }
}

export class SetClientSettingsRequest extends jspb.Message {
  getClientId(): number;
  setClientId(value: number): void;

  hasSettings(): boolean;
  clearSettings(): void;
  getSettings(): ClientSettings | undefined;
  setSettings(value?: ClientSettings): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SetClientSettingsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: SetClientSettingsRequest): SetClientSettingsRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SetClientSettingsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SetClientSettingsRequest;
  static deserializeBinaryFromReader(message: SetClientSettingsRequest, reader: jspb.BinaryReader): SetClientSettingsRequest;
}

export namespace SetClientSettingsRequest {
  export type AsObject = {
    clientId: number,
    settings?: ClientSettings.AsObject,
  }
}

export class SetClientSettingsResponse extends jspb.Message {
  getClientId(): number;
  setClientId(value: number): void;

  hasSettings(): boolean;
  clearSettings(): void;
  getSettings(): ClientSettings | undefined;
  setSettings(value?: ClientSettings): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SetClientSettingsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: SetClientSettingsResponse): SetClientSettingsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SetClientSettingsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SetClientSettingsResponse;
  static deserializeBinaryFromReader(message: SetClientSettingsResponse, reader: jspb.BinaryReader): SetClientSettingsResponse;
}

export namespace SetClientSettingsResponse {
  export type AsObject = {
    clientId: number,
    settings?: ClientSettings.AsObject,
  }
}

export class ListClientSettingsRequest extends jspb.Message {
  getFilterObbEnabledOnly(): boolean;
  setFilterObbEnabledOnly(value: boolean): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListClientSettingsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ListClientSettingsRequest): ListClientSettingsRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListClientSettingsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListClientSettingsRequest;
  static deserializeBinaryFromReader(message: ListClientSettingsRequest, reader: jspb.BinaryReader): ListClientSettingsRequest;
}

export namespace ListClientSettingsRequest {
  export type AsObject = {
    filterObbEnabledOnly: boolean,
  }
}

export class ListClientSettingsResponse extends jspb.Message {
  clearClientSettingsList(): void;
  getClientSettingsList(): Array<ListClientSettingsResponse.ClientSettingsPair>;
  setClientSettingsList(value: Array<ListClientSettingsResponse.ClientSettingsPair>): void;
  addClientSettings(value?: ListClientSettingsResponse.ClientSettingsPair, index?: number): ListClientSettingsResponse.ClientSettingsPair;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ListClientSettingsResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ListClientSettingsResponse): ListClientSettingsResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ListClientSettingsResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ListClientSettingsResponse;
  static deserializeBinaryFromReader(message: ListClientSettingsResponse, reader: jspb.BinaryReader): ListClientSettingsResponse;
}

export namespace ListClientSettingsResponse {
  export type AsObject = {
    clientSettingsList: Array<ListClientSettingsResponse.ClientSettingsPair.AsObject>,
  }

  export class ClientSettingsPair extends jspb.Message {
    getClientId(): number;
    setClientId(value: number): void;

    hasSettings(): boolean;
    clearSettings(): void;
    getSettings(): ClientSettings | undefined;
    setSettings(value?: ClientSettings): void;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): ClientSettingsPair.AsObject;
    static toObject(includeInstance: boolean, msg: ClientSettingsPair): ClientSettingsPair.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: ClientSettingsPair, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): ClientSettingsPair;
    static deserializeBinaryFromReader(message: ClientSettingsPair, reader: jspb.BinaryReader): ClientSettingsPair;
  }

  export namespace ClientSettingsPair {
    export type AsObject = {
      clientId: number,
      settings?: ClientSettings.AsObject,
    }
  }
}

