package com.codegym.task.task35.task3513;

import java.awt.event.KeyEvent;
import java.util.*;

public class Model {
    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
    protected int score = 0;
    protected int maxTile = 0;
    private Stack<Tile[][]> previousStates = new Stack<>();
    private Stack<Integer> previousScores = new Stack<>();
    private boolean isSaveNeeded = true;

    public Model() {
        resetGameTiles();
    }

    private List<Tile> getEmptyTiles() {
        List<Tile> listTiles = new ArrayList<>();
        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                if (gameTiles[i][j].isEmpty()) listTiles.add(gameTiles[i][j]);
            }
        }
        return listTiles;
    }

    private void addTile() {
        if (!getEmptyTiles().isEmpty()) {
            int i = (int) (Math.random() * getEmptyTiles().size()); // получаем случайный индекс списка.
            getEmptyTiles().get(i).value = (Math.random() < 0.9 ? 2 : 4); // присваиваем вес полученной клетке.
        }
    }


    // Метод должен заполнять массив gameTiles новыми плитками и менять значение двух из них с помощью двух вызовов метода addTile.
    protected void resetGameTiles() {
        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                this.gameTiles[i][j] = new Tile();
            }
        }
        addTile();
        addTile();
    }

    private boolean consolidateTiles(Tile[] tiles) {
        Tile[] tilesCopy = tiles.clone();
        boolean changed = false;
        List<Tile> listX = new ArrayList<>(); //
        for (int i = 0; i < tiles.length; i++) {
            if (!tiles[i].isEmpty()) listX.add(tiles[i]);
        }
        for (int i = 0; i < tiles.length; i++) {
            tiles[i] = new Tile();
        }
        // записывем в массив элементы списка
        for (int i = 0; i < listX.size(); i++) {
            tiles[i] = listX.get(i);
        }

        for (int i = 0; i < tiles.length; i++) {
            if (tilesCopy[i].value != tiles[i].value) {
                changed = true;
                break;
            }
        }
        return changed;
    }

    private boolean mergeTiles(Tile[] tiles) {
        int n = tiles.length;
        Tile[] tilesCopy = tiles.clone();
        boolean changed = false;
        for (int i = 0; i < n - 1; i++) {
            if (tiles[i].value != 0 && tiles[i].value == tiles[i + 1].value) {
                int newValue = tiles[i].value * 2;
                changed = true;
                tiles[i].value = newValue;
                score += newValue;
                if (maxTile < newValue)
                    maxTile = newValue;
                for (int j = i + 1; j < n - 1; j++) {
                    tiles[j].value = tiles[j + 1].value;
                }
                tiles[n - 1].value = 0;
            }
        }


        return changed;
    }

    public void left() {
        if (isSaveNeeded) saveState(gameTiles);
        boolean b = false;
        for (int i = 0; i < FIELD_WIDTH; i++) {
            consolidateTiles(this.gameTiles[i]);
            mergeTiles(this.gameTiles[i]);
            b |= consolidateTiles(this.gameTiles[i]);
        }
        if (b)
            addTile();
        if(isSaveNeeded){
            saveState(gameTiles);
        }
        isSaveNeeded = true;
    }
    private void rotate(){
        int M = gameTiles.length;
        int N = gameTiles[0].length;
        Tile[][] turnTiles = new Tile[N][M];
        for (int r = 0; r < M; r++){
            for (int c = 0; c < N; c++){
                turnTiles[c][M-1-r] = gameTiles[r][c];
            }
        }
        gameTiles = turnTiles;
    }

    protected void down(){
        saveState(gameTiles);
        rotate();
        left();
        rotate();
        rotate();
        rotate();
    }
    protected void right(){
        saveState(gameTiles);
        rotate();
        rotate();
        left();
        rotate();
        rotate();
    }

    public Tile[][] getGameTiles() {
        return gameTiles;
    }



    protected void up(){
        saveState(gameTiles);
        rotate();
        rotate();
        rotate();
        left();
        rotate();
    }

    public boolean canMove(){
        boolean flag = false;
        for (int i = 0; i < gameTiles.length-1; i++){
            for (int j = 0; j < gameTiles[0].length-1; j++){
                if(gameTiles[i][j].value == gameTiles[i+1][j].value || gameTiles[i][j].value == gameTiles[i][j+1].value){
                    flag = true;
                }
            }
        }
        return (flag || getEmptyTiles().size() > 0);
    }

    private void saveState(Tile[][] tiles){
        int M = tiles.length;
        int N = tiles[0].length;
        Tile[][]saveTiles = new Tile[M][N];
        for (int r=0; r < M; r++){
            for (int c = 0; c < N; c++){
                saveTiles[r][c] = new Tile(tiles[r][c].value);
            }
        }
        previousStates.push(saveTiles);
        previousScores.push(score);
        isSaveNeeded = false;
    }
    public void rollback(){
        if (!previousStates.isEmpty() & !previousScores.isEmpty()) {
            if (!previousStates.isEmpty()) gameTiles = (Tile[][]) previousStates.pop();
            if (!previousScores.isEmpty())score = (int)previousScores.pop();
        }
    }

    public void randomMove() {
        int n = ((int) (Math.random () * 100)) % 4;
        switch (n) {
            case 0:
                left();
                break;
            case 1:
                right();
                break;
            case 2:
                up();
                break;
            case 3:
                down();
                break;

        }
    }

    private int sumTile(Tile[][] tiles){
        int sum = 0;
        for (int i = 0; i < tiles.length; i++){
            for(int j = 0; j < tiles[0].length; j++){
                sum+=tiles[i][j].value;
            }
        }
        return sum;
    }

    private boolean hasBoardChanged(){
        return sumTile(gameTiles)!=sumTile((Tile[][])previousStates.peek());
    }

    public MoveFitness getMoveFitness(Move move){
        move.move();
        int numEf = getEmptyTiles().size();
        int scoreEf = score;
        if(!hasBoardChanged()){
            rollback();
            return new MoveFitness(-1, 0, move);
        }
        rollback();
        return new MoveFitness(numEf, scoreEf, move);
    }

    public void autoMove(){
        PriorityQueue<MoveFitness> priorityQueue = new PriorityQueue(4, Collections.reverseOrder());
        priorityQueue.offer(getMoveFitness(this::left));
        priorityQueue.offer(getMoveFitness(this::right));
        priorityQueue.offer(getMoveFitness(this::up));
        priorityQueue.offer(getMoveFitness(this::down));

        priorityQueue.peek().getMove().move();
    }
}
