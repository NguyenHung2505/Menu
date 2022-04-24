package SinhVien;

import java.util.*;

public class DanhSachSinhVien {
    private List<SinhVien>sinhVienList= new ArrayList<SinhVien>();

    public DanhSachSinhVien() {}

//     Thêm sinh viên vào danh sách.
    public void themSinhVien(SinhVien sinhVien){
        this.sinhVienList.add(sinhVien);
    }

//    2.  in danh sách sinh viên ra màn hình.
    public void inDanhSachRaManHinh(){
        for (int i = 0; i < sinhVienList.size(); i++) {
            System.out.println(sinhVienList.get(i));
        }
    }

//   3. kiểm tra danh sách có rõng hay không?
    public boolean kiemTraDanhSachRong(){
        return this.sinhVienList.isEmpty();
    }

//   4. lấy ra sô lượng sv trong danh sách:
    public int laySoLuongSinhVien(){
        return this.sinhVienList.size();
    }

//    5. làm rỗng danh sách sinh viên.
    public void xoaTrangDanhSach(){
        this.sinhVienList.removeAll(sinhVienList);
    }

//    6.  kiểm tra sinh viên có tồn tại trong danh sách hay không (theo mã).
    public boolean kiemTraTonTai(SinhVien sinhVien){
        return this.sinhVienList.contains(sinhVien);
    }

//    7.  xoá 1 sinh viên ra khỏi danh sách dựa theo (mã sv).
    public boolean xoaSinhVien(SinhVien sinhVien){
        return this.sinhVienList.remove(sinhVien);
    }


//    8.  tìm kiếm tất cả sinh viên dựa trên tên được nhập từ bàn phím.
//    dung foreach
//    tìm tất cả các sinh viên dựa trên tên được nhập từ bàn phím.
    public void timSinhVien(String ten){
        for(SinhVien sinhVien: sinhVienList){
            if(sinhVien.getHoVaTen().indexOf(ten)>=0){
                System.out.println((sinhVien));
            }
        }

    }

    //       9.
//        xuất ra danh sách sinh viên có điểm từ cao đến thấp

    public void sapXepSinhVienGiamDanTheoDiem(){
        Collections.sort(this.sinhVienList, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sinhVien1, SinhVien sinhVien2) {
                if(sinhVien1.getDiemTrungBinh()<sinhVien2.getDiemTrungBinh()){
                    return 1;
                }else  if (sinhVien1.getDiemTrungBinh()>sinhVien2.getDiemTrungBinh()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }




}
