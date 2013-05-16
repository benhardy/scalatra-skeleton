package demo


import org.scalatest.matchers.{ShouldMatchers, MustMatchers}
import org.scalatest.{FunSuite, FunSpec}
import org.scalatra.test.scalatest._

class DemoServletSpec extends ScalatraSuite with FunSuite {
  addServlet(new DemoServlet, "/*")

  test("main page") {
    get("/") {
      status must be === 200
      body must include ("Hello")
    }
  }
}
