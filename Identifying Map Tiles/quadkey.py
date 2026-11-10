q = input()

zoom = len(q)
x = 0
y = 0
for i, d in enumerate(q):
    mask = 1 << (zoom - 1 - i)

    if d == '1':
        x |= mask
    elif d == '2':
        y |= mask
    elif d == '3':
        x |= mask
        y |= mask

print(zoom, x, y)
