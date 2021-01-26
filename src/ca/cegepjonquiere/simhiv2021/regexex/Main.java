package ca.cegepjonquiere.simhiv2021.regexex;
import java.io.Console;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern patronCodePostal = Pattern.compile("([a-zA-Z][0-9]){3}");

        Scanner in = new Scanner(System.in);

        System.out.println("Entrez un code postal");
        String entree = in.nextLine();

        boolean matche = patronCodePostal.matcher(entree).find();

        if(matche)
            System.out.println("Merci!");
        else
            System.out.println("Ceci n'est pas un code postal");

        Pattern codeCoursInfo = Pattern.compile("420-[A-Z]{3}-JQ");

        Pattern nombre = Pattern.compile("[0-9]+(,[0-9]+)?");

    }
}