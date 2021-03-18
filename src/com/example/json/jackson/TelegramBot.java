package com.example.json.jackson;


import java.sql.Date;
import java.sql.Timestamp;

public class TelegramBot {

  private long id;
  private java.sql.Timestamp datestamp;
  private Integer userid;
  private Integer sessionid;
  private String intent;
  private String codelang;
  private Integer handled;
  private Integer authorized;
  private Integer authsource;
  private String conversion;
  private String messagereceiv;
  private String messagesent;
  private Integer status;
  private java.sql.Date sysdt;

  public Date getSysdt() {
    return sysdt;
  }

  public void setSysdt(Date sysdt) {
    this.sysdt = sysdt;
  }
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

  public String getCodelang() {
    return codelang;
  }

  public void setCodeLang(String codeLang) {
    this.codelang = codeLang;
  }

  public Integer getHandled() {
    return handled;
  }

  public void setHandled(Integer handled) {
    this.handled = handled;
  }

  public Integer getAuthorized() {
    return authorized;
  }

  public void setAuthorized(Integer authorized) {
    this.authorized = authorized;
  }

  public Integer getAuthsource() {
    return authsource;
  }

  public void setAuthsource(Integer authsource) {
    this.authsource = authsource;
  }

  public String getConversion() {
    return conversion;
  }

  public void setConversion(String conversion) {
    this.conversion = conversion;
  }

  public String getMessagereceiv() {
    return messagereceiv;
  }

  public void setMessagereceiv(String messagereceiv) {
    this.messagereceiv = messagereceiv;
  }

  public String getMessagesent() {
    return messagesent;
  }

  public void setMessagesent(String messagesent) {
    this.messagesent = messagesent;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }




  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }



}
