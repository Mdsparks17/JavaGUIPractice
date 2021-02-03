/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaguiproject;

import javax.swing.UIManager;

/**
 *
 * @author Mdspa
 */
public class AMETForm extends javax.swing.JFrame {
    //variable initialization and setting defaults
    public String run_program = "";
    public String query = "\"\""; //AMETForm
    public String pid = "\"\""; //AMETForm
    public String dbase = "\"\""; //AMETForm
    public String run_name1 = "\"\""; //AMETForm
    public String run_name2 = "\"\""; //AMETForm
    public String run_name3 = "\"\""; //AMETForm
    public String run_name4 = "\"\""; //AMETForm
    public String run_name5 = "\"\""; //AMETForm
    public String run_name6 = "\"\""; //AMETForm
    public String run_name7 = "\"\""; //AMETForm
    public String species_in = "\"\""; //AMETForm
    public String custom_species = "\"\""; //AdvancedSpeciesForm
    public String custom_species_name = "\"\""; //AdvancedSpeciesForm
    public String custom_units = "\"\""; //AdvancedSpeciesForm
    public String inc_csn = "\"\""; //AMETForm
    public String inc_improve = "\"\""; //AMETForm
    public String inc_castnet = "\"\""; //AMETForm
    public String inc_castnet_hr = "\"\""; //AMETForm
    public String inc_castnet_daily = "\"\""; //AMETForm
    public String inc_castnet_drydep = "\"\""; //AMETForm
    public String inc_capmon = "\"\""; //AMETForm
    public String inc_naps = "\"\""; //AMETForm
    public String inc_naps_daily_o3 = "\"\""; //AMETForm
    public String inc_nadp = "\"\""; //AMETForm
    public String inc_airmon_dep = "\"\""; //AMETForm
    public String inc_amon = "\"\""; //AMETForm
    public String inc_aqs_hourly = "\"\""; //AMETForm
    public String inc_aqs_daily_o3 = "\"\""; //AMETForm
    public String inc_aqs_daily = "\"\""; //AMETForm
    public String inc_aqs_daily_oaqps = "\"\""; //AMETForm
    public String inc_aqs_daily_pm = "\"\""; //AMETForm
    public String inc_search = "\"\""; //AMETForm
    public String inc_search_daily = "\"\""; //AMETForm
    public String inc_aeronet = "\"\""; //AMETForm
    public String inc_fluxnet = "\"\""; //AMETForm
    public String inc_noaa_esrl_o3 = "\"\""; //AMETForm
    public String inc_toar = "\"\""; //AMETForm
    public String inc_mdn = "\"\""; //AMETForm
    public String inc_tox = "\"\""; //AMETForm
    public String inc_mod = "\"\""; //AMETForm
    public String inc_admn = "\"\""; //AMETForm
    public String inc_aganet = "\"\""; //AMETForm
    public String inc_airbase_hourly = "\"\""; //AMETForm
    public String inc_airbase_daily = "\"\""; //AMETForm
    public String inc_aurn_hourly = "\"\""; //AMETForm
    public String inc_aurn_daily = "\"\""; //AMETForm
    public String inc_emep_hourly = "\"\""; //AMETForm
    public String inc_emep_daily = "\"\""; //AMETForm
    public String inc_emep_daily_o3 = "\"\""; //AMETForm
    public String inc_calnex = "\"\""; //AMETForm
    public String inc_soas = "\"\""; //AMETForm
    public String inc_special = "\"\""; //AMETForm
    public String dates = "\"\""; //AMETForm
    public String averaging = "\"n\""; //AMETForm
    public String site = "\"\"";
    public String state = "\"\"";
    public String rpo = "\"\"";
    public String pca = "\"\"";
    public String clim_reg = "\"\"";
    public String world_reg = "\"\"";
    public String loc_setting = "\"\"";
    public String conf_line = "\"\"";
    public String pca_flag = "\"\"";
    public String bin_by_mod = "\"\"";
    public String inc_error = "\"\"";
    public String trend_line = "\"y\"";
    public String coverage_limit = "75";
    public String all_valid = "\"y\"";
    public String all_valid_amon = "\"\"";
    public String aggregate_data = "\"\"";
    public String num_obs_limit = "1";
    public String soccerplot_opt = "1";
    public String overlay_opt = "\"\""; 
    public String png_res = "300";
    public String x_axis_min = "NULL";
    public String x_axis_max = "NULL";
    public String y_axis_min = "NULL";
    public String y_axis_max = "NULL";
    public String nmb_max = "NULL";
    public String nme_max = "NULL";
    public String mb_max = "NULL";
    public String me_min = "NULL";
    public String me_max = "NULL";
    public String rmse_min = "NULL";
    public String rmse_max = "NULL";
    public String nmb_int = "NULL";
    public String nme_int = "NULL";
    public String bias_y_axis_min = "NULL";
    public String bias_y_axis_max = "NULL";
    public String density_zlim = "NULL";
    public String num_dens_bins = "NULL";
    public String max_limit = "70";
    public String x_label_angle = "0";
    public String inc_ranges = "\"y\"";
    public String inc_whiskers = "\"\"";
    public String inc_median_lines = "\"\"";
    public String remove_mean = "\"\"";
    public String overlap_boxes = "\"\"";
    public String avg_func = "\"\"";
    public String avg_func_name = "\"\"";
    public String stat_func = "\"\"";
    public String line_width = "\"1\"";
    public String custom_title = "\"\"";
    public String map_leg_size = "\"\"";
    public String stat_file = "\"\"";
    public String num_ints = "NULL";
    public String perc_error_max = "NULL";
    public String abs_error_max = "NULL";
    public String perc_range_min = "NULL";
    public String perc_range_max = "NULL";
    public String abs_range_min = "NULL";
    public String abs_range_max = "NULL";
    public String diff_range_min = "NULL";
    public String diff_range_max = "NULL";
    public String rmse_range_max = "\"\"";
    public String hist_max = "NULL";
    public String quantile_min = "0.001";
    public String quantile_max = "0.999";
    public String symbsizfac = "1";
    public String plot_radius = "0";
    public String outlier_radius = "20";
    public String fill_opacity = "0.8";
    public String remove_negatives = "\"y\"";
    public String use_avg_stats = "\"\"";
    public String common_sites = "\"y\"";
    public String inc_legend = "\"y\"";
    public String inc_points = "\"y\"";
    public String inc_bias = "\"y\"";
    public String inc_rmse = "\"\"";
    public String inc_corr = "\"\"";
    public String use_var_mean = "\"\"";
    public String plot_cor = "\"\"";
    public String inc_FRM_adj = "\"y\"";
    public String use_median = "\"\"";
    public String stats_flags = "c(\"\",\"\",\"\",\"y\",\"\",\"\",\"\",\"y\",\"y\",\"\",\"\",\"\",\"\",\"\",\"\",\"y\",\"y\",\"\",\"\")";
    public String run_info_text = "\"y\"";
    public String png_from_html = "\"\"";
    public String plot_colors = "c(\"grey60\",\"red\",\"blue\",\"green4\",\"yellow3\",\"orange2\",\"brown\",\"purple\")";
    public String plot_colors2 = "c(\"grey60\",\"red\",\"blue\",\"green4\",\"yellow3\",\"orange2\",\"brown\",\"purple\")";
    public String plot_symbols = "c(16,17,15,18,11,8,4)";
    public String year_start = "\"\"";
    public String year_end = "\"\"";
    public String month_start = "\"\"";
    public String month_end = "\"\"";
    public String day_start = "\"\"";
    public String day_end = "\"\"";
    public String greyscale = "\"\"";
    public String inc_counties = "\"y\"";
    public String obs_per_day_limit = "0";
    public String figdir = "\"\"";
    public String map_type = "1";
    public String img_height = "NULL";
    public String img_width = "NULL";
    
    //creates a new AMETForm
    public AMETForm() {
        initComponents();
        //TODO: link to MySQL and get databases and projects
    }
    
    //saves variables
    public void saveVariables() {
//        pid; //from query
//        stat_file; //from query
//        figdir; //special case
        dbase = databaseSpecificationComboBox.getSelectedItem().toString();
        run_name1 = textFormat(projectModelRunSpecificationComboBox1.getSelectedItem().toString());
        run_name2 = textFormat(projectModelRunSpecificationComboBox2.getSelectedItem().toString());
        run_name3 = textFormat(projectModelRunSpecificationComboBox3.getSelectedItem().toString());
        run_name4 = textFormat(projectModelRunSpecificationComboBox4.getSelectedItem().toString());
        run_name5 = textFormat(projectModelRunSpecificationComboBox5.getSelectedItem().toString());
        run_name6 = textFormat(projectModelRunSpecificationComboBox6.getSelectedItem().toString());
        run_name7 = textFormat(projectModelRunSpecificationComboBox7.getSelectedItem().toString());
        species_in = textFormat(speciesComboBox.getSelectedItem().toString());
        inc_csn = checkBoxFormat(csnCheckBox);
        inc_improve = checkBoxFormat(improveCheckBox);
        inc_castnet = checkBoxFormat(castnetCheckBox);
        inc_castnet_hr = checkBoxFormat(castnetHourlyCheckBox);
        inc_castnet_daily = checkBoxFormat(castnetDailyCheckBox);
        inc_castnet_drydep = checkBoxFormat(castnetDryDepCheckBox);
        inc_capmon = checkBoxFormat(capmonCheckBox);
        inc_naps = checkBoxFormat(napsHourlyCheckBox);
        inc_naps_daily_o3 = checkBoxFormat(napsDailyO3CheckBox);
        inc_nadp = checkBoxFormat(nadpCheckBox);
        inc_airmon_dep = checkBoxFormat(airmonCheckBox);
        inc_amon = checkBoxFormat(amonCheckBox);
        inc_aqs_hourly = checkBoxFormat(aqsHourlyCheckBox);
        inc_aqs_daily_o3 = checkBoxFormat(aqsDailyO3CheckBox);
        inc_aqs_daily = checkBoxFormat(aqsDailyCheckBox);
        inc_aqs_daily_oaqps = checkBoxFormat(aqsDailyOAQPSO3CheckBox);
        inc_aqs_daily_pm = checkBoxFormat(aqsDailyCheckBox);
        inc_search = checkBoxFormat(searchHourlyCheckBox);
        inc_search_daily = checkBoxFormat(searchDailyCheckBox);
        inc_aeronet = checkBoxFormat(aeronetCheckBox);
        inc_fluxnet = checkBoxFormat(fluxnetCheckBox);
        inc_noaa_esrl_o3 = checkBoxFormat(noaaESRLCheckBox);
        inc_toar = checkBoxFormat(toarCheckBox);
        inc_mdn = checkBoxFormat(mdnCheckBox);
        inc_tox = checkBoxFormat(toxicsHAPsCheckBox);
        inc_mod = checkBoxFormat(model_modelCheckBox);
        inc_admn = checkBoxFormat(admnCheckBox);
        inc_aganet = checkBoxFormat(aganetCheckBox);
        inc_airbase_hourly = checkBoxFormat(airbaseHourlyCheckBox);
        inc_airbase_daily = checkBoxFormat(airbaseDailyCheckBox);
        inc_aurn_hourly = checkBoxFormat(aurnHourlyCheckBox);
        inc_aurn_daily = checkBoxFormat(aurnDailyCheckBox);
        inc_emep_hourly = checkBoxFormat(emepHourlyCheckBox);
        inc_emep_daily = checkBoxFormat(emepDailyCheckBox);
        inc_emep_daily_o3 = checkBoxFormat(emepDailyO3CheckBox);
        inc_calnex = checkBoxFormat(calnexCheckBox);
        inc_soas = checkBoxFormat(soasCheckBox);
        inc_special = checkBoxFormat(specialCheckBox);
        dates = "";
        averaging = textFormat(temporalAveragingComboBox.getSelectedItem().toString());
//        site;

        //state formatting
        state = stateComboBox.getSelectedItem().toString();
        if (state.equals("Include all states")) {
            state = "\"All\"";
        } else {
            state = textFormat(stateComboBox.getSelectedItem().toString());
        }
        System.out.println(state);
        
        rpo = textFormat(RPOComboBox.getSelectedItem().toString());
        pca = textFormat(PCAComboBox.getSelectedItem().toString());
        clim_reg = textFormat(climateRegionComboBox.getSelectedItem().toString());
        world_reg = textFormat(worldRegionComboBox.getSelectedItem().toString());
        aggregate_data = checkBoxFormat(aggrigateDataCheckBox);
        png_res = textFormat(pngPlotQualityComboBox.getSelectedItem().toString());
        custom_title = textFormat(customTitleTextField.getText());
        remove_negatives = textFormat(negativeValuesComboBox.getSelectedItem().toString());
        png_from_html = checkBoxFormat(staticPNGCheckBox);
        
        //date formatting
        String sd = startDatePicker.getDateStringOrEmptyString();
        String ed = endDatePicker.getDateStringOrEmptyString();
        if (!sd.equals("")) {
            year_start = sd.substring(0, 4);
            month_start = sd.substring(5, 7);
            day_start = sd.substring(8, 10);
        }
        if (!ed.equals("")) {
            year_end = ed.substring(0, 4);
            month_end  = ed.substring(5, 7);
            day_end  = ed.substring(8, 10);
        }    
        
        img_height = textFormat(heightTextField.getText());
        img_width = textFormat(widthTextField.getText());
        
//        inc_valid_amon; //does not exist?
//        stat_func; //does not exist?
//        map_leg_size; //does not exist?
//        aqs_co_network; //not hooked up/doesnt exist?
//        near_road; //not hooked up/doesnt exist?
    }
    
