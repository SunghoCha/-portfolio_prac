import { createStore } from 'vuex';
import createPersistedState from 'vuex-persistedstate';

import itemModule from './modules/items/index.js';

const store = createStore({
    modules: {
        items: itemModule,
    },
    plugins: [createPersistedState({
        paths: ['items']
    })]
});

export default store;