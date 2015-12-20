package me.Flibio.EconomyLite.Events;

import org.spongepowered.api.event.Cancellable;
import org.spongepowered.api.event.cause.Cause;
import org.spongepowered.api.event.impl.AbstractEvent;

public class BalanceChangeEvent extends AbstractEvent implements Cancellable {
	
	private boolean cancelled = false;
	private String playerUUID;
	
	/**
	 * Sponge event called when a player's balance changes
	 * @param playerUUID
	 * 	The UUID of the player whose balance changed
	 */
	public BalanceChangeEvent(String playerUUID){
		this.playerUUID = playerUUID;
	}

	@Override
	public boolean isCancelled() {
		return this.cancelled;
	}

	@Override
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
	
	/**
	 * Gets the UUID of the player whose balance changed
	 * 
	 * @return Player's UUID
	 */
	public String getPlayerUUID(){
		return playerUUID;
	}

	@Override
	public Cause getCause() {
		return Cause.of("EconomyLite");
	}

}
