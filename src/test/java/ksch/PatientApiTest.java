package ksch;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ksch.model.Patient;
import ksch.model.PatientResponse;

public class PatientApiTest {

    @Test
    @DisplayName("Should create patient without any provided details")
    public void testCreatePatientEmergency() {
        if (true) {
            return;
        }

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api");

        PatientApi apiInstance = new PatientApi(defaultClient);
        Patient patient = new Patient(); // Patient | Object containing the patient details
        try {
            PatientResponse result = apiInstance.createPatient(patient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PatientApi#createPatient");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }

}
