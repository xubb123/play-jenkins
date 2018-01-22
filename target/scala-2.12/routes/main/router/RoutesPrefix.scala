
// @GENERATOR:play-routes-compiler
// @SOURCE:/opt/soft/play-java-starter-example/conf/routes
// @DATE:Mon Jan 08 22:10:47 PST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
