package org.example.wall;

import java.util.List;
import java.util.Optional;


interface Structure {
    // Zwraca dowolny element o podanym kolorze
    Optional<Block> findBlockByColor(String color);


    // Zwraca wszystkie elementy z danego materiału
    List<Block> findBlocksByMaterial(String material);


    // Zwraca liczbę wszystkich elementów tworzących strukturę
    int count();
}
