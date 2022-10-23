package grpc.project.companygrpcservice.gRPC.stub;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Company.proto")
public final class DepartmentServiceGrpc {

  private DepartmentServiceGrpc() {}

  public static final String SERVICE_NAME = "DepartmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "start",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getStartMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getStartMethod;
    if ((getStartMethod = DepartmentServiceGrpc.getStartMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getStartMethod = DepartmentServiceGrpc.getStartMethod) == null) {
          DepartmentServiceGrpc.getStartMethod = getStartMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DepartmentService", "start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("start"))
                  .build();
          }
        }
     }
     return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getSellMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sell",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getSellMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getSellMethod;
    if ((getSellMethod = DepartmentServiceGrpc.getSellMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getSellMethod = DepartmentServiceGrpc.getSellMethod) == null) {
          DepartmentServiceGrpc.getSellMethod = getSellMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DepartmentService", "Sell"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("Sell"))
                  .build();
          }
        }
     }
     return getSellMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getFinishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "finish",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getFinishMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getFinishMethod;
    if ((getFinishMethod = DepartmentServiceGrpc.getFinishMethod) == null) {
      synchronized (DepartmentServiceGrpc.class) {
        if ((getFinishMethod = DepartmentServiceGrpc.getFinishMethod) == null) {
          DepartmentServiceGrpc.getFinishMethod = getFinishMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DepartmentService", "finish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new DepartmentServiceMethodDescriptorSupplier("finish"))
                  .build();
          }
        }
     }
     return getFinishMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DepartmentServiceStub newStub(io.grpc.Channel channel) {
    return new DepartmentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DepartmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DepartmentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DepartmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DepartmentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DepartmentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void start(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     */
    public void sell(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getSellMethod(), responseObserver);
    }

    /**
     */
    public void finish(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getFinishMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>(
                  this, METHODID_START)))
          .addMethod(
            getSellMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>(
                  this, METHODID_SELL)))
          .addMethod(
            getFinishMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>(
                  this, METHODID_FINISH)))
          .build();
    }
  }

  /**
   */
  public static final class DepartmentServiceStub extends io.grpc.stub.AbstractStub<DepartmentServiceStub> {
    private DepartmentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepartmentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepartmentServiceStub(channel, callOptions);
    }

    /**
     */
    public void start(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sell(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSellMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void finish(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFinishMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DepartmentServiceBlockingStub extends io.grpc.stub.AbstractStub<DepartmentServiceBlockingStub> {
    private DepartmentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepartmentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepartmentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status start(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project request) {
      return blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status sell(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project request) {
      return blockingUnaryCall(
          getChannel(), getSellMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status finish(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project request) {
      return blockingUnaryCall(
          getChannel(), getFinishMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DepartmentServiceFutureStub extends io.grpc.stub.AbstractStub<DepartmentServiceFutureStub> {
    private DepartmentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepartmentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepartmentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> start(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project request) {
      return futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> sell(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project request) {
      return futureUnaryCall(
          getChannel().newCall(getSellMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> finish(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project request) {
      return futureUnaryCall(
          getChannel().newCall(getFinishMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START = 0;
  private static final int METHODID_SELL = 1;
  private static final int METHODID_FINISH = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DepartmentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DepartmentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START:
          serviceImpl.start((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>) responseObserver);
          break;
        case METHODID_SELL:
          serviceImpl.sell((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>) responseObserver);
          break;
        case METHODID_FINISH:
          serviceImpl.finish((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Project) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>) responseObserver);
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

  private static abstract class DepartmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DepartmentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DepartmentService");
    }
  }

  private static final class DepartmentServiceFileDescriptorSupplier
      extends DepartmentServiceBaseDescriptorSupplier {
    DepartmentServiceFileDescriptorSupplier() {}
  }

  private static final class DepartmentServiceMethodDescriptorSupplier
      extends DepartmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DepartmentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DepartmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DepartmentServiceFileDescriptorSupplier())
              .addMethod(getStartMethod())
              .addMethod(getSellMethod())
              .addMethod(getFinishMethod())
              .build();
        }
      }
    }
    return result;
  }
}
