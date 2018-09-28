package springfive.cms.domain.models;

import lombok.Data;

@Data
public class Category {
    String Id;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
