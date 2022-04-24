package SinhVien;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>{
    private String id;
    private String hoVaTen;
    private int namSinh;
    private float diemTrungBinh;

    public SinhVien(String id) {
        this.id = id;
    }

    public SinhVien(String id, String hoVaTen, int namSinh, float diemTrungBinh) {
        this.id = id;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getHoVaTen() {return hoVaTen;}
    public void setHoVaTen(String hoVaTen) {this.hoVaTen = hoVaTen;}

    public int getNamSinh() {return namSinh;}
    public void setNamSinh(int namSinh) {this.namSinh = namSinh;}

    public float getDiemTrungBinh() {return diemTrungBinh;}
    public void setDiemTrungBinh(float diemTrungBinh) {this.diemTrungBinh = diemTrungBinh;}

    @Override
    public String toString() {
        return "SinhVien{" +
                "id='" + id + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", namSinh=" + namSinh +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }


//    9......
    @Override
    public int compareTo(SinhVien o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if(getClass()!= obj.getClass())
            return false;
        SinhVien other = (SinhVien) obj;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hoVaTen, namSinh, diemTrungBinh);
    }
}
