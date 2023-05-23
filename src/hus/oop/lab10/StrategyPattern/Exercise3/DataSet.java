package hus.oop.lab10.StrategyPattern.Exercise3;

import java.util.Arrays;

public class DataSet {
    private Sorter strategy;
    private int[] data;

    private int[] originalData;

    public DataSet() {
        this.data = new int[] {5,1,3,7,9,4,8};
        this.originalData = this.data.clone();
    }

    public void reset() {
        this.data = this.originalData.clone();
    }

    public void setStrategy(Sorter strategy) {
        this.strategy = strategy;
    }

    public void sort() {
        this.strategy.sort(this.data);
    }

    public String toString() {
        return Arrays.toString(this.data);
    }
}
