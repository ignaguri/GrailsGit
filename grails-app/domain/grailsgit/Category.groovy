package grailsgit

class Category {

    String name
    static belongsTo = [site: Site]
    String urlImage
    int visits
    static constraints = {
        visits min: 0
    }
}
