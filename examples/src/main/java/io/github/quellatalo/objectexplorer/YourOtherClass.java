package io.github.quellatalo.objectexplorer;

public class YourOtherClass implements YourInterface {
    private final int id;
    private final String name;
    private int[] numbers = {1, 2, 3};

    public YourOtherClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
