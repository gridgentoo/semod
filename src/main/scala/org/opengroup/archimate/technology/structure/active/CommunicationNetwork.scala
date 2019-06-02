package org.opengroup.archimate.technology.structure.active

import org.opengroup.archimate.IdGenerator
import org.opengroup.archimate.element.{ActiveStructureElement, StrategyCoreStructureBehaviorElement, StrategyCoreStructureBehaviorElementRelationships}
import org.opengroup.archimate.layer.Technology

case class CommunicationNetwork(
	name: String,
	desc: String = ""
) extends Technology
	with ActiveStructureElement
	with StrategyCoreStructureBehaviorElement {
	val id: String = IdGenerator.technology.communicationNetwork

	object rel extends StrategyCoreStructureBehaviorElementRelationships[CommunicationNetwork] {
		private[archimate] implicit val tt: CommunicationNetwork = CommunicationNetwork.this
	}

}
