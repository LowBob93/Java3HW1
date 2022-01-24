package FruitLand;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruitBox;

    public Box() {
        this.fruitBox = new ArrayList<>();
    }

    public float getWeight() {
        if (fruitBox.isEmpty()) {
            return 0;
        } else {
            return fruitBox.size() * fruitBox.get(0).weight;
        }
    }

    public void addFruit(T fruit) {
        fruitBox.add(fruit);
    }

    public boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    public void pourOverTo(Box<T> resultBox) {
        resultBox.fruitBox.addAll(this.fruitBox);
        this.fruitBox.clear();
    }
}