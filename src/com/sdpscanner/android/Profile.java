package com.sdpscanner.android;


import java.util.ArrayList;

public class Profile{

    private int mName;
	private ArrayList<Integer> mServices;
    
	Profile(int name){
		mName = name;
		mServices = new ArrayList();
	}


    public static final int A2dpProfile = 1;
    public static final int AvrcpProfile = 2;
	public static final int DunProfile = 3;
	public static final int FtpProfile = 4;
    public static final int HfpProfile = 5;
	public static final int HspProfile = 6;
    public static final int MapProfile = 7;
	public static final int OppProfile = 8;
	public static final int PbapProfile = 9;
	public static final int PanProfile = 10;
	public static final int SapProfile = 11;

    public static final int UnknowProfile = -1;
	public static final int UnknowService = -2;
	
	public static final int ServiceDiscoveryServerServiceClassIDService = 21;
	public static final int BrowseGroupDescriptorServiceClassIDService = 22;
	public static final int PublicBrowseGroupService = 23;
	public static final int SerialPortService = 24;
	public static final int LANAccessUsingPPPService = 25;
	public static final int DialupNetworkingService = 26;
	public static final int IrMCSyncService = 27;
	public static final int OBEXObjectPushService = 28;
	public static final int OBEXFileTransferService = 29;
	public static final int IrMCSyncCommandService = 30;
	public static final int HeadsetService = 31;
	public static final int CordlessTelephonyService = 32;
	public static final int AudioSourceService = 33;
	public static final int AudioSinkService = 34;
	public static final int AudioVideoRemoteControlTargetService = 35;
	public static final int AdvancedAudioDistributionService = 36;
	public static final int AudioVideoRemoteControlService = 37;
	public static final int VideoConferencingService = 38;
	public static final int IntercomService = 39;
	public static final int FaxService = 40;
	public static final int HeadsetAudioGatewayService = 41;
	public static final int WAPService = 42;
	public static final int WAP_CLIENTService = 43;
	public static final int PANUService = 44;
	public static final int NAPService = 45;
	public static final int GNService = 46;
	public static final int DirectPrintingService = 47;
	public static final int ReferencePrintingService = 48;
	public static final int ImagingService = 49;
	public static final int ImagingResponderService = 50;
	public static final int ImagingAutomaticArchiveService = 51;
	public static final int ImagingReferencedObjectsService = 52;
	public static final int HandsfreeService = 53;
	public static final int HandsfreeAudioGatewayService = 54;
	public static final int DirectPrintingReferenceObjectsService = 55; 
	public static final int ReflectedUIService = 56;
	public static final int BasicPrintingService = 57;
	public static final int PrintingStatusService = 58;
	public static final int HumanInterfaceDeviceService = 59;
	public static final int HardcopyCableReplacementService = 60;
	public static final int HCR_PrintService = 61;
	public static final int HCR_ScanService = 62;
	public static final int Common_ISDN_AccessService = 63;
	public static final int VideoConferencingGWService = 64;
	public static final int UDI_MTService = 65;
	public static final int UDI_TAService = 66;
	public static final int Audio_VideoService = 67;
	public static final int SIM_AccessService = 68;
	public static final int PhonebookAccessPCEService = 69;
	public static final int PhonebookAccessPSEService = 70;
	public static final int PhonebookAccessService = 71;
	public static final int PnPInformationService = 72;
	public static final int GenericNetworkingService = 73;
	public static final int GenericFileTransferService = 74;
	public static final int GenericAudioService = 75;
	public static final int GenericTelephonyService = 76;
	public static final int UPNP_ServiceService = 77;
	public static final int UPNP_IP_ServiceService = 78;
	public static final int ESDP_UPNP_IP_PANService = 79;
	public static final int ESDP_UPNP_IP_LAPService = 80;
	public static final int ESDP_UPNP_L2CAPService = 81;
	public static final int VideoSourceService = 82;
	public static final int VideoSinkService = 83;
	public static final int VideoDistributionService = 84;
	public static final int MASService = 85;
	public static final int MNSService = 86;
	public static final int MAPService = 87;

}


