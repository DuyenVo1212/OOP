package t1_Xe_nomenu;

public class Test {

	public static void main(String[] args) {
		AListXe lx = new AListXe();
		lx.AddXe(new NoiThanh("Noi 01","AAA", "Tuyen 8",30,19308,200));
		lx.AddXe(new NoiThanh("Noi 02","BBB", "Tuyen 7",20,45367,1500));
		lx.AddXe(new NgoaiThanh("Ngoai 02","CCC", "Tuyen 8","50",47028,20000));
		lx.AddXe(new NgoaiThanh("Ngoai 03","CCC", "Tuyen 8","70",50023,50000));
		lx.XuatXe();
		lx.XuatNoiThanh();
		System.out.println("Tong doanh thu cua cx "+lx.TongTien());
		lx.TongTienNoiThanh();
	}

}
