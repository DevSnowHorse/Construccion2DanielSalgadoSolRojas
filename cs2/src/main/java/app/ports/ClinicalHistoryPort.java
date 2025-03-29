package app.ports;

import java.util.List;

import app.domain.models.ClinicalHistory;

public interface ClinicalHistoryPort {
	public boolean existClinicalHistory(long historyID);
    public void saveClinicalHistory(ClinicalHistory clinicalhistory);
    public ClinicalHistory findByClinicalHistoryID(long historyID);
    List<ClinicalHistory> findAllsClinicalHistorys();
}
