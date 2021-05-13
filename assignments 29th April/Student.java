package assign29thApril;

public class Student {

	public static void main(String[] args) {
		int total = 0, average = 0;
		String grade = null;
		try {

			for (int i = 0; i < args.length; i++) {
				int marks = Integer.parseInt(args[i]);
				if (marks > 35) {

					total = total + marks;

					average = total / 5;

					if (average >= 600) {
						grade = "A Grade";
					} else if (average >= 500 && average <= 600) {
						grade = "B grade";
					} else if (average >= 400 && average <= 500) {
						grade = "c grade";
					} else {
						grade = "D grade";
					}
				} else {
					System.out.println("Fail");
					return;
				}
			}

			System.out.println("Total= " + total +"\nAverage= " + average + "\nGrade= " + grade);

		} catch (Exception e) {
			System.out.println("Enter valid values ");
		}
	}
}
