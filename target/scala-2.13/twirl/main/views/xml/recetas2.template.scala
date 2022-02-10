
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

object recetas2 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[List[Receta],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaRecetas : List[Receta]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<listaRecetas>
    """),_display_(/*3.6*/for(variable <- listaRecetas) yield /*3.35*/{_display_(Seq[Any](format.raw/*3.36*/("""

    """),_display_(/*5.6*/_mi_parcialRecetas(variable)),format.raw/*5.34*/("""
    """)))}),format.raw/*6.6*/("""
"""),format.raw/*7.1*/("""</listaRecetas>"""))
      }
    }
  }

  def render(listaRecetas:List[Receta]): play.twirl.api.XmlFormat.Appendable = apply(listaRecetas)

  def f:((List[Receta]) => play.twirl.api.XmlFormat.Appendable) = (listaRecetas) => apply(listaRecetas)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/recetas2.scala.xml
                  HASH: 9e29e8a8b92f7d519c4e5950dc0bd871b2034e0d
                  MATRIX: 910->1|1032->31|1077->51|1121->80|1159->81|1191->88|1239->116|1274->122|1301->123
                  LINES: 27->1|32->2|33->3|33->3|33->3|35->5|35->5|36->6|37->7
                  -- GENERATED --
              */
          