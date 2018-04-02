package com.jmdiaz.course.catalog.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class CustomInvalidParametersMapper implements ExceptionMapper<InvalidParametersException> {

    @Override
    public Response toResponse(InvalidParametersException ex) {
        MessageError message = new MessageError();
        message.setHttpError(ex.getHttpError());
        message.setMessage(ex.getMessage());
        return Response.status(ex.getHttpError()).entity(message).type(MediaType.APPLICATION_JSON).build();
    }
}