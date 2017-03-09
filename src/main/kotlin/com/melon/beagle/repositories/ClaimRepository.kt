package com.melon.beagle.repositories

import com.melon.beagle.entities.Claim
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "claim", path = "claim")
interface ClaimRepository : PagingAndSortingRepository<Claim, Long>
