import sys

while True:
    line = sys.stdin.readline()

    if not line:
        break

    if line.strip() == "0":
        break

    n, p, s = map(int, line.split())

    if n == 0:
        break

    dll_sizes = list(map(int, sys.stdin.readline().split()))

    programs = []

    for _ in range(p):
        size, dlls = sys.stdin.readline().split()
        programs.append((int(size), dlls))

    dll_users = [0] * n

    total = 0
    maximum = 0

    operations = list(map(int, sys.stdin.readline().split()))

    for op in operations:
        size, dlls = programs[abs(op) - 1]

        if op > 0:
            total += size

            for dll in dlls:
                index = ord(dll) - ord('A')

                if dll_users[index] == 0:
                    total += dll_sizes[index]

                dll_users[index] += 1

        else:
            total -= size

            for dll in dlls:
                index = ord(dll) - ord('A')

                dll_users[index] -= 1

                if dll_users[index] == 0:
                    total -= dll_sizes[index]

        maximum = max(maximum, total)

    print(maximum)