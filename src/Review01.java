
public class Review01 {

    public static void main(String[] args) {
        //商品価格の表示
        int commodity_price = 2000;
        //税率の表示
        double tax_rate = 0.1;
        //税額の表示。計算はtaxメソッドで行う。
        int tax;
        tax = tax(commodity_price,tax_rate);
        //税込み価格の表示
        int price_incl_tax = commodity_price + tax;

        System.out.println(commodity_price + "円の商品の税込み価格は" + price_incl_tax + "円(消費税は" + tax + "円)です。");
    }

    //taxメソッド
    public static int tax(int commodity_price, double tax_rate) {
        //double型の税率を用いた計算を整数値にするためにint型にキャストする
        int tax = (int)(commodity_price * tax_rate);
        return tax;
    }
}