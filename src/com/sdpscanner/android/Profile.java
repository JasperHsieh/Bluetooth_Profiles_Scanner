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
	public static final int BipProfile = 3;
	public static final int BppProfile = 4;
	public static final int DiProfile = 5;
	public static final int DunProfile = 6;
	public static final int FtpProfile = 7;
	public static final int GavdpProfile = 8;
	public static final int GoepProfile = 9;
    public static final int HfpProfile = 10;
	public static final int HcrpProfile = 11;
	public static final int HdpProfile = 12;
	public static final int HspProfile = 13;
	public static final int HidProfile = 14;
    public static final int MapProfile = 15;
	public static final int MpsProfile = 16;
	public static final int OppProfile = 17;
	public static final int PbapProfile = 18;
	public static final int PanProfile = 19;
	public static final int SapProfile = 20;
	public static final int SdapProfile = 21;
	public static final int SppProfile = 22;
	public static final int SyncProfile = 23;
	public static final int VdpProfile = 24;

    public static final int UnknowProfile = -1;
	public static final int UnknowService = -2;
	
	public static final int ServiceDiscoveryServerServiceClassIDService = 100;
	public static final int BrowseGroupDescriptorServiceClassIDService = 101;
	public static final int PublicBrowseGroupService = 102;
	public static final int SerialPortService = 103;
	public static final int LANAccessUsingPPPService = 104;
	public static final int DialupNetworkingService = 105;
	public static final int IrMCSyncService = 106;
	public static final int OBEXObjectPushService = 107;
	public static final int OBEXFileTransferService = 108;
	public static final int IrMCSyncCommandService = 109;
	public static final int HeadsetService = 110;
	public static final int CordlessTelephonyService = 111;
	public static final int AudioSourceService = 112;
	public static final int AudioSinkService = 113;
	public static final int AudioVideoRemoteControlTargetService = 114;
	public static final int AdvancedAudioDistributionService = 115;
	public static final int AudioVideoRemoteControlService = 116;
	public static final int VideoConferencingService = 117;
	public static final int IntercomService = 118;
	public static final int FaxService = 119;
	public static final int HeadsetAudioGatewayService = 120;
	public static final int WAPService = 121;
	public static final int WAP_CLIENTService = 122;
	public static final int PANUService = 123;
	public static final int NAPService = 124;
	public static final int GNService = 125;
	public static final int DirectPrintingService = 126;
	public static final int ReferencePrintingService = 127;
	public static final int ImagingService = 128;
	public static final int ImagingResponderService = 129;
	public static final int ImagingAutomaticArchiveService = 130;
	public static final int ImagingReferencedObjectsService = 131;
	public static final int HandsfreeService = 132;
	public static final int HandsfreeAudioGatewayService = 133;
	public static final int DirectPrintingReferenceObjectsService = 134;
	public static final int ReflectedUIService = 135;
	public static final int BasicPrintingService = 136;
	public static final int PrintingStatusService = 137;
	public static final int HumanInterfaceDeviceService = 138;
	public static final int HardcopyCableReplacementService = 139;
	public static final int HCR_PrintService = 140;
	public static final int HCR_ScanService = 141;
	public static final int Common_ISDN_AccessService = 142;
	public static final int VideoConferencingGWService = 143;
	public static final int UDI_MTService = 144;
	public static final int UDI_TAService = 145;
	public static final int Audio_VideoService = 146;
	public static final int SIM_AccessService = 147;
	public static final int PhonebookAccessPCEService = 148;
	public static final int PhonebookAccessPSEService = 149;
	public static final int PhonebookAccessService = 150;
	public static final int PnPInformationService = 151;
	public static final int GenericNetworkingService = 152;
	public static final int GenericFileTransferService = 153;
	public static final int GenericAudioService = 154;
	public static final int GenericTelephonyService = 155;
	public static final int UPNP_ServiceService = 156;
	public static final int UPNP_IP_ServiceService = 157;
	public static final int ESDP_UPNP_IP_PANService = 158;
	public static final int ESDP_UPNP_IP_LAPService = 159;
	public static final int ESDP_UPNP_L2CAPService = 160;
	public static final int VideoSourceService = 161;
	public static final int VideoSinkService = 162;
	public static final int VideoDistributionService = 163;
	public static final int MASService = 164;
	public static final int MNSService = 165;
	public static final int MAPService = 166;

}


