public class GTest {
    public static void main(String[] args) {
        GTest gTest = new GTest();
        System.out.println("test git checkout -- <file>")
        System.out.println("test result: " + gTest.add(9, 34));
    }

    public int add(int a, int b) {
        try {
            return a + b;
        } catch (Exception e) {
            System.out.println("catch test");
        } finally {
            System.out.println("finally test");
        }
        return 0;
    }
}
