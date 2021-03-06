package yolo.basket.db.user;

import java.util.ArrayList;
import java.util.List;
import yolo.basket.db.Entity;
import yolo.basket.db.Param;
import yolo.basket.db.game.Game;

public class User extends Entity {

    private String userName;
    private String name;
    private String password;
    private String email;


    // Used to have a game active so the User can answer a phone call and come
    // back later to the same game.
    private Game currentGame;

    private List<Long> gameIds = new ArrayList<>();
    private List<Long> playerIds = new ArrayList<>();
    private List<Long> teamIds = new ArrayList<>();

    public User() {}

    @Override
    public List<Param> getParameters() {
        List<Param> params = new ArrayList<>();
        params.add(new Param("userName", userName));
        params.add(new Param("name", name));
        params.add(new Param("password", password));
        params.add(new Param("email", email));
        params.addAll(Param.listOfLongToParams("gameId", gameIds));
        params.addAll(Param.listOfLongToParams("playerId", playerIds));
        params.addAll(Param.listOfLongToParams("teamId", teamIds));
        return params;
    }

    public User(String name, String userName, String password, String email) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game getCurrentGame() {
        return currentGame;
    }

    public void setCurrentGame(Game currentGame) {
        this.currentGame = currentGame;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getGameIds() {
        return gameIds;
    }

    public void setGameIds(List<Long> gameIds) {
        this.gameIds = gameIds;
    }

    public List<Long> getPlayerIds() {
        return playerIds;
    }

    public void setPlayerIds(List<Long> playerIds) {
        this.playerIds = playerIds;
    }

    public List<Long> getTeamIds() {
        return teamIds;
    }

    public void setTeamIds(List<Long> teamIds) {
        this.teamIds = teamIds;
    }

    public void addTeamId(Long teamId) {
        this.teamIds.add(teamId);
    }
}
