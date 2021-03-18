package com.example.enums;

enum DemoEnums {
  NOT_AUTHORIZED("not_authorized X1"),
  VERIFICATION_PENDING("verification_pending X2"),
  AUTHORIZED("authorized X3");

  private String statusCode;

  DemoEnums(String statusCode){
    this.statusCode = statusCode;
  }

  public static DemoEnums get(String status){
    switch (status){
      case "X1":
        return NOT_AUTHORIZED;
      case "X2":
        return VERIFICATION_PENDING;
      case "X3":
        return AUTHORIZED;
      default:
        return null;
    }
  }


  @Override
  public String toString(){
    return statusCode;
  }
}
