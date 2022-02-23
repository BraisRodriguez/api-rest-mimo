
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

object usuario extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[Usuario,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario:Usuario):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<usuario>
    <idUsuario>"""),_display_(/*3.17*/(usuario.getIdUsuario)),format.raw/*3.39*/("""</idUsuario>
    <nombreUsuario>"""),_display_(/*4.21*/(usuario.getNombreUsuario)),format.raw/*4.47*/("""</nombreUsuario>
    <correoUsuario>"""),_display_(/*5.21*/(usuario.getCorreoUsuario)),format.raw/*5.47*/("""</correoUsuario>
    """),_display_(/*6.6*/userBio(usuario.getUserBio())),format.raw/*6.35*/("""
    """),_display_(/*7.6*/recetas2(usuario.getRecetas())),format.raw/*7.36*/("""
"""),format.raw/*8.1*/("""</usuario>"""))
      }
    }
  }

  def render(usuario:Usuario): play.twirl.api.XmlFormat.Appendable = apply(usuario)

  def f:((Usuario) => play.twirl.api.XmlFormat.Appendable) = (usuario) => apply(usuario)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/usuario.scala.xml
                  HASH: 54f94405980e441534e0ecdbd86f08e07d6079b0
                  MATRIX: 904->1|1014->19|1066->45|1108->67|1167->100|1213->126|1276->163|1322->189|1369->211|1418->240|1449->246|1499->276|1526->277
                  LINES: 27->1|32->2|33->3|33->3|34->4|34->4|35->5|35->5|36->6|36->6|37->7|37->7|38->8
                  -- GENERATED --
              */
          