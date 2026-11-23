c = int(input())
s = int(input())
p = s // c
r = s % c
a = 0
for _ in range(c): 
    print("*" * (p + 1) if a < r else "*" * p)
    a += 1