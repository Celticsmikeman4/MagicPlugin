package com.elmakers.mine.bukkit.effect;

import com.elmakers.mine.bukkit.api.effect.EffectPlay;
import de.slikey.effectlib.Effect;

import java.util.logging.Level;

public class EffectLibPlay implements EffectPlay {
    private final Effect effect;

    public EffectLibPlay(Effect effect) {
        this.effect = effect;
    }

    @Override
    public void cancel() {
        try {
            effect.cancel();
        } catch (Exception ex) {
            org.bukkit.Bukkit.getLogger().log(Level.WARNING, "Error cancelling EffectLib efffect", ex);
        }
    }
}
