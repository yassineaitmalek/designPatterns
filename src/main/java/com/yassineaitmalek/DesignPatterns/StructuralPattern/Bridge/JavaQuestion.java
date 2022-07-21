package com.yassineaitmalek.DesignPatterns.StructuralPattern.Bridge;

import java.util.ArrayList;
import java.util.List;

public class JavaQuestion implements Question {

  private List<String> questions;

  private int current = 0;

  public JavaQuestion() {
    init();
  }

  private void init() {
    questions = new ArrayList<String>();
    questions.add("What is class? ");
    questions.add("What is interface? ");
    questions.add("What is abstraction? ");
    questions.add("How multiple polymorphism is achieved in java? ");
    questions.add("How many types of exception  handling are there in java? ");
    questions.add("Define the keyword final for  variable, method, and class in java? ");
    questions.add("What is abstract class? ");
    questions.add("What is multi-threading? ");

  }

  public void nextQuestion() {
    if (current <= questions.size() - 1)
      current++;
    System.out.print(current);
  }

  public void previousQuestion() {
    if (current > 0)
      current--;
  }

  public void newQuestion(String quest) {
    questions.add(quest);
  }

  public void deleteQuestion(String quest) {
    questions.remove(quest);
  }

  public void displayQuestion() {
    System.out.println(questions.get(current));
  }

  public void displayAllQuestions() {
    for (String quest : questions) {
      System.out.println(quest);
    }
  }
}
