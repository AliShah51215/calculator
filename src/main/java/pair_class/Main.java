package pair_class;

public class Main {
    public static void main(String[] args) {
        PairClass<Integer, String> pair = new PairClass<>(101, "Future Collars");
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
