SSSS    �L.�T��V�a� �䓭���8}���ǜ��/��T�Y˯3�4`|��GhU<�I���$�}Gw�h���槈���5Y��m�X#�8WA����9��'?z��}ڄa�o{��68�!E���ҩ~���1�+�~�K}%�6Qmf����붡�E6�ꋴ�@4�?wx���@�]"��P�X?Բ(�r�ý11ì�M��JJ+���?^q���q�������ppU̥�lݣ휤�lƼ:�b����$�	e�r(�,x�,ܭ~�!Y#�ꀉ �Y�mDl��qv[���`��s4`���D��e�,"G1)xہ�O�~|@� ��z� ; �t�%w"�!��}��#�NH��{4N��*J���W��L �VH��@��Yg G�ٜ�C��/v=���.*qe�D�����DVPj��M	����9�/��ǻNk)���3AnA�%��G��l+ji�zH��^��he�� z,SFe�N��4�ӹ��{����*�W�U� �U�^
�BfI0
void main()
{
	vec3 color = texture2DLod(s_texColor, v_texcoord0, u_imageLod).xyz;
	float alpha = 0.2 + 0.8*u_imageEnabled�
	gl_FragColor = vec4(color, alpha);
}

