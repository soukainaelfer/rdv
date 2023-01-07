package ma.enova.rdv.workflow.demanderdv.save;

import ma.enova.rdv.service.facade.admin.DemandeRdvAdminService;
import ma.enova.rdv.service.facade.patient.DemandeRdvPatientService;
import ma.enova.rdv.ws.dto.DemandeRdvDto;
import ma.enova.rdv.ws.dto.StatusRdvDto;
import ma.enova.rdv.zynerator.process.AbstractProcessImpl;
import ma.enova.rdv.zynerator.process.Result;
import org.springframework.beans.BeanUtils;

public class DemandeRdvSaveProcessImpl extends AbstractProcessImpl<DemandeRdvSaveInput, DemandeRdvSaveOutput> implements DemandeRdvSaveProcess {
    @Override
    public void validate(DemandeRdvSaveInput input, DemandeRdvSaveOutput output, Result<DemandeRdvSaveInput, DemandeRdvSaveOutput> result) {

    }

    @Override
    public void run(DemandeRdvSaveInput input, DemandeRdvSaveOutput output, Result<DemandeRdvSaveInput, DemandeRdvSaveOutput> result) {
        output.setStatusRdv(constructInitialisationPatientStatus());
        ///
        DemandeRdvDto demandeRdvDto = new DemandeRdvDto();
        demandeRdvDto.setReference(System.currentTimeMillis()+"");
        BeanUtils.copyProperties(input,demandeRdvDto);
        try {
            service.create(demandeRdvDto);
            //emailUtil.send()
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private StatusRdvDto constructInitialisationPatientStatus() {
        return null;
    }

    public DemandeRdvSaveProcessImpl(DemandeRdvPatientService service) {
        this.service = service;
    }

    DemandeRdvPatientService service;
}
