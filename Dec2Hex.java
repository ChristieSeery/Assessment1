
import java.util.Scanner;

class Dec2Hex
{

// class that provides the implementation of turning a decimal to a hex
    public static int Arg1;

    public static void main(String[] args){

        if(args.length ==0){
            System.out.println("Input was empty, enter a number");
            return;
        }

        try{
            Arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please enter an Integer");
            return;
        }



        String hexadecimal = convertToHex(args[0]);
        System.out.println("Hexadecimal representation is: " + hexadecimal);

    }

    public static String convertToHex(String input){
        boolean isInteger;
        int num = 0;
        if(input == null){
            return "Input was null, enter a number";
        }
        try{
            num = Integer.parseInt(input);
            isInteger = true;
        } catch (NumberFormatException e) {
            isInteger = false;
        }

        if(!isInteger){
            return"Please enter an Integer";
        }
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;

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






}

