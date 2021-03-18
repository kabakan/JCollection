package com.example.json.jackson;


import java.sql.Date;
import java.sql.Timestamp;

public class TelegramTest {
  //private long id;
  private Timestamp datestamp;

  public Timestamp getDatestamp() {
    return datestamp;
  }

  public void setDatestamp(Timestamp datestamp) {
    this.datestamp = datestamp;
  }

  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }

  public Integer getSessionid() {
    return sessionid;
  }

  public void setSessionid(Integer sessionid) {
    this.sessionid = sessionid;
  }

  public String getIntent() {
    return intent;
  }

  public void setIntent(String intent) {
    this.intent = intent;
  }

  private Integer userid;
  private Integer sessionid;
  private String intent;






/*
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
*/


}
