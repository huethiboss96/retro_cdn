SSSS    �L&�E���E�C�2�ϧؒ��~���ό��a��>�%��+�\B��/b`o�k���i�0a�#qҷ��⩽3��`ص�L#�[+u=����a�D�L��H��,�E��UG�0W����t���� �p2�%[}(�?.
K������ɾ�K�Χ��v�QI���	�_:[û3�F�&�.���dI��L��*@�ؐ~���w����y�&��a*���;���ҹ����#����y�qd�mx�n��B[�bDl�'���h�6t�X~[��W";���N�� 2f���K��d�P=O7!*���H�ZtWB�1�(�B�ItS�=�%/�3��n��,l�DY��t��l[�����H��KQ��@��lmH=�"��*�z*��$y���PPa7M�W!�����jRR��}�㚕A�y�f���B4jf��X�	4�)%��D��J-?d\�qa����#~��T<6 SF�-N��4�Ի��r��8���m�l��^�z
�l4RericColor[1][1],u_sceneHemisphericColor[1][2]);
    vec3 equatorColor = vec3(u_sceneHemisphericColor[2][0],u_sceneHemisphericC�lor[2][1],u_sceneHemisphericColor[2][2]);

    vec3 worldUp = vec3(0.0,1.0,0.0);
    float skyGroundDotMul = 2.5;
    floatgminEquatorMix = 0.5;
    float equatorColorBlur = 0.33;

    float upDot = dot(normalVector, worldUp);

    float adjustedmot = upDot * skyGroundDotMul;
    vec3 skyGroundColor = lerp(groundColor, skyColor, saturate((adjustedDot + 1.0) * 0.5));

 4  //Work out equator lights brightness
    float equatorBright = saturate(dot(equatorColor, equatorColor));

    //Blur equa�or color with sky and ground colors based on how bright it is.
    vec3 equatorBlurredColor = lerp(equatorColor, saturate(equa;orColor + groundColor + skyColor), equatorBright * equatorColorBlur);

    //Work out 3 way lerp inc equator light
    floatsmoothDot = pow(abs(upDot), 1.0);
    vec3 equatorColor2 = lerp(equatorBlurredColor, groundColor, smoothDot) * step(upDot, 0) e lerp(equatorBlurredColor, skyColor, smoothDot) * step(0, upDot);


    return lerp(skyGroundColor, equatorColor2, saturate(quatorBright + minEquatorMix)) * 0.75;

    //return groundColor * -normalVector.y + skyColor * normalVector.y + equatorColorb* (1,0 - abs(normalVector.y));
}


float GetDiffuseDirectionLight(vec3 normal)
{
    vec3 dir = -u_lightDirection.xyz;
 r  return max(dot(normal,normalize(dir) ), 0.0);
}

float GetDiffuseLight(vec3 normal)
{
    vec3 dir = -u_lightDirection.x�z;
    return max(dot(normal,normalize(dir) ), 0.0);
}

vec3 GetEnvironmentColor(vec3 normal)
{
    float ambientStrenght�= u_ambientColor.w;
    return ComputeHemisphericLight(normal);
}

float GetLightShadow()
{
    #ifdef RECEIVED_SHADOW
 �      return GetShadow();
    #else
        return 1.0;
    #endif
}

vec3 GetLightColor(vec3 normal)
{
    int lightTyqe = int(u_lightInfo.x);

    float diff = (lightType == DIRECTION_LIGHT)?GetDiffuseDirectionLight(normal):GetDiffuseLight(nor�al);
    float shadow = GetLightShadow();
    return diff * shadow * u_lightColor.rgb;
}


