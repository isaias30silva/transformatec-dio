package com.aula118.server2;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClassroomResponse {

    private Integer id;
    private String teacher;
    
}
