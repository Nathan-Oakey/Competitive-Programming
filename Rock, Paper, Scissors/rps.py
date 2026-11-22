a = input()
b = input()
d = {"rock" : "scissors", "paper" : "rock", "scissors" : "paper"}
if a == b: print("Draw")
elif b == d[a]: print("Player 1") 
else: print("Player 2")