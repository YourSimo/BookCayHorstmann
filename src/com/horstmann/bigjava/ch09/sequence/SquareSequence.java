package com.horstmann.bigjava.ch09.sequence;

public class SquareSequence implements Sequence
{
   private int n;

   public int next()
   {
      n++;
      return n * n; 
   }
}
