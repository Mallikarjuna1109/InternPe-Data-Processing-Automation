package model;

public class Record {
    private String name;
    private int value;

    public Record(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() { return name; }
    public int getValue() { return value; }

    @Override
    public String toString() {
        return name + " -> " + value;
    }
}
