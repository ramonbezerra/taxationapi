package com.enterprise.taxationapi;

import com.enterprise.taxationapi.TaxationapiApp;
import com.enterprise.taxationapi.config.AsyncSyncConfiguration;
import com.enterprise.taxationapi.config.EmbeddedElasticsearch;
import com.enterprise.taxationapi.config.EmbeddedKafka;
import com.enterprise.taxationapi.config.EmbeddedRedis;
import com.enterprise.taxationapi.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { TaxationapiApp.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedElasticsearch
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
