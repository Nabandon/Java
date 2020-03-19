package Exercise;

public class TestClass {

    private static void testMethod(){

        try {
            System.out.println("testMethod");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {


            ((TestClass)null).testMethod();


        }



}
