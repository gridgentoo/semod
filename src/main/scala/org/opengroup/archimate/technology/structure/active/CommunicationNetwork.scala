package org.opengroup.archimate.technology.structure.active

import org.opengroup.archimate.element.ActiveStructureElement
import org.opengroup.archimate.layer.Technology

case class CommunicationNetwork(
	id: String = "",
	name: String = "",
	desc: String = ""
) extends Technology with ActiveStructureElement {

}
