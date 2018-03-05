package grailsgit

class BootStrap {

    def init = { servletContext ->

        new User(user: "admin", password: "admin", name: "Adminio", lastName: "Adminosito").save()

    }
    def destroy = {
    }
}
