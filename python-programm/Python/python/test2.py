class test:
	variable = "Check"
	
	def test2(self):
		print("This is here")
		
		s = 5
		t = 7
		m = s+t
		print(m)
		



testx = test()
testy = test()

testy.variable = "reCheck"

print(testx.variable)
print(testy.variable)

testx.test2()
testy.test2()