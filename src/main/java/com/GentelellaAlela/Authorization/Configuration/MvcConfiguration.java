package com.GentelellaAlela.Authorization.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfiguration extends WebMvcConfigurerAdapter {

	public void addViewControllers(ViewControllerRegistry registry) {
		// static
		//registry.addViewController("/").setViewName("login");
		//registry.addViewController("/login").setViewName("login");

		registry.addViewController("/index").setViewName("index");
		registry.addViewController("/index2").setViewName("index2");
		registry.addViewController("/index3").setViewName("index3");
		// forms
		registry.addViewController("/forms/form").setViewName("/forms/form");
		registry.addViewController("/forms/form_advanced").setViewName("/forms/form_advanced");
		registry.addViewController("/forms/form_buttons").setViewName("/forms/form_buttons");
		registry.addViewController("/forms/form_upload").setViewName("/forms/form_upload");
		registry.addViewController("/forms/form_validation").setViewName("/forms/form_validation");
		registry.addViewController("/forms/form_wizards").setViewName("/forms/form_wizards");

		// charts
		registry.addViewController("/charts/chartjs").setViewName("/charts/chartjs");
		registry.addViewController("/charts/chartjs2").setViewName("/charts/chartjs2");
		registry.addViewController("/charts/echarts").setViewName("/charts/echarts");
		registry.addViewController("/charts/map").setViewName("/charts/map");
		registry.addViewController("/charts/morisjs").setViewName("/charts/morisjs");
		registry.addViewController("/charts/other_charts").setViewName("/charts/other_charts");
		registry.addViewController("/charts/xx").setViewName("/charts/xx");

		// tables
		registry.addViewController("/tables/tables_dynamic").setViewName("/tables/tables_dynamic");
		registry.addViewController("/tables/tables").setViewName("/tables/tables");

		// UI elements
		registry.addViewController("/ui_elements/calendar").setViewName("/ui_elements/calendar");
		registry.addViewController("/ui_elements/fixed_footer").setViewName("/ui_elements/fixed_footer");
		registry.addViewController("/ui_elements/fixed_sidebar").setViewName("/ui_elements/fixed_sidebar");
		registry.addViewController("/ui_elements/general_elements").setViewName("/ui_elements/general_elements");
		registry.addViewController("/ui_elements/glyphicons").setViewName("/ui_elements/glyphicons");
		registry.addViewController("/ui_elements/icons").setViewName("/ui_elements/icons");
		registry.addViewController("/ui_elements/level2").setViewName("/ui_elements/level2");
		registry.addViewController("/ui_elements/map").setViewName("/ui_elements/map");
		registry.addViewController("/ui_elements/media_gallery").setViewName("/ui_elements/media_gallery");
		registry.addViewController("/ui_elements/typography").setViewName("/ui_elements/typography");
		registry.addViewController("/ui_elements/widgets").setViewName("/ui_elements/widgets");

		// others
		registry.addViewController("/others/contacts").setViewName("/others/contacts");
		registry.addViewController("/others/e_commerce").setViewName("/others/e_commerce");
		registry.addViewController("/others/inbox").setViewName("/others/inbox");
		registry.addViewController("/others/invoice").setViewName("/others/invoice");
		registry.addViewController("/others/plain_page").setViewName("/others/plain_page");
		registry.addViewController("/others/pricing_tables").setViewName("/others/pricing_tables");
		registry.addViewController("/others/profile").setViewName("/others/profile");
		registry.addViewController("/others/projects").setViewName("/others/projects");
		registry.addViewController("/others/project_detail").setViewName("/others/project_detail");

		// errors
		registry.addViewController("/errors/page_403").setViewName("/errors/page_403");
		registry.addViewController("/errors/page_404").setViewName("/errors/page_404");
		registry.addViewController("/errors/page_405").setViewName("/errors/page_405");
	}
}