    //checks variables for input errors
    public void checkVariables() {
        //TODO
        //Check if database is selected
        //Check if project is selected
        //Check if more than one area selection is used
        //Check if species is selected
        //Check if time is conflicting
        //Check if program is selected
    }
    
    //create run_info.r
    public void createRunInfo() {
        NewFile file = new NewFile(true, "./run_info.r");
        file.openWriter();
        file.writeTo(""
                + "### Indicate this as a MET database query ###\n"
//                + "Met_query<-" + 
                + "### Use MySQL database for queries\n"
//                + "AMET_DB<-" + 
                + "#### Main Database Query String ###\n"
                + "query<-" + query + "\n"
                + "### Process ID number ###\n"
                + "pid<-" + pid + "\n"
                + "### Database Name ###\n"
                + "dbase<-" + dbase + "\n"
                + "### Parameter Occurrence (PO) Code ###\n"
                + "POCode<-" + "\"\"\n"
                + "### Directory to write figures ###\n"
                + "figdir<-" + figdir + "/n"
                + "### Use only common sites among mulitple simulations ###\n"
                + "common_sites<-" + common_sites + "\n"
                + "### Species ###\n"
                + "species_in<-" + species_in + "\n"
                + "custom_species<-" + custom_species_name + "\n"
                + "custom_species_name<-" + custom_species_name + "\n"
                + "custom_units<-" + custom_units + "\n"
                + "### Project ID Name 1 ###\n"
                + "run_name1<-" + run_name1 + "\n"
                + "### Additional Run Names (used for model-to-model comparisons) ###\n"
                + "run_name2<-" + run_name2 + "\n"
                + "run_name3<-" + run_name2 + "\n"
                + "run_name4<-" + run_name2 + "\n"
                + "run_name5<-" + run_name2 + "\n"
                + "run_name6<-" + run_name2 + "\n"
                + "run_name7<-" + run_name2 + "\n"
                + "### Array of Observation Network Flags ###\n"
                + "#inc_networks<-\n"
                + "inc_csn<-" + inc_csn + "\n"
                + "inc_improve<-" + inc_improve + "\n"
                + "inc_castnet<-" + inc_castnet + "\n"
                + "inc_castnet_hr<-" + inc_castnet_hr + "\n"
                + "inc_castnet_daily<-" + inc_castnet_daily + "\n"
                + "inc_castnet_drydep<-" + inc_castnet_drydep + "\n"
                + "inc_capmon<-" + inc_capmon + "\n"
                + "inc_naps<-" + inc_naps + "\n"
                + "inc_naps_daily_o3<-" + inc_naps_daily_o3 + "\n"
                + "inc_nadp<-" + inc_nadp + "\n"
                + "inc_airmon_dep<-" + inc_airmon_dep + "\n"
                + "inc_amon<-" + inc_amon + "\n"
                + "inc_aqs_hourly<-" + inc_aqs_hourly + "\n"
                + "inc_aqs_daily_O3<-" + inc_aqs_daily_o3 + "\n"
                + "inc_aqs_daily<-" + inc_aqs_daily + "\n"
                + "inc_aqs_daily_pm<-" + inc_aqs_daily_pm + "\n"
                + "inc_search<-" + inc_search + "\n"
                + "inc_search_daily<-" + inc_search_daily + "\n"
                + "inc_aeronet<-" + inc_aeronet + "\n"
                + "inc_fluxnet<-" + inc_fluxnet + "\n"
                + "inc_noaa_esrl_o3<-" + inc_noaa_esrl_o3 + "\n"
                + "inc_toar<-" + inc_toar + "\n"
                + "inc_mdn<-" + inc_mdn + "\n"
                + "inc_tox<-" + inc_tox + "\n"
                + "inc_mod<-" + inc_mod + "\n"
                + "## European Networks ##\n"
                + "inc_admn<-" + inc_admn + "\n"
                + "inc_aganet<-" + inc_aganet + "\n"
                + "inc_airbase_hourly<-" + inc_airbase_hourly + "\n"
                + "inc_airbase_daily<-" + inc_airbase_daily + "\n"
                + "inc_aurn_hourly<-" + inc_aurn_hourly + "\n"
                + "inc_aurn_daily<-" + inc_aurn_daily + "\n"
                + "inc_emep_hourly<-" + inc_emep_hourly + "\n"
                + "inc_emep_daily<-" + inc_emep_daily + "\n"
                + "inc_emep_daily_o3<-" + inc_emep_daily_o3 + "\n"
//                + "inc_namn<-" + inc_namn + "\n" //this doesnt exist????
                + "## Campaigns ##\n"
                + "inc_calnex<-" + inc_calnex + "\n"
                + "inc_soas<-" + inc_soas + "\n"
                + "inc_special<-" + inc_special + "\n"
                + "### Universal Plot Options ###\n"
                + "dates<-" + dates + "\n"
                + "custom_title<-" + custom_title + "\n"
                + "png_from_html<-" + png_from_html + "\n"
                + "png_res<-" + png_res + "\n"
                + "x_label_angle<-" + x_label_angle + "\n"
                + "### Plotly Options ###\n"
                + "img_height<-" + img_height + "\n"
                + "img_width<-" + img_width + "\n"
                + "### Flag for Time Averaging ###\n"
                + "averaging<-" + averaging + "\n"
                + "remove_negatives<-" + remove_negatives + "\n"
                + "use_avg_stats<-" + use_avg_stats + "\n"
                + "aggregate_data" + aggregate_data + "\n"
//                + "merge_statid_POC<-" + merge_statid_POC + "\n"
                + "### Time Series Plot Options ###\n"
                + "inc_legend<-" + inc_legend + "\n"
                + "inc_points<-" + inc_points + "\n"
                + "inc_bias<-" + inc_bias + "\n"
                + "inc_rmse<-" + inc_rmse + "\n"
                + "inc_corr<-" + inc_corr + "\n"
                + "use_var_mean<-" + use_var_mean + "\n"
                + "obs_per_day_limit<-" + obs_per_day_limit + "\n"
                + "avg_func<-" + avg_func + "\n"
                + "avg_func_name<-" + avg_func_name + "\n"
                + "line_width<-" + line_width + "\n"
                + "### Kelly Plot Options ###\n"
                + "nmb_max<-" + nmb_max + "\n"
                + "nme_max<-" + nme_max + "\n"
                + "mb_max<-" + mb_max + "\n"
                + "me_min<-" + me_min + "\n"
                + "me_max<-" + me_max + "\n"
                + "rmse_min<-" + rmse_min + "\n"
                + "rmse_max<-" + rmse_max + "\n"
                + "nmb_int<-" + nmb_int + "\n"
                + "nme_int<-" + nme_int + "\n"
                + "### Unique color ranges for some plots ###\n"
//                + "color_ranges<-" + color_ranges + "\n"
                + "### Monitoring Sites to Include ###\n"
                + "site<-" + site + "\n"
                + "### States to Include ###\n"
                + "state<-" + state + "\n"
                + "### Regional Planning Organizations to Include ###\n"
                + "rpo<-" + rpo + "\n"
                + "### Priciple Component Analysis (PCA) Region ###\n"
                + "pca<-" + pca + "\n"
                + "### Climate Region ###\n"
                + "clim_reg<-" + clim_reg + "\n"
                + "### Binned Plot Options ###\n"
                + "pca_flag<-" + pca_flag + "\n"
//                + "bin_by_mod<-" + bin_by_mods + "\n
                + "inc_error<-" + inc_error + "\n"
                + "### Landuse Category\n"
                + "loc_setting<-" + loc_setting + "\n"
                + "### Flag to Include or Remove Zero Precipitation Observations ###\n"
////                + "zeroprecip<-" + zeroprecip + "  \n"
                + "### Numerical Limit for Data Completeness as minimum number of required observations (used when calulating site statistics or averages)###\n"
                + "coverage_limit<-" + coverage_limit + "\n"
                + "all_valid<-" + all_valid + "\n"
                + "all_valid_amon<-" + all_valid_amon + "\n"
                + "### Numerical Limit for Data Completeness as minimum number of required observations (used when calulating site statistics or averages)###\n"
                + "num_obs_limit<-" + num_obs_limit + "\n"
                + "### Flag for Soccer and Bugle Plots Setting NMB/NME or FB/FE ###\n"
                + "soccerplot_opt<-" + soccerplot_opt + "\n"
                + "### Flag for PAVE Overlay; 1=hourly, 2=daily ###\n"
                + "overlay_opt<-" + overlay_opt + "\n"
                + "### Flags for Confidence Lines to Plot on Scatterplots ###\n"
                + "conf_line<-" + conf_line + "\n"
                + "trend_line<-" + trend_line + "\n"
                + "### Scatterplot x and y axes limits ###\n"
                + "x_axis_min<-" + x_axis_min + "\n"
                + "x_axis_max<-" + x_axis_max + "\n"
                + "y_axis_min<-" + y_axis_min + "\n"
                + "y_axis_max<-" + y_axis_max + "\n"
                + "bias_y_axis_min<-" + bias_y_axis_min + "\n"
                + "bias_y_axis_max<-" + bias_y_axis_max + "\n"
                + "density_zlim<-" + density_zlim + "\n"
                + "num_dens_bins<-" + num_dens_bins + "\n"
                + "max_limit<-" + max_limit + "\n"
                + "### Hourly Boxplot Options ###\n"
                + "inc_whiskers<-" + inc_whiskers + "\n"
                + "inc_ranges<-" + inc_ranges + "\n"
                + "inc_median_lines<-" + inc_median_lines + "\n"
                + "remove_mean<-" + remove_mean + "\n"
                + "overlap_boxes<-" + overlap_boxes + "\n"
                + "### File containing list of stations created dynamically by the user ###\n"
                + "stat_file<-" + stat_file + "\n"
                + "### Spatial Plot Options ###\n"
                + "symbsizfac<-" + symbsizfac + "\n"
                + "plot_radius<-" + plot_radius + "\n"
                + "outlier_radius<-" + outlier_radius + "\n"
                + "fill_opacity<-" + fill_opacity + "\n"
                + "num_ints<-" + num_ints + "\n"
                + "perc_error_max<-" + perc_error_max + "\n"
                + "abs_error_max<-" + abs_error_max + "\n"
                + "rmse_range_max<-" + rmse_range_max + "\n"
                + "perc_range_min<-" + perc_range_min + "\n"
                + "perc_range_max<-" + perc_range_max + "\n"
                + "abs_range_min<-" + abs_range_min + "\n"
                + "abs_range_max<-" + abs_range_max + "\n"
                + "diff_range_min<-" + diff_range_min + "\n"
                + "diff_range_max<-" + diff_range_max + "\n"
                + "greyscale <-" + greyscale + "\n"
                + "inc_counties <-" + inc_counties + "\n"
                + "hist_max<-" + hist_max + "\n"
                + "map_type<-" + map_type + "\n"
                + "quantile_min<-" + quantile_min + "\n"
                + "quantile_max<-" + quantile_max + "\n"
                + "### Stacked Bar Charts Options ###\n"
                + "inc_FRM_adj<-" + inc_FRM_adj + "\n"
                + "use_median<-" + use_median + "\n"
                + "### Array of flags for which statistics to include on scatter plots ###\n"
                + "stats_flags<-" + stats_flags + "\n"
                + "### Flag to include run info text on plots ###\n"
                + "run_info_text<-" + run_info_text + "\n"
                + "### Set Scatter Plot Symbols and Colors ###\n"
                + "plot_colors<-" + plot_colors + "\n"
                + "plot_colors2<-" + plot_colors2 + "\n"
                + "plot_symbols<-" + plot_symbols + "\n"
//                + "plot_chars<-" + plot_chars + "\n"
                + "### Start and End Year/Month ###\n"
                + "year_start<-" + year_start + "\n"
                + "year_end<-" + year_end + "\n"
                + "month_start<-" + month_start + "\n"
                + "month_end<-" + month_end + "\n"
                + "day_start<-" + day_start + "\n"
                + "day_end<-" + day_end + "\n"
//                + "start_date<-" + start_date + "\n"
//                + "end_date<-" + end_date + "\n"
                + "#############################\n"
                + "### Setup Networks Arrays ###\n"
                + "#############################\n"
                + "network_names <- NULL\n"
                + "network_label <- NULL\n"
                + "if (inc_improve == \"y\") {\n"
                + "   network_names <- c(network_names,\"IMPROVE\")\n"
                + "   network_label <- c(network_label,\"IMPROVE\")\n"
                + "}\n"
                + "if (inc_csn == \"y\") {\n"
                + "   network_names <- c(network_names,\"CSN\")\n"
                + "   network_label <- c(network_label,\"CSN\")\n"
                + "}\n"
                + "if (inc_castnet == \"y\") {\n"
                + "   network_names <- c(network_names,\"CASTNET\")\n"
                + "   network_label <- c(network_label,\"CASTNET\")\n"
                + "}\n"
                + "if (inc_castnet_hr == \"y\") {\n"
                + "   network_names <- c(network_names,\"CASTNET_Hourly\")\n"
                + "   network_label <- c(network_label,\"CASTNET\")\n"
                + "}\n"
                + "if (inc_castnet_daily == \"y\") {\n"
                + "   network_names <- c(network_names,\"CASTNET_Daily\")\n"
                + "   network_label <- c(network_label,\"CASTNET\")\n"
                + "}\n"
                + "if (inc_castnet_drydep == \"y\") {\n"
                + "   network_names <- c(network_names,\"CASTNET_Drydep\")\n"
                + "   network_label <- c(network_label,\"CASTNET\")\n"
                + "}\n"
                + "if (inc_capmon == \"y\") {\n"
                + "   network_names <- c(network_names,\"CAPMON\")\n"
                + "   network_label <- c(network_label,\"CAPMON\")\n"
                + "}\n"
                + "if (inc_naps == \"y\") {\n"
                + "   network_names <- c(network_names,\"NAPS\")\n"
                + "   network_label <- c(network_label,\"NAPS\")\n"
                + "}\n"
                + "if (inc_naps_daily_o3 == \"y\") {\n"
                + "   network_names <- c(network_names,\"NAPS_Daily_O3\")\n"
                + "   network_label <- c(network_label,\"NAPS Daily\")\n"
                + "}\n"
                + "if (inc_nadp == \"y\") {\n"
                + "   network_names <- c(network_names,\"NADP\")\n"
                + "   network_label <- c(network_label,\"NADP\")\n"
                + "}\n"
                + "if (inc_airmon_dep == \"y\") {\n"
                + "   network_names <- c(network_names,\"AIRMON\")\n"
                + "   network_label <- c(network_label,\"AIRMON\")\n"
                + "}\n"
                + "if (inc_amon == \"y\") {\n"
                + "   network_names <- c(network_names,\"AMON\")\n"
                + "   network_label <- c(network_label,\"AMON\")\n"
                + "}\n"
                + "if (inc_aqs_hourly == \"y\") {\n"
                + "   network_names <- c(network_names,\"AQS_Hourly\")\n"
                + "   network_label <- c(network_label,\"AQS_Hourly\")\n"
                + "}\n"
                + "if (inc_aqs_daily_O3 == \"y\") {\n"
                + "   network_names <- c(network_names,\"AQS_Daily_O3\")\n"
                + "   network_label <- c(network_label,\"AQS_Daily\")\n"
                + "}\n"
                + "if (inc_aqs_daily == \"y\") {\n"
                + "   network_names <- c(network_names,\"AQS_Daily\")\n"
                + "   network_label <- c(network_label,\"AQS_Daily\")\n"
                + "}\n"
                + "if (inc_aqs_daily_pm == \"y\") {\n"
                + "   network_names <- c(network_names,\"AQS_Daily_PM\")\n"
                + "   network_label <- c(network_label,\"AQS_Daily\")\n"
                + "}\n"
                + "if (inc_search == \"y\") {\n"
                + "   network_names <- c(network_names,\"SEARCH\")\n"
                + "   network_label <- c(network_label,\"SEARCH\")\n"
                + "}\n"
                + "if (inc_search_daily == \"y\") {\n"
                + "   network_names <- c(network_names,\"SEARCH_Daily\")\n"
                + "   network_label <- c(network_label,\"SEARCH_Daily\")\n"
                + "}\n"
                + "if (inc_aeronet == \"y\") {\n"
                + "   network_names <- c(network_names,\"AERONET\")\n"
                + "   network_label <- c(network_label,\"AERONET\")\n"
                + "}\n"
                + "if (inc_fluxnet == \"y\") {\n"
                + "   network_names <- c(network_names,\"FLUXNET\")\n"
                + "   network_label <- c(network_label,\"FluxNet\")\n"
                + "}\n"
                + "if (inc_noaa_esrl_o3 == \"y\") {\n"
                + "   network_names <- c(network_names,\"NOAA_ESRL_O3\")\n"
                + "   network_label <- c(network_label,\"NOAA ESRL\")\n"
                + "}\n"
                + "if (inc_toar == \"y\") {\n"
                + "   network_names <- c(network_names,\"TOAR\")\n"
                + "   network_label <- c(network_label,\"TOAR\")\n"
                + "}\n"
                + "if (inc_mdn == \"y\") {\n"
                + "   network_names <- c(network_names,\"MDN\")\n"
                + "   network_label <- c(network_label,\"MDN\")\n"
                + "}\n"
                + "if (inc_tox == \"y\") {\n"
                + "   network_names <- c(network_names,\"Toxics\")\n"
                + "   network_label <- c(network_label,\"Toxics\")\n"
                + "}\n"
                + "if (inc_mod == \"y\") {\n"
                + "   network_names <- c(network_names,\"Model_Model\")\n"
                + "   network_label <- c(network_label,\"Mod v. Mod\")\n"
                + "}\n"
                + "if (inc_admn == \"y\") {\n"
                + "   network_names <- c(network_names,\"ADMN\")\n"
                + "   network_label <- c(network_label,\"ADMN\")\n"
                + "}\n"
                + "if (inc_aganet == \"y\") {\n"
                + "   network_names <- c(network_names,\"AGANET\")\n"
                + "   network_label <- c(network_label,\"AGANET\")\n"
                + "}\n"
                + "if (inc_airbase_hourly == \"y\") {\n"
                + "   network_names <- c(network_names,\"AirBase_Hourly\")\n"
                + "   network_label <- c(network_label,\"AirBase\")\n"
                + "}\n"
                + "if (inc_airbase_daily == \"y\") {\n"
                + "   network_names <- c(network_names,\"AirBase_Daily\")\n"
                + "   network_label <- c(network_label,\"AirBase\")\n"
                + "}\n"
                + "if (inc_aurn_hourly == \"y\") {\n"
                + "   network_names <- c(network_names,\"AURN_Hourly\")\n"
                + "   network_label <- c(network_label,\"AURN\")\n"
                + "}\n"
                + "if (inc_aurn_daily == \"y\") {\n"
                + "   network_names <- c(network_names,\"AURN_Daily\")\n"
                + "   network_label <- c(network_label,\"AURN\")\n"
                + "}\n"
                + "if (inc_emep_hourly == \"y\") {\n"
                + "   network_names <- c(network_names,\"EMEP_Hourly\")\n"
                + "   network_label <- c(network_label,\"EMEP\")\n"
                + "}\n"
                + "if (inc_emep_daily == \"y\") {\n"
                + "   network_names <- c(network_names,\"EMEP_Daily\")\n"
                + "   network_label <- c(network_label,\"EMEP\")\n"
                + "}\n"
                + "if (inc_calnex == \"y\") {\n"
                + "   network_names <- c(network_names,\"CALNEX\")\n"
                + "   network_label <- c(network_label,\"CALNEX\")\n"
                + "}\n"
                + "if (inc_soas == \"y\") {\n"
                + "   network_names <- c(network_names,\"SOAS\")\n"
                + "   network_label <- c(network_label,\"SOAS\")\n"
                + "}\n"
                + "if (inc_special == \"y\") {\n"
                + "   network_names <- c(network_names,\"Special\")\n"
                + "   network_label <- c(network_label,\"Special\")\n" 
                + "}"
                
//                + species<-
//                + species<-
//                + "total_networks<-" + total_networks + "\n"
//                + "network1 <-" + network1 + "\n"
//                + "ametptype <-" + ametptype + "\n"
        );
        file.closeWriter();
    }
    
