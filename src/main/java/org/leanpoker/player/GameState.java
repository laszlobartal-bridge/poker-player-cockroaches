package org.leanpoker.player;

import java.util.ArrayList;


public class GameState {

    public String tournament_id;
    public String game_id;
    public int round;
    public int bet_index;
    public int small_blind;
    public int current_buy_in;
    public int pot;
    public int minimum_raise;
    public int dealer;
    public int orbits;
    public int in_action;
    public ArrayList<GamePlayer> players;
    public ArrayList<Card> community_cards;

    public GamePlayer getCurrentPlayer() {
        return players.get(in_action);
    }
}