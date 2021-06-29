package spring.utils;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public final class PropertyNames {
	 
    private PropertyNames() {}


    @Value("${value1}")
    public  String value;




    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}