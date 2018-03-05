package grailsgit

class BootStrap {

    def init = { servletContext ->
        def site1 = new Site(name: 'Argentina').save()
        new Category(name: 'Categoría 1', site: site1, urlImage: 'about:blank', visits: 0).save()
        new Category(name: 'Categoría 2', site: site1, urlImage: 'about:blank', visits: 0).save()
    }
    def destroy = {
    }
}
