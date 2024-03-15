
public class Review01 {

    public static void main(String[] args) {
        // 商品価格
        int item_price = 1500;
        // 消費税率
        double tax_rate = 0.1;
        // 消費税額
        int tax_price = tax(item_price, tax_rate);
        // 税込価格
        int total_price = item_price + tax_price;
        System.out.println(item_price + "円の商品の税込価格は" + total_price + "円（消費税は" + tax_price + "円）です。");
    }

    public static int tax(int item_price, double tax_rate) {
        int tax_price = ((int)(item_price * tax_rate));
        return tax_price;
    }

}
