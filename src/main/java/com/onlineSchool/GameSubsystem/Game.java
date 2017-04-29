package com.onlineSchool.GameSubsystem;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.onlineSchool.AccountSubsystem.Teacher;
import com.onlineSchool.CourseSubsystem.Course;

@Entity
public class Game {
	@Id
	private String gameName;
	@ManyToOne
	@JoinColumn(name="courseName")
	private Course course;
	@OneToMany(mappedBy = "game", cascade = CascadeType.ALL)
	private List<Question> questions;
	@ManyToOne
	@JoinColumn(name="email")
	Teacher teacher;
	
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

}