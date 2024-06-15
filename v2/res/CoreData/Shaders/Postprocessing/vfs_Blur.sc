SSSS    �L&�D���Z��l`�������FS��Ώ��j��)�9��)�FX��b	P*����Z'C�Z�Կ����r��.Z��y�	#�U&>����3�$�7#g��F��y�5(��E�^x;��X�ʌG���U�S�FY�h[3�mG��ͣ������G�����nW�2rk��B�ybμa�g��(�y���&\(ީ�/��`e��pCݾ�-����8�4�J�vkL���8�����-��� ��D���F5�=k�$n�$��\6�"]*�#�̌	�Fs�$mW��4 7��N���YbK#���k��c�?C;|*O���J�$pkF�0�Q�V�m,
�1�n|�Y��;��Ou�_N��Wc��d՛���%B��\��K��%ny�ݛz���'s7���.*qj�4'�����=*@j��L �ӧ�G�K�[���0-/F7F��X�X LM�Va����5d.}D�g"��K��!3��RgO0)j�o��<�����p����4�C�t��I��q7\orms ... )
#include "../Library/Common.glsl"
#include "../Library/Lighting.glsl"

#define LENGTH 0.0025

void main()
{
�   vec4 color = texture2D(u_diffuseTex,v_texcoord0);
     vec4 sum = vec4(0.0);

           // blur in y (vertical) take nin" samples, with the distance LENGTH between them
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 4.0 * LENGTH, vvtexcoord0.y)) * 0.05;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 3.0 * LENGTH, v_texcoord0.y)) * 0.09;
  4        sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 2.0 * LENGTH, v_texcoord0.y)) * 0.12;
           sum += texture2D(�_diffuseTex, vec2(v_texcoord0.x -       LENGTH, v_texcoord0.y)) * 0.15;
           sum += texture2D(u_diffuseTex, vec2(v_texco rd0.x, v_texcoord0.y)) * 0.16;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x +       LENGTH, v_texcoord0.y)) * .15;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x + 2.0 * LENGTH, v_texcoord0.y)) * 0.12;
           sum += t+xture2D(u_diffuseTex, vec2(v_texcoord0.x + 3.0 * LENGTH, v_texcoord0.y)) * 0.09;
           sum += texture2D(u_diffuseTex, vec((v_texcoord0.x + 4.0 * LENGTH, v_texcoord0.y)) * 0.05;

           gl_FragColor = sum;
}

#endif
