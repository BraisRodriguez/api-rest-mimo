
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

object userBio extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[UserBio,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userBio:UserBio):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<userBio>
    <idUserBio>"""),_display_(/*4.17*/(userBio.getIdUserBio())),format.raw/*4.41*/("""</idUserBio>
    <pais>"""),_display_(/*5.12*/(userBio.getPais())),format.raw/*5.31*/("""</pais>
    <anoNacimiento>"""),_display_(/*6.21*/(userBio.getAñoNacimiento())),format.raw/*6.49*/("""</anoNacimiento>
</userBio>"""))
      }
    }
  }

  def render(userBio:UserBio): play.twirl.api.XmlFormat.Appendable = apply(userBio)

  def f:((UserBio) => play.twirl.api.XmlFormat.Appendable) = (userBio) => apply(userBio)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/userBio.scala.xml
                  HASH: 6983b2888bca1948e125054bfb84be4b89963c54
                  MATRIX: 904->1|1014->19|1041->20|1093->46|1137->70|1187->94|1226->113|1280->141|1328->169
                  LINES: 27->1|32->2|33->3|34->4|34->4|35->5|35->5|36->6|36->6
                  -- GENERATED --
              */
          