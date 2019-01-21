package magicsqaure.MyTeaching.modul;

public class ArraySearch {
    public static void main(String[] args) {
        System.out.println(elementArraySearch(new int[]{1, 3, 45, 5, 43, 3, 2, 22, 2, 4, 5, 6, 6, 46, 57}));
    }
    public static int elementArraySearch(int [] input){
        int count=0;
        for (int i=1;i<input.length-1;i++){
            if (input[i]!=input[i+1])
                count++;
            if (input[i] == input[i - 1])
                count--;
            if (input [i]== input[i+1])
                count--;


        }
        return count;
    }

}
