year =int(raw_input())
if (year % 4 == 0) & (year % 100 != 0) | (year % 400 == 0):
    print "It is a Leap Year"
else:
    print "It is not a Leap Year"