package com.yassineaitmalek.BehavioralPattern.ChainOfResponsibility;

public class ConsoleLogger extends Logger {

  public ConsoleLogger(int levels) {
    this.levels = levels;
  }

  @Override
  protected void displayLogInfo(String msg) {
    System.out.println("CONSOLE LOGGER INFO : " + msg);
  }
}