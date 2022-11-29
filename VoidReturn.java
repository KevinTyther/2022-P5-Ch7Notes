import java.util.Scanner;

public class VoidReturn
{
   public static void main(String args[])
   {
      int k = 0;
      while (k < 2)
      {
         test();
         for (int p = 0; p < 100; p++)
         {
            System.out.println("....");
         }
      }

   }
   public static void addNums()
   {
      System.out.println("We are going to add two numbers");
      System.out.println("Please enter them below");

      Scanner scan = new Scanner(System.in);
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();

      System.out.println("Your total is: " + (num1 + num2));
   }

   public static void subNums()
   {
      System.out.println("We are going to minus two numbers");
      System.out.println("Please enter them below");

      Scanner scan = new Scanner(System.in);
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();

      System.out.println("Your total is: " + (num1 - num2));
   }

   public static void mulNums()
   {
      System.out.println("We are going to multiply two numbers");
      System.out.println("Please enter them below");

      Scanner scan = new Scanner(System.in);
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();

      System.out.println("Your total is: " + (num1 * num2));
   }


   public static void test()
   {
      System.out.println("Test");
      Scanner scan = new Scanner(System.in);
      int x = scan.nextInt();
      if (x == 1)
      {
         addNums();
      }
      if (x == 2)
      {
         subNums();
      }
      if (x == 3)
      {
         mulNums();
      }
      else
      {
         test();
      }
   }

}
