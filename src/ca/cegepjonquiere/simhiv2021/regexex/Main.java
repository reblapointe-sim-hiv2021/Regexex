package ca.cegepjonquiere.simhiv2021.regexex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // CODE POSTAL ********************************************************
        Pattern patronCodePostal = Pattern.compile("([A-Z][0-9]){3}", Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);

        System.out.println("Entrez un code postal");
        String entree = in.nextLine();

        Matcher matche = patronCodePostal.matcher(entree);

        if(matche.find())
            System.out.println("Merci! Code postal entré : " + matche.group());
        else
            System.out.println("Ceci n'est pas un code postal.");

        // NOMBRES ************************************************************
        Pattern nombre = Pattern.compile("[\\d]+(,[\\d]+)?");
        System.out.println("Entrez des nombres, avec ou sans virgules");
        entree = in.nextLine();

        matche = nombre.matcher(entree);

        System.out.println("Voici tous les nombres que vous avez écrit : ");
        while (matche.find())
            System.out.println(matche.group());


        // Exemples de regex des notes de cours********************************
        Pattern codeCoursInfo = Pattern.compile("420-[A-Z]{3}-JQ");
        Pattern postalEspacePermis = Pattern.compile("\\b[A-Z][0-9][A-Z]\\s?[0-9][A-Z][0-9]\\b", Pattern.CASE_INSENSITIVE);
        Pattern courriel = Pattern.compile("\\b([a-z]|[0-9])+@[a-z]([a-z]|[0-9])*\\.[a-z]([a-z]|[0-9])*\\b");
        Pattern resistor = Pattern.compile("[NBROJVbMLoA]{4,5}");
    }
}