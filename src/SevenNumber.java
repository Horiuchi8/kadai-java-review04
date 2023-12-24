
public class SevenNumber {

    public static void main(String[] args) {
        // iの値を1から100までカウントアップ
        for(int i = 0; i <= 100; i++) {
            // iの値が7で割れる場合、もしくは数字に7が含まれている場合
            if(i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                //clap!と表示する
            System.out.println("clap!");
            //それ以外の場合は数字を表示する
        }else {
            System.out.println(i);
        }

    }

}
}