public class WorkingWithIntegers {
    public static void main(String[] args) {
        //Working with integers
        /*
        byte - 1 byte - (-2(n-1)) to +2(n-1) -1 - -2(7) to  +2(7) -1 -> -128 to +127
        short - 2 bytes
        int - 4 bytes
        long - 8 bytes
         */

        //datatype variablename; //declaration of variable (data)

        byte age; //declaration
        age = 40;

        System.out.println(age);

        age = 20;

        System.out.println(age);

        // age = 130; not allowed exceeds the range of byte

        byte decrementPercentage;
        decrementPercentage = -10;

        System.out.println(decrementPercentage);
        // decrementPercentage = -140; not allowed exceeds the range of byte

        short totalMarks; // short variable declaration
        totalMarks = 500;

        //short salary = 30000; valid but not recommended

        short salary;
        salary = 30000;

        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Salary : " + salary);

        // totalMarks = -33000; exceeds the range of short
        // salary = 35000; exceeds the range of short
    }
}
