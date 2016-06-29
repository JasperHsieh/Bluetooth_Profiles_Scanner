package com.sdpscanner.android;

import android.os.ParcelUuid;
import android.os.Parcelable;


import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;

public final class BluetoothAllUuid{


	/* See Bluetooth Assigned Numbers document - SDP section, to get the values of UUIDs
    * for the various services.
    *
    * The following 128 bit values are calculated as:
    *  uuid * 2^96 + BASE_UUID
    */

    public static final ParcelUuid BASE_UUID =
	        ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid ServiceDiscoveryServerServiceClassID =
	        ParcelUuid.fromString("00001000-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid BrowseGroupDescriptorServiceClassID =
	        ParcelUuid.fromString("00001001-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid PublicBrowseGroup =
	        ParcelUuid.fromString("00001002-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid SerialPort =
	        ParcelUuid.fromString("00001101-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid LANAccessUsingPPP =
	        ParcelUuid.fromString("00001102-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid DialupNetworking =
	        ParcelUuid.fromString("00001103-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid IrMCSync =
	        ParcelUuid.fromString("00001104-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid OBEXObjectPush =
	        ParcelUuid.fromString("00001105-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid OBEXFileTransfer =
	        ParcelUuid.fromString("00001106-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid IrMCSyncCommand =
	        ParcelUuid.fromString("00001107-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid Headset =
	        ParcelUuid.fromString("00001108-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid CordlessTelephony =
	        ParcelUuid.fromString("00001109-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid AudioSource =
	        ParcelUuid.fromString("0000110A-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid AudioSink =
	        ParcelUuid.fromString("0000110B-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid AvrcpTarget =
	        ParcelUuid.fromString("0000110C-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid AdvancedAudioDistribution =
	        ParcelUuid.fromString("0000110D-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid AvrcpController =
	        ParcelUuid.fromString("0000110E-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid VideoConferencing =
	        ParcelUuid.fromString("0000110F-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid Intercom =
	        ParcelUuid.fromString("00001110-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid Fax =
	        ParcelUuid.fromString("00001111-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid HeadsetAudioGateway =
	        ParcelUuid.fromString("00001112-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid WAP =
	        ParcelUuid.fromString("00001113-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid WAP_CLIENT =
	        ParcelUuid.fromString("00001114-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid PANU =
	        ParcelUuid.fromString("00001115-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid NAP =
	        ParcelUuid.fromString("00001116-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid GN =
	        ParcelUuid.fromString("00001117-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid DirectPrinting =
	        ParcelUuid.fromString("00001118-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid ReferencePrinting =
	        ParcelUuid.fromString("00001119-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid Imaging =
	        ParcelUuid.fromString("0000111A-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid ImagingResponder =
	        ParcelUuid.fromString("0000111B-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid ImagingAutomaticArchive =
	        ParcelUuid.fromString("0000111C-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid ImagingReferencedObjects =
	        ParcelUuid.fromString("0000111D-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid Handsfree =
	        ParcelUuid.fromString("0000111E-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid HandsfreeAudioGateway =
	        ParcelUuid.fromString("0000111F-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid DirectPrintingReferenceObjectsService =
	        ParcelUuid.fromString("00001120-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid ReflectedUI =
	        ParcelUuid.fromString("00001121-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid BasicPrinting =
	        ParcelUuid.fromString("00001122-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid PrintingStatus =
	        ParcelUuid.fromString("00001123-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid HumanInterfaceDeviceService =
	        ParcelUuid.fromString("00001124-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid HardcopyCableReplacement =
	        ParcelUuid.fromString("00001125-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid HCR_Print =
	        ParcelUuid.fromString("00001126-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid HCR_Scan =
	        ParcelUuid.fromString("00001127-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid Common_ISDN_Access =
	        ParcelUuid.fromString("00001128-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid VideoConferencingGW =
	        ParcelUuid.fromString("00001129-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid UDI_MT =
	        ParcelUuid.fromString("0000112A-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid UDI_TA =
	        ParcelUuid.fromString("0000112B-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid AudioVideo =
	        ParcelUuid.fromString("0000112C-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid SIM_Access =
	        ParcelUuid.fromString("0000112D-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid PBAP_PCE=
	        ParcelUuid.fromString("0000112E-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid PBAP_PSE=
	        ParcelUuid.fromString("0000112F-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid PBAP =
	        ParcelUuid.fromString("00001130-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid MAS =
	        ParcelUuid.fromString("00001132-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid MNS =
	        ParcelUuid.fromString("00001133-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid MAP =
	        ParcelUuid.fromString("00001134-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid PnPInformation =
	        ParcelUuid.fromString("00001200-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid GenericNetworking =
	        ParcelUuid.fromString("00001201-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid GenericFileTransfer =
	        ParcelUuid.fromString("00001202-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid GenericAudio =
	        ParcelUuid.fromString("00001203-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid GenericTelephony =
	        ParcelUuid.fromString("00001204-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid UPNP_Service =
	        ParcelUuid.fromString("00001205-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid UPNP_IP_Service =
	        ParcelUuid.fromString("00001206-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid ESDP_UPNP_IP_PAN =
	        ParcelUuid.fromString("00001300-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid ESDP_UPNP_IP_LAP =
	        ParcelUuid.fromString("00001301-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid ESDP_UPNP_L2CAP =
	        ParcelUuid.fromString("00001302-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid VideoSource =
	        ParcelUuid.fromString("00001303-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid VideoSink =
	        ParcelUuid.fromString("00001304-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid VideoDistribution =
	        ParcelUuid.fromString("00001305-0000-1000-8000-00805F9B34FB");
	public static final ParcelUuid BNEP =
	        ParcelUuid.fromString("0000000f-0000-1000-8000-00805F9B34FB");


	public static HashSet<ParcelUuid> A2dpProfileServices =
	        new HashSet<ParcelUuid>(Arrays.asList(AudioSource, AudioSink, AdvancedAudioDistribution));
	public static HashSet<ParcelUuid> AvrcpProfileServices =
	        new HashSet<ParcelUuid>(Arrays.asList(AvrcpTarget, AvrcpController));
	public static HashSet<ParcelUuid> BipProfileServices  =
	        new HashSet<ParcelUuid>(Arrays.asList(Imaging, ImagingResponder, ImagingAutomaticArchive, ImagingReferencedObjects));
	public static HashSet<ParcelUuid> BppProfileServices =
	        new HashSet<ParcelUuid>(Arrays.asList(DirectPrinting, DirectPrinting, DirectPrintingReferenceObjectsService, ReflectedUI, BasicPrinting, PrintingStatus));
	//private HashSet<ParcelUuid> DiProfileServices =
	//        new HashSet<ParcelUuid>(Arrays.asList());
	public static HashSet<ParcelUuid> DunProfileServices =
	        new HashSet<ParcelUuid>(Arrays.asList(DialupNetworking));
	public static HashSet<ParcelUuid> FtpProfileServices =
	        new HashSet<ParcelUuid>(Arrays.asList(OBEXFileTransfer));
	//private HashSet<ParcelUuid>  GavdpProfileServices =
	//        new HashSet<ParcelUuid>(Arrays.asList());
	//private HashSet<ParcelUuid>  GoepProfileServices =
	//        new HashSet<ParcelUuid>(Arrays.asList());
	public static HashSet<ParcelUuid> HfpProfileServices =
	        new HashSet<ParcelUuid>(Arrays.asList(Handsfree, HandsfreeAudioGateway));
	//private HashSet<ParcelUuid>  HcrpProfileServices =
	//        new HashSet<ParcelUuid>(Arrays.asList());
	//private HashSet<ParcelUuid>  HdpProfileServices =
	//        new HashSet<ParcelUuid>(Arrays.asList());
	public static HashSet<ParcelUuid> HspProfileServices =
	        new HashSet<ParcelUuid>(Arrays.asList(Headset, HeadsetAudioGateway));
	//private HashSet<ParcelUuid>  HidProfileServices =
	//        new HashSet<ParcelUuid>(Arrays.asList());
	public static HashSet<ParcelUuid> MapProfileServices =
	        new HashSet<ParcelUuid>(Arrays.asList(MAS, MNS, MAP));
	//private HashSet<ParcelUuid>  MpsProfileServices =
	//        new HashSet<ParcelUuid>(Arrays.asList());
	public static HashSet<ParcelUuid> OppProfileServices =
	        new HashSet<ParcelUuid>(Arrays.asList(OBEXObjectPush));
	public static HashSet<ParcelUuid> PbapProfileServices =
	        new HashSet<ParcelUuid>(Arrays.asList(PBAP, PBAP_PSE, PBAP_PCE));
	public static HashSet<ParcelUuid> PanProfileServices =
	        new HashSet<ParcelUuid>(Arrays.asList(GN, PANU, NAP));
	public static HashSet<ParcelUuid> SapProfileServices =
	        new HashSet<ParcelUuid>(Arrays.asList(SIM_Access));
	//private HashSet<ParcelUuid> SdapProfile =
	//        new HashSet<ParcelUuid>(Arrays.asList());
	public static HashSet<ParcelUuid> SppProfileServices =
	        new HashSet<ParcelUuid>(Arrays.asList(SerialPort));
	public static HashSet<ParcelUuid> SyncProfileServices =
	        new HashSet<ParcelUuid>(Arrays.asList(IrMCSync, IrMCSyncCommand));
	public static HashSet<ParcelUuid> VdpProfileServices =
	        new HashSet<ParcelUuid>(Arrays.asList(VideoSource, VideoSink, VideoDistribution));

	public int getProfileFromUuid(Parcelable uuid){

        if(A2dpProfileServices.contains(uuid)){
		    return Profile.A2dpProfile;
		} else if(AvrcpProfileServices.contains(uuid)){
		    return Profile.AvrcpProfile;
		} else if(BipProfileServices.contains(uuid)){
		    return Profile.BipProfile;
		} else if(BppProfileServices.contains(uuid)){
		    return Profile.BppProfile;
		} else if(DunProfileServices.contains(uuid)){
		    return Profile.DunProfile;
		} else if(FtpProfileServices.contains(uuid)){
		    return Profile.FtpProfile;
		} else if(HfpProfileServices.contains(uuid)){
		    return Profile.HfpProfile;
		} else if(HspProfileServices.contains(uuid)){
		    return Profile.HspProfile;
		} else if(MapProfileServices.contains(uuid)){
		    return Profile.MapProfile;
		} else if(OppProfileServices.contains(uuid)){
		    return Profile.OppProfile;
		} else if(PbapProfileServices.contains(uuid)){
		    return Profile.PbapProfile;
		} else if(PanProfileServices.contains(uuid)){
		    return Profile.PanProfile;
		} else if(SapProfileServices.contains(uuid)){
		    return Profile.SapProfile;
		} else if(SppProfileServices.contains(uuid)){
		    return Profile.SppProfile;
		} else if(SyncProfileServices.contains(uuid)){
		    return Profile.SyncProfile;
		} else if(VdpProfileServices.contains(uuid)){
		    return Profile.VdpProfile;
		} else {
		    return Profile.UnknowProfile;
		}

	}

    public int getServiceFromUuid(Parcelable uuid){

        if(ServiceDiscoveryServerServiceClassID.equals(uuid)){
	        return Profile.ServiceDiscoveryServerServiceClassIDService;
		} else if (BrowseGroupDescriptorServiceClassID.equals(uuid)){
		    return Profile.BrowseGroupDescriptorServiceClassIDService;
		} else if (PublicBrowseGroup.equals(uuid)){
		    return Profile.PublicBrowseGroupService;
		} else if (SerialPort.equals(uuid)){
		    return Profile.SerialPortService;
		} else if (LANAccessUsingPPP.equals(uuid)){
		    return Profile.LANAccessUsingPPPService;
		} else if (DialupNetworking.equals(uuid)){
		    return Profile.DialupNetworkingService;
		} else if (IrMCSync.equals(uuid)){
		    return Profile.IrMCSyncService;
		} else if (OBEXObjectPush.equals(uuid)){
		    return Profile.OBEXObjectPushService;
		} else if (OBEXFileTransfer.equals(uuid)){
		    return Profile.OBEXFileTransferService;
		} else if (IrMCSyncCommand.equals(uuid)){
		    return Profile.IrMCSyncCommandService;
		} else if (Headset.equals(uuid)){
		    return Profile.HeadsetService;
		} else if (CordlessTelephony.equals(uuid)){
		    return Profile.CordlessTelephonyService;
		} else if (AudioSource.equals(uuid)){
		    return Profile.AudioSourceService;
		} else if (AudioSink.equals(uuid)){
		    return Profile.AudioSinkService;
		} else if (AvrcpTarget.equals(uuid)){
		    return Profile.AudioVideoRemoteControlTargetService;
		} else if (AdvancedAudioDistribution.equals(uuid)){
		    return Profile.AdvancedAudioDistributionService;
		} else if (AvrcpController.equals(uuid)){
		    return Profile.AudioVideoRemoteControlService;
		} else if (VideoConferencing.equals(uuid)){
		    return Profile.VideoConferencingService;
		} else if (Intercom.equals(uuid)){
		    return Profile.IntercomService;
		} else if (Fax.equals(uuid)){
		    return Profile.FaxService;
		} else if (HeadsetAudioGateway.equals(uuid)){
		    return Profile.HeadsetAudioGatewayService;
		} else if (WAP.equals(uuid)){
		    return Profile.WAPService;
		} else if (WAP_CLIENT.equals(uuid)){
		    return Profile.WAP_CLIENTService;
		} else if (PANU.equals(uuid)){
		    return Profile.PANUService;
		} else if (NAP.equals(uuid)){
		    return Profile.NAPService;
		} else if (GN.equals(uuid)){
		    return Profile.GNService;
		} else if (DirectPrinting.equals(uuid)){
		    return Profile.DirectPrintingService;
		} else if (ReferencePrinting.equals(uuid)){
		    return Profile.ReferencePrintingService;
		} else if (Imaging.equals(uuid)){
		    return Profile.ImagingService;
		} else if (ImagingResponder.equals(uuid)){
		    return Profile.ImagingResponderService;
		} else if (ImagingAutomaticArchive.equals(uuid)){
		    return Profile.ImagingAutomaticArchiveService;
		} else if (ImagingReferencedObjects.equals(uuid)){
		    return Profile.ImagingReferencedObjectsService;
		} else if (Handsfree.equals(uuid)){
		    return Profile.HandsfreeService;
		} else if (HandsfreeAudioGateway.equals(uuid)){
		    return Profile.HandsfreeAudioGatewayService;
		} else if (DirectPrintingReferenceObjectsService.equals(uuid)){
		    return Profile.DirectPrintingReferenceObjectsService;
		} else if (ReflectedUI.equals(uuid)){
		    return Profile.ReflectedUIService;
		} else if (BasicPrinting.equals(uuid)){
		    return Profile.BasicPrintingService;
		} else if (PrintingStatus.equals(uuid)){
		    return Profile.PrintingStatusService;
		} else if (HumanInterfaceDeviceService.equals(uuid)){
		    return Profile.HumanInterfaceDeviceService;
		} else if (HardcopyCableReplacement.equals(uuid)){
		    return Profile.HardcopyCableReplacementService;
		} else if (HCR_Print.equals(uuid)){
		    return Profile.HCR_PrintService;
		} else if (HCR_Scan.equals(uuid)){
		    return Profile.HCR_ScanService;
		} else if (Common_ISDN_Access.equals(uuid)){
		    return Profile.Common_ISDN_AccessService;
		} else if (VideoConferencingGW.equals(uuid)){
		    return Profile.VideoConferencingGWService;
		} else if (UDI_MT.equals(uuid)){
		    return Profile.UDI_MTService;
		} else if (UDI_TA.equals(uuid)){
		    return Profile.UDI_TAService;
		} else if (AudioVideo.equals(uuid)){
		    return Profile.Audio_VideoService;
		} else if (SIM_Access.equals(uuid)){
		    return Profile.SIM_AccessService;
		} else if (PBAP_PCE.equals(uuid)){
		    return Profile.PhonebookAccessPCEService;
		} else if (PBAP_PSE.equals(uuid)){
		    return Profile.PhonebookAccessPSEService;
		} else if (PBAP.equals(uuid)){
		    return Profile.PhonebookAccessService;
		} else if (MAS.equals(uuid)){
		    return Profile.MASService;
		} else if (MNS.equals(uuid)){
		    return Profile.MNSService;
		} else if (MAP.equals(uuid)){
		    return Profile.MAPService;
		} else if (PnPInformation.equals(uuid)){
		    return Profile.PnPInformationService;
		} else if (GenericNetworking.equals(uuid)){
		    return Profile.GenericNetworkingService;
		} else if (GenericFileTransfer.equals(uuid)){
		    return Profile.GenericFileTransferService;
		} else if (GenericAudio.equals(uuid)){
		    return Profile.GenericAudioService;
		} else if (GenericTelephony.equals(uuid)){
		    return Profile.GenericTelephonyService;
		} else if (UPNP_Service.equals(uuid)){
		    return Profile.UPNP_ServiceService;
		} else if (UPNP_IP_Service.equals(uuid)){
		    return Profile.UPNP_IP_ServiceService;
		} else if (ESDP_UPNP_IP_PAN.equals(uuid)){
		    return Profile.ESDP_UPNP_IP_PANService;
		} else if (ESDP_UPNP_IP_LAP.equals(uuid)){
		    return Profile.ESDP_UPNP_IP_LAPService;
		} else if (ESDP_UPNP_L2CAP.equals(uuid)){
		    return Profile.ESDP_UPNP_L2CAPService;
		} else if (VideoSource.equals(uuid)){
		    return Profile.VideoSourceService;
		} else if (VideoSink.equals(uuid)){
		    return Profile.VideoSinkService;
		} else if (VideoDistribution.equals(uuid)){
		    return Profile.VideoDistributionService;
		} else {
		    return Profile.UnknowService;
		}
	}

}
