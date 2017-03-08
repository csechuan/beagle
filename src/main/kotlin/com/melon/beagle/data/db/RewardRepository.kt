package com.melon.beagle.data.db

import com.melon.beagle.core.entity.Reward
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "reward", path = "reward")
interface RewardRepository : PagingAndSortingRepository<Reward, Long>
