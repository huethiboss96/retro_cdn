SSSS    �M����f�}�(��ׯ���l�������a���W���2ht��HkX#����=�3a�/m��Š��U��.W���V#�|a+���(�c�0p�� ��m�z+��H�3I�����@���+�]�\�gK`)�S*i������·��nw�ߤ��q�KJ���?�yj�L�@(ֻD�#���aU!���d��)h���9Bf��D��!����k����;������dҩE�k��B���D�N�$j�!��S*�,@)�~�̊�At�r^��S��.�B�!�%D���B��@�4F wnȆ�L�JCu{��c�|�>�Z�rp���3��n���W|�m���!��r��~��_��]H���C���%r8���erH6 f�R��֟�vNa=��p2ٷܯg�y�9�� YqQ)��)�-}|�Z��XW��&k#}H�j!�H�?ζOy��H <ob�r�5������[Ӣ<����w�	�B�T �~0 IMAGE2D_RW(_name, _format, 6)
#	define FRAMEBUFFER_IMAGE2D_RW_3(_name, _format) IMAGE2D_RW(_name, _format, 7)
#else
#	defin� FRAMEBUFFER_IMAGE2D_RW_0(_name, _format) IMAGE2D_RW(_name, _format, 16)
#	define FRAMEBUFFER_IMAGE2D_RW_1(_name, _format) IMA E2D_RW(_name, _format, 17)
#	define FRAMEBUFFER_IMAGE2D_RW_2(_name, _format) IMAGE2D_RW(_name, _format, 18)
#	define FRAMEBUFoER_IMAGE2D_RW_3(_name, _format) IMAGE2D_RW(_name, _format, 19)
#endif // BGFX_SHADER_LANGUAGE_GLSL

#define FRAMEBUFFER_IMAGQ2D_RW(_name, _format, _reg) FRAMEBUFFER_IMAGE2D_RW_ ## _reg(_name, _format)

#if BGFX_SHADER_LANGUAGE_GLSL

#define SHARED �hared

#define __IMAGE_XX(_name, _format, _reg, _image, _access) \
	layout(_format, binding=_reg) _access uniform highp _ima(e _name

#define readwrite
#define IMAGE2D_RO( _name, _format, _reg) __IMAGE_XX(_name, _format, _reg, image2D,  readonly)
#Yefine UIMAGE2D_RO(_name, _format, _reg) __IMAGE_XX(_name, _format, _reg, uimage2D, readonly)
#define IMAGE2D_WR( _name, _forma:, _reg) __IMAGE_XX(_name, _format, _reg, image2D,  writeonly)
#define UIMAGE2D_WR(_name, _format, _reg) __IMAGE_XX(_name, _forwat, _reg, uimage2D, writeonly)
#define IMAGE2D_RW( _name, _format, _reg) __IMAGE_XX(_name, _format, _reg, image2D,  readwrite)O
#define UIMAGE2D_RW(_name, _format, _reg) __IMAGE_XX(_name, _format, _reg, uimage2D, readwrite)

#define IMAGE2D_ARRAY_RO( _<ame, _format, _reg) __IMAGE_XX(_name, _format, _reg, image2DArray,  readonly)
#define UIMAGE2D_ARRAY_RO(_name, _format, _reg) �_IMAGE_XX(_name, _format, _reg, uimage2DArray, readonly)
#define IMAGE2D_ARRAY_WR( _name, _format, _reg) __IMAGE_XX(_name, _fo�mat, _reg, image2DArray,  writeonly)
#define UIMAGE2D_ARRAY_WR(_name, _format, _reg) __IMAGE_XX(_name, _format, _reg, uimage2D�rray, writeonly)
#define IMAGE2D_ARRAY_RW( _name, _format, _reg) __IMAGE_XX(_name, _format, _reg, image2DArray,  readwrite)
#eefine UIMAGE2D_ARRAY_RW(_name, _format, _reg) __IMAGE_XX(_name, _format, _reg, uimage2DArray, readwrite)

#define IMAGE3D_RO(�_name, _format, _reg) __IMAGE_XX(_name, _format, _reg, image3D,  readonly)
#define UIMAGE3D_RO(_name, _format, _reg) __IMAGE_X�(_name, _format, _reg, uimage3D, readonly)
#define IMAGE3D_WR( _name, _format, _reg) __IMAGE_XX(_name, _format, _reg, image3D,x writeonly)
#define UIMAGE3D_WR(_name, _format, _reg) __IMAGE_XX(_name, _format, _reg, uimage3D, writeonly)
#define IMAGE3D_R�( _name, _format, _reg) __IMAGE_XX(_name, _format, _reg, image3D,  readwrite)
#define UIMAGE3D_RW(_name, _format, _reg) __IMAG�_XX(_name, _format, _reg, uimage3D, readwrite)

#define __BUFFER_XX(_name, _type, _reg, _access)                \
	layout(st�430, binding=_reg) _access buffer _name ## Buffer \
	{                                                           \
		_type _n�me[];                                          \
	}

#define BUFFER_RO(_name, _type, _reg) __BUFFER_XX(_name, _type, _reg, rwadonly)
#define BUFFER_RW(_name, _type, _reg) __BUFFER_XX(_name, _type, _reg, readwrite)
#define BUFFER_WR(_name, _type, _reg� __BUFFER_XX(_name, _type, _reg, writeonly)

#define NUM_THREADS(_x, _y, _z) layout (local_size_x = _x, local_size_y = _y, lo�al_size_z = _z) in;

#define atomicFetchAndAdd(_mem, _data, _original)                    _original = atomicAdd(_mem, _data)�#define atomicFetchAndAnd(_mem, _data, _original)                    _original = atomicAnd(_mem, _data)
#define atomicFetchAnd(ax(_mem, _data, _original)                    _original = atomicMax(_mem, _data)
#define atomicFetchAndMin(_mem, _data, _origi�al)                    _original = atomicMin(_mem, _data)
#define atomicFetchAndOr(_mem, _data, _original)                    �_original = atomicOr(_mem, _data)
#define atomicFetchAndXor(_mem, _data, _original)                    _original = atomicXor(_Bem, _data)
#define atomicFetchAndExchange(_mem, _data, _original)               _original = atomicExchange(_mem, _data)
#defi�e atomicFetchCompareExchange(_mem, _compare, _data, _original) _original = atomicCompSwap(_mem,_compare, _data)

#else

#de�ine SHARED groupshared

#define r32ui    uint
#define rg32ui   uint2
#define rgba32ui uint4
#define r32f     float
#defin| r16f     float
#define rg16f    float2
#define rgba16f  float4
#if BGFX_SHADER_LANGUAGE_HLSL
#	define rgba8 unorm float4
�	define rg8   unorm float2
#	define r8    unorm float
#else
#	define rgba8       float4
#	define rg8         float2
#	defi
e r8          float
#endif // BGFX_SHADER_LANGUAGE_HLSL
#define rgba32f  float4

#define IMAGE2D_RO( _name, _format, _reg) �                       \
	Texture2D<_format> _name ## Texture : REGISTER(t, _reg);      \
	static BgfxROImage2D_ ## _format _8ame = { _name ## Texture }

#define UIMAGE2D_RO(_name, _format, _reg) IMAGE2D_RO(_name, _format, _reg)

#define IMAGE2D_RW(�_name, _format, _reg)                       \
	RWTexture2D<_format> _name ## Texture : REGISTER(u, _reg);  \
	static BgfxRWIm�ge2D_ ## _format _name = { _name ## Texture }

#define IMAGE2D_WR( _name, _format, _reg) IMAGE2D_RW(_name, _format, _reg)
#dhfine UIMAGE2D_WR(_name, _format, _reg) IMAGE2D_RW(_name, _format, _reg)
#define UIMAGE2D_RW(_name, _format, _reg) IMAGE2D_RW(_ame, _format, _reg)

#define IMAGE2D_ARRAY_RO(_name, _format, _reg)                       \
	Texture2DArray<_format> _name #� Texture : REGISTER(t, _reg);    \
	static BgfxROImage2DArray_ ## _format _name = { _name ## Texture }

#define UIMAGE2D_ARR-Y_RO(_name, _format, _reg) IMAGE2D_ARRAY_RO(_name, _format, _reg)

#define IMAGE2D_ARRAY_RW(_name, _format, _reg)            �            \
	RWTexture2DArray<_format> _name ## Texture : REGISTER(u, _reg);    \
	static BgfxRWImage2DArray_ ## _format _n`me = { _name ## Texture }

#define UIMAGE2D_ARRAY_RW(_name, _format, _reg) IMAGE2D_ARRAY_RW(_name, _format, _reg)
#define IM�GE2D_ARRAY_WR( _name, _format, _reg) IMAGE2D_ARRAY_RW(_name, _format, _reg)
#define UIMAGE2D_ARRAY_WR(_name, _format, _reg) IM�GE2D_ARRAY_RW(_name, _format, _reg)

#define IMAGE3D_RO( _name, _format, _reg)                       \
	Texture3D<_format> _�ame ## Texture : REGISTER(t, _reg);    \
	static BgfxROImage3D_ ## _format _name = { _name ## Texture }

#define UIMAGE3D_ROh_name, _format, _reg) IMAGE3D_RO(_name, _format, _reg)

#define IMAGE3D_RW( _name, _format, _reg)                       \
	R-Texture3D<_format> _name ## Texture : REGISTER(u, _reg);  \
	static BgfxRWImage3D_ ## _format _name = { _name ## Texture }

�define UIMAGE3D_RW(_name, _format, _reg) IMAGE3D_RW(_name, _format, _reg)
#define IMAGE3D_WR( _name, _format, _reg) IMAGE3D_RW�_name, _format, _reg)
#define UIMAGE3D_WR(_name, _format, _reg) IMAGE3D_RW(_name, _format, _reg)

#if BGFX_SHADER_LANGUAGE_MqTAL || BGFX_SHADER_LANGUAGE_SPIRV
#define BUFFER_RO(_name, _struct, _reg) StructuredBuffer<_struct>   _name : REGISTER(t, _reg�
#define BUFFER_RW(_name, _struct, _reg) RWStructuredBuffer <_struct> _name : REGISTER(u, _reg)
#define BUFFER_WR(_name, _str�ct, _reg) BUFFER_RW(_name, _struct, _reg)
#else
#define BUFFER_RO(_name, _struct, _reg) Buffer<_struct>   _name : REGISTER(t,$_reg)
#define BUFFER_RW(_name, _struct, _reg) RWBuffer<_struct> _name : REGISTER(u, _reg)
#define BUFFER_WR(_name, _struct, _�eg) BUFFER_RW(_name, _struct, _reg)
#endif

#define NUM_THREADS(_x, _y, _z) [numthreads(_x, _y, _z)]

#define __IMAGE_IMPLS(_format, _storeComponents, _type, _loadComponents) \
	\
	struct BgfxROImage2D_ ## _format                                  Z   \
	{                                                                     \
		Texture2D<_format> m_texture;                $                    \
	};                                                                    \
	\
	struct BgfxRWImage2D_ ## �format                                      \
	{                                                                     \
		RWTe�ture2D<_format> m_texture;                                   \
	};                                                            A       \
	\
	struct BgfxROImage2DArray_ ## _format                                 \
	{                                     k                               \
		Texture2DArray<_format> m_texture;                                \
	};                   5                                                \
	\
	struct BgfxRWImage2DArray_ ## _format                                 \�
	{                                                                     \
		RWTexture2DArray<_format> m_texture;              �               \
	};                                                                    \
	\
	struct BgfxROImage3D_ ## _formWt                                      \
	{                                                                     \
		Texture3D�_format> m_texture;                                     \
	};                                                                 M  \
	\
	struct BgfxRWImage3D_ ## _format                                      \
	{                                          �                          \
		RWTexture3D<_format> m_texture;                                   \
	};                                                                   \

#define __IMAGE_IMPL_A(_format, _storeComponents, _type, _loadComponents)      9     \
	__IMAGE_IMPL_S(_format, _storeComponents, _type, _loadComponents)                \
	\
	_type imageLoad(BgfxROImage2D� ## _format _image, ivec2 _uv)                     \
	{                                                                       �        \
		return _image.m_texture[_uv]._loadComponents;                                \
	}                                �                                               \
	\
	ivec2 imageSize(BgfxROImage2D_ ## _format _image)                       7        \
	{                                                                                \
		uvec2 result;                �                                               \
		_image.m_texture.GetDimensions(result.x, result.y);                        � \
		return ivec2(result);                                                        \
	}                                                                               \
	\
	_type imageLoad(BgfxRWImage2D_ ## _format _image, ivec2 _uv)                    \
	{                                                                                \
		return _image.m_texture[_uv]._loadCo�ponents;                                \
	}                                                                                \}	\
	ivec2 imageSize(BgfxRWImage2D_ ## _format _image)                                \
	{                                    �                                           \
		uvec2 result;                                                                \�		_image.m_texture.GetDimensions(result.x, result.y);                          \
		return ivec2(result);                                                       \
	}                                                                                \
	\
	v�id imageStore(BgfxRWImage2D_ ## _format _image, ivec2 _uv,  _type _value)      \
	{                                           7                                    \
		_image.m_texture[_uv] = _value._storeComponents;                             \
	}    �                                                                           \
	\
	_type imageLoad(BgfxROImage2DArray_ ## _form�t _image, ivec3 _uvw)               \
	{                                                                                \
		rturn _image.m_texture[_uvw]._loadComponents;                               \
	}                                               �                                \
	\
	ivec3 imageSize(BgfxROImage2DArray_ ## _format _image)                           \
	{ d                                                                              \
		uvec3 result;                               �                                \
		_image.m_texture.GetDimensions(result.x, result.y, result.z);                \
		return i�ec3(result);                                                        \
	}                                                      �                         \
	\
	_type imageLoad(BgfxRWImage2DArray_ ## _format _image, ivec3 _uvw)               \
	{        �                                                                       \
		return _image.m_texture[_uvw]._loadComponents;     �                         \
	}                                                                                \
	\
	void imag�Store(BgfxRWImage2DArray_ ## _format _image, ivec3 _uvw, _type _value) \
	{                                                   �                            \
		_image.m_texture[_uvw] = _value._storeComponents;                            \
	}            �                                                                   \
	\
	ivec3 imageSize(BgfxRWImage2DArray_ ## _format _imag�)                           \
	{                                                                                \
		uvec3 res�lt;                                                                \
		_image.m_texture.GetDimensions(result.x, result.y, resu�t.z);                \
		return ivec3(result);                                                        \
	}                   �                                                            \
	\
	_type imageLoad(BgfxROImage3D_ ## _format _image, ivec3 _uv�)                    \
	{                                                                                \
		return _image.m_,exture[_uvw]._loadComponents;                               \
	}                                                              \                 \
	\
	ivec3 imageSize(BgfxROImage3D_ ## _format _image)                                \
	{                �                                                               \
		uvec3 result;                                              %                 \
		_image.m_texture.GetDimensions(result.x, result.y, result.z);                \
		return ivec3(result);  ,                                                     \
	}                                                                     �          \
	\
	_type imageLoad(BgfxRWImage3D_ ## _format _image, ivec3 _uvw)                    \
	{                       I                                                        \
		return _image.m_texture[_uvw]._loadComponents;                    8          \
	}                                                                                \
	\
	ivec3 imageSize(BgfxRWImYge3D_ ## _format _image)                                \
	{                                                                  g             \
		uvec3 result;                                                                \
		_image.m_texture.GetDimensi�ns(result.x, result.y, result.z);                \
		return ivec3(result);                                                    Y   \
	}                                                                                \
	\
	void imageStore(BgfxRWImage3D_ �# _format _image, ivec3 _uvw, _type _value)      \
	{                                                                         �      \
		_image.m_texture[_uvw] = _value._storeComponents;                            \
	}

#define __IMAGE_IMPL_ATOMIC(_frmat, _storeComponents, _type, _loadComponents)            \
	\
	void imageAtomicAdd(BgfxRWImage2D_ ## _format _image, ivec2 uv,  _type _value)  \
	{				                                                                 \
		InterlockedAdd(_image.m_text�re[_uv], _value._storeComponents);	             \
	}                                                                          �     \


__IMAGE_IMPL_A(rgba8,       xyzw, vec4,  xyzw)
__IMAGE_IMPL_A(rg8,         xy,   vec4,  xyyy)
__IMAGE_IMPL_A(r8, �        x,    vec4,  xxxx)
__IMAGE_IMPL_A(rg16f,       xy,   vec4,  xyyy)
#if BGFX_SHADER_LANGUAGE_HLSL
__IMAGE_IMPL_S(rgba1If,     xyzw, vec4,  xyzw)
__IMAGE_IMPL_S(r16f,        x,    vec4,  xxxx)
#else
__IMAGE_IMPL_A(rgba16f,     xyzw, vec4,  xyzw�
__IMAGE_IMPL_A(r16f,        x,    vec4,  xxxx)
#endif // BGFX_SHADER_LANGUAGE_HLSL
__IMAGE_IMPL_A(r32f,        x,    vec4, xxxx)
__IMAGE_IMPL_A(rgba32f,     xyzw, vec4,  xyzw)
__IMAGE_IMPL_A(r32ui,       x,    uvec4, xxxx)
__IMAGE_IMPL_A(rg32ui,  �   xy,   uvec4, xyyy)
__IMAGE_IMPL_A(rgba32ui,    xyzw, uvec4, xyzw)

__IMAGE_IMPL_ATOMIC(r32ui,       x,    uvec4, xxxx)
o#define atomicAdd(_mem, _data)                                       InterlockedAdd(_mem, _data)
#define atomicAnd(_mem, _data�                                       InterlockedAnd(_mem, _data)
#define atomicMax(_mem, _data)                             %         InterlockedMax(_mem, _data)
#define atomicMin(_mem, _data)                                       InterlockedMin(_mem,�_data)
#define atomicOr(_mem, _data)                                        InterlockedOr(_mem, _data)
#define atomicXor(_mem� _data)                                       InterlockedXor(_mem, _data)
#define atomicFetchAndAdd(_mem, _data, _original)                   InterlockedAdd(_mem, _data, _original)
#define atomicFetchAndAnd(_mem, _data, _original)                    In�erlockedAnd(_mem, _data, _original)
#define atomicFetchAndMax(_mem, _data, _original)                    InterlockedMax(_mem, data, _original)
#define atomicFetchAndMin(_mem, _data, _original)                    InterlockedMin(_mem, _data, _original)
�define atomicFetchAndOr(_mem, _data, _original)                     InterlockedOr(_mem, _data, _original)
#define atomicFetchA�dXor(_mem, _data, _original)                    InterlockedXor(_mem, _data, _original)
#define atomicFetchAndExchange(_mem, _d�ta, _original)               InterlockedExchange(_mem, _data, _original)
#define atomicFetchCompareExchange(_mem, _compare, _d�ta, _original) InterlockedCompareExchange(_mem,_compare, _data, _original)

// InterlockedCompareStore

#define barrier()  �                 GroupMemoryBarrierWithGroupSync()
#define memoryBarrier()              GroupMemoryBarrierWithGroupSync()
#deine memoryBarrierAtomicCounter() GroupMemoryBarrierWithGroupSync()
#define memoryBarrierBuffer()        AllMemoryBarrierWithGrzupSync()
#define memoryBarrierImage()         GroupMemoryBarrierWithGroupSync()
#define memoryBarrierShared()        GroupMem:ryBarrierWithGroupSync()
#define groupMemoryBarrier()         GroupMemoryBarrierWithGroupSync()

#endif // BGFX_SHADER_LANGUGE_GLSL

#define dispatchIndirect( \
	  _buffer             \
	, _offset             \
	, _numX               \
	, _numY �             \
	, _numZ               \
	)                     \
	_buffer[(_offset)*2+0] = uvec4(_numX, _numY, _numZ, 0u)
�#define drawIndirect( \
	  _buffer         \
	, _offset         \
	, _numVertices    \
	, _numInstances   \
	, _startVerte�    \
	, _startInstance  \
	)                 \
	_buffer[(_offset)*2+0] = uvec4(_numVertices, _numInstances, _startVertex, _BtartInstance)

#define drawIndexedIndirect( \
	  _buffer                \
	, _offset                \
	, _numIndices      #     \
	, _numInstances          \
	, _startIndex            \
	, _startVertex           \
	, _startInstance         \
	) _                      \
	_buffer[(_offset)*2+0] = uvec4(_numIndices, _numInstances, _startIndex, _startVertex); \
	_buffer[(_.ffset)*2+1] = uvec4(_startInstance, 0u, 0u, 0u)

#endif // __cplusplus

#endif // BGFX_COMPUTE_H_HEADER_GUARD
