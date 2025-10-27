package corejava;

import java.util.Comparator;

class AgeComparator implements Comparator<Person1> {
    @Override
    public int compare(Person1 p1, Person1 p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}