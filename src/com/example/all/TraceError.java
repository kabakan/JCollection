package com.example.all;
import java.io.*;
public class TraceError {

    public static void main (String[] args){
        Exception e = new Exception();
        StringWriter sw = new StringWriter();
        e.printStackTrace(new java.io.PrintWriter(sw));
        String trace = sw.getBuffer().toString();
    }
}
