package es.davidEguaras._16_StaticKeyword;

class InstanceBlockExample {
    int instanceVar;

    // Instance initialization block
    {
        instanceVar = 5;
        System.out.println("Instance initialization block executed.");
    }

    InstanceBlockExample() {
        System.out.println("Constructor executed.");
    }

    public static void main(String[] args) {
        InstanceBlockExample obj1 = new InstanceBlockExample();
        InstanceBlockExample obj2 = new InstanceBlockExample();
    }
}

