package com.fc3.admin.catalogo.application;

import com.fc3.admin.catalago.domain.category.Category;

public class UseCase {
    public Category execute() {
        return Category.newCategory("teste","teste", true);
    }
}