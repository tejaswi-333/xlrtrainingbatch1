public class Demo025 {
    public static void main(String[] args) {
        String[] f1 = {"Harsha ","Nandu ","Priya ","Kavita ","Tharuni "};
        String[] address= {"Hyd ", "KPHB ","KPHB ","Medak ","Medak "};
        long[] number = {70324443,24890112,987839991,776891011,1090775432};

        for(int i =0; i<f1.length; i++){
            System.out.println("Friend "+(i+1)+" :"+f1[i]+address[i]+number[i]);
        }
        

}
}
