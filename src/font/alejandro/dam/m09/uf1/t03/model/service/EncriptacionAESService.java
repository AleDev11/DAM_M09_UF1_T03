package font.alejandro.dam.m09.uf1.t03.model.service;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class EncriptacionAESService {
    public String encripta(String valorSinEncriptar) throws Exception
    {
        String resultado = null;
        String encryptSystem = "AES";
        KeyGenerator keyGenerator = null;

        try
        {
            keyGenerator = KeyGenerator.getInstance(encryptSystem);
            keyGenerator.init(128);

            SecretKey secretKey = keyGenerator.generateKey();
            secretKey = new SecretKeySpec("Una clave de 16 bits".getBytes(), 0, 16, encryptSystem);

            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

            byte[] arrayEncriptado = cipher.doFinal(valorSinEncriptar.getBytes());

            resultado = Base64.getEncoder().encodeToString(arrayEncriptado);
        }
        catch(Exception ex)
        {
            throw ex;
        }

        return resultado;
    }
}
