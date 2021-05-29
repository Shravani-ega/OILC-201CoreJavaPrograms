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

					if (total >= 400) {
						grade = "A Grade";
					} else if (total <= 400 && total >= 300) {
						grade = "B grade";
					} else if (total <= 300 && total >= 200) {
						grade = "c grade";
					} else {
						grade = "D grade";
					}
				} else {
					System.out.println("Fail");
					return;
				}
			}

			System.out.println("Total= " + total + "\nAverage= " + average + "\nGrade= " + grade);
		} catch (Exception e) {
			System.out.println("Enter valid values ");
		}
	}
}
