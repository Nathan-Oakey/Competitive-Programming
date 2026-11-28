n = int(input())
k = list(map(int, input().split()))

p = list(range(n))
c = 0
while (len(p) > 1):
    a = len(p)
    s = k[p[c]]
    e = (c + s - 1) % a
    p.pop(e)
    c = e % len(p)
print(p[0] + 1)