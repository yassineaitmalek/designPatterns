package com.yassineaitmalek.DesignPatterns.BehavioralPattern.Mediator;

public class Participant {

  private String name;

  private ApnaChatRoom chat;

  /**
   * @param chat
   */
  public Participant(ApnaChatRoom chat) {
    this.chat = chat;
  }

  public void sendMsg(String msg, Participant participant) {
    chat.showMsg(msg, participant);

  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the chat
   */
  public ApnaChatRoom getChat() {
    return chat;
  }

  /**
   * @param chat the chat to set
   */
  public void setChat(ApnaChatRoom chat) {
    this.chat = chat;
  }

}
