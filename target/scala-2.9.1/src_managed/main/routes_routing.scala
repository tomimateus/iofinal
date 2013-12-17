// @SOURCE:C:/play/projects/IO-SIMPLEX/simplex/conf/routes
// @HASH:318b671ba413752745c54ee331f87ea639aad3e7
// @DATE:Sat Dec 14 11:03:05 ART 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_AppController_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:7
val controllers_AppController_index1 = Route("GET", PathPattern(List(StaticPart("/simplex"))))
                    

// @LINE:8
val controllers_AppController_socket2 = Route("GET", PathPattern(List(StaticPart("/simplex/"))))
                    

// @LINE:11
val controllers_Assets_at3 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.AppController.index()"""),("""GET""","""/simplex""","""controllers.AppController.index()"""),("""GET""","""/simplex/""","""controllers.AppController.socket()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_AppController_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.AppController.index(), HandlerDef(this, "controllers.AppController", "index", Nil))
   }
}
                    

// @LINE:7
case controllers_AppController_index1(params) => {
   call { 
        invokeHandler(_root_.controllers.AppController.index(), HandlerDef(this, "controllers.AppController", "index", Nil))
   }
}
                    

// @LINE:8
case controllers_AppController_socket2(params) => {
   call { 
        invokeHandler(_root_.controllers.AppController.socket(), HandlerDef(this, "controllers.AppController", "socket", Nil))
   }
}
                    

// @LINE:11
case controllers_Assets_at3(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                