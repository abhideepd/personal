import requests
from bs4 import BeautifulSoup

indeed_resul=requests.get("https://www.indeed.co.in/jobs?q=python&l=")

print(indeed_resul.text)