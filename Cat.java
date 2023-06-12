
public class Cat {
    private String name;
    private int appetite;
    private Boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    // public void setSatiety(Boolean satiety) {
    //     this.satiety = true;
    // }

    // public void setAppetite(int appetite) {
    //     this.appetite = appetite;
    // }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public Boolean getSatiety() {
        return satiety;
    }

    public void info() {
        String nnn = "";
        if (satiety == false) {
            nnn = "hungry";
        } 
        else {
            nnn = "ate";
        }

        System.out.printf(name + " - appetite: " + appetite + ", " + nnn + "\n");
    }

    public int eat(int food) {
        if (food >= appetite) {
            satiety = true;
            return food - appetite;
        } else
            return food;
    }

    // public static ArrayList<Cat> hungryCat (ArrayList<Cat>Cats, int food){
    // ArrayList<Cat> hungryCat = new ArrayList<>();
    // for (Cat cat : Cats) {
    // if (cat.getAppetite() > food){
    // hungryCat.add(cat);}
    // }
    // return hungryCat;
    // }
}
