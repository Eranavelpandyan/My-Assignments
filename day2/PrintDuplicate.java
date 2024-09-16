package week1.day2;

public class PrintDuplicate {
    public static void main(String[] args) {
        int[] num = {2, 5, 7, 7, 5, 9, 2, 3};
        System.out.println("Duplicate values are:");
        for (int i = 0; 1 < num.length; i++)
        {
        	for (int j = i+1; j < num.length; j++) {
        		if(num[i]==num[j])
        			System.out.println(num[i]);
        		}
        }
    }
}