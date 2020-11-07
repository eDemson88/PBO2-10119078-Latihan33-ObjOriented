/*
 * NAMA: Adam Firdaus Darmawan
 * NIM: 10119078
 * KELAS: IF-2
 * DESKRIPSI: berisi codingan untuk login user
 */
package pboif2.pkg10119078.latihan33.objorienteduserlogin;

import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan33ObjOrientedUserLogin {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usName;
        String passWord;
        
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Username: ");
        usName = scanner.nextLine();
        
        System.out.print("Masukan Password: ");
        passWord = scanner.next();
        
        user.pengecekanLogin(usName, passWord);
        
        
        
        
        
    }
    
}
