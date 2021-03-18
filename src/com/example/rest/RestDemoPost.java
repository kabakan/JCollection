package com.example.rest;

import java.net.URL;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author KPirimbayev
 */
public class RestDemoPost {
    public static String send_uss_bal(String cJson) throws MalformedURLException, IOException
    { String output1="";
        URL url = new URL("https://oberthur.wooppay.com/tariff/add");
        HttpURLConnection conn1 = (HttpURLConnection) url.openConnection();
        try{
            conn1.setRequestMethod("POST");
            conn1.setReadTimeout(180000);
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn1.getInputStream())));
            String output;
            while ((output = br.readLine()) != null) {
                output1+=output;
            }
        }
        catch (IOException e) { conn1.disconnect();
            System.err.println("Caught IOException: " + e.getMessage());
            output1=e.getMessage();
        }
        finally {conn1.disconnect();
            return output1;
        }
    }
}
