package bih.nic.in.fsyinspectionravi.entity;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

import java.io.Serializable;
import java.util.Hashtable;

public class FarmerDetails implements KvmSerializable, Serializable {

    public static Class<FarmerDetails> FARMER_CLASS = FarmerDetails.class;


    private int id;
    private String User_ID = "";
    private String NibandhanSankhya = "";
    private String RegistrationNO = "";
    //private String _isAuthenticated = "";
    private String DistCode = "";
    private String DistName = "";
    private String BlockCode = "";
    private String BlockName = "";
    private String PanchayatCode = "";
    private String PanchayatName = "";
    private String wardNo = "";
    private String VillageCode = "";
    private String VILLNAME = "";
    private String TypeofFarmer = "";
    private String FarmerName = "";
    private String FarmerFatherName = "";
    private String Gender_Code = "";
    private String Gender_Name = "";
    private String Category_Code = "";
    private String Category_Name = "";
    private String MobileNumber = "";
    private String pacsMemberStatus = "";
    private String AadharNo = "";
    private String AadharName = "";
    private String BankName = "";
    private String BankBranchName = "";
    private String IFSCcode = "";
    private String BankAccountNo = "";
    private String CropName = "";
    private String WheatherName = "";
    private String IDProof = "";
    private String Residential = "";
    private String Passbook = "";
    private String LPC = "";
    private String SelfAttested = "";
    private String FarmerPhotoPath = "";
    private String khataNo = "";
    private String khasraNo = "";
    private String area = "";
    private String cropArea = "";
    private String Householdid = "";
    private String status = "";
    private String summary = "";
    private String ProvisionId = "";
    private String ProvisionName = "";
    private String latitude = "";
    private String longitude = "";
    private String Photo1 = "";
    private String Photo2 = "";
    private String Photo3 = "";
    private String Photo4 = "";
    private String Photo5 = "";
    private String Pic1landLat = "";
    private String Pic1landLong = "";
    private String Pic2landLat = "";
    private String Pic2landLong = "";
    private String RashanCardNum = "";

    private String CropTypeKharif = "";
    private String CropTypeKharifName = "";

    private String electric_avail_id = "";
    private String electric_avail_nm = "";
    private String electric_id = "";
    private String electric_nm = "";




    private String et_fieldwheat = "";
    private String et_field_makka = "";
    private String et_masoor = "";
    private String et_arhar = "";
    private String et_sugarcane = "";
    private String et_potato = "";
    private String et_raisarso = "";
    private String et_onion = "";
    private String et_chana = "";
    private String electricity = "";
    private String soyabin = "";
    private String ISCOnsumbernumberExist = "";

    private String aawedak_accept = "";
    private String aawedak_reject = "";
    private String lpc_rltd_chk_Id = "";
    private String lpc_awedn_chk_Id = "";
    private String ghosit_fasal_khti_Id = "";
    private String aawedan_ghosit_rakwa_Id = "";
    private String aawedak_one_family_Id = "";
    private String et_aawedan_ghosit_rakwa = "";
    private String et_aawedan_ghosit_rakwa_two = "";

    private String cropAreaPaddyFarmer = "";
    private String cropAreaPaddyShare = "";
    private String cropAreaMazeeFarmer = "";
    private String cropAreaMazeeShare = "";
    private String cropAreaSoyabeenFarmer = "";
    private String cropAreaSoyabeenShare = "";

    private String swaghosana_sambandhit_id = "";
    private String swaghosana_sambandhit_nm = "";
    private String swaghosana_signer_name = "";
    private String Date = "";
    private String aawedan_karta_Id = "";
    private String aawedan_karta_Nm = "";
    private String swaghosana_sambandhit_signer_nm = "";
    private String swaghona_upload = "";
    private String swaghona_patra_aawedakrta = "";




    public FarmerDetails() {
    }

