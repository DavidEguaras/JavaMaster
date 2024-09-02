package es.davidEguaras._8_BeyondTheBasics;

import java.awt.*;

public class FinalKeyword {
    //allows us to create constants, prevent inheritance and to prevent method overwriting

    //final variables are called CONSTANTS
    //constants are named in ALL UPPERCASE
    //they are used to define properties that WON'T CHANGE IN THE FUTURE
    public static final String NAME = "david";


    public static void main(String[] args) {
        //FinalKeyword
        var name1 = "David";
        name1 = "Jamarcus";
        System.out.println(name1);

        final var name2 = "David";
        //we can't change the value
        //Error: ❌name2 = "Jamarcus";❌

        //But be carefull:
        final Point p = new Point();
        p.y = 10;
        p.y = 50;

        //why can we do this? because if we go into the Point class declaration...
        /*
        public class Point extends Point2D implements java.io.Serializable {
        ⚠️Here, the variables are not final⚠️
            public int x;
            public int y;

        FINAL applies to the reference, not the object it points to.
        If an object’s fields (like x and y in Point) are not final, they can still be modified even if the reference to the object is final.
        To make fields unchangeable, you would need to declare the fields themselves as final (e.g., final int y;).
        */

    }
}

//Here is a more IN-DEPTH explanation:
/*
    final Keyword in Java:

    When you declare a variable as final, it means that the reference stored in that variable cannot be changed.
    In other words, you cannot reassign the final variable to point to a different object.
    However, the contents (or state) of the object that the final reference points to can still be modified, as long as the object's fields are mutable.

        final Point p = new Point(); //declares p as a final reference. This means that p will always refer to the same Point object.
                                     You cannot reassign p to point to another Point object or any other object.
                                     However, the fields of the Point object (i.e., x and y) are not final, so you can modify them.

        final Point p = new Point(); // `p` is final, it cannot be reassigned to another object
        p.y = 10; // This is allowed because you're modifying the internal state of the object
        p.y = 50; // Still allowed, the reference `p` hasn't changed, just the object's fields


    Why You Can Modify p.y:
            The y field of the Point class is not marked as final, meaning it can be changed.
            The final keyword only restricts reassigning the p variable to a different object,
            but it doesn't prevent you from changing the contents of the Point object itself.


    What final Really Does:
        final ensures that the reference p will always point to the same Point object. For example, the following code would result in an error:

            final Point p = new Point();
            p = new Point(); // Error: Cannot assign a value to a final variable 'p'

Summary:
final applies to the reference, not the object it points to.
If an object’s fields (like x and y in Point) are not final, they can still be modified even if the reference to the object is final.
To make fields unchangeable, you would need to declare the fields themselves as final (e.g., final int y;).
*/

