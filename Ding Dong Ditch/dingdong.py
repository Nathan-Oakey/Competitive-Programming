n, q = map(int, input().split())
a = sorted(map(int, input().split()))
q = list(map(int, input().split()))
p = [0]
for x in a: p.append(p[-1] + x)
for k in q: print(p[k])