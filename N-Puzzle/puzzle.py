s = 0
for r in range(4):
    for c, l in enumerate(input()):
        if (l != "."):
            gr = (ord(l) - ord("A")) // 4
            gc = (ord(l) - ord("A")) % 4
            s += (abs(r - gr) + abs(c - gc))
print(s)
