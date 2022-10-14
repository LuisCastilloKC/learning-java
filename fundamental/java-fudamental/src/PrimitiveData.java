public class PrimitiveData {

    /* 
  
There are four categories of primitive types:
 - Integer
 - Floating point
 - Character
 - Boolean
*/


/* 
  
INTEGER TYPES

 - byte  8 bits  min value -128 and max value is 128 literal format is 0
    example: byte numberOfEnglishLetters = 26;

 - short 16 bits min value -32764 and max value is 32767 literal format is 0
    example: short feetInAMile = 5280;

 - int 32 bits min value -2147483648 max value is 2147483647 literal format is 0
    example: int mileToSun = 92960000;

 - long 64 bits min value -9223372036854775808 max value is 9223372036854775807 literal format is 0L
    example: long nationalDebt = 19100000000000L;
*/

    public static void integer(String[] args) {

        byte smallNumber = 1;
        short shortNumber = -8;
        int numbers = 27;
        long largeNumber = 6783379L;

        System.out.println(numbers);
        System.out.println(smallNumber);
        System.out.println(shortNumber);
        System.out.println(largeNumber);
    }



/* 
  
FLOATING POINT TYPES
 - Implement of IEEE 754 floating point standards
 - floating point value store fractional portion
 - Support positive, negative, and zer values


 - float 32 bits small positive value 1.4x10^-45 max value 3.4x10^38 literal format 0.0f
    example: float milesInAMarathon = 26.2f;

 - double 64 bits 4.9x10^-324 max value 1.7x10^308 literal format 0.0 or 0.0d
    example: double atomWidthInMetters = 0.000000000001d;
*/


public static void floating(String[] args) {
 
    float miles = 56.1f ;
    double meters = 0.000005d;

 System.out.println(miles);
 System.out.println(meters);

}

}