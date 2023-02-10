package com.yassineaitmalek.DesignPatterns.BehavioralPattern.Memento;

public class Originator {

  private String state;

  public Memento saveStateToMemento() {
    return new Memento(state);
  }

  public void getStateFromMemento(Memento Memento) {
    state = Memento.getState();
  }

  /**
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * @param state the state to set
   */
  public void setState(String state) {
    this.state = state;
  }

}
