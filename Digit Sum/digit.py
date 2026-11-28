n = input()
s = sum(int(i) for i in n)
m = len(n)

r = s
g = []
for i in range(m):
    d = min(9, r)
    g.append(str(d))
    r -= d

l = ["0"] * m
l[0] = str(max(1, s - 9 * (m - 1)))
r = s - int(l[0]);
for i in range(m - 1, 0, -1):
    d = min(9, r)
    l[i] = str(d)
    r -= d
print("".join(l), "".join(g)) 