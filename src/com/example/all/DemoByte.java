package com.example.all;

import org.apache.logging.log4j.message.StringFormattedMessage;

import java.util.Arrays;

public class DemoByte {

    private static String asciiToHex(String asciiStr) {
        char[] chars = asciiStr.toCharArray();
        StringBuilder hex = new StringBuilder();
        for (char ch : chars) {
            hex.append(Integer.toHexString((int) ch));
        }

        return hex.toString();
    }

    public static void main(String[] args) {
        // create 2 Byte objects b1, b2
        System.out.println("asciiToHex = "+asciiToHex("1")+" : "+asciiToHex("Z"));
        /*
        byte[] BufferSend = new byte[23];
        byte[] BufferResponse= new byte[23];
        byte[] b1 = "12345678901234567890".getBytes();
        byte b2 = Byte.valueOf("0");
        byte b3 = (byte) 0x01+0x02;
        System.out.println("b3= "+b3);
        BufferResponse[1] = b2;

        String str = "PANKAJ";
        byte[] byteArr = str.getBytes();
        String strArray = new String(byteArr);
        // print the byte[] elements
        System.out.println("String to byte array: " + Arrays.toString(byteArr));
        System.out.println("strArray: "+strArray);


        byte[] byteArray = { 'P', '1', '1', 'K', 'A', 'J' };
        byte[] byteArray1 = { 80, 65, 78, 75, 65, 74 };

        String str1 = new String(byteArray);
        String str2 = new String(byteArray1);

        System.out.println(str1);
        System.out.println(str2);

        System.out.println("Start !");
        byte[] byteArray3 = {1, Byte.parseByte("1"), Byte.parseByte("1"), 4, 2, 1, 1, 1, 1};
        System.out.println("byteArray3 "+new String(byteArray3));

        BufferSend[0] = 0x01;
        BufferSend[1] = '0';
        BufferSend[2] = '1';
        BufferSend[3] = '4';
        BufferSend[4] = 0x02;
// Price
        BufferSend[5] = '0';
        BufferSend[6] = '0';
        BufferSend[7] = '0';
        BufferSend[8] = '0';
        BufferSend[9] = '0';
        BufferSend[10] = '0';
//Volume
        BufferSend[11] = '0';
        BufferSend[12] = '0';
        BufferSend[13] = '0';
        BufferSend[14] = '0';
        BufferSend[15] = '0';
        BufferSend[16] = '0';
//Status
        BufferSend[17] = '0'; //error
        BufferSend[18] = '0';
        BufferSend[19] = '0'; //code
        BufferSend[20] = '0';
        BufferSend[21] = 0x03;  //ETX
        BufferSend[22] = 0x04;   //CRC
        String strBuff = new String(BufferSend);
        System.out.println("BufferSend: "+BufferSend.toString()+" strBuff = "+strBuff);
        //sendTest1();
        */

    }

    public static void sendTest1() {
        byte value = 2;
        System.out.println("value = "+value);
        byte shortByteValue = 0b10; // 2
        System.out.println(shortByteValue);
        // Начиная с JDK7 мы можем разделять литералы подчёркиваниями
        byte minByteValue = (byte) 0B1000_0000; // -128
        byte maxByteValue = (byte) 0b0111_1111; // 127
        byte minusByteValue = (byte) 0b1111_1111; // -128 + 127
        System.out.println(minusByteValue);
        System.out.println(minByteValue + " to " + maxByteValue);
    }


}
