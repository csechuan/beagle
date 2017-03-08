package com.melon.beagle.data.db

import com.melon.beagle.core.entity.Claim
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "claim", path = "claim")
interface ClaimRepository : PagingAndSortingRepository<Claim, Long>
