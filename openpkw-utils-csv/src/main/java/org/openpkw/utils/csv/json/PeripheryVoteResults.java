package org.openpkw.utils.csv.json;

import java.util.List;

public class PeripheryVoteResults {
    private String teritorialCode;
    private long peripheryNumber;
    private VotingCards votingCards;
    private CorrespondenceVoting correspondenceVoting;
    private List<Committee> committeesList;

    public String getTeritorialCode() {
        return teritorialCode;
    }

    public void setTeritorialCode(String teritorialCode) {
        this.teritorialCode = teritorialCode;
    }

    public long getPeripheryNumber() {
        return peripheryNumber;
    }

    public void setPeripheryNumber(long peripheryNumber) {
        this.peripheryNumber = peripheryNumber;
    }

    public VotingCards getVotingCards() {
        return votingCards;
    }

    public void setVotingCards(VotingCards votingCards) {
        this.votingCards = votingCards;
    }

    public CorrespondenceVoting getCorrespondenceVoting() {
        return correspondenceVoting;
    }

    public void setCorrespondenceVoting(CorrespondenceVoting correspondenceVoting) {
        this.correspondenceVoting = correspondenceVoting;
    }

    public List<Committee> getCommitteesList() {
        return committeesList;
    }

    public void setCommitteesList(List<Committee> committeesList) {
        this.committeesList = committeesList;
    }

}
