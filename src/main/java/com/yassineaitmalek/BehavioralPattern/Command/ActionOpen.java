package com.yassineaitmalek.BehavioralPattern.Command;

public class ActionOpen implements ActionListenerCommand {

  private Document doc;

  public ActionOpen(Document doc) {
    this.doc = doc;
  }

  public void execute() {
    doc.open();
  }

}
