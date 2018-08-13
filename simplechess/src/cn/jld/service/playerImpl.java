package cn.jld.service;

import org.springframework.beans.factory.annotation.Autowired;

import cn.jld.mapper.playerMapper;
import cn.jld.po.player;

public class playerImpl implements playerinterface {

	public playerImpl() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * mapperȫ���������Ѿ�ɨ�裬�����Զ�װ��
	 */
	@Autowired
	private playerMapper playermapper;
	
	@Override
	public player getplayerById(Integer id) throws Exception{
		return playermapper.getplayerById(id);
	}

	@Override
	public void addplayer(player player) throws Exception{
			playermapper.addplayer(player);
	}
	
	public player getplayerByName(String nickname) throws Exception{
		return playermapper.getplayerByName(nickname);
	}
	
}
