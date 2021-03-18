package com.example.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Kanat KB on 25.08.2017.
 */
public class ListExample {


    public static void getList() {
        //sample CSV strings...pretend they came from a file
        String[] csvStrings = new String[]{
                "abc,def,ghi,jkl,mno",
                "pqr,stu,vwx,yz",
                "123,345,678,90"
        };

        List<List<String>> csvList = new ArrayList<List<String>>();

        //pretend you're looping through lines in a file here
        for (String line : csvStrings) {
            String[] linePieces = line.split(",");

            List<String> csvPieces = new ArrayList<String>(linePieces.length);

            for (String piece : linePieces) {
                csvPieces.add(piece);
            }
            csvList.add(csvPieces);
        }

        //write the CSV back out to the console
        for (List<String> csv : csvList) {
            //dumb logic to place the commas correctly
            if (!csv.isEmpty()) {
                System.out.print(csv.get(0));
                for (int i = 1; i < csv.size(); i++) {
                    System.out.print("," + csv.get(i));
                }
            }
            System.out.print("\n");
        }
    }

    public static String getToken(String val) {
        StringTokenizer token = new StringTokenizer(val, ",", true);
        String result = "False";
        while (token.hasMoreTokens()) {
            if ("cherry".equals(token.nextToken())) {
                result = val.replace("cherry", "anything");
                return result;
            }
        }
        return result;
    }

    public static int getListFinish(List<List<String>> codeList, List<String> priceList) {
        for (String price : priceList) {
            System.out.println("priceList : " + price + " getToken : " + getToken(price));
            for (List<String> code : codeList) {
                if (!code.isEmpty()) {
                    for (int i = 0; i < code.size(); i++) {
                        System.out.println("codeList : " + code.get(i));
                        if (price.equals(code.get(i)) || getToken(price).equals(code.get(i))) {
                            System.out.println("Result : " + price + " = " + code.get(i));
                            return 1;
                        }
                    }
                }
            }
        }
        System.out.println("No result !");
        return 0;
    }

    public static void main(final String[] args) {
        // getList();
        List<List<String>> codeList = new ArrayList<>();
        List<String> priceList = new ArrayList<>();

        String[] codeArray = new String[]{"cocos,banana", "apple,apple", "banana,anything,banana"};

        priceList.add("cocos,banana");
        priceList.add("cherry,cocos");
        priceList.add("banana,cherry,banana");
        priceList.add("apple,apple");

        List<String> subCode = new ArrayList<>();

        for (String code : codeArray) {
            subCode.add(code);
        }
        codeList.add(subCode);

        int Finish = getListFinish(codeList, priceList);

        System.out.println("Finish = " + Finish);
    }

}


