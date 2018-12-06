class vehicle:

	name = ""
	kind = "car"
	color = ""
	value = 100.00
	
	def description(self):
		
		description_str = "%s is %s %s worth $%.2f." %(self.name, self.color, self.kind, self.value)
		
		return description_str
		
		
car1 = vehicle()
car1.name = "porsche"
car1.color = "black"
car1.kind = "convertible"
car1.value = 600


car2 = vehicle()
car2.name = "creata"
car2.color = "white"
car2.kind = "prof"
car2.value = 200



		
		
print(car1.description())
print(car2.description())