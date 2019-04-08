package simulations.uk.gov.hmcts.reform.docgen.bundling.util;

object Environment {
  val httpConfig = scala.util.Properties.envOrElse("httpConfig", "http")

  val users = scala.util.Properties.envOrElse("numberOfUser", "10")
  val maxResponseTime = scala.util.Properties.envOrElse("maxResponseTime", "500")
  val idamCookieName="SESSION_ID"

  val baseURL = scala.util.Properties.envOrElse("baseURL", "https://dg-docassembly-aat.service.core-compute-aat.internal")
  val DOCMOSIS_URL = "https://docmosis-development.platform.hmcts.net/"
  val IDAM_WEB_URL = "https://idam.preprod.ccidam.reform.hmcts.net"

  val minThinkTime = 12
  val maxThinkTime = 15
  val waitForNextIteration = 80
  val constantthinkTime = 4
}
