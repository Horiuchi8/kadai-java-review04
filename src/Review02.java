
public class Review02 {

    public static void main(String[] args) {
        // iの値を1から100までカウントアップ
        for(int i = 1; i <= 100; i++) {
            // iの値が3と5の両方で割り切れる場合"FizzBuzz"と表示
            if(i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
            // iの値が3で割り切れる場合"Fizz"と表示
            }else if( i % 3 == 0) {
                System.out.println("Fizz");
            // iの値が5で割り切れる場合"Buzz"と表示
            }else if( i % 5 == 0) {
                System.out.println("Buzz");
                //それ以外の数字を表示
            }else {
            System.out.println(i);
            }


        }
    }
}


