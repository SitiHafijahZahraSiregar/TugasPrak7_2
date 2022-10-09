class Mahasiswa{
   
    private String nama;
    private String NPM;
    private double nilaiTugas;
    private double nilaiUts;
    private double nilaiUas;
    private double NA;

    public Mahasiswa (String nama, String NPM, double nilaiTugas, double nilaiUts, double nilaiUas){
        this.nama = nama;
        this.NPM = NPM;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }
    
   
    public void printData(String jurusan){
        System.out.println("NPM : " + this.getNPM());
        System.out.println("Nama : " + this.getNama());
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Nilai tugas : " + this.getNilaiTugas());
        System.out.println("Nilai UTS : " + this.getNilaiUts());
        System.out.println("Nilai UAS : " + this.getNilaiUas());
        System.out.println("Nilai akhir : " + this.getNA());
    }
    
    public void printData(){
        System.out.println("NPM : " + this.getNPM());
        System.out.println("Nama : " + this.getNama());
        System.out.println("Nilai tugas : " + this.getNilaiTugas());
        System.out.println("Nilai UTS : " + this.getNilaiUts());
        System.out.println("Nilai UAS : " + this.getNilaiUas());
        System.out.println("Nilai akhir : " + this.getNA());
    }
    
    public int sumValue(int x, int y){
        return x+y;
    }
    
    public void hitungNA(){
        this.setNA((this.getNilaiTugas() * 0.3) + (this.getNilaiUts() * 0.35) + (this.getNilaiUas() * 0.35));
    }
    
    public void hitungNA(double nilaiTugas, double nilaiUts, double nilaiUas){
        this.setNA((this.getNilaiTugas() * 0.3) + (this.getNilaiUts() * 0.35) + (this.getNilaiUas() * 0.35));
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNPM() {
        return NPM;
    }
    
    public void setNPM(String NPM) {
        this.NPM = NPM;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public double getNilaiUts() {
        return nilaiUts;
    }

    public void setNilaiUts(double nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    public double getNilaiUas() {
        return nilaiUas;
    }

    public void setNilaiUas(double nilaiUas) {
        this.nilaiUas = nilaiUas;
    }

    public double getNA() {
        return NA;
    }
    
    public void setNA(double NA) {
        this.NA = NA;
    }
    
}
