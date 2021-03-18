package com.example.regex;

import java.math.BigDecimal;
import java.util.regex.*;

/**
 * Created by Kanat KB on 26.10.2017.
 */
public class RegexDemo {

    public static BigDecimal getBigDecimal(String value) {
        try {
            String result = getRegFloats(value);
            if (result.isEmpty()) {result = "0";}
            BigDecimal dec = new BigDecimal(result);
            float f = dec.compareTo(new BigDecimal(0));
            if (f == 0) {
                dec = new BigDecimal(value.replaceAll("[^0-9]",""));
            }
            return dec;
        } catch (Exception ex) {
             System.out.println("getBigDecimal Error: "+ex.getMessage()+" value:"+value);
            //ex.printStackTrace();
            return new BigDecimal(0);
        }
    }


    public static String getRegFloats(String value) {
        try {
            Pattern p = Pattern.compile("\\d+\\.\\d+"); // 111.11 find
            Matcher m = p.matcher(value);
            String result ="";
            while (m.find()) {
                result = value.substring(m.start(), m.end());
              //  System.out.println("getRegFloats value: " + value.substring(m.start(), m.end()));
            }
            return result;
        } catch (Exception ex) {
            System.out.println("getRegFloats error: "+ex.getMessage());
            return "0";
        }
    }

    public static String getReplace(String text, String value) {
        try {
            System.out.println("text: "+text+" value: "+value);
            String reuslt = text.replace(value,"");
            return reuslt;
        } catch (Exception ex) {
            System.out.println("getReplace Error: " + ex.getMessage());
            return "";
        }
    }

    public static void main(String args[]) {
        String text = " 4All xx5 ";
        System.out.println("Result|"+text.replaceAll("^\\s+|\\s+$", "")+"|"); //alternative trim()
        System.out.println("Result|"+text.replaceAll("^(\\s*)|(\\s*)$", "")+"|");

        text = "<SOCS><SOC>BB2ALLFMC </SOC><SOC>ANTFMP_N </SOC><SOC>BB_4NALL1</SOC><SOC>GPRSPACK </SOC><SOC>GPRS_D   </SOC><SOC>GPRS_D1  </SOC><SOC>ICLM_CDR </SOC><SOC>ICLM_RUS </SOC><SOC>IIN      </SOC><SOC>KING4G_3 </SOC><SOC>B_4FMC2A    </SOC><SOC>MFS      </SOC><SOC>NOTIF_ON </SOC><SOC>NTFMP_N  </SOC><SOC>PPD      </SOC><SOC>REN_3_1  </SOC><SOC>VMS_3    </SOC></SOCS> ";
        System.out.println("Result: |"+text.matches("^\\s*(.*)(BB2ALLFMC|BB3AFMC21|BB3AFMC22|BB3AFMC23|BB_4FMC1|BB_4FMC2|BB_4FMC2A|BB_4FMC3|BB_4FMC4|BB_4FMC5)(.*?)\\s*$"));


        String line = "This order was placed for QT3000! OK?";
        System.out.println(line.replaceAll("(.*)(\\d+)(.*)",""));
       // getRegFloats(text);

        /*
        String value ="26.61 тг/м2";
        value = "т.төл./переп. 5624.84 sss/ss4";
        value = "11102 ss 0";
        System.out.println("getBigDecimal: "+getBigDecimal(value));
        System.out.println("getRegFloats(value): "+getRegFloats(value));
        System.out.println("getReplace: "+getReplace(value,getRegFloats(value)));
       */

     //   System.out.println(text.replaceAll("[^0-9,.]",""));
      //  System.out.println(text.replaceAll("[^\\d{,}\\d]",""));
       // System.out.println(value.replaceAll("[^\\d+\\.\\d+]",""));

       // System.out.println(text.replaceAll("[+-]?([0-9]*[.])?[0-9]+",""));



       // System.out.println(value.replaceAll("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.","")); */


        // getRegexReplace();
       // System.out.println(getReplace("200.25 FФтнг /кВт.ч"));

        /*System.out.println("Cool check:");

        System.out.println(checkWithRegExp("_@BEST"));
        System.out.println(checkWithRegExp("vovan"));
        System.out.println(checkWithRegExp("vo"));
        System.out.println(checkWithRegExp("Z@OZA"));

        System.out.println("\nDumb check:");

        System.out.println(dumbCheck("_@BEST"));
        System.out.println(dumbCheck("vovan"));
        System.out.println(dumbCheck("vo"));
        System.out.println(dumbCheck("Z@OZA")); */
      //  getRegex();
        System.out.println(dumbCheck("tuv"));

    }



    public static void getRegexReplace(){
        String pattern = "[a-z]+";
        String text = "200.25 FФтнг /кВт.ч";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        System.out.println(text.replaceAll("[a-z,а-я,A-Z,А-Я]",""));
        System.out.println(text.replaceAll("[^0-9,.]",""));
        System.out.println(text.replaceAll("[0-9,.]",""));
    }

    public static void getRegex(){
        String pattern = "[a-z]+";
        String text = "code 2 learn java tutorial";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while(m.find()) {
            System.out.print(text.substring(m.start(), m.end()) + "*");
        }
    }

    public static boolean checkWithRegExp(String userNameString){
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }

    public static boolean dumbCheck(String userNameString){

        char[] symbols = userNameString.toCharArray();
        //if(symbols.length < 3 || symbols.length > 15 ) return false;

        String validationString = "abcdefghijklmnopqrstuvwxyz0123456789_";

        for(char c : symbols){
            if(validationString.indexOf(c)==-1) return false;
        }
        return true;
    }


}
