package com.app.bo;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerBO {

	public Player createPlayer(Player player);
	public Player getPlayerById(int id) throws BusinessException;
	public Player removePlayerById(int id) throws BusinessException;
	public List<Player> getAllPlayers();
	public List<Player> getPlayerByName(String name) throws BusinessException;
	public List<Player> getPlayerByTeamName(String teamName) throws BusinessException;
}
