// @SOURCE:/Users/Tomi/Desktop/simplex/conf/routes
// @HASH:318b671ba413752745c54ee331f87ea639aad3e7
// @DATE:Sat Jul 12 15:47:06 GMT-03:00 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._
import java.net.URLEncoder

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseAppController {
    

// @LINE:7
// @LINE:6
def index(): Call = {
   () match {
// @LINE:6
case () if true => Call("GET", _prefix)
                                                        
// @LINE:7
case () if true => Call("GET", _prefix + { _defaultPrefix } + "simplex")
                                                        
   }
}
                                                

// @LINE:8
def socket(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "simplex/")
}
                                                
    
}
                          

// @LINE:11
class ReverseAssets {
    

// @LINE:11
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseAppController {
    

// @LINE:7
// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AppController.index",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "simplex"})
      }
      }
   """
)
                        

// @LINE:8
def socket : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AppController.socket",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "simplex/"})
      }
   """
)
                        
    
}
              

// @LINE:11
class ReverseAssets {
    

// @LINE:11
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseAppController {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AppController.index(), HandlerDef(this, "controllers.AppController", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:8
def socket(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AppController.socket(), HandlerDef(this, "controllers.AppController", "socket", Seq(), "GET", """""", _prefix + """simplex/""")
)
                      
    
}
                          

// @LINE:11
class ReverseAssets {
    

// @LINE:11
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
                  
      