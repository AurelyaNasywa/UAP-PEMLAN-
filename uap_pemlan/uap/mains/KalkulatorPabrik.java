package uap.mains;

import java.util.Scanner;
import uap.models.Torus;
import uap.models.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAMA LENGKAP");
        System.out.println("NIM");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double major = sc.nextDouble();
        System.out.println(major);

        System.out.print("Isikan radius   : ");
        double minor = sc.nextDouble();
        System.out.println(minor);

        Torus torus = new Torus(major, minor);
        torus.printInfo();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double r = sc.nextDouble();
        System.out.println(r);

        Sphere sphere = new Sphere(r);
        sphere.printInfo();
        System.out.println("=============================================");
    }
}
