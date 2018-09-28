package springfive.cms.domain.vo;

import lombok.Data;

@Data
public class CategoryRequest {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
