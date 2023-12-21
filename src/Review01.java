
public class Review01 {

    public static void main(String[] args) {
        int commodity_price = 2000;
        double tax_rate = 0.1;
        int tax;
        tax = tax(commodity_price,tax_rate);
        int price_incl_tax = commodity_price + tax;
        System.out.println(commodity_price + "円の商品の税込み価格は" + price_incl_tax + "円(消費税は" + tax + "円)です。");
    }

    public static int tax(int commodity_price, double tax_rate) {
        int tax = (int)(commodity_price * tax_rate);
        return tax;
    }
}