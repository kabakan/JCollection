package com.example.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by Kanat KB on 13.09.2017.
 */
public class JSONParseDemo {

    public static void Test1() {
        System.out.println("--------------Test01--------------");
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

    public static void Test2() {
        try {
            System.out.println("--------------Test02--------------");
            String jsonParse = "{\n" +
                    "     \"lastName\":\"Smith\",\n" +
                    "    \"address\":{\n" +
                    "        \"streetAddress\":\"21 2nd Street\",\n" +
                    "         \"city\":\"New York\",\n" +
                    "         \"state\":\"NY\",\n" +
                    "         \"postalCode\":10021\n" +
                    "    },\n" +
                    "     \"age\":25,\n" +
                    "     \"phoneNumbers\":[\n" +
                    "            {\n" +
                    "            \"type\":\"home\", \"number\":\"212 555-1234\"\n" +
                    "            },\n" +
                    "         {\n" +
                    "            \"type\":\"fax\", \"number\":\"212 555-1234\"\n" +
                    "         }\n" +
                    "     ],\n" +
                    "     \"firstName\":\"John\"\n" +
                    "}";
            // parsing file "JSONExample.json"
            //Object obj = new JSONParser().parse(new FileReader("JSONExample.json"));
            Object obj = new JSONParser().parse(jsonParse);


            // typecasting obj to JSONObject
            JSONObject jo = (JSONObject) obj;

            // getting firstName and lastName
            String firstName = (String) jo.get("firstName");
            String lastName = (String) jo.get("lastName");

            System.out.println(firstName);
            System.out.println(lastName);

            // getting age
            long age = (long) jo.get("age");
            System.out.println(age);

            // getting address
            Map address = ((Map) jo.get("address"));

            // iterating address Map
            Iterator<Map.Entry> itr1 = address.entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }

            // getting phoneNumbers
            JSONArray ja = (JSONArray) jo.get("phoneNumbers");

            // iterating phoneNumbers
            Iterator itr2 = ja.iterator();

            while (itr2.hasNext()) {
                itr1 = ((Map) itr2.next()).entrySet().iterator();
                while (itr1.hasNext()) {
                    Map.Entry pair = itr1.next();
                    System.out.println(pair.getKey() + " : " + pair.getValue());
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void Test3() {
        try {
            System.out.println("--------------Test03--------------");
            String jsonparse = "{\"clientAccount\":\"KZ959470398908714791\",\n" +
                    "\"accountData\":\n" +
                    "\t{\n" +
                    "\t\t\"row0\":{\"caption\":\"Лицевой счет\",\"val\":\"1757520\"},\n" +
                    "\t\t\"row1\":{\"caption\":\"Адрес и ФИО абонента\",\"val\":\"г.Алматы, пр. Достык д.97Б кв.191, БЕЛЬГИБАЕВ К С\"},\n" +
                    "\t\t\"row2\":{\"caption\":\"Количество проживающих\",\"val\":\"1.0\"},\n" +
                    "\t\t\"row3\":{\"caption\":\"Отапливаемая площадь\",\"val\":\"78.5\"}\n" +
                    "\t},\n" +
                    "\"invoiceList\":\n" +
                    "\t{\n" +
                    "\t\t\"invoice0\":\n" +
                    "\t\t{\n" +
                    "\t\t\t\"invoiceData\":\n" +
                    "\t\t\t{\n" +
                    "\t\t\t\t\"row0\":{\"caption\":\"Номер квитанции\",\"val\":\"\"},\n" +
                    "\t\t\t\t\"row1\":{\"caption\":\"Выставлена\",\"val\":\"\"},\n" +
                    "\t\t\t\t\"row2\":{\"caption\":\"Оплатить до\",\"val\":\"\"}\n" +
                    "\t\t\t},\n" +
                    "\t\t\t\"invoiceDetail\":\n" +
                    "\t\t\t{\n" +
                    "\t\t\t\t\"row0\":{\"serviceId\":\"13\",\"serviceName\":\" Электр. энергия\",\"minTariff\":\"16.65  тг/кВт.ч\",\"midTariff\":\"21.99  тг/кВт.ч\",\"maxTariff\":\"27.48  тг/кВт.ч\",\"prevCount\":\"308.0\",\"lastCount\":\"326.0\",\"countMin\":\"18.00\",\"countMid\":\"0.00\",\"countMax\":\"0.00\",\"debtInfo\":\" переп. 116.55\",\"fixSum\":\"183.15\",\"paySum\":\"183.15\",\"prevDate\":\"31/01/2017\",\"lastDate\":\"28/02/2017\"},\n" +
                    "\t\t\t\t\"row3\":{\"serviceId\":\"8\",\"serviceName\":\" Отопление\",\"tariff\":\"171.8  тг/м2\",\"prevCount\":\"\",\"lastCount\":\"\",\"fixCount\":\"\",\"debtInfo\":\"\",\"fixSum\":\"13486.3\",\"paySum\":\"13486.3\"},\n" +
                    "\t\t\t\t\"row4\":{\"serviceId\":\"14\",\"serviceName\":\" Гор. вода, Счётчик\",\"tariff\":\"427.77  тг/м3\",\"prevCount\":\"54.0\",\"lastCount\":\"56.0\",\"fixCount\":\"\",\"debtInfo\":\"\",\"fixSum\":\"855.54\",\"paySum\":\"855.54\"},\n" +
                    "\t\t\t\t\"row5\":{\"serviceId\":\"12\",\"serviceName\":\" Хол.вода,Счетчик\",\"tariff\":\"55.56  тг/м3\",\"prevCount\":\"70.0\",\"lastCount\":\"74.0\",\"fixCount\":\"4.000\",\"debtInfo\":\"\",\"fixSum\":\"0.0\",\"paySum\":\"222.24\"},\n" +
                    "\t\t\t\t\"row6\":{\"serviceId\":\"25\",\"serviceName\":\" К-ция хол.воды,Сч-к\",\"tariff\":\"28.8  тг/м3\",\"prevCount\":\"70.0\",\"lastCount\":\"74.0\",\"fixCount\":\"4.000\",\"debtInfo\":\"\",\"fixSum\":\"0.0\",\"paySum\":\"115.20\"},\n" +
                    "\t\t\t\t\"row7\":{\"serviceId\":\"6\",\"serviceName\":\" Кан-ция гор.воды, Сч-к\",\"tariff\":\"28.8  тг/м3\",\"prevCount\":\"56.0\",\"lastCount\":\"59.0\",\"fixCount\":\"3.000\",\"debtInfo\":\"\",\"fixSum\":\"0.0\",\"paySum\":\"86.40\"},\n" +
                    "\t\t\t\t\"row8\":{\"serviceId\":\"1\",\"serviceName\":\" Расходы на сод-ие жил.\",\"tariff\":\"126.0  тг/м2\",\"prevCount\":\"\",\"lastCount\":\"\",\"fixCount\":\"\",\"debtInfo\":\"\",\"fixSum\":\"9891.0\",\"paySum\":\"9891.0\"},\n" +
                    "\t\t\t\t\"row9\":{\"serviceId\":\"10\",\"serviceName\":\" Лифт\",\"tariff\":\"8.78  тг/м2\",\"prevCount\":\"\",\"lastCount\":\"\",\"fixCount\":\"\",\"debtInfo\":\"\",\"fixSum\":\"689.23\",\"paySum\":\"689.23\"},\n" +
                    "\t\t\t\t\"row10\":{\"serviceId\":\"76\",\"serviceName\":\" Электропитание лифтов\",\"tariff\":\"1946.0  тг/Тн\",\"prevCount\":\"\",\"lastCount\":\"\",\"fixCount\":\"\",\"debtInfo\":\"\",\"fixSum\":\"1946.0\",\"paySum\":\"1946.0\"},\n" +
                    "\t\t\t\t\"row11\":{\"serviceId\":\"11100\",\"serviceName\":\" Паркинг\",\"tariff\":\"3000.0   тг/точка\",\"prevCount\":\"\",\"lastCount\":\"\",\"fixCount\":\"\",\"debtInfo\":\"рыз/долг 204700.00\",\"fixSum\":\"207700.0\",\"paySum\":\"00.0\"},\n" +
                    "\t\t\t\t\"row12\":{\"serviceId\":\"11\",\"serviceName\":\" Вывоз ТБО\",\"tariff\":\"341.39   тг/чел\",\"prevCount\":\"\",\"lastCount\":\"\",\"fixCount\":\"\",\"debtInfo\":\"\",\"fixSum\":\"341.39\",\"paySum\":\"341.39\"},\n" +
                    "\t\t\t\t\"row13\":{\"serviceId\":\"102\",\"serviceName\":\" Служба спасения-тел.109\",\"tariff\":\"0.0  \",\"prevCount\":\"\",\"lastCount\":\"\",\"fixCount\":\"\",\"debtInfo\":\"\",\"fixSum\":\"70.0\",\"paySum\":\"70.0\"}\n" +
                    "\t\t\t},\n" +
                    "\t\t\t\"totalInvoice\":\"27886.45\"\n" +
                    "\t\t}\n" +
                    "\t}\n" +
                    "}";

            //----------itr1
            Object obj = getObj(jsonparse);
            JSONObject jo1 = (JSONObject) obj;
            for (Iterator itr1 = jo1.keySet().iterator(); itr1.hasNext(); ) {
                String key = (String) itr1.next();
                String parse = jo1.get(key).toString();
                System.out.println("key #1: " + key + " Parser: " + parse);
                if (!key.isEmpty() && !parse.isEmpty() && getStateObj(parse)) {
                    //----------itr2
                    JSONObject jo2 = (JSONObject) getObj(parse);
                    for (Iterator itr2 = jo2.keySet().iterator(); itr2.hasNext(); ) {
                        String subkey2 = (String) itr2.next();
                        String subparse2 = jo2.get(subkey2).toString();
                        System.out.println("subkey#2:  " + subkey2 + " Parser: " + subparse2);
                        if (!subkey2.isEmpty() && !subparse2.isEmpty() && getStateObj(subparse2)) {
                            //----------itr3
                            JSONObject jo3 = (JSONObject) getObj(subparse2);
                            for (Iterator itr3 = jo3.keySet().iterator(); itr3.hasNext(); ) {
                                String subkey3 = (String) itr3.next();
                                String subparse3 = jo3.get(subkey3).toString();
                                System.out.println("subkey#3:  " + subkey3 + " Parser: " + subparse3);
                                if (!subkey3.isEmpty() && !subparse3.isEmpty() && getStateObj(subparse3)) {
                                    //----------itr4
                                    JSONObject jo4 = (JSONObject) getObj(subparse3);
                                    for (Iterator itr4 = jo4.keySet().iterator(); itr4.hasNext(); ) {
                                        String subkey4 = (String) itr4.next();
                                        String subparse4 = jo4.get(subkey4).toString();
                                        System.out.println("subkey#4:  " + subkey4 + " Parser: " + subparse4);
                                        if (!subkey4.isEmpty() && !subparse4.isEmpty() && getStateObj(subparse4)) {
                                            //----------itr5
                                            JSONObject jo5 = (JSONObject) getObj(subparse4);
                                            for (Iterator itr5 = jo5.keySet().iterator(); itr5.hasNext(); ) {
                                                String subkey5 = (String) itr5.next();
                                                String subparse5 = jo5.get(subkey5).toString();
                                                System.out.println("subkey#5:  " + subkey5 + " Parser: " + subparse5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
         /*   JSONObject jo = (JSONObject) obj;

            String clientAccount = (String) jo.get("clientAccount");
            System.out.println(clientAccount);

            //------accountData------------
            System.out.println("accountData: "+jo.get("accountData"));

            Map accounData = (Map)jo.get("accountData");
            Iterator<Map.Entry> itr1 = accounData.entrySet().iterator();
            String subparse = "";

            while (itr1.hasNext()) {
               // subparse += "{"+itr1.next().toString().replace("=",":")+"},";
                subparse = itr1.next().toString();
                System.out.println(subparse);
            }
            */

            /*
            JSONObject jsonObject = new JSONObject();
            JSONObject jsonChildObject = (JSONObject)jsonObject.get("LanguageLevels");
            for (Map.Entry entry : jsonChildObject.entrySet()) {
                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            }
            */

           /* JSONObject jb = new JSONObject();
            JSONObject jsonObject = new JSONObject(jsonparse);
            JSONObject getSth = jsonObject.getJSONObject("LanguageLevels");
            Object level = getSth.get("2");

            System.out.println(level);
                  */
            //-----Array[]----------------

           /* JSONArray row = (JSONArray) jo.get("row0");
            Iterator itr2 = row.iterator();

            while (itr2.hasNext()){
              itr1 = ((Map)itr2.next()).entrySet().iterator();
                while (itr1.hasNext()) {
                   Map.Entry val = itr1.next();
                    System.out.println(val.getKey() +" : "+val.getValue());
                }
            } */


        } catch (Exception ex) {
            System.out.println("Test3() Error: " + ex.getMessage());
        }
    }

    public static boolean getStateObj(String str) {
        try {
            System.out.println("getStateObj: " + str);
            JSONObject jb = (JSONObject) getObj((String) str);
            if (!jb.isEmpty()) {
                return true;
            }
            return false;
        } catch (Exception ex) {
            return false;
        }
    }


    public static Object getObj(String str) {
        try {
            Object obj = new JSONParser().parse(str);
            return obj;
        } catch (Exception ex) {
            System.out.println("getObj Error:" + ex.getMessage());
            return null;
        }
    }

    public static void Test4() {

/*
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(jsonparse);
        JSONObject jsonObject = (JSONObject) obj;
        for(Iterator iterator = jsonObject.keySet().iterator(); iterator.hasNext();) {
            String key = (String) iterator.next();
            System.out.println(jsonObject.get(key));
        }
*/

        //  String JSON = "{\"LanguageLevels\":{\"1\":\"Pocz\\u0105tkuj\\u0105cy\",\"2\":\"\\u015arednioZaawansowany\",\"3\":\"Zaawansowany\",\"4\":\"Ekspert\"}}\n";
      /*  JSONObject jsonObject = new JSONObject(JSON);
        JSONObject getSth = jsonObject.getJSONObject("LanguageLevels");
        Object level = getSth.get("2");

        System.out.println(level); */
        // Object obj = new JSONParser().parse(JSON);
       /* JSONObject json = new JSONObject();
        JSONArray result = json.getJSONArray("results");
        JSONObject result1 = result.getJSONObject(0);
        JSONObject geometry = result1.getJSONObject("geometry");
        JSONObject locat = geometry.getJSONObject("location"); */
    }

    public static void main(String[] args) {
        Test2();
        //Test3();
        //   Test2();
    }
}
