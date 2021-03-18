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
public class RestDemoGet {
    public static String send_uss_bal(long msisdn,String soc,String balname,int balvalue,int balduration) throws MalformedURLException, IOException
    { String output1="";
        URL url = new URL("http://sdfjsdjfsdkfj:8280/uss/v1/add-soc-bal-mod?msisdn="+msisdn+"&soc="+soc+"&bal-name="+balname+"&bal-value="+balvalue+"&bal-duration="+balduration);
        HttpURLConnection conn1 = (HttpURLConnection) url.openConnection();
        try{
            conn1.setRequestMethod("GET");
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