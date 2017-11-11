
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""
"""),format.raw/*2.1*/("""<!-- https://v4-alpha.getbootstrap.com/getting-started/introduction/ -->

<html>
  
  <head>
    <title>Home</title>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  
        <!-- Bootsrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
  </head>
  
  <body>
    <!-- start of nav section -->
    <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
      <!-- nav header/ branding -->
        <a class="navbar-brand" href="/">Lab 2</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#menuBar" aria-controls="menuBar" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
  
      <div class="collapse navbar-collapse" id="menuBar">
        <!-- List containing nav links -->
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="/">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/about">About Us</a>
          </li>
        </ul>
      </div>
    </nav>
  
      <!-- Main jumbotron for a primary marketing message or call to action -->
      <div class="jumbotron">
          <div class="container">
            <h1 class="display-3">"""),_display_(/*41.36*/message),format.raw/*41.43*/(""" """),format.raw/*41.44*/("""- """),_display_(/*41.47*/name),format.raw/*41.51*/("""</h1>
            <p>This is the site Home Page - styled using Bootstrp 4. It includes a large callout called a jumbotron and three supporting pieces of content. Use it as a starting point to create something more unique.</p>
            <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more &raquo;</a></p>
          </div>
        </div>
    
        <div class="container">
          <!-- Example row of columns -->
          <div class="row">
            <div class="col-md-4">
              <h2>Heading</h2>
              <p>Some filler text.. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
              <p><a class="btn btn-secondary" href="#" role="button">View details &raquo;</a></p>
            </div>
            <div class="col-md-4">
              <h2>Heading</h2>
              <p>More filler text.. Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
              <p><a class="btn btn-secondary" href="#" role="button">View details &raquo;</a></p>
            </div>
            <div class="col-md-4">
              <h2>Heading</h2>
              <p>Yet more filler text.. Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
              <p><a class="btn btn-secondary" href="#" role="button">View details &raquo;</a></p>
            </div>
          </div>
    
          <hr>
    
          <footer>
            <p>&copy; Company 2017</p>
          </footer>
        </div> <!-- /container -->
      
      <!-- Load JavaScript dependencies last -->
      <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
  </body>
  </html>
"""))
      }
    }
  }

  def render(message:String,name:String): play.twirl.api.HtmlFormat.Appendable = apply(message,name)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,name) => apply(message,name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Nov 11 21:27:47 GMT 2017
                  SOURCE: C:/Users/gleno/Documents/College Work/Year 2/Semester 1/Web And Mobile Design And Development/webapps/playapps/lab2/app/views/index.scala.html
                  HASH: a6c88ce697ea245720768c4f711aebaa12ef59db
                  MATRIX: 955->1|1081->32|1108->33|2693->1591|2721->1598|2750->1599|2780->1602|2805->1606
                  LINES: 28->1|33->1|34->2|73->41|73->41|73->41|73->41|73->41
                  -- GENERATED --
              */
          