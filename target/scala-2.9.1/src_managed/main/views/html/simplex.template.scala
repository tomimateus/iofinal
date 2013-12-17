
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
object simplex extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main(title = "SIMPLEX SOLVER")/*1.32*/ {_display_(Seq[Any](format.raw/*1.34*/("""


<div id="panels">

    <div id="panelPaso1">

        <h3>Datos </h3>

        <p>
            <label for="variables" style="margin-right: 40px;">N° de variables: </label>
            <input id="variables" class="number" style="margin-right: 0px;">
        </p>

        <p>
            <label for="restricciones">N° de restricciones: </label><input id="restricciones" class="number">
        </p>
        </br>
        <button class="boton" onclick="nextStep()">Siguiente
        </button>

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
                <img id="loadingGif" src='"""),_display_(Seq[Any](/*88.44*/routes/*88.50*/.Assets.at("images/ajax-loader.gif"))),format.raw/*88.86*/("""'>
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

        <button class="boton" onclick="previousStep()">Anterior
        </button>
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
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 15 14:28:31 ART 2013
                    SOURCE: C:/play/projects/IO-SIMPLEX/simplex/app/views/simplex.scala.html
                    HASH: 6660c3823821473f19d44c2b274f2bd05db125f2
                    MATRIX: 830->1|868->31|907->33|2766->1856|2781->1862|2839->1898
                    LINES: 30->1|30->1|30->1|117->88|117->88|117->88
                    -- GENERATED --
                */
            