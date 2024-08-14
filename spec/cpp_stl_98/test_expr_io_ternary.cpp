// Autogenerated from KST: please remove this line if doing any edits by hand!

#include <boost/test/unit_test.hpp>
#include "expr_io_ternary.h"
#include <iostream>
#include <fstream>
#include <vector>

BOOST_AUTO_TEST_CASE(test_expr_io_ternary) {
    std::ifstream ifs("src/if_struct.bin", std::ifstream::binary);
    kaitai::kstream ks(&ifs);
    expr_io_ternary_t* r = new expr_io_ternary_t(&ks);

    BOOST_CHECK_EQUAL(r->one_or_two_io_size1(), 8);
    BOOST_CHECK_EQUAL(r->one_or_two_io_size2(), 8);
    BOOST_CHECK_EQUAL(r->one_or_two_io_size_add_3(), 11);

    delete r;
}
