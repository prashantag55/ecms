package com.ecms.eipl.converter;

import java.util.List;

import com.ecms.eipl.data.ProjectServicesData;
import com.ecms.eipl.entity.ProjectServices;

public interface ECMSAssociateConverter {

	List<ProjectServicesData> convertAssociateServices(List<ProjectServices> associateServiceList);

}
