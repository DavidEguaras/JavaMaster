package exercises._7_Enums;


//create enum to represent t-shirt sizes from small to extra extra large

public class TShirt {

    enum TShirtSizes{
        S,
        M,
        L,
        XL,
        XXL
    }

    public static void main(String[] args) {
        System.out.println("Our T-Shirt sizes");
        for(TShirtSizes tShirtSize : TShirtSizes.values()){
            System.out.println(tShirtSize);
        }
    }
}
