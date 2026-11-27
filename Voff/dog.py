n, k = map(int, input().split())
t = list(map(int, input().split()))
l = 0
a = 0
for r in range(n):
    while t[r] - t[l] >= k:
        l += 1
    a = max(a, r - l + 1)
print(a)