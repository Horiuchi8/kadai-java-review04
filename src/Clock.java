
public class Clock {

    public static void main(String[] args) {
        int result = getSeconds(8,45,30);
        System.out.println(result);
    }

    public static int getSeconds(int h, int m, int s) {
        int result = h * 60 *60 + m * 60 + s;
        return result;
    }
}

