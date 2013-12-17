// @SOURCE:C:/play/projects/IO-SIMPLEX/simplex/conf/routes
// @HASH:318b671ba413752745c54ee331f87ea639aad3e7
// @DATE:Sat Dec 14 11:03:05 ART 2013

import play.core._
import play.core.Router._
import play.core.j._

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
def index() = {
   () match {
// @LINE:6
case () if true => Call("GET", "/")
                                                                
// @LINE:7
case () if true => Call("GET", "/simplex")
                                                                    
   }
}
                                                        
 
// @LINE:8
def socket() = {
   Call("GET", "/simplex/")
}
                                                        

                      
    
}
                            

// @LINE:11
class ReverseAssets {
    


 
// @LINE:11
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
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
def index = JavascriptReverseRoute(
   "controllers.AppController.index",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"/"})
      }
      if (true) {
      return _wA({method:"GET", url:"/simplex"})
      }
      }
   """
)
                                                        
 
// @LINE:8
def socket = JavascriptReverseRoute(
   "controllers.AppController.socket",
   """
      function() {
      return _wA({method:"GET", url:"/simplex/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:11
class ReverseAssets {
    


 
// @LINE:11
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
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
def index() = new play.api.mvc.HandlerRef(
   controllers.AppController.index(), HandlerDef(this, "controllers.AppController", "index", Seq())
)
                              
 
// @LINE:8
def socket() = new play.api.mvc.HandlerRef(
   controllers.AppController.socket(), HandlerDef(this, "controllers.AppController", "socket", Seq())
)
                              

                      
    
}
                            

// @LINE:11
class ReverseAssets {
    


 
// @LINE:11
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                