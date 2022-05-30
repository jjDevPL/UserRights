package com.jj.userrights.excepction;

import graphql.GraphQLError;
import graphql.GraphqlErrorBuilder;
import graphql.execution.DataFetcherExceptionHandler;
import graphql.execution.DataFetcherExceptionHandlerParameters;
import graphql.execution.DataFetcherExceptionHandlerResult;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.concurrent.CompletableFuture;
/*TODO it doesn't work*/
public class ExceptionHandler implements DataFetcherExceptionHandler {

    @Override
    public DataFetcherExceptionHandlerResult onException(DataFetcherExceptionHandlerParameters handlerParameters) {

        Throwable exception = handlerParameters.getException();

        // do something with exception

        GraphQLError error = GraphqlErrorBuilder
            .newError()
            .message(exception.getMessage())
            .build();

        return DataFetcherExceptionHandlerResult
            .newResult()
            .error(error)
            .build();
    }
}
