package com.fc3.admin.catalogo.infrastructure;

import com.fc3.admin.catalogo.application.UseCase;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(new UseCase().execute());
    }
}