
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
object simplex extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main(title = "SIMPLEX SOLVER")/*1.32*/ {_display_(Seq[Any](format.raw/*1.34*/("""


<div id="panels">

    <div id="panelPaso1">

        <h3 style="margin-top: 0; margin-bottom: 20px; color: white;">SELECCIONAR CANTIDAD </h3>

                <form accept-charset="UTF-8" action="/players" class="form-horizontal" id="new_player" method="post" style="margin-bottom: 0;">
                    <div style="margin:0;padding:0;display:inline">
                        <input name="utf8" type="hidden" value="✓">
                        <input name="authenticity_token" type="hidden" value="CMXrI0MGkDWKu9011hx6zN5orQYzuoee7760PGr78YA=">
                    </div>

                    <div class="form-group" style="margin: 10px 10px 15px 10px;">
                        <label class="col-md-4 control-label" for="variables" style="color: white; float: left; text-align: left;">Variables: </label>
                        <div class="col-md-4" style="float: right;">
                            <input autofocus="autofocus" class="form-control number" id="variables" required="required" type="text">
                        </div>
                    </div>
                    <div class="form-group" style="margin: 10px 10px 15px 10px;">
                        <label class="col-md-4 control-label" for="restricciones" style="color: white; float: left; text-align: left;">Restricciones: </label>
                        <div class="col-md-4" style="float: right;">
                            <input autofocus="autofocus" class="form-control number" id="restricciones" required="required" type="text">
                        </div>
                    </div>

                    <div style="text-align: right;">
                        <button type="button" class="btn btn-danger" onclick="nextStep()">></button>
                    </div>
                </form>

    </div>


    <div id="panelPaso2">
        <div><h3>Objetivo</h3></div>


        <div id="panelDeFuncional">
            <p id="funcional">
            </p>
        </div>

        <p>
            <input type="radio" name="obj" value="MAX" id="max" checked="true">Maximizar
            <input type="radio" name="obj" value="MIN" id="min">Minimizar
        </p>

        <h3>Restricciones</h3>

        <div id="panelDeRestricciones">

        </div>

        </br>

        <button class="boton" onclick="previousStep()">Volver
        </button>
        <button class="boton" onclick="nextStep()">Resolver
        </button>
    </div>

    <div id="panelEstandar">
        <div id="panelDeFuncionalEstandar">
            <h3>Funcional</h3>

            <p id="funcionalEstandar">
            </p>
        </div>

        <h3>Restricciones Estandar</h3>

        <div id="panelDeRestriccionesEstandar">

        </div>

        <h3>Condiciones</h3>

        <div id="condiciones">
            <p>Se asumen variables reales y no negativas</p>

            <p id="valorM"></p>
        </div>

    </div>


    <div id="panelPaso3">


        <h3><span id="iterationNumber"></span></h3>

        <div id="panelDeTabla">
        </div>

        <div id="loadingPanel">
            <p>
                <img id="loadingGif" src='"""),_display_(Seq[Any](/*103.44*/routes/*103.50*/.Assets.at("images/ajax-loader.gif"))),format.raw/*103.86*/("""'>
            </p>
        </div>

        </br>

        <button class="boton" onclick="sendMessage('initial')"><<
        </button>
        <button class="boton" onclick="sendMessage('previous')"><
        </button>


        <button class="boton" onclick="sendMessage('next')">>
        </button>
        <button class="boton" onclick="sendMessage('optimal')">>>
        </button>

        </br> </br></br>

        <button class="boton" onclick="nextStep()" disabled id="resultsBt" >Resultados
        </button>

    </div>

    <div id="panelPaso4">
        <h3 style="margin-bottom: 20px;">Resultados </h3>


        <div id="resultados">
        </div>
        <div id="funcionalPaso4">
        </div>
        <div id="valorFuncional">
        </div>

        </br>

        <button class="boton" onclick="previousStep()">Anterior
        </button>
    </div>

</div>

""")))})))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jul 12 22:27:34 GMT-03:00 2014
                    SOURCE: /Users/Tomi/Desktop/simplex/app/views/simplex.scala.html
                    HASH: 28009b5f4a5dd87c3cc93d6b67b9842973a99f77
                    MATRIX: 798->1|836->31|875->33|3774->2895|3790->2901|3849->2937
                    LINES: 29->1|29->1|29->1|131->103|131->103|131->103
                    -- GENERATED --
                */
            