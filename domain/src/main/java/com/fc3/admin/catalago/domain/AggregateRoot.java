package com.fc3.admin.catalago.domain;

public class AggregateRoot<ID extends Identifier> extends  Entity<ID>{
    public AggregateRoot(final ID id) {
        super(id);
    }
}
