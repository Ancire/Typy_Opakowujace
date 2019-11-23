package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        /*
        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(image, "png", new File("C:\\Users\\grimb\\Desktop\\zdj.png"));
        */

        /*
        File data = new File("dane.txt");
        Scanner in = new Scanner(data);
        String z1, z2, z3;
        int a, b, c;
        z1 = in.nextLine();
        z2 = in.nextLine();
        z3 = in.nextLine();
        a = Integer.valueOf(z1);
        b = Integer.valueOf(z2);
        c = Integer.valueOf(z3);
        System.out.println("a = " + a + " , b = " + b + " , c = " + c);
        System.out.println("a + b + c = " + (a + b + c));


        String liczba1 = in.nextLine();
        String liczba2 = in.nextLine();
        BigInteger x = new BigInteger(liczba1);
        BigInteger y = new BigInteger(liczba2);

        System.out.println("x = " + x.toString() + " , y = " + y.toString());
        System.out.println("x + y = " + (x.add(y)));
        in.close();

         */

        String filePath = "dane.txt";
        int a = 0, b = 0, c = 0;
        BigInteger bigA = null, bigB = null;
        try (
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);){
            a = Integer.valueOf(bufferedReader.readLine());
            b = Integer.valueOf(bufferedReader.readLine());
            c = Integer.valueOf(bufferedReader.readLine());

            bigA = new BigInteger(bufferedReader.readLine());
            bigB = new BigInteger(bufferedReader.readLine());

            System.out.println("a = " + a + " , b = " + b + " , c = " + c);
            System.out.println("a + b + c = " + (a + b + c));

            System.out.println("x = " + bigA.toString() + " , y = " + bigB.toString());
            System.out.println("x + y = " + (bigA.add(bigB)));
        }
         catch (FileNotFoundException e) {
            System.out.println("Nie znalezion pliku" + filePath + ".txt");
        } catch (IOException e) {
            System.out.println("Blad IN/OUT");
        }


    }
}
