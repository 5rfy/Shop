package com.example.shop.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KeywordAndCharacteristics {
    @ElementCollection
    private List<String> keywords;
    @ElementCollection
    private Map<String, String> characteristics;
}
