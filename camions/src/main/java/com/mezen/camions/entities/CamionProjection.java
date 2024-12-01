package com.mezen.camions.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomCam", types = { Camion.class })
public interface CamionProjection {
	public String getnomcamion();

}
