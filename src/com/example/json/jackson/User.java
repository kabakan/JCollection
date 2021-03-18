package com.example.json.jackson;

import java.sql.Date;
import java.sql.Timestamp;

public class User {

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Timestamp getDatestamp() {
    return datestamp;
  }

  public void setDatestamp(Timestamp datestamp) {
    this.datestamp = datestamp;
  }

  public String getStuff() {
    return stuff;
  }

  public void setStuff(String stuff) {
    this.stuff = stuff;
  }

  private long id;
  private String stuff;
  private java.sql.Timestamp datestamp;

  public Date getSysdt() {
    return sysdt;
  }

  public void setSysdt(Date sysdt) {
    this.sysdt = sysdt;
  }

  private java.sql.Date  sysdt;
  public User() {}



}
