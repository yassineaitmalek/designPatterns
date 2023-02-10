package com.yassineaitmalek.DesignPatterns.BehavioralPattern.Mediator;

public class Mediator {

  public static void main(String[] args) {

    ApnaChatRoom chat = new ApnaChatRoomImpl();
    Participant u1 = new Participant(chat);
    u1.setName("Ahmed");

    Participant u2 = new Participant(chat);
    u2.setName("Ali");

    u1.sendMsg("Hi Ali! how are you?", u2);
    u2.sendMsg("I am Fine ! You tell?", u1);

  }

}
