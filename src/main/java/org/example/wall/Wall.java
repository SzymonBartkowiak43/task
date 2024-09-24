package org.example.wall;

import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private List<Block> blocks;


    @Override
    public Optional<Block> findBlockByColor(String color) {
        // Implementacja metody
        return null; // Zmień na odpowiednią implementację
    }


    @Override
    public List<Block> findBlocksByMaterial(String material) {
        // Implementacja metody
        return null; // Zmień na odpowiednią implementację
    }
    @Override
    public int count() {
        // Implementacja metody
        return 0; // Zmień na odpowiednią implementację
    }
}

