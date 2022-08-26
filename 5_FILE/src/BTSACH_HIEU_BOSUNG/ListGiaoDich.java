package BTSACH_HIEU_BOSUNG;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class ListGiaoDich {
	ArrayList<GiaoDich> giaoDichArr;
	DecimalFormat dt = new DecimalFormat("#,###.0");
	private int soLuongDat = 0, soLuongNha = 0;
	private double thanhTienDat = 0;
	private int count;
	private double tbc, sum = 0;
	private double dtln = 0;
	
	public ListGiaoDich() {
		super();
		giaoDichArr = new ArrayList<GiaoDich>();
		count = 0;
	}

	/*
	 * public void nhapList(int chon, Scanner scanner) {
	 * 
	 * if (count > 100) System.out.println("Khong the them du lieu!"); else { if
	 * (chon == 1) { GiaoDichDat giaoDichDat = new GiaoDichDat();
	 * giaoDichDat.nhap(scanner);
	 * 
	 * if (giaoDichArr.contains(giaoDichDat))
	 * System.out.println("Da ton tai giao dich nay");
	 * 
	 * else { giaoDichArr.add(giaoDichDat); soLuongDat++; thanhTienDat +=
	 * giaoDichDat.thanhTien(); } } else { GiaoDichNha giaoDichNha = new
	 * GiaoDichNha(); giaoDichNha.nhap(scanner); if
	 * (giaoDichArr.contains(giaoDichNha))
	 * System.out.println("Da ton tai giao dich nay"); else {
	 * giaoDichArr.add(giaoDichNha); soLuongNha++; } } count++; } }
	 */
	public Boolean themNV(int loai, Scanner sc) {
		GiaoDich i=null;
		if(loai==1) {
			i = new GiaoDichDat();
			i.nhap(sc);
		}else if (loai==2) {
			i = new GiaoDichNha();
			i.nhap(sc);
		}
		if(timKiem(i.getMaGiaoDich())) {
			System.out.println("that bai!. Ma nhan vien da ton tai!");
			return false;
		}else {
			giaoDichArr.add(i);
			System.out.println("them vao danh sach thanh cong!");
			return true;
		}
	}
	public Boolean timKiem(String ma) {
		for(GiaoDich i : giaoDichArr) {
			if(String.valueOf(i.getMaGiaoDich()).equals(String.valueOf(ma))) {
				return true;
			}
		}
		return false;
	}

	public void xuatList() {
		System.out.println("Danh sach cac giao dich: ");
		for (GiaoDich n : giaoDichArr) {
			System.out.println(n.toString());
		}
	}
//C2:XUAT LIST
//	public void xuatList() {
//		System.out.println("Danh sach cac giao dich: " );
//		for (int i = 0; i < giaoDichArr.size(); i++) {
//			System.out.println(giaoDichArr.get(i));
//		}
//	}

	// ====================DEM===============

	// TINH TONG SO LUONG TAT CA DANH SACH
	public int getSoLuongGD() {
		return giaoDichArr.size();
	}

	// C1: tinh so luong tung loai
	public int getSoLuongDat() {
		return soLuongDat;
	}

	public int getSoLuongNha() {
		return soLuongNha;
	}

	// C2 tinh so luong gd
	/*
	 * public int SLVang() { int count1 = 0; for (GiaoDich i : ds) if (i instanceof
	 * GDVang) count1++; return count1; } case 6: { lgd.SLVang();
	 */

	// C3:tinh so luong gd
	public void ThongKeSoLuongHoaDon() {
		int nha = 0, dat = 0;
		for (GiaoDich nd : giaoDichArr) {
			if (nd instanceof GiaoDichNha) {
				nha++;
			} else {
				dat++;
			}
		}
		System.out.println("Theo nha so so hoa don la: " + nha);
		System.out.println("Theo dat so so hoa don la: " + dat);
	}

	// C1: Đếm số dia chi cua giao dich nha không trùng nhau
	public int demdiachi1() {
		HashMap<String, GiaoDich> ht = new HashMap<String, GiaoDich>();
		for (GiaoDich gd : giaoDichArr) {
			if (gd instanceof GiaoDichNha)
				ht.put(((GiaoDichNha) gd).getDiaChi(), gd);
		}
		return ht.size();

	}

	// C2: Đếm số dia chi cua giao dich nha không trùng nhau
	public int demdiachi2() {
		HashSet<String> ht = new HashSet<String>();
		for (GiaoDich gd : giaoDichArr) {
			if (gd instanceof GiaoDichNha)
				ht.add(((GiaoDichNha) gd).getDiaChi());

		}
		return ht.size();
	}

	// C1: IN RA GIAO DICH NHA CO DIA CHI TRUNG =>CHUA HOAN THIEN
	public void indiachitrung() {
		HashSet<String> htt = new HashSet<String>();
		for (GiaoDich gd : giaoDichArr) {
			if (gd instanceof GiaoDichNha && htt.add(((GiaoDichNha) gd).getDiaChi()) == false)
				System.out.println(gd);
		}
	}
//		public void indiachitrung2() {
//			for(int i = 0; i < giaoDichArr.size(); i++) {
//				//if (giaoDichArr.get(i) instanceof GiaoDichNha) {
//				  if (giaoDichArr.lastIndexOf(giaoDichArr.get(i)) != i)  {
//				     System.out.println(giaoDichArr.get(i)+" is duplicated");
//				  }
//			//}
//		}}`

	// ===================TINH TOAN===========

	// TINH TB THANH TIEN GD DAT
	public float TBTTGDdat() {
		if (soLuongDat == 0)
			return 0;
		else
			return (float) (thanhTienDat / soLuongDat);
	}

	// C2: TINH TB THANH TIEN GD DAT
	/*
	 * public void thanhTienGiaoDichDat() { double tb = 0, tbc = 0; int d = 0;
	 * for(int i = 0; i < giaoDichArr.size(); i++) { if (giaoDichArr.get(i)
	 * instanceof GiaoDichDat) { tbc += ((GiaoDichDat)
	 * giaoDichArr.get(i)).thanhTien(); d++; } } tb = tbc / d;
	 * 
	 * System.out.println("Trung binh thanh tien cua GD dat: " + dt.format(tb)); }
	 */

	// TINH TONG THANH TIEN CUA TUNG LOAI VA TONG TAT CA TT
	public double ttnha = 0, ttdat = 0;

	public void TinhTongTungLoai() {
		for (GiaoDich n : giaoDichArr) {
			if (n instanceof GiaoDichNha) {
				ttnha += ((GiaoDichNha) n).thanhTien();
			} else {
				ttdat += ((GiaoDichDat) n).thanhTien();
			}
		}
		System.out.println("Tong tien nha: " + dt.format(ttnha));
		System.out.println("Tong tien dat: " + dt.format(ttdat));
		System.out.println("Tong tien: " + dt.format(ttdat + ttnha));
	}

	// TINH TONG TT THEO THANG NHAP VAO
	public void TongThanhtien_theothang(int thang) {
		NumberFormat fm = NumberFormat.getInstance(new Locale("vi", "VN"));
		double ttnha = 0, ttdat = 0;
		for (GiaoDich n : giaoDichArr) {
			if (n.getThoiGian().getThang() == thang) {
				// if(h.getNgayHD().getMonthValue() == thang && h.getNgayHD().getYear() == nam)
				// {
				if (n instanceof GiaoDichNha) {
					ttnha += ((GiaoDichNha) n).thanhTien();
				} else {
					ttdat += ((GiaoDichDat) n).thanhTien();
				}
			}
		}
		System.out.println("Tong tien trong thang la: " + fm.format(ttnha + ttdat));
	}

	// TINH TBC DON GIA CUA GD DAT
	public void xuatTongTBC() {
		for (GiaoDich n : giaoDichArr) {
			if (n instanceof GiaoDichDat) {
				sum += ((GiaoDichDat) n).getDonGia();
				tbc = sum / soLuongDat;
			}
		}
		System.out.println("Trung binh cong don gia gd dat: " + tbc);

	}

	// ===============XUAT GD THEO YEU CAU==========

//XUAT GD THEO MA GD
	public void xuatGD_magd(String magd) {
		for (int i = 0; i < giaoDichArr.size(); i++) {
			if (giaoDichArr.get(i).getMaGiaoDich().equalsIgnoreCase(magd))
				System.out.println(giaoDichArr.get(i).toString());
			else
				System.out.println("Ko thay ma");
		}
	}

//XUAT GD DAT THEO MAGD
	public void xuatGDDat_magd(String magd) {

		for (int i = 0; i < giaoDichArr.size(); i++) {
			if (giaoDichArr.get(i) instanceof GiaoDichDat && giaoDichArr.get(i).getMaGiaoDich().equalsIgnoreCase(magd))
				System.out.println(giaoDichArr.get(i).toString());
		}

	}

//XUAT GIAO DICH TRONG THANG 9 NAM 2013
	public void xuatThang9() {
		System.out.println("GD thang 9 la: ");
		for (GiaoDich i : giaoDichArr) {
			if (i.getThoiGian().getThang() == 9 && i.getThoiGian().getNam() == 2013) {
				System.out.println(i.toString());
			}

		}
	}
	// C2:XUAT GIAO DICH TRONG THANG 9 NAM 2013
//	public void xuatGiaDichThang9() {
//		System.out.println("Giao dich trong 9/2013: ");
//		for (int i = 0; i < giaoDichArr.size(); i++) {
//			if(giaoDichArr.get(i).getThoiGian().getThang() == 9 &&
//					giaoDichArr.get(i).getThoiGian().getNam() == 2013)
//				System.out.println(giaoDichArr.get(i).toString());
//		}
//	}

	// C3: DUNG LOCAL DATE
	/*
	 * public void SachThang3() { System.out.println("Sach thang 3"); for (int i =0;
	 * i < ds.size(); i++) { if (ds.get(i).getNgayNhap().getMonthValue() == 3) {
	 * System.out.println(ds.get(i).toString()); } } }
	 */

	// XUAT THONG TIN GD DAT
	public void xuatGDDat() {
		for (int i = 0; i < giaoDichArr.size(); i++)
			if (giaoDichArr.get(i) instanceof GiaoDichDat)
				System.out.println(giaoDichArr.get(i));

	}

	// XUAT GD NHA THUOC LOAI "THUONG"
	public void Xuatloaithuong_GDNha() {
		try {
			for (GiaoDich n : giaoDichArr) {
				if (((GiaoDichNha) n).getLoaiNha().equalsIgnoreCase("thuong")) {
					// xuat loai cao cap:
					// if (!((GiaoDichNha) n).getLoaiNha().equalsIgnoreCase("thuong")) {
					System.out.println(n.toString());
				}
			}
		} catch (Exception e) {

		}
	}

	// XUAT TAT CA GIAO DICH CO DON GIA >1K
	public void DonGia1K() {
		for (int i = 0; i < giaoDichArr.size(); i++) {
			if (giaoDichArr.get(i).getDonGia() > 1000) {
				System.out.println(giaoDichArr.get(i).toString());
			}
		}
	}

//LIET KE GD CO THANH TIEN<THANH TIEN CHUNG
	public void XuatTTThap() {
		double tongLuong = 0, luongTrungBinh;
		for (int i = 0; i < giaoDichArr.size(); i++) {
			tongLuong += giaoDichArr.get(i).thanhTien();
		}
		luongTrungBinh = tongLuong / giaoDichArr.size();

		for (int i = 0; i < giaoDichArr.size(); i++) {
			if (giaoDichArr.get(i).thanhTien() <= luongTrungBinh) {
				System.out.println(giaoDichArr.get(i).toString());
			}
		}
	}

///===========CAC HAM KHAC=============

//TIM KIEM tra ve magd

	public GiaoDich searchMa(String x) {// lay ham nay trong menu case
		for (GiaoDich i : giaoDichArr) {
			// if (i.getMaGiaoDich().compareToIgnoreCase(x) == 0)
			if (i.getMaGiaoDich().equalsIgnoreCase(x))
				return i;
		}
		return null;
	}

//Tim kiem tra ve vị tri
	public int timKiemViTri(String ma) {
		GiaoDich find = searchMa(ma);
		if (find != null)
			return giaoDichArr.indexOf(find);
		return -1;
	}

	// ===========XOA
//TESST THU
	public boolean xoaTestma(String ma) {
		return giaoDichArr.removeIf(h -> h.getMaGiaoDich() == ma);
	}

//XOA THANH CONG=>DUNG SEARCH
	public boolean xoaGD(String x) {
		if (searchMa(x) == null)
			return false;
		else
			giaoDichArr.remove(searchMa(x));
		return true;
	}

//XOA C2:KO DUNG SEARCH=>ko toi uu
	public void xoaMaGD(String magd) {
		for (int i = 0; i < giaoDichArr.size(); i++)
			if (giaoDichArr.get(i).getMaGiaoDich().equalsIgnoreCase(magd))
				giaoDichArr.remove(i);

	}

	// ================
//SUA=>TESTTHU
	public boolean suaTest(GiaoDich hhSua) {
		int vt = timKiemViTri(hhSua.getMaGiaoDich());
		if (vt != -1) {
			giaoDichArr.set(vt, hhSua);
			return true;
		} else
			return true;
	}

	// SUA don gia của giao dich dat THEO MAGD
	public boolean EditDongia(String maGD, int dongia) {
		try {
			for (GiaoDich n : giaoDichArr) {
				if (n.getMaGiaoDich().equalsIgnoreCase(maGD)) {
					((GiaoDichDat) n).setDonGia(dongia);
					;
					return true;
				}
			}
			return false;
		} catch (Exception e) {
			System.out.println("Khong phai giao dich dat");
			return false;
		}

	}
	// XOA PHAN TU LAP LẠI=>CHUA HOAN THIEN
	/*
	 * public void xoalap() { Set<GiaoDich> set = new
	 * LinkedHashSet<GiaoDich>(giaoDichArr); giaoDichArr.clear();
	 * giaoDichArr.add((GiaoDich) set); }
	 */

	// ===============SAP XEP================
	// TIM DIEN TICH LON NHAT
	public void timmax() {
		Collections.sort(giaoDichArr, new Comparator<GiaoDich>() {
			public int compare(GiaoDich emp1, GiaoDich emp2) {
				double sal1 = ((GiaoDich) emp1).getDienTich();
				double sal2 = ((GiaoDich) emp2).getDienTich();
				if (sal1 > sal2)
					return 1;
				else if (sal1 < sal2)
					return -1;
				else
					return 0;
			}

		});
		for (GiaoDich data : giaoDichArr) {

			dtln = data.getDienTich();
		}
		System.out.println("Highest dien tich is: " + dtln);
	}

	public void Xuatdtln() {
		for (int i = 0; i < giaoDichArr.size(); i++) {
			if (giaoDichArr.get(i).getDienTich() == dtln) {
				System.out.println(giaoDichArr.get(i).toString());
			}
		}
	}

//xuat dien tich cua ma gd lon nhat
	public void Timmaxdt() {
		/*
		 * GiaoDich max = Collections.max(giaoDichArr);
		 * System.out.println("ArrayList max value : " + max.getDienTich()+
		 * " for emp id : " + max.getMaGiaoDich() );
		 */

		/*
		 * for (int i = 1; i < giaoDichArr.size(); i++) { if (giaoDichArr.get(i) < min)
		 * { min = giaoDichArr.get(i); }
		 */
		for (int i = 0; i < giaoDichArr.size(); i++) {
			System.out.print(giaoDichArr.get(i) + " ");

			System.out.println();
			GiaoDich max = Collections.max(giaoDichArr);
			System.out.println("Maximum is : " + max.getDienTich());

		}
	}

	public ArrayList getAllGD() {
		return giaoDichArr;
	}

//SAP XEP THANH TIEN TANG DAN
	public void SapXepTT() {
		Collections.sort(giaoDichArr, new Comparator<GiaoDich>() {
			public int compare(GiaoDich gd1, GiaoDich gd2) {
				Float tmp1 = (Float) gd1.thanhTien();
				/*
				 * neu sap xep don gia, dien tich,.. Double tmp=(Double) gd1.getDienTich();
				 */
				Float tmp2 = (Float) gd2.thanhTien();
				return tmp1.compareTo(tmp2);
			}
		});
	}

	// SORT TANG THEO MAGD
	// public List<HangHoa> SapXepTangTenHang() {
	public void Tangmagd() {
		for (GiaoDich n : giaoDichArr)
			Collections.sort(giaoDichArr, new Comparator<GiaoDich>() {
				@Override
				public int compare(GiaoDich h1, GiaoDich h2) {
					// TODO Auto-generated method stub
					return h1.getMaGiaoDich().compareToIgnoreCase(h2.getMaGiaoDich());
				}

			});

	}

	// return dsHH;
	public void sepXepTheoMa() {
		Collections.sort(giaoDichArr);
	}
	// dao nguoc = revert
//			Collections.reverse(giaoDichArr);

	// so sanh so hay chuoi la nhung kieu du lieu nguyen thuy co kha nang tu so sanh
	// nen dung sort binh thuong Collections.sort(<ten_mang>)

	// cac thuoc tinh so
	// > return 1 || < return -1 || == return 0

	/*
	 * if(this.ten.comparetoInore(o.getTen > 0) return 1 else < 0 return -1 else {
	 * if(this.tuoi > o.getTuoi) return 1; else < return -1 else 0; }
	 * 
	 * 
	 * 
	 */

	// SAP XEP DON GIA GIAM DAN
	public void Sort_Giamdongia() {
		Collections.sort(giaoDichArr, new Comparator<GiaoDich>() {
			@Override
			public int compare(GiaoDich o1, GiaoDich o2) {
				Double s1 = o1.getDonGia();
				Double s2 = o2.getDonGia();
				return s2.compareTo(s1);
				// neu la so nguyen: Integer
			}
		});
	}

	// SAP XEP MAGD VA THANH TIEN(MA TRUOC TT SAU)
	public void SapXep_magd_tt() {
		Collections.sort(giaoDichArr, new Comparator<GiaoDich>() {
			public int compare(GiaoDich gd1, GiaoDich gd2) {
				int temp1 = gd1.getMaGiaoDich().compareToIgnoreCase(gd2.getMaGiaoDich());
				if (temp1 == 0) {
					if (gd1.thanhTien() == gd2.thanhTien())
						return 0;
					if (gd1.thanhTien() > gd2.thanhTien())
						return 1;
					else
						return -1;
				} else
					return temp1;
			}
		});
	}

	// Sắp xếp theo 3 thuộc tính
	// Từ don gia -> diện tích -> mã gd
	public void sortTheo3ThuocTinh() {
		Collections.sort(giaoDichArr, new Comparator<GiaoDich>() {
			public int compare(GiaoDich o1, GiaoDich o2) {
				// la int thi thay bang Integer
				int comp1 = ((Double) o1.getDonGia()).compareTo((Double) o2.getDonGia());
				if (comp1 == 0) {
					Double s1 = o1.getDienTich();
					Double s2 = o2.getDienTich();
					int comp2 = s2.compareTo(s1);
					if (comp2 == 0)
						return o1.getMaGiaoDich().compareToIgnoreCase(o2.getMaGiaoDich());
					else
						return comp2;

				} else
					return comp1;
			}
		});
	}
}
