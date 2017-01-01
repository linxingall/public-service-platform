/**
 * aes加密代码
 */


/**
 * aes加密方法
 * @param data  明文
 * @returns  密文
 */
function AESEncrypt(data,key){
	//密钥

	var key = CryptoJS.enc.Utf8.parse(key);   //加密密钥
	var iv  = CryptoJS.enc.Utf8.parse("0102030405060708");   //加密向量
	var srcs = CryptoJS.enc.Utf8.parse(data);
	var encrypted = CryptoJS.AES.encrypt(srcs, key, { iv: iv,mode:CryptoJS.mode.CBC});
	return encrypted.toString();

}
