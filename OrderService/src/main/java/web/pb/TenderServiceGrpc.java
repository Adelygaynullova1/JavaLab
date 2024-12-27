package web.pb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: tender.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TenderServiceGrpc {

  private TenderServiceGrpc() {}

  public static final String SERVICE_NAME = "TenderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<web.pb.Empty,
      web.pb.TenderResponse> getGetWinnerCompanyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWinnerCompany",
      requestType = web.pb.Empty.class,
      responseType = web.pb.TenderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.pb.Empty,
      web.pb.TenderResponse> getGetWinnerCompanyMethod() {
    io.grpc.MethodDescriptor<web.pb.Empty, web.pb.TenderResponse> getGetWinnerCompanyMethod;
    if ((getGetWinnerCompanyMethod = TenderServiceGrpc.getGetWinnerCompanyMethod) == null) {
      synchronized (TenderServiceGrpc.class) {
        if ((getGetWinnerCompanyMethod = TenderServiceGrpc.getGetWinnerCompanyMethod) == null) {
          TenderServiceGrpc.getGetWinnerCompanyMethod = getGetWinnerCompanyMethod =
              io.grpc.MethodDescriptor.<web.pb.Empty, web.pb.TenderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWinnerCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.pb.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.pb.TenderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TenderServiceMethodDescriptorSupplier("GetWinnerCompany"))
              .build();
        }
      }
    }
    return getGetWinnerCompanyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TenderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TenderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TenderServiceStub>() {
        @java.lang.Override
        public TenderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TenderServiceStub(channel, callOptions);
        }
      };
    return TenderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TenderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TenderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TenderServiceBlockingStub>() {
        @java.lang.Override
        public TenderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TenderServiceBlockingStub(channel, callOptions);
        }
      };
    return TenderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TenderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TenderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TenderServiceFutureStub>() {
        @java.lang.Override
        public TenderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TenderServiceFutureStub(channel, callOptions);
        }
      };
    return TenderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TenderServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getWinnerCompany(web.pb.Empty request,
        io.grpc.stub.StreamObserver<web.pb.TenderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWinnerCompanyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetWinnerCompanyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                web.pb.Empty,
                web.pb.TenderResponse>(
                  this, METHODID_GET_WINNER_COMPANY)))
          .build();
    }
  }

  /**
   */
  public static final class TenderServiceStub extends io.grpc.stub.AbstractAsyncStub<TenderServiceStub> {
    private TenderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TenderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TenderServiceStub(channel, callOptions);
    }

    /**
     */
    public void getWinnerCompany(web.pb.Empty request,
        io.grpc.stub.StreamObserver<web.pb.TenderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWinnerCompanyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TenderServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TenderServiceBlockingStub> {
    private TenderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TenderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TenderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public web.pb.TenderResponse getWinnerCompany(web.pb.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWinnerCompanyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TenderServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TenderServiceFutureStub> {
    private TenderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TenderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TenderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<web.pb.TenderResponse> getWinnerCompany(
        web.pb.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWinnerCompanyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WINNER_COMPANY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TenderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TenderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_WINNER_COMPANY:
          serviceImpl.getWinnerCompany((web.pb.Empty) request,
              (io.grpc.stub.StreamObserver<web.pb.TenderResponse>) responseObserver);
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

  private static abstract class TenderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TenderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return web.pb.Tender.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TenderService");
    }
  }

  private static final class TenderServiceFileDescriptorSupplier
      extends TenderServiceBaseDescriptorSupplier {
    TenderServiceFileDescriptorSupplier() {}
  }

  private static final class TenderServiceMethodDescriptorSupplier
      extends TenderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TenderServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TenderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TenderServiceFileDescriptorSupplier())
              .addMethod(getGetWinnerCompanyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
