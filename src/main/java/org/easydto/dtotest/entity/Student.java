package org.easydto.dtotest.entity;

import lombok.*;
import org.easydto.annotation.DtoProperty;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {

    @DtoProperty
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DtoProperty
    @Column
    private String name;

    @DtoProperty
    @Column
    private String dept;

    @DtoProperty // derived property
    public boolean isEnrolled(){
        return dept != null;
    }

}
