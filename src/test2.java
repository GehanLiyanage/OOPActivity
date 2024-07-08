public class test2 {

    public void show() {
        System.out.println("This is Method 01.");
    }

    public void show(int x) {
        System.out.println("This is Method 02.");
    }

    public void show(int x, int y) {
        System.out.println("This is method 03.");
    }

    public static void main(String[] args) {

        test2 t2 = new test2();

        t2.show();
        t2.show(5);
        t2.show(10, 20);
    }
}
