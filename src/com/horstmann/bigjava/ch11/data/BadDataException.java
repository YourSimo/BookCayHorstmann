package com.horstmann.bigjava.ch11.data;

import java.io.IOException;

/**
   This class reports bad input data.
*/
public class BadDataException extends IOException
{
   public BadDataException() {}
   public BadDataException(String message)
   {
      super(message);
   }
}
