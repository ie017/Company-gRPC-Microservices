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
public final class PersonServiceGrpc {

  private PersonServiceGrpc() {}

  public static final String SERVICE_NAME = "PersonService";

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
    if ((getGetNameMethod = PersonServiceGrpc.getGetNameMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getGetNameMethod = PersonServiceGrpc.getGetNameMethod) == null) {
          PersonServiceGrpc.getGetNameMethod = getGetNameMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PersonService", "getName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getNameResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("getName"))
                  .build();
          }
        }
     }
     return getGetNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getBirthDateResponse> getGetBirthDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBirthDate",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getBirthDateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getBirthDateResponse> getGetBirthDateMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getBirthDateResponse> getGetBirthDateMethod;
    if ((getGetBirthDateMethod = PersonServiceGrpc.getGetBirthDateMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getGetBirthDateMethod = PersonServiceGrpc.getGetBirthDateMethod) == null) {
          PersonServiceGrpc.getGetBirthDateMethod = getGetBirthDateMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getBirthDateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PersonService", "getBirthDate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getBirthDateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("getBirthDate"))
                  .build();
          }
        }
     }
     return getGetBirthDateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getRegistryNumberResponse> getGetRegistryNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRegistryNumber",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getRegistryNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getRegistryNumberResponse> getGetRegistryNumberMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getRegistryNumberResponse> getGetRegistryNumberMethod;
    if ((getGetRegistryNumberMethod = PersonServiceGrpc.getGetRegistryNumberMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getGetRegistryNumberMethod = PersonServiceGrpc.getGetRegistryNumberMethod) == null) {
          PersonServiceGrpc.getGetRegistryNumberMethod = getGetRegistryNumberMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getRegistryNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PersonService", "getRegistryNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getRegistryNumberResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("getRegistryNumber"))
                  .build();
          }
        }
     }
     return getGetRegistryNumberMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonServiceStub newStub(io.grpc.Channel channel) {
    return new PersonServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PersonServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersonServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PersonServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PersonServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getName(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getNameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNameMethod(), responseObserver);
    }

    /**
     */
    public void getBirthDate(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getBirthDateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBirthDateMethod(), responseObserver);
    }

    /**
     */
    public void getRegistryNumber(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getRegistryNumberResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRegistryNumberMethod(), responseObserver);
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
            getGetBirthDateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getBirthDateResponse>(
                  this, METHODID_GET_BIRTH_DATE)))
          .addMethod(
            getGetRegistryNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getRegistryNumberResponse>(
                  this, METHODID_GET_REGISTRY_NUMBER)))
          .build();
    }
  }

  /**
   */
  public static final class PersonServiceStub extends io.grpc.stub.AbstractStub<PersonServiceStub> {
    private PersonServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceStub(channel, callOptions);
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
    public void getBirthDate(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getBirthDateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBirthDateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRegistryNumber(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getRegistryNumberResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRegistryNumberMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PersonServiceBlockingStub extends io.grpc.stub.AbstractStub<PersonServiceBlockingStub> {
    private PersonServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getNameResponse getName(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request) {
      return blockingUnaryCall(
          getChannel(), getGetNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getBirthDateResponse getBirthDate(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request) {
      return blockingUnaryCall(
          getChannel(), getGetBirthDateMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getRegistryNumberResponse getRegistryNumber(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request) {
      return blockingUnaryCall(
          getChannel(), getGetRegistryNumberMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersonServiceFutureStub extends io.grpc.stub.AbstractStub<PersonServiceFutureStub> {
    private PersonServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceFutureStub(channel, callOptions);
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
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getBirthDateResponse> getBirthDate(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBirthDateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getRegistryNumberResponse> getRegistryNumber(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRegistryNumberMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NAME = 0;
  private static final int METHODID_GET_BIRTH_DATE = 1;
  private static final int METHODID_GET_REGISTRY_NUMBER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PersonServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_GET_BIRTH_DATE:
          serviceImpl.getBirthDate((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getBirthDateResponse>) responseObserver);
          break;
        case METHODID_GET_REGISTRY_NUMBER:
          serviceImpl.getRegistryNumber((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Vide) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getRegistryNumberResponse>) responseObserver);
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

  private static abstract class PersonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersonServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PersonService");
    }
  }

  private static final class PersonServiceFileDescriptorSupplier
      extends PersonServiceBaseDescriptorSupplier {
    PersonServiceFileDescriptorSupplier() {}
  }

  private static final class PersonServiceMethodDescriptorSupplier
      extends PersonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PersonServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PersonServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersonServiceFileDescriptorSupplier())
              .addMethod(getGetNameMethod())
              .addMethod(getGetBirthDateMethod())
              .addMethod(getGetRegistryNumberMethod())
              .build();
        }
      }
    }
    return result;
  }
}
