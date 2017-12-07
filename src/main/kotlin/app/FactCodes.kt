// Copyright 2017 Sourcerer Inc. All Rights Reserved.
// Author: Anatoly Kislov (anatoly@sourcerer.io)

package app

object FactCodes {
    val COMMIT_DAY_WEEK = 1  // Day of week fun fact and graph.
    val COMMIT_DAY_TIME = 2  // Day time fun fact.

    val COMMIT_LINE_NUM_AVG = 8  // Average number of lines per commit fun fact.
    val COMMIT_NUM = 9  // Used for averaging COMMIT_LINE_NUM_AVG between repos.
    // A map of line numbers to commits number. Used in a commit histogram.
    val COMMIT_NUM_TO_LINE_NUM = 12
    val LINE_LONGEVITY = 3  // Used for longevity graph.
    val LINE_LONGEVITY_REPO = 4  // Used for longevity graph.
    val LINE_LEN_AVG = 10  // Average length of line fun fact.
    val LINE_NUM = 11  // Used for averaging LINE_LEN_AVG between repos.
    val REPO_DATE_START = 5  // Repo summary info. Date of first contribution.
    val REPO_DATE_END = 6  // Repo summary info. Date of last contribution.
    val REPO_TEAM_SIZE = 7  // Repo summary info. Number of contributors.
    val VARIABLE_NAMING = 13 // Variables naming fun fact.
}
