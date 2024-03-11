package StackResumeProject;
import java.util.Stack;

public class ResumeStack {
	
	private Stack<Resume> resumeStack; // It specifies that resumeStack is an instance of the Stack class that holds objects of type Resume.
	
	public ResumeStack() {
		resumeStack = new Stack<>();
	}
	
	public void addResume(Resume resume) {
		resumeStack.push(resume);
		System.out.println("Resume added to the stack "+resume.getName()+"!");
	}
	public Resume viewTopResume() {
		if(!resumeStack.isEmpty()) {
			return resumeStack.peek();
		}else {
			System.out.println("Stack is empty. No resumes available.");
			return null;
		}
	}
	public void removeTopResume() {
		if(!resumeStack.isEmpty()) {
			Resume removedResume = resumeStack.pop();
			System.out.println("Removed resume from the top of the stack: "+ removedResume.getName());
		}else {
			System.out.println("Stack is empty. No resume to remove.");
		}
	}
	public void displayStack() {
		if(!resumeStack.isEmpty()) {
			System.out.println("\nResumes in the stack: ");
			
			//It specifies that for each Resume object (resume) in the resumeStack, the code inside the loop should be executed.
			
			for(Resume resume: resumeStack) {
				System.out.println(resume);
				System.out.println("---------------");
			}
		}else {
			System.out.println("Stack is empty. No resumes available.");
		}
	}
}
