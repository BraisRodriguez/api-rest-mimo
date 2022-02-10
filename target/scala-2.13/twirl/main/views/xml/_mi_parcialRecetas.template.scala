
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

object _mi_parcialRecetas extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[Receta,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(variable: Receta):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""


"""),format.raw/*5.1*/("""<receta>
    <idReceta>"""),_display_(/*6.16*/(variable.getIdReceta())),format.raw/*6.40*/("""</idReceta>
    <nombreReceta>"""),_display_(/*7.20*/(variable.getNombreReceta())),format.raw/*7.48*/("""</nombreReceta>
    <descripcionReceta>"""),_display_(/*8.25*/(variable.getDescripcionReceta())),format.raw/*8.58*/("""</descripcionReceta>
    """),_display_(/*9.6*/ingredientes(variable.getIngredientes())),format.raw/*9.46*/("""
"""),format.raw/*10.1*/("""</receta>

"""))
      }
    }
  }

  def render(variable:Receta): play.twirl.api.XmlFormat.Appendable = apply(variable)

  def f:((Receta) => play.twirl.api.XmlFormat.Appendable) = (variable) => apply(variable)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/_mi_parcialRecetas.scala.xml
                  HASH: 4d62201e58fb059f050e45c29d030c5b31c37011
                  MATRIX: 914->1|1025->20|1054->23|1104->47|1148->71|1205->102|1253->130|1319->170|1372->203|1423->229|1483->269|1511->270
                  LINES: 27->1|32->2|35->5|36->6|36->6|37->7|37->7|38->8|38->8|39->9|39->9|40->10
                  -- GENERATED --
              */
          