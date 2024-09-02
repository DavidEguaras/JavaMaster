package es.davidEguaras._8_BeyondTheBasics;

public class BreakAndContinue {
    public static void main(String[] args) {
        var numbers = new int[] {1, 2, 3, 4, 5, 6};

        for(int number : numbers){
            if(number == 3){
                break;
            }
            System.out.println(number);
        }

        var names = new String[]{"David", "Andre", "Jamila", "Jones"};

        for(String name : names){
            if(name.startsWith("A")){
                 continue;
            }
            System.out.println(name);
        }

    }
}
