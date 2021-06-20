package lesson11_generalizations;

import lesson11_generalizations.products.Fruit;

import java.util.ArrayList;

public class Box <FruitType extends Fruit> {

    private float boxWeight;

    ArrayList<FruitType> fruitInBox = new ArrayList<>();

    public void add(FruitType fruit) {
        fruitInBox.add(fruit);
    }

    //Специально задал расчёт boxWeight только здесь потому, что могу(Шутка)),
    // потому, что получение веса идёт только из этого метода
    // и не обязательно пересчитывать его каждый раз при добавлении/удалении предмета :-)
    public float getBoxWeight() {
        if (fruitInBox.size() > 0) {
            for (FruitType ourFruit : fruitInBox) {
                try {
                    boxWeight += ourFruit.getWeight();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return boxWeight;
        }
        boxWeight = 0;
        return boxWeight;
    }

    public boolean compare (Box box) {
        return fruitInBox.size() == box.fruitInBox.size();
    }

    public void pourInto(Box<FruitType> box) {
        box.fruitInBox.addAll(fruitInBox);
        fruitInBox.clear();
    }

}