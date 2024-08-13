public class Runner {

    public static void main(String[] args) {
        Bear bear = new Bear("Baloo", 25, 95.62);
        System.out.println(bear.getName());
        bear.setName("Yogi");
        System.out.println(bear.getName());

    }
}
