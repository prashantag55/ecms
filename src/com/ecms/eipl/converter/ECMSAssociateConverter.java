package com.ecms.eipl.converter;

import java.util.List;

import com.ecms.eipl.data.AssociatesData;
import com.ecms.eipl.data.ProjectAssociatePaymentData;
import com.ecms.eipl.data.ProjectServicesData;
import com.ecms.eipl.entity.Associates;
import com.ecms.eipl.entity.ProjectAssociatePayment;
import com.ecms.eipl.entity.ProjectServices;

public interface ECMSAssociateConverter {

	List<ProjectServicesData> convertAssociateServices(List<ProjectServices> associateServiceList);

	List<ProjectAssociatePaymentData> convertAssociatePaymentList(
			List<ProjectAssociatePayment> projectAssociatePaymentList);

	List<AssociatesData> convertAllAssociates(List<Associates> associatesList);

}
