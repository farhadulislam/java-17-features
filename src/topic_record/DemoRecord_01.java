package topic_record;

public class DemoRecord_01 {

    // Record are data classes, implicitly final, cannot be extended
    // Immutable, and its instance fields cannot be set
    public static void main(String[] args) {
        var record1 = new Location(23.00, 23.34);
        System.out.println("Record demo");
        System.out.println(record1.lan());
    }
}
