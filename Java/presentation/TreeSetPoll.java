package presentation;

import java.util.TreeSet;

class TreeSetPoll {
    public static void main(String[] args) {
        TreeSet<String> googleApps = new TreeSet<>();

        googleApps.add("Google Maps");
        googleApps.add("Google Mail");
        googleApps.add("Google Meet");
        googleApps.add("Google Search");
        googleApps.add("Google Drive");
        googleApps.add("Google Assistant");

        System.out.println("TreeSet: " + googleApps);

        // Using pollFirst()
        System.out.println("Removed First Element: " + googleApps.pollFirst());

        // Using pollLast()
        System.out.println("Removed Last Element: " + googleApps.pollLast());

        System.out.println("New TreeSet: " + googleApps);
    }
}

