package de.hsrm.mi.swtpro03.server.network.messages.editor;

import de.hsrm.mi.swtpro03.server.game.dtos.EnemySpawnPointDTO;
import de.hsrm.mi.swtpro03.server.game.dtos.ItemDTO;

public class EnemySpawnPointRemovedMessage {

	public static final String TYPE = "EnemySpawnPointRemovedMessage";

	private EnemySpawnPointDTO enemySpawnDTO;

	public EnemySpawnPointRemovedMessage() {
	}

	public EnemySpawnPointRemovedMessage(EnemySpawnPointDTO enemySpawnDTO) {
		this.enemySpawnDTO = enemySpawnDTO;
	}

	public EnemySpawnPointDTO getEnemySpawnDTO() {
		return enemySpawnDTO;
	}

	public void setEnemySpawnDTO(EnemySpawnPointDTO enemySpawnDTO) {
		this.enemySpawnDTO = enemySpawnDTO;
	}
}
