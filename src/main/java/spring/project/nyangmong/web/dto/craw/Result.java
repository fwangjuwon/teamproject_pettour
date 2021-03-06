package spring.project.nyangmong.web.dto.craw;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Result {
    private PlaceDto resultList;
    private String message;
}