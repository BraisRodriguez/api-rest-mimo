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
  // @LINE:34
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_1: controllers.HomeController,
    // @LINE:34
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
    ("""GET""", this.prefix, """controllers.HomeController.intro()"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredient/nameLiteral/""" + "$" + """ingredientName<[^/]+>""", """controllers.HomeController.getIngredienteByNameLiteral(request:Request, ingredientName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recepe/nameRelated/""" + "$" + """recepeName<[^/]+>""", """controllers.HomeController.getListRecetasByNameSelected(request:Request, recepeName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recepe/nameLiteral/""" + "$" + """recepeName<[^/]+>""", """controllers.HomeController.getListRecetaByNameLiteral(request:Request, recepeName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/recepes/""" + "$" + """userId<[^/]+>""", """controllers.HomeController.getListaRecetasUsuario(request:Request, userId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_intro0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_intro0_invoker = createInvoker(
    HomeController_1.intro(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "intro",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page
GET     /hola/:variable                           controllers.HomeController.index(variable)""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_getAllRecepes1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recepes")))
  )
  private[this] lazy val controllers_HomeController_getAllRecepes1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.getAllRecepes(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getAllRecepes",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """recepes""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_getAllIngredients2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredients")))
  )
  private[this] lazy val controllers_HomeController_getAllIngredients2_invoker = createInvoker(
    
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

  // @LINE:11
  private[this] lazy val controllers_HomeController_getAllUsers3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_HomeController_getAllUsers3_invoker = createInvoker(
    
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

  // @LINE:13
  private[this] lazy val controllers_HomeController_getOneRecepe4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recepe/"), DynamicPart("recepeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getOneRecepe4_invoker = createInvoker(
    
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

  // @LINE:14
  private[this] lazy val controllers_HomeController_getOneIngredient5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredient/"), DynamicPart("ingredientId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getOneIngredient5_invoker = createInvoker(
    
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

  // @LINE:15
  private[this] lazy val controllers_HomeController_getOneUser6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getOneUser6_invoker = createInvoker(
    
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

  // @LINE:17
  private[this] lazy val controllers_HomeController_crearRecepe7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recepes")))
  )
  private[this] lazy val controllers_HomeController_crearRecepe7_invoker = createInvoker(
    
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

  // @LINE:18
  private[this] lazy val controllers_HomeController_crearIngredient8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredients")))
  )
  private[this] lazy val controllers_HomeController_crearIngredient8_invoker = createInvoker(
    
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

  // @LINE:19
  private[this] lazy val controllers_HomeController_crearUser9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_HomeController_crearUser9_invoker = createInvoker(
    
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

  // @LINE:21
  private[this] lazy val controllers_HomeController_deleteRecepe10_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recepe/"), DynamicPart("recepeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteRecepe10_invoker = createInvoker(
    
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

  // @LINE:22
  private[this] lazy val controllers_HomeController_deleteIngredient11_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredient/"), DynamicPart("ingredientId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteIngredient11_invoker = createInvoker(
    
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

  // @LINE:23
  private[this] lazy val controllers_HomeController_deleteUser12_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteUser12_invoker = createInvoker(
    
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

  // @LINE:25
  private[this] lazy val controllers_HomeController_getListIngredientesByNameSelected13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredient/nameRelated/"), DynamicPart("ingredientName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getListIngredientesByNameSelected13_invoker = createInvoker(
    
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

  // @LINE:26
  private[this] lazy val controllers_HomeController_getIngredienteByNameLiteral14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredient/nameLiteral/"), DynamicPart("ingredientName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getIngredienteByNameLiteral14_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.getIngredienteByNameLiteral(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getIngredienteByNameLiteral",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """ingredient/nameLiteral/""" + "$" + """ingredientName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_HomeController_getListRecetasByNameSelected15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recepe/nameRelated/"), DynamicPart("recepeName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getListRecetasByNameSelected15_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.getListRecetasByNameSelected(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getListRecetasByNameSelected",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """recepe/nameRelated/""" + "$" + """recepeName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HomeController_getListRecetaByNameLiteral16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recepe/nameLiteral/"), DynamicPart("recepeName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getListRecetaByNameLiteral16_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.getListRecetaByNameLiteral(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getListRecetaByNameLiteral",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """recepe/nameLiteral/""" + "$" + """recepeName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_HomeController_getListaRecetasUsuario17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/recepes/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getListaRecetasUsuario17_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_1.getListaRecetasUsuario(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getListaRecetasUsuario",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """user/recepes/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Assets_versioned18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned18_invoker = createInvoker(
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
    case controllers_HomeController_intro0_route(params@_) =>
      call { 
        controllers_HomeController_intro0_invoker.call(HomeController_1.intro())
      }
  
    // @LINE:9
    case controllers_HomeController_getAllRecepes1_route(params@_) =>
      call { 
        controllers_HomeController_getAllRecepes1_invoker.call(
          req => HomeController_1.getAllRecepes(req))
      }
  
    // @LINE:10
    case controllers_HomeController_getAllIngredients2_route(params@_) =>
      call { 
        controllers_HomeController_getAllIngredients2_invoker.call(
          req => HomeController_1.getAllIngredients(req))
      }
  
    // @LINE:11
    case controllers_HomeController_getAllUsers3_route(params@_) =>
      call { 
        controllers_HomeController_getAllUsers3_invoker.call(
          req => HomeController_1.getAllUsers(req))
      }
  
    // @LINE:13
    case controllers_HomeController_getOneRecepe4_route(params@_) =>
      call(params.fromPath[String]("recepeId", None)) { (recepeId) =>
        controllers_HomeController_getOneRecepe4_invoker.call(
          req => HomeController_1.getOneRecepe(req, recepeId))
      }
  
    // @LINE:14
    case controllers_HomeController_getOneIngredient5_route(params@_) =>
      call(params.fromPath[String]("ingredientId", None)) { (ingredientId) =>
        controllers_HomeController_getOneIngredient5_invoker.call(
          req => HomeController_1.getOneIngredient(req, ingredientId))
      }
  
    // @LINE:15
    case controllers_HomeController_getOneUser6_route(params@_) =>
      call(params.fromPath[String]("userId", None)) { (userId) =>
        controllers_HomeController_getOneUser6_invoker.call(
          req => HomeController_1.getOneUser(req, userId))
      }
  
    // @LINE:17
    case controllers_HomeController_crearRecepe7_route(params@_) =>
      call { 
        controllers_HomeController_crearRecepe7_invoker.call(
          req => HomeController_1.crearRecepe(req))
      }
  
    // @LINE:18
    case controllers_HomeController_crearIngredient8_route(params@_) =>
      call { 
        controllers_HomeController_crearIngredient8_invoker.call(
          req => HomeController_1.crearIngredient(req))
      }
  
    // @LINE:19
    case controllers_HomeController_crearUser9_route(params@_) =>
      call { 
        controllers_HomeController_crearUser9_invoker.call(
          req => HomeController_1.crearUser(req))
      }
  
    // @LINE:21
    case controllers_HomeController_deleteRecepe10_route(params@_) =>
      call(params.fromPath[String]("recepeId", None)) { (recepeId) =>
        controllers_HomeController_deleteRecepe10_invoker.call(
          req => HomeController_1.deleteRecepe(req, recepeId))
      }
  
    // @LINE:22
    case controllers_HomeController_deleteIngredient11_route(params@_) =>
      call(params.fromPath[String]("ingredientId", None)) { (ingredientId) =>
        controllers_HomeController_deleteIngredient11_invoker.call(
          req => HomeController_1.deleteIngredient(req, ingredientId))
      }
  
    // @LINE:23
    case controllers_HomeController_deleteUser12_route(params@_) =>
      call(params.fromPath[String]("userId", None)) { (userId) =>
        controllers_HomeController_deleteUser12_invoker.call(
          req => HomeController_1.deleteUser(req, userId))
      }
  
    // @LINE:25
    case controllers_HomeController_getListIngredientesByNameSelected13_route(params@_) =>
      call(params.fromPath[String]("ingredientName", None)) { (ingredientName) =>
        controllers_HomeController_getListIngredientesByNameSelected13_invoker.call(
          req => HomeController_1.getListIngredientesByNameSelected(req, ingredientName))
      }
  
    // @LINE:26
    case controllers_HomeController_getIngredienteByNameLiteral14_route(params@_) =>
      call(params.fromPath[String]("ingredientName", None)) { (ingredientName) =>
        controllers_HomeController_getIngredienteByNameLiteral14_invoker.call(
          req => HomeController_1.getIngredienteByNameLiteral(req, ingredientName))
      }
  
    // @LINE:28
    case controllers_HomeController_getListRecetasByNameSelected15_route(params@_) =>
      call(params.fromPath[String]("recepeName", None)) { (recepeName) =>
        controllers_HomeController_getListRecetasByNameSelected15_invoker.call(
          req => HomeController_1.getListRecetasByNameSelected(req, recepeName))
      }
  
    // @LINE:29
    case controllers_HomeController_getListRecetaByNameLiteral16_route(params@_) =>
      call(params.fromPath[String]("recepeName", None)) { (recepeName) =>
        controllers_HomeController_getListRecetaByNameLiteral16_invoker.call(
          req => HomeController_1.getListRecetaByNameLiteral(req, recepeName))
      }
  
    // @LINE:30
    case controllers_HomeController_getListaRecetasUsuario17_route(params@_) =>
      call(params.fromPath[String]("userId", None)) { (userId) =>
        controllers_HomeController_getListaRecetasUsuario17_invoker.call(
          req => HomeController_1.getListaRecetasUsuario(req, userId))
      }
  
    // @LINE:34
    case controllers_Assets_versioned18_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned18_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
