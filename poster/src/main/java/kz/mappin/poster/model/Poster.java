package kz.mappin.poster.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@Data
@Table(name = "poster")
public class Poster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name ="color")
    private String color;

    @Column(name ="layouts")
    private String layouts;

    @Column(name ="title")
    private String title;

    @Column(name ="subtitle")
    private String subtitle;

    @Column(name ="lat")
    private String lat;

    @Column(name ="lon")
    private String lon;

    @Column(name ="fullCoor")
    private String fullCoor;

    @Column(name ="zoom")
    private String zoom;

    @Column(name ="size")
    private String size;

    @Column(name ="updateCoor")
    private Boolean updateCoor;
}
