n = int(input())
s = 0; e = float("inf")
for _ in range(n):
    a, b = map(int, input().split())
    if a > s: s = a
    if b < e: e = b
print("edward is right" if s > e else "gunilla has a point")