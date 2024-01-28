import hewan.Kambing;
import pedagang.Pedagang;
import pedagang.Pedagang;

public class Main {
    public static void main(String[] args) {
        Pedagang pedagang = new Pedagang(5);

        // Beli hewan
        pedagang.beliHewan(new Kambing("Kambing A",7,10,15));
        pedagang.beliHewan(new Kambing("Kambing B",10,13,18));

        // Tampilkan data hewan
        System.out.println("Data setelah pembelian:");
        pedagang.tampilkanDataHewan();

        // Perkembangan bulanan
        pedagang.perkembanganBulanan();

        // Tampilkan data hewan setelah perkembangan bulanan
        System.out.println("Data setelah perkembangan bulanan:");
        pedagang.tampilkanDataHewan();
    }
}