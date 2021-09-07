public class Main {
    private static int result = 1;

    private static int massMax = 10;
    private static int mass = 0;
    private static int price = 0;
    private static Item[] item =  {
            new Item("iphone",1,100),
            new Item("dumbbells",5,10),
            new Item("guitar",3,200),
            new Item("notebook",5,150),
    };

    public static void main(String[] args) {
        exponentiation(3,4);

        backpack();
    }

    private static void exponentiation(int a, int b) {
        b = b - 1;
        result = result * a;
        if (b > 0) {
            exponentiation(a, b);
        }
        if(b == 0) {
            System.out.println(result);
        }
    }

    private static void backpack() {

        for (Item element : item) {
            mass = mass + element.mass;
            price = price + element.price;
        }
        if(mass <= massMax){

            System.out.println(price);
            for (Item value : item) {
                System.out.println(value.name);
            }

        }else {
            item[0].mass = 0;
            item[0].price = 0;
            backpack();
        }

    }
}
