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

    public static void main(String[] args) {

        byte smallNumber = 1;
        short shortNumber = -8;
        int numbers = 27;
        long largeNumber = 6783379L;

        System.out.println(numbers);
        System.out.println(smallNumber);
        System.out.println(shortNumber);
        System.out.println(largeNumber);
    }

}

