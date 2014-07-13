
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
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object maincopy extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

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

        (function() """),format.raw/*22.21*/("""{"""),format.raw/*22.22*/("""
            var ga = document.createElement('script');
            ga.type = 'text/javascript';
            ga.async = true;
            ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
            var s = document.getElementsByTagName('script')[0];
            s.parentNode.insertBefore(ga, s);
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/(""")();
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
    $(function() """),format.raw/*69.18*/("""{"""),format.raw/*69.19*/("""
        initWebSocket(""""),_display_(Seq[Any](/*70.25*/routes/*70.31*/.AppController.socket().webSocketURL(request))),format.raw/*70.76*/("""");
    """),format.raw/*71.5*/("""}"""),format.raw/*71.6*/(""");
</script>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.Html = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jul 12 16:49:11 GMT-03:00 2014
                    SOURCE: /Users/Tomi/Desktop/simplex/app/views/maincopy.scala.html
                    HASH: 087453f0c7ecf6dde0eba392da4c4c8b1ee9c3dd
                    MATRIX: 731->1|838->31|1015->173|1029->179|1089->218|1177->270|1192->276|1249->311|1337->363|1352->369|1408->403|1496->455|1511->461|1570->498|1663->555|1678->561|1732->593|1783->608|1810->613|2089->864|2118->865|2515->1235|2544->1236|2838->1494|2865->1499|2932->1531|2961->1538|3450->1991|3465->1997|3521->2031|3606->2080|3621->2086|3688->2131|3773->2180|3788->2186|3856->2232|3941->2281|3956->2287|4016->2325|4128->2409|4157->2410|4218->2435|4233->2441|4300->2486|4335->2494|4363->2495
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|50->22|50->22|57->29|57->29|67->39|67->39|72->44|72->44|92->64|92->64|92->64|93->65|93->65|93->65|94->66|94->66|94->66|95->67|95->67|95->67|97->69|97->69|98->70|98->70|98->70|99->71|99->71
                    -- GENERATED --
                */
            