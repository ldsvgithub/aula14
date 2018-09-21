/*
*
* Aula com Nataniel Paiva
*
* Esse projeto poderá ser distribuído da forma que você achar melhor
* O importante é que você aprenda de verdade!
*
 */
package io.spring.aula.natan.config;

//import io.spring.aula.natan.service.MyUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com>
 */
//@Configuration
//@EnableAuthorizationServer
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {

	// Utilizar o token em memória, significa que se você derrubar o servidor ele desaparece
	// porque ele está guardado na memória do seu servidor.
	// Porém pra mim era na sessão mas tudo bem.
    private TokenStore tokenStore = new InMemoryTokenStore();

    // É o método criado com o nome do Qualifier em WebSecurityConfig
    /*
    @Autowired
    @Qualifier("authenticationManagerBean")
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailService userDetailService;

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpointsConfigurer) {
        endpointsConfigurer.tokenStore(this.tokenStore)
                .authenticationManager(this.authenticationManager)
                .userDetailsService(userDetailService);
    }
    
    public void configure (ClientDetailsServiceConfigurer clients) throws Exception{
        clients  
                .inMemory()
                
                // Isso coloca no username da autenticação do token
                // O usuário e senha da autenticação normal é outro
                // não confundir
                .withClient("mobile")
                
                .authorizedGrantTypes("password", "authorization_code", "refresh_token").scopes("bar", "read", "write")
                .refreshTokenValiditySeconds(20000)
                .accessTokenValiditySeconds(20000)
                // foi colocado lá no ResourceServerConfiguration 
                // no método configure
                .resourceIds("restservice")
                
                // Isso coloca no password da autenticação do token,
                // O usuário e senha da autenticação normal é outro
                // não confundir
                .secret("123");
                
    }
    
    @Bean
    @Primary
    public DefaultTokenServices tokenServices(){
        DefaultTokenServices tokenServices = new DefaultTokenServices();
        
        tokenServices.setSupportRefreshToken(true);
        tokenServices.setTokenStore(tokenStore);
        return tokenServices;
    }
    */

}