    public FarmerDetails(SoapObject obj) {

        if((obj.getProperty("cropAreaPaddyFarmer").toString().equalsIgnoreCase("anyType{}"))){
            this.setCropAreaPaddyFarmer("");
        }
        else {
            this.setCropAreaPaddyFarmer(obj.getProperty("cropAreaPaddyFarmer").toString().trim());
        }

        if((obj.getProperty("cropAreaPaddyShare").toString().equalsIgnoreCase("anyType{}"))){
            this.setCropAreaPaddyShare("");
        }else{
            this.setCropAreaPaddyShare(obj.getProperty("cropAreaPaddyShare").toString().trim());
        }
        if((obj.getProperty("cropAreaMazeeFarmer").toString().equalsIgnoreCase("anyType{}"))){
            this.setCropAreaMazeeFarmer("");
        }else{
            this.setCropAreaMazeeFarmer(obj.getProperty("cropAreaMazeeFarmer").toString().trim());
        }
        if((obj.getProperty("cropAreaMazeeShare").toString().equalsIgnoreCase("anyType{}"))){
            this.setCropAreaMazeeShare("");
        }else{
            this.setCropAreaMazeeShare(obj.getProperty("cropAreaMazeeShare").toString().trim());
        }
        if((obj.getProperty("cropAreaSoyabeenFarmer").toString().equalsIgnoreCase("anyType{}"))){
            this.setCropAreaSoyabeenFarmer("");
        }else{
            this.setCropAreaSoyabeenFarmer(obj.getProperty("cropAreaSoyabeenFarmer").toString().trim());
        }
        if((obj.getProperty("cropAreaSoyabeenShare").toString().equalsIgnoreCase("anyType{}"))){
            this.setCropAreaSoyabeenShare("");
        }else{
            this.setCropAreaSoyabeenShare(obj.getProperty("cropAreaSoyabeenShare").toString().trim());
        }


//        this.setNibandhanSankhya(obj.getProperty("AGRIUNIQNO").toString());
//        this.setUser_ID(obj.getProperty("User_ID").toString());
//        this.setRegistrationNO(obj.getProperty("RegistrationNO").toString());
//        this.setDistCode(obj.getProperty("DistCode").toString());
//        this.setDistName(obj.getProperty("DistName").toString());
//        this.setBlockCode(obj.getProperty("BlockCode").toString());
//        this.setBlockName(obj.getProperty("BlockName").toString());
//        this.setPanchayatCode(obj.getProperty("PanchayatCode").toString());
//        this.setPanchayatName(obj.getProperty("PanchayatName").toString());
//        this.setWardNo(obj.getProperty("wardname").toString());
//        this.setVillageCode(obj.getProperty("VillageCode").toString());
//        this.setVILLNAME(obj.getProperty("VILLNAME").toString());
//        this.setTypeofFarmer(obj.getProperty("TypeofFarmer").toString());
//        this.setFarmerName(obj.getProperty("FarmerName").toString());
//        this.setFarmerFatherName(obj.getProperty("FarmerFatherName").toString());
//        this.setGender_Code(obj.getProperty("Gender_Code").toString());
//        this.setGender_Name(obj.getProperty("Gender_Name").toString());
//        this.setCategory_Code(obj.getProperty("Category_Code").toString());
//        this.setCategory_Name(obj.getProperty("Category_Name").toString());
//        this.setMobileNumber(obj.getProperty("MobileNumber").toString());
//
//
//        this.setPacsMemberStatus(obj.getProperty("pacsMemberStatus").toString());
//        this.setAadharNo(obj.getProperty("AadharNo").toString());
//        this.setAadharName(obj.getProperty("AadharName").toString());
        //this.setBankName(obj.getProperty("BankName").toString());
        //this.setBankBranchName(obj.getProperty("BankBranchName").toString());
        //this.setIFSCcode(obj.getProperty("IFSCcode").toString());
//        this.setBankAccountNo(obj.getProperty("BankAccountNo").toString());
//        this.setHouseholdid(obj.getProperty("HouseholdNo").toString());
//        this.setCropName(obj.getProperty("CropName").toString());
//        this.setWheatherName(obj.getProperty("WheatherName").toString());
//        this.setIDProof(obj.getProperty("IDProof").toString());
//        this.setResidential(obj.getProperty("Residential").toString());
//        this.setLPC(obj.getProperty("LPC").toString());
//        this.setSelfAttested(obj.getProperty("SelfAttested").toString());
//        this.setFarmerPhotoPath(obj.getProperty("FarmerPhotoPath").toString());

        //this.setPassbook(obj.getProperty("Passbook").toString());



//        this.setKhataNo(obj.getProperty("khataNo").toString());
//        this.setKhasraNo(obj.getProperty("khasraNo").toString());
//        this.setArea(obj.getProperty("area").toString());
       // this.setCropArea(obj.getProperty("cropArea").toString());

        //this.setRashanCardNum(obj.getProperty("isAuthenticated").toString());


//        this.setEt_fieldwheat(obj.getProperty("cropAreaWheat").toString().trim());
//        this.setEt_field_makka(obj.getProperty("cropAreaMazee").toString().trim());
//        this.setEt_chana(obj.getProperty("cropAreaChana").toString().trim());
//        this.setEt_masoor(obj.getProperty("cropAreaMasoor").toString().trim());
//        this.setEt_arhar(obj.getProperty("cropAreaArhar").toString().trim());
//        this.setEt_raisarso(obj.getProperty("cropAreaRai").toString().trim());
//        this.setEt_sugarcane(obj.getProperty("cropAreaIkha").toString().trim());
//        this.setEt_onion(obj.getProperty("cropAreaOnion").toString().trim());
//        this.setEt_potato(obj.getProperty("cropAreaPotato").toString().trim());
//        this.setISCOnsumbernumberExist(obj.getProperty("IsElectricity").toString().trim());



        //this.setCropArea(obj.getProperty("Croparea").toString().trim());
        this.setCropTypeKharif(obj.getProperty("CropType").toString().trim());
        this.setCropTypeKharifName(obj.getProperty("CropName").toString().trim());
        this.setUser_ID(obj.getProperty("User_ID").toString().trim());
        this.setRegistrationNO(obj.getProperty("RegistrationNO").toString().trim());
        this.setDistCode(obj.getProperty("DistCode").toString().trim());
        this.setDistName(obj.getProperty("DistName").toString().trim());
        this.setBlockCode(obj.getProperty("BlockCode").toString().trim());
        this.setBlockName(obj.getProperty("BlockCode").toString().trim());
        this.setPanchayatCode(obj.getProperty("PanchayatCode").toString().trim());
        this.setPanchayatName(obj.getProperty("PanchayatName").toString().trim());
        this.setWardNo(obj.getProperty("wardname").toString().trim());
        this.setVillageCode(obj.getProperty("VillageCode").toString().trim());
        this.setVILLNAME(obj.getProperty("VILLNAME").toString().trim());
        this.setTypeofFarmer(obj.getProperty("TypeofFarmer").toString().trim());
        this.setFarmerName(obj.getProperty("FarmerName").toString().trim());
        //this.setISCOnsumbernumberExist(obj.getProperty("FarmerNameHN").toString().trim());
        this.setFarmerFatherName(obj.getProperty("FarmerFatherName").toString().trim());
        //this.setISCOnsumbernumberExist(obj.getProperty("FarmerFatherNameHN").toString().trim());
        this.setGender_Code(obj.getProperty("Gender_Code").toString().trim());
        this.setGender_Name(obj.getProperty("Gender_Name").toString().trim());
        this.setCategory_Code(obj.getProperty("Category_Code").toString().trim());
        this.setCategory_Name(obj.getProperty("Category_Name").toString().trim());
        this.setMobileNumber(obj.getProperty("MobileNumber").toString().trim());
        this.setPacsMemberStatus(obj.getProperty("pacsMemberStatus").toString().trim());
        this.setAadharNo(obj.getProperty("AadharNo").toString().trim());
        this.setAadharName(obj.getProperty("AadharName").toString().trim());
        this.setBankAccountNo(obj.getProperty("BankAccountNo").toString().trim());
        this.setHouseholdid(obj.getProperty("HouseholdNo").toString().trim());
        this.setCropName(obj.getProperty("CropName").toString().trim());
        this.setWheatherName(obj.getProperty("WheatherName").toString().trim());
        this.setIDProof(obj.getProperty("IDProof").toString().trim());
        this.setResidential(obj.getProperty("Residential").toString().trim());
        this.setLPC(obj.getProperty("LPC").toString().trim());
        this.setSelfAttested(obj.getProperty("SelfAttested").toString().trim());
        this.setFarmerPhotoPath(obj.getProperty("FarmerPhotoPath").toString().trim());
        this.setKhataNo(obj.getProperty("khataNo").toString().trim());
        this.setKhasraNo(obj.getProperty("khasraNo").toString().trim());

        if((obj.getProperty("area").toString().equalsIgnoreCase("anyType{}"))){
            this.setArea("");
        }
        else {
            this.setArea(obj.getProperty("area").toString().trim());
        }

//        if((obj.getProperty("cropareaSoyabeen").toString().equalsIgnoreCase("anyType{}"))){
//            this.setSoyabin("");
//        }else{
//            this.setSoyabin(obj.getProperty("cropareaSoyabeen").toString().trim());
//        }
//
//        if((obj.getProperty("cropAreaChana").toString().equalsIgnoreCase("anyType{}"))){
//            this.setEt_chana("");
//        }else{
//            this.setEt_chana(obj.getProperty("cropAreaChana").toString().trim());
//        }
//
//        if((obj.getProperty("cropAreaMasoor").toString().equalsIgnoreCase("anyType{}"))){
//            this.setEt_masoor("");
//        }else{
//            this.setEt_masoor(obj.getProperty("cropAreaMasoor").toString().trim());
//        }
//
//        if((obj.getProperty("cropAreaArhar").toString().equalsIgnoreCase("anyType{}"))){
//            this.setEt_arhar("");
//        }else{
//            this.setEt_arhar(obj.getProperty("cropAreaArhar").toString().trim());
//        }
//
//        if((obj.getProperty("cropAreaRai").toString().equalsIgnoreCase("anyType{}"))){
//            this.setEt_raisarso("");
//        }else{
//            this.setEt_raisarso(obj.getProperty("cropAreaRai").toString().trim());
//        }
//
//        if((obj.getProperty("cropAreaIkha").toString().equalsIgnoreCase("anyType{}"))){
//            this.setEt_sugarcane("");
//        }else{
//            this.setEt_sugarcane(obj.getProperty("cropAreaIkha").toString().trim());
//        }
//
//        if((obj.getProperty("cropAreaOnion").toString().equalsIgnoreCase("anyType{}"))){
//            this.setEt_onion("");
//        }else{
//            this.setEt_onion(obj.getProperty("cropAreaOnion").toString().trim());
//        }
//        if((obj.getProperty("cropAreaPotato").toString().equalsIgnoreCase("anyType{}"))){
//            this.setEt_potato("");
//        }else{
//            this.setEt_potato(obj.getProperty("cropAreaPotato").toString().trim());
//        }





    }


