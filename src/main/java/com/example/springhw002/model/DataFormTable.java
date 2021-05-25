package com.example.springhw002.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataFormTable {
    int id;
    String title;
    String description;
    String image;
}
