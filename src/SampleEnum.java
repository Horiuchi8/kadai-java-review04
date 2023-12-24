
public class SampleEnum {

        public static enum Gender{
            男,
            女
        }

    public static void main(String[] args) {

        Gender gender1 = Gender.男;
        Gender gender2 = Gender.女;


        System.out.println(gender1);
        System.out.println(gender2);

        System.out.println(gender1.ordinal());
        System.out.println(gender2.ordinal());

    }
}