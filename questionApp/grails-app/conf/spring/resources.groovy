import grails.rest.render.xml.*

// Place your Spring DSL code here
beans = {
	userRenderer(XMLRenderer, com.opi.User) {
		includes = ['username','firstName','lastName','email']
	}
}
