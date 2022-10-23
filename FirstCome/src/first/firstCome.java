package first;

import java.util.Scanner;

public class firstCome {

	public static void main(String[] args) {
		int at[]=new int[100];
		int bt[]=new int[100];
		int wt[]=new int[100];
		int ct[]=new int[100];
		int tur[]=new int[100];

		int process[]=new int[100];
	 double totalTur=0,totalWT=0;
	 int i,k,sum=0,a,temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Total Input Number : ");
		a = scan.nextInt();
		System.out.println("\n");

		for (i = 0; i < a; i++) {
			System.out.println("Burst Time[" + (i + 1) + "] : ");
			bt[i] = scan.nextInt();

		}
	
		System.out.println("\n");
	

		for (i = 0; i < a; i++) {
			System.out.println("Arrival Time[" + (i + 1) + "] : ");
			wt[i] = scan.nextInt();

		}
		System.out.println("\n");
		for (i = 0; i < a; i++) {
			for (int j = i + 1; j < a; j++) {
				if (at[i] > at[j]) {
					temp = at[i];
					at[i] = at[j];
					at[j] = temp;

					temp = bt[i];
					bt[i] = bt[j];
					bt[j] = temp;

					temp = process[i];
					process[i] = process[j];
					process[j] = temp;

				}
			}
		}
		
				for (int j = 0; j < a; j++) {
					sum += bt[j];
					ct[j] += sum;
				}

				
				for (int j = 0; j< a; j++) {  //TU and WT 
					tur[j] = ct[j] - at[j];
					totalTur += tur[j];
				}

		
				for ( k = 0; k < a; k++) {
					wt[k] = tur[k] - bt[k];
					totalWT += wt[k];
				}
				System.out.println("Solution: \n");
				System.out.println("P#\t AT\t BT\t CT\t TUR\t WT\t\n");

				for (i = 0; i < a; i++) {
					System.out.println("P" + (i + 1) + " \t " + at[i] + "\t " + bt[i] + "\t " + ct[i] + "\t " + tur[i]
							+ "\t " + wt[i] + "\t ");
				}
		        System.out.println(" ");
		        System.out.println("Avarage tur time : " +totalTur/a );
		        System.out.println("Avarage waitting time : " +totalWT/a );

		
		

		

	}

}
