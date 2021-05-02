package Day_3;

public class Student extends User {
	int numberofCommentInCourse;
	String courseStatus;
	public Student() {
		
	}
	
	public Student(int numberofCommentInCourse,String courseStatus) {
		this.numberofCommentInCourse=numberofCommentInCourse;
		this.courseStatus=courseStatus;
		
		//user id
		//fName&lName
	}

	public int getNumberofCommentInCourse() {
		return numberofCommentInCourse;
	}

	public void setNumberofCommentInCourse(int numberofCommentInCourse) {
		this.numberofCommentInCourse = numberofCommentInCourse;
	}

	public String getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}
}
