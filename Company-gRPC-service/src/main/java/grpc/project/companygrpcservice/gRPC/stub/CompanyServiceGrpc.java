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
public final class CompanyServiceGrpc {

  private CompanyServiceGrpc() {}

  public static final String SERVICE_NAME = "CompanyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setNameCompany,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> getCreateCompanyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createCompany",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setNameCompany.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setNameCompany,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> getCreateCompanyMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setNameCompany, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> getCreateCompanyMethod;
    if ((getCreateCompanyMethod = CompanyServiceGrpc.getCreateCompanyMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getCreateCompanyMethod = CompanyServiceGrpc.getCreateCompanyMethod) == null) {
          CompanyServiceGrpc.getCreateCompanyMethod = getCreateCompanyMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setNameCompany, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompanyService", "createCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setNameCompany.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("createCompany"))
                  .build();
          }
        }
     }
     return getCreateCompanyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> getGetCompanyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCompany",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> getGetCompanyMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> getGetCompanyMethod;
    if ((getGetCompanyMethod = CompanyServiceGrpc.getGetCompanyMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getGetCompanyMethod = CompanyServiceGrpc.getGetCompanyMethod) == null) {
          CompanyServiceGrpc.getGetCompanyMethod = getGetCompanyMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompanyService", "getCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("getCompany"))
                  .build();
          }
        }
     }
     return getGetCompanyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource> getGetHumanResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHumanResource",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource> getGetHumanResourceMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource> getGetHumanResourceMethod;
    if ((getGetHumanResourceMethod = CompanyServiceGrpc.getGetHumanResourceMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getGetHumanResourceMethod = CompanyServiceGrpc.getGetHumanResourceMethod) == null) {
          CompanyServiceGrpc.getGetHumanResourceMethod = getGetHumanResourceMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompanyService", "getHumanResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("getHumanResource"))
                  .build();
          }
        }
     }
     return getGetHumanResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allDepartments> getGetAllDepartmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllDepartments",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allDepartments.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allDepartments> getGetAllDepartmentsMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allDepartments> getGetAllDepartmentsMethod;
    if ((getGetAllDepartmentsMethod = CompanyServiceGrpc.getGetAllDepartmentsMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getGetAllDepartmentsMethod = CompanyServiceGrpc.getGetAllDepartmentsMethod) == null) {
          CompanyServiceGrpc.getGetAllDepartmentsMethod = getGetAllDepartmentsMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allDepartments>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompanyService", "getAllDepartments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allDepartments.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("getAllDepartments"))
                  .build();
          }
        }
     }
     return getGetAllDepartmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allProjects> getGetAllProjectsOfDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllProjectsOfDepartment",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allProjects.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allProjects> getGetAllProjectsOfDepartmentMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allProjects> getGetAllProjectsOfDepartmentMethod;
    if ((getGetAllProjectsOfDepartmentMethod = CompanyServiceGrpc.getGetAllProjectsOfDepartmentMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getGetAllProjectsOfDepartmentMethod = CompanyServiceGrpc.getGetAllProjectsOfDepartmentMethod) == null) {
          CompanyServiceGrpc.getGetAllProjectsOfDepartmentMethod = getGetAllProjectsOfDepartmentMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allProjects>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompanyService", "getAllProjectsOfDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allProjects.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("getAllProjectsOfDepartment"))
                  .build();
          }
        }
     }
     return getGetAllProjectsOfDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allEmployees> getGetAllEmployeesOfDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllEmployeesOfDepartment",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allEmployees.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allEmployees> getGetAllEmployeesOfDepartmentMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allEmployees> getGetAllEmployeesOfDepartmentMethod;
    if ((getGetAllEmployeesOfDepartmentMethod = CompanyServiceGrpc.getGetAllEmployeesOfDepartmentMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getGetAllEmployeesOfDepartmentMethod = CompanyServiceGrpc.getGetAllEmployeesOfDepartmentMethod) == null) {
          CompanyServiceGrpc.getGetAllEmployeesOfDepartmentMethod = getGetAllEmployeesOfDepartmentMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allEmployees>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompanyService", "getAllEmployeesOfDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allEmployees.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("getAllEmployeesOfDepartment"))
                  .build();
          }
        }
     }
     return getGetAllEmployeesOfDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartment,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> getAddDepartmentToCompanyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addDepartmentToCompany",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartment.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartment,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> getAddDepartmentToCompanyMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartment, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> getAddDepartmentToCompanyMethod;
    if ((getAddDepartmentToCompanyMethod = CompanyServiceGrpc.getAddDepartmentToCompanyMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getAddDepartmentToCompanyMethod = CompanyServiceGrpc.getAddDepartmentToCompanyMethod) == null) {
          CompanyServiceGrpc.getAddDepartmentToCompanyMethod = getAddDepartmentToCompanyMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartment, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompanyService", "addDepartmentToCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("addDepartmentToCompany"))
                  .build();
          }
        }
     }
     return getAddDepartmentToCompanyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> getDeleteDepartmentsFromCompanyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteDepartmentsFromCompany",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> getDeleteDepartmentsFromCompanyMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> getDeleteDepartmentsFromCompanyMethod;
    if ((getDeleteDepartmentsFromCompanyMethod = CompanyServiceGrpc.getDeleteDepartmentsFromCompanyMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getDeleteDepartmentsFromCompanyMethod = CompanyServiceGrpc.getDeleteDepartmentsFromCompanyMethod) == null) {
          CompanyServiceGrpc.getDeleteDepartmentsFromCompanyMethod = getDeleteDepartmentsFromCompanyMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompanyService", "deleteDepartmentsFromCompany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("deleteDepartmentsFromCompany"))
                  .build();
          }
        }
     }
     return getDeleteDepartmentsFromCompanyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndPerson,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee> getHireEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hireEmployee",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndPerson.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndPerson,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee> getHireEmployeeMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndPerson, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee> getHireEmployeeMethod;
    if ((getHireEmployeeMethod = CompanyServiceGrpc.getHireEmployeeMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getHireEmployeeMethod = CompanyServiceGrpc.getHireEmployeeMethod) == null) {
          CompanyServiceGrpc.getHireEmployeeMethod = getHireEmployeeMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndPerson, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompanyService", "hireEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndPerson.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("hireEmployee"))
                  .build();
          }
        }
     }
     return getHireEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource> getAddEmployeeToHumanResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addEmployeeToHumanResource",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource> getAddEmployeeToHumanResourceMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource> getAddEmployeeToHumanResourceMethod;
    if ((getAddEmployeeToHumanResourceMethod = CompanyServiceGrpc.getAddEmployeeToHumanResourceMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getAddEmployeeToHumanResourceMethod = CompanyServiceGrpc.getAddEmployeeToHumanResourceMethod) == null) {
          CompanyServiceGrpc.getAddEmployeeToHumanResourceMethod = getAddEmployeeToHumanResourceMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompanyService", "addEmployeeToHumanResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("addEmployeeToHumanResource"))
                  .build();
          }
        }
     }
     return getAddEmployeeToHumanResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Department> getAddEmployeeToDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addEmployeeToDepartment",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Department.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Department> getAddEmployeeToDepartmentMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Department> getAddEmployeeToDepartmentMethod;
    if ((getAddEmployeeToDepartmentMethod = CompanyServiceGrpc.getAddEmployeeToDepartmentMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getAddEmployeeToDepartmentMethod = CompanyServiceGrpc.getAddEmployeeToDepartmentMethod) == null) {
          CompanyServiceGrpc.getAddEmployeeToDepartmentMethod = getAddEmployeeToDepartmentMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Department>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompanyService", "addEmployeeToDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Department.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("addEmployeeToDepartment"))
                  .build();
          }
        }
     }
     return getAddEmployeeToDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getDismissFromHumanResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "dismissFromHumanResource",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getDismissFromHumanResourceMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getDismissFromHumanResourceMethod;
    if ((getDismissFromHumanResourceMethod = CompanyServiceGrpc.getDismissFromHumanResourceMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getDismissFromHumanResourceMethod = CompanyServiceGrpc.getDismissFromHumanResourceMethod) == null) {
          CompanyServiceGrpc.getDismissFromHumanResourceMethod = getDismissFromHumanResourceMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompanyService", "dismissFromHumanResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("dismissFromHumanResource"))
                  .build();
          }
        }
     }
     return getDismissFromHumanResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getDismissFromDepartmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "dismissFromDepartment",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getDismissFromDepartmentMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getDismissFromDepartmentMethod;
    if ((getDismissFromDepartmentMethod = CompanyServiceGrpc.getDismissFromDepartmentMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getDismissFromDepartmentMethod = CompanyServiceGrpc.getDismissFromDepartmentMethod) == null) {
          CompanyServiceGrpc.getDismissFromDepartmentMethod = getDismissFromDepartmentMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompanyService", "dismissFromDepartment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("dismissFromDepartment"))
                  .build();
          }
        }
     }
     return getDismissFromDepartmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getDismissEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "dismissEmployee",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getDismissEmployeeMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getDismissEmployeeMethod;
    if ((getDismissEmployeeMethod = CompanyServiceGrpc.getDismissEmployeeMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getDismissEmployeeMethod = CompanyServiceGrpc.getDismissEmployeeMethod) == null) {
          CompanyServiceGrpc.getDismissEmployeeMethod = getDismissEmployeeMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompanyService", "dismissEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("dismissEmployee"))
                  .build();
          }
        }
     }
     return getDismissEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getStartProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "startProject",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getStartProjectMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getStartProjectMethod;
    if ((getStartProjectMethod = CompanyServiceGrpc.getStartProjectMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getStartProjectMethod = CompanyServiceGrpc.getStartProjectMethod) == null) {
          CompanyServiceGrpc.getStartProjectMethod = getStartProjectMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompanyService", "startProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("startProject"))
                  .build();
          }
        }
     }
     return getStartProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getSellProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sellProject",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getSellProjectMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getSellProjectMethod;
    if ((getSellProjectMethod = CompanyServiceGrpc.getSellProjectMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getSellProjectMethod = CompanyServiceGrpc.getSellProjectMethod) == null) {
          CompanyServiceGrpc.getSellProjectMethod = getSellProjectMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompanyService", "sellProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("sellProject"))
                  .build();
          }
        }
     }
     return getSellProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getFinishProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "finishProject",
      requestType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment.class,
      responseType = grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment,
      grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getFinishProjectMethod() {
    io.grpc.MethodDescriptor<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> getFinishProjectMethod;
    if ((getFinishProjectMethod = CompanyServiceGrpc.getFinishProjectMethod) == null) {
      synchronized (CompanyServiceGrpc.class) {
        if ((getFinishProjectMethod = CompanyServiceGrpc.getFinishProjectMethod) == null) {
          CompanyServiceGrpc.getFinishProjectMethod = getFinishProjectMethod = 
              io.grpc.MethodDescriptor.<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment, grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompanyService", "finishProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new CompanyServiceMethodDescriptorSupplier("finishProject"))
                  .build();
          }
        }
     }
     return getFinishProjectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CompanyServiceStub newStub(io.grpc.Channel channel) {
    return new CompanyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CompanyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CompanyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CompanyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CompanyServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CompanyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCompany(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setNameCompany request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCompanyMethod(), responseObserver);
    }

    /**
     */
    public void getCompany(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCompanyMethod(), responseObserver);
    }

    /**
     */
    public void getHumanResource(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHumanResourceMethod(), responseObserver);
    }

    /**
     */
    public void getAllDepartments(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allDepartments> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllDepartmentsMethod(), responseObserver);
    }

    /**
     */
    public void getAllProjectsOfDepartment(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allProjects> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllProjectsOfDepartmentMethod(), responseObserver);
    }

    /**
     */
    public void getAllEmployeesOfDepartment(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allEmployees> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllEmployeesOfDepartmentMethod(), responseObserver);
    }

    /**
     */
    public void addDepartmentToCompany(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartment request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> responseObserver) {
      asyncUnimplementedUnaryCall(getAddDepartmentToCompanyMethod(), responseObserver);
    }

    /**
     */
    public void deleteDepartmentsFromCompany(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteDepartmentsFromCompanyMethod(), responseObserver);
    }

    /**
     */
    public void hireEmployee(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndPerson request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee> responseObserver) {
      asyncUnimplementedUnaryCall(getHireEmployeeMethod(), responseObserver);
    }

    /**
     */
    public void addEmployeeToHumanResource(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource> responseObserver) {
      asyncUnimplementedUnaryCall(getAddEmployeeToHumanResourceMethod(), responseObserver);
    }

    /**
     */
    public void addEmployeeToDepartment(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Department> responseObserver) {
      asyncUnimplementedUnaryCall(getAddEmployeeToDepartmentMethod(), responseObserver);
    }

    /**
     */
    public void dismissFromHumanResource(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getDismissFromHumanResourceMethod(), responseObserver);
    }

    /**
     */
    public void dismissFromDepartment(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getDismissFromDepartmentMethod(), responseObserver);
    }

    /**
     */
    public void dismissEmployee(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getDismissEmployeeMethod(), responseObserver);
    }

    /**
     */
    public void startProject(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getStartProjectMethod(), responseObserver);
    }

    /**
     */
    public void sellProject(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getSellProjectMethod(), responseObserver);
    }

    /**
     */
    public void finishProject(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getFinishProjectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCompanyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setNameCompany,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company>(
                  this, METHODID_CREATE_COMPANY)))
          .addMethod(
            getGetCompanyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company>(
                  this, METHODID_GET_COMPANY)))
          .addMethod(
            getGetHumanResourceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource>(
                  this, METHODID_GET_HUMAN_RESOURCE)))
          .addMethod(
            getGetAllDepartmentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allDepartments>(
                  this, METHODID_GET_ALL_DEPARTMENTS)))
          .addMethod(
            getGetAllProjectsOfDepartmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allProjects>(
                  this, METHODID_GET_ALL_PROJECTS_OF_DEPARTMENT)))
          .addMethod(
            getGetAllEmployeesOfDepartmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allEmployees>(
                  this, METHODID_GET_ALL_EMPLOYEES_OF_DEPARTMENT)))
          .addMethod(
            getAddDepartmentToCompanyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartment,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company>(
                  this, METHODID_ADD_DEPARTMENT_TO_COMPANY)))
          .addMethod(
            getDeleteDepartmentsFromCompanyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company>(
                  this, METHODID_DELETE_DEPARTMENTS_FROM_COMPANY)))
          .addMethod(
            getHireEmployeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndPerson,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee>(
                  this, METHODID_HIRE_EMPLOYEE)))
          .addMethod(
            getAddEmployeeToHumanResourceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource>(
                  this, METHODID_ADD_EMPLOYEE_TO_HUMAN_RESOURCE)))
          .addMethod(
            getAddEmployeeToDepartmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Department>(
                  this, METHODID_ADD_EMPLOYEE_TO_DEPARTMENT)))
          .addMethod(
            getDismissFromHumanResourceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>(
                  this, METHODID_DISMISS_FROM_HUMAN_RESOURCE)))
          .addMethod(
            getDismissFromDepartmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>(
                  this, METHODID_DISMISS_FROM_DEPARTMENT)))
          .addMethod(
            getDismissEmployeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>(
                  this, METHODID_DISMISS_EMPLOYEE)))
          .addMethod(
            getStartProjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>(
                  this, METHODID_START_PROJECT)))
          .addMethod(
            getSellProjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>(
                  this, METHODID_SELL_PROJECT)))
          .addMethod(
            getFinishProjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment,
                grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>(
                  this, METHODID_FINISH_PROJECT)))
          .build();
    }
  }

  /**
   */
  public static final class CompanyServiceStub extends io.grpc.stub.AbstractStub<CompanyServiceStub> {
    private CompanyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompanyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompanyServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCompany(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setNameCompany request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCompanyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCompany(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCompanyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHumanResource(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHumanResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllDepartments(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allDepartments> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllDepartmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllProjectsOfDepartment(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allProjects> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllProjectsOfDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllEmployeesOfDepartment(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allEmployees> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllEmployeesOfDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addDepartmentToCompany(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartment request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddDepartmentToCompanyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDepartmentsFromCompany(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteDepartmentsFromCompanyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hireEmployee(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndPerson request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHireEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addEmployeeToHumanResource(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddEmployeeToHumanResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addEmployeeToDepartment(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Department> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddEmployeeToDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dismissFromHumanResource(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDismissFromHumanResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dismissFromDepartment(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDismissFromDepartmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dismissEmployee(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDismissEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startProject(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sellProject(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSellProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void finishProject(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment request,
        io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFinishProjectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CompanyServiceBlockingStub extends io.grpc.stub.AbstractStub<CompanyServiceBlockingStub> {
    private CompanyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompanyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompanyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company createCompany(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setNameCompany request) {
      return blockingUnaryCall(
          getChannel(), getCreateCompanyMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company getCompany(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId request) {
      return blockingUnaryCall(
          getChannel(), getGetCompanyMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource getHumanResource(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId request) {
      return blockingUnaryCall(
          getChannel(), getGetHumanResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allDepartments getAllDepartments(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId request) {
      return blockingUnaryCall(
          getChannel(), getGetAllDepartmentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allProjects getAllProjectsOfDepartment(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId request) {
      return blockingUnaryCall(
          getChannel(), getGetAllProjectsOfDepartmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allEmployees getAllEmployeesOfDepartment(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId request) {
      return blockingUnaryCall(
          getChannel(), getGetAllEmployeesOfDepartmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company addDepartmentToCompany(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartment request) {
      return blockingUnaryCall(
          getChannel(), getAddDepartmentToCompanyMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company deleteDepartmentsFromCompany(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteDepartmentsFromCompanyMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee hireEmployee(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndPerson request) {
      return blockingUnaryCall(
          getChannel(), getHireEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource addEmployeeToHumanResource(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId request) {
      return blockingUnaryCall(
          getChannel(), getAddEmployeeToHumanResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Department addEmployeeToDepartment(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId request) {
      return blockingUnaryCall(
          getChannel(), getAddEmployeeToDepartmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status dismissFromHumanResource(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId request) {
      return blockingUnaryCall(
          getChannel(), getDismissFromHumanResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status dismissFromDepartment(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId request) {
      return blockingUnaryCall(
          getChannel(), getDismissFromDepartmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status dismissEmployee(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee request) {
      return blockingUnaryCall(
          getChannel(), getDismissEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status startProject(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment request) {
      return blockingUnaryCall(
          getChannel(), getStartProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status sellProject(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment request) {
      return blockingUnaryCall(
          getChannel(), getSellProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status finishProject(grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment request) {
      return blockingUnaryCall(
          getChannel(), getFinishProjectMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CompanyServiceFutureStub extends io.grpc.stub.AbstractStub<CompanyServiceFutureStub> {
    private CompanyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompanyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompanyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompanyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> createCompany(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setNameCompany request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCompanyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> getCompany(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCompanyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource> getHumanResource(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHumanResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allDepartments> getAllDepartments(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllDepartmentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allProjects> getAllProjectsOfDepartment(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllProjectsOfDepartmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allEmployees> getAllEmployeesOfDepartment(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllEmployeesOfDepartmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> addDepartmentToCompany(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartment request) {
      return futureUnaryCall(
          getChannel().newCall(getAddDepartmentToCompanyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company> deleteDepartmentsFromCompany(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteDepartmentsFromCompanyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee> hireEmployee(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndPerson request) {
      return futureUnaryCall(
          getChannel().newCall(getHireEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource> addEmployeeToHumanResource(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId request) {
      return futureUnaryCall(
          getChannel().newCall(getAddEmployeeToHumanResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Department> addEmployeeToDepartment(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId request) {
      return futureUnaryCall(
          getChannel().newCall(getAddEmployeeToDepartmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> dismissFromHumanResource(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId request) {
      return futureUnaryCall(
          getChannel().newCall(getDismissFromHumanResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> dismissFromDepartment(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId request) {
      return futureUnaryCall(
          getChannel().newCall(getDismissFromDepartmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> dismissEmployee(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee request) {
      return futureUnaryCall(
          getChannel().newCall(getDismissEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> startProject(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment request) {
      return futureUnaryCall(
          getChannel().newCall(getStartProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> sellProject(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment request) {
      return futureUnaryCall(
          getChannel().newCall(getSellProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status> finishProject(
        grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment request) {
      return futureUnaryCall(
          getChannel().newCall(getFinishProjectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_COMPANY = 0;
  private static final int METHODID_GET_COMPANY = 1;
  private static final int METHODID_GET_HUMAN_RESOURCE = 2;
  private static final int METHODID_GET_ALL_DEPARTMENTS = 3;
  private static final int METHODID_GET_ALL_PROJECTS_OF_DEPARTMENT = 4;
  private static final int METHODID_GET_ALL_EMPLOYEES_OF_DEPARTMENT = 5;
  private static final int METHODID_ADD_DEPARTMENT_TO_COMPANY = 6;
  private static final int METHODID_DELETE_DEPARTMENTS_FROM_COMPANY = 7;
  private static final int METHODID_HIRE_EMPLOYEE = 8;
  private static final int METHODID_ADD_EMPLOYEE_TO_HUMAN_RESOURCE = 9;
  private static final int METHODID_ADD_EMPLOYEE_TO_DEPARTMENT = 10;
  private static final int METHODID_DISMISS_FROM_HUMAN_RESOURCE = 11;
  private static final int METHODID_DISMISS_FROM_DEPARTMENT = 12;
  private static final int METHODID_DISMISS_EMPLOYEE = 13;
  private static final int METHODID_START_PROJECT = 14;
  private static final int METHODID_SELL_PROJECT = 15;
  private static final int METHODID_FINISH_PROJECT = 16;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CompanyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CompanyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_COMPANY:
          serviceImpl.createCompany((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setNameCompany) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company>) responseObserver);
          break;
        case METHODID_GET_COMPANY:
          serviceImpl.getCompany((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company>) responseObserver);
          break;
        case METHODID_GET_HUMAN_RESOURCE:
          serviceImpl.getHumanResource((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource>) responseObserver);
          break;
        case METHODID_GET_ALL_DEPARTMENTS:
          serviceImpl.getAllDepartments((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyId) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allDepartments>) responseObserver);
          break;
        case METHODID_GET_ALL_PROJECTS_OF_DEPARTMENT:
          serviceImpl.getAllProjectsOfDepartment((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allProjects>) responseObserver);
          break;
        case METHODID_GET_ALL_EMPLOYEES_OF_DEPARTMENT:
          serviceImpl.getAllEmployeesOfDepartment((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.allEmployees>) responseObserver);
          break;
        case METHODID_ADD_DEPARTMENT_TO_COMPANY:
          serviceImpl.addDepartmentToCompany((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartment) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company>) responseObserver);
          break;
        case METHODID_DELETE_DEPARTMENTS_FROM_COMPANY:
          serviceImpl.deleteDepartmentsFromCompany((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndDepartmentId) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Company>) responseObserver);
          break;
        case METHODID_HIRE_EMPLOYEE:
          serviceImpl.hireEmployee((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndPerson) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee>) responseObserver);
          break;
        case METHODID_ADD_EMPLOYEE_TO_HUMAN_RESOURCE:
          serviceImpl.addEmployeeToHumanResource((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.HumanResource>) responseObserver);
          break;
        case METHODID_ADD_EMPLOYEE_TO_DEPARTMENT:
          serviceImpl.addEmployeeToDepartment((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Department>) responseObserver);
          break;
        case METHODID_DISMISS_FROM_HUMAN_RESOURCE:
          serviceImpl.dismissFromHumanResource((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>) responseObserver);
          break;
        case METHODID_DISMISS_FROM_DEPARTMENT:
          serviceImpl.dismissFromDepartment((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyIdAndEmployeeId) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>) responseObserver);
          break;
        case METHODID_DISMISS_EMPLOYEE:
          serviceImpl.dismissEmployee((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Employee) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>) responseObserver);
          break;
        case METHODID_START_PROJECT:
          serviceImpl.startProject((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>) responseObserver);
          break;
        case METHODID_SELL_PROJECT:
          serviceImpl.sellProject((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment) request,
              (io.grpc.stub.StreamObserver<grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.Status>) responseObserver);
          break;
        case METHODID_FINISH_PROJECT:
          serviceImpl.finishProject((grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.setCompanyAndProjectAndDepartment) request,
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

  private static abstract class CompanyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CompanyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.project.companygrpcservice.gRPC.stub.CompanyOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CompanyService");
    }
  }

  private static final class CompanyServiceFileDescriptorSupplier
      extends CompanyServiceBaseDescriptorSupplier {
    CompanyServiceFileDescriptorSupplier() {}
  }

  private static final class CompanyServiceMethodDescriptorSupplier
      extends CompanyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CompanyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CompanyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CompanyServiceFileDescriptorSupplier())
              .addMethod(getCreateCompanyMethod())
              .addMethod(getGetCompanyMethod())
              .addMethod(getGetHumanResourceMethod())
              .addMethod(getGetAllDepartmentsMethod())
              .addMethod(getGetAllProjectsOfDepartmentMethod())
              .addMethod(getGetAllEmployeesOfDepartmentMethod())
              .addMethod(getAddDepartmentToCompanyMethod())
              .addMethod(getDeleteDepartmentsFromCompanyMethod())
              .addMethod(getHireEmployeeMethod())
              .addMethod(getAddEmployeeToHumanResourceMethod())
              .addMethod(getAddEmployeeToDepartmentMethod())
              .addMethod(getDismissFromHumanResourceMethod())
              .addMethod(getDismissFromDepartmentMethod())
              .addMethod(getDismissEmployeeMethod())
              .addMethod(getStartProjectMethod())
              .addMethod(getSellProjectMethod())
              .addMethod(getFinishProjectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
