package hus.oop.lab10.AdapterPattern.Pseudocode;

import hus.oop.lab10.AdapterPattern.Pseudocode.RoundPeg;
import hus.oop.lab10.AdapterPattern.Pseudocode.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(peg.getWidth());
        this.peg = peg;
    }

    public int getRadius() {
        return (int) (peg.getWidth() * Math.sqrt(2) / 2);
    }
}
