class Product:
	def __init__(self,pId,name,catId,price):
		self.pId = pId
		self.name = name
		self.catId = catId
		self.price =price
		
class ElectricalProduct(Product):
	def __init__(self,pId,name,catId,price,voltRange,wattage):
		super(ElectricalProduct,self).__init__(pId,name,catId,price)
		self.wattage = wattage
		self.voltRange = voltRange
	def update(self, wattage, price):
		self.wattage = wattage
		self.price = price
		print("Values Updated.")
		self.details()
	def details(self):
		print("Product ID:",self.pId)
		print("Name:",self.name)
		print("Category ID:",self.catId)
		print("Unit Price:",self.price)
		print("Wattage:",self.wattage)
		print("Voltage Range:",self.voltRange)
		print('')
		
if __name__ == "__main__":
	p1 = ElectricalProduct(1001, "Motor",431,500,50,200)
	p1.details()
	p1.update(100,1000)
