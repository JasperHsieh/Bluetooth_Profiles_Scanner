package com.sdpscanner.android;

import android.os.ParcelUuid;


import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;

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

    public static HashSet<Integer> A2dpProfileServices =
	        new HashSet<Integer>(Arrays.asList(AudioSourceService, AudioSinkService, AdvancedAudioDistributionService));
	public static HashSet<Integer> AvrcpProfileServices =
	        new HashSet<Integer>(Arrays.asList(AudioVideoRemoteControlTargetService, AudioVideoRemoteControlService));
	public static HashSet<Integer> BipProfileServices  =
	        new HashSet<Integer>(Arrays.asList(ImagingService, ImagingResponderService, ImagingAutomaticArchiveService, ImagingReferencedObjectsService));
	public static HashSet<Integer> BppProfileServices =
	        new HashSet<Integer>(Arrays.asList(DirectPrintingService, DirectPrintingService, DirectPrintingReferenceObjectsService, ReflectedUIService, BasicPrintingService, PrintingStatusService));
	//private HashSet<Integer> DiProfileServices =
	//        new HashSet<Integer>(Arrays.asList());
	public static HashSet<Integer> DunProfileServices =
	        new HashSet<Integer>(Arrays.asList(DialupNetworkingService));
	public static HashSet<Integer> FtpProfileServices =
	        new HashSet<Integer>(Arrays.asList(OBEXFileTransferService));
	//private HashSet<Integer>  GavdpProfileServices =
	//        new HashSet<Integer>(Arrays.asList());
	//private HashSet<Integer>  GoepProfileServices =
	//        new HashSet<Integer>(Arrays.asList());
	public static HashSet<Integer> HfpProfileServices =
	        new HashSet<Integer>(Arrays.asList(HandsfreeService, HandsfreeAudioGatewayService));
	//private HashSet<Integer>  HcrpProfileServices =
	//        new HashSet<Integer>(Arrays.asList());
	//private HashSet<Integer>  HdpProfileServices =
	//        new HashSet<Integer>(Arrays.asList());
	public static HashSet<Integer> HspProfileServices =
	        new HashSet<Integer>(Arrays.asList(HeadsetService, HeadsetAudioGatewayService));
	//private HashSet<Integer>  HidProfileServices =
	//        new HashSet<Integer>(Arrays.asList());
	public static HashSet<Integer> MapProfileServices =
	        new HashSet<Integer>(Arrays.asList(MASService, MNSService, MAPService));
	//private HashSet<Integer>  MpsProfileServices =
	//        new HashSet<Integer>(Arrays.asList());
	public static HashSet<Integer> OppProfileServices =
	        new HashSet<Integer>(Arrays.asList(OBEXObjectPushService));
	public static HashSet<Integer> PbapProfileServices =
	        new HashSet<Integer>(Arrays.asList(PhonebookAccessService, PhonebookAccessPSEService, PhonebookAccessPCEService));
	public static HashSet<Integer> PanProfileServices =
	        new HashSet<Integer>(Arrays.asList(GNService, PANUService, NAPService));
	public static HashSet<Integer> SapProfileServices =
	        new HashSet<Integer>(Arrays.asList(SIM_AccessService));
	//private HashSet<Integer> SdapProfile =
	//        new HashSet<Integer>(Arrays.asList());
	public static HashSet<Integer> SppProfileServices =
	        new HashSet<Integer>(Arrays.asList(SerialPortService));
	public static HashSet<Integer> SyncProfileServices =
	        new HashSet<Integer>(Arrays.asList(IrMCSyncService, IrMCSyncCommandService));
	public static HashSet<Integer> VdpProfileServices =
	        new HashSet<Integer>(Arrays.asList(VideoSourceService, VideoSinkService, VideoDistributionService));

	public int getProfileName(){
	    return mName;
	}

	public ArrayList<Integer> getServices(){
	    return mServices;
	}

	public void AddService(Integer service){
        mServices.add(service);
	}

    public boolean containService(Integer service){
	    return mServices.contains(service);
	}

	public int getServicesCount(){
	    return mServices.size();
	}

	public void cleanUpServices(){
	    mServices.clear();
	}

    public String getReadableProfileName(){

		switch(mName){
		    case A2dpProfile:
			    return "Advanced Audio Distribution Profile (A2DP)";
			case AvrcpProfile:
			    return "Audio/Video Remote Control Profile (AVRCP)";
			case BipProfile:
			    return "Basic Imaging Profile (BIP)";
			case BppProfile:
			    return "Basic Printing Profile";
			case DiProfile:
			    return "Device Identification Profile (DI)";
			case DunProfile:
			    return "Dial-Up Network Profile (DUN)";
			case FtpProfile:
			    return "File Transfer Profile (FTP)";
			case GavdpProfile:
			    return "Generic Audio/Video Distribution Profile (GAVDP)";
			case GoepProfile:
			    return "Generic Object Profile (GOEP)";
			case HfpProfile:
			    return "Hands-Free Profile (HFP)";
			case HcrpProfile:
			    return "Hard Copy Cable Replacement (HCRP)";
			case HdpProfile:
			    return "Health Device Profile (HDP)";
			case HspProfile:
			    return "Headset Profile (HSP)";
			case HidProfile:
			    return "Human Interface Device Profile (HID)";
			case MapProfile:
			    return "Message Access Profile (MAP)";
			case MpsProfile:
			    return "Multi Profile Specification (MPS)";
			case OppProfile:
			    return "Object Push Profile (OPP)";
			case PbapProfile:
			    return "Phone Book Access Profile (PBAP)";
			case PanProfile:
			    return "Personal Area Network Profile (PAN)";
			case SapProfile:
			    return "SIM Access Profile (SAP)";
			case SdapProfile:
			    return "Service Discovery Application Profile (SDAP)";
			case SppProfile:
			    return "Serial Port Profile (SPP)";
			case SyncProfile:
			    return "Synchronization Profile (SYNC)";
			case VdpProfile:
			    return "Video Distribution Profile (VDP)";
			case UnknowProfile:
			    return "Other Services";
			default:
			    //Log.d(TAG, "Wrong Profile Name");
				return "Wrong Profile Name";
		}
	}

    public String getReadableServiceName(int service){

		switch(service){
		    case ServiceDiscoveryServerServiceClassIDService:
			    return "Service Discovery Server Service ClassID Service";
		    case BrowseGroupDescriptorServiceClassIDService:
			    return "Browse Group Descriptor Service ClassID Service";
		    case PublicBrowseGroupService:
			    return "Public Browse Group Service";
		    case SerialPortService:
			    return "Serial Port Service";
		    case LANAccessUsingPPPService:
			    return "LAN Access Using PPP Service";
		    case DialupNetworkingService:
			    return "Dial-up Networking Service";
		    case IrMCSyncService:
			    return "IrMCSync Service";
		    case OBEXObjectPushService:
			    return "OBEX Object Push Service";
		    case OBEXFileTransferService:
			    return "OBEX File Transfer Service";
		    case IrMCSyncCommandService:
			    return "IrMC Sync Command Service";
		    case HeadsetService:
			    return "Headset Service";
		    case CordlessTelephonyService:
			    return "Cordless Telephony Service";
		    case AudioSourceService:
			    return "Audio Source Service";
		    case AudioSinkService:
			    return "Audio Sink Service";
		    case AudioVideoRemoteControlTargetService:
			    return "Audio Video Remote Control Target Service";
		    case AdvancedAudioDistributionService:
			    return "Advanced Audio Distribution Service";
		    case AudioVideoRemoteControlService:
			    return "Audio Video Remote Control Service";
		    case VideoConferencingService:
			    return "Video Conferencing Service";
		    case IntercomService:
			    return "Intercom Service";
		    case FaxService:
			    return "Fax Service";
		    case HeadsetAudioGatewayService:
			    return "Headset Audio Gateway Service";
		    case WAPService:
			    return "WAP Service";
		    case WAP_CLIENTService:
			    return "WAP_CLIENT Service";
		    case PANUService:
			    return "PANU Service";
		    case NAPService:
			    return "NAP Service";
		    case GNService:
			    return "GN Service";
		    case DirectPrintingService:
			    return "Direct Printing Service";
		    case ReferencePrintingService:
			    return "Reference Printing Service";
		    case ImagingService:
			    return "Imaging Service";
		    case ImagingResponderService:
			    return "Imaging Responder Service";
		    case ImagingAutomaticArchiveService:
			    return "Imaging Automatic Archive Service";
		    case ImagingReferencedObjectsService:
			    return "Imaging Referenced Objects Service";
		    case HandsfreeService:
			    return "Hands free Service";
		    case HandsfreeAudioGatewayService:
			    return "Hands free Audio Gateway Service";
		    case DirectPrintingReferenceObjectsService:
			    return "Direct Printing Reference Objects Service";
		    case ReflectedUIService:
			    return "Reflected UI Service";
		    case BasicPrintingService:
			    return "Basic Printing Service";
		    case PrintingStatusService:
			    return "Printing Status Service";
		    case HumanInterfaceDeviceService:
			    return "Human Interface Device Service";
		    case HardcopyCableReplacementService:
			    return "Hardcopy Cable Replacement Service";
		    case HCR_PrintService:
			    return "HCR_Print Service";
		    case HCR_ScanService:
			    return "HCR_Scan Service";
		    case Common_ISDN_AccessService:
			    return "Common_ISDN_Access Service";
		    case VideoConferencingGWService:
			    return "Video Conferencing GW Service";
		    case UDI_MTService:
			    return "UDI_MT Service";
		    case UDI_TAService:
			    return "UDI_TA Service";
		    case Audio_VideoService:
			    return "Audio_Video Service";
		    case SIM_AccessService:
			    return "SIM_Access Service";
		    case PhonebookAccessPCEService:
			    return "Phonebook Access PCE Service";
		    case PhonebookAccessPSEService:
			    return "Phonebook Access PSE Service";
		    case PhonebookAccessService:
			    return "Phonebook Access Service";
		    case PnPInformationService:
			    return "PnP Information Service";
		    case GenericNetworkingService:
			    return "Generic Networking Service";
		    case GenericFileTransferService:
			    return "Generic File Transfer Service";
		    case GenericAudioService:
			    return "Generic Audio Service";
		    case GenericTelephonyService:
			    return "Generic Telephony Service";
		    case UPNP_ServiceService:
			    return "UPNP Service";
		    case UPNP_IP_ServiceService:
			    return "UPNP_IP Service";
		    case ESDP_UPNP_IP_PANService:
			    return "ESDP_UPNP_IP_PAN Service";
		    case ESDP_UPNP_IP_LAPService:
			    return "ESDP_UPNP_IP_LAP Service";
		    case ESDP_UPNP_L2CAPService:
			    return "ESDP_UPNP_L2CAP Service";
		    case VideoSourceService:
			    return "Video Source Service";
		    case VideoSinkService:
			    return "Video Sink Service";
		    case VideoDistributionService:
			    return "Video Distribution Service";
		    case MASService:
			    return "MAS Service";
		    case MNSService:
			    return "MNS Service";
		    case MAPService:
			    return "MAP Service";
		    default:
			    return "Unknow Service";
		}
	}

    public String getUuid(int service){

		switch(service){
		    case ServiceDiscoveryServerServiceClassIDService:
			    return BluetoothAllUuid.ServiceDiscoveryServerServiceClassID.toString();
		    case BrowseGroupDescriptorServiceClassIDService:
			    return BluetoothAllUuid.BrowseGroupDescriptorServiceClassID.toString();
		    case PublicBrowseGroupService:
			    return BluetoothAllUuid.PublicBrowseGroup.toString();
		    case SerialPortService:
			    return BluetoothAllUuid.SerialPort.toString();
		    case LANAccessUsingPPPService:
			    return BluetoothAllUuid.LANAccessUsingPPP.toString();
		    case DialupNetworkingService:
			    return BluetoothAllUuid.DialupNetworking.toString();
		    case IrMCSyncService:
			    return BluetoothAllUuid.IrMCSync.toString();
		    case OBEXObjectPushService:
			    return BluetoothAllUuid.OBEXObjectPush.toString();
		    case OBEXFileTransferService:
			    return BluetoothAllUuid.OBEXFileTransfer.toString();
		    case IrMCSyncCommandService:
			    return BluetoothAllUuid.IrMCSyncCommand.toString();
		    case HeadsetService:
			    return BluetoothAllUuid.Headset.toString();
		    case CordlessTelephonyService:
			    return BluetoothAllUuid.CordlessTelephony.toString();
		    case AudioSourceService:
			    return BluetoothAllUuid.AudioSource.toString();
		    case AudioSinkService:
			    return BluetoothAllUuid.AudioSink.toString();
		    case AudioVideoRemoteControlTargetService:
			    return BluetoothAllUuid.AvrcpTarget.toString();
		    case AdvancedAudioDistributionService:
			    return BluetoothAllUuid.AdvancedAudioDistribution.toString();
		    case AudioVideoRemoteControlService:
			    return BluetoothAllUuid.AvrcpController.toString();
		    case VideoConferencingService:
			    return BluetoothAllUuid.VideoConferencing.toString();
		    case IntercomService:
			    return BluetoothAllUuid.Intercom.toString();
		    case FaxService:
			    return BluetoothAllUuid.Fax.toString();
		    case HeadsetAudioGatewayService:
			    return BluetoothAllUuid.HeadsetAudioGateway.toString();
		    case WAPService:
			    return BluetoothAllUuid.WAP.toString();
		    case WAP_CLIENTService:
			    return BluetoothAllUuid.WAP_CLIENT.toString();
		    case PANUService:
			    return BluetoothAllUuid.PANU.toString();
		    case NAPService:
			    return BluetoothAllUuid.NAP.toString();
		    case GNService:
			    return BluetoothAllUuid.GN.toString();
		    case DirectPrintingService:
			    return BluetoothAllUuid.DirectPrinting.toString();
		    case ReferencePrintingService:
			    return BluetoothAllUuid.ReferencePrinting.toString();
		    case ImagingService:
			    return BluetoothAllUuid.Imaging.toString();
		    case ImagingResponderService:
			    return BluetoothAllUuid.ImagingResponder.toString();
		    case ImagingAutomaticArchiveService:
			    return BluetoothAllUuid.ImagingAutomaticArchive.toString();
		    case ImagingReferencedObjectsService:
			    return BluetoothAllUuid.ImagingReferencedObjects.toString();
		    case HandsfreeService:
			    return BluetoothAllUuid.Handsfree.toString();
		    case HandsfreeAudioGatewayService:
			    return BluetoothAllUuid.HandsfreeAudioGateway.toString();
		    case DirectPrintingReferenceObjectsService:
			    return BluetoothAllUuid.DirectPrintingReferenceObjectsService.toString();
		    case ReflectedUIService:
			    return BluetoothAllUuid.ReflectedUI.toString();
		    case BasicPrintingService:
			    return BluetoothAllUuid.BasicPrinting.toString();
		    case PrintingStatusService:
			    return BluetoothAllUuid.PrintingStatus.toString();
		    case HumanInterfaceDeviceService:
			    return BluetoothAllUuid.HumanInterfaceDeviceService.toString();
		    case HardcopyCableReplacementService:
			    return BluetoothAllUuid.HardcopyCableReplacement.toString();
		    case HCR_PrintService:
			    return BluetoothAllUuid.HCR_Print.toString();
		    case HCR_ScanService:
			    return BluetoothAllUuid.HCR_Scan.toString();
		    case Common_ISDN_AccessService:
			    return BluetoothAllUuid.Common_ISDN_Access.toString();
		    case VideoConferencingGWService:
			    return BluetoothAllUuid.VideoConferencingGW.toString();
		    case UDI_MTService:
			    return BluetoothAllUuid.UDI_MT.toString();
		    case UDI_TAService:
			    return BluetoothAllUuid.UDI_TA.toString();
		    case Audio_VideoService:
			    return BluetoothAllUuid.AudioVideo.toString();
		    case SIM_AccessService:
			    return BluetoothAllUuid.SIM_Access.toString();
		    case PhonebookAccessPCEService:
			    return BluetoothAllUuid.PBAP_PCE.toString();
		    case PhonebookAccessPSEService:
			    return BluetoothAllUuid.PBAP_PSE.toString();
		    case PhonebookAccessService:
			    return BluetoothAllUuid.PBAP.toString();
		    case PnPInformationService:
			    return BluetoothAllUuid.PnPInformation.toString();
		    case GenericNetworkingService:
			    return BluetoothAllUuid.GenericNetworking.toString();
		    case GenericFileTransferService:
			    return BluetoothAllUuid.GenericFileTransfer.toString();
		    case GenericAudioService:
			    return BluetoothAllUuid.GenericAudio.toString();
		    case GenericTelephonyService:
			    return BluetoothAllUuid.GenericTelephony.toString();
		    case UPNP_ServiceService:
			    return BluetoothAllUuid.UPNP_Service.toString();
		    case UPNP_IP_ServiceService:
			    return BluetoothAllUuid.UPNP_IP_Service.toString();
		    case ESDP_UPNP_IP_PANService:
			    return BluetoothAllUuid.ESDP_UPNP_IP_PAN.toString();
		    case ESDP_UPNP_IP_LAPService:
			    return BluetoothAllUuid.ESDP_UPNP_IP_LAP.toString();
		    case ESDP_UPNP_L2CAPService:
			    return BluetoothAllUuid.ESDP_UPNP_L2CAP.toString();
		    case VideoSourceService:
			    return BluetoothAllUuid.VideoSource.toString();
		    case VideoSinkService:
			    return BluetoothAllUuid.VideoSink.toString();
		    case VideoDistributionService:
			    return BluetoothAllUuid.VideoDistribution.toString();
		    case MASService:
			    return BluetoothAllUuid.MAS.toString();
		    case MNSService:
			    return BluetoothAllUuid.MNS.toString();
		    case MAPService:
			    return BluetoothAllUuid.MAP.toString();
		    default:
			    return "Unknow Service";
		}
	}

}


