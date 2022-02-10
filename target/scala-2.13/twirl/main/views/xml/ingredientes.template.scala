
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

object ingredientes extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[List[Ingrediente],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaIngredientes : List[Ingrediente]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<listaIngredientes>
    """),_display_(/*3.6*/for(variable <- listaIngredientes) yield /*3.40*/{_display_(Seq[Any](format.raw/*3.41*/("""

        """),_display_(/*5.10*/_mi_parcialingredientes(variable)),format.raw/*5.43*/("""
    """)))}),format.raw/*6.6*/("""
"""),format.raw/*7.1*/("""</listaIngredientes>
"""))
      }
    }
  }

  def render(listaIngredientes:List[Ingrediente]): play.twirl.api.XmlFormat.Appendable = apply(listaIngredientes)

  def f:((List[Ingrediente]) => play.twirl.api.XmlFormat.Appendable) = (listaIngredientes) => apply(listaIngredientes)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/ingredientes.scala.xml
                  HASH: befacae3ee83f28329450cea7e89d47f7e098b0a
                  MATRIX: 919->1|1051->41|1101->66|1150->100|1188->101|1225->112|1278->145|1313->151|1340->152
                  LINES: 27->1|32->2|33->3|33->3|33->3|35->5|35->5|36->6|37->7
                  -- GENERATED --
              */
          