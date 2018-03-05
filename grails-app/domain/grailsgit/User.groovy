package grailsgit

class User {

    String name
    String lastName
    String user
    String password
    static constraints = {
        name nullable: false, blank: false
        lastName nullable: false, blank: false
        user nullable: false, blank: false
        password nullable: false, blank: false
    }
}
