package module8.offline7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Group <T extends Shape> implements Iterable<T>{

    private List<T> shapes;

    public Group() {
        this.shapes = new ArrayList<>();
    }

    public T get(int index) {
        return shapes.get(index);
    }

    public void add(T shape) {
        this.shapes.add(shape);
    }

    public void addAll(Group<T> shapes) {
        Iterator<T> iterator = shapes.iterator();
        while (iterator.hasNext()) {
            T shape = iterator.next();
            add(shape);
        }
    }

    public T getMaxArea() {
        T shapeWithMaxArea = shapes.get(0);

        for (T t : shapes) {
            if (t.getArea() > shapeWithMaxArea.getArea()) {
                shapeWithMaxArea = t;
            }
        }
        return shapeWithMaxArea;
    }

    @Override
    public Iterator<T> iterator() {
        return shapes.iterator();
    }

    @Override
    public String toString() {
        return "Group{" +
                "shapes=" + shapes +
                '}';
    }
}
