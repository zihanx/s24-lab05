package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList{
    private int total;
    public InheritanceSortedIntList() {
        total = 0;
    }
    // Write your implementation below with API documentation
    @Override
    public boolean add(int num) {
        total++;
        return super.add(num);
    }

    @Override
    public boolean addAll(IntegerList list) {
        return super.addAll(list);
    }

    public int getTotalAdded() {
        return total;
    }
}