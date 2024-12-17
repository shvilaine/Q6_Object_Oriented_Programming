public class Wilder {
    private String firstName;
    private boolean drinkingWater = false;

    public boolean isDrinkingWater() {
        return drinkingWater;
    }

    public void setDrinkingWater(boolean drinkingWater) {
        this.drinkingWater = drinkingWater;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Wilder(String firstName, boolean drinkingWater) {
        this.firstName = firstName;
        this.drinkingWater = drinkingWater;
    }

    public String whoAmI() {
        if (drinkingWater) {
            return "My name is " + this.getFirstName() + " and I am drinking water. " + String.valueOf(this.isDrinkingWater()) + "; I love water, there won't be any left in 20 or 30 years.";
        } else {
            return "My name is " + this.getFirstName() + " and I am drinking water. " + String.valueOf(this.isDrinkingWater()) + "! Coffee in my veins!";
        }
    }
}
