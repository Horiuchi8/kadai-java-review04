

//60点以上の人数を数えるサンプルコード
public class ContinueSample {

    public static void main(String[] args) {
        //検索対象のデータを準備
        int[] targetArray = {37,85,64,57,98,100,47,23,71,69};

        //変数の宣言
        int score = 0;

        //配列の全要素を対象に探す
        for(int value : targetArray) {
            if(value < 60) {
                continue;
                }

            //変数のカウントアップ
            score++;
        }

        //60以上の数字を表示
        System.out.println("60点以上の人は" + score + "人です");

    }

}
