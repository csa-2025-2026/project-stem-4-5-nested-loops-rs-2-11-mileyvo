import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    printNTimes("code", 3);
    printNums();
    uprightNumberTriangle(10);
  }

  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++)
    {
      String current_letter = word.substring(i, i+1);
      for (int j = 0; j < N; j++)
      {
        System.out.print(current_letter + "");
      }
    }
  }

  public static void printNums()
  {
    for (int num = 10; num >= 1; num--)
    {
      for (int newNum = 1; newNum < num; newNum++)
      {
        System.out.print(newNum + " ");
      }
      System.out.println();
    }
  }

  public static void uprightNumberTriangle(int N)
  {
    for (int num = 1; num <= N; num++)
    {
      // System.out.println("HI");
      for (int newNum = 1; newNum <= num; newNum++)
      {
        System.out.print(newNum + " ");
      }
      System.out.println();
    }
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
