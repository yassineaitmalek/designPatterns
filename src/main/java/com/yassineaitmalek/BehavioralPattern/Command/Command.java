package com.yassineaitmalek.BehavioralPattern.Command;

public class Command {
  public static void main(String[] args) {
    Document doc = new Document();

    ActionListenerCommand clickOpen = new ActionOpen(doc);
    ActionListenerCommand clickSave = new ActionSave(doc);

    MenuOption menu = new MenuOption(clickOpen, clickSave);

    menu.clickOpen();
    menu.clickSave();
  }
}
