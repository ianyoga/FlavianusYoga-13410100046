import java.io.*;

public class MenuMakanArray
{
	public static void main (String []args) throws IOException 
	{ BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		
		int[] harga = new int [5];
		int[] total = new int [5];
		int[] jmlPesanan = new int [5];
		int totalTransaksi = 0;
		int pil = 0;
		
		do 
		{
			System.out.println("====================");
			System.out.println("   MENU MAKANAN	");
			System.out.println("====================");
			System.out.println("1.	SOTO AYAM  		= Rp. 17000 ");
			System.out.println("2.	NASI RAWON 		= Rp. 15000");
			System.out.println("3.	GADO-GADO  		= Rp. 8000");
			System.out.println("4.	ES TEH	   		= Rp. 3000 ");
			System.out.println("5.	ES JERUK   		= Rp. 2000");
			System.out.println("6.	TOTAL TRANSAKSI	=");
			System.out.print("MASUKKAN NO PILIHAN  (1-6):");
			System.out.println();
			pil = Integer.parseInt(br.readLine());
			
		
				switch(pil)
				{
					case 1:
					harga[0] = 17000;
					System.out.println();
					System.out.println("====================");
					System.out.println("   MENU MAKANAN		");
					System.out.println("====================");
					System.out.println("	SOTO AYAM		");
					System.out.println("HARGA :" + harga[0]);
					System.out.println("MASUKKAN JUMLAH PESANAN:");
					jmlPesanan[0] = Integer.parseInt(br.readLine());
					total[0] = harga[0]*jmlPesanan[0];
					System.out.println("SUB TOTAL =" + total[0]);
					System.out.println();
					break;
					
					case 2:	
					harga[1] = 15000;
					System.out.println();
					System.out.println("====================");
					System.out.println("   MENU MAKANAN	");
					System.out.println("====================");
					System.out.println("	NASI RAWON		");
					System.out.println("HARGA : Rp" + harga[1]);
					System.out.println("MASUKKAN JUMLAH PESANAN:");
					jmlPesanan[1] = Integer.parseInt(br.readLine());
					total[1] = harga[1]*jmlPesanan[1];
					System.out.println("SUB TOTAL =" + total[1]);
					System.out.println();
					break;
					
					case 3:
					harga[2] = 8000;
					System.out.println();
					System.out.println("====================");
					System.out.println("   MENU MAKANAN		");
					System.out.println("====================");
					System.out.println("	GADO - GADO		");
					System.out.println("HARGA : Rp" + harga[2]);
					System.out.println("MASUKKAN JUMLAH PESANAN:");
					jmlPesanan[2] = Integer.parseInt(br.readLine());
					total[2] = harga[2]*jmlPesanan[2];
					System.out.println("SUB TOTAL =" + total[2]);
					System.out.println();
					break;
					
				
					case 4:
					harga[3] = 2000;
					System.out.println();
					System.out.println("====================");
					System.out.println("   MENU MAKANAN	");
					System.out.println("====================");
					System.out.println("		ES TEH		");
					System.out.println("HARGA : Rp" + harga[3]);
					System.out.println("MASUKKAN JUMLAH PESANAN:");
					jmlPesanan[3] = Integer.parseInt(br.readLine());
					total[3] = harga[3]*jmlPesanan[3];
					System.out.println("SUB TOTAL =" + total[3]);
					System.out.println();
					break;
					
					case 5:
					harga[4] = 3000;
					System.out.println();
					System.out.println("====================");
					System.out.println("   MENU MAKANAN	");
					System.out.println("====================");
					System.out.println("	ES JERUK		");
					System.out.println("HARGA : Rp" + harga[4]);
					System.out.println("MASUKKAN JUMLAH PESANAN:");
					jmlPesanan[4] = Integer.parseInt(br.readLine());
					total[4] = harga[4]*jmlPesanan[4];
					System.out.println("SUB TOTAL =" + total[4]);
					System.out.println();
					
					break;
					case 6:
					System.out.println();
					System.out.println("========================");
					System.out.println("  TOTAL TRANSAKSI		");
					System.out.println("========================");
					System.out.println("SOTO AYAM =" + total[0]);
					System.out.println("NASI RAWON =" + total[1]);
					System.out.println("GADO - GADO =" + total[2]);
					System.out.println("ES TEH =" + total[3]);
					System.out.println("ES JERUK =" + total[4]);
					totalTransaksi = total[0]+total[1]+total[2]+total[3]+total[4];
					System.out.println("TOTAL TRANSAKSI =" + totalTransaksi);
					System.out.println();
					break;
					
				default: break;
			}			
		}
		while(pil<6);
	}
}