package com.oddin.obb;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: obb/service.proto")
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
  public static abstract class obbImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Used to retrieve a list of available markets for a given event.
     * </pre>
     */
    public void availableMarkets(com.oddin.obb.Markets.AvailableMarketsRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Markets.AvailableMarketsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAvailableMarketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Used for session creation.
     * </pre>
     */
    public void sessionCreate(com.oddin.obb.Session.SessionCreateRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Session.SessionCreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSessionCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Used for extraction info about desired session based on session id.
     * </pre>
     */
    public void sessionInfo(com.oddin.obb.Session.SessionInfoRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Session.SessionInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSessionInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Used to get popular combinations of selections.
     * </pre>
     */
    public void popularCombination(com.oddin.obb.Popular.PopularCombinationRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Popular.PopularCombinationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPopularCombinationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAvailableMarketsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.oddin.obb.Markets.AvailableMarketsRequest,
                com.oddin.obb.Markets.AvailableMarketsResponse>(
                  this, METHODID_AVAILABLE_MARKETS)))
          .addMethod(
            getSessionCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.oddin.obb.Session.SessionCreateRequest,
                com.oddin.obb.Session.SessionCreateResponse>(
                  this, METHODID_SESSION_CREATE)))
          .addMethod(
            getSessionInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.oddin.obb.Session.SessionInfoRequest,
                com.oddin.obb.Session.SessionInfoResponse>(
                  this, METHODID_SESSION_INFO)))
          .addMethod(
            getPopularCombinationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.oddin.obb.Popular.PopularCombinationRequest,
                com.oddin.obb.Popular.PopularCombinationResponse>(
                  this, METHODID_POPULAR_COMBINATION)))
          .build();
    }
  }

  /**
   */
  public static final class obbStub extends io.grpc.stub.AbstractAsyncStub<obbStub> {
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
      asyncUnaryCall(
          getChannel().newCall(getAvailableMarketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Used for session creation.
     * </pre>
     */
    public void sessionCreate(com.oddin.obb.Session.SessionCreateRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Session.SessionCreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSessionCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Used for extraction info about desired session based on session id.
     * </pre>
     */
    public void sessionInfo(com.oddin.obb.Session.SessionInfoRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Session.SessionInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSessionInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Used to get popular combinations of selections.
     * </pre>
     */
    public void popularCombination(com.oddin.obb.Popular.PopularCombinationRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Popular.PopularCombinationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPopularCombinationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class obbBlockingStub extends io.grpc.stub.AbstractBlockingStub<obbBlockingStub> {
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
      return blockingUnaryCall(
          getChannel(), getAvailableMarketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Used for session creation.
     * </pre>
     */
    public com.oddin.obb.Session.SessionCreateResponse sessionCreate(com.oddin.obb.Session.SessionCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSessionCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Used for extraction info about desired session based on session id.
     * </pre>
     */
    public com.oddin.obb.Session.SessionInfoResponse sessionInfo(com.oddin.obb.Session.SessionInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getSessionInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Used to get popular combinations of selections.
     * </pre>
     */
    public com.oddin.obb.Popular.PopularCombinationResponse popularCombination(com.oddin.obb.Popular.PopularCombinationRequest request) {
      return blockingUnaryCall(
          getChannel(), getPopularCombinationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class obbFutureStub extends io.grpc.stub.AbstractFutureStub<obbFutureStub> {
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
      return futureUnaryCall(
          getChannel().newCall(getAvailableMarketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Used for session creation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oddin.obb.Session.SessionCreateResponse> sessionCreate(
        com.oddin.obb.Session.SessionCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSessionCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Used for extraction info about desired session based on session id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oddin.obb.Session.SessionInfoResponse> sessionInfo(
        com.oddin.obb.Session.SessionInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSessionInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Used to get popular combinations of selections.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oddin.obb.Popular.PopularCombinationResponse> popularCombination(
        com.oddin.obb.Popular.PopularCombinationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPopularCombinationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AVAILABLE_MARKETS = 0;
  private static final int METHODID_SESSION_CREATE = 1;
  private static final int METHODID_SESSION_INFO = 2;
  private static final int METHODID_POPULAR_COMBINATION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final obbImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(obbImplBase serviceImpl, int methodId) {
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
              .build();
        }
      }
    }
    return result;
  }
}
