package model;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class BaseModel {
    private String name;
    private int count;

}
