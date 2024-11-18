package com.intellekta;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Index {

    private String text;

    public Index() {

    }

    public Index(String text) {
        this.text = text;
    }

    public int getWordFrequency(String word) { // принимает слово и возвращает число, равное частоте слова в тексте.
        Integer frequency = getFrequencyTable().get(word.toLowerCase());
        return (frequency == null) ? 0 : frequency;
    }

    public void appendText(String text, Map<String, Integer> frequencyTable) { // должен дополнять таблицу частот информацией, полученной из переданной строки.
        String textForAnalysis = text.toLowerCase().replaceAll("[^a-zA-Zа-яА-Я\\s]", "");
        List<String> textList = new LinkedList<>(List.of(textForAnalysis.split(" ")));
        for (String word : textList)
            if (!frequencyTable.containsKey(word))
                frequencyTable.put(word, 1);
            else
                frequencyTable.put(word, frequencyTable.get(word) + 1);
    }

    public Map<String, Integer> getFrequencyTable() {
        String text = getText().toLowerCase().replaceAll("[^a-zA-Zа-яА-Я\\s]", "");
        List<String> textList = new LinkedList<>(List.of(text.split(" ")));

        Map<String, Integer> frequencyTable = new TreeMap<>();
        for (String word : textList)
            if (!frequencyTable.containsKey(word)) frequencyTable.put(word, 1);
            else frequencyTable.put(word, frequencyTable.get(word) + 1);

        return frequencyTable;
    }

    public String getText() {
        return text;
    }
}