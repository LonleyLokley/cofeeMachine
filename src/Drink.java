public class Drink {
    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    String name;
    int value;

    public Drink(String drinkName, int drinkVolue){
        this.name=drinkName;
        this.value=drinkVolue;
    }

    public void getProduct(int temperature){
        System.out.printf("Please take yours %d ml %s, with %d degrees", this.value, this.name, temperature);
    }
}