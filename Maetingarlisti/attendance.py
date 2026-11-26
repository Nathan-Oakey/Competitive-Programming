n, r, c = map(int, (input().split()))
l = []
for _ in range(r):
    l.append(input().split())

for i in range(r):
    s = input()
    if l[i][0] == s: print("left")
    else: print("right")
    for j in range(c - 1): input()