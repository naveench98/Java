public class variable {

    public static void main(String args[])
    {
        //Integer example
        int num1 =1; 
        byte num2 =117; // minimum -128 to maximun 127
        short sh=558; //  -32,768 to 32,767    like for every Datat type there ismin & max value,, we need to declare the values betweenthose only

        long l=5865;// 
        long result=num1+num2+sh+l;  
        System.out.println(result);

      //float
       float num3=6.5f;// if we simply give 6.5 means, iw wil throw the error, we need to mention as 6.5f then only it will work
                     // beacuse java suports Double default, so when we give 6.5 java takes as double defaultly. Hence to declare
                     //float we need assign f to the value so java recognize it as float
       // what is the different between float & Double? IF java supports deafaultly double then why float? //
       //--the value is different between float and double. and Wh float means, float occupies less memory  where double occupies more memory- where when we wn
        Double num4=9.5;


        char ch='1';   // for char we want to store numric numbers means we should assign ' '. beacuse char 
        char ch1='d';  // same for characters also
       // System.out.println(num4);
        System.out.println(ch);
        System.out.println(ch1);
    
        
    }
    
}
