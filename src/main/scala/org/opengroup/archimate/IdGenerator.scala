package org.opengroup.archimate

import scala.collection.mutable

object IdGenerator {

	private val _ids = mutable.HashMap.empty[String, Long]

	private def _next(key: String, prefix: String): String = {
		val _id = _ids.getOrElse(key, 0L) + 1L
		_ids.put(key, _id)
		s"${prefix}_${_id}"
	}

	object motivation {
		def assessment: String = _next("motivation.assessment", "MA")

		def constraint: String = _next("motivation.constraint", "MC")

		def driver: String = _next("motivation.driver", "MD")

		def goal: String = _next("motivation.goal", "MG")

		def meaning: String = _next("motivation.meaning", "MM")

		def outcome: String = _next("motivation.outcome", "MO")

		def principle: String = _next("motivation.principle", "MP")

		def requirement: String = _next("motivation.requirement", "MR")

		def stakeholder: String = _next("motivation.stakeholder", "MS")

		def value: String = _next("motivation.value", "MV")
	}

	object strategy {
		def capability: String = _next("strategy.capability", "SC")

		def courseOfAction: String = _next("strategy.courseOfAction", "SCOA")

		def resource: String = _next("strategy.resource", "SR")
	}

	object physical {

	}

	object relationships {

	}

	object application {

	}

	object business {
		def contract: String = _next("business.contract", "BCn")

		def businessObject: String = _next("business.businessObject", "BO")

		def businessRole: String = _next("business.businessRole", "BR")

		def businessInterface: String = _next("business.businessInterface", "BIf")

		def businessCollaboration: String = _next("business.businessCollaboration", "BC")

		def businessActor: String = _next("business.businessActor", "BA")

		def product: String = _next("business.product", "BPr")

		def businessProcess: String = _next("business.businessProcess", "BP")

		def businessInteraction: String = _next("business.businessInteraction", "BI")

		def businessFunction: String = _next("business.businessFunction", "BF")

		def businessEvent: String = _next("business.businessEvent", "BE")

		def businessService: String = _next("business.businessService", "BS")

		def representation: String = _next("business.representation", "BRep")

	}

	object implementation {

	}


}
