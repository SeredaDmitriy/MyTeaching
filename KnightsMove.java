package magicsqaure.MyTeaching.modul;

public class KnightsMove {
    public static void main(String[] args) {
    deck(new int[]{1, 2},new int[]{4,1});
    }
    public static void deck(int [] place, int [] newplace){
               int a= newplace[0]-place[0];
               int b = newplace[1]- place[1];
               if (a==2&&b==1)
                   System.out.println("ход конем");
               if (a==1&&b==2)
                   System.out.println("ход конем");

                }


    }

