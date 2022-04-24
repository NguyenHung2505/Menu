package SinhVien;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luachon=0;
        do {
            System.out.println("MENU---------");
            System.out.println("vui lòng chn chức năng:");
            System.out.println(
                    " + 1.   Thêm sinh viên vào danh sách. \n"
                       +"2.  in danh sách sinh viên ra màn hình.\n"
                       +"3.  kiểm tra danh sách có rỗng hay không.\n"
                       +"4.  lấy ra số lượng sinh viên trong danh sách.\n"
                       +"5.  làm rỗng danh sách sinh viên.\n "
                       +"6.  kiểm tra sinh viên có tồn tại trong danh sách hay không (theo mã).\n"
                       +"7.  xoá 1 sinh viên ra khỏi danh sách dựa theo (mã sv).\n"
                       +"8.  tìm kiếm tất cả sinh viên dựa trên tên được nhập từ bàn phím.\n"
                       +"9.  xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
                       +"0.  thoát chương trình.");
                    luachon = sc.nextInt();
                    sc.nextLine();
            if(luachon==1){
//                1.   Thêm sinh viên vào danh sách.
                System.out.println("nhập mã sv:"); String id = sc.nextLine();
                System.out.println("nhập họ và tên:"); String hoVaTen=sc.nextLine();
                System.out.println("nhập năm sinh:"); int namSinh = sc.nextInt();
                System.out.println("nhập điểm trung bình:"); float diemTrungBinh = sc.nextFloat();
                SinhVien sv =new SinhVien(id,hoVaTen,namSinh,diemTrungBinh);
                dssv.themSinhVien(sv);

            }else if(luachon==2){
//                 in danh sách sinh viên ra màn hình.
                dssv.inDanhSachRaManHinh();

            }else if(luachon==3){
//                3.  kiểm tra danh sách có rỗng hay không.
                System.out.println(" danh sách rỗng : " + dssv.kiemTraDanhSachRong());

            }else if(luachon==4){
//                4.  lấy ra số lượng sinh viên trong danh sách.
                System.out.println("số lượng hiện tại : " + dssv.laySoLuongSinhVien());

            }else if(luachon==5){
//                5.  làm rỗng danh sách sinh viên.
                dssv.xoaTrangDanhSach();

            }else if(luachon==6){
//                6.  kiểm tra sinh viên có tồn tại trong danh sách hay không (theo mã)
                System.out.println("nhập mã sinh viên");
                String id = sc.nextLine();
                SinhVien sinhVien  = new SinhVien(id);
                System.out.println("kiểm tra sinh viên có trong danh sách: " + dssv.kiemTraTonTai(sinhVien));
            }else if(luachon==7){
//                7.  xoá 1 sinh viên ra khỏi danh sách dựa theo (mã sv).
                System.out.println("nhập mã sinh viên");String id = sc.nextLine();
                SinhVien sinhVien  = new SinhVien(id);
                System.out.println("xoá sinh viên trong danh sách:" + dssv.xoaSinhVien(sinhVien));
            }else if(luachon==8){
//                8.  tìm kiếm tất cả sinh viên dựa trên tên được nhập từ bàn phím.
                System.out.println("nhập họ và tên:"); String hoVaTen=sc.nextLine();
                System.out.println("kết quả tìm kiếm:");
                dssv.timSinhVien(hoVaTen);
            }else if(luachon==9){
//                9.  xuất ra danh sách sinh viên có điểm từ cao đến thấp.
                dssv.sapXepSinhVienGiamDanTheoDiem();
                dssv.inDanhSachRaManHinh();
            }

        } while (luachon!=0);
    }
}
