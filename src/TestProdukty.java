import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TestProdukty {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("produkty.csv");
        Scanner scan = new Scanner(file);
        Product[] products = new Product[3];
        int i=0;
        while (scan.hasNextLine()) {
            String product = scan.nextLine();
            String[] tablica = product.split(";");
            products[i] = new Product(tablica[0], tablica[1], Double.valueOf(tablica[2]));
            i++;
        }
        double wynikSumowania=obliczSume( products );
        System.out.println(wynikSumowania);
        Product najdrozszy=znajdzNajdrozszy(products);
        System.out.println(najdrozszy);

    }
    private static double obliczSume (Product[] products){
        double suma = 0;
        for (int i = 0; i < products.length; i++) {
            suma = suma + products[i].getCena();
        }
        return suma;

    }
    private static Product znajdzNajdrozszy(Product[] products){
         Product max=products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].getCena()>max.getCena()){
                max=products[i];
            }
        }
        return max;
    }

}
