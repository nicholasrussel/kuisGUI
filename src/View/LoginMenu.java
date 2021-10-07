package View;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class LoginMenu {
    
    public LoginMenu() {
        TampilanAwal();
    }

    private void TampilanAwal() {
        int menu;
        
        do {
            do {
                menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Selamat Datang di Minimarket\n"
                        + "Pilih Logi sebagai\n"
                        + "1. Admin\n"
                        + "2. Kasir\n"
                        + "3. Exit\n"));
            } while (menu < 1 || menu > 3);
            switch (menu) {
                case 1:
                    // ada untuk verifikasi
                    new TampilanMenuAdmin();
                    break;
                    
                case 2:
                    
                    break;
                    
                default:
                
            }
        } while (menu != 3);
    }
    
    public static void main(String[] args) {
        new LoginMenu();
    }
}
