SSSS    �L&�D���Z��l`�������FS��Ώ��j��)�9��)�FX��b	P*����Z'C�Z�Կ����r��.Z��y�	#�U&>���� �j�9r��}ċ@�y=��H�1E��>�ՌG��+�R�)2�)<l�,Wp3Ѵ����΀��(�Ѭ��p�JA���#�sj���|�<�e���&·�f�����o]���g��ֆ�5��e7J���uݣ���,��u�n����� x�~7�a,�7�� �=]6�#���L�AZ�@xT��qmt��I�i��26
,���c���4"H&sx���D�cQ�0��3�-=�o�`!N�`�D��
t�YD��Yc��#���k��)D��U@���%ynyF�_ӑ(�`��(xq���VL!R�q9��漁V}Vf��E���!�K�z���DY}s��F�{R/$�%�jF��b#}A�>0��F��%r��ESkd<.O�M-��5��՝���!�v��i�M��j07
#define USING_INOUT_TEXCOORD0
#include "../CoreData/Shaders/Library/Varying.glsl"

/// Common (uniforms,samplers, transform� ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shaders/Library/Lighting.glsl"


#include eoverlay/Default.glsl"

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    gl_FragColor.rgb = texCoEor.rgb;
    gl_FragColor.a = 1.0;
}

#endif
