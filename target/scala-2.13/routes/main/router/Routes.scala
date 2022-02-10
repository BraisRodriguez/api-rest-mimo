// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_1: controllers.HomeController,
  // @LINE:30
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_1: controllers.HomeController,
    // @LINE:30
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recepes""", """controllers.HomeController.getAllRecepes(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredients""", """controllers.HomeController.getAllIngredients(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.HomeController.getAllUsers(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recepe/""" + "$" + """recepeId<[^/]+>""", """controllers.HomeController.getOneRecepe(request:Request, recepeId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredient/""" + "$" + """ingredientId<[^/]+>""", """controllers.HomeController.getOneIngredient(request:Request, ingredientId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """userId<[^/]+>""", """controllers.HomeController.getOneUser(request:Request, userId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recepes""", """controllers.HomeController.crearRecepe(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredients""", """controllers.HomeController.crearIngredient(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.HomeController.crearUser(request:Request)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recepe/""" + "$" + """recepeId<[^/]+>""", """controllers.HomeController.deleteRecepe(request:Request, recepeId:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredient/""" + "$" + """ingredientId<[^/]+>""", """controllers.HomeController.deleteIngredient(request:Request, ingredientId:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """userId<[^/]+>""", """controllers.HomeController.deleteUser(request:Request, userId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredient/nameRelated/""" + "$" + """ingredientName<[^/]+>""", """controllers.HomeController.getListIngredientesByNameSelected(request:Request, ingredientName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredient/nameLiteral/""" + "$" + """ingredientName<[^/]+>""", """controllers.HomeController.getIngredientesByNameLiteral(request:Request, ingredientName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_getAllRecepes0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recepes")))
  )
  private[this] lazy val controllers_HomeController_getAllRecepes0_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.getAllRecepes(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getAllRecepes",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """recepes""",
      """ An example controller showing a sample home page
GET     /hola/:variable                           controllers.HomeController.index(variable)""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_getAllIngredients1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredients")))
  )
  private[this] lazy val controllers_HomeController_getAllIngredients1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.getAllIngredients(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getAllIngredients",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """ingredients""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_getAllUsers2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_HomeController_getAllUsers2_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.getAllUsers(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getAllUsers",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_getOneRecepe3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recepe/"), DynamicPart("recepeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getOneRecepe3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.getOneRecepe(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getOneRecepe",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """recepe/""" + "$" + """recepeId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_getOneIngredient4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredient/"), DynamicPart("ingredientId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getOneIngredient4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.getOneIngredient(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getOneIngredient",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """ingredient/""" + "$" + """ingredientId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_getOneUser5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getOneUser5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.getOneUser(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getOneUser",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """user/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_crearRecepe6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recepes")))
  )
  private[this] lazy val controllers_HomeController_crearRecepe6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.crearRecepe(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "crearRecepe",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """recepes""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_crearIngredient7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredients")))
  )
  private[this] lazy val controllers_HomeController_crearIngredient7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.crearIngredient(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "crearIngredient",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """ingredients""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_crearUser8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_HomeController_crearUser8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.crearUser(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "crearUser",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_deleteRecepe9_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recepe/"), DynamicPart("recepeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteRecepe9_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.deleteRecepe(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteRecepe",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "DELETE",
      this.prefix + """recepe/""" + "$" + """recepeId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_deleteIngredient10_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredient/"), DynamicPart("ingredientId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteIngredient10_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.deleteIngredient(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteIngredient",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "DELETE",
      this.prefix + """ingredient/""" + "$" + """ingredientId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_deleteUser11_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteUser11_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.deleteUser(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteUser",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "DELETE",
      this.prefix + """user/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_getListIngredientesByNameSelected12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredient/nameRelated/"), DynamicPart("ingredientName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getListIngredientesByNameSelected12_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.getListIngredientesByNameSelected(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getListIngredientesByNameSelected",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """ingredient/nameRelated/""" + "$" + """ingredientName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_getIngredientesByNameLiteral13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredient/nameLiteral/"), DynamicPart("ingredientName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getIngredientesByNameLiteral13_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.getIngredientesByNameLiteral(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getIngredientesByNameLiteral",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """ingredient/nameLiteral/""" + "$" + """ingredientName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Assets_versioned14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned14_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_getAllRecepes0_route(params@_) =>
      call { 
        controllers_HomeController_getAllRecepes0_invoker.call(
          req => HomeController_1.getAllRecepes(req))
      }
  
    // @LINE:8
    case controllers_HomeController_getAllIngredients1_route(params@_) =>
      call { 
        controllers_HomeController_getAllIngredients1_invoker.call(
          req => HomeController_1.getAllIngredients(req))
      }
  
    // @LINE:9
    case controllers_HomeController_getAllUsers2_route(params@_) =>
      call { 
        controllers_HomeController_getAllUsers2_invoker.call(
          req => HomeController_1.getAllUsers(req))
      }
  
    // @LINE:11
    case controllers_HomeController_getOneRecepe3_route(params@_) =>
      call(params.fromPath[String]("recepeId", None)) { (recepeId) =>
        controllers_HomeController_getOneRecepe3_invoker.call(
          req => HomeController_1.getOneRecepe(req, recepeId))
      }
  
    // @LINE:12
    case controllers_HomeController_getOneIngredient4_route(params@_) =>
      call(params.fromPath[String]("ingredientId", None)) { (ingredientId) =>
        controllers_HomeController_getOneIngredient4_invoker.call(
          req => HomeController_1.getOneIngredient(req, ingredientId))
      }
  
    // @LINE:13
    case controllers_HomeController_getOneUser5_route(params@_) =>
      call(params.fromPath[String]("userId", None)) { (userId) =>
        controllers_HomeController_getOneUser5_invoker.call(
          req => HomeController_1.getOneUser(req, userId))
      }
  
    // @LINE:15
    case controllers_HomeController_crearRecepe6_route(params@_) =>
      call { 
        controllers_HomeController_crearRecepe6_invoker.call(
          req => HomeController_1.crearRecepe(req))
      }
  
    // @LINE:16
    case controllers_HomeController_crearIngredient7_route(params@_) =>
      call { 
        controllers_HomeController_crearIngredient7_invoker.call(
          req => HomeController_1.crearIngredient(req))
      }
  
    // @LINE:17
    case controllers_HomeController_crearUser8_route(params@_) =>
      call { 
        controllers_HomeController_crearUser8_invoker.call(
          req => HomeController_1.crearUser(req))
      }
  
    // @LINE:19
    case controllers_HomeController_deleteRecepe9_route(params@_) =>
      call(params.fromPath[String]("recepeId", None)) { (recepeId) =>
        controllers_HomeController_deleteRecepe9_invoker.call(
          req => HomeController_1.deleteRecepe(req, recepeId))
      }
  
    // @LINE:20
    case controllers_HomeController_deleteIngredient10_route(params@_) =>
      call(params.fromPath[String]("ingredientId", None)) { (ingredientId) =>
        controllers_HomeController_deleteIngredient10_invoker.call(
          req => HomeController_1.deleteIngredient(req, ingredientId))
      }
  
    // @LINE:21
    case controllers_HomeController_deleteUser11_route(params@_) =>
      call(params.fromPath[String]("userId", None)) { (userId) =>
        controllers_HomeController_deleteUser11_invoker.call(
          req => HomeController_1.deleteUser(req, userId))
      }
  
    // @LINE:23
    case controllers_HomeController_getListIngredientesByNameSelected12_route(params@_) =>
      call(params.fromPath[String]("ingredientName", None)) { (ingredientName) =>
        controllers_HomeController_getListIngredientesByNameSelected12_invoker.call(
          req => HomeController_1.getListIngredientesByNameSelected(req, ingredientName))
      }
  
    // @LINE:24
    case controllers_HomeController_getIngredientesByNameLiteral13_route(params@_) =>
      call(params.fromPath[String]("ingredientName", None)) { (ingredientName) =>
        controllers_HomeController_getIngredientesByNameLiteral13_invoker.call(
          req => HomeController_1.getIngredientesByNameLiteral(req, ingredientName))
      }
  
    // @LINE:30
    case controllers_Assets_versioned14_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned14_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
