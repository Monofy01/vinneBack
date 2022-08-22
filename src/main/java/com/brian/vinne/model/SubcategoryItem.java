package com.brian.vinne.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SubcategoryItem")
public class SubcategoryItem {
    @Id
    @Column(columnDefinition = "VARCHAR(30)")
    private String id_subitem;

    @Column(columnDefinition = "VARCHAR(30)")
    private String name;

    @Column(columnDefinition = "VARCHAR(30)")
    private String id_sub;
}