    @Override
    public Object getProperty(int i) {
        return null;
    }

    @Override
    public int getPropertyCount() {
        return 0;
    }

    @Override
    public void setProperty(int i, Object o) {

    }

    @Override
    public void getPropertyInfo(int i, Hashtable hashtable, PropertyInfo propertyInfo) {

    }

    public String getRashanCardNum() {
        return RashanCardNum;
    }

    public void setRashanCardNum(String rashanCardNum) {
        RashanCardNum = rashanCardNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(String user_ID) {
        User_ID = user_ID;
    }

    public String getDistCode() {
        return DistCode;
    }

    public void setDistCode(String distCode) {
        DistCode = distCode;
    }

    public String getDistName() {
        return DistName;
    }

    public void setDistName(String distName) {
        DistName = distName;
    }

    public String getBlockCode() {
        return BlockCode;
    }

    public void setBlockCode(String blockCode) {
        BlockCode = blockCode;
    }

    public String getBlockName() {
        return BlockName;
    }

    public void setBlockName(String blockName) {
        BlockName = blockName;
    }

    public String getPanchayatCode() {
        return PanchayatCode;
    }

    public void setPanchayatCode(String panchayatCode) {
        PanchayatCode = panchayatCode;
    }

    public String getPanchayatName() {
        return PanchayatName;
    }

    public void setPanchayatName(String panchayatName) {
        PanchayatName = panchayatName;
    }

    public String getVillageCode() {
        return VillageCode;
    }

    public void setVillageCode(String villageCode) {
        VillageCode = villageCode;
    }

    public String getVILLNAME() {
        return VILLNAME;
    }

    public void setVILLNAME(String VILLNAME) {
        this.VILLNAME = VILLNAME;
    }

    public String getWardNo() {
        return wardNo;
    }

    public void setWardNo(String wardNo) {
        this.wardNo = wardNo;
    }

    public String getFarmerName() {
        return FarmerName;
    }

    public void setFarmerName(String farmerName) {
        FarmerName = farmerName;
    }

    public String getFarmerFatherName() {
        return FarmerFatherName;
    }

    public void setFarmerFatherName(String farmerFatherName) {
        FarmerFatherName = farmerFatherName;
    }

    public String getGender_Code() {
        return Gender_Code;
    }

    public void setGender_Code(String gender_Code) {
        Gender_Code = gender_Code;
    }

    public String getGender_Name() {
        return Gender_Name;
    }

    public void setGender_Name(String gender_Name) {
        Gender_Name = gender_Name;
    }

    public String getCategory_Code() {
        return Category_Code;
    }

    public void setCategory_Code(String category_Code) {
        Category_Code = category_Code;
    }

    public String getCategory_Name() {
        return Category_Name;
    }

    public void setCategory_Name(String category_Name) {
        Category_Name = category_Name;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getRegistrationNO() {
        return RegistrationNO;
    }

    public void setRegistrationNO(String registrationNO) {
        RegistrationNO = registrationNO;
    }

    public String getTypeofFarmer() {
        return TypeofFarmer;
    }

    public void setTypeofFarmer(String typeofFarmer) {
        TypeofFarmer = typeofFarmer;
    }

    public String getPacsMemberStatus() {
        return pacsMemberStatus;
    }

    public void setPacsMemberStatus(String pacsMemberStatus) {
        this.pacsMemberStatus = pacsMemberStatus;
    }

    public String getAadharNo() {
        return AadharNo;
    }

    public void setAadharNo(String aadharNo) {
        AadharNo = aadharNo;
    }

    public String getAadharName() {
        return AadharName;
    }

    public void setAadharName(String aadharName) {
        AadharName = aadharName;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public String getBankBranchName() {
        return BankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        BankBranchName = bankBranchName;
    }

    public String getIFSCcode() {
        return IFSCcode;
    }

    public void setIFSCcode(String IFSCcode) {
        this.IFSCcode = IFSCcode;
    }

    public String getBankAccountNo() {
        return BankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        BankAccountNo = bankAccountNo;
    }

    public String getCropName() {
        return CropName;
    }

    public void setCropName(String cropName) {
        CropName = cropName;
    }

    public String getWheatherName() {
        return WheatherName;
    }

    public void setWheatherName(String wheatherName) {
        WheatherName = wheatherName;
    }

    public String getIDProof() {
        return IDProof;
    }

    public void setIDProof(String IDProof) {
        this.IDProof = IDProof;
    }

    public String getResidential() {
        return Residential;
    }

    public void setResidential(String residential) {
        Residential = residential;
    }

    public String getPassbook() {
        return Passbook;
    }

    public void setPassbook(String passbook) {
        Passbook = passbook;
    }

    public String getLPC() {
        return LPC;
    }

    public void setLPC(String LPC) {
        this.LPC = LPC;
    }

    public String getSelfAttested() {
        return SelfAttested;
    }

    public void setSelfAttested(String selfAttested) {
        SelfAttested = selfAttested;
    }

    public String getFarmerPhotoPath() {
        return FarmerPhotoPath;
    }

    public void setFarmerPhotoPath(String farmerPhotoPath) {
        FarmerPhotoPath = farmerPhotoPath;
    }

    public String getKhataNo() {
        return khataNo;
    }

    public void setKhataNo(String khataNo) {
        this.khataNo = khataNo;
    }

    public String getKhasraNo() {
        return khasraNo;
    }

    public void setKhasraNo(String khasraNo) {
        this.khasraNo = khasraNo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCropArea() {
        return cropArea;
    }

    public void setCropArea(String cropArea) {
        this.cropArea = cropArea;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPhoto1() {
        return Photo1;
    }

    public void setPhoto1(String photo1) {
        Photo1 = photo1;
    }

    public String getPhoto2() {
        return Photo2;
    }

    public void setPhoto2(String photo2) {
        Photo2 = photo2;
    }

    public String getPhoto3() {
        return Photo3;
    }

    public void setPhoto3(String photo3) {
        Photo3 = photo3;
    }

    public String getPhoto4() {
        return Photo4;
    }

    public void setPhoto4(String photo4) {
        Photo4 = photo4;
    }

    public String getPhoto5() {
        return Photo5;
    }

    public void setPhoto5(String photo5) {
        Photo5 = photo5;
    }

    public String getPic1landLat() {
        return Pic1landLat;
    }

    public void setPic1landLat(String pic1landLat) {
        Pic1landLat = pic1landLat;
    }

    public String getPic1landLong() {
        return Pic1landLong;
    }

    public void setPic1landLong(String pic1landLong) {
        Pic1landLong = pic1landLong;
    }

    public String getPic2landLat() {
        return Pic2landLat;
    }

    public void setPic2landLat(String pic2landLat) {
        Pic2landLat = pic2landLat;
    }

    public String getPic2landLong() {
        return Pic2landLong;
    }

    public void setPic2landLong(String pic2landLong) {
        Pic2landLong = pic2landLong;
    }

    public String getProvisionId() {
        return ProvisionId;
    }

    public void setProvisionId(String provisionId) {
        ProvisionId = provisionId;
    }

    public String getProvisionName() {
        return ProvisionName;
    }

    public void setProvisionName(String provisionName) {
        ProvisionName = provisionName;
    }

    public String getNibandhanSankhya() {
        return NibandhanSankhya;
    }

    public void setNibandhanSankhya(String nibandhanSankhya) {
        NibandhanSankhya = nibandhanSankhya;
    }

    public String getHouseholdid() {
        return Householdid;
    }

    public void setHouseholdid(String householdid) {
        Householdid = householdid;
    }



    public String getEt_fieldwheat() {
        return et_fieldwheat;
    }

    public void setEt_fieldwheat(String et_fieldwheat) {
        this.et_fieldwheat = et_fieldwheat;
    }

    public String getEt_field_makka() {
        return et_field_makka;
    }

    public void setEt_field_makka(String et_field_makka) {
        this.et_field_makka = et_field_makka;
    }

    public String getEt_masoor() {
        return et_masoor;
    }

    public void setEt_masoor(String et_masoor) {
        this.et_masoor = et_masoor;
    }

    public String getEt_arhar() {
        return et_arhar;
    }

    public void setEt_arhar(String et_arhar) {
        this.et_arhar = et_arhar;
    }

    public String getEt_sugarcane() {
        return et_sugarcane;
    }

    public void setEt_sugarcane(String et_sugarcane) {
        this.et_sugarcane = et_sugarcane;
    }

    public String getEt_potato() {
        return et_potato;
    }

    public void setEt_potato(String et_potato) {
        this.et_potato = et_potato;
    }

    public String getEt_raisarso() {
        return et_raisarso;
    }

    public void setEt_raisarso(String et_raisarso) {
        this.et_raisarso = et_raisarso;
    }

    public String getEt_onion() {
        return et_onion;
    }

    public void setEt_onion(String et_onion) {
        this.et_onion = et_onion;
    }

    public String getEt_chana() {
        return et_chana;
    }

    public void setEt_chana(String et_chana) {
        this.et_chana = et_chana;
    }


    public String getElectricity() {
        return electricity;
    }

    public void setElectricity(String electricity) {
        this.electricity = electricity;
    }

    public String getISCOnsumbernumberExist() {
        return ISCOnsumbernumberExist;
    }

    public void setISCOnsumbernumberExist(String ISCOnsumbernumberExist) {
        this.ISCOnsumbernumberExist = ISCOnsumbernumberExist;
    }

    public String getCropTypeKharif() {
        return CropTypeKharif;
    }

    public void setCropTypeKharif(String cropTypeKharif) {
        CropTypeKharif = cropTypeKharif;
    }

    public String getSoyabin() {
        return soyabin;
    }

    public void setSoyabin(String soyabin) {
        this.soyabin = soyabin;
    }

    public String getCropTypeKharifName() {
        return CropTypeKharifName;
    }

    public void setCropTypeKharifName(String cropTypeKharifName) {
        CropTypeKharifName = cropTypeKharifName;
    }

    public String getLpc_rltd_chk_Id() {
        return lpc_rltd_chk_Id;
    }

    public void setLpc_rltd_chk_Id(String lpc_rltd_chk_Id) {
        this.lpc_rltd_chk_Id = lpc_rltd_chk_Id;
    }

    public String getLpc_awedn_chk_Id() {
        return lpc_awedn_chk_Id;
    }

    public void setLpc_awedn_chk_Id(String lpc_awedn_chk_Id) {
        this.lpc_awedn_chk_Id = lpc_awedn_chk_Id;
    }

    public String getGhosit_fasal_khti_Id() {
        return ghosit_fasal_khti_Id;
    }

    public void setGhosit_fasal_khti_Id(String ghosit_fasal_khti_Id) {
        this.ghosit_fasal_khti_Id = ghosit_fasal_khti_Id;
    }

    public String getAawedan_ghosit_rakwa_Id() {
        return aawedan_ghosit_rakwa_Id;
    }

    public void setAawedan_ghosit_rakwa_Id(String aawedan_ghosit_rakwa_Id) {
        this.aawedan_ghosit_rakwa_Id = aawedan_ghosit_rakwa_Id;
    }

    public String getAawedak_one_family_Id() {
        return aawedak_one_family_Id;
    }

    public void setAawedak_one_family_Id(String aawedak_one_family_Id) {
        this.aawedak_one_family_Id = aawedak_one_family_Id;
    }

    public String getEt_aawedan_ghosit_rakwa() {
        return et_aawedan_ghosit_rakwa;
    }

    public void setEt_aawedan_ghosit_rakwa(String et_aawedan_ghosit_rakwa) {
        this.et_aawedan_ghosit_rakwa = et_aawedan_ghosit_rakwa;
    }

    public String getEt_aawedan_ghosit_rakwa_two() {
        return et_aawedan_ghosit_rakwa_two;
    }

    public void setEt_aawedan_ghosit_rakwa_two(String et_aawedan_ghosit_rakwa_two) {
        this.et_aawedan_ghosit_rakwa_two = et_aawedan_ghosit_rakwa_two;
    }

    public String getAawedak_accept() {
        return aawedak_accept;
    }

    public void setAawedak_accept(String aawedak_accept) {
        this.aawedak_accept = aawedak_accept;
    }

    public String getAawedak_reject() {
        return aawedak_reject;
    }

    public void setAawedak_reject(String aawedak_reject) {
        this.aawedak_reject = aawedak_reject;
    }

    public String getCropAreaPaddyFarmer() {
        return cropAreaPaddyFarmer;
    }

    public void setCropAreaPaddyFarmer(String cropAreaPaddyFarmer) {
        this.cropAreaPaddyFarmer = cropAreaPaddyFarmer;
    }

    public String getCropAreaPaddyShare() {
        return cropAreaPaddyShare;
    }

    public void setCropAreaPaddyShare(String cropAreaPaddyShare) {
        this.cropAreaPaddyShare = cropAreaPaddyShare;
    }

    public String getCropAreaMazeeFarmer() {
        return cropAreaMazeeFarmer;
    }

    public void setCropAreaMazeeFarmer(String cropAreaMazeeFarmer) {
        this.cropAreaMazeeFarmer = cropAreaMazeeFarmer;
    }

    public String getCropAreaMazeeShare() {
        return cropAreaMazeeShare;
    }

    public void setCropAreaMazeeShare(String cropAreaMazeeShare) {
        this.cropAreaMazeeShare = cropAreaMazeeShare;
    }

    public String getCropAreaSoyabeenFarmer() {
        return cropAreaSoyabeenFarmer;
    }

    public void setCropAreaSoyabeenFarmer(String cropAreaSoyabeenFarmer) {
        this.cropAreaSoyabeenFarmer = cropAreaSoyabeenFarmer;
    }

    public String getCropAreaSoyabeenShare() {
        return cropAreaSoyabeenShare;
    }

    public void setCropAreaSoyabeenShare(String cropAreaSoyabeenShare) {
        this.cropAreaSoyabeenShare = cropAreaSoyabeenShare;
    }

    public String getSwaghosana_sambandhit_id() {
        return swaghosana_sambandhit_id;
    }

    public void setSwaghosana_sambandhit_id(String swaghosana_sambandhit_id) {
        this.swaghosana_sambandhit_id = swaghosana_sambandhit_id;
    }

    public String getSwaghosana_sambandhit_nm() {
        return swaghosana_sambandhit_nm;
    }

    public void setSwaghosana_sambandhit_nm(String swaghosana_sambandhit_nm) {
        this.swaghosana_sambandhit_nm = swaghosana_sambandhit_nm;
    }

    public String getSwaghosana_signer_name() {
        return swaghosana_signer_name;
    }

    public void setSwaghosana_signer_name(String swaghosana_signer_name) {
        this.swaghosana_signer_name = swaghosana_signer_name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getAawedan_karta_Id() {
        return aawedan_karta_Id;
    }

    public void setAawedan_karta_Id(String aawedan_karta_Id) {
        this.aawedan_karta_Id = aawedan_karta_Id;
    }

    public String getAawedan_karta_Nm() {
        return aawedan_karta_Nm;
    }

    public void setAawedan_karta_Nm(String aawedan_karta_Nm) {
        this.aawedan_karta_Nm = aawedan_karta_Nm;


    }

    public String getSwaghosana_sambandhit_signer_nm() {
        return swaghosana_sambandhit_signer_nm;
    }

    public void setSwaghosana_sambandhit_signer_nm(String swaghosana_sambandhit_signer_nm) {
        this.swaghosana_sambandhit_signer_nm = swaghosana_sambandhit_signer_nm;
    }

    public String getSwaghona_upload() {
        return swaghona_upload;
    }

    public void setSwaghona_upload(String swaghona_upload) {
        this.swaghona_upload = swaghona_upload;
    }

    public String getSwaghona_patra_aawedakrta() {
        return swaghona_patra_aawedakrta;
    }

    public void setSwaghona_patra_aawedakrta(String swaghona_patra_aawedakrta) {
        this.swaghona_patra_aawedakrta = swaghona_patra_aawedakrta;
    }

    public String getElectric_id() {
        return electric_id;
    }

    public void setElectric_id(String electric_id) {
        this.electric_id = electric_id;
    }

    public String getElectric_nm() {
        return electric_nm;
    }

    public void setElectric_nm(String electric_nm) {
        this.electric_nm = electric_nm;
    }

    public String getElectric_avail_id() {
        return electric_avail_id;
    }

    public void setElectric_avail_id(String electric_avail_id) {
        this.electric_avail_id = electric_avail_id;
    }

    public String getElectric_avail_nm() {
        return electric_avail_nm;
    }

    public void setElectric_avail_nm(String electric_avail_nm) {
        this.electric_avail_nm = electric_avail_nm;
    }
}
