package com.Workshop.TicTacToe;

import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToeGame {
	
	Scanner sc = new Scanner(System.in);
	char[] gameBoard=new char[10];
	char playerSymbol;
	
	//CreatingBoard_UC1
	public char[] printBoard() {
		for(int i=1; i<=9; i++) {
			gameBoard[i]=' ';
		}
		return gameBoard;
	}
	
	//ChooseACharacter_UC2 
	public char chooseYourCharacter() {
		System.out.println("Choose a Character X OR O ");
		playerSymbol =sc.next().charAt(0);
		return playerSymbol;
	}
	
	//showBoard_UC3
	public void showBoard(char[] gameBoard) {
		int i=1;
		while(i<=9) {
			System.out.println(gameBoard[i]+"|"+gameBoard[i+1]+"|"+gameBoard[i+2]+"|");
			i=i+3;
		}	
	}
	
	//CheckFreeSpace_UC4
	public int getUserMove(char[] gameBoard) {
		
		while(true) {
			System.out.println("Enter your next Move ");
			int position=sc.nextInt();
			if(position>0 && position<=9 && isFreeSpace(gameBoard, position))
				return position;
		}
	}

	public static boolean isFreeSpace(char[] gameBoard, int position) {
		return gameBoard[position] == ' ';
	}
	
	//MovingToFreeIndex_UC5
	public void moveToDesiredLocation(char[] gameBoard, int pos, char symbol) {
			gameBoard[pos]=symbol;
		}
	}

