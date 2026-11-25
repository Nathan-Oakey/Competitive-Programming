d = {"N": 0, "NE": 45, "E": 90, "SE": 135, "S": 180, "SW": 225, "W": 270, "NW": 315}
a = input()
b = input()
if (a == b): print("Keep going straight")
elif (abs(d[b] - d[a]) == 180): print("U-turn")
else:
    n = (d[b] - d[a] + 180) % 360 - 180
    if (n < 0): print("Turn", abs(n), "degrees port")
    else: print("Turn", n, "degrees starboard")