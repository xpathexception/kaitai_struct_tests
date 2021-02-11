// Autogenerated from KST: please remove this line if doing any edits by hand!

using NUnit.Framework;

namespace Kaitai
{
    [TestFixture]
    public class SpecBitsSignedB64Le : CommonSpec
    {
        [Test]
        public void TestBitsSignedB64Le()
        {
            var r = BitsSignedB64Le.FromFile(SourceFile("bits_signed_b64_le.bin"));

            Assert.AreEqual(r.ANum, 0);
            Assert.AreEqual(r.ABit, true);
            Assert.AreEqual(r.BNum, 9223372036854775807);
            Assert.AreEqual(r.BBit, false);
        }
    }
}