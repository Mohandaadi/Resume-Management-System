package StackResumeProject;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResumeStack resumeStack = new ResumeStack();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			System.out.println("\nResume stack menu: ");
			System.out.println("1. Add Resume");
			System.out.println("2. View Top Resume");
			System.out.println("3. Resmove Top Resume");
			System.out.println("4. Display All Resumes");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1: 
				System.out.println("Enter name: ");
				String name = scanner.nextLine();
				System.out.println("Enter skills: ");
				String skills = scanner.nextLine();
				System.out.println("Enter experience: ");
				String experience = scanner.nextLine();
				Resume newResume = new Resume(name, skills, experience);
				resumeStack.addResume(newResume);
				break;
			case 2:
				Resume topResume = resumeStack.viewTopResume();
				if(topResume != null) {
					System.out.println("\nTop Resume:\n"+topResume);
				}
				break;
			case 3:
				resumeStack.removeTopResume();
				break;
			case 4:
				resumeStack.displayStack();
				break;
			case 5:
				System.out.println("Existing the Resume Stack. Goodbye!");
				System.exit(0);
				break;
			default:
				System.out.println("Inavlid choice. Please enter a valid option.");
			}
		}
	}

}
