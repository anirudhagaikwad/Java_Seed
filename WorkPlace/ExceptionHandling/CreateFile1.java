//create a file

import java.io.file;
import java.io.Exception;
public class CreateFile1{

public static void main(String args[])
{

 try{


file myObj=new file("NewFile.txt"); 
if(myObj.CreateNewFile())

{

System.out.println("File created:" +myObj.getName());
}
else{
System.out.println("file already exit");
}

}

catch(IoException e){

System.out.println("An error occured");

e.printstackTrace();

}

}
}


