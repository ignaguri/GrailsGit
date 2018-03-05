package grailsgit

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/"(action: "login", controller: 'grailGit')
        "/sites"(action: "sites", controller: 'grailGit')
        "/sites/:id/categories"(action: "categories", controller: 'grailGit')
        "/sites/:siteId/categories/:id"(action: "category", controller: 'grailGit')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
