package com.project.elice2.global.security.oauth;

import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.oidc.IdTokenClaimNames;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SocialClientRegistration {

    public ClientRegistration googleClientRegistration() {

        return ClientRegistration.withRegistrationId("google")
                .clientId("873761118391-lc4ftqa55rtnhrt4r53830lsfivpd9j5.apps.googleusercontent.com")
                .clientSecret("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")
                .redirectUri("https://elice-happy-shop.duckdns.org/login/oauth2/code/google")
                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
                .scope("profile", "email")
                .providerConfigurationMetadata(Map.of("flowName", "GeneralOAuthFlow"))
                .authorizationUri("https://accounts.google.com/o/oauth2/v2/auth")
                .tokenUri("https://www.googleapis.com/oauth2/v4/token")
                .jwkSetUri("https://www.googleapis.com/oauth2/v3/certs")
                .issuerUri("https://accounts.google.com")
                .userInfoUri("https://www.googleapis.com/oauth2/v3/userinfo")
                .userNameAttributeName(IdTokenClaimNames.SUB)
                .build();
    }
}
