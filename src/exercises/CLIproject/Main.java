
package exercises.CLIproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Here the menu will be displayed (using a switch statement)
        int option = 0;
        while(option != 7){
            System.out.println("1\uFE0F⃣ - Book Car\n" +
                    "2\uFE0F⃣ - View All User Booked Cars\n" +
                    "3\uFE0F⃣ - View All Bookings\n" +
                    "4\uFE0F⃣ - View Available Cars\n" +
                    "5\uFE0F⃣ - View Available Electric Cars\n" +
                    "6\uFE0F⃣ - View all users\n" +
                    "7\uFE0F⃣ - Exit");

            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();

            switch (option){
                case 1:

                    break;
            }
        }



    }
}
