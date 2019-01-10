import java.io.*;
public class Raport{
    BufferedReader buff;
    double nilai[][] = new double[3][4];
    double avrgSiswa[] = new double [3];
    double avrgPelajaran[] = new double [4];
    public static void main(String[] args){
        Raport viewRaport = new Raport();
    }
    private Raport(){
        buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("=======================================================================================================");
        System.out.println("                                            SELAMAT DATANG                                             ");
        System.out.println("=======================================================================================================");
        inputNilai();
        cls();
        viewNilai();
    }
    void viewNilai(){
        OlahNilai oNilai = new OlahNilai(nilai);
        System.out.println("=======================================================================================================");
        System.out.println("                                          REKAP NILAI RAPORT                                           ");
        System.out.println("=======================================================================================================");
        System.out.printf("+----------------------+---------------+---------------+---------------+---------------+-------------+%n");
        System.out.printf("|         Nama         |  Pelajaran-1  |  Pelajaran-2  |  Pelajaran-3  |  Pelajaran-4  |  Rata-rata  |%n");
        System.out.printf("+----------------------+---------------+---------------+---------------+---------------+-------------+%n");
        for (int a = 0; a < nilai.length; a++){
            avrgSiswa[a] = oNilai.getAvrgSiswa(a);
            System.out.printf("| %20s | %13s | %13s | %13s | %13s | %11s |%n", "Siswa ke-"+(a+1)+"     ", nilai[a][0], nilai[a][1], nilai[a][2], nilai[a][3], avrgSiswa[a]);
        }
        System.out.printf("+----------------------+---------------+---------------+---------------+---------------+-------------+%n");
        for (int a=0;a<nilai.length+1;a++){
            avrgPelajaran[a] = oNilai.getAvrgPelajaran(a);
        }
        System.out.printf("| %20s | %13s | %13s | %13s | %13s | %11s |%n", "Rata-rata      ", avrgPelajaran[0], avrgPelajaran[1], avrgPelajaran[2], avrgPelajaran[3], " - ");
        System.out.printf("+----------------------+---------------+---------------+---------------+---------------+-------------+%n");
        System.out.println("=======================================================================================================");
        System.out.println("Rata-rata Pelajaran tertinggi   : Pelajaran ke-"+(oNilai.getMaxAvrgVal(avrgPelajaran)+1)+" Dengan nilai "+oNilai.getValMax(avrgPelajaran)+1);
        System.out.println("Rata-rata Pelajaran terendah    : Pelajaran ke-"+(oNilai.getMinAvrgVal(avrgPelajaran)+1)+" Dengan nilai "+oNilai.getValMin(avrgPelajaran)+1);
        System.out.println("=======================================================================================================");
        System.out.println("Rata-rata Siswa tertinggi   : Siswa ke-"+(oNilai.getMaxAvrgVal(avrgSiswa)+1)+" Dengan nilai "+oNilai.getValMax(avrgSiswa)+1);
        System.out.println("Rata-rata Siswa terendah    : Siswa ke-"+(oNilai.getMinAvrgVal(avrgSiswa)+1)+" Dengan nilai "+oNilai.getValMax(avrgSiswa)+1);
        System.out.println("=======================================================================================================");
    }
    void inputNilai(){
        for (int a = 0;a < nilai.length;a++){
            for (int b = 0; b < nilai[a].length;b++){
                try{
                    if (b==0){
                        System.out.println("=======================================================================================================");
                        System.out.println("Input Nilai Siswa ke "+(a+1));
                        System.out.println("=======================================================================================================");
                        System.out.print("Nilai Pelajaran ke-"+(b+1)+" : ");
                        Double inVal = Double.parseDouble(buff.readLine());
                        if(inVal>=0 && inVal<=100){
                            nilai[a][b] = inVal;
                        }else{
                            System.out.println("Input nilai harus berada dalam range 0 - 100, jika lebih atau kurang harap ulangi lagi :D");
                            System.exit(0);
                        }
                    }else{
                        System.out.print("Nilai Pelajaran ke-"+(b+1)+" : ");
                        Double inVal = Double.parseDouble(buff.readLine());
                        if(inVal>=0 && inVal<=100){
                            nilai[a][b] = inVal;
                        }else{
                            System.out.println("Input nilai harus berada dalam range 0 - 100, jika lebih atau kurang harap ulangi lagi :D");
                            System.exit(0);
                        }
                    }               
                }catch(Exception e){
                    e.toString();
                }
            }
        }
    }
    void cls(){
        try{
            String os = System.getProperty("os.name");
                if (os.contains("Windows")){
                Runtime.getRuntime().exec("cls");
            }else{
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }catch (Exception e){
            e.toString();
        }
    }
}