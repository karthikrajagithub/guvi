letter = raw_input()

check = letter.lower()
if check.isalpha():
	if letter in "aeiou":
		print "Vowel"
	else:
		print "Constant"
else:
	print "Please print a letter"