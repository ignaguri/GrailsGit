package grailsgit

class Site {
    String idSite
    Boolean active
    String name
    static hasMany = [categories:Category]

    static constraints = {
        idSite nullable: false, blank: false
        active nullable: false, blank: false
        name nullable: false, blank: false
    }
}
