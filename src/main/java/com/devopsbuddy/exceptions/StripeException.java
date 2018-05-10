package com.devopsbuddy.exceptions;

/**
 * Created by r.jain
 */
public class StripeException extends RuntimeException {

    public StripeException(Throwable e) {
        super(e);
    }

}
