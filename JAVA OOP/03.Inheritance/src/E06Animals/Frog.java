package E06Animals;

public class Frog extends Animal {
    public Frog(String name, int age, Gender gender) {
        super(name, age, gender);
    }
    @Override
    public String produceSound() {
        return "Rabbit";
    }
}
