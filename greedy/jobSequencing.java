package greedy;




// job sequencing problem (maximize the profit earned)



// every job can be completed in a single day. and for example, if deadline is 1, then it has to be completed by 1st March. if deadline if 4, then it has to be completed by 4th March or before.




// do the job with the most profit first.
import java.util.*;
class Job{
    int id;
    int deadline;
    int profit;
}
public class jobSequencing {
    public static int[] JobSequencing(Job[] arr , int n){
        Comparator<Job> com = new Comparator<Job>(){
            public int compare(Job a , Job b){
                return b.profit - a.profit; // sorting according to profit in descending order. so the most profitable job is first.
            }
        };

        Arrays.sort(arr , com);

        int max = Integer.MIN_VALUE; // so the max day, the last day till we can perform any job is the one which has the highest deadline. like 4th of march.
        for(int i = 0; i < n; i++){
            max = Math.max(max , arr[i].deadline);
        }

        // hash array:
        int[] slot = new int[max+1]; // following 1-based indexing as minimum deadline is 1, not 0.
        Arrays.fill(slot , -1);

        int countJobs = 0; int totalProfit = 0;
        for(int i = 0; i < n; i++){
            int j = arr[i].deadline;
            while(j > 0){  // j > 0, not j >= 0. because slot[0] means day 0, which is not possible. day starts from 1, thats why we are deliberately following 1-based indexing.
                if(slot[j] == -1){
                    slot[j] = i;
                    countJobs++;
                    totalProfit += arr[i].profit;
                    break; // here, break statement only breaks the nearest loop, that is the while loop, not the for loop.
                }
                j--;
            }
        }

        return new int[]{countJobs , totalProfit};
    }
    public static void main(String[] args) {
        int n = 4;

        Job[] arr = new Job[] {
            new Job() {{id = 1; deadline = 4; profit = 20;}},
            new Job() {{id = 2; deadline = 1; profit = 10;}},
            new Job() {{id = 3; deadline = 2; profit = 40;}},
            new Job() {{id = 4; deadline = 2; profit = 30;}}
        };

        int[] x = JobSequencing(arr, n);
        System.out.println(Arrays.toString(x));
    }
}
