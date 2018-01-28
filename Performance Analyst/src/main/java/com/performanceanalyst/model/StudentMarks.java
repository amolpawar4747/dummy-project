package com.performanceanalyst.model;

public class StudentMarks {
	private String studentId;
	private int subjectAssementId,obtainedMarks,actualMarks,lastUpdatedBy,centerCourseId;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public int getSubjectAssementId() {
		return subjectAssementId;
	}
	public void setSubjectAssementId(int subjectAssementId) {
		this.subjectAssementId = subjectAssementId;
	}
	public int getObtainedMarks() {
		return obtainedMarks;
	}
	public void setObtainedMarks(int obtainedMarks) {
		this.obtainedMarks = obtainedMarks;
	}
	public int getActualMarks() {
		return actualMarks;
	}
	public void setActualMarks(int actualMarks) {
		this.actualMarks = actualMarks;
	}
	public int getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(int lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public int getCenterCourseId() {
		return centerCourseId;
	}
	public void setCenterCourseId(int centerCourseId) {
		this.centerCourseId = centerCourseId;
	}
}
