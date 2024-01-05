package animal;
/*
 * Humanクラスの親クラス
 * 名前と年齢を格納するフィールドの定義
 * コンストラクタに引数を設定し、初期化
 * sayメソッドの定義
 */

public class Animal {
    //名前と年齢を格納するフィールドの定義(カプセル化)
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //引数なしのコンストラクタ
    public Animal() {

    }

    //引数ありのコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void say() {
        System.out.println(name + "です。" + age + "歳です。");
    }


}
