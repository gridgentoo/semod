package ru.kvb74.semod.opengroup.archimate.physical

import ru.kvb74.semod.opengroup.archimate.meta.element.physical.{DistributionNetworkElement, DistributionNetworkElementRelationships}
import ru.kvb74.semod.opengroup.archimate.meta.layer.PhysicalLayer

case class DistributionNetwork(
	name: String,
	desc: String = ""
) extends PhysicalLayer
	with DistributionNetworkElement {

	case class DistributionNetworkRelationships(
		override private[semod] implicit val tt: DistributionNetwork = DistributionNetwork.this
	) extends DistributionNetworkElementRelationships[DistributionNetwork]

	val rel: DistributionNetworkRelationships = DistributionNetworkRelationships()

	_registerPrefix("PDN")
}