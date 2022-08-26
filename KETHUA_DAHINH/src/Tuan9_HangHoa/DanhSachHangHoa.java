package Tuan9_HangHoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachHangHoa {
	private List<HangHoa> dsHH;

	public DanhSachHangHoa() {
		dsHH = new ArrayList<HangHoa>();
	}

	public boolean themHangHoa(HangHoa hh) {
		if (dsHH.contains(hh))
			return false;
		else
			dsHH.add(hh);
		return true;
	}

	@Override
	public String toString() {
		String s = "";
		s += "Hàng thực phẩm:\n" + HangThucPham.getTieuDe() + "\n";
		for (HangHoa hangHoa : dsHH) {
			if (hangHoa instanceof HangThucPham)
				s += hangHoa + "\n";
		}
		s += "Hàng điện máy\n" + HangDienMay.getTieuDe() + "\n";
		for (HangHoa hangHoa : dsHH) {
			if (hangHoa instanceof HangDienMay)
				s += hangHoa + "\n";
		}
		s += "Hàng sành sứ\n" + HangSanhSu.getTieuDe() + "\n";
		for (HangHoa hangHoa : dsHH) {
			if (hangHoa instanceof HangSanhSu)
				s += hangHoa + "\n";
		}

		return s;
	}
	public String xuatTP()
	{
		String s = "";
		s += "Hàng thực phẩm:\n" + HangThucPham.getTieuDe() + "\n";
		for (HangHoa hangHoa : dsHH) {
			if (hangHoa instanceof HangThucPham)
				s += hangHoa + "\n";
		}
		return s;
	}
	public String xuatDM()
	{
		String s = "";
		s += "Hàng điện máy\n" + HangDienMay.getTieuDe() + "\n";
		for (HangHoa hangHoa : dsHH) {
			if (hangHoa instanceof HangDienMay)
				s += hangHoa + "\n";
		}
		return s;
	}
	public String xuatSS()
	{
		String s = "";
		s += "Hàng sành sứ\n" + HangSanhSu.getTieuDe() + "\n";
		for (HangHoa hangHoa : dsHH) {
			if (hangHoa instanceof HangSanhSu)
				s += hangHoa + "\n";
		}
		return s;
	}
	public HangHoa timKiem(String maHang) {
		for (HangHoa hh : dsHH)
			if (hh.getMaHang().equalsIgnoreCase(maHang))
				return hh;
		return null;
	}

	public int timKiemViTri(String maHang) {
		HangHoa timHH = timKiem(maHang);
		if (timHH != null)
			return dsHH.indexOf(timHH);
		return -1;
	}

	public boolean xoaTheoMa(String ma) {
		return dsHH.removeIf(h -> h.getMaHang() == ma);
	}

	public boolean xoaHangHoa(String maHang) {
		HangHoa hh = timKiem(maHang);
		if (hh != null) {
			dsHH.remove(hh);
			return true;
		} else
			return false;
	}

	public boolean suaDonGia(String ma, double donGiaMoi) {
		for (HangHoa hangHoa : dsHH) {
			if (hangHoa.getMaHang().equalsIgnoreCase(ma)) {
				hangHoa.setDonGia(donGiaMoi);
				return true;
			}
		}
		return false;
	}

	public boolean suaThongTinHangHoa(HangHoa hhSua) {
		int vt = timKiemViTri(hhSua.getMaHang());
		if (vt != -1) {
			dsHH.set(vt, hhSua);
			return true;
		} else
			return true;
	}

	public List<HangHoa> layDSKhoBan() {
		List<HangHoa> kq = new ArrayList<HangHoa>();
		for (HangHoa hangHoa : dsHH) {
			if (hangHoa.danhGia().equalsIgnoreCase("Khó bán"))
				kq.add(hangHoa);
		}
		return kq;
	}

	public void sapXepTangDanTheoTen() {
		Collections.sort(dsHH, new Comparator<HangHoa>() {
			public int compare(HangHoa o1, HangHoa o2) {
				if (o1 == null || o2 == null)
					return 0;
				return o1.getTenHang().compareToIgnoreCase(o2.getTenHang());
			}

		});
	}

	public List<HangHoa> SapXepTangTenHang() {
		Collections.sort(dsHH, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa h1, HangHoa h2) {
				// TODO Auto-generated method stub
				return h1.getTenHang().compareToIgnoreCase(h2.getTenHang());
			}
		});
		return dsHH;
	}

	public void sapXepGiamDanTheoSLT() {
		Collections.sort(dsHH, new Comparator<HangHoa>() {
			public int compare(HangHoa o1, HangHoa o2) {
				if (o1 == null || o1 == null)
					return 0;
				return Integer.compare(o2.getSoLuongTon(), o1.getSoLuongTon());
			}
		});
	}

	public List<HangHoa> SapXepGiamSoLuong() {
		Collections.sort(dsHH, Collections.reverseOrder(new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa h1, HangHoa h2) {
				Integer hanghoa1 = h1.getSoLuongTon();
				Integer hanghoa2 = h2.getSoLuongTon();
				return hanghoa1.compareTo(hanghoa2);
			}
		}));
		return dsHH;
	}
}
