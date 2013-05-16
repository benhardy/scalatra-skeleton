package demo

import org.scalatra.ScalatraServlet

class DemoServlet extends ScalatraServlet {

  get("/") {
    "Hello, world!"
  }
}
