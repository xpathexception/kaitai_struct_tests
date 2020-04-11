// Autogenerated from KST: please remove this line if doing any edits by hand!

#include <boost/test/unit_test.hpp>
#include "params_pass_array_int.h"
#include <iostream>
#include <fstream>
#include <vector>

BOOST_AUTO_TEST_CASE(test_params_pass_array_int) {
    std::ifstream ifs("src/position_to_end.bin", std::ifstream::binary);
    kaitai::kstream ks(&ifs);
    params_pass_array_int_t* r = new params_pass_array_int_t(&ks);

    BOOST_CHECK_EQUAL(r->pass_ints()->nums()->size(), 3);
    BOOST_CHECK_EQUAL(r->pass_ints()->nums()->at(0), 513);
    BOOST_CHECK_EQUAL(r->pass_ints()->nums()->at(1), 1027);
    BOOST_CHECK_EQUAL(r->pass_ints()->nums()->at(2), 1541);
    BOOST_CHECK_EQUAL(r->pass_ints_calc()->nums()->size(), 2);
    BOOST_CHECK_EQUAL(r->pass_ints_calc()->nums()->at(0), 27643);
    BOOST_CHECK_EQUAL(r->pass_ints_calc()->nums()->at(1), 7);

    delete r;
}