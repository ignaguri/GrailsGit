package grailsgit

class GrailGitController {

    boolean logged = false;
    User currentUser;



    def login() {

    }

    def dataInput() {

        def username = params.user
        def password = params.pass
        def error = false;

        if (username != null){
            if (User.findByUser(username)!= null){
                if (User.findByUser(username).password==password){
                    //User found
                    logged = true;
                    currentUser = User.findByUser(username);

                }
                else {
                    error = true;
                }
            }
            else {
                error = true;
            }
        }
        else {
            error = true;
        }


           if (error) {
               logged = false;
               currentUser = null;
               request.withFormat {
                   form multipartForm {
                       flash.message = message(code:"Error", default: "Credenciales Invalidas")
                       redirect(action: "login")
                   }
               }
           }
        else{
               redirect(action:"sites")
           }
    }

    def logout() {

        logged = false;
        redirect (action:"login")
    }

    def sites() {

        if (!logged){
            redirect(action:"login")
        }

    }

    def categories(id){}

    def category(id) {}
}
