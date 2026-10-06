package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTCONPRO_Registro extends GxUserType
{
   public SdtSDTCONPRO_Registro( )
   {
      this(  new ModelContext(SdtSDTCONPRO_Registro.class));
   }

   public SdtSDTCONPRO_Registro( ModelContext context )
   {
      super( context, "SdtSDTCONPRO_Registro");
   }

   public SdtSDTCONPRO_Registro( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTCONPRO_Registro");
   }

   public SdtSDTCONPRO_Registro( StructSdtSDTCONPRO_Registro struct )
   {
      this();
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1;
      formatError = false ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            readElement = false ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_ID") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_id = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_EMPRCOD") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_CLICOD") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_CLINOM") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARCOD") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARCODREO") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARCODPAR") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARFECFPR") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr = GXutil.nullDate() ;
                  gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr_N = (byte)(0) ;
                  gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARNUMCLI") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_barnumcli = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARPLF") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_barplf = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARSIT") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_barsit = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARFECGEN") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen = GXutil.nullDate() ;
                  gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen_N = (byte)(0) ;
                  gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARFECCLI") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli = GXutil.nullDate() ;
                  gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli_N = (byte)(0) ;
                  gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARFECSAL") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal = GXutil.nullDate() ;
                  gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal_N = (byte)(0) ;
                  gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARSER") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_barser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARSERDSC") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_barserdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARCOLO") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_barcolo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARCOLU") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_barcolu = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARNOMCLI") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_barnomcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARTIPART") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_bartipart = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_TARTDSC") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_tartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARGIRAR") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_bargirar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARACAANH") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_baracaanh = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_DESC_B") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_desc_b = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARAGREST") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_baragrest = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BAREXT") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_barext = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_DISDES") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_disdes = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_DISCOD") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_discod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARPROPER") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_barproper = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_DSC_BAR") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_dsc_bar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARDISNUM") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_bardisnum = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARRENCC") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_barrencc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARKGM") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_barkgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARMTR") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_barmtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARPIE") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_barpie = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARALBK") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_baralbk = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARALBM") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_baralbm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARENCCLI") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_barenccli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARTIPDIS") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_bartipdis = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_DISUSRC") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtSDTCONPRO_Registro_Cp_disusrc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( ! readElement )
            {
               readOk = (short)(1) ;
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( ( readOk == 0 ) || formatError )
            {
               context.globals.sSOAPErrMsg += "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg += "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "SDTCONPRO.Registro" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("CP_ID", GXutil.trim( GXutil.str( gxTv_SdtSDTCONPRO_Registro_Cp_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_EMPRCOD", gxTv_SdtSDTCONPRO_Registro_Cp_emprcod);
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_CLICOD", GXutil.trim( GXutil.str( gxTv_SdtSDTCONPRO_Registro_Cp_clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_CLINOM", gxTv_SdtSDTCONPRO_Registro_Cp_clinom);
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARCOD", GXutil.trim( GXutil.str( gxTv_SdtSDTCONPRO_Registro_Cp_barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARCODREO", GXutil.trim( GXutil.str( gxTv_SdtSDTCONPRO_Registro_Cp_barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARCODPAR", gxTv_SdtSDTCONPRO_Registro_Cp_barcodpar);
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr)) && ( gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr_N == 1 ) )
      {
         oWriter.writeElement("CP_BARFECFPR", "");
         if ( GXutil.strcmp(sNameSpace, "") != 0 )
         {
            oWriter.writeAttribute("xmlns", "");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("CP_BARFECFPR", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "") != 0 )
         {
            oWriter.writeAttribute("xmlns", "");
         }
      }
      oWriter.writeElement("CP_BARNUMCLI", GXutil.trim( GXutil.str( gxTv_SdtSDTCONPRO_Registro_Cp_barnumcli, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARPLF", gxTv_SdtSDTCONPRO_Registro_Cp_barplf);
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARSIT", GXutil.trim( GXutil.str( gxTv_SdtSDTCONPRO_Registro_Cp_barsit, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen)) && ( gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen_N == 1 ) )
      {
         oWriter.writeElement("CP_BARFECGEN", "");
         if ( GXutil.strcmp(sNameSpace, "") != 0 )
         {
            oWriter.writeAttribute("xmlns", "");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("CP_BARFECGEN", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "") != 0 )
         {
            oWriter.writeAttribute("xmlns", "");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli)) && ( gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli_N == 1 ) )
      {
         oWriter.writeElement("CP_BARFECCLI", "");
         if ( GXutil.strcmp(sNameSpace, "") != 0 )
         {
            oWriter.writeAttribute("xmlns", "");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("CP_BARFECCLI", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "") != 0 )
         {
            oWriter.writeAttribute("xmlns", "");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal)) && ( gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal_N == 1 ) )
      {
         oWriter.writeElement("CP_BARFECSAL", "");
         if ( GXutil.strcmp(sNameSpace, "") != 0 )
         {
            oWriter.writeAttribute("xmlns", "");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("CP_BARFECSAL", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "") != 0 )
         {
            oWriter.writeAttribute("xmlns", "");
         }
      }
      oWriter.writeElement("CP_BARSER", gxTv_SdtSDTCONPRO_Registro_Cp_barser);
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARSERDSC", gxTv_SdtSDTCONPRO_Registro_Cp_barserdsc);
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARCOLO", gxTv_SdtSDTCONPRO_Registro_Cp_barcolo);
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARCOLU", GXutil.trim( GXutil.str( gxTv_SdtSDTCONPRO_Registro_Cp_barcolu, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARNOMCLI", gxTv_SdtSDTCONPRO_Registro_Cp_barnomcli);
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARTIPART", GXutil.trim( GXutil.str( gxTv_SdtSDTCONPRO_Registro_Cp_bartipart, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_TARTDSC", gxTv_SdtSDTCONPRO_Registro_Cp_tartdsc);
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARGIRAR", gxTv_SdtSDTCONPRO_Registro_Cp_bargirar);
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARACAANH", GXutil.trim( GXutil.str( gxTv_SdtSDTCONPRO_Registro_Cp_baracaanh, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_DESC_B", gxTv_SdtSDTCONPRO_Registro_Cp_desc_b);
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARAGREST", gxTv_SdtSDTCONPRO_Registro_Cp_baragrest);
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BAREXT", GXutil.trim( GXutil.str( gxTv_SdtSDTCONPRO_Registro_Cp_barext, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_DISDES", gxTv_SdtSDTCONPRO_Registro_Cp_disdes);
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_DISCOD", GXutil.trim( GXutil.str( gxTv_SdtSDTCONPRO_Registro_Cp_discod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARPROPER", gxTv_SdtSDTCONPRO_Registro_Cp_barproper);
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_DSC_BAR", gxTv_SdtSDTCONPRO_Registro_Cp_dsc_bar);
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARDISNUM", gxTv_SdtSDTCONPRO_Registro_Cp_bardisnum);
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARRENCC", gxTv_SdtSDTCONPRO_Registro_Cp_barrencc);
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARKGM", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTCONPRO_Registro_Cp_barkgm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARMTR", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTCONPRO_Registro_Cp_barmtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARPIE", GXutil.trim( GXutil.str( gxTv_SdtSDTCONPRO_Registro_Cp_barpie, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARALBK", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTCONPRO_Registro_Cp_baralbk, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARALBM", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTCONPRO_Registro_Cp_baralbm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARENCCLI", gxTv_SdtSDTCONPRO_Registro_Cp_barenccli);
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_BARTIPDIS", gxTv_SdtSDTCONPRO_Registro_Cp_bartipdis);
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("CP_DISUSRC", gxTv_SdtSDTCONPRO_Registro_Cp_disusrc);
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeEndElement();
   }

   public long getnumericvalue( String value )
   {
      if ( GXutil.notNumeric( value) )
      {
         formatError = true ;
      }
      return GXutil.lval( value) ;
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      tojson( includeState, true) ;
   }

   public void tojson( boolean includeState ,
                       boolean includeNonInitialized )
   {
      AddObjectProperty("CP_ID", gxTv_SdtSDTCONPRO_Registro_Cp_id, false, false);
      AddObjectProperty("CP_EMPRCOD", gxTv_SdtSDTCONPRO_Registro_Cp_emprcod, false, false);
      AddObjectProperty("CP_CLICOD", gxTv_SdtSDTCONPRO_Registro_Cp_clicod, false, false);
      AddObjectProperty("CP_CLINOM", gxTv_SdtSDTCONPRO_Registro_Cp_clinom, false, false);
      AddObjectProperty("CP_BARCOD", gxTv_SdtSDTCONPRO_Registro_Cp_barcod, false, false);
      AddObjectProperty("CP_BARCODREO", gxTv_SdtSDTCONPRO_Registro_Cp_barcodreo, false, false);
      AddObjectProperty("CP_BARCODPAR", gxTv_SdtSDTCONPRO_Registro_Cp_barcodpar, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("CP_BARFECFPR", sDateCnv, false, false);
      AddObjectProperty("CP_BARNUMCLI", gxTv_SdtSDTCONPRO_Registro_Cp_barnumcli, false, false);
      AddObjectProperty("CP_BARPLF", gxTv_SdtSDTCONPRO_Registro_Cp_barplf, false, false);
      AddObjectProperty("CP_BARSIT", gxTv_SdtSDTCONPRO_Registro_Cp_barsit, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("CP_BARFECGEN", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("CP_BARFECCLI", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("CP_BARFECSAL", sDateCnv, false, false);
      AddObjectProperty("CP_BARSER", gxTv_SdtSDTCONPRO_Registro_Cp_barser, false, false);
      AddObjectProperty("CP_BARSERDSC", gxTv_SdtSDTCONPRO_Registro_Cp_barserdsc, false, false);
      AddObjectProperty("CP_BARCOLO", gxTv_SdtSDTCONPRO_Registro_Cp_barcolo, false, false);
      AddObjectProperty("CP_BARCOLU", gxTv_SdtSDTCONPRO_Registro_Cp_barcolu, false, false);
      AddObjectProperty("CP_BARNOMCLI", gxTv_SdtSDTCONPRO_Registro_Cp_barnomcli, false, false);
      AddObjectProperty("CP_BARTIPART", gxTv_SdtSDTCONPRO_Registro_Cp_bartipart, false, false);
      AddObjectProperty("CP_TARTDSC", gxTv_SdtSDTCONPRO_Registro_Cp_tartdsc, false, false);
      AddObjectProperty("CP_BARGIRAR", gxTv_SdtSDTCONPRO_Registro_Cp_bargirar, false, false);
      AddObjectProperty("CP_BARACAANH", gxTv_SdtSDTCONPRO_Registro_Cp_baracaanh, false, false);
      AddObjectProperty("CP_DESC_B", gxTv_SdtSDTCONPRO_Registro_Cp_desc_b, false, false);
      AddObjectProperty("CP_BARAGREST", gxTv_SdtSDTCONPRO_Registro_Cp_baragrest, false, false);
      AddObjectProperty("CP_BAREXT", gxTv_SdtSDTCONPRO_Registro_Cp_barext, false, false);
      AddObjectProperty("CP_DISDES", gxTv_SdtSDTCONPRO_Registro_Cp_disdes, false, false);
      AddObjectProperty("CP_DISCOD", gxTv_SdtSDTCONPRO_Registro_Cp_discod, false, false);
      AddObjectProperty("CP_BARPROPER", gxTv_SdtSDTCONPRO_Registro_Cp_barproper, false, false);
      AddObjectProperty("CP_DSC_BAR", gxTv_SdtSDTCONPRO_Registro_Cp_dsc_bar, false, false);
      AddObjectProperty("CP_BARDISNUM", gxTv_SdtSDTCONPRO_Registro_Cp_bardisnum, false, false);
      AddObjectProperty("CP_BARRENCC", gxTv_SdtSDTCONPRO_Registro_Cp_barrencc, false, false);
      AddObjectProperty("CP_BARKGM", gxTv_SdtSDTCONPRO_Registro_Cp_barkgm, false, false);
      AddObjectProperty("CP_BARMTR", gxTv_SdtSDTCONPRO_Registro_Cp_barmtr, false, false);
      AddObjectProperty("CP_BARPIE", gxTv_SdtSDTCONPRO_Registro_Cp_barpie, false, false);
      AddObjectProperty("CP_BARALBK", gxTv_SdtSDTCONPRO_Registro_Cp_baralbk, false, false);
      AddObjectProperty("CP_BARALBM", gxTv_SdtSDTCONPRO_Registro_Cp_baralbm, false, false);
      AddObjectProperty("CP_BARENCCLI", gxTv_SdtSDTCONPRO_Registro_Cp_barenccli, false, false);
      AddObjectProperty("CP_BARTIPDIS", gxTv_SdtSDTCONPRO_Registro_Cp_bartipdis, false, false);
      AddObjectProperty("CP_DISUSRC", gxTv_SdtSDTCONPRO_Registro_Cp_disusrc, false, false);
   }

   public long getgxTv_SdtSDTCONPRO_Registro_Cp_id( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_id ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_id( long value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_id = value ;
   }

   public String getgxTv_SdtSDTCONPRO_Registro_Cp_emprcod( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_emprcod ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_emprcod( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_emprcod = value ;
   }

   public int getgxTv_SdtSDTCONPRO_Registro_Cp_clicod( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_clicod ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_clicod( int value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_clicod = value ;
   }

   public String getgxTv_SdtSDTCONPRO_Registro_Cp_clinom( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_clinom ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_clinom( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_clinom = value ;
   }

   public int getgxTv_SdtSDTCONPRO_Registro_Cp_barcod( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barcod ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barcod( int value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barcod = value ;
   }

   public byte getgxTv_SdtSDTCONPRO_Registro_Cp_barcodreo( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barcodreo ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barcodreo( byte value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barcodreo = value ;
   }

   public String getgxTv_SdtSDTCONPRO_Registro_Cp_barcodpar( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barcodpar ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barcodpar( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barcodpar = value ;
   }

   public java.util.Date getgxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr( java.util.Date value )
   {
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr = value ;
   }

   public int getgxTv_SdtSDTCONPRO_Registro_Cp_barnumcli( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barnumcli ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barnumcli( int value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barnumcli = value ;
   }

   public String getgxTv_SdtSDTCONPRO_Registro_Cp_barplf( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barplf ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barplf( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barplf = value ;
   }

   public byte getgxTv_SdtSDTCONPRO_Registro_Cp_barsit( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barsit ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barsit( byte value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barsit = value ;
   }

   public java.util.Date getgxTv_SdtSDTCONPRO_Registro_Cp_barfecgen( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barfecgen( java.util.Date value )
   {
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen = value ;
   }

   public java.util.Date getgxTv_SdtSDTCONPRO_Registro_Cp_barfeccli( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barfeccli( java.util.Date value )
   {
      gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli = value ;
   }

   public java.util.Date getgxTv_SdtSDTCONPRO_Registro_Cp_barfecsal( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barfecsal( java.util.Date value )
   {
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal = value ;
   }

   public String getgxTv_SdtSDTCONPRO_Registro_Cp_barser( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barser ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barser( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barser = value ;
   }

   public String getgxTv_SdtSDTCONPRO_Registro_Cp_barserdsc( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barserdsc ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barserdsc( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barserdsc = value ;
   }

   public String getgxTv_SdtSDTCONPRO_Registro_Cp_barcolo( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barcolo ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barcolo( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barcolo = value ;
   }

   public int getgxTv_SdtSDTCONPRO_Registro_Cp_barcolu( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barcolu ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barcolu( int value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barcolu = value ;
   }

   public String getgxTv_SdtSDTCONPRO_Registro_Cp_barnomcli( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barnomcli ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barnomcli( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barnomcli = value ;
   }

   public short getgxTv_SdtSDTCONPRO_Registro_Cp_bartipart( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_bartipart ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_bartipart( short value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_bartipart = value ;
   }

   public String getgxTv_SdtSDTCONPRO_Registro_Cp_tartdsc( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_tartdsc ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_tartdsc( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_tartdsc = value ;
   }

   public String getgxTv_SdtSDTCONPRO_Registro_Cp_bargirar( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_bargirar ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_bargirar( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_bargirar = value ;
   }

   public short getgxTv_SdtSDTCONPRO_Registro_Cp_baracaanh( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_baracaanh ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_baracaanh( short value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_baracaanh = value ;
   }

   public String getgxTv_SdtSDTCONPRO_Registro_Cp_desc_b( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_desc_b ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_desc_b( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_desc_b = value ;
   }

   public String getgxTv_SdtSDTCONPRO_Registro_Cp_baragrest( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_baragrest ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_baragrest( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_baragrest = value ;
   }

   public byte getgxTv_SdtSDTCONPRO_Registro_Cp_barext( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barext ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barext( byte value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barext = value ;
   }

   public String getgxTv_SdtSDTCONPRO_Registro_Cp_disdes( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_disdes ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_disdes( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_disdes = value ;
   }

   public int getgxTv_SdtSDTCONPRO_Registro_Cp_discod( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_discod ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_discod( int value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_discod = value ;
   }

   public String getgxTv_SdtSDTCONPRO_Registro_Cp_barproper( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barproper ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barproper( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barproper = value ;
   }

   public String getgxTv_SdtSDTCONPRO_Registro_Cp_dsc_bar( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_dsc_bar ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_dsc_bar( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_dsc_bar = value ;
   }

   public String getgxTv_SdtSDTCONPRO_Registro_Cp_bardisnum( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_bardisnum ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_bardisnum( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_bardisnum = value ;
   }

   public String getgxTv_SdtSDTCONPRO_Registro_Cp_barrencc( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barrencc ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barrencc( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barrencc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTCONPRO_Registro_Cp_barkgm( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barkgm ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barkgm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barkgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTCONPRO_Registro_Cp_barmtr( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barmtr ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barmtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barmtr = value ;
   }

   public int getgxTv_SdtSDTCONPRO_Registro_Cp_barpie( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barpie ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barpie( int value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barpie = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTCONPRO_Registro_Cp_baralbk( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_baralbk ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_baralbk( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_baralbk = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTCONPRO_Registro_Cp_baralbm( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_baralbm ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_baralbm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_baralbm = value ;
   }

   public String getgxTv_SdtSDTCONPRO_Registro_Cp_barenccli( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_barenccli ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_barenccli( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barenccli = value ;
   }

   public String getgxTv_SdtSDTCONPRO_Registro_Cp_bartipdis( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_bartipdis ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_bartipdis( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_bartipdis = value ;
   }

   public String getgxTv_SdtSDTCONPRO_Registro_Cp_disusrc( )
   {
      return gxTv_SdtSDTCONPRO_Registro_Cp_disusrc ;
   }

   public void setgxTv_SdtSDTCONPRO_Registro_Cp_disusrc( String value )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(0) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_disusrc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTCONPRO_Registro_N = (byte)(1) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_emprcod = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_clinom = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barcodpar = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr = GXutil.nullDate() ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr_N = (byte)(1) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barplf = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen = GXutil.nullDate() ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen_N = (byte)(1) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli = GXutil.nullDate() ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli_N = (byte)(1) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal = GXutil.nullDate() ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal_N = (byte)(1) ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barser = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barserdsc = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barcolo = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barnomcli = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_tartdsc = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_bargirar = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_desc_b = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_baragrest = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_disdes = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barproper = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_dsc_bar = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_bardisnum = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barrencc = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barkgm = DecimalUtil.ZERO ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barmtr = DecimalUtil.ZERO ;
      gxTv_SdtSDTCONPRO_Registro_Cp_baralbk = DecimalUtil.ZERO ;
      gxTv_SdtSDTCONPRO_Registro_Cp_baralbm = DecimalUtil.ZERO ;
      gxTv_SdtSDTCONPRO_Registro_Cp_barenccli = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_bartipdis = "" ;
      gxTv_SdtSDTCONPRO_Registro_Cp_disusrc = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTCONPRO_Registro_N ;
   }

   public app.SdtSDTCONPRO_Registro Clone( )
   {
      return (app.SdtSDTCONPRO_Registro)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTCONPRO_Registro struct )
   {
      setgxTv_SdtSDTCONPRO_Registro_Cp_id(struct.getCp_id());
      setgxTv_SdtSDTCONPRO_Registro_Cp_emprcod(struct.getCp_emprcod());
      setgxTv_SdtSDTCONPRO_Registro_Cp_clicod(struct.getCp_clicod());
      setgxTv_SdtSDTCONPRO_Registro_Cp_clinom(struct.getCp_clinom());
      setgxTv_SdtSDTCONPRO_Registro_Cp_barcod(struct.getCp_barcod());
      setgxTv_SdtSDTCONPRO_Registro_Cp_barcodreo(struct.getCp_barcodreo());
      setgxTv_SdtSDTCONPRO_Registro_Cp_barcodpar(struct.getCp_barcodpar());
      if ( struct.gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr_N == 0 )
      {
         setgxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr(struct.getCp_barfecfpr());
      }
      setgxTv_SdtSDTCONPRO_Registro_Cp_barnumcli(struct.getCp_barnumcli());
      setgxTv_SdtSDTCONPRO_Registro_Cp_barplf(struct.getCp_barplf());
      setgxTv_SdtSDTCONPRO_Registro_Cp_barsit(struct.getCp_barsit());
      if ( struct.gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen_N == 0 )
      {
         setgxTv_SdtSDTCONPRO_Registro_Cp_barfecgen(struct.getCp_barfecgen());
      }
      if ( struct.gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli_N == 0 )
      {
         setgxTv_SdtSDTCONPRO_Registro_Cp_barfeccli(struct.getCp_barfeccli());
      }
      if ( struct.gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal_N == 0 )
      {
         setgxTv_SdtSDTCONPRO_Registro_Cp_barfecsal(struct.getCp_barfecsal());
      }
      setgxTv_SdtSDTCONPRO_Registro_Cp_barser(struct.getCp_barser());
      setgxTv_SdtSDTCONPRO_Registro_Cp_barserdsc(struct.getCp_barserdsc());
      setgxTv_SdtSDTCONPRO_Registro_Cp_barcolo(struct.getCp_barcolo());
      setgxTv_SdtSDTCONPRO_Registro_Cp_barcolu(struct.getCp_barcolu());
      setgxTv_SdtSDTCONPRO_Registro_Cp_barnomcli(struct.getCp_barnomcli());
      setgxTv_SdtSDTCONPRO_Registro_Cp_bartipart(struct.getCp_bartipart());
      setgxTv_SdtSDTCONPRO_Registro_Cp_tartdsc(struct.getCp_tartdsc());
      setgxTv_SdtSDTCONPRO_Registro_Cp_bargirar(struct.getCp_bargirar());
      setgxTv_SdtSDTCONPRO_Registro_Cp_baracaanh(struct.getCp_baracaanh());
      setgxTv_SdtSDTCONPRO_Registro_Cp_desc_b(struct.getCp_desc_b());
      setgxTv_SdtSDTCONPRO_Registro_Cp_baragrest(struct.getCp_baragrest());
      setgxTv_SdtSDTCONPRO_Registro_Cp_barext(struct.getCp_barext());
      setgxTv_SdtSDTCONPRO_Registro_Cp_disdes(struct.getCp_disdes());
      setgxTv_SdtSDTCONPRO_Registro_Cp_discod(struct.getCp_discod());
      setgxTv_SdtSDTCONPRO_Registro_Cp_barproper(struct.getCp_barproper());
      setgxTv_SdtSDTCONPRO_Registro_Cp_dsc_bar(struct.getCp_dsc_bar());
      setgxTv_SdtSDTCONPRO_Registro_Cp_bardisnum(struct.getCp_bardisnum());
      setgxTv_SdtSDTCONPRO_Registro_Cp_barrencc(struct.getCp_barrencc());
      setgxTv_SdtSDTCONPRO_Registro_Cp_barkgm(struct.getCp_barkgm());
      setgxTv_SdtSDTCONPRO_Registro_Cp_barmtr(struct.getCp_barmtr());
      setgxTv_SdtSDTCONPRO_Registro_Cp_barpie(struct.getCp_barpie());
      setgxTv_SdtSDTCONPRO_Registro_Cp_baralbk(struct.getCp_baralbk());
      setgxTv_SdtSDTCONPRO_Registro_Cp_baralbm(struct.getCp_baralbm());
      setgxTv_SdtSDTCONPRO_Registro_Cp_barenccli(struct.getCp_barenccli());
      setgxTv_SdtSDTCONPRO_Registro_Cp_bartipdis(struct.getCp_bartipdis());
      setgxTv_SdtSDTCONPRO_Registro_Cp_disusrc(struct.getCp_disusrc());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTCONPRO_Registro getStruct( )
   {
      app.StructSdtSDTCONPRO_Registro struct = new app.StructSdtSDTCONPRO_Registro ();
      struct.setCp_id(getgxTv_SdtSDTCONPRO_Registro_Cp_id());
      struct.setCp_emprcod(getgxTv_SdtSDTCONPRO_Registro_Cp_emprcod());
      struct.setCp_clicod(getgxTv_SdtSDTCONPRO_Registro_Cp_clicod());
      struct.setCp_clinom(getgxTv_SdtSDTCONPRO_Registro_Cp_clinom());
      struct.setCp_barcod(getgxTv_SdtSDTCONPRO_Registro_Cp_barcod());
      struct.setCp_barcodreo(getgxTv_SdtSDTCONPRO_Registro_Cp_barcodreo());
      struct.setCp_barcodpar(getgxTv_SdtSDTCONPRO_Registro_Cp_barcodpar());
      if ( gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr_N == 0 )
      {
         struct.setCp_barfecfpr(getgxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr());
      }
      struct.setCp_barnumcli(getgxTv_SdtSDTCONPRO_Registro_Cp_barnumcli());
      struct.setCp_barplf(getgxTv_SdtSDTCONPRO_Registro_Cp_barplf());
      struct.setCp_barsit(getgxTv_SdtSDTCONPRO_Registro_Cp_barsit());
      if ( gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen_N == 0 )
      {
         struct.setCp_barfecgen(getgxTv_SdtSDTCONPRO_Registro_Cp_barfecgen());
      }
      if ( gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli_N == 0 )
      {
         struct.setCp_barfeccli(getgxTv_SdtSDTCONPRO_Registro_Cp_barfeccli());
      }
      if ( gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal_N == 0 )
      {
         struct.setCp_barfecsal(getgxTv_SdtSDTCONPRO_Registro_Cp_barfecsal());
      }
      struct.setCp_barser(getgxTv_SdtSDTCONPRO_Registro_Cp_barser());
      struct.setCp_barserdsc(getgxTv_SdtSDTCONPRO_Registro_Cp_barserdsc());
      struct.setCp_barcolo(getgxTv_SdtSDTCONPRO_Registro_Cp_barcolo());
      struct.setCp_barcolu(getgxTv_SdtSDTCONPRO_Registro_Cp_barcolu());
      struct.setCp_barnomcli(getgxTv_SdtSDTCONPRO_Registro_Cp_barnomcli());
      struct.setCp_bartipart(getgxTv_SdtSDTCONPRO_Registro_Cp_bartipart());
      struct.setCp_tartdsc(getgxTv_SdtSDTCONPRO_Registro_Cp_tartdsc());
      struct.setCp_bargirar(getgxTv_SdtSDTCONPRO_Registro_Cp_bargirar());
      struct.setCp_baracaanh(getgxTv_SdtSDTCONPRO_Registro_Cp_baracaanh());
      struct.setCp_desc_b(getgxTv_SdtSDTCONPRO_Registro_Cp_desc_b());
      struct.setCp_baragrest(getgxTv_SdtSDTCONPRO_Registro_Cp_baragrest());
      struct.setCp_barext(getgxTv_SdtSDTCONPRO_Registro_Cp_barext());
      struct.setCp_disdes(getgxTv_SdtSDTCONPRO_Registro_Cp_disdes());
      struct.setCp_discod(getgxTv_SdtSDTCONPRO_Registro_Cp_discod());
      struct.setCp_barproper(getgxTv_SdtSDTCONPRO_Registro_Cp_barproper());
      struct.setCp_dsc_bar(getgxTv_SdtSDTCONPRO_Registro_Cp_dsc_bar());
      struct.setCp_bardisnum(getgxTv_SdtSDTCONPRO_Registro_Cp_bardisnum());
      struct.setCp_barrencc(getgxTv_SdtSDTCONPRO_Registro_Cp_barrencc());
      struct.setCp_barkgm(getgxTv_SdtSDTCONPRO_Registro_Cp_barkgm());
      struct.setCp_barmtr(getgxTv_SdtSDTCONPRO_Registro_Cp_barmtr());
      struct.setCp_barpie(getgxTv_SdtSDTCONPRO_Registro_Cp_barpie());
      struct.setCp_baralbk(getgxTv_SdtSDTCONPRO_Registro_Cp_baralbk());
      struct.setCp_baralbm(getgxTv_SdtSDTCONPRO_Registro_Cp_baralbm());
      struct.setCp_barenccli(getgxTv_SdtSDTCONPRO_Registro_Cp_barenccli());
      struct.setCp_bartipdis(getgxTv_SdtSDTCONPRO_Registro_Cp_bartipdis());
      struct.setCp_disusrc(getgxTv_SdtSDTCONPRO_Registro_Cp_disusrc());
      return struct ;
   }

   protected byte gxTv_SdtSDTCONPRO_Registro_N ;
   protected byte gxTv_SdtSDTCONPRO_Registro_Cp_barcodreo ;
   protected byte gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr_N ;
   protected byte gxTv_SdtSDTCONPRO_Registro_Cp_barsit ;
   protected byte gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen_N ;
   protected byte gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli_N ;
   protected byte gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal_N ;
   protected byte gxTv_SdtSDTCONPRO_Registro_Cp_barext ;
   protected short gxTv_SdtSDTCONPRO_Registro_Cp_bartipart ;
   protected short gxTv_SdtSDTCONPRO_Registro_Cp_baracaanh ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTCONPRO_Registro_Cp_clicod ;
   protected int gxTv_SdtSDTCONPRO_Registro_Cp_barcod ;
   protected int gxTv_SdtSDTCONPRO_Registro_Cp_barnumcli ;
   protected int gxTv_SdtSDTCONPRO_Registro_Cp_barcolu ;
   protected int gxTv_SdtSDTCONPRO_Registro_Cp_discod ;
   protected int gxTv_SdtSDTCONPRO_Registro_Cp_barpie ;
   protected long gxTv_SdtSDTCONPRO_Registro_Cp_id ;
   protected java.math.BigDecimal gxTv_SdtSDTCONPRO_Registro_Cp_barkgm ;
   protected java.math.BigDecimal gxTv_SdtSDTCONPRO_Registro_Cp_barmtr ;
   protected java.math.BigDecimal gxTv_SdtSDTCONPRO_Registro_Cp_baralbk ;
   protected java.math.BigDecimal gxTv_SdtSDTCONPRO_Registro_Cp_baralbm ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_emprcod ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_barcodpar ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_barplf ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_barser ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_barcolo ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_baragrest ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_disdes ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_barproper ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_bardisnum ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_barrencc ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_barenccli ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_bartipdis ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_disusrc ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTCONPRO_Registro_Cp_barfecfpr ;
   protected java.util.Date gxTv_SdtSDTCONPRO_Registro_Cp_barfecgen ;
   protected java.util.Date gxTv_SdtSDTCONPRO_Registro_Cp_barfeccli ;
   protected java.util.Date gxTv_SdtSDTCONPRO_Registro_Cp_barfecsal ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_clinom ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_barserdsc ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_barnomcli ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_tartdsc ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_bargirar ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_desc_b ;
   protected String gxTv_SdtSDTCONPRO_Registro_Cp_dsc_bar ;
}

