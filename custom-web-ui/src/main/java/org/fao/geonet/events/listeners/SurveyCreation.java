package org.fao.geonet.events.listeners;

import org.fao.geonet.domain.*;
import org.fao.geonet.events.md.MetadataRemove;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class SurveyCreation implements ApplicationListener<MetadataRemove> {

    @Override
    public void onApplicationEvent(MetadataRemove event) {
	System.out.println("REMOVED");
    }
}
