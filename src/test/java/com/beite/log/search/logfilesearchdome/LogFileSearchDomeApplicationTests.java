package com.beite.log.search.logfilesearchdome;

import com.beite.log.search.logfilesearchdome.util.DateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class LogFileSearchDomeApplicationTests {

	@Test
	void contextLoads() {
		String timeFormat = "2022-05-18 15:17:19.750 [http-nio-8081-exec-2] INFO  cn.sottop.mes.core.log.FileLogAdapter - TYPE[OPERATION]\tThread[97=>http-nio-8081-exec-2]\tObject[cn.sottop.mes.application.permission.controller.PermissionLoginController@13976c57]\tAPI[cn.sottop.mes.application.permission.controller.PermissionLoginController.login([LoginParam(userName=admin, password=ZZ6JolAmpklrBdvJOiBliAdf3A8SaW2crZDLRxYiCJec8Be20TjyAluiM/ZvN53NwPvejlI0rxaARTyIW8eww91ryeFS3HciADxDtsNK7YjErakyZ67VquVxERVynCJOlRxFuHK8Q2bpk6hdJfQdmIPH7NfcaUXSGKephNczv70BF9W6r4RQYqLiBKWVqjWX2r0OlLTf/EY2lLzibxWZojYzk7/LUiRcHrzqrMKTxsbGGd/Ie+Lrd6M19OLUBkVBkJ1yXT62iV4SA0K1Ew1kH+wnJzdCz/imNY3+EFZLcn1Mo9Rq4p8BdGmwyJNhWBi2h2jKC29w/7JP+ThJ/RB40w==)])],\tResult[MesResponse{code=0, message='成功', result=TokenDTO(value=eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyIjoie1wiYXJlYUlkXCI6XCIzMlwiLFwiY3JlYXRlZEJ5XCI6XCIyMlwiLFwiY3JlYXRlZFRpbWVcIjoxNjQ2NzA4Mzg1NjIzLFwiY3JlYXRpb25QaWRcIjoxLFwiZGVwYXJ0bWVudElkXCI6XCIyXCIsXCJkZXNjcmlwdGlvblwiOlwiYWQgaXJ1cmUgZG9sb3JlIGV4XCIsXCJlZmZlY3RpdmVUaW1lXCI6MjUzNTQ2NTYwMDAwMCxcImVtYWlsXCI6XCJlaHlzcXh4Z3NAcXEuY29tXCIsXCJlbXBsb3llZU51bWJlclwiOlwiNTMxXCIsXCJlbmFibGVcIjp0cnVlLFwiZnVsbE5hbWVcIjpcIuezu-e7n-euoeeQhuWRmFwiLFwiaWRcIjpcIjIyXCIsXCJsb2NrZWRcIjpmYWxzZSxcIm9yZGVyQnlcIjpcIjEgZGVzY1wiLFwicGFzc3dvcmRcIjpcIlpaNkpvbEFtcGtsckJkdkpPaUJsaUFkZjNBOFNhVzJjclpETFJ4WWlDSmVjOEJlMjBUanlBbHVpTS9adk41M053UHZlamxJMHJ4YUFSVHlJVzhld3c5MXJ5ZUZTM0hjaUFEeER0c05LN1lqRXJha3laNjdWcXVWeEVSVnluQ0pPbFJ4RnVISzhRMmJwazZoZEpmUWRtSVBIN05mY2FVWFNHS2VwaE5jenY3MEJGOVc2cjRSUVlxTGlCS1dWcWpXWDJyME9sTFRmL0VZMmxMemlieFdab2pZems3L0xVaVJjSHJ6cXJNS1R4c2JHR2QvSWUrTHJkNk0xOU9MVUJrVkJrSjF5WFQ2MmlWNFNBMEsxRXcxa0grd25KemRDei9pbU5ZMytFRlpMY24xTW85UnE0cDhCZEdtd3lKTmhXQmkyaDJqS0MyOXcvN0pQK1RoSi9SQjQwdz09XCIsXCJwbGFudElkXCI6XCIzXCIsXCJzaGlmdElkXCI6XCIxXCIsXCJ0ZWxcIjpcIjEzMTc3MTE1MzU2XCIsXCJ0cnhJZFwiOlwiMSAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICBcIixcInVwZGF0ZVBpZFwiOjEsXCJ1cGRhdGVkQnlcIjpcIjIyXCIsXCJ1cGRhdGVkVGltZVwiOjE2NDg2MDU2NDAwODUsXCJ1c2VyTmFtZVwiOlwiYWRtaW5cIixcInZlcnNpb25cIjo1fSIsImp0aSI6Ik1XSmtPVFJsT0RNdFl6QTNaaTAwTmpRNExXSmlZakl0TTJWbU5HTmlObUkyWlRObCIsInN1YiI6ImhzLW1lcyIsImlhdCI6MTY1Mjg1ODIzOSwiZXhwIjoxNjUzNDYzMDM5fQ.2Mjrcqao2zJK3FL-AKnq1jNGiFB0hxa24RvZ_kmXOVE, expiresIn=604800, additionalInformation={currentTime=1652858239268, workStationId=32, id=22, user=AppUserDTO(super=AbstractBaseDTO(id=22, createdTime=Tue Mar 08 10:59:45 CST 2022, createdBy=22, updatedTime=Wed Mar 30 10:00:40 CST 2022, updatedBy=22, description=null, version=null, creatorName=null, updaterName=null, plantId=3, plantName=null, trxId=null, creationPid=null, updatePid=null), userName=admin, employeeNumber=531, fullName=系统管理员, areaId=32, area=浙江车间一, departmentId=2, department=研发部门, shiftId=1, shift=班次2, tel=null, email=ehysqxxgs@qq.com, plantId=3, plant=浙江1, effectiveTime=Sat May 07 00:00:00 CST 2050, description=null, enable=true, locked=false), productionLineId=3, jti=ZmE5NDZjYWYtZjM0Yy00ZGRiLWJlMTgtZjViN2M2NzE5MmNi})}]\n" +
				"2022-05-18 15:19:43.913 [http-nio-8081-exec-5] INFO  cn.sottop.mes.core.log.FileLogAdapter - TYPE[OPERATION]\tThread[102=>http-nio-8081-exec-5]\tObject[cn.sottop.mes.application.permission.controller.PermissionLoginController@13976c57]\tAPI[cn.sottop.mes.application.permission.controller.PermissionLoginController.login([LoginParam(userName=admin, password=ZZ6JolAmpklrBdvJOiBliAdf3A8SaW2crZDLRxYiCJec8Be20TjyAluiM/ZvN53NwPvejlI0rxaARTyIW8eww91ryeFS3HciADxDtsNK7YjErakyZ67VquVxERVynCJOlRxFuHK8Q2bpk6hdJfQdmIPH7NfcaUXSGKephNczv70BF9W6r4RQYqLiBKWVqjWX2r0OlLTf/EY2lLzibxWZojYzk7/LUiRcHrzqrMKTxsbGGd/Ie+Lrd6M19OLUBkVBkJ1yXT62iV4SA0K1Ew1kH+wnJzdCz/imNY3+EFZLcn1Mo9Rq4p8BdGmwyJNhWBi2h2jKC29w/7JP+ThJ/RB40w==)])],\tResult[MesResponse{code=0, message='成功', result=TokenDTO(value=eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyIjoie1wiYXJlYUlkXCI6XCIzMlwiLFwiY3JlYXRlZEJ5XCI6XCIyMlwiLFwiY3JlYXRlZFRpbWVcIjoxNjQ2NzA4Mzg1NjIzLFwiY3JlYXRpb25QaWRcIjoxLFwiZGVwYXJ0bWVudElkXCI6XCIyXCIsXCJkZXNjcmlwdGlvblwiOlwiYWQgaXJ1cmUgZG9sb3JlIGV4XCIsXCJlZmZlY3RpdmVUaW1lXCI6MjUzNTQ2NTYwMDAwMCxcImVtYWlsXCI6XCJlaHlzcXh4Z3NAcXEuY29tXCIsXCJlbXBsb3llZU51bWJlclwiOlwiNTMxXCIsXCJlbmFibGVcIjp0cnVlLFwiZnVsbE5hbWVcIjpcIuezu-e7n-euoeeQhuWRmFwiLFwiaWRcIjpcIjIyXCIsXCJsb2NrZWRcIjpmYWxzZSxcIm9yZGVyQnlcIjpcIjEgZGVzY1wiLFwicGFzc3dvcmRcIjpcIlpaNkpvbEFtcGtsckJkdkpPaUJsaUFkZjNBOFNhVzJjclpETFJ4WWlDSmVjOEJlMjBUanlBbHVpTS9adk41M053UHZlamxJMHJ4YUFSVHlJVzhld3c5MXJ5ZUZTM0hjaUFEeER0c05LN1lqRXJha3laNjdWcXVWeEVSVnluQ0pPbFJ4RnVISzhRMmJwazZoZEpmUWRtSVBIN05mY2FVWFNHS2VwaE5jenY3MEJGOVc2cjRSUVlxTGlCS1dWcWpXWDJyME9sTFRmL0VZMmxMemlieFdab2pZems3L0xVaVJjSHJ6cXJNS1R4c2JHR2QvSWUrTHJkNk0xOU9MVUJrVkJrSjF5WFQ2MmlWNFNBMEsxRXcxa0grd25KemRDei9pbU5ZMytFRlpMY24xTW85UnE0cDhCZEdtd3lKTmhXQmkyaDJqS0MyOXcvN0pQK1RoSi9SQjQwdz09XCIsXCJwbGFudElkXCI6XCIzXCIsXCJzaGlmdElkXCI6XCIxXCIsXCJ0ZWxcIjpcIjEzMTc3MTE1MzU2XCIsXCJ0cnhJZFwiOlwiMSAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICBcIixcInVwZGF0ZVBpZFwiOjEsXCJ1cGRhdGVkQnlcIjpcIjIyXCIsXCJ1cGRhdGVkVGltZVwiOjE2NDg2MDU2NDAwODUsXCJ1c2VyTmFtZVwiOlwiYWRtaW5cIixcInZlcnNpb25cIjo1fSIsImp0aSI6IlpXSXhOR0ppTTJNdE5qSTRNeTAwTTJRM0xUbGhNV1l0T0RGbVlqQTRPR1F4WkRZNSIsInN1YiI6ImhzLW1lcyIsImlhdCI6MTY1Mjg1ODM2MiwiZXhwIjoxNjUzNDYzMTYyfQ.YRS7kWwCCMf-7abFMZTOH5h89FZLZPjUJy2BlOh3NHY, expiresIn=604800, additionalInformation={currentTime=1652858362143, workStationId=32, id=22, user=AppUserDTO(super=AbstractBaseDTO(id=22, createdTime=Tue Mar 08 10:59:45 CST 2022, createdBy=22, updatedTime=Wed Mar 30 10:00:40 CST 2022, updatedBy=22, description=null, version=null, creatorName=null, updaterName=null, plantId=3, plantName=null, trxId=null, creationPid=null, updatePid=null), userName=admin, employeeNumber=531, fullName=系统管理员, areaId=32, area=浙江车间一, departmentId=2, department=研发部门, shiftId=1, shift=班次2, tel=null, email=ehysqxxgs@qq.com, plantId=3, plant=浙江1, effectiveTime=Sat May 07 00:00:00 CST 2050, description=null, enable=true, locked=false), productionLineId=3, jti=NmRmZWM0NzQtMzVkNS00MWM0LTgyODctNjMyMTc2ODliZTQx})}]\n" +
				"2022-05-18 15:19:47.668 [http-nio-8081-exec-7] INFO  cn.sottop.mes.core.log.FileLogAdapter - TYPE[OPERATION]\tThread[107=>http-nio-8081-exec-7]\tObject[cn.sottop.mes.application.permission.controller.PermissionLoginController@13976c57]\tAPI[cn.sottop.mes.application.permission.controller.PermissionLoginController.login([LoginParam(userName=admin, password=ZZ6JolAmpklrBdvJOiBliAdf3A8SaW2crZDLRxYiCJec8Be20TjyAluiM/ZvN53NwPvejlI0rxaARTyIW8eww91ryeFS3HciADxDtsNK7YjErakyZ67VquVxERVynCJOlRxFuHK8Q2bpk6hdJfQdmIPH7NfcaUXSGKephNczv70BF9W6r4RQYqLiBKWVqjWX2r0OlLTf/EY2lLzibxWZojYzk7/LUiRcHrzqrMKTxsbGGd/Ie+Lrd6M19OLUBkVBkJ1yXT62iV4SA0K1Ew1kH+wnJzdCz/imNY3+EFZLcn1Mo9Rq4p8BdGmwyJNhWBi2h2jKC29w/7JP+ThJ/RB40w==)])],\tResult[MesResponse{code=0, message='成功', result=TokenDTO(value=eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyIjoie1wiYXJlYUlkXCI6XCIzMlwiLFwiY3JlYXRlZEJ5XCI6XCIyMlwiLFwiY3JlYXRlZFRpbWVcIjoxNjQ2NzA4Mzg1NjIzLFwiY3JlYXRpb25QaWRcIjoxLFwiZGVwYXJ0bWVudElkXCI6XCIyXCIsXCJkZXNjcmlwdGlvblwiOlwiYWQgaXJ1cmUgZG9sb3JlIGV4XCIsXCJlZmZlY3RpdmVUaW1lXCI6MjUzNTQ2NTYwMDAwMCxcImVtYWlsXCI6XCJlaHlzcXh4Z3NAcXEuY29tXCIsXCJlbXBsb3llZU51bWJlclwiOlwiNTMxXCIsXCJlbmFibGVcIjp0cnVlLFwiZnVsbE5hbWVcIjpcIuezu-e7n-euoeeQhuWRmFwiLFwiaWRcIjpcIjIyXCIsXCJsb2NrZWRcIjpmYWxzZSxcIm9yZGVyQnlcIjpcIjEgZGVzY1wiLFwicGFzc3dvcmRcIjpcIlpaNkpvbEFtcGtsckJkdkpPaUJsaUFkZjNBOFNhVzJjclpETFJ4WWlDSmVjOEJlMjBUanlBbHVpTS9adk41M053UHZlamxJMHJ4YUFSVHlJVzhld3c5MXJ5ZUZTM0hjaUFEeER0c05LN1lqRXJha3laNjdWcXVWeEVSVnluQ0pPbFJ4RnVISzhRMmJwazZoZEpmUWRtSVBIN05mY2FVWFNHS2VwaE5jenY3MEJGOVc2cjRSUVlxTGlCS1dWcWpXWDJyME9sTFRmL0VZMmxMemlieFdab2pZems3L0xVaVJjSHJ6cXJNS1R4c2JHR2QvSWUrTHJkNk0xOU9MVUJrVkJrSjF5WFQ2MmlWNFNBMEsxRXcxa0grd25KemRDei9pbU5ZMytFRlpMY24xTW85UnE0cDhCZEdtd3lKTmhXQmkyaDJqS0MyOXcvN0pQK1RoSi9SQjQwdz09XCIsXCJwbGFudElkXCI6XCIzXCIsXCJzaGlmdElkXCI6XCIxXCIsXCJ0ZWxcIjpcIjEzMTc3MTE1MzU2XCIsXCJ0cnhJZFwiOlwiMSAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICBcIixcInVwZGF0ZVBpZFwiOjEsXCJ1cGRhdGVkQnlcIjpcIjIyXCIsXCJ1cGRhdGVkVGltZVwiOjE2NDg2MDU2NDAwODUsXCJ1c2VyTmFtZVwiOlwiYWRtaW5cIixcInZlcnNpb25cIjo1fSIsImp0aSI6IllXSmpOREV3TnpndFltSXpPUzAwTUdabExXRTRObVV0WWprNFl6STFNbUZrTWpkaSIsInN1YiI6ImhzLW1lcyIsImlhdCI6MTY1Mjg1ODM3NCwiZXhwIjoxNjUzNDYzMTc0fQ.mkYnvUyytzhirEMFH3u9B_ZbCryva9zb5BR0ZJ0JeZg, expiresIn=604800, additionalInformation={currentTime=1652858374440, workStationId=32, id=22, user=AppUserDTO(super=AbstractBaseDTO(id=22, createdTime=Tue Mar 08 10:59:45 CST 2022, createdBy=22, updatedTime=Wed Mar 30 10:00:40 CST 2022, updatedBy=22, description=null, version=null, creatorName=null, updaterName=null, plantId=3, plantName=null, trxId=null, creationPid=null, updatePid=null), userName=admin, employeeNumber=531, fullName=系统管理员, areaId=32, area=浙江车间一, departmentId=2, department=研发部门, shiftId=1, shift=班次2, tel=null, email=ehysqxxgs@qq.com, plantId=3, plant=浙江1, effectiveTime=Sat May 07 00:00:00 CST 2050, description=null, enable=true, locked=false), productionLineId=3, jti=ZjYxMjE4ZmUtNGU3OS00ZWUzLTg1M2QtZDRmNTEyYjMxZjU5})}]\n" +
				"2022-05-18 15:21:47.869 [http-nio-8081-exec-1] INFO  cn.sottop.mes.core.log.FileLogAdapter - TYPE[OPERATION]\tThread[96=>http-nio-8081-exec-1]\tObject[cn.sottop.mes.application.permission.controller.PermissionLoginController@13976c57]\tAPI[cn.sottop.mes.application.permission.controller.PermissionLoginController.login([LoginParam(userName=admin, password=ZZ6JolAmpklrBdvJOiBliAdf3A8SaW2crZDLRxYiCJec8Be20TjyAluiM/ZvN53NwPvejlI0rxaARTyIW8eww91ryeFS3HciADxDtsNK7YjErakyZ67VquVxERVynCJOlRxFuHK8Q2bpk6hdJfQdmIPH7NfcaUXSGKephNczv70BF9W6r4RQYqLiBKWVqjWX2r0OlLTf/EY2lLzibxWZojYzk7/LUiRcHrzqrMKTxsbGGd/Ie+Lrd6M19OLUBkVBkJ1yXT62iV4SA0K1Ew1kH+wnJzdCz/imNY3+EFZLcn1Mo9Rq4p8BdGmwyJNhWBi2h2jKC29w/7JP+ThJ/RB40w==)])],\tResult[MesResponse{code=0, message='成功', result=TokenDTO(value=eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyIjoie1wiYXJlYUlkXCI6XCIzMlwiLFwiY3JlYXRlZEJ5XCI6XCIyMlwiLFwiY3JlYXRlZFRpbWVcIjoxNjQ2NzA4Mzg1NjIzLFwiY3JlYXRpb25QaWRcIjoxLFwiZGVwYXJ0bWVudElkXCI6XCIyXCIsXCJkZXNjcmlwdGlvblwiOlwiYWQgaXJ1cmUgZG9sb3JlIGV4XCIsXCJlZmZlY3RpdmVUaW1lXCI6MjUzNTQ2NTYwMDAwMCxcImVtYWlsXCI6XCJlaHlzcXh4Z3NAcXEuY29tXCIsXCJlbXBsb3llZU51bWJlclwiOlwiNTMxXCIsXCJlbmFibGVcIjp0cnVlLFwiZnVsbE5hbWVcIjpcIuezu-e7n-euoeeQhuWRmFwiLFwiaWRcIjpcIjIyXCIsXCJsb2NrZWRcIjpmYWxzZSxcIm9yZGVyQnlcIjpcIjEgZGVzY1wiLFwicGFzc3dvcmRcIjpcIlpaNkpvbEFtcGtsckJkdkpPaUJsaUFkZjNBOFNhVzJjclpETFJ4WWlDSmVjOEJlMjBUanlBbHVpTS9adk41M053UHZlamxJMHJ4YUFSVHlJVzhld3c5MXJ5ZUZTM0hjaUFEeER0c05LN1lqRXJha3laNjdWcXVWeEVSVnluQ0pPbFJ4RnVISzhRMmJwazZoZEpmUWRtSVBIN05mY2FVWFNHS2VwaE5jenY3MEJGOVc2cjRSUVlxTGlCS1dWcWpXWDJyME9sTFRmL0VZMmxMemlieFdab2pZems3L0xVaVJjSHJ6cXJNS1R4c2JHR2QvSWUrTHJkNk0xOU9MVUJrVkJrSjF5WFQ2MmlWNFNBMEsxRXcxa0grd25KemRDei9pbU5ZMytFRlpMY24xTW85UnE0cDhCZEdtd3lKTmhXQmkyaDJqS0MyOXcvN0pQK1RoSi9SQjQwdz09XCIsXCJwbGFudElkXCI6XCIzXCIsXCJzaGlmdElkXCI6XCIxXCIsXCJ0ZWxcIjpcIjEzMTc3MTE1MzU2XCIsXCJ0cnhJZFwiOlwiMSAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICBcIixcInVwZGF0ZVBpZFwiOjEsXCJ1cGRhdGVkQnlcIjpcIjIyXCIsXCJ1cGRhdGVkVGltZVwiOjE2NDg2MDU2NDAwODUsXCJ1c2VyTmFtZVwiOlwiYWRtaW5cIixcInZlcnNpb25cIjo1fSIsImp0aSI6IlpqSmlZakpqT1RVdE5ETTRaQzAwTTJGaUxXSTFaREl0TURSaVpERXlNalE0WTJOaCIsInN1YiI6ImhzLW1lcyIsImlhdCI6MTY1Mjg1ODQ5OSwiZXhwIjoxNjUzNDYzMjk5fQ.EEQ3Bz4SmVCSwF_NfeXaLtInjY9_Byv1gbpa58RbV0w, expiresIn=604800, additionalInformation={currentTime=1652858499913, workStationId=32, id=22, user=AppUserDTO(super=AbstractBaseDTO(id=22, createdTime=Tue Mar 08 10:59:45 CST 2022, createdBy=22, updatedTime=Wed Mar 30 10:00:40 CST 2022, updatedBy=22, description=null, version=null, creatorName=null, updaterName=null, plantId=3, plantName=null, trxId=null, creationPid=null, updatePid=null), userName=admin, employeeNumber=531, fullName=系统管理员, areaId=32, area=浙江车间一, departmentId=2, department=研发部门, shiftId=1, shift=班次2, tel=null, email=ehysqxxgs@qq.com, plantId=3, plant=浙江1, effectiveTime=Sat May 07 00:00:00 CST 2050, description=null, enable=true, locked=false), productionLineId=3, jti=YjA1ODUwMDMtYzhhNS00YjJlLTgyZGYtZDYxNTE2MTYyNWNj})}]\n" +
				"2022-05-18 15:21:56.518 [http-nio-8081-exec-2] INFO  cn.sottop.mes.core.log.FileLogAdapter - TYPE[OPERATION]\tThread[97=>http-nio-8081-exec-2]\tObject[cn.sottop.mes.application.permission.controller.PermissionLoginController@13976c57]\tAPI[cn.sottop.mes.application.permission.controller.PermissionLoginController.login([LoginParam(userName=admin, password=ZZ6JolAmpklrBdvJOiBliAdf3A8SaW2crZDLRxYiCJec8Be20TjyAluiM/ZvN53NwPvejlI0rxaARTyIW8eww91ryeFS3HciADxDtsNK7YjErakyZ67VquVxERVynCJOlRxFuHK8Q2bpk6hdJfQdmIPH7NfcaUXSGKephNczv70BF9W6r4RQYqLiBKWVqjWX2r0OlLTf/EY2lLzibxWZojYzk7/LUiRcHrzqrMKTxsbGGd/Ie+Lrd6M19OLUBkVBkJ1yXT62iV4SA0K1Ew1kH+wnJzdCz/imNY3+EFZLcn1Mo9Rq4p8BdGmwyJNhWBi2h2jKC29w/7JP+ThJ/RB40w==)])],\tResult[MesResponse{code=0, message='成功', result=TokenDTO(value=eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyIjoie1wiYXJlYUlkXCI6XCIzMlwiLFwiY3JlYXRlZEJ5XCI6XCIyMlwiLFwiY3JlYXRlZFRpbWVcIjoxNjQ2NzA4Mzg1NjIzLFwiY3JlYXRpb25QaWRcIjoxLFwiZGVwYXJ0bWVudElkXCI6XCIyXCIsXCJkZXNjcmlwdGlvblwiOlwiYWQgaXJ1cmUgZG9sb3JlIGV4XCIsXCJlZmZlY3RpdmVUaW1lXCI6MjUzNTQ2NTYwMDAwMCxcImVtYWlsXCI6XCJlaHlzcXh4Z3NAcXEuY29tXCIsXCJlbXBsb3llZU51bWJlclwiOlwiNTMxXCIsXCJlbmFibGVcIjp0cnVlLFwiZnVsbE5hbWVcIjpcIuezu-e7n-euoeeQhuWRmFwiLFwiaWRcIjpcIjIyXCIsXCJsb2NrZWRcIjpmYWxzZSxcIm9yZGVyQnlcIjpcIjEgZGVzY1wiLFwicGFzc3dvcmRcIjpcIlpaNkpvbEFtcGtsckJkdkpPaUJsaUFkZjNBOFNhVzJjclpETFJ4WWlDSmVjOEJlMjBUanlBbHVpTS9adk41M053UHZlamxJMHJ4YUFSVHlJVzhld3c5MXJ5ZUZTM0hjaUFEeER0c05LN1lqRXJha3laNjdWcXVWeEVSVnluQ0pPbFJ4RnVISzhRMmJwazZoZEpmUWRtSVBIN05mY2FVWFNHS2VwaE5jenY3MEJGOVc2cjRSUVlxTGlCS1dWcWpXWDJyME9sTFRmL0VZMmxMemlieFdab2pZems3L0xVaVJjSHJ6cXJNS1R4c2JHR2QvSWUrTHJkNk0xOU9MVUJrVkJrSjF5WFQ2MmlWNFNBMEsxRXcxa0grd25KemRDei9pbU5ZMytFRlpMY24xTW85UnE0cDhCZEdtd3lKTmhXQmkyaDJqS0MyOXcvN0pQK1RoSi9SQjQwdz09XCIsXCJwbGFudElkXCI6XCIzXCIsXCJzaGlmdElkXCI6XCIxXCIsXCJ0ZWxcIjpcIjEzMTc3MTE1MzU2XCIsXCJ0cnhJZFwiOlwiMSAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICBcIixcInVwZGF0ZVBpZFwiOjEsXCJ1cGRhdGVkQnlcIjpcIjIyXCIsXCJ1cGRhdGVkVGltZVwiOjE2NDg2MDU2NDAwODUsXCJ1c2VyTmFtZVwiOlwiYWRtaW5cIixcInZlcnNpb25cIjo1fSIsImp0aSI6Ik9ESXhNemsxT0RBdE9ETmxOQzAwTkdReUxUbGhNMll0TURRNFpUWXhNREprWlRNMSIsInN1YiI6ImhzLW1lcyIsImlhdCI6MTY1Mjg1ODUxMSwiZXhwIjoxNjUzNDYzMzExfQ.pZtxqge7_8havqsJpruLl7D7PViSWgsR_FCap67YfU0, expiresIn=604800, additionalInformation={currentTime=1652858511751, workStationId=32, id=22, user=AppUserDTO(super=AbstractBaseDTO(id=22, createdTime=Tue Mar 08 10:59:45 CST 2022, createdBy=22, updatedTime=Wed Mar 30 10:00:40 CST 2022, updatedBy=22, description=null, version=null, creatorName=null, updaterName=null, plantId=3, plantName=null, trxId=null, creationPid=null, updatePid=null), userName=admin, employeeNumber=531, fullName=系统管理员, areaId=32, area=浙江车间一, departmentId=2, department=研发部门, shiftId=1, shift=班次2, tel=null, email=ehysqxxgs@qq.com, plantId=3, plant=浙江1, effectiveTime=Sat May 07 00:00:00 CST 2050, description=null, enable=true, locked=false), productionLineId=3, jti=NWFiMDIwNGQtM2Y3MC00N2VhLWExZTAtZDYxZjk0OGY4MGZh})}]\n";
		Date date = DateUtil.cutDate(timeFormat);
		System.out.println("哈哈哈"
				+ DateUtil.convertTime2String(date, DateUtil.PATTERN[0]));

	}


	@Test
	void test1(){
		String dateFormat = "TestWeb.log.2022-05-25.log";
		Date date = DateUtil.cutDate(dateFormat);
		System.out.println(DateUtil.convertTime2String(date, DateUtil.PATTERN[0]));

	}

}
