package BTJava;

import java.util.Date;
import java.util.Scanner;

public class Tinhlaisuat {
public double sotien;
/*public Date ngaygui;
public Date ngayrut;*/
public int thang;


public void tinhlaisuat() {
	Scanner intput=new Scanner(System.in);
	System.out.println("nhap so tien: ");
	sotien=intput.nextDouble();
	System.out.println("Nhap so thang gui: ");
	thang =intput.nextInt();
	double tienBanDau = sotien;
	//double laisuat=thang*0.1*sotien + sotien;
	for(int i=1;i<=thang;i++){
		sotien=i*0.1*sotien +sotien;
		System.out.println("Thang " + i + ": " + sotien);
	}
	double tienLai = sotien - tienBanDau;
	System.out.println("so tien nhan  la: " + tienLai);
}

	public static void main(String[] args) {
		Tinhlaisuat ls=new Tinhlaisuat();
		ls.tinhlaisuat();

	}

}
