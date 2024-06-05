package LukokiConversao.ao;

import java.util.HashMap;
import java.util.Map;

public class TaxaCambio {
    private String result;
    private String documentation;
    private String terms_of_use;
    private String time_last_update_unix;
    private String time_last_update_utc;
    private String time_next_update_unix;
    private String time_next_update_utc;
    private String  base_code;
    private  Map<String, Double> conversion_rates;

    public String getResult() {
        return result;
    }

    public TaxaCambio(PegarDaApi pegarDaApi) {
        this.result = pegarDaApi.result();
        this.conversion_rates =pegarDaApi.conversion_rates();
        this.base_code =pegarDaApi.base_code();
        this.time_next_update_utc = pegarDaApi.time_next_update_utc();
        this.time_next_update_unix = pegarDaApi.time_next_update_unix();
        this.time_last_update_utc = pegarDaApi.time_last_update_utc();
        this.time_last_update_unix = pegarDaApi.time_last_update_unix();
        this.terms_of_use = pegarDaApi.terms_of_use();
        this.documentation = pegarDaApi.documentation();
        this.conversion_rates = pegarDaApi.conversion_rates();
    }

    public void setConversion_rates(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public String getTerms_of_use() {
        return terms_of_use;
    }

    public void setTerms_of_use(String terms_of_use) {
        this.terms_of_use = terms_of_use;
    }

    public String getTime_last_update_unix() {
        return time_last_update_unix;
    }

    public void setTime_last_update_unix(String time_last_update_unix) {
        this.time_last_update_unix = time_last_update_unix;
    }

    public String getTime_last_update_utc() {
        return time_last_update_utc;
    }

    public void setTime_last_update_utc(String time_last_update_utc) {
        this.time_last_update_utc = time_last_update_utc;
    }

    public String getTime_next_update_unix() {
        return time_next_update_unix;
    }

    public void setTime_next_update_unix(String time_next_update_unix) {
        this.time_next_update_unix = time_next_update_unix;
    }

    public String getTime_next_update_utc() {
        return time_next_update_utc;
    }

    public void setTime_next_update_utc(String time_next_update_utc) {
        this.time_next_update_utc = time_next_update_utc;
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

    @Override
    public String toString() {
        return "TaxaCambio{" +
                "result='" + result + '\'' +
                ", documentation='" + documentation + '\'' +
                ", terms_of_use='" + terms_of_use + '\'' +
                ", time_last_update_unix='" + time_last_update_unix + '\'' +
                ", time_last_update_utc='" + time_last_update_utc + '\'' +
                ", time_next_update_unix='" + time_next_update_unix + '\'' +
                ", time_next_update_utc='" + time_next_update_utc + '\'' +
                ", base_code='" + base_code + '\'' +
                ", conversion_rates=" + conversion_rates +
                '}';
    }
}
