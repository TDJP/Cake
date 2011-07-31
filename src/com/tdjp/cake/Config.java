package com.tdjp.cake;

import java.io.File;

import org.bukkit.util.config.Configuration;

public class Config extends Configuration {
	
	public Config(File file){
		super(file);
	}
	
	public static Config getYML(){
		File f = Cake.data;
		final File yaml = new File(f, "config.yml");
		if (!f.exists()){
			f.mkdirs();
		}
		final Config yml = new Config(yaml);
		if (yaml.exists()){
			yml.load();
		}
		return yml;
	}
	
	public static int getCakeTimes(){
		final Config yml = getYML();
		return yml.getInt("config.cake.times", 1);
	}
}
