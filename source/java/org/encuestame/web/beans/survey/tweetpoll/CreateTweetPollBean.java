/*
 ************************************************************************************
 * Copyright (C) 2001-2010 encuestame: system online surveys Copyright (C) 2010
 * encuestame Development Team.
 * Licensed under the Apache Software License version 2.0
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to  in writing,  software  distributed
 * under the License is distributed  on  an  "AS IS"  BASIS,  WITHOUT  WARRANTIES  OR
 * CONDITIONS OF ANY KIND, either  express  or  implied.  See  the  License  for  the
 * specific language governing permissions and limitations under the License.
 ************************************************************************************
 */

package org.encuestame.web.beans.survey.tweetpoll;

import org.encuestame.web.beans.MasterBean;

/**
 * Create Tweet Poll.
 * @author Picado, Juan juan@encuestame.org
 * @since Feb 13, 2010 11:36:48 PM
 * @version $Id: $
 */
public class CreateTweetPollBean extends MasterBean {


    private String tweetQuestion;

    /**
     * Constructor.
     */
    public CreateTweetPollBean() {
    }

    /**
     * @return the tweetQuestion
     */
    public String getTweetQuestion() {
        return tweetQuestion;
    }

    /**
     * @param tweetQuestion the tweetQuestion to set
     */
    public void setTweetQuestion(final String tweetQuestion) {
        this.tweetQuestion = tweetQuestion;
    }
}
