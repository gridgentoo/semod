package org.opengroup.archimate.relationships.dynamic

import org.opengroup.archimate.element.Element
import org.opengroup.archimate.relationships.DynamicRelationship

case class Triggering(
	src: Element,
	dst: Element,
	direct: Boolean = true
) extends DynamicRelationship {
	override def reverse = Triggering(dst, src, direct = false)
}
