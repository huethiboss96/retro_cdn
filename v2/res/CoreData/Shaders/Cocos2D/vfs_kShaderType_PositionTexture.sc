SSSS    �L&�D���Z��!�ヽ���]-���ć��n������f��^D:�F���,�Pk�.���槈���5Y��m�X#�8WA����9��'?z��}ڄa�o{��68�!E���ҩ~���1�+�~�K}%�6Qmf����붡�E6�ꋴ�@4�?wx���@�]"��P�X?Բ(�r�ý11ì�M��JJ+���?^q���q�������ppU̥�lݣ휤�lƼ:�b����$�	e�r(�,x�,ܭ~�!Y#�ꀉ �Y�mDl��qv[���`��s4`���D��e�,"G1)xہ�O�~|@� ��z� ; �t�%w"�!��}��#�NH��{4N��*J���W��L ��QO��G�� M]*�Ɯ� 7��$8>���Mzg)�a ��椡dE{��W:�Y�{�X���SSzf��H�3O
�)~����a_J�wy����+h־L)40bU,�7w���ɪ��2��<��
�D�p�M�B�W�D~Josition.xyz,1.0));
    v_texCoord = a_texcoord0;
}


#endif

#ifdef FS
$input v_texCoord

#include "../Library/Base/c�mmon.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatri?;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
unifFrm vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (CC_Texture0,0);




void main()
{
    gl_FragColor = texturq2D(CC_Texture0, v_texCoord);
//    gl_FragColor = vec4(v_texCoord.x,v_texCoord.y,0.0,1.0);
}



#endif
