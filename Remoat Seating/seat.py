import math
a = int(input())
t = list(map(int, input().split()))
n = math.factorial(a)
for x in t: n *= math.factorial(x)
d = math.factorial(sum(t))
g = math.gcd(n, d)
print(f"{n // g}/{d // g}")