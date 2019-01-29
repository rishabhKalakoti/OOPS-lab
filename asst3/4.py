import re
def check(password):
	if re.match('.*(([a-z].*[0-9])|([0-9].*[a-z])).*',password)==None:
		print("Atleast one lowercase letter and digit required.")
		return False
	if re.match('.*([A-Z]).*',password)!=None:
		print("No uppercase letters allowed")
		return False
	if password.isalnum()==False:
		print("No special characters allowed")
		return False
	if len(password)<5 or len(password)>12:
		print("length should be between 5 and 12")
		return False
	for i in range(len(password)):
		for j in range(min(i, len(password)-i)):
			if password[i-j-1:i]==password[i:i+j+1]:
				print("No immediate patterns allowed: ", password[i:i+j+1])
				return False
	return True	
if __name__ == "__main__":
	print("Enter the password.")
	password = input()
	if check(password)==False:
		print("Inncorrect password.")
	else:
		print("Correct password.")
