package com.kmiller.mule.modules.javasdk.error;

import org.mule.api.annotations.Handle;
import org.mule.api.annotations.components.Handler;

@Handler
public class ErrorHandler {

    @Handle
    public void handle(Exception ex) throws Exception {
    	//TODO Process the exception
    }

}