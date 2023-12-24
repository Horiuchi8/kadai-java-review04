
public class Triangle {

    public static void main(String[] args) {
        //各辺の長さ
        int a = 3;
        int b = 5;
        int c = 3;

        //長さが全て等しいならば
        if(a == b && b ==c) {
            //正三角形ですと表示
            System.out.println("これは正三角形です");
        //いずれかの二辺が同じであるならば
        }else if(a == b || b ==c || c == a) {
            //二等辺三角形ですと表示
            System.out.println("これは二等辺三角形です");
        //それ以外ならば不等辺三角形ですと表示
        }else{
            System.out.println("これは不等辺三角形です");
        }



    }

}
