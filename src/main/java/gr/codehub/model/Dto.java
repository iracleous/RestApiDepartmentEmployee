package gr.codehub.model;

import lombok.Data;

import java.util.List;

@Data
public class Dto {
    private Object meta;
    private List<User> data;
}
