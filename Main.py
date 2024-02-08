# Accept three positive integers as input
a = int(input())
b = int(input())
c = int(input())

# Sort the numbers
sides = sorted([a, b, c])

# Check if they form a right triangle
if sides[0]**2 + sides[1]**2 == sides[2]**2:
    print("YES")
else:
    print("NO")
