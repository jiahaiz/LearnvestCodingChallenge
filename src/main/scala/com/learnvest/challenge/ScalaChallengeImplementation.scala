package com.learnvest.challenge

import com.learnvest.challenge.input.{Collateral, Tranche}
import com.learnvest.challenge.output.Output

/**
  * Extend this trait and implement the method in your own code. We will be running tests against this method signature.
  * Lists of output objects should represent the same step in time. If there is no payment for a tranche in a specific time
  * step make sure to still output a value that include beginning and ending balance for the debt tranches or Zero for the
  * payment received for the equity tranche.
  */
trait ScalaChallengeImplementation {
  def modelCDO(tranches:List[Tranche], collateral: Collateral): Map[Tranche, List[Output]]
}
