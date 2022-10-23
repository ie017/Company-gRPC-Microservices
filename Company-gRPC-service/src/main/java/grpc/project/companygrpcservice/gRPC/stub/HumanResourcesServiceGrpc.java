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
public final class HumanResourcesServiceGrpc {

  private HumanResourcesServiceGrpc() {}

  public static final String SERVICE_NAME = "HumanResourcesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Person,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee> getHireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hire",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Person.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Person,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee> getHireMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Person, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee> getHireMethod;
    if ((getHireMethod = HumanResourcesServiceGrpc.getHireMethod) == null) {
      synchronized (HumanResourcesServiceGrpc.class) {
        if ((getHireMethod = HumanResourcesServiceGrpc.getHireMethod) == null) {
          HumanResourcesServiceGrpc.getHireMethod = getHireMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Person, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HumanResourcesService", "hire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee.getDefaultInstance()))
                  .setSchemaDescriptor(new HumanResourcesServiceMethodDescriptorSupplier("hire"))
                  .build();
          }
        }
     }
     return getHireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getDismissMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "dismiss",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getDismissMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getDismissMethod;
    if ((getDismissMethod = HumanResourcesServiceGrpc.getDismissMethod) == null) {
      synchronized (HumanResourcesServiceGrpc.class) {
        if ((getDismissMethod = HumanResourcesServiceGrpc.getDismissMethod) == null) {
          HumanResourcesServiceGrpc.getDismissMethod = getDismissMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HumanResourcesService", "dismiss"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new HumanResourcesServiceMethodDescriptorSupplier("dismiss"))
                  .build();
          }
        }
     }
     return getDismissMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HumanResourcesServiceStub newStub(io.grpc.Channel channel) {
    return new HumanResourcesServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HumanResourcesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HumanResourcesServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HumanResourcesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HumanResourcesServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HumanResourcesServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void hire(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Person request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee> responseObserver) {
      asyncUnimplementedUnaryCall(getHireMethod(), responseObserver);
    }

    /**
     */
    public void dismiss(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getDismissMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Person,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee>(
                  this, METHODID_HIRE)))
          .addMethod(
            getDismissMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>(
                  this, METHODID_DISMISS)))
          .build();
    }
  }

  /**
   */
  public static final class HumanResourcesServiceStub extends io.grpc.stub.AbstractStub<HumanResourcesServiceStub> {
    private HumanResourcesServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HumanResourcesServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HumanResourcesServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HumanResourcesServiceStub(channel, callOptions);
    }

    /**
     */
    public void hire(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Person request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dismiss(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDismissMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HumanResourcesServiceBlockingStub extends io.grpc.stub.AbstractStub<HumanResourcesServiceBlockingStub> {
    private HumanResourcesServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HumanResourcesServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HumanResourcesServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HumanResourcesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee hire(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Person request) {
      return blockingUnaryCall(
          getChannel(), getHireMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status dismiss(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee request) {
      return blockingUnaryCall(
          getChannel(), getDismissMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HumanResourcesServiceFutureStub extends io.grpc.stub.AbstractStub<HumanResourcesServiceFutureStub> {
    private HumanResourcesServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HumanResourcesServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HumanResourcesServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HumanResourcesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee> hire(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Person request) {
      return futureUnaryCall(
          getChannel().newCall(getHireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> dismiss(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee request) {
      return futureUnaryCall(
          getChannel().newCall(getDismissMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HIRE = 0;
  private static final int METHODID_DISMISS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HumanResourcesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HumanResourcesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HIRE:
          serviceImpl.hire((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Person) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee>) responseObserver);
          break;
        case METHODID_DISMISS:
          serviceImpl.dismiss((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee) request,
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

  private static abstract class HumanResourcesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HumanResourcesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HumanResourcesService");
    }
  }

  private static final class HumanResourcesServiceFileDescriptorSupplier
      extends HumanResourcesServiceBaseDescriptorSupplier {
    HumanResourcesServiceFileDescriptorSupplier() {}
  }

  private static final class HumanResourcesServiceMethodDescriptorSupplier
      extends HumanResourcesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HumanResourcesServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HumanResourcesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HumanResourcesServiceFileDescriptorSupplier())
              .addMethod(getHireMethod())
              .addMethod(getDismissMethod())
              .build();
        }
      }
    }
    return result;
  }
}
