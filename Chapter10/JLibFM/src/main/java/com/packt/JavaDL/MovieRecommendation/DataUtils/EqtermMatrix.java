/*
 * JLibFM
 *
 * Copyright (c) 2017, Jinbo Chen(gaterslebenchen@gmail.com)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 *  - Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the docume
 *    ntation and/or other materials provided with the distribution.
 *  - Neither the name of the <ORGANIZATION> nor the names of its contributors may be used to endorse or promote products derived from this
 *    software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUD
 * ING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN N
 * O EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR C
 * ONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR P
 * ROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 *  TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBI
 *  LITY OF SUCH DAMAGE.
 */
package com.packt.JavaDL.MovieRecommendation.DataUtils;

import com.packt.JavaDL.MovieRecommendation.FMCore.EqTerm;

public class EqtermMatrix {
	private int row;
	private EqTerm[][] value = null;
	
	public EqtermMatrix() {
		row = 0;
	}

	public EqtermMatrix(int row,int column) {
		this.row = 0;
		setSize(row,column);
	}

	public int getRow() {
		return row;
	}

	public EqTerm[] get(int x) {
		return value[x];
	}
	
	public void set(int x, EqTerm[] val)
	{
		value[x] = val;
	}

	public void setSize(int row,int column) {
		if (value != null) {
			value = null;
		}
		this.row = row;
		value = new EqTerm[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				value[i][j] = new EqTerm(0,0);
			}
		}
	}
}
