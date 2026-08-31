package devPilot.backend.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;

public class CryptoConfig {

    @Bean
    TextEncryptor textEncryptor(
        @Value("${app.token-encryptor-password") String password,
            @Value("${app.token-encryptor-salt}") String salt){
        return Encryptors.text(password, salt);
    }
}
