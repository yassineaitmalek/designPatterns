package com.yassineaitmalek.DesignPatterns.BehavioralPattern.Mediator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ApnaChatRoomImpl implements ApnaChatRoom {

  public void showMsg(String msg, Participant p) {

    DateFormat dateFormat = new SimpleDateFormat("E dd-MM-yyyy hh:mm a");
    Date date = new Date();
    System.out.println(p.getName() + "'gets message: " + msg);
    System.out.println("\t\t\t\t" + "[" + dateFormat.format(date).toString() + "]");
  }
}