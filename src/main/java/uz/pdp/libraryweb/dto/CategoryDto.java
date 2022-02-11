package uz.pdp.libraryweb.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CategoryDto {
    private String name;
    private boolean active;
}
