package Task5;

public class QuizA {

  public int x, y;
  public int sum = 1;

  public QuizA(int x, int y) {
    this.x = y;
    this.y = x;
  }

  public void methodA() {
    int x = 3;
    y = this.y + x;

    QuizA exam = new QuizA(5, 11);
    exam.sum = x;
    exam.y = this.y;

    x = this.x + x + exam.sum;
    this.y = this.sum + methodB(exam.sum, exam);

    System.out.println(exam.x + " " + this.y + " " + sum);

    sum = x % 2 + this.x;
    y = x + y + exam.sum;

    System.out.println(x + " " + y + " " + sum);
  }

  public int methodB(int x1, QuizA x2) {
    int y = 0;

    y = this.y + x2.sum;
    x2.sum = x1 + x2.x;
    sum = sum + x + y;

    System.out.println(this.x + " " + this.y + " " + sum);

    return x2.sum;
  }
}