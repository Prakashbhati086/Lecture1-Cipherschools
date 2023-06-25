package corejava;
public class priitivveDT{
    public static void main(String args[]){
        int x=5;
        int y=7;
        System.out.println("the value of x is : "+x);
        System.out.println("the value of y is : "+y);

        byte b=10;
        System.out.println("value of b is : "+ b);

      
        int i=b;
        System.out.println("Value of i is : "+i);

        byte b2=(byte)129; //Implicit Typecasting or Narrowing or Down-casting
        System.out.println("b2 is : "+b2);

        byte b3=(byte)256; 
        System.out.println("b2 is : "+b3);
      
        float f = (float) 5.5; // by default considers decimal to be double
        double d = 10.5;
        float f2 = 5.5f;
        char ch = 'a';
        
        int z= x + y; //here '+' is an operator rest are operands
        System.out.println("sum is : "+ z);
        System.out.println("char is : " + ch);
        System.out.println("f is : " + f);
        System.out.println("f2 is : " + f2);
        System.out.println("d is : " + d);

        //Increment and Decrement Operators
        //x++; post-increment;
        System.out.println("Post-Increment of x is x++ : "+ x++);

        //++x; pre-increment;
        System.out.println("Pre-Increment of x is ++x : "+ ++x);
        
        //Similarly for decrement 
    
    }
}
