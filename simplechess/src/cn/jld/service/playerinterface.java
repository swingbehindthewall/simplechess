package cn.jld.service;

import cn.jld.po.player;

/*
 * service��Ľӿ�
 * ��������߼�
 */

public interface playerinterface {
	public player getplayerById(Integer id) throws Exception;
	
	public player getplayerByName(String nickname) throws Exception;
	
	public void addplayer(player player)throws Exception;
}
