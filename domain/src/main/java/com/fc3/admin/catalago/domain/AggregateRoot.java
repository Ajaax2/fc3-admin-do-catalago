package com.fc3.admin.catalago.domain;

import com.fc3.admin.catalago.domain.validation.ValidationHandler;

public abstract class AggregateRoot<ID extends Identifier> extends  Entity<ID>{
    public AggregateRoot(final ID id) {
        super(id);
    }

    @Override
    public void validate(ValidationHandler handler) {

    }
}
