package abp.abpfollow.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Peak {
    private String peak;
    private int height;
    private String category;
    private String zone;
    private ArrayList<String> other;
}
