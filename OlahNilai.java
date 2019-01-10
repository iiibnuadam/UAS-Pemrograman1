public class OlahNilai{
    double nilai[][];
    public OlahNilai(double nilai[][]){
        this.nilai=nilai;
    }
    double getAvrgPelajaran(int col){
        double hasil = 0;
        hasil = (nilai[0][col]+nilai[1][col]+nilai[2][col])/nilai.length;
        return hasil;
    }

    double getAvrgSiswa(int row){
        double hasil = 0;
        hasil = (nilai[row][0]+nilai[row][1]+nilai[row][2]+nilai[row][3])/nilai[row].length;
        return hasil;
    }

    int getMaxAvrgVal(double avrg[]){
        int hasil = 0;
        double maxVal = avrg[0];
        for (int a = 0;a < avrg.length;a++){
            if (avrg[a]>maxVal){
                maxVal = avrg[a];
                hasil = a;
            }
        }
        return hasil;
    }
    double getValMax(double avrg[]){
        double maxVal = avrg[0];
        for (int a = 0;a < avrg.length;a++){
            if (avrg[a]>maxVal){
                maxVal = avrg[a];
            }
        }
        return maxVal;
    }
    int getMinAvrgVal(double avrg[]){
        int hasil = 0;
        double minVal = avrg[0];
        for (int a = 0;a < avrg.length;a++){
            if (avrg[a]<minVal){
                minVal = avrg[a];
                hasil = a;            
            }
        }
        return hasil;
    }
    double getValMin(double avrg[]){
        double minVal = avrg[0];
        for (int a = 0;a < avrg.length;a++){
            if (avrg[a]<minVal){
                minVal = avrg[a];
            }
        }
        return minVal;
    }
}