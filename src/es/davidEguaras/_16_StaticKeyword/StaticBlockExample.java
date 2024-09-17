package es.davidEguaras._16_StaticKeyword;

class StaticBlockExample {
    static int staticVar;

    // Static initialization block
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
