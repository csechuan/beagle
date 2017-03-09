package com.melon.beagle.repositories

import com.melon.beagle.entities.Reward
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "reward", path = "reward")
interface RewardRepository : PagingAndSortingRepository<Reward, Long>
