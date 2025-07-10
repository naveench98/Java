public class Typeconversion
{
    public static void main(String[] args) {
        
        byte b=124;
        int a=267;
        byte c = (byte) a;  //converting int to byte - it will use module where we get reminder value while printing this one
        System.out.println(c);
    }
}