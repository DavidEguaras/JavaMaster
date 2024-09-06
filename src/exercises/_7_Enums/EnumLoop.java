package exercises._7_Enums;

//invoke .values() method on ThirstSize enum and loop through its values and while looping lowercase each value
//hint: while you loop through enums invoke .name() to convert enum to string. without it, you can't lowercase
public class EnumLoop {
    public static void main(String[] args) {
        System.out.println("Our T-Shirt sizes");
        for(TShirt.TShirtSizes tShirtSize : TShirt.TShirtSizes.values()){
            System.out.println(tShirtSize.name().toLowerCase());
        }
    }
}
