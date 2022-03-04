
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""


"""),_display_(/*5.2*/defining(play.core.PlayVersion.current)/*5.41*/ { version =>_display_(Seq[Any](format.raw/*5.54*/("""

"""),format.raw/*7.1*/("""<section id="content">
  <div class="wrapper doc">
    <article>
      <h1>WELCOME TO RECETASAPI REST</h1>
      <p>This tutorial introduces the differentS request that can be thrown and what kind of response we get from them</p>

      <h2>FUNCIONALITY OF THE SERVICES PROVIDED</h2>
      <ul>
        <li>GET     /     -->   this call will generate an html document in which you can see a quick guide of all you need to work with the API</li>

        <li>GET     /recepes    -->   functionality: get back al the information about the recepes in JSON format or XML. By default it will shows the first page of the list, but you could use a query param to indicate the page you want to see like in this way (example: http://[path]:9000/recepes?page=2)</li>
        <li>GET     /ingredients    -->   functionality: get back al the information about the ingredients in JSON format or XML. By default it will shows the first page of the list, but you could use a query param to indicate the page you want to see like in this way (example: http://[path]:9000/ingredients?page=2)</li>
        <li>GET     /users    -->   functionality: get back al the information about the users that creates the ingredients in JSON format or XML. By default it will shows the first page of the list, but you could use a query param to indicate the page you want to see like in this way (example: http://[path]:9000/users?page=2)</li>

        <li>GET     /recepe/:recepeId   -->   functionality: get back al the information about one specific recepe already created in JSON format or XML. You have to put the id of the recepe in the path</li>
        <li>GET     /ingredient/:ingredientId   -->   functionality: get back al the information about one specific ingredient already created in JSON format or XML. You have to put the id of the recepe in the path</li>
        <li>GET     /user/:userId   -->   functionality: get back al the information about one specific user already created in JSON format or XML. You have to put the id of the recepe in the path</li>

        <li>POST    /recepes   -->   functionality: get back the information of the recepe you have just created in JSON format or XML. The information must be introduced un JSON format in the body of the request. It is obligatory to intoduce ingredients for the recepe. However this ingredients don´t have to exist before. If the ingredients don´t exist already, they will be creted. Moreover you have to assign to the recipe one user and this have to exist by that moment <p> BODY FORMAT --> """),format.raw/*25.495*/("""{"""),format.raw/*25.496*/("""
          """),format.raw/*26.11*/(""""nombreReceta":"receta 86",
          "descripcionReceta": "descripcion receta 86",
          "ingredientes": ["""),format.raw/*28.28*/("""{"""),format.raw/*28.29*/("""

          """),format.raw/*30.11*/(""""nombreIngrediente": "ingrediente7"
          """),format.raw/*31.11*/("""}"""),format.raw/*31.12*/(""","""),format.raw/*31.13*/("""{"""),format.raw/*31.14*/("""

          """),format.raw/*33.11*/(""""nombreIngrediente": "ingrediente2"
          """),format.raw/*34.11*/("""}"""),format.raw/*34.12*/("""],
          "idUsuario": "3"

          """),format.raw/*37.11*/("""}"""),format.raw/*37.12*/("""</p></li>
        <li>POST    /ingredients   -->   functionality: get back the information of the ingredient you have just created in JSON format or XML. You also have to put the information in JSON format in the body of the reques<p>BODY FORMAT -->  """),format.raw/*38.242*/("""{"""),format.raw/*38.243*/("""
          """),format.raw/*39.11*/(""""nombreIngrediente": "ingredient 2"
          """),format.raw/*40.11*/("""}"""),format.raw/*40.12*/("""</p></li>
        <li>POST    /users   -->   functionality: get back the information of the user you have just created in JSON format or XML. You also have to put the information in JSON format in the body of the reques<p>BODY FORMAT  -->      """),format.raw/*41.235*/("""{"""),format.raw/*41.236*/("""
          """),format.raw/*42.11*/(""""nombreUsuario": "Juanito2",
          "correoUsuario": "juanito2gmail.com",
          "userBio" :"""),format.raw/*44.22*/("""{"""),format.raw/*44.23*/("""
          """),format.raw/*45.11*/(""""pais":"Francia",
          "añoNacimiento":2000
          """),format.raw/*47.11*/("""}"""),format.raw/*47.12*/("""
          """),format.raw/*48.11*/("""}"""),format.raw/*48.12*/("""</p></li>

        <li>DELETE  /recepe/:recepeId   -->   functionality: this service don´t get back anything, only the corresponding code</li>
        <li>DELETE  /ingredient/:ingredientId   -->   functionality: this service don´t get back anything, only the corresponding code</li>
        <li>DELETE  /user/:userId   -->   functionality: this service don´t get back anything, only the corresponding code</li>

        <li>GET     /ingredient/nameRelated/:ingredientName   -->   functionality: return a list of ingredients in JSON or XML format that have symilarities with the string or sentence added in the path. By default it will shows the first page of the list, but you could use a query param to indicate the page you want to see like in this way (example: http://[path]:9000/ingredient/nameRelated/:ingredientName?page=2)</li>
        <li>GET     /ingredient/nameLiteral/:ingredientName   -->   functionality: return the ingredient information in JSON or XML format that that fits with that word or sentence added in the path</li>

        <li>GET     /recepe/nameRelated/:recepeName   -->   functionality: return a list of recepes in JSON or XML format that have symilarities with the string or sentence added in the path. By default it will shows the first page of the list, but you could use a query param to indicate the page you want to see like in this way (example: http://[path]:9000/recepe/nameRelated/:recepeName?page=2)</li>
        <li>GET     /recepe/nameLiteral/:recepeName   -->   functionality: functionality: return the ingredient information in JSON or XML format that that fits with that word or sentence added in the path</li>
        <li>GET     /user/recepes/:userId   -->   functionality: get back al the information about al the recepes associated to an specific user in JSON format or XML. This list doesn´t have pages because in comparison with the full list of recepes, those that are created by one user will seem only a few</li>

      </ul>

    </article>

  </div>
</section>

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 03240224423354fa631f778f9062cbd998c0b008
                  MATRIX: 900->1|996->4|1025->8|1072->47|1122->60|1150->62|3719->2602|3749->2603|3788->2614|3927->2725|3956->2726|3996->2738|4070->2784|4099->2785|4128->2786|4157->2787|4197->2799|4271->2845|4300->2846|4369->2887|4398->2888|4678->3139|4708->3140|4747->3151|4821->3197|4850->3198|5123->3442|5153->3443|5192->3454|5318->3552|5347->3553|5386->3564|5473->3623|5502->3624|5541->3635|5570->3636
                  LINES: 27->1|32->2|35->5|35->5|35->5|37->7|55->25|55->25|56->26|58->28|58->28|60->30|61->31|61->31|61->31|61->31|63->33|64->34|64->34|67->37|67->37|68->38|68->38|69->39|70->40|70->40|71->41|71->41|72->42|74->44|74->44|75->45|77->47|77->47|78->48|78->48
                  -- GENERATED --
              */
          