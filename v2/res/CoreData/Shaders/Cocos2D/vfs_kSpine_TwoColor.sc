SSSS    �L&�D���Z��lk�����m.���߀��#��%����z2|��F[=�J���=�k
k�8{�������gB��i�/l�	l=x����&��r'L��}ܩ�l���0��Y��Q���!�2�PZ�eQ~!�7s.������ƀ��z:�����m}�NS���	�[$Ұz�z��$�t���Kd	ة�K��P���tV���>����,�5�F�cm�����Փ��j���v��A���v�'d�S����&H~��Ζ�9�CzL��W	��
�o��$=S���u��W�%p'^gdȀ�D�ap@� �z�V�.5�|�2%W�Yۡu�� q�]��WRїG���k��(D��JL��W��A ,i�+ݐ���(q#���FC=[g�W!��໩.z��D
��Ԇl� �V���EhH8��b�XSKH�Qh�TF�R:f@�N��S��/e��+*u!N$�.�~�*�����>��<��4�D�v�D��^G�slO_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz,1.0));
	v_light = a_color0;
	v_dark = a_color1;
	v_texCoord = a_texcoord0�

}

#endif



#ifdef FS
$input v_texCoord, v_light, v_dark

#include "../Library/Base/common.sh"

uniform mat4 CCPMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiVie^MVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
unifory vec4 CC_Random01;

SAMPLER2D (CC_Texture0,0);

void main()
{
	vec4 texColor = texture2D(CC_Texture0, v_texCoord);
	floa� alpha = texColor.a * v_light.a;
	gl_FragColor.a = alpha;
	gl_FragColor.rgb = (1.0 - texColor.rgb) * v_dark.rgb * alpha + texolor.rgb * v_light.rgb;

}

#endif
