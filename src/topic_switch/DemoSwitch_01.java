package topic_switch;

public class DemoSwitch_01 {
    public static void main(String[] args) {
        System.out.println("Hello");
        process(4);
    }

    private static String process(int process){
        return switch(process) {
            case 1 -> "One";
            case 4-> {
                System.out.println("Four called");
                yield "Four";
            }
            case default -> "default";
        };
    }
}
