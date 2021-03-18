package com.example.all;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer report = new StringBuffer();
        report.append("<s>"+"1"+"</s>");
        report.append("<s>"+"2"+"</s>");
        report.append("<s>"+"3"+"</s>");
        report.append("<s>"+"4"+"</s>");
        System.out.println(report.toString());
        String ctn = "87775554433";
        String msisdn  = ctn.length() < 11 ? ctn : ctn.substring(1,11);
        System.out.println("msisdn : "+msisdn+" ctn: "+ctn.length());

        String text = "123456789";
        System.out.println("text= "+text.substring(0,8));

    }
}
