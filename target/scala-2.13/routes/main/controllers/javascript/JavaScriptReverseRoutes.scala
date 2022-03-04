// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def deleteRecepe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteRecepe",
      """
        function(recepeId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "recepe/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("recepeId", recepeId0))})
        }
      """
    )
  
    // @LINE:7
    def intro: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.intro",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:25
    def getListIngredientesByNameSelected: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getListIngredientesByNameSelected",
      """
        function(ingredientName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ingredient/nameRelated/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("ingredientName", ingredientName0))})
        }
      """
    )
  
    // @LINE:30
    def getListaRecetasUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getListaRecetasUsuario",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/recepes/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:23
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteUser",
      """
        function(userId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:14
    def getOneIngredient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getOneIngredient",
      """
        function(ingredientId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ingredient/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("ingredientId", ingredientId0))})
        }
      """
    )
  
    // @LINE:9
    def getAllRecepes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getAllRecepes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recepes"})
        }
      """
    )
  
    // @LINE:10
    def getAllIngredients: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getAllIngredients",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ingredients"})
        }
      """
    )
  
    // @LINE:22
    def deleteIngredient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteIngredient",
      """
        function(ingredientId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "ingredient/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("ingredientId", ingredientId0))})
        }
      """
    )
  
    // @LINE:15
    def getOneUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getOneUser",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:19
    def crearUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.crearUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:13
    def getOneRecepe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getOneRecepe",
      """
        function(recepeId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recepe/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("recepeId", recepeId0))})
        }
      """
    )
  
    // @LINE:18
    def crearIngredient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.crearIngredient",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ingredients"})
        }
      """
    )
  
    // @LINE:26
    def getIngredienteByNameLiteral: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getIngredienteByNameLiteral",
      """
        function(ingredientName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ingredient/nameLiteral/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("ingredientName", ingredientName0))})
        }
      """
    )
  
    // @LINE:29
    def getListRecetaByNameLiteral: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getListRecetaByNameLiteral",
      """
        function(recepeName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recepe/nameLiteral/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("recepeName", recepeName0))})
        }
      """
    )
  
    // @LINE:17
    def crearRecepe: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.crearRecepe",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recepes"})
        }
      """
    )
  
    // @LINE:28
    def getListRecetasByNameSelected: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getListRecetasByNameSelected",
      """
        function(recepeName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recepe/nameRelated/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("recepeName", recepeName0))})
        }
      """
    )
  
    // @LINE:11
    def getAllUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getAllUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
