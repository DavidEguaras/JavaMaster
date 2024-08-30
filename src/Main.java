public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        System.out.println(10 + 10);
    }
}

/*The ByteCode
ByteCode of this class:
// class version 66.0 (66)
// access flags 0x21
public class Main {

  // compiled from: Main.java

  // access flags 0x1
  public <init>()V
   L0
    LINENUMBER 1 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
    RETURN
   L1
    LOCALVARIABLE this LMain; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x9
  public static main([Ljava/lang/String;)V
   L0
    LINENUMBER 3 L0
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    LDC "Hello Java"
    INVOKEVIRTUAL java/io/PrintStream.println (Ljava/lang/String;)V
   L1
    LINENUMBER 4 L1
    GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
    BIPUSH 20
    INVOKEVIRTUAL java/io/PrintStream.println (I)V
   L2
    LINENUMBER 5 L2
    RETURN
   L3
    LOCALVARIABLE args [Ljava/lang/String; L0 L3 0
    MAXSTACK = 2
    MAXLOCALS = 1
}
*/