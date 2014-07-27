package com.opi

class Question {
	String title
	String question
	String answer
	String username

	static constraints = {
		title maxSize: 200
		question maxSize: 1000
		answer maxSize: 10000
		username unique: true
	}
}
