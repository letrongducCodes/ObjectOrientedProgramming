package com.countryarraymanager;

import java.util.Arrays;

public class CountryArrayManager {
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0 ; i < this.countries.length ; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex ; i < this.countries.length ; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length ; i > index ; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index ; i < length - 1 ; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }
        return this.countries[index];
    }


    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0 ; i < newArray.length - 1 ; i++) {
            for (int j = i + 1 ; j < newArray.length ; j++) {
                if (newArray[i].getPopulation() > newArray[j].getPopulation()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[i];
                    newArray[i] = temp;
                }
            }
        }

        return newArray;
    }

    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0 ; i < newArray.length - 1 ; i++) {
            for (int j = i + 1 ; j < newArray.length ; j++) {
                if (newArray[i].getPopulation() < newArray[j].getPopulation()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[i];
                    newArray[i] = temp;
                }
            }
        }

        return newArray;
    }

    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0 ; i < newArray.length - 1 ; i++) {
            for (int j = i + 1 ; j < newArray.length ; j++) {
                if (newArray[i].getArea() > newArray[j].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[i];
                    newArray[i] = temp;
                }
            }
        }

        return newArray;
    }

    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0 ; i < newArray.length - 1 ; i++) {
            for (int j = i + 1 ; j < newArray.length ; j++) {
                if (newArray[i].getArea() < newArray[j].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[i];
                    newArray[i] = temp;
                }
            }
        }

        return newArray;
    }

    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0 ; i < newArray.length - 1 ; i++) {
            for (int j = i + 1 ; j < newArray.length ; j++) {
                if (newArray[i].getGdp() > newArray[j].getGdp()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[i];
                    newArray[i] = temp;
                }
            }
        }

        return newArray;
    }

    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0 ; i < newArray.length - 1 ; i++) {
            for (int j = i + 1 ; j < newArray.length ; j++) {
                if (newArray[i].getGdp() < newArray[j].getGdp()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[i];
                    newArray[i] = temp;
                }
            }
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        int k = 0;
        for (int i = 0 ; i < this.countries.length ; i++) {
            if (this.countries[i] instanceof AfricaCountry) {
                k++;
            }
        }

        int j = 0;
        AfricaCountry[] africaCountries = new AfricaCountry[k];
        for (int i = 0 ; i < this.countries.length ; i++) {
            if (this.countries[i] instanceof AfricaCountry) {
                africaCountries[j] = (AfricaCountry) this.countries[i];
                j++;
            }
        }

        return africaCountries;
    }

    public AsiaCountry[] filterAsiaCountry() {
        int k = 0;
        for (int i = 0 ; i < this.countries.length ; i++) {
            if (this.countries[i] instanceof AsiaCountry) {
                k++;
            }
        }

        int j = 0;
        AsiaCountry[] asiaCountries = new AsiaCountry[k];
        for (int i = 0 ; i < this.countries.length ; i++) {
            if (this.countries[i] instanceof AsiaCountry) {
                asiaCountries[j] = (AsiaCountry) this.countries[i];
                j++;
            }
        }

        return asiaCountries;
    }

    public EuropeCountry[] filterEuropeCountry() {
        int k = 0;
        for (int i = 0 ; i < this.countries.length ; i++) {
            if (this.countries[i] instanceof EuropeCountry) {
                k++;
            }
        }

        int j = 0;
        EuropeCountry[] europeCountries = new EuropeCountry[k];
        for (int i = 0 ; i < this.countries.length ; i++) {
            if (this.countries[i] instanceof EuropeCountry) {
                europeCountries[j] = (EuropeCountry) this.countries[i];
                j++;
            }
        }

        return europeCountries;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        int k = 0;
        for (int i = 0 ; i < this.countries.length ; i++) {
            if (this.countries[i] instanceof NorthAmericaCountry) {
                k++;
            }
        }

        int j = 0;
        NorthAmericaCountry[] northAmericaCountries = new NorthAmericaCountry[k];
        for (int i = 0 ; i < this.countries.length ; i++) {
            if (this.countries[i] instanceof NorthAmericaCountry) {
                northAmericaCountries[j] = (NorthAmericaCountry) this.countries[i];
                j++;
            }
        }

        return northAmericaCountries;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        int k = 0;
        for (int i = 0 ; i < this.countries.length ; i++) {
            if (this.countries[i] instanceof OceaniaCountry) {
                k++;
            }
        }

        int j = 0;
        OceaniaCountry[] oceaniaCountries = new OceaniaCountry[k];
        for (int i = 0 ; i < this.countries.length ; i++) {
            if (this.countries[i] instanceof OceaniaCountry) {
                oceaniaCountries[j] = (OceaniaCountry) this.countries[i];
                j++;
            }
        }

        return oceaniaCountries;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        int k = 0;
        for (int i = 0 ; i < this.countries.length ; i++) {
            if (this.countries[i] instanceof SouthAmericaCountry) {
                k++;
            }
        }

        int j = 0;
        SouthAmericaCountry[] southAmericaCountries = new SouthAmericaCountry[k];
        for (int i = 0 ; i < this.countries.length ; i++) {
            if (this.countries[i] instanceof SouthAmericaCountry) {
                southAmericaCountries[j] = (SouthAmericaCountry) this.countries[i];
                j++;
            }
        }

        return southAmericaCountries;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] mostPopulousCountries = new Country[howMany];
        Country[] sortPopulousCountries = sortByDecreasingPopulation();
        for (int i = 0 ; i < howMany ; i++) {
            mostPopulousCountries[i] = sortPopulousCountries[i];
        }
        return mostPopulousCountries;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] leastPopulousCountries = new Country[howMany];
        Country[] sortPopulousCountries = sortByIncreasingPopulation();
        for (int i = 0 ; i < howMany ; i++) {
            leastPopulousCountries[i] = sortPopulousCountries[i];
        }
        return leastPopulousCountries;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] largestAreaCountries = new Country[howMany];
        Country[] sortAreaCountries = sortByDecreasingArea();
        for (int i = 0 ; i < howMany ; i++) {
            largestAreaCountries[i] = sortAreaCountries[i];
        }
        return largestAreaCountries;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] smallestAreaCountries = new Country[howMany];
        Country[] sortAreaCountries = sortByIncreasingArea();
        for (int i = 0 ; i < howMany ; i++) {
            smallestAreaCountries[i] = sortAreaCountries[i];
        }
        return smallestAreaCountries;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] highestGdpCountries = new Country[howMany];
        Country[] sortGdpCountries = sortByDecreasingGdp();
        for (int i = 0 ; i < howMany ; i++) {
            highestGdpCountries[i] = sortGdpCountries[i];
        }
        return highestGdpCountries;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] lowestGdpCountries = new Country[howMany];
        Country[] sortGdpCountries = sortByIncreasingGdp();
        for (int i = 0 ; i < howMany ; i++) {
            lowestGdpCountries[i] = sortGdpCountries[i];
        }
        return lowestGdpCountries;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }

}
