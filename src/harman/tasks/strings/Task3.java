package harman.tasks.strings;

import java.util.Scanner;

public class Task3 {
    private String name;
    private String surname;

    public void computeInitials() {
        getFillName();
        getInitials(name, surname);
        printInitials();
    }

    private void getFillName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = in.nextLine();
        System.out.println("Enter your surname: ");
        surname = in.nextLine();
    }

    public String getInitials(String name, String surName) {
        String initials = " . .";
        if (name != null && surName != null) {
            initials = String.valueOf(new char[] {name.charAt(0), '.', surName.charAt(0), '.'});
        }
        return initials;
    }

    private void printInitials() {
        System.out.println(getInitials(name, surname));
    }

    public static void main(String[] args) {
        Task3 t3 = new Task3();
        t3.computeInitials();
    }
}
