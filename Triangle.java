package magicsqaure.MyTeaching.modul;

public class Triangle {
    public static void main(String[] args) {
        System.out.println(triangleSize(1,1,2,2,3,3));
    }
    public  static int triangleSize(int x1,int x2,int x3, int y1,int y2,int y3){
       int first =x1-x2;
       int second =x2-x3;
       int third = x3-x1;
       int fifht= y1-y2;
       int sixth = y2-y3;
       int seventh = y3-y1;
        int ab= (int) Math.sqrt(Math.pow(2,first) + Math.pow(2,fifht));
        int bc= (int) Math.sqrt(Math.pow(2,second) + Math.pow(2,sixth));
        int ac= (int) Math.sqrt(Math.pow(2,third) + Math.pow(2,seventh));
        int p = (ab+bc+ac)/2;
        int sqrt= (int) Math.sqrt(p*(p-ab)*(p-bc)*(p-ac));
        return  sqrt;
    }
}
