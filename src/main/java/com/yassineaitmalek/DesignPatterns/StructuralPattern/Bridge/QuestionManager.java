package com.yassineaitmalek.DesignPatterns.StructuralPattern.Bridge;

public class QuestionManager {

  private Question q;

  public String catalog;

  public QuestionManager(String catalog) {
    this.catalog = catalog;
  }

  public void next() {
    q.nextQuestion();
  }

  public void previous() {
    q.previousQuestion();
  }

  public void newOne(String quest) {
    q.newQuestion(quest);
  }

  public void delete(String quest) {
    q.deleteQuestion(quest);
  }

  public void display() {
    q.displayQuestion();
  }

  public void displayAll() {
    System.out.println("Question Paper: " + catalog);
    q.displayAllQuestions();
  }

  /**
   * @return the q
   */
  public Question getQ() {
    return q;
  }

  /**
   * @param q the q to set
   */
  public void setQ(Question q) {
    this.q = q;
  }

  /**
   * @return the catalog
   */
  public String getCatalog() {
    return catalog;
  }

  /**
   * @param catalog the catalog to set
   */
  public void setCatalog(String catalog) {
    this.catalog = catalog;
  }
}
