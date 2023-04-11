import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> colors = new HashSet<>();
        colors.add("Rouge");
        colors.add("Cyan");
        colors.add("Bleu");
        colors.add("Vert");
        System.out.println(colors);
        colors.remove("Rouge");

        Set<String> others = new HashSet<>();
        others.add("Jaune");
        others.add("Magenta");
        colors.addAll(others);

        System.out.println(colors);
        if (colors.contains("Vert")) {
            colors.remove("Vert");
        }
        System.out.println(colors);
        colors.removeAll(others);
        System.out.println(colors);
        colors.clear();
        others.clear();
        System.out.println(colors);
        System.out.println(others);
    }
}