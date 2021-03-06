from channel_prediction.channel_predictions.clean_dataframe import clean_dataframe
from channel_prediction.channel_predictions.df_weekday_data import df_weekday_data
from channel_prediction.channel_predictions.get_weekly_data import get_weekly_data
from channel_prediction.channel_predictions.graph_last_week import graph_last_week
from channel_prediction.channel_predictions.last_week_usage import last_week_usage
from channel_prediction.channel_predictions.regressor import regressor
from channel_prediction.channel_predictions.weekday_organization import weekday_organization
from channel_prediction.channel_predictions.weekly_predicted_line import weekly_predicted_line


from sklearn.linear_model import LinearRegression
from sklearn.preprocessing import PolynomialFeatures
import matplotlib.pyplot as plt
import numpy as np
