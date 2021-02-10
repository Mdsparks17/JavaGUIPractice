### Indicate this as a MET database query ###
### Use MySQL database for queries
#### Main Database Query String ###
query<- and s.state_id=d.stat_id and d.ob_dates BETWEEN """""" and """""" and d.ob_datee BETWEEN """""" and """"""
### Process ID number ###
pid<-""
### Database Name ###
dbase<-Query not set up
### Parameter Occurrence (PO) Code ###
POCode<-""
### Directory to write figures ###
figdir<-""/n### Use only common sites among mulitple simulations ###
common_sites<-"y"
### Species ###
species_in<-"Item 1"
custom_species<-""
custom_species_name<-""
custom_units<-""
### Project ID Name 1 ###
run_name1<-"(select a database first)"
### Additional Run Names (used for model-to-model comparisons) ###
run_name2<-""
run_name3<-""
run_name4<-""
run_name5<-""
run_name6<-""
run_name7<-""
### Array of Observation Network Flags ###
#inc_networks<-
inc_csn<-""
inc_improve<-""
inc_castnet<-""
inc_castnet_hr<-""
inc_castnet_daily<-""
inc_castnet_drydep<-""
inc_capmon<-""
inc_naps<-""
inc_naps_daily_o3<-""
inc_nadp<-""
inc_airmon_dep<-""
inc_amon<-""
inc_aqs_hourly<-""
inc_aqs_daily_O3<-""
inc_aqs_daily<-""
inc_aqs_daily_pm<-""
inc_search<-""
inc_search_daily<-""
inc_aeronet<-""
inc_fluxnet<-""
inc_noaa_esrl_o3<-""
inc_toar<-""
inc_mdn<-""
inc_tox<-""
inc_mod<-""
## European Networks ##
inc_admn<-""
inc_aganet<-""
inc_airbase_hourly<-""
inc_airbase_daily<-""
inc_aurn_hourly<-""
inc_aurn_daily<-""
inc_emep_hourly<-""
inc_emep_daily<-""
inc_emep_daily_o3<-""
## Campaigns ##
inc_calnex<-""
inc_soas<-""
inc_special<-""
### Universal Plot Options ###
dates<-
custom_title<-""
png_from_html<-""
png_res<-"Medium"
x_label_angle<-0
### Plotly Options ###
img_height<-0
img_width<-0
### Flag for Time Averaging ###
averaging<-""
remove_negatives<-"Yes"
use_avg_stats<-""
aggregate_data""
### Time Series Plot Options ###
inc_legend<-"y"
inc_points<-"y"
inc_bias<-"y"
inc_rmse<-""
inc_corr<-""
use_var_mean<-""
obs_per_day_limit<-0
avg_func<-"mean"
avg_func_name<-"mean"
line_width<-"1"
### Kelly Plot Options ###
nmb_max<-NULL
nme_max<-NULL
mb_max<-NULL
me_min<-NULL
me_max<-NULL
rmse_min<-NULL
rmse_max<-NULL
nmb_int<-NULL
nme_int<-NULL
### Unique color ranges for some plots ###
### Monitoring Sites to Include ###
site<-""
### States to Include ###
state<-"All"
### Regional Planning Organizations to Include ###
rpo<-""
### Priciple Component Analysis (PCA) Region ###
pca<-""
### Climate Region ###
clim_reg<-""
### Binned Plot Options ###
pca_flag<-""
inc_error<-""
### Landuse Category
loc_setting<-""
### Flag to Include or Remove Zero Precipitation Observations ###
### Numerical Limit for Data Completeness as minimum number of required observations (used when calulating site statistics or averages)###
coverage_limit<-75
all_valid<-"y"
all_valid_amon<-""
### Numerical Limit for Data Completeness as minimum number of required observations (used when calulating site statistics or averages)###
num_obs_limit<-1
### Flag for Soccer and Bugle Plots Setting NMB/NME or FB/FE ###
soccerplot_opt<-1
### Flag for PAVE Overlay; 1=hourly, 2=daily ###
overlay_opt<-""
### Flags for Confidence Lines to Plot on Scatterplots ###
conf_line<-""
trend_line<-"y"
### Scatterplot x and y axes limits ###
x_axis_min<-NULL
x_axis_max<-NULL
y_axis_min<-NULL
y_axis_max<-NULL
bias_y_axis_min<-NULL
bias_y_axis_max<-NULL
density_zlim<-NULL
num_dens_bins<-NULL
max_limit<-70
### Hourly Boxplot Options ###
inc_whiskers<-""
inc_ranges<-"y"
inc_median_lines<-""
remove_mean<-""
overlap_boxes<-""
### File containing list of stations created dynamically by the user ###
stat_file<-""
### Spatial Plot Options ###
symbsizfac<-1
plot_radius<-0
outlier_radius<-40
fill_opacity<-0.8
num_ints<-NULL
perc_error_max<-NULL
abs_error_max<-NULL
rmse_range_max<-NULL
perc_range_min<-NULL
perc_range_max<-NULL
abs_range_min<-NULL
abs_range_max<-NULL
diff_range_min<-NULL
diff_range_max<-NULL
greyscale <-""
inc_counties <-"y"
hist_max<-NULL
map_type<-1
quantile_min<-0.001
quantile_max<-0.999
### Stacked Bar Charts Options ###
inc_FRM_adj<-"y"
use_median<-""
### Array of flags for which statistics to include on scatter plots ###
stats_flags<-c("","","","y","","","","y","y","","","","","","","y","y","","")
### Flag to include run info text on plots ###
run_info_text<-"y"
### Set Scatter Plot Symbols and Colors ###
plot_colors<-c("grey60","red","blue","green4","yellow3","orange2","brown","purple")
plot_colors2<-c("grey60","red","blue","green4","yellow3","orange2","brown","purple")
plot_symbols<-c(16,17,15,18,11,8,4)
### Start and End Year/Month ###
year_start<-""
year_end<-""
month_start<-""
month_end<-""
day_start<-""
day_end<-""
#############################
### Setup Networks Arrays ###
#############################
network_names <- NULL
network_label <- NULL
if (inc_improve == "y") {
   network_names <- c(network_names,"IMPROVE")
   network_label <- c(network_label,"IMPROVE")
}
if (inc_csn == "y") {
   network_names <- c(network_names,"CSN")
   network_label <- c(network_label,"CSN")
}
if (inc_castnet == "y") {
   network_names <- c(network_names,"CASTNET")
   network_label <- c(network_label,"CASTNET")
}
if (inc_castnet_hr == "y") {
   network_names <- c(network_names,"CASTNET_Hourly")
   network_label <- c(network_label,"CASTNET")
}
if (inc_castnet_daily == "y") {
   network_names <- c(network_names,"CASTNET_Daily")
   network_label <- c(network_label,"CASTNET")
}
if (inc_castnet_drydep == "y") {
   network_names <- c(network_names,"CASTNET_Drydep")
   network_label <- c(network_label,"CASTNET")
}
if (inc_capmon == "y") {
   network_names <- c(network_names,"CAPMON")
   network_label <- c(network_label,"CAPMON")
}
if (inc_naps == "y") {
   network_names <- c(network_names,"NAPS")
   network_label <- c(network_label,"NAPS")
}
if (inc_naps_daily_o3 == "y") {
   network_names <- c(network_names,"NAPS_Daily_O3")
   network_label <- c(network_label,"NAPS Daily")
}
if (inc_nadp == "y") {
   network_names <- c(network_names,"NADP")
   network_label <- c(network_label,"NADP")
}
if (inc_airmon_dep == "y") {
   network_names <- c(network_names,"AIRMON")
   network_label <- c(network_label,"AIRMON")
}
if (inc_amon == "y") {
   network_names <- c(network_names,"AMON")
   network_label <- c(network_label,"AMON")
}
if (inc_aqs_hourly == "y") {
   network_names <- c(network_names,"AQS_Hourly")
   network_label <- c(network_label,"AQS_Hourly")
}
if (inc_aqs_daily_O3 == "y") {
   network_names <- c(network_names,"AQS_Daily_O3")
   network_label <- c(network_label,"AQS_Daily")
}
if (inc_aqs_daily == "y") {
   network_names <- c(network_names,"AQS_Daily")
   network_label <- c(network_label,"AQS_Daily")
}
if (inc_aqs_daily_pm == "y") {
   network_names <- c(network_names,"AQS_Daily_PM")
   network_label <- c(network_label,"AQS_Daily")
}
if (inc_search == "y") {
   network_names <- c(network_names,"SEARCH")
   network_label <- c(network_label,"SEARCH")
}
if (inc_search_daily == "y") {
   network_names <- c(network_names,"SEARCH_Daily")
   network_label <- c(network_label,"SEARCH_Daily")
}
if (inc_aeronet == "y") {
   network_names <- c(network_names,"AERONET")
   network_label <- c(network_label,"AERONET")
}
if (inc_fluxnet == "y") {
   network_names <- c(network_names,"FLUXNET")
   network_label <- c(network_label,"FluxNet")
}
if (inc_noaa_esrl_o3 == "y") {
   network_names <- c(network_names,"NOAA_ESRL_O3")
   network_label <- c(network_label,"NOAA ESRL")
}
if (inc_toar == "y") {
   network_names <- c(network_names,"TOAR")
   network_label <- c(network_label,"TOAR")
}
if (inc_mdn == "y") {
   network_names <- c(network_names,"MDN")
   network_label <- c(network_label,"MDN")
}
if (inc_tox == "y") {
   network_names <- c(network_names,"Toxics")
   network_label <- c(network_label,"Toxics")
}
if (inc_mod == "y") {
   network_names <- c(network_names,"Model_Model")
   network_label <- c(network_label,"Mod v. Mod")
}
if (inc_admn == "y") {
   network_names <- c(network_names,"ADMN")
   network_label <- c(network_label,"ADMN")
}
if (inc_aganet == "y") {
   network_names <- c(network_names,"AGANET")
   network_label <- c(network_label,"AGANET")
}
if (inc_airbase_hourly == "y") {
   network_names <- c(network_names,"AirBase_Hourly")
   network_label <- c(network_label,"AirBase")
}
if (inc_airbase_daily == "y") {
   network_names <- c(network_names,"AirBase_Daily")
   network_label <- c(network_label,"AirBase")
}
if (inc_aurn_hourly == "y") {
   network_names <- c(network_names,"AURN_Hourly")
   network_label <- c(network_label,"AURN")
}
if (inc_aurn_daily == "y") {
   network_names <- c(network_names,"AURN_Daily")
   network_label <- c(network_label,"AURN")
}
if (inc_emep_hourly == "y") {
   network_names <- c(network_names,"EMEP_Hourly")
   network_label <- c(network_label,"EMEP")
}
if (inc_emep_daily == "y") {
   network_names <- c(network_names,"EMEP_Daily")
   network_label <- c(network_label,"EMEP")
}
if (inc_calnex == "y") {
   network_names <- c(network_names,"CALNEX")
   network_label <- c(network_label,"CALNEX")
}
if (inc_soas == "y") {
   network_names <- c(network_names,"SOAS")
   network_label <- c(network_label,"SOAS")
}
if (inc_special == "y") {
   network_names <- c(network_names,"Special")
   network_label <- c(network_label,"Special")
}
