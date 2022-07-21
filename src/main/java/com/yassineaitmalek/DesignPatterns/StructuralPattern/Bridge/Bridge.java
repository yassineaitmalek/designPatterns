package com.yassineaitmalek.DesignPatterns.StructuralPattern.Bridge;

public class Bridge {

  public static void main(String args[]) {

    QuestionFormat questions = new QuestionFormat("Java Programming Language");
    questions.setQ(new JavaQuestion());
    questions.delete("what is class?");
    questions.display();
    questions.newOne("What is inheritance? ");

    questions.newOne("How many types of inheritance are there in java?");
    questions.displayAll();
  }

}
