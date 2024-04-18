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
  private static volatile io.grpc.MethodDescriptor<com.oddin.obb.Markets.MarketRequest,
      com.oddin.obb.Markets.MarketResponse> getMarketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Markets",
      requestType = com.oddin.obb.Markets.MarketRequest.class,
      responseType = com.oddin.obb.Markets.MarketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oddin.obb.Markets.MarketRequest,
      com.oddin.obb.Markets.MarketResponse> getMarketsMethod() {
    io.grpc.MethodDescriptor<com.oddin.obb.Markets.MarketRequest, com.oddin.obb.Markets.MarketResponse> getMarketsMethod;
    if ((getMarketsMethod = obbGrpc.getMarketsMethod) == null) {
      synchronized (obbGrpc.class) {
        if ((getMarketsMethod = obbGrpc.getMarketsMethod) == null) {
          obbGrpc.getMarketsMethod = getMarketsMethod =
              io.grpc.MethodDescriptor.<com.oddin.obb.Markets.MarketRequest, com.oddin.obb.Markets.MarketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Markets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oddin.obb.Markets.MarketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oddin.obb.Markets.MarketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new obbMethodDescriptorSupplier("Markets"))
              .build();
        }
      }
    }
    return getMarketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oddin.obb.Session.SessionRequest,
      com.oddin.obb.Session.SessionResponse> getSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Session",
      requestType = com.oddin.obb.Session.SessionRequest.class,
      responseType = com.oddin.obb.Session.SessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.oddin.obb.Session.SessionRequest,
      com.oddin.obb.Session.SessionResponse> getSessionMethod() {
    io.grpc.MethodDescriptor<com.oddin.obb.Session.SessionRequest, com.oddin.obb.Session.SessionResponse> getSessionMethod;
    if ((getSessionMethod = obbGrpc.getSessionMethod) == null) {
      synchronized (obbGrpc.class) {
        if ((getSessionMethod = obbGrpc.getSessionMethod) == null) {
          obbGrpc.getSessionMethod = getSessionMethod =
              io.grpc.MethodDescriptor.<com.oddin.obb.Session.SessionRequest, com.oddin.obb.Session.SessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Session"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oddin.obb.Session.SessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oddin.obb.Session.SessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new obbMethodDescriptorSupplier("Session"))
              .build();
        }
      }
    }
    return getSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oddin.obb.Popular.PopularCombinationRequest,
      com.oddin.obb.Popular.PopularCombinationResponse> getPopularCombinationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PopularCombinations",
      requestType = com.oddin.obb.Popular.PopularCombinationRequest.class,
      responseType = com.oddin.obb.Popular.PopularCombinationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oddin.obb.Popular.PopularCombinationRequest,
      com.oddin.obb.Popular.PopularCombinationResponse> getPopularCombinationsMethod() {
    io.grpc.MethodDescriptor<com.oddin.obb.Popular.PopularCombinationRequest, com.oddin.obb.Popular.PopularCombinationResponse> getPopularCombinationsMethod;
    if ((getPopularCombinationsMethod = obbGrpc.getPopularCombinationsMethod) == null) {
      synchronized (obbGrpc.class) {
        if ((getPopularCombinationsMethod = obbGrpc.getPopularCombinationsMethod) == null) {
          obbGrpc.getPopularCombinationsMethod = getPopularCombinationsMethod =
              io.grpc.MethodDescriptor.<com.oddin.obb.Popular.PopularCombinationRequest, com.oddin.obb.Popular.PopularCombinationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PopularCombinations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oddin.obb.Popular.PopularCombinationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oddin.obb.Popular.PopularCombinationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new obbMethodDescriptorSupplier("PopularCombinations"))
              .build();
        }
      }
    }
    return getPopularCombinationsMethod;
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
     */
    public void markets(com.oddin.obb.Markets.MarketRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Markets.MarketResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMarketsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.oddin.obb.Session.SessionRequest> session(
        io.grpc.stub.StreamObserver<com.oddin.obb.Session.SessionResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSessionMethod(), responseObserver);
    }

    /**
     */
    public void popularCombinations(com.oddin.obb.Popular.PopularCombinationRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Popular.PopularCombinationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPopularCombinationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMarketsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.oddin.obb.Markets.MarketRequest,
                com.oddin.obb.Markets.MarketResponse>(
                  this, METHODID_MARKETS)))
          .addMethod(
            getSessionMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.oddin.obb.Session.SessionRequest,
                com.oddin.obb.Session.SessionResponse>(
                  this, METHODID_SESSION)))
          .addMethod(
            getPopularCombinationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.oddin.obb.Popular.PopularCombinationRequest,
                com.oddin.obb.Popular.PopularCombinationResponse>(
                  this, METHODID_POPULAR_COMBINATIONS)))
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
     */
    public void markets(com.oddin.obb.Markets.MarketRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Markets.MarketResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMarketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.oddin.obb.Session.SessionRequest> session(
        io.grpc.stub.StreamObserver<com.oddin.obb.Session.SessionResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSessionMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void popularCombinations(com.oddin.obb.Popular.PopularCombinationRequest request,
        io.grpc.stub.StreamObserver<com.oddin.obb.Popular.PopularCombinationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPopularCombinationsMethod(), getCallOptions()), request, responseObserver);
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
     */
    public com.oddin.obb.Markets.MarketResponse markets(com.oddin.obb.Markets.MarketRequest request) {
      return blockingUnaryCall(
          getChannel(), getMarketsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.oddin.obb.Popular.PopularCombinationResponse popularCombinations(com.oddin.obb.Popular.PopularCombinationRequest request) {
      return blockingUnaryCall(
          getChannel(), getPopularCombinationsMethod(), getCallOptions(), request);
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oddin.obb.Markets.MarketResponse> markets(
        com.oddin.obb.Markets.MarketRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMarketsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oddin.obb.Popular.PopularCombinationResponse> popularCombinations(
        com.oddin.obb.Popular.PopularCombinationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPopularCombinationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MARKETS = 0;
  private static final int METHODID_POPULAR_COMBINATIONS = 1;
  private static final int METHODID_SESSION = 2;

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
        case METHODID_MARKETS:
          serviceImpl.markets((com.oddin.obb.Markets.MarketRequest) request,
              (io.grpc.stub.StreamObserver<com.oddin.obb.Markets.MarketResponse>) responseObserver);
          break;
        case METHODID_POPULAR_COMBINATIONS:
          serviceImpl.popularCombinations((com.oddin.obb.Popular.PopularCombinationRequest) request,
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
        case METHODID_SESSION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.session(
              (io.grpc.stub.StreamObserver<com.oddin.obb.Session.SessionResponse>) responseObserver);
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
              .addMethod(getMarketsMethod())
              .addMethod(getSessionMethod())
              .addMethod(getPopularCombinationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
