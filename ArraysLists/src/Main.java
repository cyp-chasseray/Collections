import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("France"));
        countries.add(new Country("Germany"));
        countries.add(new Country("Italy"));
        System.out.println("La collection créée contient " + countries.size() + " pays !");
        countries.clear(); // Vide la collection

        if (countries.isEmpty()) {
            System.out.println("Liste vide");
        } else {
            for (Country country : countries) {
                System.out.println(country.getName());
            }
        }
        countries.add(new Country("Spain"));
        countries.add(new Country("Zimbabwe"));
        countries.add(new Country("Netherlands"));
        countries.add(new Country("Belgium"));
        countries.add(new Country("Cyprus"));

        for (Country country : countries) {
            System.out.println(country.getName());
        }

        // Modification du nom d'un pays
        for (Country country : countries) {
            if (country.getName().equals("Spain")) {
                country.setName("Espagne");
            }
        }

        // Affichage de la liste mise à jour
        System.out.println("La collection mise à jour contient " + countries.size() + " pays !");
        for (Country country : countries) {
            System.out.println(country.getName());

        }
        List<String> countriesText = new ArrayList<>();
        countriesText.add("FRANCE");
        countriesText.add("BELGIQUE");
        Collections.sort(countriesText);

        for (String countryText:countriesText) {
            System.out.println(countryText);
        }

        Collections.sort(countries, new CountriesComparator());
        for (Country country : countries) {
            System.out.println(country.getName());
        }

        Iterator<Country> iterator = countries.iterator();
        while (iterator.hasNext()) {
            Country country = iterator.next();
            if (country.getName().length() > 6) {
                System.out.println("deleting " + country.getName());
                iterator.remove();
            }
        }
    }
}
