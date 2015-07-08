package com.xjd.ws;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.xjd.ws.impl.DefaultWordsSearch;

public class WordsSearchTest {

	@Test
	public void test() {
		WordsSearch ws = new DefaultWordsSearch();
		ws.addWord("阿里", "巴阿", "阿里巴巴", "哈哈");
		Result result = ws.search("好阿里巴巴阿里巴巴哈哈哈哈人");

		List<Result.WordResult> wordResults = result.wordResults();
		for (Result.WordResult wordResult : wordResults) {
			System.out.println(wordResult.getWord().getWord() + ":"
					+ Arrays.toString(wordResult.getIndexes().toArray()));
		}

		List<Result.RangeResult> rangeResults = result.rangeResults();
		for (Result.RangeResult rangeResult : rangeResults) {
			System.out.println(rangeResult.getBeginIndex() + "~" + rangeResult.getEndIndex() + ":");
			for (Word word : rangeResult.getWords()) {
				System.out.println("	" + word.getWord());
			}
		}
	}
}