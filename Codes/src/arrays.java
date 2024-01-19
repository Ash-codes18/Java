import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] marks = new int[3];

        marks[0]=76;
        marks[1]=45;
        marks[2]=72;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        System.out.println(marks.length);

        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        int[] arr={23,45,7,32,21};

        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();


        int[][] finalmarks = {{23,34,56},{34,56,76,87}};

        for(int i=0;i<finalmarks.length;i++){
            for(int j=0;j<finalmarks[i].length;j++){
                System.out.print(finalmarks[i][j]+" ");
            }
            System.out.println();
        }


    }
}
