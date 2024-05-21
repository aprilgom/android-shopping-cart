package woowacourse.shopping.domain.repository

import woowacourse.shopping.domain.model.PagingProduct
import woowacourse.shopping.domain.model.Product

interface ProductListRepository {
    fun findProductById(id: Int): Result<Product>

    fun getPagingProduct(
        page: Int,
        pageSize: Int,
    ): Result<PagingProduct>
}
