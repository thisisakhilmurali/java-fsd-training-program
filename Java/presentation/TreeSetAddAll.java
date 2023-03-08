package presentation;
import java.util.TreeSet;
public class TreeSetAddAll {
    public static void main(String[] ar) {

                TreeSet<String> linuxDistro = new TreeSet<>();

                // Using the add() method
                linuxDistro.add("Ubuntu");
                linuxDistro.add("Fedora");
                linuxDistro.add("Deepin");
                linuxDistro.add("Debian");
                System.out.println("TreeSet: " + linuxDistro);

                TreeSet<String> secureLinuxDistro = new TreeSet<>();
                secureLinuxDistro.add("Tails");
                secureLinuxDistro.add("Qubes");
                secureLinuxDistro.add("Ubuntu");

                // Using the addAll() method
                linuxDistro.addAll(secureLinuxDistro);
                System.out.println("New TreeSet: " + linuxDistro);

    }
}
