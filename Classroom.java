public class Classroom {
    public static void main(String[] args) {

        Wilder Pilou = new Wilder("Pilou", true);
        System.out.println(Pilou.whoAmI());

        Wilder Fraideau = new Wilder("Fraideau", false);
        System.out.println(Fraideau.whoAmI());
        Fraideau.setDrinkingWater(true);
        System.out.println(Fraideau.whoAmI());
    }
}
