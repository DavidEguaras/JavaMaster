package es.davidEguaras._1_VariablesAndTypes;

public class passByValuePrimitive {
    public static void main(String[] args) {
        //Java is ALWAYS pass by value
        //Pass by value means that when a variable is passed to a function, a copy of its value is passed, not the actual variable itself.
        //This means that any changes made to the parameter inside the function do not affect the original variable outside the function.
        int age = 19;
        int ageCopy = increment(age);
        System.out.println(age);
        System.out.println(ageCopy);
    }

    static int increment(int age){
        return ++age;
    }
}
