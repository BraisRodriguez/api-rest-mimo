
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


Seq[Any](format.raw/*2.1*/("""        """),format.raw/*2.9*/("""<?xml version="1.0" encoding="UTF-8"?>
<receta>
    <idReceta>"""),_display_(/*4.16*/(receta.getIdReceta())),format.raw/*4.38*/("""</idReceta>
    <nombreReceta>"""),_display_(/*5.20*/(receta.getNombreReceta())),format.raw/*5.46*/("""</nombreReceta>
    <descripcionReceta>"""),_display_(/*6.25*/(receta.getDescripcionReceta())),format.raw/*6.56*/("""</descripcionReceta>
    <listaIngredientes>"""),_display_(/*7.25*/ingredientes(receta.getIngredientes())),format.raw/*7.63*/("""</listaIngredientes>
</receta>"""))
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
                  HASH: 67a295d72234fc0e1089c93bb4c0c7b0cb72ed40
                  MATRIX: 902->1|1010->17|1044->25|1133->88|1175->110|1232->141|1278->167|1344->207|1395->238|1466->283|1524->321
                  LINES: 27->1|32->2|32->2|34->4|34->4|35->5|35->5|36->6|36->6|37->7|37->7
                  -- GENERATED --
              */
          