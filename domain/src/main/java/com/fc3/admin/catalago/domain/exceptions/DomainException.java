package com.fc3.admin.catalago.domain.exceptions;

import com.fc3.admin.catalago.domain.validation.Error;

import java.util.List;

public class DomainException extends NoStackTraceException {

    private final List<Error> errors;

    private DomainException(final String aMassage, final List<Error> anErrors){
        super(aMassage);
        this.errors = anErrors;
    }

    public static DomainException with(final Error anErrors){
        return new DomainException(anErrors.massage(),List.of(anErrors));
    }

    public static DomainException with(final List<Error> anErrors){
        return new DomainException("",anErrors);
    }

    public List<Error> getErrors(){
        return errors;
    }
}
