#!/usr/bin/python
#-*- coding: utf-8 -*-

from TwitterAPI import *
from datetime import *
from unicodedata import normalize
from pymongo import MongoClient
from datetime import datetime, date, time
from pymongo import MongoClient


import sys
import csv
import json
import os.path  	
import time
import pymongo
import pandas as pd
import thread
import threading

verifica_h=False
result_cont = 0
contador = 0
tags_trend = []
nome_arquivo= "TRENDS_TOP"
data_arq = str (date.today())

client = MongoClient()
db = client.baseTweetsTrends


data_dic={'Trends_Tags':[''],'Dia':['']}

df_data = pd.DataFrame()



																	#FUNÇÔES

def write_file(datas,filename):
	with open('%s.csv'%(filename), 'w') as csvfile:	
		spamwriter = (csv.writer((csvfile))) 
		for row in datas:
			spamwriter.writerow(row)
			
def write_dataframe(df,file):
    df.to_csv('%s.csv'%file, mode='w', sep=';',index=False, header=True)

def acents(text):
	return normalize('NFKD',text).encode('ASCII','ignore').decode('ASCII')    

def gravar():
	df_data ['tags'], df_data['dia'] = tags_trend , data_arq 
	write_dataframe(df_data,nome_arquivo)
	saveTrends(df_data,data_arq)
	verifica_h=False
						
		
																#Credencias de acesso App Twitter

consumer_key = "fhop1yo5UwDiDnGBUKczni1hK"
consumer_secret = "SVj2HpQEgOdRfkIU1dK9yvtiTRSvUyIFN1IRL8i9vR2BjlLIQE"
access_token = "268551056-iIKwaYpguZfKdoG4IYyZMpLmeRZeFMf3ytvuqf8l"
access_token_secret = "MlvXhmviAzcgXkOmixGvzdixu23zm4jFgItwJLS06MiQN"

																			#acessa OAuth
													# Referencia para API: https://dev.twitter.com/rest/reference
twitter = TwitterAPI(consumer_key, consumer_secret,auth_type='oAuth2')

def fazer(tags_trend):
    verifica_h =False
    while True:
        verifica_h = False
       	horario_atual= datetime.now()
        hour = int(horario_atual.hour)
        minute = int(horario_atual.minute)
        segundo = int(horario_atual.second)
        # DETERMINANDO HORARIO DE ESCREVER NO ARQUIVO
        if hour == 12 and minute == 06 and segundo ==00:
        	verifica_h=True
        	gravar_tags(tags_trend)
        	time.sleep(10)

                			

def gravar_tags(tags_trend):
	nome_arquivo= "TRENDS_TOP"
	print("Gravouooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo")
	data_arq = str (date.today())
	df_data ['tags'], df_data['dia'] = tags_trend , data_arq 
	write_dataframe(df_data,nome_arquivo)
	print (tags_trend)
	#saveTrends(df_data,data_arq)

		    

def main(tags_trend):
	result_cont = 0
	contador = 0




	  									#Coleta Streams intervalo de 30 minutos dos top 50 trends
	while True:
		try:

			r = twitter.request('trends/place', {'id': '23424768'})
			for item in r.get_iterator():
				trends = item['name']
				print(trends)
				trends=acents(trends)
				#remover_acentos(tags_trend)
				if trends not in  tags_trend:
					data_arq = str (date.today())
					#remover_acentos(tags_trend)
					tags_trend.append(trends)
					try:
						db.tag_collections.insert_one(
							{
							'tag':item['name'],
							'date':data_arq
							}
						)
					except Exception as inst:
						pass 			
					

			print(len(tags_trend))
			print("Esperando 30, para proxima coleta....... AGUARDE")
			time.sleep(1800)



					
#  RENOVERRRR    RT   db.getCollection('tweets_copy').remove({'text':{$regex:'^RT'}})
			

		except Exception as err:
			print (type(err))
			print("Espera de 15 min time out do Twitter")
			time.sleep(900)
			pass
			
			#MAAAIN 
	
if __name__ == "__main__":
	verifica_h =False
	tags_trend = []
	t1 = threading.Thread(name='Thread-1-Som', target=fazer, args=[tags_trend])
	t1.start()
	main(tags_trend)


		




