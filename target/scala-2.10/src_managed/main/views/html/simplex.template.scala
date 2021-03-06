
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
        <h3>Seleccionar Cantidad</h3>
        <form accept-charset="UTF-8" action="/players" class="form-horizontal" id="new_player" method="post" style="display: inline-block;">
            <div id="a-div">
                <input name="utf8" type="hidden" value="✓">
                <input name="authenticity_token" type="hidden" value="CMXrI0MGkDWKu9011hx6zN5orQYzuoee7760PGr78YA=">
            </div>
            <div class="form-group">
                <label class="col-md-4 control-label" for="variables" style="margin-right:2px;"> Variables: </label>
                <div class="col-md-4">
                    <input autofocus="autofocus" class="form-control number" id="variables" required="required" type="text">
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-4 control-label" for="restricciones" style="margin-right:2px;">Restricciones: </label>
                <div class="col-md-4">
                    <input autofocus="autofocus" class="form-control number" id="restricciones" required="required" type="text">
                </div>
            </div>
        </form>
        <div class="b-div">
            <button type="button" class="btn btn-success" onclick="nextStep()">></button>
        </div>
    </div>

    <div id="panelPaso2">
        <h3>Definir Objetivo</h3>
        <div id="panelDeFuncional">
            <p id="funcional">
            </p>
        </div>
        <p>
            <input type="radio" name="obj" value="MAX" id="max" checked="true">MAX
            <input type="radio" name="obj" value="MIN" id="min">MIN
        </p>
        <h3>Definir Restricciones</h3>
        <div id="panelDeRestricciones">
        </div>
        </br>
        <div>
            <div class="b-div" style="display: inline-block; float: left;">
                <button type="button" class="btn btn-success" onclick="previousStep()"><</button>
            </div>
            <div class="b-div">
                <button type="button" class="btn btn-success" onclick="nextStep()">></button>
            </div>
        </div>
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
        <div>
            <div class="b-div" style="display: inline-block; float: left">
                <button type="button" class="btn btn-success" onclick="sendMessage('previous')"><</button>
            </div>
            <div class="b-div">
                <button type="button" class="btn btn-success" onclick="sendMessage('next')">></button>
            </div>
            <div class="b-div" style="text-align: center">
                <button type="button" class="btn btn-success" onclick="nextStep()">Resultados</button>
            </div>
        </div>
    </div>

    <div id="panelPaso4">
        <h3>Resultados </h3>
        <div id="resultados">
        </div>
        <div id="funcionalPaso4">
        </div>
        <div id="valorFuncional">
        </div>
        </br>
        <div>
            <div class="b-div" style="display: inline-block; float: left">
                <button type="button" class="btn btn-success" onclick="previousStep()"><</button>
            </div>
            <div class="b-div">
                <button type="button" class="btn btn-success" onclick="firstStep()">Volver al inicio</button>
            </div>
        </div>

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
                    DATE: Tue Aug 05 13:02:53 ART 2014
                    SOURCE: /Volumes/ARCHIVOS/Fuck U/Cursadas/Tercero/IO/final/iofinal/app/views/simplex.scala.html
                    HASH: b2304e71b543c0e5e3ba391516be268ac4301c65
                    MATRIX: 798->1|836->31|875->33
                    LINES: 29->1|29->1|29->1
                    -- GENERATED --
                */
            