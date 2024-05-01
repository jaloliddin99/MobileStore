package uz.cau.mobilestore.main.data;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class MobileTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
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

    @OneToMany(orphanRemoval = true)
    private ArrayList<ImageTable> images = new ArrayList<>();

    @CreationTimestamp
    private LocalDateTime created_time;
    @UpdateTimestamp
    private LocalDateTime updated_time;

}
