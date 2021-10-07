package View;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class TampilanMenuKasir {

    public TampilanMenuKasir() {
    }
    
    private void tampilanAwal(){
         int menu;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Selamat Datang Kasir" + "\n"
                    + "Pilih\n"
                    + "1. Beli Barang\n"
                    + "2. Top Up dan Isi Pulsa\n"
                    + "3. Exit\n"));
        } while (menu < 1 || menu > 3);
        switch (menu) {
            case 1:
                tampilanMenuBeliBarang();
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:

        }
    }
    
    private void tampilanMenuBeliBarang(){
        int pilih;
        do {
            pilih = Integer.parseInt(JOptionPane.showInputDialog(null,
                     "Pilih Barang\n"
                    + "1. Makanan\n"
                    + "2. Minuman\n"
                    + "3. Perkakas\n"
                    + "4. Exit"));
        } while (pilih < 1 || pilih > 3);
        switch (pilih) {
            case 1:
                tampilanMenuPilihMakanan();
                break;
            case 2:
                tampilanMenuPilihMinuman();
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            default:

        }
    }
    
    private void tampilanMenuPilihMakanan(){
        int pilih;
        do {
            pilih = Integer.parseInt(JOptionPane.showInputDialog(null,
                     "Pilih Makanan\n"
                    + "1. \n"
                    + "2. \n"
                    + "3. \n"
                    + "4. Exit"));
        } while (pilih < 1 || pilih > 3);
        switch (pilih) {
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
    
     private void tampilanMenuPilihMinuman(){
        int pilih;
        do {
            pilih = Integer.parseInt(JOptionPane.showInputDialog(null,
                     "Pilih Minuman\n"
                    + "1. \n"
                    + "2. \n"
                    + "3. \n"
                    + "4. Exit"));
        } while (pilih < 1 || pilih > 3);
        switch (pilih) {
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
    
    private void tampilanMenuPilihPerkakas(){
        int pilih;
        do {
            pilih = Integer.parseInt(JOptionPane.showInputDialog(null,
                     "Pilih Perkakas\n"
                    + "1. \n"
                    + "2. \n"
                    + "3. \n"
                    + "4. Exit"));
        } while (pilih < 1 || pilih > 3);
        switch (pilih) {
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
    
    private void tampilanMenuPilihJenisTopUp(){
        int pilih;
        do {
            pilih = Integer.parseInt(JOptionPane.showInputDialog(null,
                     "Pilih Jenis Top Up atau Isi Pulsa\n"
                    + "1. Dana\n"
                    + "2. Ovo\n"
                    + "3. Isi Pulsa\n"
                    + "4. Mobile Legend"
                    + "5. Exit"));
        } while (pilih < 1 || pilih > 3);
        switch (pilih) {
            case 1:
            case 2:
            case 3:
                tampilanMenuPilihJumlahTopUp();
                break;
            case 4:
                
                break;
            default:

        }
        
        tampilanMenuPilihJumlahTopUp();
    }
    
    private void tampilanMenuPilihJumlahTopUp(){
        int pilih;
        do {
            pilih = Integer.parseInt(JOptionPane.showInputDialog(null,
                     "Pilih Jenis Top Up atau Isi Pulsa\n"
                    + "1. 25,000\n"
                    + "2. 50,000\n"
                    + "3. 100,0000\n"
                    + "4. Exit"));
        } while (pilih < 1 || pilih > 4);
        switch (pilih) {
            case 1:
            case 2:
            case 3:
                pembelianTopUpAtauIsiPulsa(1,2,3);
                break;
            case 4:
                
                break;
            default:

        }
    }
    
    private void pembelianTopUpAtauIsiPulsa(int pertama, int kedua, int ketiga){
        
    } 
}

