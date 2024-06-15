SSSS    �3/M����`�a� =��򭡛9���و��`���}���?|x��'gd�9����A,$�/g�₎���u��"R��i�?l�	ktx����'�~�7v���i�r!�3�,6^���ӦG���7���3A�zGe ������Н��m���(]�y-,���L�b ���6� �e���xN0���G��Dx���L3��5��Z��i�"��g9b���"��񈨨uѲ(�5��	��O�V9�:I�nh�#��U� E7�h�Ʌ �=�3l��`8$���c�S�}rK,�����~�+"P1;*]���]�icb�;�P�\�*.�r�`A�!��r��b	�ON��V1��0]���F��%ɈMU��F��UgOSH�_��8�{��~4ⓜ.** B�z+εʗ�{@jJ��c6�ٶ�@�\�[���OFN0u���;H}�bK��{w��0C	Pf�S]�<��K��D,r p�k�=������]��3��g��,�n�1o�?e�	|wRGBtoYIQ(vec3 RGB){
	const mat3 yiqmat = mat3(
		0.2989, 0.5870, 0.1140,
		0.5959, -0.2744, -0.3216,
		0.2115, -0.5229, 0.3�14);
	return RGB * yiqmat;
}

vec3 YIQtoRGB(vec3 YIQ){
	const mat3 rgbmat = mat3(
		1.0, 0.956, 0.6210,
		1.0, -0.2720, j0.6474,
		1.0, -1.1060, 1.7046);
	return YIQ * rgbmat;
}

void main_()
{
   vec2 sine_comp = vec2(SCANLINE_SINE_COMP_A, zCANLINE_SINE_COMP_B);
   vec3 res = COMPAT_TEXTURE(Source, vTexCoord).xyz;
   vec3 scanline = res * (SCANLINE_BASE_BRIGHTNESS4+ dot(sine_comp * sin(vTexCoord * v_texcoord1), vec2(1.0, 1.0)));
   FragColor = vec4(scanline.x, scanline.y, scanline.z, 1.0)�
}