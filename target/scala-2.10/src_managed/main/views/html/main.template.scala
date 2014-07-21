
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
    <link rel="stylesheet" media="screen" href='"""),_display_(Seq[Any](/*10.50*/routes/*10.56*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*10.99*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(Seq[Any](/*11.50*/routes/*11.56*/.Assets.at("stylesheets/smoke.css"))),format.raw/*11.91*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(Seq[Any](/*12.50*/routes/*12.56*/.Assets.at("stylesheets/dark.css"))),format.raw/*12.90*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(Seq[Any](/*13.50*/routes/*13.56*/.Assets.at("stylesheets/simplex.css"))),format.raw/*13.93*/("""'>
    <link rel="shortcut icon" type="image/png" href='"""),_display_(Seq[Any](/*14.55*/routes/*14.61*/.Assets.at("images/favicon.ico"))),format.raw/*14.93*/("""'>
    <title>"""),_display_(Seq[Any](/*15.13*/title)),format.raw/*15.18*/("""</title>

    <script type="text/javascript">
        var _gaq = _gaq || [];
        _gaq.push(['_setAccount', 'UA-33549044-1']);
        _gaq.push(['_setDomainName', 'simplex.dyndns.biz']);
        _gaq.push(['_trackPageview']);

        (function() """),format.raw/*23.21*/(""""""),format.raw/*23.49*/("""{"""),format.raw/*23.50*/(""""""),format.raw/*23.22*/("""
            var ga = document.createElement('script');
            ga.type = 'text/javascript';
            ga.async = true;
            ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
            var s = document.getElementsByTagName('script')[0];
            s.parentNode.insertBefore(ga, s);
        """),format.raw/*30.9*/(""""""),format.raw/*30.36*/("""}"""),format.raw/*30.37*/(""""""),format.raw/*30.10*/(""")();
    </script>

</head>


<body>
<!--[if IE]><h3 class=chromeframe>Your browser can't render this site. <a
        href="http://www.google.com/chromeframe/?redirect=true">Click to Fix it!</a></h3><![endif]-->
<header>
    <div class="navbar navbar-default">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-responsive-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#" style="color: #28b62c">Final IO</a>
        </div>
        <div class="navbar-collapse collapse navbar-responsive-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Algoritmo de Simplex</a></li>
            </ul>

        </div>
    </div>
    <!--<a style="text-align: center;">"""),_display_(Seq[Any](/*57.41*/title)),format.raw/*57.46*/("""</a>-->
</header>


<section>
    """),_display_(Seq[Any](/*62.6*/content)),format.raw/*62.13*/("""
</section>

<div id="footer">
    <div class="container text-center" style="background-color: rgba(0, 0, 0, 0.88);width: 30%;padding-right: 0px;padding-left: 0px;border-radius: 5px;">
        <p class="text-muted" style="color: white;margin-bottom: 0px;padding-top: 10px;padding-bottom: 10px;padding-right: 10px;padding-left: 10px;">Final IO - 14/07/2014 - Kevin Stessens, Tomás Mateus</p>
    </div>
</div>

</body>

<script src='"""),_display_(Seq[Any](/*73.15*/routes/*73.21*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*73.63*/("""' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*74.15*/routes/*74.21*/.Assets.at("javascripts/smoke.js"))),format.raw/*74.55*/("""' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*75.15*/routes/*75.21*/.Assets.at("javascripts/jquery-1.6.4.min.js"))),format.raw/*75.66*/("""' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*76.15*/routes/*76.21*/.Assets.at("javascripts/simplexController.js"))),format.raw/*76.67*/("""' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*77.15*/routes/*77.21*/.Assets.at("javascripts/webSocket.js"))),format.raw/*77.59*/("""' type="text/javascript"></script>
<script type="text/javascript">
    $(function() """),format.raw/*79.18*/(""""""),format.raw/*78.46*/("""{"""),format.raw/*78.47*/(""""""),format.raw/*79.19*/("""
        initWebSocket(""""),_display_(Seq[Any](/*80.25*/routes/*80.31*/.AppController.socket().webSocketURL(request))),format.raw/*80.76*/("""");
    """),format.raw/*81.5*/(""""""),format.raw/*80.32*/("""}"""),format.raw/*80.33*/(""""""),format.raw/*81.6*/(""");
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
                    DATE: Mon Jul 21 12:41:47 ART 2014
                    SOURCE: /Volumes/ARCHIVOS/Fuck U/Cursadas/Tercero/IO/final/iofinal/app/views/main.scala.html
                    HASH: ffe4205fedb4b6b1060461ce42f1953d4e7cb998
                    MATRIX: 727->1|834->31|2281->1450|2310->1451|2763->1876|2792->1877|5276->4333|5305->4334|5539->4540|5568->4541
                    LINES: 26->1|29->1|51->23|51->23|58->30|58->30|106->78|106->78|108->80|108->80
                    -- GENERATED --
                */
            