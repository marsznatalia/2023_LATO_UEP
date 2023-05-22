package pl.psi;

import java.awt.font.NumericShaper;
import java.util.List;

import pl.psi.creatures.Creature;

import lombok.Getter;
import pl.psi.creatures.Skill;

/**
 * TODO: Describe this class (The first line - until the first dot - will interpret as the brief description).
 */

public class Hero
{
    @Getter
    private final List< Creature > creatures;
    public int level;
    public int manaMax;
    @Getter
    private List< Skill > skillList;
    public Hero( final List< Creature > aCreatures)
    {
        creatures = aCreatures;
    }

}
