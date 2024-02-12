package app;

import app.ExceptionHadler.ExceptionsHadler;
import app.ExceptionProvider.ExceptionsProvider;

public class Exceptions {

    public static void main(String[] args) {

        ExceptionsProvider provider = new ExceptionsProvider();
        String height = provider.getHeight();
        ExceptionsHadler hadler = new ExceptionsHadler();
        getOUtPut(hadler.HandleException(height));
        getOUtPut("Some code.");
    }

    private static void getOUtPut(String output) {
        System.out.println(output);
    }
}
