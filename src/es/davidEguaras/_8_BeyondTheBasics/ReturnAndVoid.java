package es.davidEguaras._8_BeyondTheBasics;

public class ReturnAndVoid {
    public static void main(String[] args) {
        var names = new String[]{"David", "Andre", "Jamila", "Jones"};

        for(String name : names){
            if(name.startsWith("A")){
                return;
            }
            System.out.println(name);
        }

        System.out.println("end of main method");
    }
}
