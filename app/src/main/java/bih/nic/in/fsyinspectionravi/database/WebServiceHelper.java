package bih.nic.in.fsyinspectionravi.database;

import android.util.Log;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;

import bih.nic.in.fsyinspectionravi.entity.FarmerDetails;
import bih.nic.in.fsyinspectionravi.entity.Panchayat;
import bih.nic.in.fsyinspectionravi.entity.Remarks;
import bih.nic.in.fsyinspectionravi.entity.UserDetails;
import bih.nic.in.fsyinspectionravi.entity.Versioninfo;
import bih.nic.in.fsyinspectionravi.entity.Village;

public class WebServiceHelper {

    public static final String SERVICENAMESPACE = "http://epacs.bih.nic.in/";

    //public static final String SERVICEURL = "http://epacs.bih.nic.in/FsyInspectionWebServicesRavi.asmx";
    public static final String SERVICEURL = "http://epacs.bih.nic.in/BRFsyInspectionWebServicesKharif.asmx";
    public static final String SERVICEURL1 = "http://epacs.bih.nic.in/BRFsyInspectionWebServicesrabi.asmx";

    //public static final String SERVICENAMESPACE = "http://10.133.17.37/";
    //public static final String SERVICEURL1 ="http://10.133.17.37/drishtiwebservice.asmx";


    public static final String APPVERSION_METHOD = "getAppLatest";
    public static final String AUTHENTICATE_METHOD = "Authenticate";
    private static final String Panchayat_LIST_METHOD = "GetPanchayatList1";
    private static final String Provision_LIST_METHOD = "GetProvisionalRemarks";
    private static final String Village_LIST_METHOD = "GetVillageLst";
    //private static final String getfarmerdetails = "GetFarmerDetails3";
    private static final String getfarmerdetails = "GetFarmerDetailsForkharif";
    private static final String INSERT_Farmer_details = "UploadDocNew1";
    private static final String GET_PHOTO_PATH = "getPath";
    static String rest;




    public static Versioninfo CheckVersion(String imei, String version) {
        Versioninfo versioninfo;
        SoapObject res1;
        try {

            //res1=getServerData(APPVERSION_METHOD,Versioninfo.Versioninfo_CLASS,"IMEI","Ver",imei,version);
            SoapObject request = new SoapObject(SERVICENAMESPACE,APPVERSION_METHOD);
            request.addProperty("IMEI",imei);
            request.addProperty("Ver",version);
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            envelope.addMapping(SERVICENAMESPACE,Versioninfo.Versioninfo_CLASS.getSimpleName(),Versioninfo.Versioninfo_CLASS);
            HttpTransportSE androidHttpTransport = new HttpTransportSE(SERVICEURL);
            androidHttpTransport.call(SERVICENAMESPACE + APPVERSION_METHOD,envelope);
            res1 = (SoapObject) envelope.getResponse();
            SoapObject final_object = (SoapObject) res1.getProperty(0);

            versioninfo = new Versioninfo(final_object);

        } catch (Exception e) {

            return null;
        }
        return versioninfo;

    }

