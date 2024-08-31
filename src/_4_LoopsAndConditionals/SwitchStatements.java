package _4_LoopsAndConditionals;

public class SwitchStatements {
    public static void main(String[] args) {
        char grade = 'B';


        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;

                //This is a condition, for cases B OR C System.out.println("Pass");
            case 'B':
            case 'C':
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
                break;

        }

        //As a value in here, we can use: byte, short, int, char, enums, String
        //We can also use their respective wrapper classes: Byte, Short, Integer, Character
        int day = 1;
        switch (day){
            case 1:
                System.out.println("It's monday");
                break;
            case 2:
                System.out.println("It's tuesday");
                // we can't compare other dataTypes like:
                //case "Friday":
                //they have to match the datatype in the switch statement
        }

        //we also can't pass null as a value to the switch
        //❌switch(null){}
    }
}