    //formats swing checkbox selections for run_info.r
    public String checkBoxFormat(javax.swing.JCheckBox checkBox) {
        if (checkBox.isSelected()) {
            return "\"y\""; //read as return ""y""
        } else {
            return "\"\"";
        }
    }
    
    //formats strings to be "" for run_info if empty/not selected
    public String textFormat(String str){
        if (str.equals("") || str.equals(" ")) {
            return "\"\"";
        } else {
            return "\"" + str + "\"";
        }
    }
    
    //assigning program names values to run_program combo box fields
    public String programFormat(String str) {
        String name = "";
        switch(str) {
            //Scatter Plots
            case "Multiple Networks Model/Ob Scatterplot (select stats only)":
                run_program = "AQ_Scatterplot.R";
                break;
            case "GGPlot Scatterplot (multi network, single run)":
                run_program = "AQ_Scatterplot_ggplot.R";
                break;
            case "Interactive Multiple Network Scatterplot":
                run_program = "AQ_Scatterplot_plotly.R";
                break;
            case "Interactive Multiple Simulation Scatterplot":
                run_program = "AQ_Scatterplot_multisim_plotly.R";
                break;
            case "Single Network Model/Ob Scatterplot (includes all stats)":
                run_program = "AQ_Scatterplot_single.R";
                break;
            case "Density Scatterplot (single run, single network)":
                run_program = "AQ_Scatterplot_density.R";
                break;
            case "GGPlot Density Scatterplot (single run, single network)":
                run_program = "AQ_Scatterplot_density_ggplot.R";
                break;
            case "Model/Model Scatterplot (multiple networks)":
                run_program = "AQ_Scatterplot_mtom.R";
                break;
            case "Model/Model Density Scatterplot (single network)":
                run_program = "AQ_Scatterplot_mtom_density.R";
                break;
            case "Scatterplot of Percentiles (single network, single run)":
                run_program = "AQ_Scatterplot_percentiles.R";
                break;
            case "Ozone Skill Scatterplot (single network, mult runs)":
                run_program = "AQ_Scatterplot_skill.R";
                break;
            case "Binned MB &amp; RMSE Scatterplots (single net., mult. run)":
                run_program = "AQ_Scatterplot_bins.R";
                break;
            case "Interactive Binned Plot (single net., mult. run)":
                run_program = "AQ_Scatterplot_bins_plotly.R";
                break;
            case "Multi Simulation Scatter plot (single network, mult runs)":
                run_program = "AQ_Scatterplot_multi.R";
                break;
            case "Soil Scatter plot (single network, mult runs)":
                run_program = "AQ_Scatterplot_soil.R";
                break;
            //Time-series plots
            case "Time-Series Plot (single network, multiple sites averages)":
                run_program = "AQ_Timeseries.R";
                break;
            case "Dygraph Time-series Plot":
                run_program = "AQ_Timeseries_dygraph.R";
                break;
            case "Plotly Multi-simulation Timeseries":
                run_program = "AQ_Timeseries_plotly.R";
                break;
            case "Plotly Multi-network Timeseries":
                run_program = "AQ_Timeseries_networks_plotly.R";
                break;
            case "Multi-Network Time-series Plot (mult. net., single run)":
                run_program = "AQ_Timeseries_multi_networks.R";
                break;
            case "Multi-Species Time-series Plot (mult. species, single run)":
                run_program = "AQ_Timeseries_multi_species.R";
                break;
            case "Model-to-Model Time-series Plot (single net., multi run)":
                run_program = "AQ_Timeseries_MtoM.R";
                break;
            case "Year-long Monthly Statistics Plot (single network)":
                run_program = "AQ_Monthly_Stat_Plot.R";
                break;
            //Spatial Plots
            case "Species Statistics and Spatial Plots (multi networks)":
                run_program = "AQ_Stats_Plots.R";
                break;
            case "Interactive Species Statistics and Spatial Plots (multi networks)":
                run_program = "AQ_Stats_Plots_leaflet.R";
                break;
            case "Spatial Plot (multi networks)":
                run_program = "AQ_Plot_Spatial.R";
                break;
            case "Interactive Spatial Plot (multi networks)":
                run_program = "AQ_Plot_Spatial_leaflet.R";
                break;
            case "Model/Model Diff Spatial Plot (multi network, multi run)":
                run_program = "AQ_Plot_Spatial_MtoM.R";
                break;
            case "Interactive Model/Model Diff Spatial Plot (multi network, multi run)":
                run_program = "AQ_Plot_Spatial_MtoM_leaflet.R";
                break;
            case "Model/Model Species Diff Spatial Plot (multi network, multi run)":
                run_program = "AQ_Plot_Spatial_MtoM_Species.R";
                break;
            case "Spatial Plot of Bias/Error Difference (multi network, multi run)":
                run_program = "AQ_Plot_Spatial_Diff.R";
                break;
            case "Interactive Spatial Plot of Bias/Error Difference (multi networks)":
                run_program = "AQ_Plot_Spatial_Diff_leaflet.R";
                break;
            case "Ratio Spatial Plot to total PM2.5 (multi network, multi run)":
                run_program = "AQ_Plot_Spatial_Ratio.R";
                break;
            //Boxplot
            case "Boxplot (single network, multi run)":
                run_program = "AQ_Boxplot.R";
                break;
            case "GGPlot Boxplot (single network, multi run)":
                run_program = "AQ_Boxplot_ggplot.R";
                break;
            case "Plotly Boxplot (single network, multi run)":
                run_program = "AQ_Boxplot_plotly.R";
                break;
            case "Day of Week Boxplot (single network, multiple runs)":
                run_program = "AQ_Boxplot_DofW.R";
                break;
            case "Hourly Boxplot (single network, multiple runs)":
                run_program = "AQ_Boxplot_Hourly.R";
                break;
            case "8hr Average Boxplot (single network, hourly data, can be slow)":
                run_program = "AQ_Boxplot_MDA8.R";
                break;
            case "Roselle Boxplot (single network, multiple simulations)":
                run_program = "AQ_Boxplot_Roselle.R";
                break;
            //Stacked Bar Plots
            case "PM2.5 Stacked Bar Plot (CSN or IMPROVE, multi run)":
                run_program = "AQ_Stacked_Barplot.R";
                break;
            case "PM2.5 Stacked Bar Plot AE6 (CSN or IMPROVE, multi run)":
                run_program = "AQ_Stacked_Barplot_AE6.R";
                break;
            case "Interactive Stacked Bar Plot":
                run_program = "AQ_Stacked_Barplot_AE6_plotly.R";
                break;
            case "GGPlot Stacked Bar Plot":
                run_program = "AQ_Stacked_Barplot_AE6_ggplot.R";
                break;
            case "Stacked Bar Plot Time Series":
                run_program = "AQ_Stacked_Barplot_AE6_ts.R";
                break;
            case "Soil Stacked Bar Plot (CSN or IMPROVE,multi run)":
                run_program = "AQ_Stacked_Barplot_soil.R";
                break;
            case "Soil Stacked Bar Plot Multi (CSN and IMPROVE,single run)":
                run_program = "AQ_Stacked_Barplot_soil_multi.R";
                break;
            case "Multi-Panel Stacked Bar Plot (full year data required)":
                run_program = "AQ_Stacked_Barplot_panel.R";
                break;
            case "Multi-Panel Stacked Bar Plot AE6 (full year data)":
                run_program = "AQ_Stacked_Barplot_panel_AE6.R";
                break;
            case "Multi-Panel, Mulit Run Stacked Bar Plot AE6 (full year data)":
                run_program = "AQ_Stacked_Barplot_panel_AE6_multi.R";
                break;
            //Misc Plots
            case "Kelly Plot (single species, single network, full year data)":
                run_program = "AQ_Kellyplot.R";
                break;
            case "Multisim Kelly Plot (single species, single network, multi sim)":
                run_program = "AQ_Kellyplot_multisim.R";
                break;
            case "Species Statistics (multi species, single network)":
                run_program = "AQ_Stats.R";
                break;
            case "Create raw data csv file (single network, single simulation)":
                run_program = "AQ_Raw_Data.R";
                break;
            case "\"Soccergoal\" plot (multiple networks)":
                run_program = "AQ_Soccerplot.R";
                break;
            case "\"Bugle\" plot (multiple networks)":
                run_program = "AQ_Bugleplot.R";
                break;
            case "Histogram (single network/species only)":
                run_program = "AQ_Histogram.R";
                break;
            case "CDF, Q-Q, Taylor Plots (single network, multi run)":
                run_program = "AQ_Temporal_Plots.R";
                break;
            //Expiramental
            case "Create PAVE/VERDI Obs Overlay File (hourly/daily data only)":
                run_program = "AQ_Overlay_File.R";
                break;
            case "Log-Log Model/Ob Scatterplot (multiple networks)":
                run_program = "AQ_Scatterplot_log.R";
                break;
            case "Spectral Analysis (single network, single run, experimental)":
                run_program = "AQ_Spectral_Analysis.R";
                break;
            case "PM Ratio Spatial Plot (multi network, single run)":
                run_program = "AQ_Plot_Spatial_Ratio.R";
                break;
            default:
                errorWindow("Not a Valid Program", "This error is thrown when the run program combo box detects an input that is not associated with any program. Please make another selection.");
        }
        return "";
    }
    
