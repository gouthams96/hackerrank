#!/usr/bin/python

def who(a,b,c):
    p1 = abs(c-a)
    p2 = abs(c-b)
    if p1>p2:
        return "Cat B"
    elif p2>p1:
        return "Cat A"
    else:
        return "Mouse C"

def main():
    n = int(raw_input())
    while(n>0):

        catA,catB,mouse = map(int,raw_input().strip().split(" "))
        print who(catA,catB,mouse)
        n -= 1


if __name__ == '__main__':
    main()
