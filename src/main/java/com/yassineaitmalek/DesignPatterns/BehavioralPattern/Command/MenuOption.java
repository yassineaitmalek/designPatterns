package com.yassineaitmalek.DesignPatterns.BehavioralPattern.Command;

public class MenuOption {

  private ActionListenerCommand openCommand;

  private ActionListenerCommand saveCommand;

  public MenuOption(ActionListenerCommand open, ActionListenerCommand save) {
    this.openCommand = open;
    this.saveCommand = save;
  }

  public void clickOpen() {
    openCommand.execute();
  }

  public void clickSave() {
    saveCommand.execute();
  }

}
