import lombok.Data;
import org.springframework.cglib.core.Local;

@Data
public class Request<th, Get> {
    private String zipCode;
}


