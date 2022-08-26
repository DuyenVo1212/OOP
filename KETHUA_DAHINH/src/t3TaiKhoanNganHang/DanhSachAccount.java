package t3TaiKhoanNganHang;

public class DanhSachAccount {
	private Account accKH[];
	public int soLuongAcc = 0;
	
	public DanhSachAccount(int soLuongKhoiTao) {
		accKH = new Account[soLuongKhoiTao];
	}

	public Account[] getHetDanhSach() {
		return accKH;
	}
	
	public void tangKichThuocMang() {
		Account tempAcc[] = new Account[accKH.length * 2];
		for (int i = 0; i < accKH.length; i++) {
			tempAcc[i] = accKH[i];
		}
		accKH = tempAcc;
	}

	public void themACC(Account acc) throws Exception {
		if(timKiem(acc.getMaAcc()) == -1) {
			if (soLuongAcc == accKH.length)
				tangKichThuocMang();
			accKH[soLuongAcc] = acc;
			soLuongAcc++;
		}
		else
			throw new Exception("Trùng mã");
	}

	public int timKiem(long maAcc) {
		for (int i = 0; i < soLuongAcc; i++) {
			if (maAcc == accKH[i].getMaAcc())
				return i;
		}
		return -1;
	}

	public boolean xoaAcc(long maAcc) {
		int temp = timKiem(maAcc);
		if(temp == -1)
			return false;
		for(int i = temp; i < soLuongAcc - 1; i++) {
			accKH[i] = accKH[i + 1];
		}
		soLuongAcc--;
		return true;
	}
	
	public void suaAcc(Account accSua) {
		int viTriTimThay = timKiem(accSua.getMaAcc());
		if(viTriTimThay != -1) 
			accKH[viTriTimThay] = accSua;
	}
	
	public Account timKiemMa(long maTim) {
		for (int i = 0; i < soLuongAcc; i++) {
			if(maTim == accKH[i].getMaAcc())
				return accKH[i];
		}
		return null;
	}
	
	public void suaThongTin(Account acc, int diaChi) {
		accKH[diaChi] = acc;
	}
	
	public Account[] getDanhSach() {
		return accKH;
	}
}
