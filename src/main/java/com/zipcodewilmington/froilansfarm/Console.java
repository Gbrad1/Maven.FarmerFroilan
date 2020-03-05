package com.zipcodewilmington.froilansfarm;
import java.io.PrintStream;


public final class Console {
    private final PrintStream output;

    public Console(PrintStream out) {
        this.output = out;
    }

    public void print(String val, Object... args) {
        output.format(val, args);
    }

    public void println(String val, Object... vals) {
        print(val + "\n", vals);
    }

    public void printlnWait(String val, Object... vals){
        printlnWaitWithTime(1000L,val,vals);
    }

    public void printlnWaitWithTime(long time, String val, Object... vals){
        println(val,vals);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
