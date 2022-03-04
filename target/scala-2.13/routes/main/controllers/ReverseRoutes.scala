// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def deleteRecepe(recepeId:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "recepe/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("recepeId", recepeId)))
    }
  
    // @LINE:7
    def intro(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:25
    def getListIngredientesByNameSelected(ingredientName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ingredient/nameRelated/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("ingredientName", ingredientName)))
    }
  
    // @LINE:30
    def getListaRecetasUsuario(userId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/recepes/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userId", userId)))
    }
  
    // @LINE:23
    def deleteUser(userId:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userId", userId)))
    }
  
    // @LINE:14
    def getOneIngredient(ingredientId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ingredient/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("ingredientId", ingredientId)))
    }
  
    // @LINE:9
    def getAllRecepes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recepes")
    }
  
    // @LINE:10
    def getAllIngredients(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ingredients")
    }
  
    // @LINE:22
    def deleteIngredient(ingredientId:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "ingredient/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("ingredientId", ingredientId)))
    }
  
    // @LINE:15
    def getOneUser(userId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userId", userId)))
    }
  
    // @LINE:19
    def crearUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:13
    def getOneRecepe(recepeId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recepe/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("recepeId", recepeId)))
    }
  
    // @LINE:18
    def crearIngredient(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "ingredients")
    }
  
    // @LINE:26
    def getIngredienteByNameLiteral(ingredientName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ingredient/nameLiteral/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("ingredientName", ingredientName)))
    }
  
    // @LINE:29
    def getListRecetaByNameLiteral(recepeName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recepe/nameLiteral/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("recepeName", recepeName)))
    }
  
    // @LINE:17
    def crearRecepe(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "recepes")
    }
  
    // @LINE:28
    def getListRecetasByNameSelected(recepeName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recepe/nameRelated/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("recepeName", recepeName)))
    }
  
    // @LINE:11
    def getAllUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
  }

  // @LINE:34
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
