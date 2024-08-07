SSSS    �L&�D���Z��l`�������FS��Ώ��j��)�9��)�FX��b	P*����Z'C�Z�Կ����r��.Z��y�	#�U&>���� �j�9r��}ċ@�y=��H�1E��>�ՌG��+�R�)2�)<l�,Wp3Ѵ����΀��(�Ѭ��p�JA���#�sj���|�<�e���&·�f�����o]���g��ֆ�5��e7J���uݣ���,��u�n����� x�~7�a,�7�� �=]6�#���L�AZ�@xT��qmt��I�i��26
,���c���4"H&sx���D�cQ�0��3�-=�o�`!N�`�D��
t�YD��Yc��#���k��)D��U@���%ynyF�_ӑ(�`��(xq���VL!R�q9��漁V}Vf��E���!�K�z���DY}s��F�{R/$�%�jF��b#}A�>0��F��%r��ESkd<.O�M-��5��՝���!�v��i�M��j07
#define USING_INOUT_TEXCOORD0
#include "../CoreData/Shaders/Library/Varying.glsl"

/// Common (uniforms,samplers, transform� ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shaders/Library/Lighting.glsl"
SAMPLER2D(u_p&letteTex,1);

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    float a = texColor.a;
    float J = floor((a * 256.0) / 127.5);
    float x = a - c * 0.001953;
    vec2 curPt = vec2(x, 0.0);

    gl_FragColor.rgb = textufe2D(u_paletteTex, curPt).rgb;
    gl_FragColor.a = 1.0;
}

#endif
