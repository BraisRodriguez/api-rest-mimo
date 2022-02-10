
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

object _mi_parcial extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[Ingrediente,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(variable: Ingrediente):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""


"""),format.raw/*5.1*/("""<ingrediente>"""),_display_(/*5.15*/(variable.getNombreIngrediente())),format.raw/*5.48*/("""</ingrediente>

"""))
      }
    }
  }

  def render(variable:Ingrediente): play.twirl.api.XmlFormat.Appendable = apply(variable)

  def f:((Ingrediente) => play.twirl.api.XmlFormat.Appendable) = (variable) => apply(variable)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/_mi_parcialingredientes.scala.xml
                  HASH: 612597a58c92cf5747c86823ee707841bce2a40a
                  MATRIX: 912->1|1028->25|1057->28|1097->42|1150->75
                  LINES: 27->1|32->2|35->5|35->5|35->5
                  -- GENERATED --
              */
          