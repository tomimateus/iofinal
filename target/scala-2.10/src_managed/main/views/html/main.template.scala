
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

        (function() """),format.raw/*23.21*/("""{"""),format.raw/*23.22*/("""
            var ga = document.createElement('script');
            ga.type = 'text/javascript';
            ga.async = true;
            ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
            var s = document.getElementsByTagName('script')[0];
            s.parentNode.insertBefore(ga, s);
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/(""")();
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
            <a class="navbar-brand" href="#">Final IO</a>
        </div>
        <div class="navbar-collapse collapse navbar-responsive-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Algoritmo de Simplex</a></li>
                <li>Kevin Stessens, Tomás Mateus</li>
            </ul>

        </div>
    </div>
    <!--<a style="text-align: center;">"""),_display_(Seq[Any](/*57.41*/title)),format.raw/*57.46*/("""</a>-->
</header>


<section>
    """),_display_(Seq[Any](/*62.6*/content)),format.raw/*62.13*/("""
</section>

  <div id="footer">
      <div class="container text-center" style="background-color: rgb(71, 71, 71);width: 30%;padding-right: 0px;padding-left: 0px;border-radius: 5px;">
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
    $(function() """),format.raw/*79.18*/("""{"""),format.raw/*79.19*/("""
        initWebSocket(""""),_display_(Seq[Any](/*80.25*/routes/*80.31*/.AppController.socket().webSocketURL(request))),format.raw/*80.76*/("""");
    """),format.raw/*81.5*/("""}"""),format.raw/*81.6*/(""");
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
                    DATE: Sat Jul 12 22:27:34 GMT-03:00 2014
                    SOURCE: /Users/Tomi/Desktop/simplex/app/views/main.scala.html
                    HASH: aca18504d10a9abca090a6581d96d52c8dd4a2c4
                    MATRIX: 727->1|834->31|1011->173|1025->179|1085->218|1173->270|1188->276|1253->319|1341->371|1356->377|1413->412|1501->464|1516->470|1572->504|1660->556|1675->562|1734->599|1827->656|1842->662|1896->694|1947->709|1974->714|2253->965|2282->966|2679->1336|2708->1337|3730->2323|3757->2328|3827->2363|3856->2370|4331->2809|4346->2815|4410->2857|4495->2906|4510->2912|4566->2946|4651->2995|4666->3001|4733->3046|4818->3095|4833->3101|4901->3147|4986->3196|5001->3202|5061->3240|5173->3324|5202->3325|5263->3350|5278->3356|5345->3401|5380->3409|5408->3410
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|51->23|51->23|58->30|58->30|85->57|85->57|90->62|90->62|101->73|101->73|101->73|102->74|102->74|102->74|103->75|103->75|103->75|104->76|104->76|104->76|105->77|105->77|105->77|107->79|107->79|108->80|108->80|108->80|109->81|109->81
                    -- GENERATED --
                */
            