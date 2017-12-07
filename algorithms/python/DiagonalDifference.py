#!/bin/python

def diagonal_Difference(m):
	d1 = 0
	d2 = 0
	for i in range(len(m)):
		d1 += m[i][i]
		d2 += m[i][len(m)-i-1]
	return abs(d1-d2)

n = int(raw_input().strip())
matrix = []

for i in range(n):
	row = map(int,raw_input().strip().split(" "))
	matrix.append(row)
print diagonal_Difference(matrix)
