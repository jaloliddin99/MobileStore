package uz.cau.mobilestore.main.data;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MobileShortDetailsDTO {
    private Integer id;
    private String model;
    private Integer produced_year;
    private Integer ram;
    private Integer storage;
    private Float cost;
    private String price_unit;
}
