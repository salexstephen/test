package cook;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class Menu {

	@Value("${value}")
	private String value;
	// code_snippet cookSpecialOne end

	@Value("${encryptedValue}")
	private String encryptedValue;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getEncryptedValue() {
		return encryptedValue;
	}

	public void setEncryptedValue(String encryptedValue) {
		this.encryptedValue = encryptedValue;
	}

}
