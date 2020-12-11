public class GTest {
    public static void main(String[] args) {
        GTest gTest = new GTest();
        System.out.println("测试结构: " + gTest.add(9, 34));
    }

    public int add(int a, int b) {
        try {
            return a + b;
        } catch (Exception e) {
            System.out.println("catch 测试");
        } finally {
            System.out.println("finally 测试");
        }
        return 0;
    }
}
