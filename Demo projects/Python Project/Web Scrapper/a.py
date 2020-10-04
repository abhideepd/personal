import requests
from bs4 import BeautifulSoup

indeed_result=requests.get("https://www.indeed.co.in/jobs?q=python&l=")

indeed_soup=BeautifulSoup(indeed_result.text, "html.parser")

#print(indeed_soup)

pagination=indeed_soup.find("div", {"class":"pagination"})

#pagini=indeed_soup.find_all("span", {"class":"pn"})

#print(pagini)

links=pagination.find_all('a')
pages=[]
for page in links[:-1]:
    pages.append(int(page.string))

print(pages)
pages=pages[:-1]