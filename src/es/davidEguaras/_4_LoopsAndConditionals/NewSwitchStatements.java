package es.davidEguaras._4_LoopsAndConditionals;

//SINCE JAVA 14:
public class NewSwitchStatements {
    public static void main(String[] args) {
        char grade = 'A';

        String result = switch(grade){
            //We have to return the same data type that is expected in the assignment,
            //which in this case is a String (String result). Each case should return a String value.
            case 'A' -> "Excellent";
            case 'B', 'C' -> "Pass";
            default -> "Fail";
        };
        System.out.println(result.toUpperCase());
    }

}
