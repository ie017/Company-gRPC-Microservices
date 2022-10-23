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
public final class ProjectServiceGrpc {

  private ProjectServiceGrpc() {}

  public static final String SERVICE_NAME = "ProjectService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getNameResponse> getGetNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getName",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getNameResponse> getGetNameMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getNameResponse> getGetNameMethod;
    if ((getGetNameMethod = ProjectServiceGrpc.getGetNameMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getGetNameMethod = ProjectServiceGrpc.getGetNameMethod) == null) {
          ProjectServiceGrpc.getGetNameMethod = getGetNameMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProjectService", "getName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getNameResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("getName"))
                  .build();
          }
        }
     }
     return getGetNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getDeadLineResponse> getGetDeadLineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDeadLine",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getDeadLineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getDeadLineResponse> getGetDeadLineMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getDeadLineResponse> getGetDeadLineMethod;
    if ((getGetDeadLineMethod = ProjectServiceGrpc.getGetDeadLineMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getGetDeadLineMethod = ProjectServiceGrpc.getGetDeadLineMethod) == null) {
          ProjectServiceGrpc.getGetDeadLineMethod = getGetDeadLineMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getDeadLineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProjectService", "getDeadLine"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getDeadLineResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("getDeadLine"))
                  .build();
          }
        }
     }
     return getGetDeadLineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getIsFinishedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "isFinished",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getIsFinishedMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getIsFinishedMethod;
    if ((getIsFinishedMethod = ProjectServiceGrpc.getIsFinishedMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getIsFinishedMethod = ProjectServiceGrpc.getIsFinishedMethod) == null) {
          ProjectServiceGrpc.getIsFinishedMethod = getIsFinishedMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProjectService", "isFinished"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("isFinished"))
                  .build();
          }
        }
     }
     return getIsFinishedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectServiceStub newStub(io.grpc.Channel channel) {
    return new ProjectServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProjectServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProjectServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProjectServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProjectServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getName(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getNameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNameMethod(), responseObserver);
    }

    /**
     */
    public void getDeadLine(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getDeadLineResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDeadLineMethod(), responseObserver);
    }

    /**
     */
    public void isFinished(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getIsFinishedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getNameResponse>(
                  this, METHODID_GET_NAME)))
          .addMethod(
            getGetDeadLineMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getDeadLineResponse>(
                  this, METHODID_GET_DEAD_LINE)))
          .addMethod(
            getIsFinishedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>(
                  this, METHODID_IS_FINISHED)))
          .build();
    }
  }

  /**
   */
  public static final class ProjectServiceStub extends io.grpc.stub.AbstractStub<ProjectServiceStub> {
    private ProjectServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectServiceStub(channel, callOptions);
    }

    /**
     */
    public void getName(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getNameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDeadLine(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getDeadLineResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDeadLineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isFinished(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsFinishedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProjectServiceBlockingStub extends io.grpc.stub.AbstractStub<ProjectServiceBlockingStub> {
    private ProjectServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getNameResponse getName(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request) {
      return blockingUnaryCall(
          getChannel(), getGetNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getDeadLineResponse getDeadLine(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request) {
      return blockingUnaryCall(
          getChannel(), getGetDeadLineMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status isFinished(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request) {
      return blockingUnaryCall(
          getChannel(), getIsFinishedMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProjectServiceFutureStub extends io.grpc.stub.AbstractStub<ProjectServiceFutureStub> {
    private ProjectServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getNameResponse> getName(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getDeadLineResponse> getDeadLine(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDeadLineMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> isFinished(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request) {
      return futureUnaryCall(
          getChannel().newCall(getIsFinishedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NAME = 0;
  private static final int METHODID_GET_DEAD_LINE = 1;
  private static final int METHODID_IS_FINISHED = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProjectServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProjectServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NAME:
          serviceImpl.getName((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getNameResponse>) responseObserver);
          break;
        case METHODID_GET_DEAD_LINE:
          serviceImpl.getDeadLine((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getDeadLineResponse>) responseObserver);
          break;
        case METHODID_IS_FINISHED:
          serviceImpl.isFinished((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide) request,
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

  private static abstract class ProjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProjectService");
    }
  }

  private static final class ProjectServiceFileDescriptorSupplier
      extends ProjectServiceBaseDescriptorSupplier {
    ProjectServiceFileDescriptorSupplier() {}
  }

  private static final class ProjectServiceMethodDescriptorSupplier
      extends ProjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProjectServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProjectServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectServiceFileDescriptorSupplier())
              .addMethod(getGetNameMethod())
              .addMethod(getGetDeadLineMethod())
              .addMethod(getIsFinishedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
