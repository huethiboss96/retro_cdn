SSSS    �L&�D���Z��l`�������FS��Ώ��j��)�9��)�FX��b	P*����Z'C�Z�Կ����r��.Z��y�	#�U&>���� �j�9r��}ċ@�y=��H�1E��>�ՌG��+�R�)2�)<l�,Wp3Ѵ����΀��(�Ѭ��p�JA���#�sj���q�'� ���F|䋮w��>b���.Y�ڬl����/�e�H�Av_���#��˚��fƢ5�j��F��T�e�z*�ck�6ȴ~�Ej�-�ϒ�%Y�[uQ��f %�F�t��5-n޻�)��%�rhC:qfʊ��">wY�&�D�X�<�x�3cc�6��iΦ,l�FD��_b��I$��� ��+��L��m��Ju3U����4x��%r8���SI)Hk�%{�Կ��:k��K㦠�q�a�p���
fJ!��X�b
[�,��V��c)/l�nx�.�H��0x٤	Uq,kq�p	�Z�[�ٽ��p��,��7�D�p��M� G�X/j
,480.0)

void main()
{
    gl_Position = mul(u_viewProjMatrix , vec4(a_position.xyz,1.0));
    v_texcoord0 = a_texcoord0.x�;
    float size = 20.0;
    v_texcoord1 = vec2(pi * size * OutputSize.x, 2.0 * pi * TextureSize.y);
}
#endif

#ifdef FSM
/// input
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_TEXCOORD1
#include "../CoreData/Shaders/Library/Varying.glsl"#
/// Common (uniforms,samplers, transforms ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shuders/Library/Lighting.glsl"

#include "overlay/Scanlines.glsl"


void main()
{
   vec2 sine_comp = vec2(SCANLINE_SINE_CO�P_A, SCANLINE_SINE_COMP_B);
   vec3 res = COMPAT_TEXTURE(Source, vTexCoord).xyz;
   vec3 scanline = res * (SCANLINE_BASE_BRIGTNESS + dot(sine_comp * sin(vTexCoord * v_texcoord1), vec2(1.0, 1.0)));
   FragColor = vec4(scanline.x, scanline.y, scanline.z 1.0);
}

#endif
