package week8.Geographic;

public class Main {

    public static void main(String[] args) {
        ManageEastAsiaCountries m = new ManageEastAsiaCountries();
        EastAsiaCountries vietnam = new EastAsiaCountries("Mountainous", "VN", 331212, "Vietnam");
        EastAsiaCountries thailand = new EastAsiaCountries("Plains and mountains", "TH", 513120, "Thailand");
        EastAsiaCountries indonesia = new EastAsiaCountries("Archipelago", "ID", 1904569, "Indonesia");
        EastAsiaCountries philippines = new EastAsiaCountries("Archipelago", "PH", 300000, "Philippines");
        EastAsiaCountries malaysia = new EastAsiaCountries("Peninsular and Borneo", "MY", 330803, "Malaysia");
        EastAsiaCountries singapore = new EastAsiaCountries("Island", "SG", 728, "Singapore");
        EastAsiaCountries laos = new EastAsiaCountries("Mountainous", "LA", 236800, "Laos");
        EastAsiaCountries cambodia = new EastAsiaCountries("Plains and forests", "KH", 181035, "Cambodia");
        EastAsiaCountries myanmar = new EastAsiaCountries("Mountains and valleys", "MM", 676578, "Myanmar");
        EastAsiaCountries brunei = new EastAsiaCountries("Coastal", "BN", 5765, "Brunei");
        m.add(vietnam);
        m.add(thailand);
        m.add(indonesia);
        m.add(philippines);
        m.add(malaysia);
        m.add(singapore);
        m.add(laos);
        m.add(cambodia);
        m.add(myanmar);
        m.add(brunei);
        
        m.display();
    }
}
