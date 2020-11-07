/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan33.objorienteduserlogin;

/**
 *
 * @author ryzen
 */
public class User {
    private String username = "Adam Firdaus D";
    private String password = "10119078";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword){
        return (parUserName.equals(username)) && (parPassword.equals(password));
}
    private void hasilLogin(boolean statusAkun, String parUserName){
        if(statusAkun){
            parUserName = parUserName.toUpperCase();
            System.out.println("\n========HALLO " + parUserName + "========");
            System.out.println("Selamat datang di Aplikasi ini");
        }
        else{
            System.out.println("\nOooops, Username atau Password anda salah");
        }
}
    public void pengecekanLogin(String parUserName, String parPassword){
        statusAkun = cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun,parUserName);
    }
}
