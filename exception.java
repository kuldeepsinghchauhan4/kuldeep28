import java.util.Scanner;
class invalidNameException extends Exception{
    
    invalidNameException(String s){
        super(s);
    }
}






class ExceptionExample{
  String fn;
 String ln;
 ExceptionExample(String fn,String ln){
     this.fn=fn;
     this.ln=ln;
     
 }
  void check() throws invalidNameException{
    if(this.fn.equals("")&&this.ln.equals("")){
       throw new invalidNameException("not valid") ;
       //System.out.println("name is not valid");
    }
    else{
        System.out.println("name is  valid");
    }
}
}
class Demo{
public static void main(String args[]){
     
     Scanner s1=new Scanner(System.in);
     Scanner s2=new Scanner(System.in);
      String fn=s1.next();
     String ln=s2.next();
         ExceptionExample e=new ExceptionExample(fn,ln);
          try
          {
        e.check();
    }catch(Exception f){
        System.out.println("exception occured:"+f);
    }
}
}
 