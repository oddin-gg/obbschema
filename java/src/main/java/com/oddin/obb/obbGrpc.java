package com.oddin.obb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: obb/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class obbGrpc {

  private obbGrpc() {}

  public static final String SERVICE_NAME = "obb.obb";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.oddin.obb.Markets.AvailableMarketsRequest,
      com.oddin.obb.Markets.AvailableMarketsResponse> getAvailableMarketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AvailableMarkets",
      requestType = com.oddin.obb.Markets.AvailableMarketsRequest.class,
      responseType = com.oddin.obb.Markets.AvailableMarketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oddin.obb.Markets.AvailableMarketsRequest,
      com.oddin.obb.Markets.AvailableMarketsResponse> getAvailableMarketsMethod() {
    io.grpc.MethodDescriptor<com.oddin.obb.Markets.AvailableMarketsRequest, com.oddin.obb.Markets.AvailableMarketsResponse> getAvailableMarketsMethod;
    if ((getAvailableMarketsMethod = obbGrpc.getAvailableMarketsMethod) == null) {
      synchronized (obbGrpc.class) {
        if ((getAvailableMarketsMethod = obbGrpc.getAvailableMarketsMethod) == null) {
          obbGrpc.getAvailableMarketsMethod = getAvailableMarketsMethod =
              io.grpc.MethodDescriptor.<com.oddin.obb.Markets.AvailableMarketsRequest, com.oddin.obb.Markets.AvailableMarketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AvailableMarkets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oddin.obb.Markets.AvailableMarketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oddin.obb.Markets.AvailableMarketsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new obbMethodDescriptorSupplier("AvailableMarkets"))
              .build();
        }
      }
    }
    return getAvailableMarketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oddin.obb.Session.SessionCreateRequest,
      com.oddin.obb.Session.SessionCreateResponse> getSessionCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SessionCreate",
      requestType = com.oddin.obb.Session.SessionCreateRequest.class,
      responseType = com.oddin.obb.Session.SessionCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oddin.obb.Session.SessionCreateRequest,
      com.oddin.obb.Session.SessionCreateResponse> getSessionCreateMethod() {
    io.grpc.MethodDescriptor<com.oddin.obb.Session.SessionCreateRequest, com.oddin.obb.Session.SessionCreateResponse> getSessionCreateMethod;
    if ((getSessionCreateMethod = obbGrpc.getSessionCreateMethod) == null) {
      synchronized (obbGrpc.class) {
        if ((getSessionCreateMethod = obbGrpc.getSessionCreateMethod) == null) {
          obbGrpc.getSessionCreateMethod = getSessionCreateMethod =
              io.grpc.MethodDescriptor.<com.oddin.obb.Session.SessionCreateRequest, com.oddin.obb.Session.SessionCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SessionCreate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oddin.obb.Session.SessionCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oddin.obb.Session.SessionCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new obbMethodDescriptorSupplier("SessionCreate"))
              .build();
        }
      }
    }
    return getSessionCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oddin.obb.Session.SessionInfoRequest,
      com.oddin.obb.Session.SessionInfoResponse> getSessionInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SessionInfo",
      requestType = com.oddin.obb.Session.SessionInfoRequest.class,
      responseType = com.oddin.obb.Session.SessionInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oddin.obb.Session.SessionInfoRequest,
      com.oddin.obb.Session.SessionInfoResponse> getSessionInfoMethod() {
    io.grpc.MethodDescriptor<com.oddin.obb.Session.SessionInfoRequest, com.oddin.obb.Session.SessionInfoResponse> getSessionInfoMethod;
    if ((getSessionInfoMethod = obbGrpc.getSessionInfoMethod) == null) {
      synchronized (obbGrpc.class) {
        if ((getSessionInfoMethod = obbGrpc.getSessionInfoMethod) == null) {
          obbGrpc.getSessionInfoMethod = getSessionInfoMethod =
              io.grpc.MethodDescriptor.<com.oddin.obb.Session.SessionInfoRequest, com.oddin.obb.Session.SessionInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SessionInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oddin.obb.Session.SessionInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oddin.obb.Session.SessionInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new obbMethodDescriptorSupplier("SessionInfo"))
              .build();
        }
      }
    }
    return getSessionInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oddin.obb.Popular.PopularCombinationRequest,
      com.oddin.obb.Popular.PopularCombinationResponse> getPopularCombinationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PopularCombination",
      requestType = com.oddin.obb.Popular.PopularCombinationRequest.class,
      responseType = com.oddin.obb.Popular.PopularCombinationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oddin.obb.Popular.PopularCombinationRequest,
      com.oddin.obb.Popular.PopularCombinationResponse> getPopularCombinationMethod() {
    io.grpc.MethodDescriptor<com.oddin.obb.Popular.PopularCombinationRequest, com.oddin.obb.Popular.PopularCombinationResponse> getPopularCombinationMethod;
    if ((getPopularCombinationMethod = obbGrpc.getPopularCombinationMethod) == null) {
      synchronized (obbGrpc.class) {
        if ((getPopularCombinationMethod = obbGrpc.getPopularCombinationMethod) == null) {
          obbGrpc.getPopularCombinationMethod = getPopularCombinationMethod =
              io.grpc.MethodDescriptor.<com.oddin.obb.Popular.PopularCombinationRequest, com.oddin.obb.Popular.PopularCombinationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PopularCombination"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oddin.obb.Popular.PopularCombinationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oddin.obb.Popular.PopularCombinationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new obbMethodDescriptorSupplier("PopularCombination"))
              .build();
        }
      }
    }
    return getPopularCombinationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oddin.obb.Settings.GetClientSettingsRequest,
      com.oddin.obb.Settings.GetClientSettingsResponse> getGetClientSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClientSettings",
      requestType = com.oddin.obb.Settings.GetClientSettingsRequest.class,
      responseType = com.oddin.obb.Settings.GetClientSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oddin.obb.Settings.GetClientSettingsRequest,
      com.oddin.obb.Settings.GetClientSettingsResponse> getGetClientSettingsMethod() {
    io.grpc.MethodDescriptor<com.oddin.obb.Settings.GetClientSettingsRequest, com.oddin.obb.Settings.GetClientSettingsResponse> getGetClientSettingsMethod;
    if ((getGetClientSettingsMethod = obbGrpc.getGetClientSettingsMethod) == null) {
      synchronized (obbGrpc.class) {
        if ((getGetClientSettingsMethod = obbGrpc.getGetClientSettingsMethod) == null) {
          obbGrpc.getGetClientSettingsMethod = getGetClientSettingsMethod =
              io.grpc.MethodDescriptor.<com.oddin.obb.Settings.GetClientSettingsRequest, com.oddin.obb.Settings.GetClientSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClientSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oddin.obb.Settings.GetClientSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oddin.obb.Settings.GetClientSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new obbMethodDescriptorSupplier("GetClientSettings"))
              .build();
        }
      }
    }
    return getGetClientSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oddin.obb.Settings.SetClientSettingsRequest,
      com.oddin.obb.Settings.SetClientSettingsResponse> getSetClientSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetClientSettings",
      requestType = com.oddin.obb.Settings.SetClientSettingsRequest.class,
      responseType = com.oddin.obb.Settings.SetClientSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oddin.obb.Settings.SetClientSettingsRequest,
      com.oddin.obb.Settings.SetClientSettingsResponse> getSetClientSettingsMethod() {
    io.grpc.MethodDescriptor<com.oddin.obb.Settings.SetClientSettingsRequest, com.oddin.obb.Settings.SetClientSettingsResponse> getSetClientSettingsMethod;
    if ((getSetClientSettingsMethod = obbGrpc.getSetClientSettingsMethod) == null) {
      synchronized (obbGrpc.class) {
        if ((getSetClientSettingsMethod = obbGrpc.getSetClientSettingsMethod) == null) {
          obbGrpc.getSetClientSettingsMethod = getSetClientSettingsMethod =
              io.grpc.MethodDescriptor.<com.oddin.obb.Settings.SetClientSettingsRequest, com.oddin.obb.Settings.SetClientSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetClientSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oddin.obb.Settings.SetClientSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oddin.obb.Settings.SetClientSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new obbMethodDescriptorSupplier("SetClientSettings"))
              .build();
        }
      }
    }
    return getSetClientSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oddin.obb.Settings.ListClientSettingsRequest,
      com.oddin.obb.Settings.ListClientSettingsResponse> getListClientSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListClientSettings",
      requestType = com.oddin.obb.Settings.ListClientSettingsRequest.class,
      responseType = com.oddin.obb.Settings.ListClientSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oddin.obb.Settings.ListClientSettingsRequest,
      com.oddin.obb.Settings.ListClientSettingsResponse> getListClientSettingsMethod() {
    io.grpc.MethodDescriptor<com.oddin.obb.Settings.ListClientSettingsRequest, com.oddin.obb.Settings.ListClientSettingsResponse> getListClientSettingsMethod;
    if ((getListClientSettingsMethod = obbGrpc.getListClientSettingsMethod) == null) {
      synchronized (obbGrpc.class) {
        if ((getListClientSettingsMethod = obbGrpc.getListClientSettingsMethod) == null) {
          obbGrpc.getListClientSettingsMethod = getListClientSettingsMethod =
              io.grpc.MethodDescriptor.<com.oddin.obb.Settings.ListClientSettingsRequest, com.oddin.obb.Settings.ListClientSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListClientSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oddin.obb.Settings.ListClientSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oddin.obb.Settings.ListClientSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new obbMethodDescriptorSupplier("ListClientSettings"))
              .build();
        }
      }
    }
    return getListClientSettingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static obbStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<obbStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<obbStub>() {
        @java.lang.Override
        public obbStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new obbStub(channel, callOptions);
        }
      };
    return obbStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static obbBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<obbBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<obbBlockingStub>() {
        @java.lang.Override
        public obbBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new obbBlockingStub(channel, callOptions);
        }
      };
    return obbBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static obbFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<obbFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<obbFutureStub>() {
        @java.lang.Override
        public obbFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new obbFutureStub(channel, callOptions);
        }
      };
    return obbFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Used to retrieve a list of available markets for a given event.
     * </pre>
     */
    default void availableMarkets(com.oddin.obb.Markets.AvailableMarketsRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Markets.AvailableMarketsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAvailableMarketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Used for session creation.
     * </pre>
     */
    default void sessionCreate(com.oddin.obb.Session.SessionCreateRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Session.SessionCreateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSessionCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Used for extraction info about desired session based on session id.
     * </pre>
     */
    default void sessionInfo(com.oddin.obb.Session.SessionInfoRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Session.SessionInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSessionInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Used to get popular combinations of selections.
     * </pre>
     */
    default void popularCombination(com.oddin.obb.Popular.PopularCombinationRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Popular.PopularCombinationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPopularCombinationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Used to get client OBB settings.
     * </pre>
     */
    default void getClientSettings(com.oddin.obb.Settings.GetClientSettingsRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Settings.GetClientSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClientSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Used to set client OBB settings.
     * </pre>
     */
    default void setClientSettings(com.oddin.obb.Settings.SetClientSettingsRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Settings.SetClientSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetClientSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Used to list all client OBB settings.
     * </pre>
     */
    default void listClientSettings(com.oddin.obb.Settings.ListClientSettingsRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Settings.ListClientSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListClientSettingsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service obb.
   */
  public static abstract class obbImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return obbGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service obb.
   */
  public static final class obbStub
      extends io.grpc.stub.AbstractAsyncStub<obbStub> {
    private obbStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected obbStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new obbStub(channel, callOptions);
    }

    /**
     * <pre>
     * Used to retrieve a list of available markets for a given event.
     * </pre>
     */
    public void availableMarkets(com.oddin.obb.Markets.AvailableMarketsRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Markets.AvailableMarketsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAvailableMarketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Used for session creation.
     * </pre>
     */
    public void sessionCreate(com.oddin.obb.Session.SessionCreateRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Session.SessionCreateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSessionCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Used for extraction info about desired session based on session id.
     * </pre>
     */
    public void sessionInfo(com.oddin.obb.Session.SessionInfoRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Session.SessionInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSessionInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Used to get popular combinations of selections.
     * </pre>
     */
    public void popularCombination(com.oddin.obb.Popular.PopularCombinationRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Popular.PopularCombinationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPopularCombinationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Used to get client OBB settings.
     * </pre>
     */
    public void getClientSettings(com.oddin.obb.Settings.GetClientSettingsRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Settings.GetClientSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClientSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Used to set client OBB settings.
     * </pre>
     */
    public void setClientSettings(com.oddin.obb.Settings.SetClientSettingsRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Settings.SetClientSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetClientSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Used to list all client OBB settings.
     * </pre>
     */
    public void listClientSettings(com.oddin.obb.Settings.ListClientSettingsRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Settings.ListClientSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListClientSettingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service obb.
   */
  public static final class obbBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<obbBlockingStub> {
    private obbBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected obbBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new obbBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Used to retrieve a list of available markets for a given event.
     * </pre>
     */
    public com.oddin.obb.Markets.AvailableMarketsResponse availableMarkets(com.oddin.obb.Markets.AvailableMarketsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAvailableMarketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Used for session creation.
     * </pre>
     */
    public com.oddin.obb.Session.SessionCreateResponse sessionCreate(com.oddin.obb.Session.SessionCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSessionCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Used for extraction info about desired session based on session id.
     * </pre>
     */
    public com.oddin.obb.Session.SessionInfoResponse sessionInfo(com.oddin.obb.Session.SessionInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSessionInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Used to get popular combinations of selections.
     * </pre>
     */
    public com.oddin.obb.Popular.PopularCombinationResponse popularCombination(com.oddin.obb.Popular.PopularCombinationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPopularCombinationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Used to get client OBB settings.
     * </pre>
     */
    public com.oddin.obb.Settings.GetClientSettingsResponse getClientSettings(com.oddin.obb.Settings.GetClientSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClientSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Used to set client OBB settings.
     * </pre>
     */
    public com.oddin.obb.Settings.SetClientSettingsResponse setClientSettings(com.oddin.obb.Settings.SetClientSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetClientSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Used to list all client OBB settings.
     * </pre>
     */
    public com.oddin.obb.Settings.ListClientSettingsResponse listClientSettings(com.oddin.obb.Settings.ListClientSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListClientSettingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service obb.
   */
  public static final class obbFutureStub
      extends io.grpc.stub.AbstractFutureStub<obbFutureStub> {
    private obbFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected obbFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new obbFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Used to retrieve a list of available markets for a given event.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oddin.obb.Markets.AvailableMarketsResponse> availableMarkets(
        com.oddin.obb.Markets.AvailableMarketsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAvailableMarketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Used for session creation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oddin.obb.Session.SessionCreateResponse> sessionCreate(
        com.oddin.obb.Session.SessionCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSessionCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Used for extraction info about desired session based on session id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oddin.obb.Session.SessionInfoResponse> sessionInfo(
        com.oddin.obb.Session.SessionInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSessionInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Used to get popular combinations of selections.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oddin.obb.Popular.PopularCombinationResponse> popularCombination(
        com.oddin.obb.Popular.PopularCombinationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPopularCombinationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Used to get client OBB settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oddin.obb.Settings.GetClientSettingsResponse> getClientSettings(
        com.oddin.obb.Settings.GetClientSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClientSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Used to set client OBB settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oddin.obb.Settings.SetClientSettingsResponse> setClientSettings(
        com.oddin.obb.Settings.SetClientSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetClientSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Used to list all client OBB settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oddin.obb.Settings.ListClientSettingsResponse> listClientSettings(
        com.oddin.obb.Settings.ListClientSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListClientSettingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AVAILABLE_MARKETS = 0;
  private static final int METHODID_SESSION_CREATE = 1;
  private static final int METHODID_SESSION_INFO = 2;
  private static final int METHODID_POPULAR_COMBINATION = 3;
  private static final int METHODID_GET_CLIENT_SETTINGS = 4;
  private static final int METHODID_SET_CLIENT_SETTINGS = 5;
  private static final int METHODID_LIST_CLIENT_SETTINGS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AVAILABLE_MARKETS:
          serviceImpl.availableMarkets((com.oddin.obb.Markets.AvailableMarketsRequest) request,
              (io.grpc.stub.StreamObserver<com.oddin.obb.Markets.AvailableMarketsResponse>) responseObserver);
          break;
        case METHODID_SESSION_CREATE:
          serviceImpl.sessionCreate((com.oddin.obb.Session.SessionCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.oddin.obb.Session.SessionCreateResponse>) responseObserver);
          break;
        case METHODID_SESSION_INFO:
          serviceImpl.sessionInfo((com.oddin.obb.Session.SessionInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.oddin.obb.Session.SessionInfoResponse>) responseObserver);
          break;
        case METHODID_POPULAR_COMBINATION:
          serviceImpl.popularCombination((com.oddin.obb.Popular.PopularCombinationRequest) request,
              (io.grpc.stub.StreamObserver<com.oddin.obb.Popular.PopularCombinationResponse>) responseObserver);
          break;
        case METHODID_GET_CLIENT_SETTINGS:
          serviceImpl.getClientSettings((com.oddin.obb.Settings.GetClientSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.oddin.obb.Settings.GetClientSettingsResponse>) responseObserver);
          break;
        case METHODID_SET_CLIENT_SETTINGS:
          serviceImpl.setClientSettings((com.oddin.obb.Settings.SetClientSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.oddin.obb.Settings.SetClientSettingsResponse>) responseObserver);
          break;
        case METHODID_LIST_CLIENT_SETTINGS:
          serviceImpl.listClientSettings((com.oddin.obb.Settings.ListClientSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.oddin.obb.Settings.ListClientSettingsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAvailableMarketsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oddin.obb.Markets.AvailableMarketsRequest,
              com.oddin.obb.Markets.AvailableMarketsResponse>(
                service, METHODID_AVAILABLE_MARKETS)))
        .addMethod(
          getSessionCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oddin.obb.Session.SessionCreateRequest,
              com.oddin.obb.Session.SessionCreateResponse>(
                service, METHODID_SESSION_CREATE)))
        .addMethod(
          getSessionInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oddin.obb.Session.SessionInfoRequest,
              com.oddin.obb.Session.SessionInfoResponse>(
                service, METHODID_SESSION_INFO)))
        .addMethod(
          getPopularCombinationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oddin.obb.Popular.PopularCombinationRequest,
              com.oddin.obb.Popular.PopularCombinationResponse>(
                service, METHODID_POPULAR_COMBINATION)))
        .addMethod(
          getGetClientSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oddin.obb.Settings.GetClientSettingsRequest,
              com.oddin.obb.Settings.GetClientSettingsResponse>(
                service, METHODID_GET_CLIENT_SETTINGS)))
        .addMethod(
          getSetClientSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oddin.obb.Settings.SetClientSettingsRequest,
              com.oddin.obb.Settings.SetClientSettingsResponse>(
                service, METHODID_SET_CLIENT_SETTINGS)))
        .addMethod(
          getListClientSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.oddin.obb.Settings.ListClientSettingsRequest,
              com.oddin.obb.Settings.ListClientSettingsResponse>(
                service, METHODID_LIST_CLIENT_SETTINGS)))
        .build();
  }

  private static abstract class obbBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    obbBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.oddin.obb.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("obb");
    }
  }

  private static final class obbFileDescriptorSupplier
      extends obbBaseDescriptorSupplier {
    obbFileDescriptorSupplier() {}
  }

  private static final class obbMethodDescriptorSupplier
      extends obbBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    obbMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (obbGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new obbFileDescriptorSupplier())
              .addMethod(getAvailableMarketsMethod())
              .addMethod(getSessionCreateMethod())
              .addMethod(getSessionInfoMethod())
              .addMethod(getPopularCombinationMethod())
              .addMethod(getGetClientSettingsMethod())
              .addMethod(getSetClientSettingsMethod())
              .addMethod(getListClientSettingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
