package grailsgit

class BootStrap {

    def init = { servletContext ->

        new User(user: "admin", password: "admin", name: "Adminio", lastName: "Adminosito").save()

        Site argentina = new Site()
        argentina.name = "Argentina"
        argentina.idSite = "MLA"
        argentina.active = true
        argentina.save()

        Site brasil = new Site()
        brasil.name = "Brasil"
        brasil.idSite = "MLB"
        brasil.active = false
        brasil.save()

        Site uruguay = new Site()
        uruguay.name = "Uruguay"
        uruguay.idSite = "MLU"
        uruguay.active = false
        uruguay.save()
    }
    def destroy = {
    }
}
