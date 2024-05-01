package uz.cau.mobilestore.main.data;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MobileDTO {
    private String model;
    private Integer produced_year;
    private Integer ram;
    private Integer storage;
    private String cpu_type;
    private String os_version;
    private String screen_size;
    private String description_uz;
    private String description_ru;
    private String color;
    private Float cost;
    private String price_unit;
}
