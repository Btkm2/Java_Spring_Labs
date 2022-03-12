package kz.iitu.itse1901.muratbekuly.database;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Car  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Model;
    private Integer Milage;
    private String condition;
    private String manufacturer;
    private String year;
    private Integer price;

}