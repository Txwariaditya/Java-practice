package ArrDemo;
public class Frequency{
    public static void main(String[] args) {
    int[] array = {1,1,2,3,3,5,4,3,9};
    int[] frequency_array = new int[array.length+1]; 

    for(int i= 0; i< array.length; i++){
        frequency_array[array[i]]++;
    }
        for (int i = 0; i < 10; i++) {
           System.out.print(frequency_array[i] + " ");
        }

}
}