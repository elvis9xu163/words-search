package com.xjd.ws.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.xjd.ws.Result;
import com.xjd.ws.Word;

public class DefaultResult implements Result {

	protected Map<String, DefaultWordResult> resultMap;

	@Override
	public List<WordResult> wordResults() {
		// TODO Auto-generated method stub
		if (resultMap == null) {
			return Collections.emptyList();
		}
		return null;
	}

	@Override
	public List<RangeResult> rangeResults() {
		// TODO Auto-generated method stub
		if (resultMap == null) {
			return Collections.emptyList();
		}
		return null;
	}

	/** @return the resultMap */
	public Map<String, DefaultWordResult> getResultMap() {
		return resultMap;
	}

	/** @param resultMap the resultMap to set */
	public void setResultMap(Map<String, DefaultWordResult> resultMap) {
		this.resultMap = resultMap;
	}

	public static class DefaultWordResult implements WordResult {

		protected Word word;
		protected List<Integer> indexes;

		/** @param word the word to set */
		public void setWord(Word word) {
			this.word = word;
		}

		/** @param indexes the indexes to set */
		public void setIndexes(List<Integer> indexes) {
			this.indexes = indexes;
		}

		@Override
		public Word getWord() {
			return word;
		}

		@Override
		public List<Integer> getIndexes() {
			return indexes;
		}

	}
}
