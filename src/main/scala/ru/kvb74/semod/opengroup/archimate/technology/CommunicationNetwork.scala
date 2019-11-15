package ru.kvb74.semod.opengroup.archimate.technology

import ru.kvb74.semod.opengroup.archimate.meta.element.technology.{CommunicationNetworkElement, CommunicationNetworkElementRelationships}
import ru.kvb74.semod.opengroup.archimate.meta.layer.TechnologyLayer

case class CommunicationNetwork(
	name: String,
	desc: String = ""
) extends TechnologyLayer
	with CommunicationNetworkElement {

	case class CommunicationNetworkRelationships(
		override private[semod] implicit val tt: CommunicationNetwork = CommunicationNetwork.this
	) extends CommunicationNetworkElementRelationships[CommunicationNetwork]

	val rel: CommunicationNetworkRelationships = CommunicationNetworkRelationships()

	_registerPrefix("TCN")
}