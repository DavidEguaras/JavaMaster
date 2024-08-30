package _1_VariablesAndTypes;

public class passByValue {
    public static void main(String[] args) {
        //Java is ALWAYS pass by value
        int age = 19;
        int ageCopy = increment(age);

        System.out.println(age);
        System.out.println(ageCopy);
    }

    static int increment(int age){
        return ++age;
    }
}
