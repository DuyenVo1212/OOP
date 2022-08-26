package t5QuanLyChuyenXe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachChuyenXe {
		ArrayList<ChuyenXe> dsCx;
		 
		public DanhSachChuyenXe() {
			dsCx = new ArrayList();
		}
		
		public boolean themCX(ChuyenXe cx) {
			if(dsCx.contains(cx))
			{
				return false;
			}
			else 
				dsCx.add(cx);
			return true;
		}	
		
		public double tongDThuNoiThanh() {
			double s =0;
			for (ChuyenXe cx : dsCx )
			{
				if(cx instanceof ChuyenXeNoiThanh)
					s+= cx.doanhThu;
			}
			return s;
		}
		
		public double tongDThuNgoaiThanh() {
			double s =0;
			for (ChuyenXe cx : dsCx ) 
			{
				if(cx instanceof ChuyenXeNgoaiThanh)
					s+= cx.doanhThu;
			}
			return s;
		}
	
		public ChuyenXe timXe(String ma) {
			for(ChuyenXe cx: dsCx)
			{
				if(cx.getMaXe().equalsIgnoreCase(ma))
					return cx;
			}
			return null;
		}
		
		public int TimBaDao(String hoTenTX) {
			int vitri = dsCx.indexOf(hoTenTX);
			return vitri;
		}
		
		public void xoa(ChuyenXe cx) {
			dsCx.remove(cx);
		}
		
		public void Sua(ChuyenXe cx) {
			int vitri=dsCx.indexOf(cx);
			if(vitri>=0)
				dsCx.set(vitri,cx);
		}
		
		public ArrayList getAllCX() {
			return dsCx;
		}
		
		public void SapXepSoNguyen() {
			Collections.sort(dsCx, new Comparator<ChuyenXe>() {
				public int compare(ChuyenXe xe1, ChuyenXe xe2) {
					Double tmp1 = (Double) xe1.getDoanhThu();
					Double tmp2 = (Double) xe2.getDoanhThu();
					return tmp1.compareTo(tmp2);
				}
			});
		}
		
		public void SapXep_Tenvs_DT() {
			Collections.sort(dsCx, new Comparator<ChuyenXe>() {
				public int compare(ChuyenXe xe1, ChuyenXe xe2) {
					int temp1= xe1.getHoTenTX().compareToIgnoreCase(xe2.getHoTenTX());
					if(temp1==0) {
						if(xe1.getDoanhThu()==xe2.getDoanhThu())
							return 0;
						if(xe1.getDoanhThu()>xe2.getDoanhThu())
							return 1;
						else return -1;
					}
					else return temp1;
				}
			});
		}
}
