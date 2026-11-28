n, m, k = map(int, input().split())
s = list(map(int, input().split()))
if m > k: print(":(")
else: 
    p = k // m
    t = sum(s)
    print((t + p  - 1) // p)
