package com.example.all;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String [] args) {
        try {
          String s1 = new String("test");
          Object s2 = new String("test");

          if (s1.equals(s2)) {
              System.out.println("true");
          } else {
              System.out.println("false");
          }
        } catch (Exception ex){
            System.out.println("Error "+ex.getMessage());
        }
    }

    public void getByte() {
        try {
            byte[] bytes = new byte[]{(byte) 0xba};
            String sb = new String(bytes);
            char ch ;
            String s = "";
            String sByte = "sss�";

            for (int i=0; i<sByte.length();i++) {
                ch = sByte.charAt(i);
                System.out.println("charAt(i) "+ch+" : "+String.valueOf(ch));
                if ("�".equals(String.valueOf(ch))) {
                    System.out.println("Result "+sByte.charAt(i));
                }
            }
            //stringToHex("sss�");
            //toByte();
            //testDemo();
        } catch (Exception ex){
            System.out.println("Error "+ex.getMessage());
        }
    }

    public static void StringFormat() {
        try {
            String sByte = "sss�";
            String sHex = String.format("%x", new BigInteger(1, sByte.getBytes("0xba")));
            System.out.println("sHex : " + sByte.getBytes());
        } catch (Exception ex){
            System.out.println("Error "+ex.getMessage());
        }
    }

    public static void toByte() {
        String str = "�";
        byte[] val = new byte[str.length() / 2];
        for (int i = 0; i < val.length; i++) {
            int index = i * 2;
            int j = Integer.parseInt(str.substring(index, index + 2), 16);
            val[i] = (byte) j;
        }
        System.out.println(val);
    }

    public static void testDemo() {
        try {
            byte[] bytes = new byte[]{(byte) 0xba};
            String sb = new String(bytes);
            char ch ;
            byte[] b = bytes;
            if (bytes.equals(b)) {
                System.out.println("str " + new String(b));
            }

            String sByte = "�";
            //String sHex = String.format("%x", new BigInteger(1, sByte.getBytes("�")));
            System.out.println("sHex : "+sByte.getBytes());
            for (int i=0; i<sByte.length();i++) {
                ch = sByte.charAt(i);
                System.out.println("charAt(i) "+(byte)ch);
                if (sb.equals((byte)ch)) {
                    System.out.println("Result "+sByte.charAt(i));
                }
            }
             /*
            String DELIMETER = ".{4}TypeID";
            String text = new String(new byte[]{(byte) 0xba});
            String[] notifs = text.split(DELIMETER);
            Stream.of(Arrays.copyOfRange(notifs, 0, notifs.length - 1)).parallel()
                    .map(n -> n.startsWith("TypeID") ? n : "TypeID" + n)
                    .forEach(notif -> {
                        System.out.println("stream");
                    });
                    */
        } catch (Exception ex) {
            System.out.println("Error "+ex.getMessage());
        }
    }

    public static String stringToHex(String string) {
        StringBuilder buf = new StringBuilder(200);
        for (char ch: string.toCharArray()) {
            if (buf.length() > 0)
                buf.append(' ');
            buf.append(String.format("%04x", (int) ch));
        }
        return buf.toString();
    }
}
