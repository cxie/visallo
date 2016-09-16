define(['../actions'], function(actions) {
    actions.protectFromWorker();

    return actions.createActions({
        workerImpl: 'data/web-worker/store/product/actions-impl',
        actions: {
            list: null,
            get: (productId) => ({ productId }),
            create: (title, kind, params) => ({ title, kind, params }),
            select: (productId) => ({ productId }),
            delete: (productId) => ({ productId })
        }
    })
})
