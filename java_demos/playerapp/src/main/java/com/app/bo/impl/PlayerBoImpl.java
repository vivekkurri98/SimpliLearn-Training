package com.app.bo.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.bo.PlayerBO;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerBoImpl implements PlayerBO{
private static Map<Integer, Player> playerMap = new HashMap<>();
private static int count = 0;
	@Override
	public Player createPlayer(Player player) {
		player.setId(++count);
		playerMap.put(player.getId(), player);
		return player;
	}

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		if(playerMap.containsKey(id)) {
			player = playerMap.get(id);
		}else {
			throw new BusinessException("Player with id "+id+" not found");
		}
		return player;
	}

	@Override
	public Player removePlayerById(int id) throws BusinessException {
		Player player = null;
		if(playerMap.containsKey(id)) {
			player = playerMap.remove(id);
		}
		return player;
		
	}

	@Override
	public List<Player> getAllPlayers() {
		List<Player> playerList = new ArrayList<>(playerMap.values());
		return playerList;
	}

	@Override
	public List<Player> getPlayerByName(String name) throws BusinessException {
		
	}

	@Override
	public List<Player> getPlayerByTeamName(String teamName) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
