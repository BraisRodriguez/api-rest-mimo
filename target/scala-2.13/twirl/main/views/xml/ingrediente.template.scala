
package views.xml

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.xml._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object ingrediente extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[Ingrediente,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ingrediente:Ingrediente):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<ingrediente>
    <idIngrediente>"""),_display_(/*3.21*/(ingrediente.getIdIngrediente())),format.raw/*3.53*/("""</idIngrediente>
    <nombreIngrediente>"""),_display_(/*4.25*/ingrediente/*4.36*/.getNombreIngrediente),format.raw/*4.57*/("""</nombreIngrediente>
</ingrediente>


"""))
      }
    }
  }

  def render(ingrediente:Ingrediente): play.twirl.api.XmlFormat.Appendable = apply(ingrediente)

  def f:((Ingrediente) => play.twirl.api.XmlFormat.Appendable) = (ingrediente) => apply(ingrediente)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/ingrediente.scala.xml
                  HASH: ce9d0bb749fb9598c058a32b70cbe9d6e14ddf83
                  MATRIX: 912->1|1030->27|1090->61|1142->93|1209->134|1228->145|1269->166
                  LINES: 27->1|32->2|33->3|33->3|34->4|34->4|34->4
                  -- GENERATED --
              */
          