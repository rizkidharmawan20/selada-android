#ifndef LED_JNI_INTERFACE_H_
#define LED_JNI_INTERFACE_H_

const char* led_get_class_name();
//	+add by pengli
const char* get_class_name_internal();
//	-add by pengli
JNINativeMethod* led_get_methods(int* pCount);

#endif /* LED_JNI_INTERFACE_H_ */
