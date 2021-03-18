package com.example.json.jackson;

import static junit.framework.Assert.assertEquals;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.util.List;

public class DemoJackson {
  public static void convertArray() throws JsonParseException, JsonMappingException,
      IOException {
    String jsonString = "[ { \"datestamp\":\"2018-05-23T08:39:27.292102\",\n"
        + "      \"userid\":210,\n"
        + "      \"sessionid\":301,\n"
        + "      \"intent\":\"head_menu\"},\n"
        + "{\"datestamp\":\"2018-05-23T08:39:27.292102\",\n"
        + "      \"userid\":211,\n"
        + "      \"sessionid\":302,\n"
        + "      \"intent\":\"head_menu\"\n"
        + "\t  }]";


    try {
      ObjectMapper mapper = new ObjectMapper();
      JsonFactory f = new JsonFactory();
      List<TelegramTest> lstTest = null;
      TypeReference<List<TelegramTest>> tRef = new TypeReference<List<TelegramTest>>() {};
      lstTest = mapper.readValue(jsonString, tRef);
      for (TelegramTest obj : lstTest) {
        System.out.println("Test: "+obj.getIntent()+" "+obj.getSessionid());
      }

    } catch (JsonGenerationException e) {
      e.printStackTrace();
    } catch (JsonMappingException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  public static void convert() throws JsonParseException, JsonMappingException,
      IOException {
    String jsonString = "[{\n"
        + "    \"id\" : 100,\n"
        + "    \"stuff\" : \"things\",\n"
        + "\t\"datestamp\":\"2018-05-23T08:39:27.292102\",\n"
        + "\t\"sysdt\":\"2018-05-23\"\n"
        + "},\n"
        + "{\n"
        + "    \"id\" : 200,\n"
        + "    \"stuff\" : \"eggs\",\n"
        + "\t\"datestamp\":\"2018-05-23T08:39:27.292102\",\n"
        + "\t\"sysdt\":\"2018-05-23\"\n"
        + "}]";


    try {
      ObjectMapper mapper = new ObjectMapper();
      JsonFactory f = new JsonFactory();
      List<User> lstUser = null;
      TypeReference<List<User>> tRef = new TypeReference<List<User>>() {};
      lstUser = mapper.readValue(jsonString, tRef);
      for (User user : lstUser) {
        System.out.println("User: "+user.getId()+" "+user.getStuff()+" "+user.getDatestamp());
      }

    } catch (JsonGenerationException e) {
      e.printStackTrace();
    } catch (JsonMappingException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void convertList() throws JsonParseException, JsonMappingException,
      IOException {


    String jsonString = "[{\"datestamp\":\"2018-05-23T08:39:27.292102Z\",\"userid\":210,\"sessionid\":301,\"intent\":\"head_menu\",\"codelang\":\"RU\",\"handled\":1,\"authorized\":1,\"authsource\":1,\"conversion\":\"payment\",\"messagereceiv\":\"{0}\",\"messagesent\":\"{1}\",\"status\":1,\"sysdt\":\"2018-05-23\"},{\"datestamp\":\"2018-05-23T08:39:27.292102Z\",\"userid\":211,\"sessionid\":302,\"intent\":\"head_menu\",\"codelang\":\"RU\",\"handled\":1,\"authorized\":1,\"authsource\":1,\"conversion\":\"tariff\",\"messagereceiv\":\"{0}\",\"messagesent\":\"{1}\",\"status\":1,\"sysdt\":\"2018-05-23\"},{\"datestamp\":\"2018-05-23T08:39:28.269634Z\",\"userid\":210,\"sessionid\":301,\"intent\":\"head_menu\",\"codelang\":\"RU\",\"handled\":1,\"authorized\":1,\"authsource\":1,\"conversion\":\"payment\",\"messagereceiv\":\"{0}\",\"messagesent\":\"{1}\",\"status\":1,\"sysdt\":\"2018-05-23\"},{\"datestamp\":\"2018-05-23T08:39:28.269634Z\",\"userid\":211,\"sessionid\":302,\"intent\":\"head_menu\",\"codelang\":\"RU\",\"handled\":1,\"authorized\":1,\"authsource\":1,\"conversion\":\"tariff\",\"messagereceiv\":\"{0}\",\"messagesent\":\"{1}\",\"status\":1,\"sysdt\":\"2018-05-23\"},{\"datestamp\":\"2018-05-23T08:39:29.013089Z\",\"userid\":210,\"sessionid\":301,\"intent\":\"head_menu\",\"codelang\":\"RU\",\"handled\":1,\"authorized\":1,\"authsource\":1,\"conversion\":\"payment\",\"messagereceiv\":\"{0}\",\"messagesent\":\"{1}\",\"status\":1,\"sysdt\":\"2018-05-23\"},{\"datestamp\":\"2018-05-23T08:39:29.013089Z\",\"userid\":211,\"sessionid\":302,\"intent\":\"head_menu\",\"codelang\":\"RU\",\"handled\":1,\"authorized\":1,\"authsource\":1,\"conversion\":\"tariff\",\"messagereceiv\":\"{0}\",\"messagesent\":\"{1}\",\"status\":1,\"sysdt\":\"2018-05-23\"}]";
    try {
      ObjectMapper mapper = new ObjectMapper();
      JsonFactory f = new JsonFactory();
      List<TelegramBot> lstBot = null;
      TypeReference<List<TelegramBot>> tRef = new TypeReference<List<TelegramBot>>() {};
      lstBot = mapper.readValue(jsonString, tRef);
      for (TelegramBot bot : lstBot) {
        System.out.println("Bot: "+bot.getId()+" "+bot.getIntent()+" "+bot.getCodelang()+" "+bot.getSysdt());
      }

    } catch (JsonGenerationException e) {
      e.printStackTrace();
    } catch (JsonMappingException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) throws IOException {
    //convertArray();
   // convert();
    convertList();
  }

}
