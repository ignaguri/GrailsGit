package grailsgit

class GrailGitController {

    SiteService siteService

    def login() {}

    def sites() {
        try {
            render(view: "sites", model: [sitesToReturn: siteService.list()])
        } catch (Exception ex) {
            ex.printStackTrace()
            flash.error = 'No se pudo realizar su solicitud.'
            redirect action: 'sites'
        }
    }

    def categories(id) {}

    def category(id) {}
}
