// Autogenerated from KST: please remove this line if doing any edits by hand!

using NUnit.Framework;

namespace Kaitai
{
    [TestFixture]
    public class SpecStrPadTermUtf16 : CommonSpec
    {
        [Test]
        public void TestStrPadTermUtf16()
        {
            var r = StrPadTermUtf16.FromFile(SourceFile("str_pad_term_utf16.bin"));

            Assert.AreEqual(r.StrTerm, "a\u0200b");
            Assert.AreEqual(r.StrTermInclude, "c\u0200d\0");
            Assert.AreEqual(r.StrTermAndPad, "e\u0200f");
        }
    }
}
