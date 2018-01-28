package com.performanceanalyst.model;

public class StudentDetails {
	private String studentId,studentName,studentEmail,studentMobile;
	private String studentQualification,studentGrade,GuardianName,GuardianMobile;
	private int centerCourseId,studentGraduationYear;
	private double studentPercentage;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}
	public String getStudentQualification() {
		return studentQualification;
	}
	public void setStudentQualification(String studentQualification) {
		this.studentQualification = studentQualification;
	}
	public String getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}
	public String getGuardianName() {
		return GuardianName;
	}
	public void setGuardianName(String guardianName) {
		GuardianName = guardianName;
	}
	public String getGuardianMobile() {
		return GuardianMobile;
	}
	public void setGuardianMobile(String guardianMobile) {
		GuardianMobile = guardianMobile;
	}
	public int getCenterCourseId() {
		return centerCourseId;
	}
	public void setCenterCourseId(int centerCourseId) {
		this.centerCourseId = centerCourseId;
	}
	public int getStudentGraduationYear() {
		return studentGraduationYear;
	}
	public void setStudentGraduationYear(int studentGraduationYear) {
		this.studentGraduationYear = studentGraduationYear;
	}
	public double getStudentPercentage() {
		return studentPercentage;
	}
	public void setStudentPercentage(double studentPercentage) {
		this.studentPercentage = studentPercentage;
	}
}
