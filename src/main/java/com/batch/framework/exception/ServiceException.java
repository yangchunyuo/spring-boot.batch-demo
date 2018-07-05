package com.batch.framework.exception;

import lombok.Data;

/**
 * 业务异常
 */
@Data
public class ServiceException extends RuntimeException{

	private String message;

    private Exception e;

    public ServiceException(String message) {
        super(message);
        this.setMessage(message);
    }
    
}
