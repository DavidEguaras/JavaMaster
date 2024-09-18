package es.davidEguaras._16_StaticKeyword;

class InstanceBlockExample {
    int instanceVar;

    /*
    Instance initialization block
    An instance initializer block runs every time an instance of a class is created.
    It is used for instance variable initialization and is executed before the constructor.
    */
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

