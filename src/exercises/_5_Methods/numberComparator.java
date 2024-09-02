package exercises._5_Methods;
//-1
//Write a method which takes two numbers as arguments, checks if they are the same and returns the appropriate boolean value.
//You should check both possible outcomes here, i.e. that it returns true when it is supposed to and false when it is supposed to.

//-2
//Write a method which takes two numbers as arguments and prints one of:
    //"The first number is larger"
    //"The second number is larger"
    //"The numbers are equal"
//as appropriate.

public class numberComparator {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z = 20;

        System.out.println(compareNumberEquality(x, y));
        System.out.println(compareNumberEquality(x, z));

        compareTwoNumbers(x, y);
    }


    public static boolean compareNumberEquality(int x, int y){
        return x == y;
    }

    public static void compareTwoNumbers(int x, int y){
        if(x > y){
            System.out.println("The first number is larger");
        }else if(x < y){
            System.out.println("The second number is larger");
        }else{
            System.out.println("They are equal");
        }
    }


}
