#!/usr/bin/python

def main():
    n = int(raw_input())
    s = list(map(int,raw_input().split(" ")))
    d,m = map(int,raw_input().split(" "))
    combination = 0
    for i in range(0,n):
        sum = 0
        for j in range(0,m):
            if((j+i) < n):
                sum += s[j+i]
        if sum == d:
            combination += 1
    print combination

if __name__ == '__main__':
    main()
