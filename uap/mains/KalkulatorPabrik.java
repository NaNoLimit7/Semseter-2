package uap.mains;

import java.util.Scanner;

import uap.models.Sphere;
import uap.models.Torus;

public class KalkulatorPabrik{

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAMA LENGKAP");
        System.out.println("NIM");
        System.out.println("=============================================");

        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double R = 7;
        System.out.println(R);
        System.out.print("Isikan radius   : ");
        double r = 3.5;
        System.out.println(r);
        System.out.println("=============================================");

        Torus torus = new Torus(R, r);
        torus.printInfo();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double radius = 21;
        System.out.println(radius);
        System.out.println("=============================================");

        Sphere sphere = new Sphere(radius);
        sphere.printInfo();
        System.out.println("=============================================");

        input.close();
  }
}