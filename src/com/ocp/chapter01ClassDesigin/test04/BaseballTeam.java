package com.ocp.chapter01ClassDesigin.test04;

/**
 * Created by Kanat KB on 22.07.2017.
 * B. The class compiles but has an improper equals() method.
 */
public class BaseballTeam {

    private String city, mascot;
    private int numberOfPlayers;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public boolean equals(Object obj) {
        if ( !(obj instanceof BaseballTeam))
            return false;
        BaseballTeam other = (BaseballTeam) obj;
        return (city.equals(other.city) && mascot.equals(other.mascot));
    }
    public int hashCode() {
        return numberOfPlayers;
    }
// imagine getters and setters are here
}
class Test {
    public static void main(String[] args) {
        BaseballTeam bt = new BaseballTeam();
      /*  if ( bt.equals(bt) ) {
            System.out.print("Success "+bt.hashCode());
        } else {
            System.out.print("Failure "+bt.hashCode());
        } */
    }
}
