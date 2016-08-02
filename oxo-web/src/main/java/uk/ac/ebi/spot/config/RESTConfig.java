package uk.ac.ebi.spot.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import uk.ac.ebi.spot.ols.config.OntologyResourceConfig;

/**
 * @author Simon Jupp
 * @date 14/06/2016
 * Samples, Phenotypes and Ontologies Team, EMBL-EBI
 */
public class RESTConfig extends RepositoryRestConfigurerAdapter {


    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.getMetadataConfiguration().setAlpsEnabled(false);
        config.setBasePath("/api");
//        config.exposeIdsFor(OntologyDocument.class, OntologyResourceConfig.class);

    }

}