    public static UserDetails Authenticate(String UserName, String Password) {

        SoapObject request = new SoapObject(SERVICENAMESPACE, AUTHENTICATE_METHOD);

        request.addProperty("UserID", UserName);
        request.addProperty("Password", Password);
        UserDetails userDetails;
        SoapObject res1;
        try {

            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);
            envelope.addMapping(SERVICENAMESPACE,UserDetails.USER_CLASS.getSimpleName(), UserDetails.USER_CLASS);
            HttpTransportSE androidHttpTransport = new HttpTransportSE(SERVICEURL);
            androidHttpTransport.call(SERVICENAMESPACE + AUTHENTICATE_METHOD, envelope);

            res1 = (SoapObject) envelope.getResponse();

            int TotalProperty = res1.getPropertyCount();

            userDetails = new UserDetails(res1);

        } catch (Exception e) {

            return null;
        }
        return userDetails;

    }

    public static ArrayList<Panchayat> loadPanchayatList(String user_id,String blockCode) {



        SoapObject request = new SoapObject(SERVICENAMESPACE, Panchayat_LIST_METHOD);

        request.addProperty("userid", user_id);
        request.addProperty("Blockcode", blockCode);


        SoapObject res1;
        try {

            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);

            envelope.addMapping(SERVICENAMESPACE,Panchayat.Panchayat_CLASS.getSimpleName(), Panchayat.Panchayat_CLASS);

            HttpTransportSE androidHttpTransport = new HttpTransportSE(SERVICEURL);
            androidHttpTransport.call(SERVICENAMESPACE + Panchayat_LIST_METHOD,
                    envelope);

            res1 = (SoapObject) envelope.getResponse();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        int TotalProperty = res1.getPropertyCount();

        ArrayList<Panchayat> pvmArrayList = new ArrayList<Panchayat>();

        for (int ii = 0; ii < TotalProperty; ii++) {
            if (res1.getProperty(ii) != null) {
                Object property = res1.getProperty(ii);
                if (property instanceof SoapObject) {
                    SoapObject final_object = (SoapObject) property;
                    Panchayat district = new Panchayat(final_object);
                    pvmArrayList.add(district);
                }
            } else
                return pvmArrayList;
        }


        return pvmArrayList;
    }
    public static ArrayList<Remarks> loadProvisionList() {



        SoapObject request = new SoapObject(SERVICENAMESPACE, Provision_LIST_METHOD);

        SoapObject res1;
        try {

            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);

            envelope.addMapping(SERVICENAMESPACE, Remarks.Remarks_CLASS.getSimpleName(), Remarks.Remarks_CLASS);

            HttpTransportSE androidHttpTransport = new HttpTransportSE(SERVICEURL);
            androidHttpTransport.call(SERVICENAMESPACE + Provision_LIST_METHOD,
                    envelope);

            res1 = (SoapObject) envelope.getResponse();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        int TotalProperty = res1.getPropertyCount();

        ArrayList<Remarks> pvmArrayList = new ArrayList<Remarks>();

        for (int ii = 0; ii < TotalProperty; ii++) {
            if (res1.getProperty(ii) != null) {
                Object property = res1.getProperty(ii);
                if (property instanceof SoapObject) {
                    SoapObject final_object = (SoapObject) property;
                    Remarks district = new Remarks(final_object);
                    pvmArrayList.add(district);
                }
            } else
                return pvmArrayList;
        }


        return pvmArrayList;
    }
    public static ArrayList<Village> loadVillageList(String Panchayat_id) {



        SoapObject request = new SoapObject(SERVICENAMESPACE, Village_LIST_METHOD);

        request.addProperty("PanchayatCode", Panchayat_id);


        SoapObject res1;
        try {

            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);

            envelope.addMapping(SERVICENAMESPACE, Village.Village_CLASS.getSimpleName(), Village.Village_CLASS);

            HttpTransportSE androidHttpTransport = new HttpTransportSE(SERVICEURL);
           // HttpTransportSE androidHttpTransport = new HttpTransportSE(SERVICEURL,600000);

            androidHttpTransport.call(SERVICENAMESPACE + Village_LIST_METHOD, envelope);

            res1 = (SoapObject) envelope.getResponse();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        int TotalProperty = res1.getPropertyCount();

        ArrayList<Village> pvmArrayList = new ArrayList<Village>();

        for (int ii = 0; ii < TotalProperty; ii++) {
            if (res1.getProperty(ii) != null) {
                Object property = res1.getProperty(ii);
                if (property instanceof SoapObject) {
                    SoapObject final_object = (SoapObject) property;
                    Village district = new Village(final_object);
                    pvmArrayList.add(district);
                }
            } else
                return pvmArrayList;
        }


        return pvmArrayList;
    }

    public static ArrayList<FarmerDetails> GetDataLIst1(String panchayatcode,String crop_id,String userid) {
        SoapObject res1;

        SoapObject request = new SoapObject(SERVICENAMESPACE,getfarmerdetails);
        Log.d("yttusydi",""+panchayatcode);

        request.addProperty("PanchayatCode",panchayatcode);
        request.addProperty("userid",userid);
        request.addProperty("Weather",crop_id);
       // request.addProperty("userid",Role);


        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = true;
        envelope.setOutputSoapObject(request);
        envelope.addMapping(SERVICENAMESPACE,FarmerDetails.FARMER_CLASS.getSimpleName(),FarmerDetails.FARMER_CLASS);
        HttpTransportSE androidHttpTransport = new HttpTransportSE(SERVICEURL);

        ArrayList<FarmerDetails> dataList = new ArrayList<FarmerDetails>();

        try {
            androidHttpTransport.call(SERVICENAMESPACE + getfarmerdetails, envelope);
            res1 = (SoapObject) envelope.getResponse();

            //res1=getServerData(SYNCHRONIZE_METHOD,GetDataListClass.GetData_CLASS,"_ULBID","_WardNo", UlbCode,wardid);

            int TotalProperty=0;
            if(res1!=null)
                TotalProperty= res1.getPropertyCount();


            for (int i = 0; i < TotalProperty; i++) {
                if (res1.getProperty(i) != null) {
                    Object property = res1.getProperty(i);
                    if (property instanceof SoapObject) {
                        SoapObject final_object = (SoapObject) property;
                        FarmerDetails sm = new FarmerDetails(final_object);
                        dataList.add(sm);
                    }
                } else
                    return dataList;
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return dataList;
    }

    public static String sendLocaldata(FarmerDetails data) {
        SoapObject request = new SoapObject(SERVICENAMESPACE, INSERT_Farmer_details);
        request.addProperty("TypeOfFarmer", data.getTypeofFarmer());
        request.addProperty("ACNO", data.getRegistrationNO());
        request.addProperty("lat", data.getLatitude());
        request.addProperty("long_", data.getLongitude());
        request.addProperty("PictOfInspector", data.getPhoto1());
        request.addProperty("PictOfAawedak", data.getPhoto2());
        request.addProperty("PictOfLand", data.getPhoto3());
        request.addProperty("PictOfLand2", data.getPhoto4());
        request.addProperty("lat2", data.getPic1landLat());
        request.addProperty("long2", data.getPic1landLong());
        request.addProperty("PictOfLand3", data.getPhoto5());
        request.addProperty("lat3", data.getPic2landLat());
        request.addProperty("long3", data.getPic2landLong());
        request.addProperty("EntryBy", data.getUser_ID());
        request.addProperty("SelfDecOnlyOne", data.getAawedak_one_family_Id());
        request.addProperty("LPCiSIssuedByOFFICE", data.getLpc_rltd_chk_Id());
        request.addProperty("KhataAsPerLPC", data.getLpc_awedn_chk_Id());
        request.addProperty("LPCDate", data.getDate());
        request.addProperty("LPCNameAsPerApplicant", data.getAawedan_karta_Id());

        request.addProperty("IsCrop", data.getGhosit_fasal_khti_Id());
        request.addProperty("isCropAccordingToDec", data.getAawedan_ghosit_rakwa_Id());

        request.addProperty("cropAreaPaddyFarmer", data.getElectric_id());

        request.addProperty("cropAreaPaddyFarmer", data.getCropAreaPaddyFarmer());
        request.addProperty("cropAreaPaddyShare", data.getCropAreaPaddyShare());
        request.addProperty("cropAreaMazeeFarmer", data.getCropAreaMazeeFarmer());
        request.addProperty("cropAreaMazeeShare", data.getCropAreaMazeeShare());
        request.addProperty("cropAreaSoyabeenFarmer", data.getCropAreaSoyabeenFarmer());
        request.addProperty("cropAreaSoyabeenShare", data.getCropAreaSoyabeenShare());

        request.addProperty("IsApplicantPer", data.getAawedak_accept());
        request.addProperty("IsRelation", data.getAawedak_reject());
        request.addProperty("SelfDecStatus", data.getSwaghosana_sambandhit_id());
        request.addProperty("NameOfKSOrWardMember", data.getSwaghosana_signer_name());
        if(!(data.getElectric_avail_id().equalsIgnoreCase(""))){
            request.addProperty("IsElectricity", data.getElectric_avail_id());
            if(data.getElectric_avail_id().equalsIgnoreCase("1")){
                request.addProperty("IsElectricityNumber","Y");
                request.addProperty("ElectricityNumber", data.getElectricity());
                if(!(data.getElectric_id().equalsIgnoreCase(""))){
                    if(data.getElectric_id().equalsIgnoreCase("1")){
                        request.addProperty("IsElectricity","Y");
                    }else  if(data.getElectric_id().equalsIgnoreCase("2")){
                        request.addProperty("IsElectricity","N");
                    }else{
                        request.addProperty("IsElectricity","");
                    }
                }
            }else  if(data.getElectric_avail_id().equalsIgnoreCase("2")){
                request.addProperty("IsElectricityNumber","N");
            }else{
                request.addProperty("IsElectricityNumber","");
            }
        }else{
            request.addProperty("IsElectricity", "");
            request.addProperty("IsElectricityNumber", "");
            request.addProperty("ElectricityNumber", "");
        }

        //request.addProperty("IsElectricity", data.getElectric_id());

        request.addProperty("IsSelfDecUploded", data.getSwaghona_upload());
        request.addProperty("IsSelfDecAsPerName", data.getSwaghona_patra_aawedakrta());
        try {
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.implicitTypes = true;
            envelope.setOutputSoapObject(request);

            HttpTransportSE androidHttpTransport = new HttpTransportSE(SERVICEURL);
            androidHttpTransport.call(SERVICENAMESPACE + INSERT_Farmer_details, envelope);
            rest = envelope.getResponse().toString();
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
            return "0";
        }
        return rest;
    }
    public static String UploadLandDetailsPhase1( String filepath) {

        SoapObject request = new SoapObject(SERVICENAMESPACE, GET_PHOTO_PATH);
        request.addProperty("FilePath", filepath);

        try {
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.implicitTypes = true;
            envelope.setOutputSoapObject(request);

            HttpTransportSE androidHttpTransport = new HttpTransportSE(SERVICEURL1);
            androidHttpTransport.call(SERVICENAMESPACE + GET_PHOTO_PATH, envelope);

            rest = envelope.getResponse().toString();

        }
        catch (Exception e) {
            e.printStackTrace();
            //return "0";
            return null;
        }
        return rest;

    }
}
