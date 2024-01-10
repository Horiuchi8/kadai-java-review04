package animal;
/*
 * Animalクラスを継承
 * Thinkableインターフェイスの実装
 * thinkメソッドの実装
 * 趣味の情報を保管するフィールドの定義
 * コンストラクタで、名前・年齢・趣味の情報を格納する引数を設定と初期化
 */

//animalクラスを継承
public class Human extends Animal implements Thinkable {
    //趣味情報のフィールドの定義(カプセル化)
    private String interest;

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    //引数なしのコンストラクタ
    public Human() {

    }

    //引数ありのコンストラクタ
    public Human(String name, int age, String interest) {
        super(name, age);
        this.interest = interest;

    }

    @Override
    //thinkメソッド
    public void think() {
        System.out.println("私は" + interest + "について考えます。");
    }

}
