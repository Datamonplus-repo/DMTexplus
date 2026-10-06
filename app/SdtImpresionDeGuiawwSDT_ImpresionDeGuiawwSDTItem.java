package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem extends GxUserType
{
   public SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem( )
   {
      this(  new ModelContext(SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem.class));
   }

   public SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem( ModelContext context )
   {
      super( context, "SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem");
   }

   public SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem( int remoteHandle ,
                                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem");
   }

   public SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem( StructSdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProCod") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprocod = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProPri") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpropri = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProEst") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproest = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProfch") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch = GXutil.nullDate() ;
                  gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch_N = (byte)(0) ;
                  gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbFecSal") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal = GXutil.nullDate() ;
                  gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal_N = (byte)(0) ;
                  gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbHorSal") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhorsal = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbUsu") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albusu = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemCli") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcli = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemCln") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcln = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbCliDes") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albclides = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDomEnv") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdomenv = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnCod") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trncod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnNom") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbMat") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmat = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbSec") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albsec = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbEnvFtp") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albenvftp = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbLic") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblic = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProAT") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproat = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbHhfm") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm_N = (byte)(0) ;
                  gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbGrossT") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albgrosst = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTrnNc") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbFmd") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmd = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTrnNm") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnm = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ALbFmdc") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmdc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTrnDm") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrndm = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbMarca") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarca = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbLocDes") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblocdes = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbLocCar") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albloccar = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPObsCon") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpobscon = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbIvaCod") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albivacod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbColCa") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcolca = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDesp") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdesp = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbCambio") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcambio = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTipDoc") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipdoc = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbMotTr") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmottr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTipCal") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipcal = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbObsCb") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albobscb = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbNumT") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albnumt = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbMarCo") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarco = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbOComp") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albocomp = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnNif") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnif = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDivTCod") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivtcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDivAbr") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivabr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDivCod") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivcod = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BusDomEnv") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Busdomenv = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprGuiRem") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprguirem = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemDom") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdom = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemDivT") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdivt = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemDiv") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdiv = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliValA") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Clivala = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliMailGrE") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgre = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliMailGr") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliMailPkE") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpke = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliMailPk") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpk = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cod_pais") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Cod_pais = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Icon") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Icon_GXI") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon_gxi = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Grid_PathPdf") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_pathpdf = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Grid_NmrCopia") )
            {
               gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_nmrcopia = (short)(getnumericvalue(oReader.getValue())) ;
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
         sName = "ImpresionDeGuiawwSDT.ImpresionDeGuiawwSDTItem" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProCod", GXutil.trim( GXutil.str( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprocod, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProPri", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpropri);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProEst", GXutil.trim( GXutil.str( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproest, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch)) && ( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch_N == 1 ) )
      {
         oWriter.writeElement("AlbProfch", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbProfch", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal)) && ( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal_N == 1 ) )
      {
         oWriter.writeElement("AlbFecSal", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbFecSal", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("AlbHorSal", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhorsal);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbUsu", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albusu);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GuiRemCli", GXutil.trim( GXutil.str( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcli, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GuiRemCln", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcln);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbCliDes", GXutil.trim( GXutil.str( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albclides, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDomEnv", GXutil.trim( GXutil.str( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdomenv, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TrnCod", GXutil.trim( GXutil.str( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trncod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TrnNom", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbMat", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmat);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbSec", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albsec);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbEnvFtp", GXutil.trim( GXutil.str( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albenvftp, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbLic", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblic);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProAT", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproat);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm) && ( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm_N == 1 ) )
      {
         oWriter.writeElement("AlbHhfm", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbHhfm", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("AlbGrossT", GXutil.trim( GXutil.strNoRound( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albgrosst, 13, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbTrnNc", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbFmd", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmd);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbTrnNm", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnm);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ALbFmdc", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmdc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbTrnDm", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrndm);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbMarca", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarca);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbLocDes", GXutil.trim( GXutil.str( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblocdes, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbLocCar", GXutil.trim( GXutil.str( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albloccar, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbPObsCon", GXutil.trim( GXutil.str( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpobscon, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbIvaCod", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albivacod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbColCa", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcolca);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDesp", GXutil.trim( GXutil.str( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdesp, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbCambio", GXutil.trim( GXutil.strNoRound( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcambio, 7, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbTipDoc", GXutil.trim( GXutil.str( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipdoc, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbMotTr", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmottr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbTipCal", GXutil.trim( GXutil.str( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipcal, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbObsCb", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albobscb);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbNumT", GXutil.trim( GXutil.str( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albnumt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbMarCo", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarco);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbOComp", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albocomp);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TrnNif", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnif);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDivTCod", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivtcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDivAbr", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivabr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDivCod", GXutil.trim( GXutil.str( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivcod, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BusDomEnv", GXutil.trim( GXutil.str( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Busdomenv, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprGuiRem", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprguirem);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GuiRemDom", GXutil.trim( GXutil.str( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdom, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GuiRemDivT", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdivt);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GuiRemDiv", GXutil.trim( GXutil.str( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdiv, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliValA", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Clivala);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliMailGrE", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgre);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliMailGr", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliMailPkE", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpke);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliMailPk", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpk);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cod_pais", GXutil.trim( GXutil.str( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Cod_pais, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Icon", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Icon_GXI", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon_gxi);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Grid_PathPdf", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_pathpdf);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Grid_NmrCopia", GXutil.trim( GXutil.str( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_nmrcopia, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
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
      AddObjectProperty("EmprCod", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprcod, false, false);
      AddObjectProperty("EmprNom", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprnom, false, false);
      AddObjectProperty("AlbProCod", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprocod, false, false);
      AddObjectProperty("AlbProPri", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpropri, false, false);
      AddObjectProperty("AlbProEst", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproest, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("AlbProfch", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("AlbFecSal", sDateCnv, false, false);
      AddObjectProperty("AlbHorSal", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhorsal, false, false);
      AddObjectProperty("AlbUsu", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albusu, false, false);
      AddObjectProperty("GuiRemCli", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcli, false, false);
      AddObjectProperty("GuiRemCln", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcln, false, false);
      AddObjectProperty("AlbCliDes", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albclides, false, false);
      AddObjectProperty("AlbDomEnv", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdomenv, false, false);
      AddObjectProperty("TrnCod", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trncod, false, false);
      AddObjectProperty("TrnNom", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnom, false, false);
      AddObjectProperty("AlbMat", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmat, false, false);
      AddObjectProperty("AlbSec", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albsec, false, false);
      AddObjectProperty("AlbEnvFtp", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albenvftp, false, false);
      AddObjectProperty("AlbLic", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblic, false, false);
      AddObjectProperty("AlbProAT", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproat, false, false);
      datetime_STZ = gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("AlbHhfm", sDateCnv, false, false);
      AddObjectProperty("AlbGrossT", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albgrosst, false, false);
      AddObjectProperty("AlbTrnNc", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnc, false, false);
      AddObjectProperty("AlbFmd", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmd, false, false);
      AddObjectProperty("AlbTrnNm", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnm, false, false);
      AddObjectProperty("ALbFmdc", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmdc, false, false);
      AddObjectProperty("AlbTrnDm", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrndm, false, false);
      AddObjectProperty("AlbMarca", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarca, false, false);
      AddObjectProperty("AlbLocDes", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblocdes, false, false);
      AddObjectProperty("AlbLocCar", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albloccar, false, false);
      AddObjectProperty("AlbPObsCon", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpobscon, false, false);
      AddObjectProperty("AlbIvaCod", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albivacod, false, false);
      AddObjectProperty("AlbColCa", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcolca, false, false);
      AddObjectProperty("AlbDesp", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdesp, false, false);
      AddObjectProperty("AlbCambio", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcambio, false, false);
      AddObjectProperty("AlbTipDoc", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipdoc, false, false);
      AddObjectProperty("AlbMotTr", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmottr, false, false);
      AddObjectProperty("AlbTipCal", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipcal, false, false);
      AddObjectProperty("AlbObsCb", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albobscb, false, false);
      AddObjectProperty("AlbNumT", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albnumt, false, false);
      AddObjectProperty("AlbMarCo", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarco, false, false);
      AddObjectProperty("AlbOComp", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albocomp, false, false);
      AddObjectProperty("TrnNif", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnif, false, false);
      AddObjectProperty("AlbDivTCod", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivtcod, false, false);
      AddObjectProperty("AlbDivAbr", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivabr, false, false);
      AddObjectProperty("AlbDivCod", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivcod, false, false);
      AddObjectProperty("BusDomEnv", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Busdomenv, false, false);
      AddObjectProperty("EmprGuiRem", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprguirem, false, false);
      AddObjectProperty("GuiRemDom", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdom, false, false);
      AddObjectProperty("GuiRemDivT", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdivt, false, false);
      AddObjectProperty("GuiRemDiv", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdiv, false, false);
      AddObjectProperty("CliValA", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Clivala, false, false);
      AddObjectProperty("CliMailGrE", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgre, false, false);
      AddObjectProperty("CliMailGr", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgr, false, false);
      AddObjectProperty("CliMailPkE", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpke, false, false);
      AddObjectProperty("CliMailPk", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpk, false, false);
      AddObjectProperty("Cod_pais", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Cod_pais, false, false);
      AddObjectProperty("Icon", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon, false, false);
      AddObjectProperty("Icon_GXI", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon_gxi, false, false);
      AddObjectProperty("Grid_PathPdf", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_pathpdf, false, false);
      AddObjectProperty("Grid_NmrCopia", gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_nmrcopia, false, false);
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprcod( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprcod ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprcod( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprcod = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprnom( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprnom ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprnom( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprnom = value ;
   }

   public long getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprocod( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprocod ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprocod( long value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprocod = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpropri( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpropri ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpropri( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpropri = value ;
   }

   public byte getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproest( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproest ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproest( byte value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproest = value ;
   }

   public java.util.Date getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch( java.util.Date value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch = value ;
   }

   public java.util.Date getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal( java.util.Date value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhorsal( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhorsal ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhorsal( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhorsal = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albusu( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albusu ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albusu( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albusu = value ;
   }

   public int getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcli( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcli ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcli( int value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcli = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcln( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcln ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcln( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcln = value ;
   }

   public int getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albclides( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albclides ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albclides( int value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albclides = value ;
   }

   public byte getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdomenv( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdomenv ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdomenv( byte value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdomenv = value ;
   }

   public short getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trncod( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trncod ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trncod( short value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trncod = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnom( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnom ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnom( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnom = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmat( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmat ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmat( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmat = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albsec( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albsec ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albsec( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albsec = value ;
   }

   public byte getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albenvftp( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albenvftp ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albenvftp( byte value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albenvftp = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblic( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblic ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblic( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblic = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproat( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproat ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproat( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproat = value ;
   }

   public java.util.Date getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm( java.util.Date value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albgrosst( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albgrosst ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albgrosst( java.math.BigDecimal value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albgrosst = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnc( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnc ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnc( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnc = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmd( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmd ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmd( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmd = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnm( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnm ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnm( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnm = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmdc( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmdc ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmdc( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmdc = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrndm( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrndm ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrndm( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrndm = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarca( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarca ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarca( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarca = value ;
   }

   public byte getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblocdes( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblocdes ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblocdes( byte value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblocdes = value ;
   }

   public byte getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albloccar( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albloccar ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albloccar( byte value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albloccar = value ;
   }

   public byte getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpobscon( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpobscon ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpobscon( byte value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpobscon = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albivacod( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albivacod ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albivacod( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albivacod = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcolca( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcolca ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcolca( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcolca = value ;
   }

   public int getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdesp( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdesp ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdesp( int value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdesp = value ;
   }

   public java.math.BigDecimal getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcambio( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcambio ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcambio( java.math.BigDecimal value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcambio = value ;
   }

   public int getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipdoc( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipdoc ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipdoc( int value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipdoc = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmottr( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmottr ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmottr( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmottr = value ;
   }

   public byte getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipcal( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipcal ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipcal( byte value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipcal = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albobscb( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albobscb ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albobscb( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albobscb = value ;
   }

   public long getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albnumt( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albnumt ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albnumt( long value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albnumt = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarco( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarco ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarco( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarco = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albocomp( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albocomp ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albocomp( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albocomp = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnif( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnif ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnif( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnif = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivtcod( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivtcod ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivtcod( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivtcod = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivabr( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivabr ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivabr( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivabr = value ;
   }

   public byte getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivcod( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivcod ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivcod( byte value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivcod = value ;
   }

   public byte getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Busdomenv( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Busdomenv ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Busdomenv( byte value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Busdomenv = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprguirem( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprguirem ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprguirem( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprguirem = value ;
   }

   public byte getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdom( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdom ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdom( byte value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdom = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdivt( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdivt ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdivt( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdivt = value ;
   }

   public byte getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdiv( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdiv ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdiv( byte value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdiv = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Clivala( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Clivala ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Clivala( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Clivala = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgre( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgre ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgre( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgre = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgr( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgr ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgr( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgr = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpke( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpke ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpke( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpke = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpk( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpk ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpk( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpk = value ;
   }

   public short getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Cod_pais( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Cod_pais ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Cod_pais( short value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Cod_pais = value ;
   }

   @GxUpload
   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon_gxi( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon_gxi ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon_gxi( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon_gxi = value ;
   }

   public String getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_pathpdf( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_pathpdf ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_pathpdf( String value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_pathpdf = value ;
   }

   public short getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_nmrcopia( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_nmrcopia ;
   }

   public void setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_nmrcopia( short value )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(0) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_nmrcopia = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprcod = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N = (byte)(1) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprnom = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpropri = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch = GXutil.nullDate() ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch_N = (byte)(1) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal = GXutil.nullDate() ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal_N = (byte)(1) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhorsal = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albusu = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcln = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnom = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmat = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albsec = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblic = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproat = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm_N = (byte)(1) ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albgrosst = DecimalUtil.ZERO ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnc = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmd = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnm = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmdc = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrndm = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarca = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albivacod = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcolca = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcambio = DecimalUtil.ZERO ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmottr = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albobscb = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarco = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albocomp = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnif = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivtcod = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivabr = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprguirem = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdivt = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Clivala = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgre = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgr = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpke = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpk = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon_gxi = "" ;
      gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_pathpdf = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N ;
   }

   public app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem Clone( )
   {
      return (app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem)(clone()) ;
   }

   public void setStruct( app.StructSdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem struct )
   {
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprcod(struct.getEmprcod());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprnom(struct.getEmprnom());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprocod(struct.getAlbprocod());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpropri(struct.getAlbpropri());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproest(struct.getAlbproest());
      if ( struct.gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch_N == 0 )
      {
         setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch(struct.getAlbprofch());
      }
      if ( struct.gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal_N == 0 )
      {
         setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal(struct.getAlbfecsal());
      }
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhorsal(struct.getAlbhorsal());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albusu(struct.getAlbusu());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcli(struct.getGuiremcli());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcln(struct.getGuiremcln());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albclides(struct.getAlbclides());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdomenv(struct.getAlbdomenv());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trncod(struct.getTrncod());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnom(struct.getTrnnom());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmat(struct.getAlbmat());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albsec(struct.getAlbsec());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albenvftp(struct.getAlbenvftp());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblic(struct.getAlblic());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproat(struct.getAlbproat());
      if ( struct.gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm_N == 0 )
      {
         setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm(struct.getAlbhhfm());
      }
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albgrosst(struct.getAlbgrosst());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnc(struct.getAlbtrnnc());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmd(struct.getAlbfmd());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnm(struct.getAlbtrnnm());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmdc(struct.getAlbfmdc());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrndm(struct.getAlbtrndm());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarca(struct.getAlbmarca());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblocdes(struct.getAlblocdes());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albloccar(struct.getAlbloccar());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpobscon(struct.getAlbpobscon());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albivacod(struct.getAlbivacod());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcolca(struct.getAlbcolca());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdesp(struct.getAlbdesp());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcambio(struct.getAlbcambio());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipdoc(struct.getAlbtipdoc());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmottr(struct.getAlbmottr());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipcal(struct.getAlbtipcal());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albobscb(struct.getAlbobscb());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albnumt(struct.getAlbnumt());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarco(struct.getAlbmarco());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albocomp(struct.getAlbocomp());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnif(struct.getTrnnif());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivtcod(struct.getAlbdivtcod());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivabr(struct.getAlbdivabr());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivcod(struct.getAlbdivcod());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Busdomenv(struct.getBusdomenv());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprguirem(struct.getEmprguirem());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdom(struct.getGuiremdom());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdivt(struct.getGuiremdivt());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdiv(struct.getGuiremdiv());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Clivala(struct.getClivala());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgre(struct.getClimailgre());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgr(struct.getClimailgr());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpke(struct.getClimailpke());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpk(struct.getClimailpk());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Cod_pais(struct.getCod_pais());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon(struct.getIcon());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon_gxi(struct.getIcon_gxi());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_pathpdf(struct.getGrid_pathpdf());
      setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_nmrcopia(struct.getGrid_nmrcopia());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem getStruct( )
   {
      app.StructSdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem struct = new app.StructSdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem ();
      struct.setEmprcod(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprcod());
      struct.setEmprnom(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprnom());
      struct.setAlbprocod(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprocod());
      struct.setAlbpropri(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpropri());
      struct.setAlbproest(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproest());
      if ( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch_N == 0 )
      {
         struct.setAlbprofch(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch());
      }
      if ( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal_N == 0 )
      {
         struct.setAlbfecsal(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal());
      }
      struct.setAlbhorsal(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhorsal());
      struct.setAlbusu(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albusu());
      struct.setGuiremcli(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcli());
      struct.setGuiremcln(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcln());
      struct.setAlbclides(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albclides());
      struct.setAlbdomenv(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdomenv());
      struct.setTrncod(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trncod());
      struct.setTrnnom(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnom());
      struct.setAlbmat(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmat());
      struct.setAlbsec(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albsec());
      struct.setAlbenvftp(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albenvftp());
      struct.setAlblic(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblic());
      struct.setAlbproat(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproat());
      if ( gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm_N == 0 )
      {
         struct.setAlbhhfm(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm());
      }
      struct.setAlbgrosst(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albgrosst());
      struct.setAlbtrnnc(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnc());
      struct.setAlbfmd(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmd());
      struct.setAlbtrnnm(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnm());
      struct.setAlbfmdc(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmdc());
      struct.setAlbtrndm(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrndm());
      struct.setAlbmarca(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarca());
      struct.setAlblocdes(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblocdes());
      struct.setAlbloccar(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albloccar());
      struct.setAlbpobscon(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpobscon());
      struct.setAlbivacod(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albivacod());
      struct.setAlbcolca(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcolca());
      struct.setAlbdesp(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdesp());
      struct.setAlbcambio(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcambio());
      struct.setAlbtipdoc(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipdoc());
      struct.setAlbmottr(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmottr());
      struct.setAlbtipcal(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipcal());
      struct.setAlbobscb(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albobscb());
      struct.setAlbnumt(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albnumt());
      struct.setAlbmarco(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarco());
      struct.setAlbocomp(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albocomp());
      struct.setTrnnif(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnif());
      struct.setAlbdivtcod(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivtcod());
      struct.setAlbdivabr(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivabr());
      struct.setAlbdivcod(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivcod());
      struct.setBusdomenv(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Busdomenv());
      struct.setEmprguirem(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprguirem());
      struct.setGuiremdom(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdom());
      struct.setGuiremdivt(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdivt());
      struct.setGuiremdiv(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdiv());
      struct.setClivala(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Clivala());
      struct.setClimailgre(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgre());
      struct.setClimailgr(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgr());
      struct.setClimailpke(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpke());
      struct.setClimailpk(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpk());
      struct.setCod_pais(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Cod_pais());
      struct.setIcon(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon());
      struct.setIcon_gxi(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon_gxi());
      struct.setGrid_pathpdf(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_pathpdf());
      struct.setGrid_nmrcopia(getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_nmrcopia());
      return struct ;
   }

   protected byte gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_N ;
   protected byte gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproest ;
   protected byte gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch_N ;
   protected byte gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal_N ;
   protected byte gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdomenv ;
   protected byte gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albenvftp ;
   protected byte gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm_N ;
   protected byte gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblocdes ;
   protected byte gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albloccar ;
   protected byte gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpobscon ;
   protected byte gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipcal ;
   protected byte gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivcod ;
   protected byte gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Busdomenv ;
   protected byte gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdom ;
   protected byte gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdiv ;
   protected short gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trncod ;
   protected short gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Cod_pais ;
   protected short gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_nmrcopia ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcli ;
   protected int gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albclides ;
   protected int gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdesp ;
   protected int gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipdoc ;
   protected long gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprocod ;
   protected long gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albnumt ;
   protected java.math.BigDecimal gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albgrosst ;
   protected java.math.BigDecimal gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcambio ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprcod ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprnom ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpropri ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhorsal ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albusu ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcln ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnom ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmat ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albsec ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblic ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproat ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnc ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnm ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmdc ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrndm ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarca ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albivacod ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcolca ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmottr ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albobscb ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarco ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albocomp ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnif ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivtcod ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivabr ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprguirem ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdivt ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Clivala ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgre ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgr ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpke ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpk ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm ;
   protected java.util.Date datetime_STZ ;
   protected java.util.Date gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch ;
   protected java.util.Date gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmd ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon_gxi ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_pathpdf ;
   protected String gxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon ;
}

