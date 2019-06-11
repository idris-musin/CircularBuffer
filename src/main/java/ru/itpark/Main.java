package ru.itpark;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        CircularBuffer buffer = new CircularBuffer(5);

        buffer.add("Madrid");
        buffer.add("Paris");
        buffer.add("Berlin");
        buffer.add("Moscow");
        buffer.add("London");
        buffer.add("Rome");
        buffer.add("Minsk");

        System.out.println(buffer.getBuffer());
    }
}

class CircularBuffer {
    private String name;
    private int maxSize = 5;

    public CircularBuffer(int maxSize) {
        this.maxSize = maxSize;
    }

    private Queue<String> buffer = new LinkedList<>();

    public void add (String city) {
        buffer.add(city);
        if (buffer.size() > maxSize) {
            buffer.remove();
        }
    }

    List<String> getBuffer() {
        return new LinkedList<>(buffer);
    }
}