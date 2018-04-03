'''
Created on 02-Sept-2017

@author: Abhishek
'''
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
driver = webdriver.Chrome(executable_path='C:\\Users\\Abhishek\\Documents\\EGDownloads\\chromedriver.exe')
driver.maximize_window()
driver.get("https://www.usaa.com/inet/ent_logon/Logon?redirectjsp=true")
'''
elem = driver.find_element_by_xpath("//a/span[@class = 'nav-tab-text' and contains(text(),'Products')]").click()
elem = driver.find_element_by_link_text("Auto Insurance").click()
elem = driver.find_element_by_xpath("//a/span[@class = 'nav-tab-text' and contains(text(),'Advice')]").click()
elem = driver.find_element_by_link_text("Tax Center").click()
'''
elem = driver.find_element_by_xpath("//a/span[@class = 'nav-tab-text' and contains(text(),'Join USAA')]").click()
elem = driver.find_element_by_xpath("//a[@class = 'white' and contains(text(),'Join Now')]").click()
elem = driver.find_element_by_xpath("//h2[@class = 'eligibility-messages-task-entry-header font-serif font-600' and contains(text(),'Here's How to Get Started')]").wait()
elem = driver.find_element_by_xpath("//button[@value = 'NEXT' and contains(text(),'Continue')]").click()
'''elem = driver.find_element_by_xpath("//span/img[@class= 'search-icon']").click()
elem = driver.find_element_by_xpath("//input[@class='SearchInput']")
elem.send_keys("How to apply USAA Auto Insurance")
elem.send_keys(Keys.RETURN)
'''
driver.close()
driver.quit()  
