package topic_record;

public record Location(double lan, double lon) {
    public Location{
        if (lan >100)
                throw new RuntimeException(" ");
    }
}
