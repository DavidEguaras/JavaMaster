package es.davidEguaras._16_StaticKeyword;

class StaticBlockExample {
    static int staticVar;

    /*
    Static initialization block
    A static initialization block is used to initialize static variables.
    It runs once, when the class is loaded, and is executed before the constructor or any other instance methods.
    This block is helpful when static variables need complex initialization.
    */
    static {
        staticVar = 10;
        System.out.println("Static initialization block executed.");
    }

    StaticBlockExample() {
        System.out.println("Constructor executed.");
    }

    public static void main(String[] args) {
        System.out.println("Static Variable: " + staticVar);
        StaticBlockExample obj = new StaticBlockExample();
    }
}
