
public class SampleEnum {

        public static enum Gender{
            MALE,
            FEMALE
        }

    public static void main(String[] args) {

        Gender gender0 = Gender.MALE;
        Gender gender1 = Gender.FEMALE;


        System.out.println(gender0);
        System.out.println(gender1);

        System.out.println(gender0.ordinal());
        System.out.println(gender1.ordinal());

    }
}