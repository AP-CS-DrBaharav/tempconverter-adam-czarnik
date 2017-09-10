/**
* Write a class TempConverter.
* See details in the class file.
*
*/



public class Main {

    public static void main(String[] args)
    {
        
        TempConverter tConverter = new TempConverter();
        
        double t = 25;
        System.out.println(t + "C = " + tConverter.C2F(t) +"F");
        System.out.println(t + "C = " + tConverter.C2K(t) +"Kelvin");
        
        t = 86 ;
        System.out.println(t + "F = " + tConverter.F2C(t) +"C");
        
        
        t = 0 ;
        System.out.println(t + "C = " + tConverter.C2F(t) +"F");
        
        t = -10 ;
        System.out.println(t + "C = " + tConverter.C2F(t) +"F");
              
        
    }
    
}
