// Autogenerated from KST: please remove this line if doing any edits by hand!

using NUnit.Framework;

namespace Kaitai
{
    [TestFixture]
    public class SpecValidFailRepeatEqInt : CommonSpec
    {
        [Test]
        public void TestValidFailRepeatEqInt()
        {
            Assert.Throws<ValidationNotEqualError>(
                delegate
                {
                    ValidFailRepeatEqInt.FromFile(SourceFile("bcd_user_type_be.bin"));
                }
            );
        }
    }
}
