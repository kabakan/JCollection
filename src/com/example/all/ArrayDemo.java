package com.example.all;

import java.util.Arrays;

import static org.eclipse.jetty.util.TypeUtil.fromHexString;

public class ArrayDemo {
    public static void main(String [] args) {
        byte[] CDRIVER = "\0xba\0xd0\0xa8".getBytes();
        String cdr = new String(CDRIVER);
        for (int i=0; i < cdr.length();i++) {
            System.out.println("SDRIVER: "+cdr);
        }

        byte[] CDRIVES1
                = fromHexString("e0 4f d0 20 ea 3a 69 10 a2 d8 08 00 2b 30 30 9d");

        byte[] CDRIVES = new byte[] { (byte)0xe0, 0x4f, (byte)0xd0,
                0x20, (byte)0xea, 0x3a, 0x69, 0x10, (byte)0xa2, (byte)0xd8, 0x08, 0x00, 0x2b,
                0x30, 0x30, (byte)0x9d };
        byte[] CMYDOCS = new byte[] { (byte)0xba, (byte)0x8a, 0x0d,
                0x45, 0x25, (byte)0xad, (byte)0xd0, 0x11, (byte)0x98, (byte)0xa8, 0x08, 0x00,
                0x36, 0x1b, 0x11, 0x03 };
        byte[] IEFRAME = new byte[] { (byte)0x80, 0x53, 0x1c,
                (byte)0x87, (byte)0xa0, 0x42, 0x69, 0x10, (byte)0xa2, (byte)0xea, 0x08,
                0x00, 0x2b, 0x30, 0x30, (byte)0x9d };

        byte[] bytes = new byte[]{(byte)0xba};

        String text = new String(bytes);
        System.out.println(text);
        String DELIMETER = ".{4}TypeID";
        String[] notifs = text.split(DELIMETER);
        Arrays.copyOfRange(notifs, 0, notifs.length - 1);




    }
}
