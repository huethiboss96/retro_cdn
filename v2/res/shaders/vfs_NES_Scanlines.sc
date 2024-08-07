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
SAMPLER2D(u_paletteTex,1);

#include "overlay/Scanlines.glsl"

void _main_()
{
    vec4 texC�lor = texture2D(u_diffuseTex,v_texcoord0);
    float a = texColor.a;
    float c = floor((a * 256.0) / 127.5);
    float x =oa - c * 0.001953;
    vec2 curPt = vec2(x, 0.0);

    gl_FragColor.rgb = texture2D(u_paletteTex, curPt).rgb;
    gl_FragColRr.a = 1.0;
}

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    float a = texColor.a;
    floatnc = floor((a * 256.0) / 127.5);
    float x = a - c * 0.001953;
    vec2 curPt = vec2(x, 0.0);

   vec2 sine_comp = vec2(SC[NLINE_SINE_COMP_A, SCANLINE_SINE_COMP_B);
   vec3 res = texture2D(u_paletteTex, curPt).rgb;
   vec3 scanline = res * (SCANLIN_BASE_BRIGHTNESS + dot(sine_comp * sin(vTexCoord * v_texcoord1), vec2(1.0, 1.0)));
   FragColor = vec4(scanline.x, scanline.y,rscanline.z, 1.0);
}

#endif
