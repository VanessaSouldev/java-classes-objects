public class SpaghettiBolognese {

    Ingredient spaghetti = new Ingredient(200, "gram", "spaghetti");
    Ingredient gehakt = new Ingredient(200, "gram", "rundergehakt");
    Ingredient ui = new Ingredient(2, "stuk(s)", "ui");
    Ingredient knoflook = new Ingredient(2, "teentjes", "knoflook");
    Ingredient tomaten = new Ingredient(1, "blik", "gepelde tomaten");
    Ingredient zeezout = new Ingredient(2, "theelepels", "zeezout");
    Ingredient olijfolie = new Ingredient(1.5, "eetlepel", "virgin olijfolie");
    Ingredient water = new Ingredient(1.5, "liter", "water");
    Ingredient peper = new Ingredient(3, "theelepels", "peper");
    Ingredient basilicum = new Ingredient(1, "pluk", "basilicum");

    public void printIngredients() {
        System.out.println("Ingrediënten Spaghetti Bolognese:");

        System.out.println(spaghetti.getAmount() + " " + spaghetti.getUnit() + " " + spaghetti.getName());
        System.out.println(gehakt.getAmount() + " " + gehakt.getUnit() + " " + gehakt.getName());
        System.out.println(ui.getAmount() + " " + ui.getUnit() + " " + ui.getName());
        System.out.println(knoflook.getAmount() + " " + knoflook.getUnit() + " " + knoflook.getName());
        System.out.println(tomaten.getAmount() + " " + tomaten.getUnit() + " " + tomaten.getName());
        System.out.println(zeezout.getAmount() + " " + zeezout.getUnit() + " " + zeezout.getName());
        System.out.println(olijfolie.getAmount() + " " + olijfolie.getUnit() + " " + olijfolie.getName());
        System.out.println(water.getAmount() + " " + water.getUnit() + " " + water.getName());
        System.out.println(peper.getAmount() + " " + peper.getUnit() + " " + peper.getName());
        System.out.println(basilicum.getAmount() + " " + basilicum.getUnit() + " " + basilicum.getName());

    }

    public void printRecipe() {
        System.out.println("Doorloop de volgende stappen één voor één voor het maken van de spaghetti bolognese:");
        boilWater();
        addOliveOilAndSalt();
        addSpaghetti();
        onionAndGarlic();
        addTomatoesAndMinceMeat();
        addBasil();
        drainSpaghetti();
        addPepperAndSalt();
        portionSpaghettiToPlate();
        pourTheBologneseSauce();
    }

    public void boilWater() {
        System.out.println("1. Breng het water aan de kook");
    }
    public void addOliveOilAndSalt() {
        System.out.println("2. Voeg de olijfolie en zout aan het water toe");
    }

    public void addSpaghetti() {
        System.out.println("3. Voeg nu ook de spaghetti toe, breng opniew aan de kook en laat ongeveer 8-10 koken.");
    }

    public void onionAndGarlic() {
        System.out.println("4. Fruit de uien in een koekenpan of wok en voeg de knoflook toe als de uien zijn gefruit.");
    }

    public void addTomatoesAndMinceMeat() {
        System.out.println("5. voeg nu ook de gepelde tomaten met saus en het gehakt toe aan de uien en knoflook");
    }
    public void addBasil() {
        System.out.println("6. Voeg wat basilicum aan de saus toe.");
    }
    public void drainSpaghetti() {
        System.out.println("7. Haal de spaghetti van de kook en giet de spaghetti af met koud water.");
    }
    public void addPepperAndSalt() {
        System.out.println("8. Voeg peper en zout toe aan de saus naar smaak.");
    }
    public void portionSpaghettiToPlate() {
        System.out.println("9. Verdeel de porties spaghetti over de borden");
    }

    public void pourTheBologneseSauce() {
        System.out.println("10. Verdeel nu ook de Bolognese saus over de borden en rasp er wat Parmezaanse kaas overheen.");
    }


}
