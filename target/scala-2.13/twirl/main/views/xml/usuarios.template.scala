
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

object usuarios extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[List[Usuario],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaUsuarios : List[Usuario]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<listaUsuarios>
    """),_display_(/*3.6*/for(variable <- listaUsuarios) yield /*3.36*/{_display_(Seq[Any](format.raw/*3.37*/("""

    """),_display_(/*5.6*/_mi_parcialUsuario(variable)),format.raw/*5.34*/("""
    """)))}),format.raw/*6.6*/("""
"""),format.raw/*7.1*/("""</listaUsuarios>"""))
      }
    }
  }

  def render(listaUsuarios:List[Usuario]): play.twirl.api.XmlFormat.Appendable = apply(listaUsuarios)

  def f:((List[Usuario]) => play.twirl.api.XmlFormat.Appendable) = (listaUsuarios) => apply(listaUsuarios)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/usuarios.scala.xml
                  HASH: 7eec1cb7bbfdea931b86bc1f0c8b7ed31da57048
                  MATRIX: 911->1|1035->33|1081->54|1126->84|1164->85|1196->92|1244->120|1279->126|1306->127
                  LINES: 27->1|32->2|33->3|33->3|33->3|35->5|35->5|36->6|37->7
                  -- GENERATED --
              */
          