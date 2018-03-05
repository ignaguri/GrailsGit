package grailsgit

class GrailGitController {

    CategoryService categoryService

    def login() { }

    def sites() { }

    def categories(){
        println 'Categories..'
        println params.id
        def site = Site.get(params.id)
        println Category.list([site: params.id])
        render (view: 'categories', model: [categories: Category.list([site: site])])
    }

    def category() {
        println 'Category..'
        println params.id
        def cat = Category.get(params.id)
        cat.visits += 1
        cat.save(flush:true)
        render (view: 'category', model: [category: cat])
    }
}
