
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

object _mi_parcialUsuario extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[Usuario,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario:Usuario):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<usuario>
    <idUsuario>"""),_display_(/*3.17*/(usuario.getIdUsuario())),format.raw/*3.41*/("""</idUsuario>
    <nombreUsuario>"""),_display_(/*4.21*/(usuario.getNombreUsuario())),format.raw/*4.49*/("""</nombreUsuario>
    <correoUsuario>"""),_display_(/*5.21*/(usuario.getCorreoUsuario())),format.raw/*5.49*/("""</correoUsuario>
    """),_display_(/*6.6*/recetas2(usuario.getRecetas())),format.raw/*6.36*/("""
"""),format.raw/*7.1*/("""</usuario>"""))
      }
    }
  }

  def render(usuario:Usuario): play.twirl.api.XmlFormat.Appendable = apply(usuario)

  def f:((Usuario) => play.twirl.api.XmlFormat.Appendable) = (usuario) => apply(usuario)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/_mi_parcialUsuario.scala.xml
                  HASH: ca222690e5513775ee5055e11a3f163d5e200485
                  MATRIX: 915->1|1025->19|1077->45|1121->69|1180->102|1228->130|1291->167|1339->195|1386->217|1436->247|1463->248
                  LINES: 27->1|32->2|33->3|33->3|34->4|34->4|35->5|35->5|36->6|36->6|37->7
                  -- GENERATED --
              */
          