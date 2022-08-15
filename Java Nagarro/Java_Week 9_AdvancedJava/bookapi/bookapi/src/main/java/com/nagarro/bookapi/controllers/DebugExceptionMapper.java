//package com.nagarro.bookapi.controllers;
//
//import org.apache.catalina.connector.Response;
//import org.hibernate.resource.transaction.backend.jta.internal.synchronization.ExceptionMapper;
//
//@Provider
//public class DebugExceptionMapper implements ExceptionMapper<Exception> {
//
//	    public Response toResponse(Exception exception) {
//	        exception.printStackTrace();
//	        return Response.serverError().entity(exception.getMessage()).build();
//	    } 
//}
