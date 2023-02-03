package com.fc3.admin.catalago.domain.exceptions;

public class NoStackTraceException extends RuntimeException {


    public NoStackTraceException(final String massage) {
    this(massage, null);
}

public NoStackTraceException(final String massage, final Throwable cause) {
    super(massage, cause, true, false);
}

}
