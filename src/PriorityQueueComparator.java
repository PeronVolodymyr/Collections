import Model.Apple;

import java.util.Comparator;

public class PriorityQueueComparator implements Comparator<Apple> {
    @Override
    public int compare(Apple o1, Apple o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
