
import java.util.Scanner;

class Dec2Hex
{
    public static int Arg1;


    public static String convertToHex(String[] args){
        try{
            Arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please enter an Integer");
        }
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        int num = Arg1;
        String hexadecimal="";
        System.out.println("Converting the Decimal Value " + Arg1 + " to Hex...");


        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        return hexadecimal;
    }

    public static void main(String[] args){
        try{
            Arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please enter an Integer");
        }catch(ArrayIndexOutOfBoundsException f){
            System.out.println("Must not be empty");
        }



        String hexadecimal = convertToHex(new String[]{"15"});
        System.out.println("Hexadecimal representation is: " + hexadecimal);

    }




}



