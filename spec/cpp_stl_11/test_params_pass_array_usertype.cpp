// Autogenerated from KST: please remove this line if doing any edits by hand!

#include <boost/test/unit_test.hpp>
#include "params_pass_array_usertype.h"
#include <iostream>
#include <fstream>
#include <vector>

BOOST_AUTO_TEST_CASE(test_params_pass_array_usertype) {
    std::ifstream ifs("src/position_to_end.bin", std::ifstream::binary);
    kaitai::kstream ks(&ifs);
    params_pass_array_usertype_t* r = new params_pass_array_usertype_t(&ks);

    BOOST_CHECK_EQUAL(r->pass_blocks()->bar()->size(), 2);
    BOOST_CHECK_EQUAL(r->pass_blocks()->bar()->at(0)->foo(), 1);
    BOOST_CHECK_EQUAL(r->pass_blocks()->bar()->at(1)->foo(), 2);
    BOOST_CHECK_EQUAL(r->pass_blocks()->one(), std::string("\x03", 1));
    BOOST_CHECK_EQUAL(r->pass_blocks()->two(), std::string("\x04\x05", 2));

    delete r;
}