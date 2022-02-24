public class Main {
    //entry point
    public static void main(String[] args){
        //pembuatan object peserta
        Peserta peserta1 = new Peserta();
        //teknik enkapsulasi
        peserta1.setId(01);
        peserta1.setNama("Gadang");
        peserta1.setTanggalLahir(18);
        peserta1.isiDaftarHadir();

//        System.out.println(peserta1.getId());
//        System.out.println(peserta1.getNama());
//        System.out.println(peserta1.getTanggalLahir());

        Siswa siswa1 = new Siswa();
        siswa1.setId(03);
        siswa1.setTanggalLahir(25);
        siswa1.setNama("Fathin");
        siswa1.setNoKartuPerpustakaan(123456);
        System.out.println(siswa1.getNama());
        System.out.println(siswa1.getNoKartuPerpustakaan());

        Guru guru1 = new Guru();
        guru1.setNama("Pak Wahyu");
        guru1.setNoKartuPegawai(12345);

        Dosen dosen1 = new Dosen();
        dosen1.setNama("Pak Dendy");
        dosen1.setNoKartuDosen(12345);

        System.out.println("Nama Guru :" + guru1.getNama() + ", No Kartu pegawai : "+
                guru1.getNoKartuPegawai());
        System.out.println("Nama Dosen :" + dosen1.getNama() + ", No Kartu DOsen : "+
                dosen1.getNoKartuDosen());
    }
}