    //general error window call
    public void errorWindow(String title, String message) {
        ErrorWindow ew = new ErrorWindow(title, message);
        ew.setVisible(true);
    }
    
    public String queryGenerator() {
        String str = " and s.state_id=d.stat_id";
        //states
        //zeroprecip
        //inc_valid
        //inc_valid_amon
        //rpo, regions, countries, etc
        //stat_id
        //date formatting for query
        String sd = year_start + month_start + day_start;
        String ed = year_end + month_end + day_end;
        str = str + " and d.ob_dates BETWEEN " + sd + " and " + ed + " and d.ob_datee BETWEEN " + sd +  " and " + ed + "";
        return str;
    }
    
    //Auto-generated code made by the form, DO NOT EDIT, called by the constructor
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        databaseProjectPanel = new javax.swing.JPanel();
        databaseSpecificationComboBox = new javax.swing.JComboBox<>();
        projectModelRunSpecificationComboBox1 = new javax.swing.JComboBox<>();
        projectDetailsPanel = new javax.swing.JPanel();
        projectDetailsLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        databaseSpecificationLabel = new javax.swing.JLabel();
        projectModelRunSpecificationLabel = new javax.swing.JLabel();
        projectModelRunSpecificationLabel1 = new javax.swing.JLabel();
        projectModelRunSpecificationComboBox2 = new javax.swing.JComboBox<>();
        projectModelRunSpecificationComboBox3 = new javax.swing.JComboBox<>();
        projectModelRunSpecificationComboBox4 = new javax.swing.JComboBox<>();
        projectModelRunSpecificationComboBox5 = new javax.swing.JComboBox<>();
        projectModelRunSpecificationComboBox6 = new javax.swing.JComboBox<>();
        projectModelRunSpecificationComboBox7 = new javax.swing.JComboBox<>();
        regionAreaPanel = new javax.swing.JPanel();
        PCALabel = new javax.swing.JLabel();
        stateInfoLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        stateComboBox = new javax.swing.JComboBox<>();
        RPOInfoLabel = new javax.swing.JLabel();
        RPOComboBox = new javax.swing.JComboBox<>();
        RPOLabel = new javax.swing.JLabel();
        PCAInfoLabel = new javax.swing.JLabel();
        worldRegionsLabel = new javax.swing.JLabel();
        PCAComboBox = new javax.swing.JComboBox<>();
        climateRegionInfoLabel = new javax.swing.JLabel();
        ClimateRegionLabel = new javax.swing.JLabel();
        climateRegionComboBox = new javax.swing.JComboBox<>();
        worldRegionInfoLabel = new javax.swing.JLabel();
        discoverWindowsLabel = new javax.swing.JLabel();
        siteIDPanel = new javax.swing.JPanel();
        siteIDLabel = new javax.swing.JLabel();
        siteIDTextField = new javax.swing.JTextField();
        siteIDLoadInfoLabel = new javax.swing.JTextArea();
        siteIDInfoLabel = new javax.swing.JTextArea();
        siteIDLoadTextField = new javax.swing.JTextField();
        soccergoalBugleButton1 = new javax.swing.JButton();
        worldRegionComboBox = new javax.swing.JComboBox<>();
        discoverWindowsComboBox = new javax.swing.JComboBox<>();
        networkSpeciesPanel = new javax.swing.JPanel();
        AQObservationNetworkLabel = new javax.swing.JLabel();
        AQObservationNetworkInfoLabel = new javax.swing.JLabel();
        AQObservationsNetworksPanel = new javax.swing.JPanel();
        improveCheckBox = new javax.swing.JCheckBox();
        csnCheckBox = new javax.swing.JCheckBox();
        castnetCheckBox = new javax.swing.JCheckBox();
        castnetHourlyCheckBox = new javax.swing.JCheckBox();
        castnetDailyCheckBox = new javax.swing.JCheckBox();
        castnetDryDepCheckBox = new javax.swing.JCheckBox();
        capmonCheckBox = new javax.swing.JCheckBox();
        napsHourlyCheckBox = new javax.swing.JCheckBox();
        napsDailyO3CheckBox = new javax.swing.JCheckBox();
        nadpCheckBox = new javax.swing.JCheckBox();
        amonCheckBox = new javax.swing.JCheckBox();
        airmonCheckBox = new javax.swing.JCheckBox();
        aqsHourlyCheckBox = new javax.swing.JCheckBox();
        aqsDailyO3CheckBox = new javax.swing.JCheckBox();
        aqsDailyCheckBox = new javax.swing.JCheckBox();
        aqsDailyOAQPSO3CheckBox = new javax.swing.JCheckBox();
        aqsDailyO3OldnameCheckBox = new javax.swing.JCheckBox();
        aqsDailyOldNameCheckBox = new javax.swing.JCheckBox();
        searchHourlyCheckBox = new javax.swing.JCheckBox();
        searchDailyCheckBox = new javax.swing.JCheckBox();
        aeronetCheckBox = new javax.swing.JCheckBox();
        fluxnetCheckBox = new javax.swing.JCheckBox();
        noaaESRLCheckBox = new javax.swing.JCheckBox();
        toarCheckBox = new javax.swing.JCheckBox();
        mdnCheckBox = new javax.swing.JCheckBox();
        toxicsHAPsCheckBox = new javax.swing.JCheckBox();
        model_modelCheckBox = new javax.swing.JCheckBox();
        europeanNetworksPanel = new javax.swing.JPanel();
        admnCheckBox = new javax.swing.JCheckBox();
        aganetCheckBox = new javax.swing.JCheckBox();
        airbaseHourlyCheckBox = new javax.swing.JCheckBox();
        airbaseDailyCheckBox = new javax.swing.JCheckBox();
        aurnHourlyCheckBox = new javax.swing.JCheckBox();
        aurnDailyCheckBox = new javax.swing.JCheckBox();
        emepHourlyCheckBox = new javax.swing.JCheckBox();
        emepDailyCheckBox = new javax.swing.JCheckBox();
        emepDailyO3CheckBox = new javax.swing.JCheckBox();
        campaignsPanel = new javax.swing.JPanel();
        campainsLabel = new javax.swing.JLabel();
        calnexCheckBox = new javax.swing.JCheckBox();
        soasCheckBox = new javax.swing.JCheckBox();
        specialCheckBox = new javax.swing.JCheckBox();
        speciesPanel = new javax.swing.JPanel();
        speciesToPlotLabel = new javax.swing.JLabel();
        speciesComboBox = new javax.swing.JComboBox<>();
        advancedSpeciesButton = new javax.swing.JButton();
        europeanNetworksLabel = new javax.swing.JLabel();
        europeanNetworksInfoLabel = new javax.swing.JLabel();
        dateTimePanel = new javax.swing.JPanel();
        dateRangeLabel = new javax.swing.JLabel();
        hourRangeLabel = new javax.swing.JLabel();
        hourRangeInfoLabel = new javax.swing.JTextArea();
        jPanel14 = new javax.swing.JPanel();
        startDateLabel = new javax.swing.JLabel();
        startDatePicker = new com.github.lgooddatepicker.components.DatePicker();
        endDatelabel = new javax.swing.JLabel();
        endDatePicker = new com.github.lgooddatepicker.components.DatePicker();
        jPanel16 = new javax.swing.JPanel();
        startHourLabel = new javax.swing.JLabel();
        startHourComboBox = new javax.swing.JComboBox<>();
        endHourLabel = new javax.swing.JLabel();
        endHourComboBox = new javax.swing.JComboBox<>();
        seasonalAnalysisLabel = new javax.swing.JLabel();
        seasonalAnalysisInfoLabel = new javax.swing.JTextArea();
        seasonalAnalysisComboBox = new javax.swing.JComboBox<>();
        monthlyAnalysisLabel = new javax.swing.JLabel();
        monthlyAnalysisInfoLabel = new javax.swing.JTextArea();
        monthlyAnalysisComboBox = new javax.swing.JComboBox<>();
        miscPanel = new javax.swing.JPanel();
        POCodeLabel = new javax.swing.JLabel();
        POCodeComboBox = new javax.swing.JComboBox<>();
        negativeValuesInfoLabel = new javax.swing.JTextArea();
        negativeValuesLabel = new javax.swing.JLabel();
        POCodeInfoLabel = new javax.swing.JTextArea();
        negativeValuesComboBox = new javax.swing.JComboBox<>();
        aggrgateDataLabel = new javax.swing.JLabel();
        aggrigateDataCheckBox = new javax.swing.JCheckBox();
        temporalAveragingInfoLabel = new javax.swing.JTextArea();
        temporalAveragingLabel = new javax.swing.JLabel();
        aggregateDataInfoLabel = new javax.swing.JTextArea();
        temporalAveragingComboBox = new javax.swing.JComboBox<>();
        programPanel = new javax.swing.JPanel();
        pngPlotQualityLabel = new javax.swing.JLabel();
        programComboBox = new javax.swing.JComboBox<>();
        programToRunInfoLabel = new javax.swing.JTextArea();
        programToRunLabel = new javax.swing.JLabel();
        customTitleTextField = new javax.swing.JTextField();
        customTitleLabel = new javax.swing.JLabel();
        plotlyImageSizeInfoLabel = new javax.swing.JTextArea();
        jPanel18 = new javax.swing.JPanel();
        heightLabel = new javax.swing.JLabel();
        widthLabel = new javax.swing.JLabel();
        heightTextField = new javax.swing.JTextField();
        widthTextField = new javax.swing.JTextField();
        staticPNGCheckBox = new javax.swing.JCheckBox();
        plotlyImageSizeLabel = new javax.swing.JLabel();
        pngPlotQualityComboBox = new javax.swing.JComboBox<>();
        pngPlotQualityInfoLabel = new javax.swing.JTextArea();
        jPanel19 = new javax.swing.JPanel();
        advancedPlotSpcificationlabel = new javax.swing.JLabel();
        soccergoalBugleButton = new javax.swing.JButton();
        ametPlotAxisVutton = new javax.swing.JButton();
        scatterPlotButton = new javax.swing.JButton();
        amertModelEvalStatsPlotsbutton = new javax.swing.JButton();
        overlayFileButton = new javax.swing.JButton();
        customSQLQueryButton = new javax.swing.JButton();
        customSQLQueryLabel = new javax.swing.JLabel();
        spacialPlotButton = new javax.swing.JButton();
        runProgramButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        databaseSpecificationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Query not set up" }));
        databaseSpecificationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databaseSpecificationComboBoxActionPerformed(evt);
            }
        });

        projectModelRunSpecificationComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(select a database first)" }));
        projectModelRunSpecificationComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectModelRunSpecificationComboBox1ActionPerformed(evt);
            }
        });

        projectDetailsLabel.setText("Project Details");
        projectDetailsLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jTextArea14.setColumns(20);
        jTextArea14.setRows(5);
        jScrollPane2.setViewportView(jTextArea14);

        javax.swing.GroupLayout projectDetailsPanelLayout = new javax.swing.GroupLayout(projectDetailsPanel);
        projectDetailsPanel.setLayout(projectDetailsPanelLayout);
        projectDetailsPanelLayout.setHorizontalGroup(
            projectDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectDetailsPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(projectDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        projectDetailsPanelLayout.setVerticalGroup(
            projectDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(projectDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        databaseSpecificationLabel.setText("Database Specification");
        databaseSpecificationLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        projectModelRunSpecificationLabel.setText("Project/Model Run Specification");
        projectModelRunSpecificationLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        projectModelRunSpecificationLabel1.setText("Additional Project IDs:");
        projectModelRunSpecificationLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        projectModelRunSpecificationComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        projectModelRunSpecificationComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        projectModelRunSpecificationComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        projectModelRunSpecificationComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        projectModelRunSpecificationComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        projectModelRunSpecificationComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        javax.swing.GroupLayout databaseProjectPanelLayout = new javax.swing.GroupLayout(databaseProjectPanel);
        databaseProjectPanel.setLayout(databaseProjectPanelLayout);
        databaseProjectPanelLayout.setHorizontalGroup(
            databaseProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(databaseProjectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(databaseProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projectModelRunSpecificationComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(databaseSpecificationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(databaseSpecificationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectModelRunSpecificationLabel)
                    .addComponent(projectModelRunSpecificationLabel1)
                    .addComponent(projectModelRunSpecificationComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectModelRunSpecificationComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectModelRunSpecificationComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectModelRunSpecificationComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectModelRunSpecificationComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectModelRunSpecificationComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(projectDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        databaseProjectPanelLayout.setVerticalGroup(
            databaseProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(databaseProjectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(databaseSpecificationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(databaseSpecificationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(projectModelRunSpecificationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(projectModelRunSpecificationComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(projectModelRunSpecificationLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(projectModelRunSpecificationComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(projectModelRunSpecificationComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(projectModelRunSpecificationComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(projectModelRunSpecificationComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(projectModelRunSpecificationComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(projectModelRunSpecificationComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(projectDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Database/Project", databaseProjectPanel);

        PCALabel.setText("Principal Component Analysis (PCA) Regions");
        PCALabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        stateInfoLabel.setText("Isolate an evaluation dataset by state");

        stateLabel.setText("State");
        stateLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        stateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Include all states", "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "IllinoisIndiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "MontanaNebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "PennsylvaniaRhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }));

        RPOInfoLabel.setText("Isolate an evaulation dataset by a regional planning organization");

        RPOComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "VISTAS", "CENRAP", "MANE-VU", "LADCO", "WRAP" }));

        RPOLabel.setText("Regional Planning Organizations (RPO) Regions");
        RPOLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        PCAInfoLabel.setText("Isolate an evaluation dataset by a regional planning organization");

        worldRegionsLabel.setText("World Regions");
        worldRegionsLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        PCAComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Northeast (Ozone)", "Great Lakes (Ozone)", "Mid-Atlantic (Ozone)", "Southwest (Ozone)", "Northeast (Aerosols)", "Great Lakes (Aerosols)", "Southeast (Aerosols)", "Lower Midwest (Aerosols)", "West (Aerosols)" }));

        climateRegionInfoLabel.setText("Isolate an evaluation dataset by region");

        ClimateRegionLabel.setText("Climate Regions");
        ClimateRegionLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        climateRegionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Central", "East-North Central", "Northeast", "Northwest", "South", "Southeast", "Southwest", "West", "West-North Central" }));

        worldRegionInfoLabel.setText("Isolate an evaulation dataset by Continent");

        discoverWindowsLabel.setText("Discover-AQ 4-km and 1-km Windows");
        discoverWindowsLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        siteIDLabel.setText("Site ID");
        siteIDLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        siteIDLoadInfoLabel.setColumns(20);
        siteIDLoadInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        siteIDLoadInfoLabel.setLineWrap(true);
        siteIDLoadInfoLabel.setRows(5);
        siteIDLoadInfoLabel.setText("To load a custom site file, enter the location and name of the file below. The format should be the sams as this example. You must also enter \"Load_File\" as the site name in the top box.");
        siteIDLoadInfoLabel.setWrapStyleWord(true);
        siteIDLoadInfoLabel.setOpaque(false);

        siteIDInfoLabel.setColumns(20);
        siteIDInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        siteIDInfoLabel.setLineWrap(true);
        siteIDInfoLabel.setRows(5);
        siteIDInfoLabel.setText("Go here to interactivly choose a single observation station or manually enter an id (e.g. WASH1). Interactive choosing does not work for AQ sites. For time series plot, if Site ID is left blank, all stations for each network will be used.");
        siteIDInfoLabel.setWrapStyleWord(true);
        siteIDInfoLabel.setOpaque(false);

        soccergoalBugleButton1.setText("Geography Criteria");
        soccergoalBugleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geographyCriteriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout siteIDPanelLayout = new javax.swing.GroupLayout(siteIDPanel);
        siteIDPanel.setLayout(siteIDPanelLayout);
        siteIDPanelLayout.setHorizontalGroup(
            siteIDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(siteIDPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(siteIDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(siteIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siteIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siteIDLoadInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siteIDInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siteIDLoadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soccergoalBugleButton1))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        siteIDPanelLayout.setVerticalGroup(
            siteIDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(siteIDPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(siteIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siteIDInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siteIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(siteIDLoadInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siteIDLoadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(soccergoalBugleButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        worldRegionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "North America", "U.S. & Canada", "South America", "Europe", "Asia" }));

        discoverWindowsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "4-km Window", "1-km Window", "2-km Window SJV" }));

        javax.swing.GroupLayout regionAreaPanelLayout = new javax.swing.GroupLayout(regionAreaPanel);
        regionAreaPanel.setLayout(regionAreaPanelLayout);
        regionAreaPanelLayout.setHorizontalGroup(
            regionAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regionAreaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(regionAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PCAInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(worldRegionsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(PCAComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(climateRegionInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(climateRegionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClimateRegionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(worldRegionInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discoverWindowsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PCALabel, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(RPOComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RPOLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(RPOInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(worldRegionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discoverWindowsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(siteIDPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        regionAreaPanelLayout.setVerticalGroup(
            regionAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regionAreaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stateInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RPOLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RPOInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RPOComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PCALabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PCAInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PCAComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ClimateRegionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(climateRegionInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(climateRegionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(worldRegionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(worldRegionInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(worldRegionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(discoverWindowsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(discoverWindowsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
            .addComponent(siteIDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Region/Area", regionAreaPanel);

        AQObservationNetworkLabel.setText("AQ Observation Networks");
        AQObservationNetworkLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        AQObservationNetworkInfoLabel.setText("Choose air quality monitoring networks to use");

        improveCheckBox.setText(" IMPROVE (e.g. SO4,NO3,PM2.5,EC,OC,TC) ");

        csnCheckBox.setText(" CSN (e.g. SO4,NO3,NH4,PM2.5,EC,OC,TC) ");

        castnetCheckBox.setText(" CASTNet (e.g. SO4,NO3,NH4,SO2,HNO3,TNO3) ");

        castnetHourlyCheckBox.setText(" CASTNet - Hourly (O3, RH, Precip, T, Solor Rad, WSPD, WDIR) ");

        castnetDailyCheckBox.setText(" CASTNet Daily (1-hr and 8-hr max O3) ");

        castnetDryDepCheckBox.setText(" CASTNet Dry Dep (SO4,NO3,NH4,HNO3,TNO3,O3,SO2) ");

        capmonCheckBox.setText(" CAPMoN (SO4,NO3,NH4,HNO3,TNO3,SO2) ");

        napsHourlyCheckBox.setText(" NAPS - Hourly (O3,NO,NO2,NOX,SO2,PM2.5,PM10) ");

        napsDailyO3CheckBox.setText(" NAPS - Daily O3 (1-hr and 8-hr max O3) ");

        nadpCheckBox.setText(" NADP (e.g. SO4,NO3,NH4,Precip, Cl Ion) ");

        amonCheckBox.setText(" AMON (NH3) ");

        airmonCheckBox.setText(" AIRMON (Deposition) (SO4,NO3,NH4,Precip) ");

        aqsHourlyCheckBox.setText(" AQS - Hourly (e.g. NO,NO2,NOx,NOy,SO2,CO,PM2.5,O3,etc.) ");

        aqsDailyO3CheckBox.setText(" AQS - Daily O3 (1-hr and 8-hr max O3) ");

        aqsDailyCheckBox.setText(" AQS - Daily (e.g. PM2.5,PM10, and PAMS species) ");

        aqsDailyOAQPSO3CheckBox.setText(" AQS - Daily OAQPS O3 (Various 8-hr max O3) ");

        aqsDailyO3OldnameCheckBox.setText(" AQS - Daily O3 (Old name) Old 1-hr and 8-hr max O3 network ");

        aqsDailyOldNameCheckBox.setText(" AQS - Daily (Old name) PM2.5,PM10, and PAMS species network ");

        searchHourlyCheckBox.setText(" SEARCH Hourly (e.g. O3,CO,SO2,NO,HNO3,etc.) ");

        searchDailyCheckBox.setText(" SEARCH Daily (Fine and Coarse Mode Species) ");

        aeronetCheckBox.setText(" AERONET (AOD: 340, 380, 440, 500, 675, 870, 1020, 1640) ");

        fluxnetCheckBox.setText(" FluxNet (Soil/Flux variables) ");

        noaaESRLCheckBox.setText(" NOAA ESRL (Hourly O3) ");

        toarCheckBox.setText(" TOAR (Daily O3 values) ");

        mdnCheckBox.setText(" MDN (Hg) ");

        toxicsHAPsCheckBox.setText(" Toxics / HAPs ");

        model_modelCheckBox.setText(" Model_Model ");

        javax.swing.GroupLayout AQObservationsNetworksPanelLayout = new javax.swing.GroupLayout(AQObservationsNetworksPanel);
        AQObservationsNetworksPanel.setLayout(AQObservationsNetworksPanelLayout);
        AQObservationsNetworksPanelLayout.setHorizontalGroup(
            AQObservationsNetworksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AQObservationsNetworksPanelLayout.createSequentialGroup()
                .addGroup(AQObservationsNetworksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(improveCheckBox)
                    .addComponent(csnCheckBox)
                    .addComponent(castnetCheckBox)
                    .addComponent(castnetHourlyCheckBox)
                    .addComponent(castnetDailyCheckBox)
                    .addComponent(castnetDryDepCheckBox)
                    .addComponent(capmonCheckBox)
                    .addComponent(napsHourlyCheckBox)
                    .addComponent(napsDailyO3CheckBox)
                    .addComponent(nadpCheckBox)
                    .addComponent(amonCheckBox)
                    .addComponent(airmonCheckBox)
                    .addComponent(aqsHourlyCheckBox)
                    .addComponent(aqsDailyO3CheckBox)
                    .addComponent(aqsDailyCheckBox)
                    .addComponent(aqsDailyOAQPSO3CheckBox)
                    .addComponent(aqsDailyO3OldnameCheckBox)
                    .addComponent(searchHourlyCheckBox)
                    .addComponent(searchDailyCheckBox)
                    .addComponent(aeronetCheckBox)
                    .addComponent(fluxnetCheckBox)
                    .addComponent(noaaESRLCheckBox)
                    .addComponent(toarCheckBox)
                    .addComponent(mdnCheckBox)
                    .addComponent(toxicsHAPsCheckBox)
                    .addComponent(model_modelCheckBox)
                    .addComponent(aqsDailyOldNameCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        AQObservationsNetworksPanelLayout.setVerticalGroup(
            AQObservationsNetworksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AQObservationsNetworksPanelLayout.createSequentialGroup()
                .addComponent(improveCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(csnCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(castnetCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(castnetHourlyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(castnetDailyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(castnetDryDepCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(capmonCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(napsHourlyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(napsDailyO3CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nadpCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amonCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(airmonCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aqsHourlyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aqsDailyO3CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aqsDailyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aqsDailyOAQPSO3CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aqsDailyO3OldnameCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aqsDailyOldNameCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchHourlyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchDailyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aeronetCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fluxnetCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noaaESRLCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toarCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mdnCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toxicsHAPsCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(model_modelCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        admnCheckBox.setText(" ADMN (SO4,NO3,NH4,Precip, Na Ion, Cl Ion)");

        aganetCheckBox.setText(" AGANET (HCl, NO2, NOY, SOX, HNO3, SO2, Cl, Na) ");

        airbaseHourlyCheckBox.setText(" AirBase_Hourly (NO, NO2, NOX, SO2, CO, PM2.5, PM10, O3) ");

        airbaseDailyCheckBox.setText(" AirBase_Daily (NO, NO2, NOX, SO2, CO, PM2.5, PM10, O3) ");

        aurnHourlyCheckBox.setText(" AURN_Hourly (NO, NO2, NOX, SO2, CO, PM2.5, PM10, O3) ");

        aurnDailyCheckBox.setText(" AURN_Daily (NO, NO2, NOX, SO2, CO, PM2.5, PM10, O3) ");

        emepHourlyCheckBox.setText(" EMEP - Hourly (NO, NO2, NOX, SO2, CO, PM2.5, PM10, O3) ");

        emepDailyCheckBox.setText(" EMEP - Daily (SO4, NO3, NH44, trace metals, PM2.5, PM10, O3) ");

        emepDailyO3CheckBox.setText(" EMEP - Daily O3 (1-rh and 8-hr max O3) ");

        campainsLabel.setText("Campains");
        campainsLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        calnexCheckBox.setText(" CALNEX ");

        soasCheckBox.setText(" SOAS ");

        specialCheckBox.setText(" Special ");

        javax.swing.GroupLayout campaignsPanelLayout = new javax.swing.GroupLayout(campaignsPanel);
        campaignsPanel.setLayout(campaignsPanelLayout);
        campaignsPanelLayout.setHorizontalGroup(
            campaignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campaignsPanelLayout.createSequentialGroup()
                .addComponent(campainsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(campaignsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(campaignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calnexCheckBox)
                    .addComponent(soasCheckBox)
                    .addComponent(specialCheckBox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        campaignsPanelLayout.setVerticalGroup(
            campaignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campaignsPanelLayout.createSequentialGroup()
                .addComponent(campainsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calnexCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(soasCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(specialCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        speciesToPlotLabel.setText("Species to Plot");
        speciesToPlotLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        speciesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        advancedSpeciesButton.setText("Advanced Species Settings");
        advancedSpeciesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedSpeciesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout speciesPanelLayout = new javax.swing.GroupLayout(speciesPanel);
        speciesPanel.setLayout(speciesPanelLayout);
        speciesPanelLayout.setHorizontalGroup(
            speciesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(speciesPanelLayout.createSequentialGroup()
                .addGroup(speciesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(speciesToPlotLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, speciesPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(speciesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 100, Short.MAX_VALUE))
            .addGroup(speciesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(advancedSpeciesButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        speciesPanelLayout.setVerticalGroup(
            speciesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(speciesPanelLayout.createSequentialGroup()
                .addComponent(speciesToPlotLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(speciesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(advancedSpeciesButton))
        );

        javax.swing.GroupLayout europeanNetworksPanelLayout = new javax.swing.GroupLayout(europeanNetworksPanel);
        europeanNetworksPanel.setLayout(europeanNetworksPanelLayout);
        europeanNetworksPanelLayout.setHorizontalGroup(
            europeanNetworksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(europeanNetworksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(europeanNetworksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(admnCheckBox)
                    .addComponent(aganetCheckBox)
                    .addComponent(airbaseHourlyCheckBox)
                    .addComponent(airbaseDailyCheckBox)
                    .addComponent(aurnHourlyCheckBox)
                    .addComponent(aurnDailyCheckBox)
                    .addComponent(emepHourlyCheckBox)
                    .addComponent(emepDailyCheckBox)
                    .addComponent(emepDailyO3CheckBox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(campaignsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(europeanNetworksPanelLayout.createSequentialGroup()
                .addComponent(speciesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        europeanNetworksPanelLayout.setVerticalGroup(
            europeanNetworksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(europeanNetworksPanelLayout.createSequentialGroup()
                .addComponent(admnCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aganetCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(airbaseHourlyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(airbaseDailyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aurnHourlyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aurnDailyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emepHourlyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emepDailyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emepDailyO3CheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campaignsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(speciesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        europeanNetworksLabel.setText("European Networks");
        europeanNetworksLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        europeanNetworksInfoLabel.setText("Choose air quality monitoring networks to use");

        javax.swing.GroupLayout networkSpeciesPanelLayout = new javax.swing.GroupLayout(networkSpeciesPanel);
        networkSpeciesPanel.setLayout(networkSpeciesPanelLayout);
        networkSpeciesPanelLayout.setHorizontalGroup(
            networkSpeciesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, networkSpeciesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(networkSpeciesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AQObservationNetworkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AQObservationNetworkInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AQObservationsNetworksPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(networkSpeciesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(europeanNetworksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(europeanNetworksPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(europeanNetworksInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124))
        );
        networkSpeciesPanelLayout.setVerticalGroup(
            networkSpeciesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(networkSpeciesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(networkSpeciesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AQObservationNetworkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(europeanNetworksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(networkSpeciesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AQObservationNetworkInfoLabel)
                    .addComponent(europeanNetworksInfoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(networkSpeciesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AQObservationsNetworksPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(europeanNetworksPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Network/Species", networkSpeciesPanel);

        dateRangeLabel.setText("Set Date Range");
        dateRangeLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        hourRangeLabel.setText("Set Hour Range");
        hourRangeLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        hourRangeInfoLabel.setColumns(20);
        hourRangeInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        hourRangeInfoLabel.setLineWrap(true);
        hourRangeInfoLabel.setRows(5);
        hourRangeInfoLabel.setText("Use this option to isolate a range of hours to include in the analysis. Hours are in LST. The default is to include all hours of the day in the analysis.");
        hourRangeInfoLabel.setWrapStyleWord(true);
        hourRangeInfoLabel.setOpaque(false);

        startDateLabel.setText("Start Date");

        endDatelabel.setText("End Date");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(startDateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(endDatelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(startDateLabel)
                .addComponent(startDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(endDatelabel)
                .addComponent(endDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        startHourLabel.setText("Start Hour");

        startHourComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12AM", "1AM", "2AM", "3AM", "4AM", "5AM", "6AM", "7AM", "8AM", "9AM", "10AM", "11AM", "12PM", "1PM", "2PM", "3PM", "4PM", "5PM", "6PM", "7PM", "8PM", "9PM", "10PM", "11PM" }));

        endHourLabel.setText("End Hour");

        endHourComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12AM", "1AM", "2AM", "3AM", "4AM", "5AM", "6AM", "7AM", "8AM", "9AM", "10AM", "11AM", "12PM", "1PM", "2PM", "3PM", "4PM", "5PM", "6PM", "7PM", "8PM", "9PM", "10PM", "11PM" }));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(startHourLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startHourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(endHourLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endHourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(startHourLabel)
                .addComponent(startHourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(endHourLabel)
                .addComponent(endHourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        seasonalAnalysisLabel.setText("Seasonal Analysis");
        seasonalAnalysisLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        seasonalAnalysisInfoLabel.setColumns(20);
        seasonalAnalysisInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        seasonalAnalysisInfoLabel.setLineWrap(true);
        seasonalAnalysisInfoLabel.setRows(5);
        seasonalAnalysisInfoLabel.setText("Use this option to isolate evaluation data by a particular season of the year. When using this option, set the dates above to cover the entire season or year. All months in the season chosen must fall within the dates set above.\n\n");
        seasonalAnalysisInfoLabel.setWrapStyleWord(true);
        seasonalAnalysisInfoLabel.setOpaque(false);

        seasonalAnalysisComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Winter (Dec,Jan,Feb)", "Spring (Mar,Apr,May)", "Summer (Jun,Jul,Aug)", "Autumn (Sep,Oct,Nov)" }));

        monthlyAnalysisLabel.setText("Individual Monthly Analysis");
        monthlyAnalysisLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        monthlyAnalysisInfoLabel.setColumns(20);
        monthlyAnalysisInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        monthlyAnalysisInfoLabel.setLineWrap(true);
        monthlyAnalysisInfoLabel.setRows(5);
        monthlyAnalysisInfoLabel.setText("Use this option to isolate a data set by an individual month of the year. When using this option, set the dates above to cover at least the entire month. It is preferrable to set the date range above to the whole year and then select an individual month from the list above.\n\n");
        monthlyAnalysisInfoLabel.setWrapStyleWord(true);
        monthlyAnalysisInfoLabel.setOpaque(false);

        monthlyAnalysisComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));

        POCodeLabel.setText("Select Parameter Occurrence (PO) Code");
        POCodeLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        POCodeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        negativeValuesInfoLabel.setColumns(20);
        negativeValuesInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        negativeValuesInfoLabel.setLineWrap(true);
        negativeValuesInfoLabel.setRows(5);
        negativeValuesInfoLabel.setText("Select \"yes\" to remove negative values from the analysis. All values less than zero are removed from the analysis. Obviously this can be a problem when plotting species with acceptable negative values (e.g. temperature).");
        negativeValuesInfoLabel.setWrapStyleWord(true);
        negativeValuesInfoLabel.setOpaque(false);

        negativeValuesLabel.setText("Remove negative Values");
        negativeValuesLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        POCodeInfoLabel.setColumns(20);
        POCodeInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        POCodeInfoLabel.setLineWrap(true);
        POCodeInfoLabel.setRows(5);
        POCodeInfoLabel.setText("Use this option to isolate the data by a specific parameter occurence code. Most observations use a parameter occurence code of 1.\n");
        POCodeInfoLabel.setWrapStyleWord(true);
        POCodeInfoLabel.setOpaque(false);

        negativeValuesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        aggrgateDataLabel.setText("Aggregate Data");
        aggrgateDataLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        aggrigateDataCheckBox.setText("Aggrigate Data");

        temporalAveragingInfoLabel.setColumns(20);
        temporalAveragingInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        temporalAveragingInfoLabel.setLineWrap(true);
        temporalAveragingInfoLabel.setRows(5);
        temporalAveragingInfoLabel.setText("The default option is to use all available observations. Alternatively, monthly average values can be used for the analysis. Currently, this option really only applies to the various scatterplots that can be generated. Most of the programs that can be run use all the available pairs, and some programs require hourly data to be used.");
        temporalAveragingInfoLabel.setWrapStyleWord(true);
        temporalAveragingInfoLabel.setOpaque(false);

        temporalAveragingLabel.setText("Temporal Averaging");
        temporalAveragingLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        aggregateDataInfoLabel.setColumns(20);
        aggregateDataInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        aggregateDataInfoLabel.setLineWrap(true);
        aggregateDataInfoLabel.setRows(5);
        aggregateDataInfoLabel.setText("Check this box to aggregate duplicate observations. This typically occurs when multiple measurements are reported for the same site and time period using different parameter occurance codes (POCs). Checking this box will average multiple observations into a single value. If unchecked, observations will not be averaged and each observation will be treated as entirely unique.");
        aggregateDataInfoLabel.setWrapStyleWord(true);
        aggregateDataInfoLabel.setOpaque(false);

        temporalAveragingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Hour of Day Average", "Daily Average", "Monthly Average", "Year/Month Average", "Seasonal Average", "Annual Average", "Entire Period Average", "Day of Week" }));

        javax.swing.GroupLayout miscPanelLayout = new javax.swing.GroupLayout(miscPanel);
        miscPanel.setLayout(miscPanelLayout);
        miscPanelLayout.setHorizontalGroup(
            miscPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miscPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(miscPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(negativeValuesInfoLabel)
                    .addComponent(POCodeInfoLabel)
                    .addComponent(temporalAveragingInfoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aggregateDataInfoLabel)
                    .addGroup(miscPanelLayout.createSequentialGroup()
                        .addGroup(miscPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(POCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(POCodeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(negativeValuesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aggrigateDataCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(temporalAveragingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miscPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(miscPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(negativeValuesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aggrgateDataLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(temporalAveragingLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        miscPanelLayout.setVerticalGroup(
            miscPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miscPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(POCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(POCodeInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(POCodeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(negativeValuesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(negativeValuesInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(negativeValuesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aggrgateDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aggregateDataInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aggrigateDataCheckBox)
                .addGap(18, 18, 18)
                .addComponent(temporalAveragingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(temporalAveragingInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(temporalAveragingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
        dateTimePanel.setLayout(dateTimePanelLayout);
        dateTimePanelLayout.setHorizontalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dateRangeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hourRangeLabel)
                        .addComponent(seasonalAnalysisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seasonalAnalysisComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(monthlyAnalysisComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(monthlyAnalysisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seasonalAnalysisInfoLabel)
                        .addComponent(monthlyAnalysisInfoLabel)
                        .addComponent(hourRangeInfoLabel))
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(miscPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dateTimePanelLayout.setVerticalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateRangeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hourRangeLabel)
                .addGap(4, 4, 4)
                .addComponent(hourRangeInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(seasonalAnalysisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seasonalAnalysisInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seasonalAnalysisComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(monthlyAnalysisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monthlyAnalysisInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monthlyAnalysisComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(miscPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Date/Time", dateTimePanel);

        pngPlotQualityLabel.setText("PNG Plot Quality");
        pngPlotQualityLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        programComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose AMET Script to Execute", "    - Scatter Plots -", "Multiple Networks Model/Ob Scatterplot (select stats only)", "GGPlot Scatterplot (multi network, single run)", "Interactive Multiple Network Scatterplot", "Interactive Multiple Simulation Scatterplot", "Single Network Model/Ob Scatterplot (includes all stats)", "Density Scatterplot (single run, single network)", "GGPlot Density Scatterplot (single run, single network)", "Model/Model Scatterplot (multiple networks)", "Model/Model Density Scatterplot (single network)", "Scatterplot of Percentiles (single network, single run)", "Ozone Skill Scatterplot (single network, mult runs)", "Binned MB &amp; RMSE Scatterplots (single net., mult. run)", "Interactive Binned Plot (single net., mult. run)", "Multi Simulation Scatter plot (single network, mult runs)", "Soil Scatter plot (single network, mult runs)", "    - Time Series Plots -", "Time-Series Plot (single network, multiple sites averages)", "Dygraph Time-series Plot", "Plotly Multi-simulation Timeseries", "Plotly Multi-network Timeseries", "Multi-Network Time-series Plot (mult. net., single run)", "Multi-Species Time-series Plot (mult. species, single run)", "Model-to-Model Time-series Plot (single net., multi run)", "Year-long Monthly Statistics Plot (single network)", "    - Spatial Plots -", "Species Statistics and Spatial Plots (multi networks)", "Interactive Species Statistics and Spatial Plots (multi networks)", "Spatial Plot (multi networks)", "Interactive Spatial Plot (multi networks)", "Model/Model Diff Spatial Plot (multi network, multi run)", "Interactive Model/Model Diff Spatial Plot (multi network, multi run)", "Model/Model Species Diff Spatial Plot (multi network, multi run)", "Spatial Plot of Bias/Error Difference (multi network, multi run)", "Interactive Spatial Plot of Bias/Error Difference (multi networks)", "Ratio Spatial Plot to total PM2.5 (multi network, multi run)", "    - Box Plots -", "Boxplot (single network, multi run)", "GGPlot Boxplot (single network, multi run)", "Plotly Boxplot (single network, multi run)", "Day of Week Boxplot (single network, multiple runs)", "Hourly Boxplot (single network, multiple runs)", "8hr Average Boxplot (single network, hourly data, can be slow)", "Roselle Boxplot (single network, multiple simulations)", "    - Stacked Bar Plots -", "PM2.5 Stacked Bar Plot (CSN or IMPROVE, multi run)", "PM2.5 Stacked Bar Plot AE6 (CSN or IMPROVE, multi run)", "Interactive Stacked Bar Plot", "GGPlot Stacked Bar Plot", "Stacked Bar Plot Time Series", "Soil Stacked Bar Plot (CSN or IMPROVE,multi run)", "Soil Stacked Bar Plot Multi (CSN and IMPROVE,single run)", "Multi-Panel Stacked Bar Plot (full year data required)", "Multi-Panel Stacked Bar Plot AE6 (full year data)", "Multi-Panel, Mulit Run Stacked Bar Plot AE6 (full year data)", "    - Misc Scripts -", "Kelly Plot (single species, single network, full year data)", "Multisim Kelly Plot (single species, single network, multi sim)", "Species Statistics (multi species, single network)", "Create raw data csv file (single network, single simulation)", "\"Soccergoal\" plot (multiple networks)", "\"Bugle\" plot (multiple networks)", "Histogram (single network/species only)", "CDF, Q-Q, Taylor Plots (single network, multi run)", "    - Experimental Scripts (may not work correctly) -", "Create PAVE/VERDI Obs Overlay File (hourly/daily data only)", "Log-Log Model/Ob Scatterplot (multiple networks)", "Spectral Analysis (single network, single run, experimental)", "PM Ratio Spatial Plot (multi network, single run)" }));

        programToRunInfoLabel.setColumns(20);
        programToRunInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        programToRunInfoLabel.setLineWrap(true);
        programToRunInfoLabel.setRows(5);
        programToRunInfoLabel.setText("Choose which program to run to create specific stats and figures. Note that some programs require certain temporal data (e.g. hourly, monthly). For information regarding each of the programs, click here.\n\n");
        programToRunInfoLabel.setWrapStyleWord(true);
        programToRunInfoLabel.setOpaque(false);

        programToRunLabel.setText("Choose Program to Run");
        programToRunLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        customTitleLabel.setText("Custom Title");
        customTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        plotlyImageSizeInfoLabel.setColumns(20);
        plotlyImageSizeInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        plotlyImageSizeInfoLabel.setLineWrap(true);
        plotlyImageSizeInfoLabel.setRows(5);
        plotlyImageSizeInfoLabel.setText("Enter NULL for auto sizing. Enter height/width values (e.g. 900/1600) to export plot as a PNG file.");
        plotlyImageSizeInfoLabel.setWrapStyleWord(true);
        plotlyImageSizeInfoLabel.setOpaque(false);

        heightLabel.setText("Height");

        widthLabel.setText("Width");

        heightTextField.setText("NULL");

        widthTextField.setText("NULL");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(heightLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(widthLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(widthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(heightLabel)
                .addComponent(widthLabel)
                .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(widthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        staticPNGCheckBox.setText("Create static PNG files from HTML files (can be slow)");

        plotlyImageSizeLabel.setText("Plotly Image Size");
        plotlyImageSizeLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        pngPlotQualityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Medium", "High" }));
        pngPlotQualityComboBox.setSelectedIndex(1);

        pngPlotQualityInfoLabel.setColumns(20);
        pngPlotQualityInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        pngPlotQualityInfoLabel.setLineWrap(true);
        pngPlotQualityInfoLabel.setRows(5);
        pngPlotQualityInfoLabel.setText("Specify the image quality of the PNG plots produced. Lower quality images are smaller and load faster.");
        pngPlotQualityInfoLabel.setWrapStyleWord(true);
        pngPlotQualityInfoLabel.setOpaque(false);

        advancedPlotSpcificationlabel.setText("Advanced Plot Specifications and Data Formatting");
        advancedPlotSpcificationlabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        soccergoalBugleButton.setText("Soccergoal/Bugle Plot Settings");
        soccergoalBugleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soccergoalBugleButtonActionPerformed(evt);
            }
        });

        ametPlotAxisVutton.setText("AMET Plots Axis Options");
        ametPlotAxisVutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ametPlotAxisVuttonActionPerformed(evt);
            }
        });

        scatterPlotButton.setText("Scatter Plot Options");
        scatterPlotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scatterPlotButtonActionPerformed(evt);
            }
        });

        amertModelEvalStatsPlotsbutton.setText("AMET Model Eval Stats/Plots");
        amertModelEvalStatsPlotsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amertModelEvalStatsPlotsbuttonActionPerformed(evt);
            }
        });

        overlayFileButton.setText("Overlay File Options");
        overlayFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overlayFileButtonActionPerformed(evt);
            }
        });

        customSQLQueryButton.setText("Custom SQL Query");
        customSQLQueryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customSQLQueryButtonActionPerformed(evt);
            }
        });

        customSQLQueryLabel.setText("Custom SQL Query");
        customSQLQueryLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        spacialPlotButton.setText("Spatial Plot Options");
        spacialPlotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spacialPlotButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(advancedPlotSpcificationlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customSQLQueryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(spacialPlotButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(customSQLQueryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(overlayFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amertModelEvalStatsPlotsbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scatterPlotButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(soccergoalBugleButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ametPlotAxisVutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(advancedPlotSpcificationlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(soccergoalBugleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ametPlotAxisVutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scatterPlotButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amertModelEvalStatsPlotsbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overlayFileButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spacialPlotButton)
                .addGap(54, 54, 54)
                .addComponent(customSQLQueryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customSQLQueryButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout programPanelLayout = new javax.swing.GroupLayout(programPanel);
        programPanel.setLayout(programPanelLayout);
        programPanelLayout.setHorizontalGroup(
            programPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(programPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(programPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pngPlotQualityInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pngPlotQualityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(programToRunLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pngPlotQualityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staticPNGCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plotlyImageSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(programToRunInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(programPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(plotlyImageSizeInfoLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(programPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(programComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customTitleTextField, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        programPanelLayout.setVerticalGroup(
            programPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(programPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(programToRunLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(programToRunInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(programComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(customTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(plotlyImageSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plotlyImageSizeInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(staticPNGCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pngPlotQualityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pngPlotQualityInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pngPlotQualityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Program", programPanel);

        runProgramButton.setText("Run Program");
        runProgramButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runProgramButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(runProgramButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(runProgramButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void runProgramButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runProgramButtonActionPerformed
        saveVariables();
//        run_program = programFormat(programComboBox.getSelectedItem().toString());
        query = queryGenerator();
        System.out.println(query);
        //TODO: check data for errors
        createRunInfo();
        //TODO: execute program with required files
        
        //test area
        System.out.println(year_start);
        //test area
        
//        AdvancedForm af = new AdvancedForm();
//        af.setVisible(true);
    }//GEN-LAST:event_runProgramButtonActionPerformed

    private void soccergoalBugleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soccergoalBugleButtonActionPerformed
        SoccergoalBugleForm sbForm = new SoccergoalBugleForm(this);
        sbForm.setVisible(true);
    }//GEN-LAST:event_soccergoalBugleButtonActionPerformed

    private void ametPlotAxisVuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ametPlotAxisVuttonActionPerformed
        AMETPlotAxisOptionsForm paoForm = new AMETPlotAxisOptionsForm(this);
        paoForm.setVisible(true);
    }//GEN-LAST:event_ametPlotAxisVuttonActionPerformed

    private void scatterPlotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scatterPlotButtonActionPerformed
        ScatterPlotOptionsForm spoForm = new ScatterPlotOptionsForm(this);
        spoForm.setVisible(true);
    }//GEN-LAST:event_scatterPlotButtonActionPerformed

    private void amertModelEvalStatsPlotsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amertModelEvalStatsPlotsbuttonActionPerformed
        AMETModleEvalStatsPlotsForm amespForm = new AMETModleEvalStatsPlotsForm(this);
        amespForm.setVisible(true);
    }//GEN-LAST:event_amertModelEvalStatsPlotsbuttonActionPerformed

    private void overlayFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overlayFileButtonActionPerformed
        OverlayFileOptionsForm ofoForm = new OverlayFileOptionsForm(this);
        ofoForm.setVisible(true);
    }//GEN-LAST:event_overlayFileButtonActionPerformed

    private void spacialPlotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spacialPlotButtonActionPerformed
        SpatialPlotOptionsForm spoForm = new SpatialPlotOptionsForm(this);
        spoForm.setVisible(true);
    }//GEN-LAST:event_spacialPlotButtonActionPerformed

    private void customSQLQueryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customSQLQueryButtonActionPerformed
        CustomMySQLQueryForm csqlForm = new CustomMySQLQueryForm(this);
        csqlForm.setVisible(true);
    }//GEN-LAST:event_customSQLQueryButtonActionPerformed

    private void advancedSpeciesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advancedSpeciesButtonActionPerformed
        AdvancedSpeciesForm asForm = new AdvancedSpeciesForm(this);
        asForm.setVisible(true);
    }//GEN-LAST:event_advancedSpeciesButtonActionPerformed

    private void projectModelRunSpecificationComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectModelRunSpecificationComboBox1ActionPerformed
        // fill out the project run information
    }//GEN-LAST:event_projectModelRunSpecificationComboBox1ActionPerformed

    private void geographyCriteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geographyCriteriaActionPerformed
        GeographicCriteriaForm gcForm = new GeographicCriteriaForm(this);
        gcForm.setVisible(true);
    }//GEN-LAST:event_geographyCriteriaActionPerformed

    private void databaseSpecificationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databaseSpecificationComboBoxActionPerformed
        //TODO fill out project model run combo boxes
    }//GEN-LAST:event_databaseSpecificationComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AQObservationNetworkInfoLabel;
    private javax.swing.JLabel AQObservationNetworkLabel;
    private javax.swing.JPanel AQObservationsNetworksPanel;
    private javax.swing.JLabel ClimateRegionLabel;
    private javax.swing.JComboBox<String> PCAComboBox;
    private javax.swing.JLabel PCAInfoLabel;
    private javax.swing.JLabel PCALabel;
    private javax.swing.JComboBox<String> POCodeComboBox;
    private javax.swing.JTextArea POCodeInfoLabel;
    private javax.swing.JLabel POCodeLabel;
    private javax.swing.JComboBox<String> RPOComboBox;
    private javax.swing.JLabel RPOInfoLabel;
    private javax.swing.JLabel RPOLabel;
    private javax.swing.JCheckBox admnCheckBox;
    private javax.swing.JLabel advancedPlotSpcificationlabel;
    private javax.swing.JButton advancedSpeciesButton;
    private javax.swing.JCheckBox aeronetCheckBox;
    private javax.swing.JCheckBox aganetCheckBox;
    private javax.swing.JTextArea aggregateDataInfoLabel;
    private javax.swing.JLabel aggrgateDataLabel;
    private javax.swing.JCheckBox aggrigateDataCheckBox;
    private javax.swing.JCheckBox airbaseDailyCheckBox;
    private javax.swing.JCheckBox airbaseHourlyCheckBox;
    private javax.swing.JCheckBox airmonCheckBox;
    private javax.swing.JButton amertModelEvalStatsPlotsbutton;
    private javax.swing.JButton ametPlotAxisVutton;
    private javax.swing.JCheckBox amonCheckBox;
    private javax.swing.JCheckBox aqsDailyCheckBox;
    private javax.swing.JCheckBox aqsDailyO3CheckBox;
    private javax.swing.JCheckBox aqsDailyO3OldnameCheckBox;
    private javax.swing.JCheckBox aqsDailyOAQPSO3CheckBox;
    private javax.swing.JCheckBox aqsDailyOldNameCheckBox;
    private javax.swing.JCheckBox aqsHourlyCheckBox;
    private javax.swing.JCheckBox aurnDailyCheckBox;
    private javax.swing.JCheckBox aurnHourlyCheckBox;
    private javax.swing.JCheckBox calnexCheckBox;
    private javax.swing.JPanel campaignsPanel;
    private javax.swing.JLabel campainsLabel;
    private javax.swing.JCheckBox capmonCheckBox;
    private javax.swing.JCheckBox castnetCheckBox;
    private javax.swing.JCheckBox castnetDailyCheckBox;
    private javax.swing.JCheckBox castnetDryDepCheckBox;
    private javax.swing.JCheckBox castnetHourlyCheckBox;
    private javax.swing.JComboBox<String> climateRegionComboBox;
    private javax.swing.JLabel climateRegionInfoLabel;
    private javax.swing.JCheckBox csnCheckBox;
    private javax.swing.JButton customSQLQueryButton;
    private javax.swing.JLabel customSQLQueryLabel;
    private javax.swing.JLabel customTitleLabel;
    private javax.swing.JTextField customTitleTextField;
    private javax.swing.JPanel databaseProjectPanel;
    private javax.swing.JComboBox<String> databaseSpecificationComboBox;
    private javax.swing.JLabel databaseSpecificationLabel;
    private javax.swing.JLabel dateRangeLabel;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JComboBox<String> discoverWindowsComboBox;
    private javax.swing.JLabel discoverWindowsLabel;
    private javax.swing.JCheckBox emepDailyCheckBox;
    private javax.swing.JCheckBox emepDailyO3CheckBox;
    private javax.swing.JCheckBox emepHourlyCheckBox;
    private com.github.lgooddatepicker.components.DatePicker endDatePicker;
    private javax.swing.JLabel endDatelabel;
    private javax.swing.JComboBox<String> endHourComboBox;
    private javax.swing.JLabel endHourLabel;
    private javax.swing.JLabel europeanNetworksInfoLabel;
    private javax.swing.JLabel europeanNetworksLabel;
    private javax.swing.JPanel europeanNetworksPanel;
    private javax.swing.JCheckBox fluxnetCheckBox;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JTextArea hourRangeInfoLabel;
    private javax.swing.JLabel hourRangeLabel;
    private javax.swing.JCheckBox improveCheckBox;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JCheckBox mdnCheckBox;
    private javax.swing.JPanel miscPanel;
    private javax.swing.JCheckBox model_modelCheckBox;
    private javax.swing.JComboBox<String> monthlyAnalysisComboBox;
    private javax.swing.JTextArea monthlyAnalysisInfoLabel;
    private javax.swing.JLabel monthlyAnalysisLabel;
    private javax.swing.JCheckBox nadpCheckBox;
    private javax.swing.JCheckBox napsDailyO3CheckBox;
    private javax.swing.JCheckBox napsHourlyCheckBox;
    private javax.swing.JComboBox<String> negativeValuesComboBox;
    private javax.swing.JTextArea negativeValuesInfoLabel;
    private javax.swing.JLabel negativeValuesLabel;
    private javax.swing.JPanel networkSpeciesPanel;
    private javax.swing.JCheckBox noaaESRLCheckBox;
    private javax.swing.JButton overlayFileButton;
    private javax.swing.JTextArea plotlyImageSizeInfoLabel;
    private javax.swing.JLabel plotlyImageSizeLabel;
    private javax.swing.JComboBox<String> pngPlotQualityComboBox;
    private javax.swing.JTextArea pngPlotQualityInfoLabel;
    private javax.swing.JLabel pngPlotQualityLabel;
    private javax.swing.JComboBox<String> programComboBox;
    private javax.swing.JPanel programPanel;
    private javax.swing.JTextArea programToRunInfoLabel;
    private javax.swing.JLabel programToRunLabel;
    private javax.swing.JLabel projectDetailsLabel;
    private javax.swing.JPanel projectDetailsPanel;
    private javax.swing.JComboBox<String> projectModelRunSpecificationComboBox1;
    private javax.swing.JComboBox<String> projectModelRunSpecificationComboBox2;
    private javax.swing.JComboBox<String> projectModelRunSpecificationComboBox3;
    private javax.swing.JComboBox<String> projectModelRunSpecificationComboBox4;
    private javax.swing.JComboBox<String> projectModelRunSpecificationComboBox5;
    private javax.swing.JComboBox<String> projectModelRunSpecificationComboBox6;
    private javax.swing.JComboBox<String> projectModelRunSpecificationComboBox7;
    private javax.swing.JLabel projectModelRunSpecificationLabel;
    private javax.swing.JLabel projectModelRunSpecificationLabel1;
    private javax.swing.JPanel regionAreaPanel;
    private javax.swing.JButton runProgramButton;
    private javax.swing.JButton scatterPlotButton;
    private javax.swing.JCheckBox searchDailyCheckBox;
    private javax.swing.JCheckBox searchHourlyCheckBox;
    private javax.swing.JComboBox<String> seasonalAnalysisComboBox;
    private javax.swing.JTextArea seasonalAnalysisInfoLabel;
    private javax.swing.JLabel seasonalAnalysisLabel;
    private javax.swing.JTextArea siteIDInfoLabel;
    private javax.swing.JLabel siteIDLabel;
    private javax.swing.JTextArea siteIDLoadInfoLabel;
    private javax.swing.JTextField siteIDLoadTextField;
    private javax.swing.JPanel siteIDPanel;
    private javax.swing.JTextField siteIDTextField;
    private javax.swing.JCheckBox soasCheckBox;
    private javax.swing.JButton soccergoalBugleButton;
    private javax.swing.JButton soccergoalBugleButton1;
    private javax.swing.JButton spacialPlotButton;
    private javax.swing.JCheckBox specialCheckBox;
    private javax.swing.JComboBox<String> speciesComboBox;
    private javax.swing.JPanel speciesPanel;
    private javax.swing.JLabel speciesToPlotLabel;
    private javax.swing.JLabel startDateLabel;
    private com.github.lgooddatepicker.components.DatePicker startDatePicker;
    private javax.swing.JComboBox<String> startHourComboBox;
    private javax.swing.JLabel startHourLabel;
    private javax.swing.JComboBox<String> stateComboBox;
    private javax.swing.JLabel stateInfoLabel;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JCheckBox staticPNGCheckBox;
    private javax.swing.JComboBox<String> temporalAveragingComboBox;
    private javax.swing.JTextArea temporalAveragingInfoLabel;
    private javax.swing.JLabel temporalAveragingLabel;
    private javax.swing.JCheckBox toarCheckBox;
    private javax.swing.JCheckBox toxicsHAPsCheckBox;
    private javax.swing.JLabel widthLabel;
    private javax.swing.JTextField widthTextField;
    private javax.swing.JComboBox<String> worldRegionComboBox;
    private javax.swing.JLabel worldRegionInfoLabel;
    private javax.swing.JLabel worldRegionsLabel;
    // End of variables declaration//GEN-END:variables
}
