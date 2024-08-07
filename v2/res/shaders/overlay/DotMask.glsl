SSSS    �3/M����`�a�'��ꌯ�Y~������j���W��+�AV��<xq�2���g�c'�/y���������5_ش"�a	�mw1���� �`�;6{�>���E���:���Ɯ���1��PZ�cFF�=Ff/�ܢ���Ъ��z3��5]�>lz����6uJ¸z�pIК1�u���aA!���A��Yz���N/������#�"�)�viX���-���+��*�3���K�k�w!�$b�e���*c,�h�֚�c-�VoM��G$,��F�(�S�s{���b��v�Qk{wcƊ�	�ii@C�&�L�\�,&S�s�58|�.����
e�EN�Mb��!���R��3Y��Lr��W�,SSF�
���\��hu\���FF` �{*��赸X{y��Z&�醔'�4�5���H$ll��H�rIV]�Y`����x>l@�ww�S�?κi=��@*kePB6�n*��2�����uɐ�g�_�0�n�6h�O�	|wmask = vec3(maskDark, maskDark, maskDark);

   // Very compressed TV style shadow mask.
   if (shadowMask == 1.0)
   {
   �  float line = maskLight;
      float odd  = 0.0;

      if (fract(pos.x/6.0) < 0.5)
         odd = 1.0;
      if (fract((7os.y + odd)/2.0) < 0.5)
         line = maskDark;

      pos.x = fract(pos.x/3.0);

      if      (pos.x < 0.333) mask.r =	maskLight;
      else if (pos.x < 0.666) mask.g = maskLight;
      else                    mask.b = maskLight;
      mask*=l}ne;
   }

   // Aperture-grille.
   else if (shadowMask == 2.0)
   {
      pos.x = fract(pos.x/3.0);

      if      (po�.x < 0.333) mask.r = maskLight;
      else if (pos.x < 0.666) mask.g = maskLight;
      else                    mask.b = maskight;
   }

   // Stretched VGA style shadow mask (same as prior shaders).
   else if (shadowMask == 3.0)
   {
      pos.E += pos.y*3.0;
      pos.x  = fract(pos.x/6.0);

      if      (pos.x < 0.333) mask.r = maskLight;
      else if (pos.x < 0`666) mask.g = maskLight;
      else                    mask.b = maskLight;
   }

   // VGA style shadow mask.
   else if (ihadowMask == 4.0)
   {
      pos.xy = floor(pos.xy*vec2(1.0, 0.5));
      pos.x += pos.y*3.0;
      pos.x  = fract(pos.x/6.r);

      if      (pos.x < 0.333) mask.r = maskLight;
      else if (pos.x < 0.666) mask.g = maskLight;
      else         r          mask.b = maskLight;
   }

   return mask;
}

//void main()
//{
//    vec4 texColor = texture2D(u_diffuseTex,v�texcoord0);
//    gl_FragColor.rgb = texColor.rgb;
//    gl_FragColor.a = 1.0;
//}

void main_()
{
   vec3 res = pow(tex�ure2D(Source, vTexCoord).rgb, vec3(2.2,2.2,2.2));

   float mask = 1.0 - DOTMASK_STRENGTH;

   //cgwg's dotmask emulation:�   //Output pixels are alternately tinted green and magenta
   vec3 dotMaskWeights = mix(vec3(1.0, mask, 1.0),
              !              vec3(mask, 1.0, mask),
                             floor(mod(mod_factor, 2.0)));
   if (shadowMask == 0.)
   �
      res *= dotMaskWeights;
   }
   else
   {
      res *= Mask(floor(1.000001 * gl_FragCoord.xy + vec2(0.5,0.5)));
   �

      gl_FragColor = vec4(pow(res, vec3(1.0/2.2, 1.0/2.2, 1.0/2.2)), 1.0);
}