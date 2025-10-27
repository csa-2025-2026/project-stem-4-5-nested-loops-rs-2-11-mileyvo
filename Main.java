import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Make sure to test your methods here
  }

  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++)
    {
      String current_letter = word.substring(i, i+1);
      for (int j = 0; j < N; j++)
      {
        System.out.print(current_letter + " ");
      }
      System.out.println();
    }
  }

  public static void printNums()
  {
    for (int num = 10; num > 0; num--)
    {
      for (int newNum = 0; newNum < num; newNum++)
      {
        System.out.print(newNum + " ");
      }
      System.out.println();
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    // code solution here
  }

  public static void starTree()
  {
    // code solution here
  }

  public static void multTable()
  {
    // code solution here
  }
}
