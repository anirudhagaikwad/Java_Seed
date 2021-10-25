class Example
{
  void display()
  {

  try{
      int a=5/0;
     }

catch(ArithmeticException e)
  {
   System.out.println("ArithmaticExceptio error is divided by zero");
  }
}
}

class Except{

public static void main(String args[])

{ 
  Except obj=new Except();

   obj.display();
}

}

