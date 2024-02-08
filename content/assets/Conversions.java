public class Conversions {
    public static void main(String[] args) {
        System.out.println("1/3 == " + 1/3); // 0 -> integer division
        System.out.println("1/3.0 == " + 1/3.0); // 0.33333... -> promotion to double
        System.out.println("(double) 1/3 == " + (double) 1/3); // 0.3333... -> casting conversion
        System.out.println("(double) (1/3) == " + (double) (1/3)); // 0.0 -> casting conversion after integer division
        
        int i = (int) 12.3;
        System.out.println("i == " + i); // 12 -> casting conversion (information lost)
        // int j = 12.3; -> does not work, requires casting (int)
        float f = 12; // -> assignment conversion, works without (float)
        System.out.println("f == " + f); // 12.0 
        System.out.println("sin(i) == " + Math.sin(i)); // -0.5365729180004349 
        // -> method converts int to double because Math.sin() expects a double

        int big = 1234567890;
        float approxbig = big;
        System.out.println("big == " + big);             // 1234567890
        System.out.println("approxbig == " + approxbig); // 1.23456794E9
        System.out.println("(int) approxbig - big == " + ((int) approxbig - big)); // 46
        // -> still loses information because values of type float are not precise to nine significant digits 

        byte b = 100;
        System.out.println("(byte) (b*10)  == " + (byte) (b*10)); // -24
        // -> 1000 is not representable by a byte, so we get 1000 - (4 * 256) = -24
        System.out.println("(int) 1e20f  == " + (int) (1e20f)); // 2147483647
        // -> 2147483647 is not 1e20 == 100000000000000000000
        System.out.println("(float) -1e100  == " + (float) -1e100); // -Infinity
        System.out.println("(float) 1e-50  == " + (float) 1e-50); // 0.0
    }
}
