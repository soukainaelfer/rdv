package ma.enova.rdv.workflow.demanderdv.util;

import ma.enova.rdv.service.facade.patient.DemandeRdvPatientService;
import ma.enova.rdv.workflow.demanderdv.save.DemandeRdvSaveProcess;
import ma.enova.rdv.workflow.demanderdv.save.DemandeRdvSaveProcessImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemandeRdvInjector {

    @Bean
    DemandeRdvSaveProcess demandeRdvSaveProcess(DemandeRdvPatientService service){
        return new DemandeRdvSaveProcessImpl(service);
    }
}
