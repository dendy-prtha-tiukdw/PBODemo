
public class Peserta {

    //attribute dari class
    //access privilege : private, public, protected
    private int id;
    private String nama;
    private int tanggalLahir;

    //method/behavior
    public void isiDaftarHadir()
    {
        System.out.println("Isi Daftar Hadir");
    }

    public void setId(int idBaru){
        id = idBaru;
    }

    public int getId(){
        return id;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String namaBaru){
        nama = namaBaru;
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggallahirBaru){
        tanggalLahir = tanggallahirBaru;
    }


}
