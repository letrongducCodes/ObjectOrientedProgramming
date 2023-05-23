package hus.oop.lab8.CountryManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
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
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
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

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i-1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
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

    /**
     * Sort the countries in order of increasing population
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        /* TODO */
        for (int i = 0; i < newArray.length; i++) {
            int index = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() < newArray[index].getPopulation()) {
                    index = j;
                }
            }
            if(index != i) {
                Country temp = newArray[i];
                newArray[i] = newArray[index];
                newArray[index] = temp;
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     *  using selection sort algorithm.
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        /* TODO */
        for (int i = 0; i < newArray.length; i++) {
            int index = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() > newArray[index].getPopulation()) {
                    index = j;
                }
            }
            if(index != i) {
                Country temp = newArray[i];
                newArray[i] = newArray[index];
                newArray[index] = temp;
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        /* TODO */
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 1; j < newArray.length - 1; j++) {
                if (newArray[j].getArea() < newArray[j - 1].getArea()) {
                    Country temp = newArray[j - 1];
                    newArray[j - 1] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        /* TODO */
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 1; j < newArray.length - 1; j++) {
                if (newArray[j].getArea() > newArray[j - 1].getArea()) {
                    Country temp = newArray[j - 1];
                    newArray[j - 1] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     *  using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        /* TODO */
        for (int i = 0; i < newArray.length; i++) {
            int keyIdx = i;
            Country key = newArray[i];
            while ((keyIdx > 0) && (key.getGdp() < newArray[keyIdx - 1].getGdp())) {
                newArray[keyIdx] = newArray[keyIdx - 1];
                keyIdx--;
            }
            newArray[keyIdx] = key;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     *  sing insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        /* TODO */
        for (int i = 0; i < newArray.length; i++) {
            int keyIdx = i;
            Country key = newArray[i];
            while ((keyIdx > 0) && (key.getGdp() > newArray[keyIdx - 1].getGdp())) {
                newArray[keyIdx] = newArray[keyIdx - 1];
                keyIdx--;
            }
            newArray[keyIdx] = key;
        }
        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        /* TODO */
        int count = 0;
        for (Country country: countries) {
            if(country instanceof AfricaCountry) {
                count++;
            }
        }
        AfricaCountry[] africaCountries = new AfricaCountry[count];
        int index = 0;
        for (Country country: countries) {
            if(country instanceof AfricaCountry) {
               africaCountries[index] =  (AfricaCountry) country;
               index++;
            }
        }
        return africaCountries;
    }

    public AsiaCountry[] filterAsiaCountry() {
        /* TODO */
        int count = 0;
        for (Country country: countries) {
            if(country instanceof AsiaCountry) {
                count++;
            }
        }
        AsiaCountry[] asiaCountries = new AsiaCountry[count];
        int index = 0;
        for (Country country: countries) {
            if(country instanceof AsiaCountry) {
                asiaCountries[index] =  (AsiaCountry) country;
                index++;
            }
        }
        return asiaCountries;
    }

    public EuropeCountry[] filterEuropeCountry() {
        /* TODO */
        int count = 0;
        for (Country country: countries) {
            if(country instanceof EuropeCountry) {
                count++;
            }
        }
        EuropeCountry[] europeCountries = new EuropeCountry[count];
        int index = 0;
        for (Country country: countries) {
            if(country instanceof EuropeCountry) {
                europeCountries[index] =  (EuropeCountry) country;
                index++;
            }
        }
        return europeCountries;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        /* TODO */
        int count = 0;
        for (Country country: countries) {
            if(country instanceof NorthAmericaCountry) {
                count++;
            }
        }
        NorthAmericaCountry[] northAmericaCountries = new NorthAmericaCountry[count];
        int index = 0;
        for (Country country: countries) {
            if(country instanceof NorthAmericaCountry) {
                northAmericaCountries[index] =  (NorthAmericaCountry) country;
                index++;
            }
        }
        return northAmericaCountries;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        /* TODO */
        int count = 0;
        for (Country country: countries) {
            if(country instanceof OceaniaCountry) {
                count++;
            }
        }
        OceaniaCountry[] oceaniaCountries = new OceaniaCountry[count];
        int index = 0;
        for (Country country: countries) {
            if(country instanceof OceaniaCountry) {
                oceaniaCountries[index] =  (OceaniaCountry) country;
                index++;
            }
        }
        return oceaniaCountries;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        /* TODO */
        int count = 0;
        for (Country country: countries) {
            if(country instanceof SouthAmericaCountry) {
                count++;
            }
        }
        SouthAmericaCountry[] southAmericaCountries = new SouthAmericaCountry[count];
        int index = 0;
        for (Country country: countries) {
            if(country instanceof SouthAmericaCountry) {
                southAmericaCountries[index] =  (SouthAmericaCountry) country;
                index++;
            }
        }
        return southAmericaCountries;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        /* TODO */
        Country[] mostPopulousCountries = new Country[howMany];
        Country[] sortPopulousCountries = sortByDecreasingPopulation();
        for (int i = 0 ; i < howMany ; i++) {
            mostPopulousCountries[i] = sortPopulousCountries[i];
        }
        return mostPopulousCountries;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
        Country[] leastPopulousCountries = new Country[howMany];
        Country[] sortPopulousCountries = sortByIncreasingPopulation();
        for (int i = 0 ; i < howMany ; i++) {
            leastPopulousCountries[i] = sortPopulousCountries[i];
        }
        return leastPopulousCountries;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        Country[] largestAreaCountries = new Country[howMany];
        Country[] sortAreaCountries = sortByDecreasingArea();
        for (int i = 0 ; i < howMany ; i++) {
            largestAreaCountries[i] = sortAreaCountries[i];
        }
        return largestAreaCountries;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        Country[] smallestAreaCountries = new Country[howMany];
        Country[] sortAreaCountries = sortByIncreasingArea();
        for (int i = 0 ; i < howMany ; i++) {
            smallestAreaCountries[i] = sortAreaCountries[i];
        }
        return smallestAreaCountries;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        Country[] highestGdpCountries = new Country[howMany];
        Country[] sortGdpCountries = sortByDecreasingGdp();
        for (int i = 0 ; i < howMany ; i++) {
            highestGdpCountries[i] = sortGdpCountries[i];
        }
        return highestGdpCountries;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
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

