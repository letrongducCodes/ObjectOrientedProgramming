package hus.oop.lab9.Library;

import java.util.Date;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        Long[] dates = new Long[rents.length];
        for (int i = 0; i < rents.length; i++) {
            dates[i] = rents[i].getEnd().getTime() - rents[i].getBegin().getTime();
        }
        long maxRent = dates[0];
        int index = 0;
        for (int i = 0; i < rents.length; i++) {
            if(maxRent < dates[i]) {
                maxRent = dates[i];
                index = i;
            }
        }
        return rents[index];
    }
}
