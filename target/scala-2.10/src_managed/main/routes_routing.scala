// @SOURCE:/Users/Tomi/Desktop/simplex/conf/routes
// @HASH:318b671ba413752745c54ee331f87ea639aad3e7
// @DATE:Sat Jul 12 15:47:06 GMT-03:00 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_AppController_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_AppController_index1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("simplex"))))
        

// @LINE:8
private[this] lazy val controllers_AppController_socket2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("simplex/"))))
        

// @LINE:11
private[this] lazy val controllers_Assets_at3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.AppController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """simplex""","""controllers.AppController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """simplex/""","""controllers.AppController.socket()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_AppController_index0(params) => {
   call { 
        invokeHandler(controllers.AppController.index(), HandlerDef(this, "controllers.AppController", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_AppController_index1(params) => {
   call { 
        invokeHandler(controllers.AppController.index(), HandlerDef(this, "controllers.AppController", "index", Nil,"GET", """""", Routes.prefix + """simplex"""))
   }
}
        

// @LINE:8
case controllers_AppController_socket2(params) => {
   call { 
        invokeHandler(controllers.AppController.socket(), HandlerDef(this, "controllers.AppController", "socket", Nil,"GET", """""", Routes.prefix + """simplex/"""))
   }
}
        

// @LINE:11
case controllers_Assets_at3(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        