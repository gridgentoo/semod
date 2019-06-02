package org.opengroup.archimate.technology.structure.active

import org.opengroup.archimate.IdGenerator
import org.opengroup.archimate.element.{ActiveStructureElement, StrategyCoreStructureBehaviorElement, StrategyCoreStructureBehaviorElementRelationships}
import org.opengroup.archimate.layer.{Technology, TechnologyNodeElement}

case class Path(
	name: String,
	desc: String = ""
) extends Technology
	with ActiveStructureElement
	with StrategyCoreStructureBehaviorElement {
	val id: String = IdGenerator.technology.path

	object rel extends StrategyCoreStructureBehaviorElementRelationships[Path] {
		private[archimate] implicit val tt: Path = Path.this

		def associatedWith(dst: TechnologyNodeElement): Path = tt._rel.associatedWith(dst)
		def aggregates(dst: TechnologyNodeElement): Path = tt._rel.aggregates(dst)
	}

}
