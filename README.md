# Bluetooth Profile Scanner
The Bluetooth Profiles Scanner is designed to detect Bluetooth Profiles of nearby device. <br>
Inlcuding some popular profiles like A2dP, HFP, OPP .... <br>
Check [Google Play store](https://play.google.com/store/apps/details?id=com.sanji.jasper_hsieh.sdpscanner) for testing the app.

- Easiest way to discover profiles of nearby bluetooth devices.
- Getting UUID from nearby bluetooth devices can be simple.
- Useful tool for bluetooth related developer.

## How to discovery
1. Have two bluetooth devices
2. Let one of then can be discovery (device A), and other one with Bluetooth Profile Scanner installed (device B)
3. Select device A from Bluetooth Profile Scanner app on device B and start discovery
4. The Profiles supported by device A will show up !
5. Simple, Easy and Quickly 

![alt tag](https://lh3.googleusercontent.com/OWKAEXniWnOO1ek1G1ViwonECzOjDNWB4b2eTOYXhc3eywgwQ6fSXnMv6oVSDqu4Rm8=h900-rw)
<br>

## Profiles can be discoveried
- Advanced Audio Distribution Profile (A2DP)
- Audio/Video Remote Control Profile (AVRCP)
- Basic Imaging Profile (BIP)
- Device Identification Profile (DI)
- Dial-Up Network Profile (DUN)
- File Transfer Profile (FTP)
- Generic Audio/Video Distribution Profile (GAVDP)
- Generic Object Profile (GOEP)
- Hands-Free Profile (HFP)
- Hard Copy Cable Replacement (HCRP)
- Health Device Profile (HDP)
- Headset Profile (HSP)
- Human Interface Device Profile (HID)
- Message Access Profile (MAP)
- Multi Profile Specification (MPS)
- Object Push Profile (OPP)
- Phone Book Access Profile (PBAP)
- Personal Area Network Profile (PAN)
- SIM Access Profile (SAP)
- Service Discovery Application Profile (SDAP)
- Serial Port Profile (SPP)
- Synchronization Profile (SYNC)
- Video Distribution Profile (VDP)

## Notice
Some LE device may not response the SDP discovery command or the callback function is filtered by android.
So the detected result won't show up.
