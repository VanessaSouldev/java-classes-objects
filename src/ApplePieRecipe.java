public class ApplePieRecipe {
    Ingredient roomboter = new Ingredient(200,"gram", "ongezouten roomboter");
    Ingredient bastardSuiker = new Ingredient(200, "gram","bastard suiker");
    Ingredient bakmeel = new Ingredient(400,"gram", "bakmeel");
    Ingredient ei = new Ingredient(1, "stuk(s)", "ei");
    Ingredient vanilleSuiker = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient zout = new Ingredient(1, "snuf", "zout");
    Ingredient appels = new Ingredient(1.5, "kilo","zoetzure appels");
    Ingredient suiker = new Ingredient(75, "gram", "suiker");
    Ingredient kaneel = new Ingredient(3, "theelepels", "kaneel");
    Ingredient paneermeel = new Ingredient(15, "gram", "paneermeel");

    public void printIngredients() {
    System.out.println("Ingrediënten appeltaart:");
    System.out.println(roomboter.getAmount() + " " + roomboter.getUnit() + " " + roomboter.getName());
    System.out.println(bastardSuiker.getAmount() + " " + bastardSuiker.getUnit() + " " + bastardSuiker.getName());
    System.out.println(bakmeel.getAmount() + " " + bakmeel.getUnit() + " " + bakmeel.getName());
    System.out.println(ei.getAmount() + " " + bakmeel.getUnit() + " " + bakmeel.getName());
    System.out.println(vanilleSuiker.getAmount() + " " + vanilleSuiker.getUnit() + " " + vanilleSuiker.getName());
    System.out.println(zout.getAmount() + " " + zout.getUnit() + " " + zout.getName());
    System.out.println(appels.getAmount() + " " + appels.getUnit() + " " + appels.getName());
    System.out.println(suiker.getAmount() + " " + suiker.getUnit() + " " + suiker.getName());
    System.out.println(kaneel.getAmount() + " " + kaneel.getUnit() + " " + kaneel.getName());
    System.out.println(paneermeel.getAmount() + " " + paneermeel.getUnit() + " " + paneermeel.getName());


    }

    public void printRecipe() {
        System.out.println("Doorloop de volgende stappen één voor één voor het maken van de appeltaart:");
                ovenHeating();
                clutchEggs();
                mixIngredients();
                peelApples();
                greaseBakingBin();
                coverBakingBinBottom();
                placeApplesInBakingBin();
                cutDough();
                crossLayers();
                placePieInOven();

    }
    public void ovenHeating() {
        System.out.println("1. Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }
    public void clutchEggs() {
        System.out.println("2. Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void mixIngredients() {
        System.out.println("3. Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void peelApples() {
        System.out.println("4. Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void greaseBakingBin() {
        System.out.println("5. Vet de springvorm in en bestrooi deze met bloem");
    }
    public void coverBakingBinBottom() {
        System.out.println("6. Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }
    public void placeApplesInBakingBin() {
        System.out.println("7. Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }
    public void cutDough() {
        System.out.println("8. Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }
    public void crossLayers() {
        System.out.println("9. Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void placePieInOven() {
        System.out.println("10. Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

}