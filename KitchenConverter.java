// KitchenConverter.java
// D. Singletary
// 4/16/20
// Converts cups to tablespoons

public class KitchenConverter {

    static final int TBSP_PER_CUP = 16;

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("error: numeric argument for cups expected");
            System.exit(1);
        }
        
        double cups = Double.parseDouble(args[0]);
        //System.out.println("cups = " + cups);
        test(cups);  // expect: success "5.50 cups is 88.00 tablespoons"
    }
    
    public static void test(double cups) {
        if (cups <= 0.0)
            System.out.println("error: cups must be > 0.0");
        else {
            double tbsp = cups * TBSP_PER_CUP; // convert
            System.out.printf("%5.2f cups is %5.2f tablespoons\n", cups, tbsp);
        }
    }
}