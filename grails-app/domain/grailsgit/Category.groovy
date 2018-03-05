package grailsgit

class Category {

    String name
    static belongsTo = [site: Site]
    String urlImage
    int visits
    static constraints = {
        name nullable: false, blank: false
        site nullable: false, blank: false
        urlImage nullable: true, blank: true
        visits nullable: true, blank: true
    }
}
