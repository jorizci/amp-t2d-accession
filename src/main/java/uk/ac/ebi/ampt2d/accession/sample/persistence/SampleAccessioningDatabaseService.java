/*
 *
 * Copyright 2018 EMBL - European Bioinformatics Institute
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package uk.ac.ebi.ampt2d.accession.sample.persistence;

import uk.ac.ebi.ampt2d.accession.sample.SampleModel;
import uk.ac.ebi.ampt2d.accessioning.commons.accessioning.AccessioningRepository;
import uk.ac.ebi.ampt2d.accessioning.commons.persistence.BasicSpringDataRepositoryDatabaseService;

public class SampleAccessioningDatabaseService extends BasicSpringDataRepositoryDatabaseService<SampleModel, SampleEntity, String,
        String> {


    public SampleAccessioningDatabaseService(AccessioningRepository<SampleEntity, String, String> repository) {
        super(repository, new SampleModelToEntityFunction(), sampleEntity -> sampleEntity.getAccession(),
                sampleEntity -> sampleEntity.getHashedMessage());
    }
}
