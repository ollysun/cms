package springfive.cms.domain.models;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.Embeddable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Review {
    String userId;
    String status;
}
