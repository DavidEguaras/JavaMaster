package exercises._3_conditionals;

// create a for loop which goes from 0 to 20
// print each even value

public class EvenNumbersLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
