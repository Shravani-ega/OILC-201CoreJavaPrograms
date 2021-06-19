package assign_8th_june;

import java.util.Scanner;

public class LeaveSystem {
	int totalLeaves;

	public LeaveSystem(int totalLeaves) throws LeaveQuotaExceededException {
		try {

			if (totalLeaves > 20) {
				throw new LeaveQuotaExceededException("No leaves to grant");

			} else {
				System.out.println("Leave granted");
			}

		} catch (LeaveQuotaExceededException e) {

			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws LeaveQuotaExceededException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of leaves");
		int leaves = sc.nextInt();

		LeaveSystem leaveSystem = new LeaveSystem(leaves);

	}

}
