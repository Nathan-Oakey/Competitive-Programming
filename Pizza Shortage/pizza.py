import math

x = int(input())
y = int(input())
z = int(input())

rx = x / 2
ry = y / 2

ax = math.pi * rx * rx
ay = math.pi * ry * ry

print("Neibb") if (ax > z * ay) else print("Jebb")