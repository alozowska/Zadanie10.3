import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TestProdukty {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("produkty.csv");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String product = scan.nextLine();
            String[] tablica = product.split(";");
            Product p = new Product(tablica[0], tablica[1], Double.valueOf(tablica[2]));
            Product[] products = new Product[tablica.length];
            public double obliczSume (Product[]products){
                double suma = 0;
                for (int i = 0; i < products.length; i++) {
                    double suma = suma + product[i].getCena;
                }
                return suma;
            }


        }
    }
}
