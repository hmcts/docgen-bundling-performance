package simulations.uk.gov.hmcts.reform.docgen.bundling.util;
import io.restassured.RestAssured;

import static io.restassured.specification.ProxySpecification.host;

public class TestUtil {

    private final String idamAuth;
    private final String s2sAuth;

    public TestUtil() {
        IdamHelper idamHelper = new IdamHelper(
                Env.getIdamUrl(),
                Env.getOAuthClient(),
                Env.getOAuthSecret(),
                Env.getOAuthRedirect()
        );

        S2sHelper s2sHelper = new S2sHelper(
                Env.getS2sUrl(),
                Env.getS2sSecret(),
                Env.getS2sMicroservice()
        );

        RestAssured.proxy = host("proxyout.reform.hmcts.net").withPort(8080);
        RestAssured.useRelaxedHTTPSValidation();

        idamAuth = idamHelper.getIdamToken();
        s2sAuth = s2sHelper.getS2sToken();

    }

    public String getIdamAuth() {
        return idamAuth;
    }

    public String getS2sAuth() {
        return s2sAuth;
    }
}
