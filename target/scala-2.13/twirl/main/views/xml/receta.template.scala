
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

object receta extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[Receta,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(receta:Receta):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<receta>
    <idReceta>"""),_display_(/*3.16*/(receta.getIdReceta())),format.raw/*3.38*/("""</idReceta>
    <nombreReceta>"""),_display_(/*4.20*/(receta.getNombreReceta())),format.raw/*4.46*/("""</nombreReceta>
    <descripcionReceta>"""),_display_(/*5.25*/(receta.getDescripcionReceta())),format.raw/*5.56*/("""</descripcionReceta>
    """),_display_(/*6.6*/ingredientes(receta.getIngredientes())),format.raw/*6.44*/("""
"""),format.raw/*7.1*/("""</receta>"""))
      }
    }
  }

  def render(receta:Receta): play.twirl.api.XmlFormat.Appendable = apply(receta)

  def f:((Receta) => play.twirl.api.XmlFormat.Appendable) = (receta) => apply(receta)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/receta.scala.xml
                  HASH: 2d434911dc377595cb4dd077ccf780c625f9fde4
                  MATRIX: 902->1|1010->17|1060->41|1102->63|1159->94|1205->120|1271->160|1322->191|1373->217|1431->255|1458->256
                  LINES: 27->1|32->2|33->3|33->3|34->4|34->4|35->5|35->5|36->6|36->6|37->7
                  -- GENERATED --
              */
          