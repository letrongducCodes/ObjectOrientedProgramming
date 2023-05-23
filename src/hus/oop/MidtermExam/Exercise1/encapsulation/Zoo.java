package hus.oop.MidtermExam.Exercise1.encapsulation;

public class Zoo {
    private String name;
    private String species;

    public Zoo() {
    }

    public Zoo(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        //Hàm để lấy ra tên của con vật
        return name;
    }

    public void setName(String name) {
        //Hàm để đặt hoặc sửa tên của con vật
        this.name = name;
    }

    public String getSpecies() {
        //Hàm để lấy ra giống loài của con vật
        return species;
    }

    public void setSpecies(String species) {
        //Hàm để sửa giống loài của con vật
        this.species = species;
    }

    @Override
    public String toString() {
        return "Zoo[name = " + name + ", species = " + species + "]";
    }
}
