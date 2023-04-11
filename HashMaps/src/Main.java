import java.util.HashMap;
import java.util.Map;

public class Main {

    public enum Region {
        FRANCE,
        SWITZERLAND,
        POLYNESIA,
        MARTINIQUE,
    }

    public static class User {
        private String firstName;
        private Region region;

        public User(String firstName, Region region) {
            this.firstName = firstName;
            this.region = region;
        }

        public String getFirstName() {
            return firstName;
        }

        public Region getRegion() {
            return region;
        }
    }
    public static void main(String[] args) {
        Map<String, User> contacts = new HashMap<>();
        contacts.put("0680000000", new User("Boris", Region.FRANCE));
        contacts.put("0607070606", new User("Arthur", Region.POLYNESIA));
        contacts.put("0605000005", new User("Thibault", Region.SWITZERLAND));
        contacts.put("0700000700", new User("Estelle", Region.MARTINIQUE));

        System.out.println("Le numéro d'Arthur est " + contacts.get("Arthur"));

        for (Map.Entry<String, User> entry : contacts.entrySet()) {
            String prefix;
            switch (entry.getValue().getRegion()) {
                case FRANCE:
                    prefix = "+33";
                    break;
                case SWITZERLAND:
                    prefix = "+41";
                    break;
                case POLYNESIA:
                    prefix = "+689";
                    break;
                case MARTINIQUE:
                    prefix = "+596";
                    break;
                default:
                    prefix = "";
            }
            String telephone = entry.getKey();
            User user = entry.getValue();
            System.out.println("Nom : " + user.getFirstName() + " => Téléphone : " + prefix + formatPhoneNumber(telephone));
        }
    }

    public static void afficherCarnetContacts(Map<String, String> contacts) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            String nom = entry.getKey();
            String telephone = entry.getValue();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < telephone.length(); i++) {
                if (i > 0 && (i % 2 == 0)) {
                    sb.append(".");
                }
                sb.append(telephone.charAt(i));
            }
            String telephoneAvecPoints = sb.toString();

            System.out.println("Nom : " + nom + " => Téléphone : " + telephoneAvecPoints);
        }
    }
    public static String formatPhoneNumber(String phoneNumber) {
        return "(" + phoneNumber.substring(0, 1) + ")" + phoneNumber.substring(1);
    }
}