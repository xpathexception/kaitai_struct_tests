// Autogenerated from KST: please remove this line if doing any edits by hand!

package spec

import (
	"runtime/debug"
	"os"
	"testing"
	"github.com/kaitai-io/kaitai_struct_go_runtime/kaitai"
	. "test_formats"
	"github.com/stretchr/testify/assert"
)

func TestDefaultEndianExprIsBe(t *testing.T) {
	defer func() {
		if r := recover(); r != nil {
			debug.PrintStack()
			t.Fatal("unexpected panic:", r)
		}
	}()
	f, err := os.Open("../../src/endian_expr.bin")
	if err != nil {
		t.Fatal(err)
	}
	s := kaitai.NewStream(f)
	var r DefaultEndianExprIsBe
	err = r.Read(s, &r, &r)
	if err != nil {
		t.Fatal(err)
	}

	assert.EqualValues(t, []uint8{73, 73}, r.Docs[0].Indicator)
	assert.EqualValues(t, 66, r.Docs[0].Main.SomeInt)
	assert.EqualValues(t, 66, r.Docs[0].Main.SomeIntBe)
	assert.EqualValues(t, 66, r.Docs[0].Main.SomeIntLe)
	tmp1, err := r.Docs[0].Main.InstInt()
	if err != nil {
		t.Fatal(err)
	}
	assert.EqualValues(t, 66, tmp1)
	tmp2, err := r.Docs[0].Main.InstSub()
	if err != nil {
		t.Fatal(err)
	}
	assert.EqualValues(t, 66, tmp2.Foo)
	assert.EqualValues(t, []uint8{77, 77}, r.Docs[1].Indicator)
	assert.EqualValues(t, 66, r.Docs[1].Main.SomeInt)
	assert.EqualValues(t, 66, r.Docs[1].Main.SomeIntBe)
	assert.EqualValues(t, 66, r.Docs[1].Main.SomeIntLe)
	tmp3, err := r.Docs[1].Main.InstInt()
	if err != nil {
		t.Fatal(err)
	}
	assert.EqualValues(t, 1107296256, tmp3)
	tmp4, err := r.Docs[1].Main.InstSub()
	if err != nil {
		t.Fatal(err)
	}
	assert.EqualValues(t, 1107296256, tmp4.Foo)
	assert.EqualValues(t, []uint8{88, 88}, r.Docs[2].Indicator)
	assert.EqualValues(t, 1107296256, r.Docs[2].Main.SomeInt)
	assert.EqualValues(t, 66, r.Docs[2].Main.SomeIntBe)
	assert.EqualValues(t, 66, r.Docs[2].Main.SomeIntLe)
	tmp5, err := r.Docs[2].Main.InstInt()
	if err != nil {
		t.Fatal(err)
	}
	assert.EqualValues(t, 66, tmp5)
	tmp6, err := r.Docs[2].Main.InstSub()
	if err != nil {
		t.Fatal(err)
	}
	assert.EqualValues(t, 66, tmp6.Foo)
}
