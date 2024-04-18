// package: obb
// file: obb/commons.proto

import * as jspb from "google-protobuf";
import * as google_protobuf_timestamp_pb from "google-protobuf/google/protobuf/timestamp_pb";

export class StreamKeepalive extends jspb.Message {
  hasTimestamp(): boolean;
  clearTimestamp(): void;
  getTimestamp(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setTimestamp(value?: google_protobuf_timestamp_pb.Timestamp): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): StreamKeepalive.AsObject;
  static toObject(includeInstance: boolean, msg: StreamKeepalive): StreamKeepalive.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: StreamKeepalive, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): StreamKeepalive;
  static deserializeBinaryFromReader(message: StreamKeepalive, reader: jspb.BinaryReader): StreamKeepalive;
}

export namespace StreamKeepalive {
  export type AsObject = {
    timestamp?: google_protobuf_timestamp_pb.Timestamp.AsObject,
  }
}

