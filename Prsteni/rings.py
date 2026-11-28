import math
n = int(input())
r = list(map(int, input().split()))
f = r[0]
for i in r[1:]:
    g = math.gcd(f, i)
    print(f"{f // g}/{i // g}")