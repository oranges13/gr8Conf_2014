package com.opi

import grails.converters.JSON

class ContactController {
	
	NotificationService notificationService

    def index() { 
		[siteEmail: 'test.email@somewhere.com', sitePhone: '+1(555)555-5555']
	}
	
	def save(String fullName, String email, String phone, String note) {
		log.debug "Sending $fullName, $email, $phone, $note"
		
		if(notificationService.send(fullName, phone, email, note)) {
			flash.message = "Thank you $fullName, your message was sent successfully"
		} else {
			flash.error = "Sorry $fullName, the message send failed"
		}
		
		redirect uri: '/'
	}
	
	def data() {
		render ([msg: 'hi', questionCount: Question.count()] as JSON)
	}
	
}
