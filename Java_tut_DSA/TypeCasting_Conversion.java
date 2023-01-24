public class TypeCasting_Conversion {
    public static void main(String[] args) {

        // Type casting
        int num = (int)(2365.36598f);
        System.out.println("Type casting of float(2365.36598f) into Int : "+ num);

        //automatic type promotion in Expression 
        int num1 = 257;
        byte num2 = (byte)(num1); //257 % 256 = 1
        System.out.println(num2);

        byte a = 45;
        byte b = 63;
        byte c = 125;
        int d = a * b / c ; // actual output in FLOAT 22.68 but it casting into INT
        System.out.println("a * b / c :" +d);

        // Type conversion --
        int NUM3 = 'A';
        System.out.println("Type Conversion : " +NUM3);

        // UNICODE VALUES
        // System.out.println();
        
        // RECALL ---
        byte numByte = 21;
        char numChar = 'b';
        short numShort = 1235;
        int numInt= 452;
        float numFloat= 2.3f;
        double numDouble = 23.2575522;
        double answer = (numByte * numFloat) + (numChar-numDouble) / (numShort % numInt);
        System.out.println(answer);
        System.out.println((numByte * numFloat) + " " + (numChar-numDouble) + " " + (numShort % numInt) );

        System.out.println("Test AUTOSAVE in VSCode");


    }
}
