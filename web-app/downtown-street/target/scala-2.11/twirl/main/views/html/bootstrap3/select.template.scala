
package views.html.bootstrap3

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object select extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Field,String,Map[String, Boolean],Boolean,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "CHANGEME", optionMap: Map[String, Boolean], isMultiple: Boolean, help: String = ""):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.117*/("""

  """),format.raw/*3.3*/("""<div class="form-group """),_display_(/*3.27*/if(field.hasErrors)/*3.46*/ {_display_(Seq[Any](format.raw/*3.48*/("""has-error""")))}),format.raw/*3.58*/("""">
    <label class="col-sm-3 control-label" for=""""),_display_(/*4.49*/field/*4.54*/.id),format.raw/*4.57*/("""">"""),_display_(/*4.60*/label),format.raw/*4.65*/("""</label>
    <div class="col-sm-9">
      <select
        class="form-control"
        id=""""),_display_(/*8.14*/field/*8.19*/.id),format.raw/*8.22*/(""""
        name=""""),_display_(/*9.16*/if(isMultiple)/*9.30*/ {_display_(_display_(/*9.33*/(field.name + "[]")))}/*9.54*/else/*9.59*/{_display_(_display_(/*9.61*/field/*9.66*/.name))}),format.raw/*9.72*/(""""
        """),_display_(/*10.10*/if(isMultiple)/*10.24*/ {_display_(Seq[Any](format.raw/*10.26*/("""multiple="multiple"""")))}),format.raw/*10.46*/(""">
        """),_display_(/*11.10*/if(!isMultiple)/*11.25*/ {_display_(Seq[Any](format.raw/*11.27*/("""<option class="blank" value="">Please select a value</option>""")))}),format.raw/*11.89*/("""
        """),_display_(/*12.10*/for((optionName, isSelected) <- optionMap) yield /*12.52*/ {_display_(Seq[Any](format.raw/*12.54*/("""
          """),format.raw/*13.11*/("""<option id=""""),_display_(/*13.24*/optionName),format.raw/*13.34*/("""" value=""""),_display_(/*13.44*/optionName),format.raw/*13.54*/("""" """),_display_(/*13.57*/if(isSelected)/*13.71*/ {_display_(Seq[Any](format.raw/*13.73*/("""selected""")))}),format.raw/*13.82*/(""">"""),_display_(/*13.84*/optionName),format.raw/*13.94*/("""</option>
        """)))}),format.raw/*14.10*/("""
      """),format.raw/*15.7*/("""</select>
      <span class="help-block">"""),_display_(/*16.33*/help),format.raw/*16.37*/("""</span>
      <span class="help-block">"""),_display_(/*17.33*/{field.error.map { error => error.message }}),format.raw/*17.77*/("""</span>
    </div>
  </div>
"""))}
  }

  def render(field:Field,label:String,optionMap:Map[String, Boolean],isMultiple:Boolean,help:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,optionMap,isMultiple,help)

  def f:((Field,String,Map[String, Boolean],Boolean,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,optionMap,isMultiple,help) => apply(field,label,optionMap,isMultiple,help)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 04 11:01:07 PDT 2015
                  SOURCE: /Users/harshmalewar/Documents/workspace/SixPack/web-app/downtown-street/app/views/bootstrap3/select.scala.html
                  HASH: ad419084100222c0f82d6e6fd3c883417fceedb4
                  MATRIX: 777->1|981->116|1011->120|1061->144|1088->163|1127->165|1167->175|1244->226|1257->231|1280->234|1309->237|1334->242|1452->334|1465->339|1488->342|1531->359|1553->373|1583->376|1613->397|1625->402|1654->404|1667->409|1695->415|1733->426|1756->440|1796->442|1847->462|1885->473|1909->488|1949->490|2042->552|2079->562|2137->604|2177->606|2216->617|2256->630|2287->640|2324->650|2355->660|2385->663|2408->677|2448->679|2488->688|2517->690|2548->700|2598->719|2632->726|2701->768|2726->772|2793->812|2858->856
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|31->3|32->4|32->4|32->4|32->4|32->4|36->8|36->8|36->8|37->9|37->9|37->9|37->9|37->9|37->9|37->9|37->9|38->10|38->10|38->10|38->10|39->11|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|41->13|41->13|41->13|41->13|41->13|41->13|41->13|41->13|42->14|43->15|44->16|44->16|45->17|45->17
                  -- GENERATED --
              */
          