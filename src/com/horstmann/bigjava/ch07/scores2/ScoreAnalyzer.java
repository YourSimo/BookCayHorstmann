package com.horstmann.bigjava.ch07.scores2;

import java.util.Scanner;

public class ScoreAnalyzer
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      GradeBook book = new GradeBook(100);
      System.out.println("Please enter values, Q to quit:");
      while (in.hasNextDouble())
      {  
         if (!book.addScore(in.nextDouble()))
         {
            System.out.println("Too many scores.");
            return;
         }
      }
      System.out.println("Final score: " + book.finalScore());
   }
}
