package C_13;

import java.util.Formatter;

public class Ex_4 {
    class Receipt {

        public static final int DISPLAY_WIDTH = 50;
        public static final int ITEM_WIDTH = (int) (DISPLAY_WIDTH * 0.5);
        public static final int ITEM_STRING_WIDTH = ITEM_WIDTH;
        public static final int QTY_STRING_WIDTH = (int) (DISPLAY_WIDTH * 0.25);
        public static final int QTY_DECIMAL_WIDTH = QTY_STRING_WIDTH;
        public static final int PRICE_COLUMN_WIDTH = DISPLAY_WIDTH / 3;
        public static final float PRICE_FLOAT_WIDTH = PRICE_COLUMN_WIDTH + 0.2f;
        private double total = 0;
        private Formatter f = new Formatter(System.out);

        public void printTitle() {
            f.format("%-" + ITEM_WIDTH + "s %" + QTY_STRING_WIDTH + "s %" + PRICE_COLUMN_WIDTH + "s\n", "Item", "Qty", "Price");
            f.format("%-" + ITEM_WIDTH + "s %" + QTY_STRING_WIDTH + "s %" + PRICE_COLUMN_WIDTH + "s\n", "----", "---", "-----");
        }

        public void print(String name, int qty, double price) {
            f.format("%-" + ITEM_WIDTH + "." + ITEM_STRING_WIDTH + "s %" + QTY_DECIMAL_WIDTH + "d %" + PRICE_FLOAT_WIDTH + "f\n", name, qty, price);
            total += price;
        }

        public void printTotal() {
            f.format("%-" + ITEM_WIDTH + "s %" + QTY_STRING_WIDTH + "s %" + PRICE_FLOAT_WIDTH + "f\n", "Tax", "", total * 0.06);
            f.format("%-" + ITEM_WIDTH + "s %" + QTY_STRING_WIDTH + "s %" + PRICE_COLUMN_WIDTH + "s\n", "", "", "-----");
            f.format("%-" + ITEM_WIDTH + "s %" + QTY_STRING_WIDTH + "s %" + PRICE_FLOAT_WIDTH + "f\n", "Total", "",
                    total * 1.06);
        }
    }

    public static void main(String[] args) {
        Receipt receipt = new Ex_4().new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
