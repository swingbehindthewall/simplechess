package cn.jld.mapper;

import cn.jld.po.player;

public interface playerMapper {
	public player getplayerById(Integer id);
	
	public player getplayerByName(String nickname);
	
	public void addplayer(player player);
}
