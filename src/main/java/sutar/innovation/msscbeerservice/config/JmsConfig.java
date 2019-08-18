package sutar.innovation.msscbeerservice.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;
import org.springframework.web.servlet.resource.ContentVersionStrategy;

@Configuration
public class JmsConfig {
    public static final String BREWING_REQUEST_QUEUE = "brewing-request";
    public static final String NEW_INVENTORY_QUEUE = "new-inventory";

    @Bean
    public MessageConverter jacksonJmsMesageConverter(ObjectMapper objectMapper)
    {
        MappingJackson2MessageConverter convertor = new MappingJackson2MessageConverter();
        convertor.setTargetType(MessageType.TEXT);
        convertor.setTypeIdPropertyName("_type");
        convertor.setObjectMapper(objectMapper);
        return convertor;
    }



}
