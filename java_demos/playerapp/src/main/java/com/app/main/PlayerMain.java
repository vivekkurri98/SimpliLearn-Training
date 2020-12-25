package com.app.main;

import java.util.List;
import java.util.Scanner;

import com.app.bo.PlayerBO;
import com.app.bo.impl.PlayerBoImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Player App");
		Scanner scan = new Scanner(System.in);
		int ch=0;
		do {
			System.out.println("Player Menu");
			System.out.println("--------------");
			System.out.println("1) Add player");
			System.out.println("2) Remove Player by Id");
			System.out.println("3) Search Player by Id");
			System.out.println("4) Search Player by Name");
			System.out.println("6) Search Player by Team Name");
			System.out.println("6) Get All Players");
			System.out.println("7) EXIT");
			System.out.println("Enter your choice");
			ch = Integer.parseInt(scan.nextLine());
			PlayerBO playerBO = new PlayerBoImpl();
			
			switch (ch) {
			case 1:
				System.out.println("Enter player details");
				System.out.println("Enter player name:");
				String name = scan.nextLine();
				System.out.println("Enter team name");
				String teamName = scan.nextLine();
				System.out.println("Enter player age");
				int age = Integer.parseInt(scan.nextLine());
				System.out.println("Enter Player Gender M- male / F- female");
				char gender = scan.nextLine().charAt(0);
				
				Player player = new Player(name, teamName, age, gender);
				
				player=playerBO.createPlayer(player);
				if(player!=null && player.getId()!=0) {
					System.out.println("Player created with below details");
					System.out.println(player);
				}
				break;
				
			case 2:
				System.out.println("Enter player id for removing details");
				int rid = Integer.parseInt(scan.nextLine());
				try {
					player = playerBO.removePlayerById(rid);
					if(rid!=0) {
					System.out.println("Player with id "+rid+" Not found");
						}else {
							System.out.println("Player with id "+rid+" removed sucessfully!");
						}
					}catch(BusinessException e){
					System.out.println(e.getMessage());
						}
				break;
				
			case 3:
				System.out.println("Enter player id for Player details");
				int id = Integer.parseInt(scan.nextLine());
				try {
					Player p = playerBO.getPlayerById(id);
					if(p!=null) {
						System.out.println("Player by id "+id+" found with details");
						System.out.println(p);
						}
					}catch(BusinessException e){
						System.out.println(e.getMessage());
					}
				break;
				
			case 4:
				System.out.println("Enter Player Name for Player details");
				String pname = scan.nextLine();
				try {
					List<Player> p = playerBO.getPlayerByName(pname);
					if(p!=null) {
						System.out.println("Player by name "+pname+" found with details");
						System.out.println(p);
					}
					}catch (BusinessException e) {
						System.out.println(e.getMessage());
					}
				break;
				
			case 5:
				System.out.println("Thank You for using our app");
				break;
			
			case 6:
				List<Player> playerList = playerBO.getAllPlayers();
				if(playerList!=null && playerList.size()>0) {
					System.out.println("Total there are "+playerList.size()+" number of Players... details are: ");
					for(Player p1: playerList) {
						System.out.println(p1);
					}
				}else {
						System.out.println("No Player as of now....");
					}
				break;
				
			case 7:
				System.out.println("Thank You for using our app");
				break;
				
			default:
				System.out.println("Please enter valid choice");
				break;
			}
		}while(ch!=5);
	}

}
