package com.mygdx.game.Terrain.attributes;

import com.badlogic.gdx.graphics.g3d.Attribute;
import com.mygdx.game.Terrain.TerrainMaterial;


// a standard libgdx attribute to hold our TerrainMaterial

public class TerrainMaterialAttribute extends Attribute {
    public final static String TerrainMaterialAlias = "terrainData";
    public final static long TerrainMaterial = register(TerrainMaterialAlias);

    protected static long Mask = TerrainMaterial;

    public TerrainMaterial terrainMaterial;

    /**
     * Method to check whether the specified type is a valid DoubleAttribute
     * type
     */
    public static Boolean is(final long type) {
        return (type & Mask) != 0;
    }

    protected TerrainMaterialAttribute(long type) {
        super(type);
    }

    public TerrainMaterialAttribute(long type, TerrainMaterial terrainMaterial) {
        super(type);
        this.terrainMaterial = terrainMaterial;
    }

    public static TerrainMaterialAttribute createTerrainMaterialAttribute(TerrainMaterial terrainMaterial) {
        return new TerrainMaterialAttribute(TerrainMaterial, terrainMaterial);
    }
    @Override
    public Attribute copy() {
        return new TerrainMaterialAttribute(this.type);
    }

    @Override
    public int compareTo(Attribute o) {
        return 0;
    }
}
