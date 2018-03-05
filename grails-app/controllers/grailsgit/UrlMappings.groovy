package grailsgit

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/"(action: "login", controller: 'grailGit')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
