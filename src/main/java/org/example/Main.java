package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//Mapで車の名前をキーメーカーをバリューにする
Map<String, String> carMap = new HashMap<>();
carMap.put("プリウス", "トヨタ");
carMap.put("セレナ", "日産");
carMap.put("アコード", "ホンダ");
carMap.put("ハイエース", "トヨタ");
carMap.put("アクア", "トヨタ");
carMap.put("ノート", "日産");
carMap.put("フィット", "ホンダ");
carMap.put("ヴェゼル", "ホンダ");
carMap.put("ヴォクシー", "トヨタ");

//車の名前からメーカーを取得して出力する
System.out.println("ヴェゼルのメーカーは" + carMap.get("ヴェゼル") + "です。");
    }
}
