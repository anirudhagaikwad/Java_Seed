public class Example12{

public static void main(String args[])

{

  
  try
  {

  int data[]= new int[5]; // may throw eception
  data[5]=30/0;
  System.out.println(data[10]);


   }
   // handling exception 

  catch(ArithmeticException e)

     {
    
    System.out.println(" Arithmatic exception");
    }


    catch(Exception e)

      {
    
    System.out.println("exception");

    }
  // catch(ArrayIndexOutOfBoundsException e)

   //{

    //System.out.println("ArrayIndexOutOfBoundsException");

  //}

System.out.println("rest of code");
  
}
}