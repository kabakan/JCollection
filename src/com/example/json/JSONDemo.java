package com.example.json;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 * Created by Kanat KB on 13.09.2017.
 */
public class JSONDemo {

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";

        try {
            Object obj = parser.parse(s);
            JSONArray array = (JSONArray) obj;

            System.out.println("The 2nd element of array");
            System.out.println(array.get(1));
            System.out.println();

            JSONObject obj2 = (JSONObject) array.get(1);
            System.out.println("Field \"1\"");
            System.out.println(obj2.get("1"));

            s = "{}";
            obj = parser.parse(s);
            System.out.println(obj);

            s = "[5,]";
            obj = parser.parse(s);
            System.out.println(obj);

            s = "[5,,2]";
            obj = parser.parse(s);
            System.out.println(obj);
        } catch (ParseException pe) {

            System.out.println("position: " + pe.getPosition());
            System.out.println(pe);
        }
    }

    public JSONObject keyboardFunction(){
        JSONObject json1 = new JSONObject();
        json1.put("Type","keyboard");
        json1.put("DefaultHeight",true);
        JSONObject json2 = new JSONObject();
        json2.put("ActionType","reply");
        json2.put("ActionBody","reply to me");
        json2.put("Text","Key text");
        json2.put("TextSize","regular");
        JSONArray buttonarry = new JSONArray();
        buttonarry.put(json2);
        json1.put("Buttons", buttonarry);
        JSONObject json = new JSONObject();
        json.put("reciever", "Evwd+SELc8VAFfdIItEIrg==");
        json.put("type","text");
        json.put("text","Hello world");
        json.put("keyboard", json1);


        return json;
    }
}
