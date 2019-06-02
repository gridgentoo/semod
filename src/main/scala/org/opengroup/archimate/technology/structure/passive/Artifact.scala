package org.opengroup.archimate.technology.structure.passive

import org.opengroup.archimate.IdGenerator
import org.opengroup.archimate.element.{PassiveStructureElement, StrategyCoreStructureBehaviorElement, StrategyCoreStructureBehaviorElementRelationships}
import org.opengroup.archimate.layer.Technology

case class Artifact(
	name: String,
	desc: String = ""
) extends Technology
	with PassiveStructureElement
	with StrategyCoreStructureBehaviorElement {
	val id: String = IdGenerator.technology.artifact

	object rel extends StrategyCoreStructureBehaviorElementRelationships[Artifact] {
		private[archimate] implicit val tt: Artifact = Artifact.this
	}

}
