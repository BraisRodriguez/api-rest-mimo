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

  
    // @LINE:19
    def deleteRecepe(recepeId:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "recepe/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("recepeId", recepeId)))
    }
  
    // @LINE:23
    def getListIngredientesByNameSelected(ingredientName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ingredient/nameRelated/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("ingredientName", ingredientName)))
    }
  
    // @LINE:28
    def getListaRecetasUsuario(userId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/recepes/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userId", userId)))
    }
  
    // @LINE:21
    def deleteUser(userId:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userId", userId)))
    }
  
    // @LINE:12
    def getOneIngredient(ingredientId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ingredient/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("ingredientId", ingredientId)))
    }
  
    // @LINE:7
    def getAllRecepes(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recepes")
    }
  
    // @LINE:8
    def getAllIngredients(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ingredients")
    }
  
    // @LINE:20
    def deleteIngredient(ingredientId:String): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "ingredient/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("ingredientId", ingredientId)))
    }
  
    // @LINE:13
    def getOneUser(userId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userId", userId)))
    }
  
    // @LINE:17
    def crearUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:11
    def getOneRecepe(recepeId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recepe/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("recepeId", recepeId)))
    }
  
    // @LINE:16
    def crearIngredient(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "ingredients")
    }
  
    // @LINE:24
    def getIngredienteByNameLiteral(ingredientName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ingredient/nameLiteral/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("ingredientName", ingredientName)))
    }
  
    // @LINE:27
    def getListRecetaByNameLiteral(recepeName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recepe/nameLiteral/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("recepeName", recepeName)))
    }
  
    // @LINE:15
    def crearRecepe(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "recepes")
    }
  
    // @LINE:26
    def getListRecetasByNameSelected(recepeName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recepe/nameRelated/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("recepeName", recepeName)))
    }
  
    // @LINE:9
    def getAllUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
  }

  // @LINE:32
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
