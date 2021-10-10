package View;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class TampilanMenuAdmin {

    public TampilanMenuAdmin() {
        TampilanAwalAdmin();
    }

    private void TampilanAwalAdmin() {
        int menu;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Selamat Datang Admin" + "\n"
                    + "Pilih kegiatan untuk mengatur\n"
                    + "1. Stock Barang\n"
                    + "2. List penjualan\n"
                    + "3. List pekerja\n"
                    + "4. Exit\n"));
        } while (menu < 1 || menu > 4);
        switch (menu) {
            case 1:
                TampilanMenuStockBarang();
                break;
            case 2:
                
                break;
            case 3:
                TampilanMenuListPekerja();
                break;
            case 4:
                
                break;
            default:

        }
    }
    
    private void TampilanMenuStockBarang(){
        int menu;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Pilih\n"
                    + "1. Menambah\n"
                    + "2. Mengurangi\n"
                    + "3. Melihat\n"
                    + "4. Exit\n"));
        } while (menu < 1 || menu > 4);
        switch (menu) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                
                break;
            case 4:
                
                break;
            default:

        }
    }
    
    private void TampilanMenuMelihatStockBarang(){
        int menu;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Pilih\n"
                    + "1. Bulan Sekarang\n"
                    + "2. Bulan Sebelum\n"
                    + "3. Exit\n"));
        } while (menu < 1 || menu > 3);
        switch (menu) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                
                break;
            default:

        }
    }
    
    private void TampilanMenuListPekerja(){
        int menu;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Pilih\n"
                    + "1. Menambah\n"
                    + "2. Mengurangi\n"
                    + "3. Melihat\n"
                    + "4. Exit\n"));
        } while (menu < 1 || menu > 4);
        switch (menu) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                
                break;
            case 4:
                
                break;
            default:

        }
    }
    
    private void TampilanMenuMelihatListPekerja(){
        int menu;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Pilih\n"
                    + "1. Bulan Sekarang\n"
                    + "2. Bulan Sebelum\n"
                    + "3. Exit\n"));
        } while (menu < 1 || menu > 3);
        switch (menu) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                
                break;
            default:

        }
    }
}
