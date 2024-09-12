package es.davidEguaras._13_ExceptionHandling;

import java.rmi.server.ExportException;

public class ThrowingExceptions {
    public static void main(String[] args) {
        jamesGosling();
    }

    static void john() throws Exception {
        divide(10, 0);
    }

    static void david() throws Exception {
        john();
    }

    static void jamesGosling(){
        try {
            david();  // jamesGosling calls david
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by 0");
        }
        return a / b;
    }
}
