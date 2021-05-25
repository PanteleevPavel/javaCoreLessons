package lesson4_ticTacToe;


import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int SIZE = 5;
    private static final int DOTS_TO_WIN = 4;
    private static final char DOT_EMPTY = '-';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static char[][] map;
    private static final Scanner sc = new Scanner(System.in);
    private static final Random rand = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (isWin(DOT_X)){
                System.out.println("Вы выиграли, УРА!");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (isWin(DOT_O)){
                System.out.println("Выиграл искусственный интеллект, увы...");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра окончена");
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        System.out.print("   ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + "x ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + "y ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координату по горизонтали");
            x = sc.nextInt() - 1;
            System.out.println("Введите координату по веортикали");
            y = sc.nextInt() - 1;
        } while (isCellInvalid(x, y));
        map[y][x] = DOT_X;
    }

    private static boolean isCellInvalid(int x, int y) {
        return (x < 0 || x >= SIZE)
                || (y < 0 || y >= SIZE)
                || map[y][x] != DOT_EMPTY;
    }

    private static boolean isWin(char symbols) {
        //Проверка по горизонтали
        int winStreak;
        int xCoordinate = 0;
        for (int i = 0; i < SIZE; i++) {
            winStreak = 0;
            for (int j = 0; j < SIZE; j++){
                if (map[i][j] == symbols) {
                    winStreak++;
                    if (winStreak == DOTS_TO_WIN) {
                        return true;
                    }
                } else {
                    winStreak = 0;
                }
            }
        }
        //Проверка по вертикали
        winStreak = 0;
        while (xCoordinate < SIZE) {
            for (int i = 0; i < SIZE; i++) {
                if (map[i][xCoordinate] == symbols) {
                    winStreak++;
                    if (winStreak == DOTS_TO_WIN) {
                        return true;
                    }
                } else {
                    winStreak = 0;
                }
            }
            xCoordinate++;
        }
        //Проверка по первой диагонали
        winStreak = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbols && i + 1 < SIZE && j + 1 < SIZE) {
                    winStreak++;
                    int newX = j;
                    int newY = i;
                    int newWinStreak = winStreak;
                    while (newX < SIZE - 1 && newY < SIZE - 1) {
                        if (map[++newY][++newX] == symbols) {
                            newWinStreak++;
                            if (newWinStreak == DOTS_TO_WIN) {
                                return true;
                            }
                        } else {
                            break;
                        }
                    }
                    winStreak = 0;
                }
            }
        }
        //Проверка по второй диагонали
        winStreak = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbols && i + 1 < SIZE && j + 1 < SIZE) {
                    winStreak++;
                    int newX = j;
                    int newY = i;
                    int newWinStreak = winStreak;
                    while (newX < SIZE - 1 && newY > 0) {
                        if (map[--newY][++newX] == symbols) {
                            newWinStreak++;
                            if (newWinStreak == DOTS_TO_WIN) {
                                return true;
                            }
                        } else {
                            break;
                        }
                    }
                    winStreak = 0;
                }
            }
        }
        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (isCellInvalid(x, y));
        map[y][x] = DOT_O;
        System.out.printf("Компьютер походил в точку %d %d\n", x + 1, y + 1);
    }
}
