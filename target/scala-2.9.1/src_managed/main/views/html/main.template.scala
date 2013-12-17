
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="chrome=1">

    <link rel="stylesheet" media="screen" href='"""),_display_(Seq[Any](/*9.50*/routes/*9.56*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*9.95*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(Seq[Any](/*10.50*/routes/*10.56*/.Assets.at("stylesheets/smoke.css"))),format.raw/*10.91*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(Seq[Any](/*11.50*/routes/*11.56*/.Assets.at("stylesheets/dark.css"))),format.raw/*11.90*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(Seq[Any](/*12.50*/routes/*12.56*/.Assets.at("stylesheets/simplex.css"))),format.raw/*12.93*/("""'>
    <link rel="shortcut icon" type="image/png" href='"""),_display_(Seq[Any](/*13.55*/routes/*13.61*/.Assets.at("images/favicon.ico"))),format.raw/*13.93*/("""'>
    <title>"""),_display_(Seq[Any](/*14.13*/title)),format.raw/*14.18*/("""</title>

    <script type="text/javascript">
        var _gaq = _gaq || [];
        _gaq.push(['_setAccount', 'UA-33549044-1']);
        _gaq.push(['_setDomainName', 'simplex.dyndns.biz']);
        _gaq.push(['_trackPageview']);

        (function() """),format.raw("""{"""),format.raw/*22.22*/("""
            var ga = document.createElement('script');
            ga.type = 'text/javascript';
            ga.async = true;
            ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
            var s = document.getElementsByTagName('script')[0];
            s.parentNode.insertBefore(ga, s);
        """),format.raw("""}"""),format.raw/*29.10*/(""")();
    </script>

</head>


<body>
<!--[if IE]><h3 class=chromeframe>Your browser can't render this site. <a
        href="http://www.google.com/chromeframe/?redirect=true">Click to Fix it!</a></h3><![endif]-->
<header>
    <a style="text-align: center;">"""),_display_(Seq[Any](/*39.37*/title)),format.raw/*39.42*/("""</a>
</header>


<section>
    """),_display_(Seq[Any](/*44.6*/content)),format.raw/*44.13*/("""
</section>

<footer>
    <div style="text-align: left; margin-left: 20px; float:left;">
        <p style="font-size: 18px;">Final Investigación Operativa </p>

        <p>Universidad Austal</p>

        <p>16/12/2013</p>
    </div>
    <div style="text-align: left; margin-right: 25px; float: right;">
        <p  style="font-size: 15px; margin-top: 55px;">Laura López Bukovac - Damián Roque Minniti </p>
    </div>


</footer>

</body>

<script src='"""),_display_(Seq[Any](/*64.15*/routes/*64.21*/.Assets.at("javascripts/smoke.js"))),format.raw/*64.55*/("""' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*65.15*/routes/*65.21*/.Assets.at("javascripts/jquery-1.6.4.min.js"))),format.raw/*65.66*/("""' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*66.15*/routes/*66.21*/.Assets.at("javascripts/simplexController.js"))),format.raw/*66.67*/("""' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*67.15*/routes/*67.21*/.Assets.at("javascripts/webSocket.js"))),format.raw/*67.59*/("""' type="text/javascript"></script>
<script type="text/javascript">
    $(function() """),format.raw("""{"""),format.raw/*69.19*/("""
        initWebSocket(""""),_display_(Seq[Any](/*70.25*/routes/*70.31*/.AppController.socket().webSocketURL(request))),format.raw/*70.76*/("""");
    """),format.raw("""}"""),format.raw/*71.6*/(""");
</script>
</html>
"""))}
    }
    
    def render(title:String,content:Html) = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Dec 16 15:48:49 ART 2013
                    SOURCE: C:/play/projects/IO-SIMPLEX/simplex/app/views/main.scala.html
                    HASH: 087453f0c7ecf6dde0eba392da4c4c8b1ee9c3dd
                    MATRIX: 759->1|866->31|1043->173|1057->179|1117->218|1205->270|1220->276|1277->311|1365->363|1380->369|1436->403|1524->455|1539->461|1598->498|1691->555|1706->561|1760->593|1811->608|1838->613|2137->865|2555->1236|2849->1494|2876->1499|2943->1531|2972->1538|3461->1991|3476->1997|3532->2031|3617->2080|3632->2086|3699->2131|3784->2180|3799->2186|3867->2232|3952->2281|3967->2287|4027->2325|4159->2410|4220->2435|4235->2441|4302->2486|4357->2495
                    LINES: 27->1|30->1|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|51->22|58->29|68->39|68->39|73->44|73->44|93->64|93->64|93->64|94->65|94->65|94->65|95->66|95->66|95->66|96->67|96->67|96->67|98->69|99->70|99->70|99->70|100->71
                    -- GENERATED --
                */
            