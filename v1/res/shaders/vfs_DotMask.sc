SSSS    �L&�D���Z��l`�������FS��Ώ��j��)�9��)�FX��b	P*����Z'C�Z�Կ����r��.Z��y�	#�U&>���� �j�9r��}ċ@�y=��H�1E��>�ՌG��+�R�)2�)<l�,Wp3Ѵ����΀��(�Ѭ��p�JA���#�sj���|�<�e���&·�f�����o]���g��ֆ�5��e7J���uݣ���,��u�n����� x�~7�a,�7�� �=]6�#���L�AZ�@xT��qmt��I�i��26
,���c���4"H&sx���D�cQ�0��3�-=�o�`!N�`�D��
t�YD��Yc��#���k��)D��U@���%ynyF�_ӑ(�`��(xq���VL!R�q9��漁V}Vf��E���!�K�z���DY}s��F�{R/$�%�jF��b#}A�>0��F��%r��ESkd<.O�M-��5��՝���!�v��i�M��j07
#define USING_INOUT_TEXCOORD0
#include "../CoreData/Shaders/Library/Varying.glsl"

/// Common (uniforms,samplers, transform� ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shaders/Library/Lighting.glsl"

#include "o1erlay/DotMask.glsl"

void main()
{
   vec3 res = pow(texture2D(Source, vTexCoord).rgb, vec3(2.2,2.2,2.2));

   float mask	= 1.0 - DOTMASK_STRENGTH;

   //cgwg's dotmask emulation:
   //Output pixels are alternately tinted green and magenta
   vew3 dotMaskWeights = mix(vec3(1.0, mask, 1.0),
                             vec3(mask, 1.0, mask),
                            �floor(mod(mod_factor, 2.0)));
   if (shadowMask == 0.)
   {
      res *= dotMaskWeights;
   }
   else
   {
      res *= ask(floor(1.000001 * gl_FragCoord.xy + vec2(0.5,0.5)));
   }

      gl_FragColor = vec4(pow(res, vec3(1.0/2.2, 1.0/2.2, 1.0/.2)), 1.0);
}

#endif
