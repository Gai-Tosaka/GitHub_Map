package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 車種とメーカーのMapを作成
        Map<String, String> carManufacturerMap = new HashMap<>();
        carManufacturerMap.put("Civic", "Honda");
        carManufacturerMap.put("Accord", "Honda");
        carManufacturerMap.put("Camry", "Toyota");
        carManufacturerMap.put("Corolla", "Toyota");
        carManufacturerMap.put("F-150", "Ford");
        carManufacturerMap.put("Mustang", "Ford");

        // ユーザーに車種を入力してもらう
        Scanner scanner = new Scanner(System.in);
        System.out.print("車種を入力してください: ");
        String carModel = scanner.nextLine();

        // 車種に対応するメーカーを取得し、表示する
        try {
            String manufacturer = getManufacturerByCarModel(carManufacturerMap, carModel);
            System.out.println(carModel + "は" + manufacturer + "の車です。");
        } catch (CarModelNotFoundException e) {
            System.out.println("エラー: " + e.getMessage());
        }
    }

    // 車種に対応するメーカーを取得するメソッド
    private static String getManufacturerByCarModel(Map<String, String> carManufacturerMap, String carModel) throws CarModelNotFoundException {
        // 指定された車種が存在しない場合は例外をスロー
        if (!carManufacturerMap.containsKey(carModel)) {
            throw new CarModelNotFoundException("指定された車種が見つかりません(車種はアルファベットで入力してください): " + carModel);
        }
        // 車種が存在する場合は対応するメーカーを返す
        return carManufacturerMap.get(carModel);
    }

    // 自作の例外クラス
    static class CarModelNotFoundException extends Exception {
        public CarModelNotFoundException(String message) {
            super(message);
        }
    }
    }
