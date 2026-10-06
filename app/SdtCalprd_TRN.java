package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtCalprd_TRN extends GxSilentTrnSdt
{
   public SdtCalprd_TRN( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtCalprd_TRN.class));
   }

   public SdtCalprd_TRN( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle, context, "SdtCalprd_TRN");
      initialize( remoteHandle) ;
   }

   public SdtCalprd_TRN( int remoteHandle ,
                         StructSdtCalprd_TRN struct )
   {
      this(remoteHandle);
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

   public void Load( String AV396EmprCod ,
                     long AV30AlbProCod )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV396EmprCod,Long.valueOf(AV30AlbProCod)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"EmprCod", String.class}, new Object[]{"AlbProCod", long.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Calprd_TRN");
      metadata.set("BT", "TXPCALPRD");
      metadata.set("PK", "[ \"AlbProCod\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"DivCod\" ],\"FKMap\":[ \"AlbDivCod-DivCod\" ] },{ \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"CliCod\" ],\"FKMap\":[ \"EmprGuiRem-EmprCod\",\"GuiRemCli-CliCod\" ] },{ \"FK\":[ \"EmprCod\",\"TrnCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"TrnCod\" ],\"FKMap\":[ \"EmprGuiRem-EmprCod\" ] } ]");
      metadata.set("AllowInsert", "True");
      metadata.set("AllowUpdate", "True");
      metadata.set("AllowDelete", "True");
      return metadata ;
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
               gxTv_SdtCalprd_TRN_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProCod") )
            {
               gxTv_SdtCalprd_TRN_Albprocod = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProPri") )
            {
               gxTv_SdtCalprd_TRN_Albpropri = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProEst") )
            {
               gxTv_SdtCalprd_TRN_Albproest = (byte)(getnumericvalue(oReader.getValue())) ;
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
                  gxTv_SdtCalprd_TRN_Albprofch = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtCalprd_TRN_Albprofch = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
                  gxTv_SdtCalprd_TRN_Albfecsal = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtCalprd_TRN_Albfecsal = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtCalprd_TRN_Albhorsal = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbUsu") )
            {
               gxTv_SdtCalprd_TRN_Albusu = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemCli") )
            {
               gxTv_SdtCalprd_TRN_Guiremcli = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemCln") )
            {
               gxTv_SdtCalprd_TRN_Guiremcln = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbCliDes") )
            {
               gxTv_SdtCalprd_TRN_Albclides = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDomEnv") )
            {
               gxTv_SdtCalprd_TRN_Albdomenv = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnCod") )
            {
               gxTv_SdtCalprd_TRN_Trncod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnNom") )
            {
               gxTv_SdtCalprd_TRN_Trnnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbMat") )
            {
               gxTv_SdtCalprd_TRN_Albmat = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbSec") )
            {
               gxTv_SdtCalprd_TRN_Albsec = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbEnvFtp") )
            {
               gxTv_SdtCalprd_TRN_Albenvftp = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbLic") )
            {
               gxTv_SdtCalprd_TRN_Alblic = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProAT") )
            {
               gxTv_SdtCalprd_TRN_Albproat = oReader.getValue() ;
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
                  gxTv_SdtCalprd_TRN_Albhhfm = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtCalprd_TRN_Albhhfm = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
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
               gxTv_SdtCalprd_TRN_Albgrosst = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTrnNc") )
            {
               gxTv_SdtCalprd_TRN_Albtrnnc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbFmd") )
            {
               gxTv_SdtCalprd_TRN_Albfmd = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTrnNm") )
            {
               gxTv_SdtCalprd_TRN_Albtrnnm = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ALbFmdc") )
            {
               gxTv_SdtCalprd_TRN_Albfmdc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTrnDm") )
            {
               gxTv_SdtCalprd_TRN_Albtrndm = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbMarca") )
            {
               gxTv_SdtCalprd_TRN_Albmarca = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbLocDes") )
            {
               gxTv_SdtCalprd_TRN_Alblocdes = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbLocCar") )
            {
               gxTv_SdtCalprd_TRN_Albloccar = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPObsCon") )
            {
               gxTv_SdtCalprd_TRN_Albpobscon = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbIvaCod") )
            {
               gxTv_SdtCalprd_TRN_Albivacod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbColCa") )
            {
               gxTv_SdtCalprd_TRN_Albcolca = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDesp") )
            {
               gxTv_SdtCalprd_TRN_Albdesp = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbCambio") )
            {
               gxTv_SdtCalprd_TRN_Albcambio = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTipDoc") )
            {
               gxTv_SdtCalprd_TRN_Albtipdoc = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbMotTr") )
            {
               gxTv_SdtCalprd_TRN_Albmottr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTipCal") )
            {
               gxTv_SdtCalprd_TRN_Albtipcal = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbObsCb") )
            {
               gxTv_SdtCalprd_TRN_Albobscb = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbNumT") )
            {
               gxTv_SdtCalprd_TRN_Albnumt = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbMarCo") )
            {
               gxTv_SdtCalprd_TRN_Albmarco = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbOComp") )
            {
               gxTv_SdtCalprd_TRN_Albocomp = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnNif") )
            {
               gxTv_SdtCalprd_TRN_Trnnif = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDivTCod") )
            {
               gxTv_SdtCalprd_TRN_Albdivtcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDivAbr") )
            {
               gxTv_SdtCalprd_TRN_Albdivabr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDivCod") )
            {
               gxTv_SdtCalprd_TRN_Albdivcod = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BusDomEnv") )
            {
               gxTv_SdtCalprd_TRN_Busdomenv = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprGuiRem") )
            {
               gxTv_SdtCalprd_TRN_Emprguirem = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemDom") )
            {
               gxTv_SdtCalprd_TRN_Guiremdom = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemDivT") )
            {
               gxTv_SdtCalprd_TRN_Guiremdivt = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemDiv") )
            {
               gxTv_SdtCalprd_TRN_Guiremdiv = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtCalprd_TRN_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtCalprd_TRN_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtCalprd_TRN_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod_Z") )
            {
               gxTv_SdtCalprd_TRN_Emprcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProCod_Z") )
            {
               gxTv_SdtCalprd_TRN_Albprocod_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProPri_Z") )
            {
               gxTv_SdtCalprd_TRN_Albpropri_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProEst_Z") )
            {
               gxTv_SdtCalprd_TRN_Albproest_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProfch_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtCalprd_TRN_Albprofch_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtCalprd_TRN_Albprofch_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbFecSal_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtCalprd_TRN_Albfecsal_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtCalprd_TRN_Albfecsal_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbHorSal_Z") )
            {
               gxTv_SdtCalprd_TRN_Albhorsal_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbUsu_Z") )
            {
               gxTv_SdtCalprd_TRN_Albusu_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemCli_Z") )
            {
               gxTv_SdtCalprd_TRN_Guiremcli_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemCln_Z") )
            {
               gxTv_SdtCalprd_TRN_Guiremcln_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbCliDes_Z") )
            {
               gxTv_SdtCalprd_TRN_Albclides_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDomEnv_Z") )
            {
               gxTv_SdtCalprd_TRN_Albdomenv_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnCod_Z") )
            {
               gxTv_SdtCalprd_TRN_Trncod_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnNom_Z") )
            {
               gxTv_SdtCalprd_TRN_Trnnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbMat_Z") )
            {
               gxTv_SdtCalprd_TRN_Albmat_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbSec_Z") )
            {
               gxTv_SdtCalprd_TRN_Albsec_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbEnvFtp_Z") )
            {
               gxTv_SdtCalprd_TRN_Albenvftp_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbLic_Z") )
            {
               gxTv_SdtCalprd_TRN_Alblic_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProAT_Z") )
            {
               gxTv_SdtCalprd_TRN_Albproat_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbHhfm_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtCalprd_TRN_Albhhfm_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtCalprd_TRN_Albhhfm_Z = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbGrossT_Z") )
            {
               gxTv_SdtCalprd_TRN_Albgrosst_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTrnNc_Z") )
            {
               gxTv_SdtCalprd_TRN_Albtrnnc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbFmd_Z") )
            {
               gxTv_SdtCalprd_TRN_Albfmd_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTrnNm_Z") )
            {
               gxTv_SdtCalprd_TRN_Albtrnnm_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ALbFmdc_Z") )
            {
               gxTv_SdtCalprd_TRN_Albfmdc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTrnDm_Z") )
            {
               gxTv_SdtCalprd_TRN_Albtrndm_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbMarca_Z") )
            {
               gxTv_SdtCalprd_TRN_Albmarca_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbLocDes_Z") )
            {
               gxTv_SdtCalprd_TRN_Alblocdes_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbLocCar_Z") )
            {
               gxTv_SdtCalprd_TRN_Albloccar_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPObsCon_Z") )
            {
               gxTv_SdtCalprd_TRN_Albpobscon_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbIvaCod_Z") )
            {
               gxTv_SdtCalprd_TRN_Albivacod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbColCa_Z") )
            {
               gxTv_SdtCalprd_TRN_Albcolca_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDesp_Z") )
            {
               gxTv_SdtCalprd_TRN_Albdesp_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbCambio_Z") )
            {
               gxTv_SdtCalprd_TRN_Albcambio_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTipDoc_Z") )
            {
               gxTv_SdtCalprd_TRN_Albtipdoc_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbMotTr_Z") )
            {
               gxTv_SdtCalprd_TRN_Albmottr_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTipCal_Z") )
            {
               gxTv_SdtCalprd_TRN_Albtipcal_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbObsCb_Z") )
            {
               gxTv_SdtCalprd_TRN_Albobscb_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbNumT_Z") )
            {
               gxTv_SdtCalprd_TRN_Albnumt_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbMarCo_Z") )
            {
               gxTv_SdtCalprd_TRN_Albmarco_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbOComp_Z") )
            {
               gxTv_SdtCalprd_TRN_Albocomp_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnNif_Z") )
            {
               gxTv_SdtCalprd_TRN_Trnnif_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDivTCod_Z") )
            {
               gxTv_SdtCalprd_TRN_Albdivtcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDivAbr_Z") )
            {
               gxTv_SdtCalprd_TRN_Albdivabr_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDivCod_Z") )
            {
               gxTv_SdtCalprd_TRN_Albdivcod_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BusDomEnv_Z") )
            {
               gxTv_SdtCalprd_TRN_Busdomenv_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprGuiRem_Z") )
            {
               gxTv_SdtCalprd_TRN_Emprguirem_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemDom_Z") )
            {
               gxTv_SdtCalprd_TRN_Guiremdom_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemDivT_Z") )
            {
               gxTv_SdtCalprd_TRN_Guiremdivt_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemDiv_Z") )
            {
               gxTv_SdtCalprd_TRN_Guiremdiv_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_Z") )
            {
               gxTv_SdtCalprd_TRN_Emprnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDomEnv_N") )
            {
               gxTv_SdtCalprd_TRN_Albdomenv_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnNom_N") )
            {
               gxTv_SdtCalprd_TRN_Trnnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbFmd_N") )
            {
               gxTv_SdtCalprd_TRN_Albfmd_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnNif_N") )
            {
               gxTv_SdtCalprd_TRN_Trnnif_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDivTCod_N") )
            {
               gxTv_SdtCalprd_TRN_Albdivtcod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDivAbr_N") )
            {
               gxTv_SdtCalprd_TRN_Albdivabr_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDivCod_N") )
            {
               gxTv_SdtCalprd_TRN_Albdivcod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BusDomEnv_N") )
            {
               gxTv_SdtCalprd_TRN_Busdomenv_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemDom_N") )
            {
               gxTv_SdtCalprd_TRN_Guiremdom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemDivT_N") )
            {
               gxTv_SdtCalprd_TRN_Guiremdivt_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemDiv_N") )
            {
               gxTv_SdtCalprd_TRN_Guiremdiv_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_N") )
            {
               gxTv_SdtCalprd_TRN_Emprnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "Calprd_TRN" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "TexplusNET" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtCalprd_TRN_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProCod", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albprocod, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProPri", gxTv_SdtCalprd_TRN_Albpropri);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProEst", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albproest, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCalprd_TRN_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCalprd_TRN_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCalprd_TRN_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("AlbProfch", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCalprd_TRN_Albfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCalprd_TRN_Albfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCalprd_TRN_Albfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("AlbFecSal", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbHorSal", gxTv_SdtCalprd_TRN_Albhorsal);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbUsu", gxTv_SdtCalprd_TRN_Albusu);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GuiRemCli", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Guiremcli, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GuiRemCln", gxTv_SdtCalprd_TRN_Guiremcln);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbCliDes", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albclides, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDomEnv", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albdomenv, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TrnCod", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Trncod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TrnNom", gxTv_SdtCalprd_TRN_Trnnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbMat", gxTv_SdtCalprd_TRN_Albmat);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbSec", gxTv_SdtCalprd_TRN_Albsec);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbEnvFtp", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albenvftp, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbLic", gxTv_SdtCalprd_TRN_Alblic);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProAT", gxTv_SdtCalprd_TRN_Albproat);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCalprd_TRN_Albhhfm), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCalprd_TRN_Albhhfm), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCalprd_TRN_Albhhfm), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtCalprd_TRN_Albhhfm), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtCalprd_TRN_Albhhfm), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtCalprd_TRN_Albhhfm), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("AlbHhfm", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbGrossT", GXutil.trim( GXutil.strNoRound( gxTv_SdtCalprd_TRN_Albgrosst, 13, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbTrnNc", gxTv_SdtCalprd_TRN_Albtrnnc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbFmd", gxTv_SdtCalprd_TRN_Albfmd);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbTrnNm", gxTv_SdtCalprd_TRN_Albtrnnm);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ALbFmdc", gxTv_SdtCalprd_TRN_Albfmdc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbTrnDm", gxTv_SdtCalprd_TRN_Albtrndm);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbMarca", gxTv_SdtCalprd_TRN_Albmarca);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbLocDes", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Alblocdes, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbLocCar", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albloccar, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbPObsCon", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albpobscon, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbIvaCod", gxTv_SdtCalprd_TRN_Albivacod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbColCa", gxTv_SdtCalprd_TRN_Albcolca);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDesp", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albdesp, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbCambio", GXutil.trim( GXutil.strNoRound( gxTv_SdtCalprd_TRN_Albcambio, 7, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbTipDoc", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albtipdoc, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbMotTr", gxTv_SdtCalprd_TRN_Albmottr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbTipCal", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albtipcal, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbObsCb", gxTv_SdtCalprd_TRN_Albobscb);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbNumT", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albnumt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbMarCo", gxTv_SdtCalprd_TRN_Albmarco);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbOComp", gxTv_SdtCalprd_TRN_Albocomp);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TrnNif", gxTv_SdtCalprd_TRN_Trnnif);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDivTCod", gxTv_SdtCalprd_TRN_Albdivtcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDivAbr", gxTv_SdtCalprd_TRN_Albdivabr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDivCod", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albdivcod, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BusDomEnv", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Busdomenv, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprGuiRem", gxTv_SdtCalprd_TRN_Emprguirem);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GuiRemDom", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Guiremdom, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GuiRemDivT", gxTv_SdtCalprd_TRN_Guiremdivt);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GuiRemDiv", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Guiremdiv, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtCalprd_TRN_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtCalprd_TRN_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprCod_Z", gxTv_SdtCalprd_TRN_Emprcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbProCod_Z", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albprocod_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbProPri_Z", gxTv_SdtCalprd_TRN_Albpropri_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbProEst_Z", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albproest_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCalprd_TRN_Albprofch_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCalprd_TRN_Albprofch_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCalprd_TRN_Albprofch_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbProfch_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCalprd_TRN_Albfecsal_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCalprd_TRN_Albfecsal_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCalprd_TRN_Albfecsal_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbFecSal_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbHorSal_Z", gxTv_SdtCalprd_TRN_Albhorsal_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbUsu_Z", gxTv_SdtCalprd_TRN_Albusu_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("GuiRemCli_Z", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Guiremcli_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("GuiRemCln_Z", gxTv_SdtCalprd_TRN_Guiremcln_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbCliDes_Z", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albclides_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbDomEnv_Z", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albdomenv_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TrnCod_Z", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Trncod_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TrnNom_Z", gxTv_SdtCalprd_TRN_Trnnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbMat_Z", gxTv_SdtCalprd_TRN_Albmat_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbSec_Z", gxTv_SdtCalprd_TRN_Albsec_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbEnvFtp_Z", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albenvftp_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbLic_Z", gxTv_SdtCalprd_TRN_Alblic_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbProAT_Z", gxTv_SdtCalprd_TRN_Albproat_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCalprd_TRN_Albhhfm_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCalprd_TRN_Albhhfm_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCalprd_TRN_Albhhfm_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtCalprd_TRN_Albhhfm_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtCalprd_TRN_Albhhfm_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtCalprd_TRN_Albhhfm_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbHhfm_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbGrossT_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtCalprd_TRN_Albgrosst_Z, 13, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbTrnNc_Z", gxTv_SdtCalprd_TRN_Albtrnnc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbFmd_Z", gxTv_SdtCalprd_TRN_Albfmd_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbTrnNm_Z", gxTv_SdtCalprd_TRN_Albtrnnm_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ALbFmdc_Z", gxTv_SdtCalprd_TRN_Albfmdc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbTrnDm_Z", gxTv_SdtCalprd_TRN_Albtrndm_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbMarca_Z", gxTv_SdtCalprd_TRN_Albmarca_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbLocDes_Z", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Alblocdes_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbLocCar_Z", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albloccar_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbPObsCon_Z", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albpobscon_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbIvaCod_Z", gxTv_SdtCalprd_TRN_Albivacod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbColCa_Z", gxTv_SdtCalprd_TRN_Albcolca_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbDesp_Z", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albdesp_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbCambio_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtCalprd_TRN_Albcambio_Z, 7, 4)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbTipDoc_Z", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albtipdoc_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbMotTr_Z", gxTv_SdtCalprd_TRN_Albmottr_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbTipCal_Z", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albtipcal_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbObsCb_Z", gxTv_SdtCalprd_TRN_Albobscb_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbNumT_Z", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albnumt_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbMarCo_Z", gxTv_SdtCalprd_TRN_Albmarco_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbOComp_Z", gxTv_SdtCalprd_TRN_Albocomp_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TrnNif_Z", gxTv_SdtCalprd_TRN_Trnnif_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbDivTCod_Z", gxTv_SdtCalprd_TRN_Albdivtcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbDivAbr_Z", gxTv_SdtCalprd_TRN_Albdivabr_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbDivCod_Z", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albdivcod_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BusDomEnv_Z", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Busdomenv_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprGuiRem_Z", gxTv_SdtCalprd_TRN_Emprguirem_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("GuiRemDom_Z", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Guiremdom_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("GuiRemDivT_Z", gxTv_SdtCalprd_TRN_Guiremdivt_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("GuiRemDiv_Z", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Guiremdiv_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_Z", gxTv_SdtCalprd_TRN_Emprnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbDomEnv_N", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albdomenv_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TrnNom_N", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Trnnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbFmd_N", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albfmd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TrnNif_N", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Trnnif_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbDivTCod_N", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albdivtcod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbDivAbr_N", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albdivabr_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbDivCod_N", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Albdivcod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BusDomEnv_N", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Busdomenv_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("GuiRemDom_N", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Guiremdom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("GuiRemDivT_N", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Guiremdivt_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("GuiRemDiv_N", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Guiremdiv_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_N", GXutil.trim( GXutil.str( gxTv_SdtCalprd_TRN_Emprnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
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
      AddObjectProperty("EmprCod", gxTv_SdtCalprd_TRN_Emprcod, false, includeNonInitialized);
      AddObjectProperty("AlbProCod", gxTv_SdtCalprd_TRN_Albprocod, false, includeNonInitialized);
      AddObjectProperty("AlbProPri", gxTv_SdtCalprd_TRN_Albpropri, false, includeNonInitialized);
      AddObjectProperty("AlbProEst", gxTv_SdtCalprd_TRN_Albproest, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCalprd_TRN_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCalprd_TRN_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCalprd_TRN_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("AlbProfch", sDateCnv, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCalprd_TRN_Albfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCalprd_TRN_Albfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCalprd_TRN_Albfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("AlbFecSal", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("AlbHorSal", gxTv_SdtCalprd_TRN_Albhorsal, false, includeNonInitialized);
      AddObjectProperty("AlbUsu", gxTv_SdtCalprd_TRN_Albusu, false, includeNonInitialized);
      AddObjectProperty("GuiRemCli", gxTv_SdtCalprd_TRN_Guiremcli, false, includeNonInitialized);
      AddObjectProperty("GuiRemCln", gxTv_SdtCalprd_TRN_Guiremcln, false, includeNonInitialized);
      AddObjectProperty("AlbCliDes", gxTv_SdtCalprd_TRN_Albclides, false, includeNonInitialized);
      AddObjectProperty("AlbDomEnv", gxTv_SdtCalprd_TRN_Albdomenv, false, includeNonInitialized);
      AddObjectProperty("AlbDomEnv_N", gxTv_SdtCalprd_TRN_Albdomenv_N, false, includeNonInitialized);
      AddObjectProperty("TrnCod", gxTv_SdtCalprd_TRN_Trncod, false, includeNonInitialized);
      AddObjectProperty("TrnNom", gxTv_SdtCalprd_TRN_Trnnom, false, includeNonInitialized);
      AddObjectProperty("TrnNom_N", gxTv_SdtCalprd_TRN_Trnnom_N, false, includeNonInitialized);
      AddObjectProperty("AlbMat", gxTv_SdtCalprd_TRN_Albmat, false, includeNonInitialized);
      AddObjectProperty("AlbSec", gxTv_SdtCalprd_TRN_Albsec, false, includeNonInitialized);
      AddObjectProperty("AlbEnvFtp", gxTv_SdtCalprd_TRN_Albenvftp, false, includeNonInitialized);
      AddObjectProperty("AlbLic", gxTv_SdtCalprd_TRN_Alblic, false, includeNonInitialized);
      AddObjectProperty("AlbProAT", gxTv_SdtCalprd_TRN_Albproat, false, includeNonInitialized);
      datetime_STZ = gxTv_SdtCalprd_TRN_Albhhfm ;
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
      AddObjectProperty("AlbHhfm", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("AlbGrossT", gxTv_SdtCalprd_TRN_Albgrosst, false, includeNonInitialized);
      AddObjectProperty("AlbTrnNc", gxTv_SdtCalprd_TRN_Albtrnnc, false, includeNonInitialized);
      AddObjectProperty("AlbFmd", gxTv_SdtCalprd_TRN_Albfmd, false, includeNonInitialized);
      AddObjectProperty("AlbFmd_N", gxTv_SdtCalprd_TRN_Albfmd_N, false, includeNonInitialized);
      AddObjectProperty("AlbTrnNm", gxTv_SdtCalprd_TRN_Albtrnnm, false, includeNonInitialized);
      AddObjectProperty("ALbFmdc", gxTv_SdtCalprd_TRN_Albfmdc, false, includeNonInitialized);
      AddObjectProperty("AlbTrnDm", gxTv_SdtCalprd_TRN_Albtrndm, false, includeNonInitialized);
      AddObjectProperty("AlbMarca", gxTv_SdtCalprd_TRN_Albmarca, false, includeNonInitialized);
      AddObjectProperty("AlbLocDes", gxTv_SdtCalprd_TRN_Alblocdes, false, includeNonInitialized);
      AddObjectProperty("AlbLocCar", gxTv_SdtCalprd_TRN_Albloccar, false, includeNonInitialized);
      AddObjectProperty("AlbPObsCon", gxTv_SdtCalprd_TRN_Albpobscon, false, includeNonInitialized);
      AddObjectProperty("AlbIvaCod", gxTv_SdtCalprd_TRN_Albivacod, false, includeNonInitialized);
      AddObjectProperty("AlbColCa", gxTv_SdtCalprd_TRN_Albcolca, false, includeNonInitialized);
      AddObjectProperty("AlbDesp", gxTv_SdtCalprd_TRN_Albdesp, false, includeNonInitialized);
      AddObjectProperty("AlbCambio", gxTv_SdtCalprd_TRN_Albcambio, false, includeNonInitialized);
      AddObjectProperty("AlbTipDoc", gxTv_SdtCalprd_TRN_Albtipdoc, false, includeNonInitialized);
      AddObjectProperty("AlbMotTr", gxTv_SdtCalprd_TRN_Albmottr, false, includeNonInitialized);
      AddObjectProperty("AlbTipCal", gxTv_SdtCalprd_TRN_Albtipcal, false, includeNonInitialized);
      AddObjectProperty("AlbObsCb", gxTv_SdtCalprd_TRN_Albobscb, false, includeNonInitialized);
      AddObjectProperty("AlbNumT", gxTv_SdtCalprd_TRN_Albnumt, false, includeNonInitialized);
      AddObjectProperty("AlbMarCo", gxTv_SdtCalprd_TRN_Albmarco, false, includeNonInitialized);
      AddObjectProperty("AlbOComp", gxTv_SdtCalprd_TRN_Albocomp, false, includeNonInitialized);
      AddObjectProperty("TrnNif", gxTv_SdtCalprd_TRN_Trnnif, false, includeNonInitialized);
      AddObjectProperty("TrnNif_N", gxTv_SdtCalprd_TRN_Trnnif_N, false, includeNonInitialized);
      AddObjectProperty("AlbDivTCod", gxTv_SdtCalprd_TRN_Albdivtcod, false, includeNonInitialized);
      AddObjectProperty("AlbDivTCod_N", gxTv_SdtCalprd_TRN_Albdivtcod_N, false, includeNonInitialized);
      AddObjectProperty("AlbDivAbr", gxTv_SdtCalprd_TRN_Albdivabr, false, includeNonInitialized);
      AddObjectProperty("AlbDivAbr_N", gxTv_SdtCalprd_TRN_Albdivabr_N, false, includeNonInitialized);
      AddObjectProperty("AlbDivCod", gxTv_SdtCalprd_TRN_Albdivcod, false, includeNonInitialized);
      AddObjectProperty("AlbDivCod_N", gxTv_SdtCalprd_TRN_Albdivcod_N, false, includeNonInitialized);
      AddObjectProperty("BusDomEnv", gxTv_SdtCalprd_TRN_Busdomenv, false, includeNonInitialized);
      AddObjectProperty("BusDomEnv_N", gxTv_SdtCalprd_TRN_Busdomenv_N, false, includeNonInitialized);
      AddObjectProperty("EmprGuiRem", gxTv_SdtCalprd_TRN_Emprguirem, false, includeNonInitialized);
      AddObjectProperty("GuiRemDom", gxTv_SdtCalprd_TRN_Guiremdom, false, includeNonInitialized);
      AddObjectProperty("GuiRemDom_N", gxTv_SdtCalprd_TRN_Guiremdom_N, false, includeNonInitialized);
      AddObjectProperty("GuiRemDivT", gxTv_SdtCalprd_TRN_Guiremdivt, false, includeNonInitialized);
      AddObjectProperty("GuiRemDivT_N", gxTv_SdtCalprd_TRN_Guiremdivt_N, false, includeNonInitialized);
      AddObjectProperty("GuiRemDiv", gxTv_SdtCalprd_TRN_Guiremdiv, false, includeNonInitialized);
      AddObjectProperty("GuiRemDiv_N", gxTv_SdtCalprd_TRN_Guiremdiv_N, false, includeNonInitialized);
      AddObjectProperty("EmprNom", gxTv_SdtCalprd_TRN_Emprnom, false, includeNonInitialized);
      AddObjectProperty("EmprNom_N", gxTv_SdtCalprd_TRN_Emprnom_N, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtCalprd_TRN_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtCalprd_TRN_Initialized, false, includeNonInitialized);
         AddObjectProperty("EmprCod_Z", gxTv_SdtCalprd_TRN_Emprcod_Z, false, includeNonInitialized);
         AddObjectProperty("AlbProCod_Z", gxTv_SdtCalprd_TRN_Albprocod_Z, false, includeNonInitialized);
         AddObjectProperty("AlbProPri_Z", gxTv_SdtCalprd_TRN_Albpropri_Z, false, includeNonInitialized);
         AddObjectProperty("AlbProEst_Z", gxTv_SdtCalprd_TRN_Albproest_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCalprd_TRN_Albprofch_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCalprd_TRN_Albprofch_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCalprd_TRN_Albprofch_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("AlbProfch_Z", sDateCnv, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCalprd_TRN_Albfecsal_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCalprd_TRN_Albfecsal_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCalprd_TRN_Albfecsal_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("AlbFecSal_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("AlbHorSal_Z", gxTv_SdtCalprd_TRN_Albhorsal_Z, false, includeNonInitialized);
         AddObjectProperty("AlbUsu_Z", gxTv_SdtCalprd_TRN_Albusu_Z, false, includeNonInitialized);
         AddObjectProperty("GuiRemCli_Z", gxTv_SdtCalprd_TRN_Guiremcli_Z, false, includeNonInitialized);
         AddObjectProperty("GuiRemCln_Z", gxTv_SdtCalprd_TRN_Guiremcln_Z, false, includeNonInitialized);
         AddObjectProperty("AlbCliDes_Z", gxTv_SdtCalprd_TRN_Albclides_Z, false, includeNonInitialized);
         AddObjectProperty("AlbDomEnv_Z", gxTv_SdtCalprd_TRN_Albdomenv_Z, false, includeNonInitialized);
         AddObjectProperty("TrnCod_Z", gxTv_SdtCalprd_TRN_Trncod_Z, false, includeNonInitialized);
         AddObjectProperty("TrnNom_Z", gxTv_SdtCalprd_TRN_Trnnom_Z, false, includeNonInitialized);
         AddObjectProperty("AlbMat_Z", gxTv_SdtCalprd_TRN_Albmat_Z, false, includeNonInitialized);
         AddObjectProperty("AlbSec_Z", gxTv_SdtCalprd_TRN_Albsec_Z, false, includeNonInitialized);
         AddObjectProperty("AlbEnvFtp_Z", gxTv_SdtCalprd_TRN_Albenvftp_Z, false, includeNonInitialized);
         AddObjectProperty("AlbLic_Z", gxTv_SdtCalprd_TRN_Alblic_Z, false, includeNonInitialized);
         AddObjectProperty("AlbProAT_Z", gxTv_SdtCalprd_TRN_Albproat_Z, false, includeNonInitialized);
         datetime_STZ = gxTv_SdtCalprd_TRN_Albhhfm_Z ;
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
         AddObjectProperty("AlbHhfm_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("AlbGrossT_Z", gxTv_SdtCalprd_TRN_Albgrosst_Z, false, includeNonInitialized);
         AddObjectProperty("AlbTrnNc_Z", gxTv_SdtCalprd_TRN_Albtrnnc_Z, false, includeNonInitialized);
         AddObjectProperty("AlbFmd_Z", gxTv_SdtCalprd_TRN_Albfmd_Z, false, includeNonInitialized);
         AddObjectProperty("AlbTrnNm_Z", gxTv_SdtCalprd_TRN_Albtrnnm_Z, false, includeNonInitialized);
         AddObjectProperty("ALbFmdc_Z", gxTv_SdtCalprd_TRN_Albfmdc_Z, false, includeNonInitialized);
         AddObjectProperty("AlbTrnDm_Z", gxTv_SdtCalprd_TRN_Albtrndm_Z, false, includeNonInitialized);
         AddObjectProperty("AlbMarca_Z", gxTv_SdtCalprd_TRN_Albmarca_Z, false, includeNonInitialized);
         AddObjectProperty("AlbLocDes_Z", gxTv_SdtCalprd_TRN_Alblocdes_Z, false, includeNonInitialized);
         AddObjectProperty("AlbLocCar_Z", gxTv_SdtCalprd_TRN_Albloccar_Z, false, includeNonInitialized);
         AddObjectProperty("AlbPObsCon_Z", gxTv_SdtCalprd_TRN_Albpobscon_Z, false, includeNonInitialized);
         AddObjectProperty("AlbIvaCod_Z", gxTv_SdtCalprd_TRN_Albivacod_Z, false, includeNonInitialized);
         AddObjectProperty("AlbColCa_Z", gxTv_SdtCalprd_TRN_Albcolca_Z, false, includeNonInitialized);
         AddObjectProperty("AlbDesp_Z", gxTv_SdtCalprd_TRN_Albdesp_Z, false, includeNonInitialized);
         AddObjectProperty("AlbCambio_Z", gxTv_SdtCalprd_TRN_Albcambio_Z, false, includeNonInitialized);
         AddObjectProperty("AlbTipDoc_Z", gxTv_SdtCalprd_TRN_Albtipdoc_Z, false, includeNonInitialized);
         AddObjectProperty("AlbMotTr_Z", gxTv_SdtCalprd_TRN_Albmottr_Z, false, includeNonInitialized);
         AddObjectProperty("AlbTipCal_Z", gxTv_SdtCalprd_TRN_Albtipcal_Z, false, includeNonInitialized);
         AddObjectProperty("AlbObsCb_Z", gxTv_SdtCalprd_TRN_Albobscb_Z, false, includeNonInitialized);
         AddObjectProperty("AlbNumT_Z", gxTv_SdtCalprd_TRN_Albnumt_Z, false, includeNonInitialized);
         AddObjectProperty("AlbMarCo_Z", gxTv_SdtCalprd_TRN_Albmarco_Z, false, includeNonInitialized);
         AddObjectProperty("AlbOComp_Z", gxTv_SdtCalprd_TRN_Albocomp_Z, false, includeNonInitialized);
         AddObjectProperty("TrnNif_Z", gxTv_SdtCalprd_TRN_Trnnif_Z, false, includeNonInitialized);
         AddObjectProperty("AlbDivTCod_Z", gxTv_SdtCalprd_TRN_Albdivtcod_Z, false, includeNonInitialized);
         AddObjectProperty("AlbDivAbr_Z", gxTv_SdtCalprd_TRN_Albdivabr_Z, false, includeNonInitialized);
         AddObjectProperty("AlbDivCod_Z", gxTv_SdtCalprd_TRN_Albdivcod_Z, false, includeNonInitialized);
         AddObjectProperty("BusDomEnv_Z", gxTv_SdtCalprd_TRN_Busdomenv_Z, false, includeNonInitialized);
         AddObjectProperty("EmprGuiRem_Z", gxTv_SdtCalprd_TRN_Emprguirem_Z, false, includeNonInitialized);
         AddObjectProperty("GuiRemDom_Z", gxTv_SdtCalprd_TRN_Guiremdom_Z, false, includeNonInitialized);
         AddObjectProperty("GuiRemDivT_Z", gxTv_SdtCalprd_TRN_Guiremdivt_Z, false, includeNonInitialized);
         AddObjectProperty("GuiRemDiv_Z", gxTv_SdtCalprd_TRN_Guiremdiv_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_Z", gxTv_SdtCalprd_TRN_Emprnom_Z, false, includeNonInitialized);
         AddObjectProperty("AlbDomEnv_N", gxTv_SdtCalprd_TRN_Albdomenv_N, false, includeNonInitialized);
         AddObjectProperty("TrnNom_N", gxTv_SdtCalprd_TRN_Trnnom_N, false, includeNonInitialized);
         AddObjectProperty("AlbFmd_N", gxTv_SdtCalprd_TRN_Albfmd_N, false, includeNonInitialized);
         AddObjectProperty("TrnNif_N", gxTv_SdtCalprd_TRN_Trnnif_N, false, includeNonInitialized);
         AddObjectProperty("AlbDivTCod_N", gxTv_SdtCalprd_TRN_Albdivtcod_N, false, includeNonInitialized);
         AddObjectProperty("AlbDivAbr_N", gxTv_SdtCalprd_TRN_Albdivabr_N, false, includeNonInitialized);
         AddObjectProperty("AlbDivCod_N", gxTv_SdtCalprd_TRN_Albdivcod_N, false, includeNonInitialized);
         AddObjectProperty("BusDomEnv_N", gxTv_SdtCalprd_TRN_Busdomenv_N, false, includeNonInitialized);
         AddObjectProperty("GuiRemDom_N", gxTv_SdtCalprd_TRN_Guiremdom_N, false, includeNonInitialized);
         AddObjectProperty("GuiRemDivT_N", gxTv_SdtCalprd_TRN_Guiremdivt_N, false, includeNonInitialized);
         AddObjectProperty("GuiRemDiv_N", gxTv_SdtCalprd_TRN_Guiremdiv_N, false, includeNonInitialized);
         AddObjectProperty("EmprNom_N", gxTv_SdtCalprd_TRN_Emprnom_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.SdtCalprd_TRN sdt )
   {
      if ( sdt.IsDirty("EmprCod") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Emprcod = sdt.getgxTv_SdtCalprd_TRN_Emprcod() ;
      }
      if ( sdt.IsDirty("AlbProCod") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albprocod = sdt.getgxTv_SdtCalprd_TRN_Albprocod() ;
      }
      if ( sdt.IsDirty("AlbProPri") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albpropri = sdt.getgxTv_SdtCalprd_TRN_Albpropri() ;
      }
      if ( sdt.IsDirty("AlbProEst") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albproest = sdt.getgxTv_SdtCalprd_TRN_Albproest() ;
      }
      if ( sdt.IsDirty("AlbProfch") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albprofch = sdt.getgxTv_SdtCalprd_TRN_Albprofch() ;
      }
      if ( sdt.IsDirty("AlbFecSal") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albfecsal = sdt.getgxTv_SdtCalprd_TRN_Albfecsal() ;
      }
      if ( sdt.IsDirty("AlbHorSal") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albhorsal = sdt.getgxTv_SdtCalprd_TRN_Albhorsal() ;
      }
      if ( sdt.IsDirty("AlbUsu") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albusu = sdt.getgxTv_SdtCalprd_TRN_Albusu() ;
      }
      if ( sdt.IsDirty("GuiRemCli") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Guiremcli = sdt.getgxTv_SdtCalprd_TRN_Guiremcli() ;
      }
      if ( sdt.IsDirty("GuiRemCln") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Guiremcln = sdt.getgxTv_SdtCalprd_TRN_Guiremcln() ;
      }
      if ( sdt.IsDirty("AlbCliDes") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albclides = sdt.getgxTv_SdtCalprd_TRN_Albclides() ;
      }
      if ( sdt.IsDirty("AlbDomEnv") )
      {
         gxTv_SdtCalprd_TRN_Albdomenv_N = sdt.getgxTv_SdtCalprd_TRN_Albdomenv_N() ;
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albdomenv = sdt.getgxTv_SdtCalprd_TRN_Albdomenv() ;
      }
      if ( sdt.IsDirty("TrnCod") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Trncod = sdt.getgxTv_SdtCalprd_TRN_Trncod() ;
      }
      if ( sdt.IsDirty("TrnNom") )
      {
         gxTv_SdtCalprd_TRN_Trnnom_N = sdt.getgxTv_SdtCalprd_TRN_Trnnom_N() ;
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Trnnom = sdt.getgxTv_SdtCalprd_TRN_Trnnom() ;
      }
      if ( sdt.IsDirty("AlbMat") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albmat = sdt.getgxTv_SdtCalprd_TRN_Albmat() ;
      }
      if ( sdt.IsDirty("AlbSec") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albsec = sdt.getgxTv_SdtCalprd_TRN_Albsec() ;
      }
      if ( sdt.IsDirty("AlbEnvFtp") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albenvftp = sdt.getgxTv_SdtCalprd_TRN_Albenvftp() ;
      }
      if ( sdt.IsDirty("AlbLic") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Alblic = sdt.getgxTv_SdtCalprd_TRN_Alblic() ;
      }
      if ( sdt.IsDirty("AlbProAT") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albproat = sdt.getgxTv_SdtCalprd_TRN_Albproat() ;
      }
      if ( sdt.IsDirty("AlbHhfm") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albhhfm = sdt.getgxTv_SdtCalprd_TRN_Albhhfm() ;
      }
      if ( sdt.IsDirty("AlbGrossT") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albgrosst = sdt.getgxTv_SdtCalprd_TRN_Albgrosst() ;
      }
      if ( sdt.IsDirty("AlbTrnNc") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albtrnnc = sdt.getgxTv_SdtCalprd_TRN_Albtrnnc() ;
      }
      if ( sdt.IsDirty("AlbFmd") )
      {
         gxTv_SdtCalprd_TRN_Albfmd_N = sdt.getgxTv_SdtCalprd_TRN_Albfmd_N() ;
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albfmd = sdt.getgxTv_SdtCalprd_TRN_Albfmd() ;
      }
      if ( sdt.IsDirty("AlbTrnNm") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albtrnnm = sdt.getgxTv_SdtCalprd_TRN_Albtrnnm() ;
      }
      if ( sdt.IsDirty("ALbFmdc") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albfmdc = sdt.getgxTv_SdtCalprd_TRN_Albfmdc() ;
      }
      if ( sdt.IsDirty("AlbTrnDm") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albtrndm = sdt.getgxTv_SdtCalprd_TRN_Albtrndm() ;
      }
      if ( sdt.IsDirty("AlbMarca") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albmarca = sdt.getgxTv_SdtCalprd_TRN_Albmarca() ;
      }
      if ( sdt.IsDirty("AlbLocDes") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Alblocdes = sdt.getgxTv_SdtCalprd_TRN_Alblocdes() ;
      }
      if ( sdt.IsDirty("AlbLocCar") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albloccar = sdt.getgxTv_SdtCalprd_TRN_Albloccar() ;
      }
      if ( sdt.IsDirty("AlbPObsCon") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albpobscon = sdt.getgxTv_SdtCalprd_TRN_Albpobscon() ;
      }
      if ( sdt.IsDirty("AlbIvaCod") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albivacod = sdt.getgxTv_SdtCalprd_TRN_Albivacod() ;
      }
      if ( sdt.IsDirty("AlbColCa") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albcolca = sdt.getgxTv_SdtCalprd_TRN_Albcolca() ;
      }
      if ( sdt.IsDirty("AlbDesp") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albdesp = sdt.getgxTv_SdtCalprd_TRN_Albdesp() ;
      }
      if ( sdt.IsDirty("AlbCambio") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albcambio = sdt.getgxTv_SdtCalprd_TRN_Albcambio() ;
      }
      if ( sdt.IsDirty("AlbTipDoc") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albtipdoc = sdt.getgxTv_SdtCalprd_TRN_Albtipdoc() ;
      }
      if ( sdt.IsDirty("AlbMotTr") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albmottr = sdt.getgxTv_SdtCalprd_TRN_Albmottr() ;
      }
      if ( sdt.IsDirty("AlbTipCal") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albtipcal = sdt.getgxTv_SdtCalprd_TRN_Albtipcal() ;
      }
      if ( sdt.IsDirty("AlbObsCb") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albobscb = sdt.getgxTv_SdtCalprd_TRN_Albobscb() ;
      }
      if ( sdt.IsDirty("AlbNumT") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albnumt = sdt.getgxTv_SdtCalprd_TRN_Albnumt() ;
      }
      if ( sdt.IsDirty("AlbMarCo") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albmarco = sdt.getgxTv_SdtCalprd_TRN_Albmarco() ;
      }
      if ( sdt.IsDirty("AlbOComp") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albocomp = sdt.getgxTv_SdtCalprd_TRN_Albocomp() ;
      }
      if ( sdt.IsDirty("TrnNif") )
      {
         gxTv_SdtCalprd_TRN_Trnnif_N = sdt.getgxTv_SdtCalprd_TRN_Trnnif_N() ;
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Trnnif = sdt.getgxTv_SdtCalprd_TRN_Trnnif() ;
      }
      if ( sdt.IsDirty("AlbDivTCod") )
      {
         gxTv_SdtCalprd_TRN_Albdivtcod_N = sdt.getgxTv_SdtCalprd_TRN_Albdivtcod_N() ;
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albdivtcod = sdt.getgxTv_SdtCalprd_TRN_Albdivtcod() ;
      }
      if ( sdt.IsDirty("AlbDivAbr") )
      {
         gxTv_SdtCalprd_TRN_Albdivabr_N = sdt.getgxTv_SdtCalprd_TRN_Albdivabr_N() ;
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albdivabr = sdt.getgxTv_SdtCalprd_TRN_Albdivabr() ;
      }
      if ( sdt.IsDirty("AlbDivCod") )
      {
         gxTv_SdtCalprd_TRN_Albdivcod_N = sdt.getgxTv_SdtCalprd_TRN_Albdivcod_N() ;
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Albdivcod = sdt.getgxTv_SdtCalprd_TRN_Albdivcod() ;
      }
      if ( sdt.IsDirty("BusDomEnv") )
      {
         gxTv_SdtCalprd_TRN_Busdomenv_N = sdt.getgxTv_SdtCalprd_TRN_Busdomenv_N() ;
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Busdomenv = sdt.getgxTv_SdtCalprd_TRN_Busdomenv() ;
      }
      if ( sdt.IsDirty("EmprGuiRem") )
      {
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Emprguirem = sdt.getgxTv_SdtCalprd_TRN_Emprguirem() ;
      }
      if ( sdt.IsDirty("GuiRemDom") )
      {
         gxTv_SdtCalprd_TRN_Guiremdom_N = sdt.getgxTv_SdtCalprd_TRN_Guiremdom_N() ;
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Guiremdom = sdt.getgxTv_SdtCalprd_TRN_Guiremdom() ;
      }
      if ( sdt.IsDirty("GuiRemDivT") )
      {
         gxTv_SdtCalprd_TRN_Guiremdivt_N = sdt.getgxTv_SdtCalprd_TRN_Guiremdivt_N() ;
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Guiremdivt = sdt.getgxTv_SdtCalprd_TRN_Guiremdivt() ;
      }
      if ( sdt.IsDirty("GuiRemDiv") )
      {
         gxTv_SdtCalprd_TRN_Guiremdiv_N = sdt.getgxTv_SdtCalprd_TRN_Guiremdiv_N() ;
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Guiremdiv = sdt.getgxTv_SdtCalprd_TRN_Guiremdiv() ;
      }
      if ( sdt.IsDirty("EmprNom") )
      {
         gxTv_SdtCalprd_TRN_Emprnom_N = sdt.getgxTv_SdtCalprd_TRN_Emprnom_N() ;
         gxTv_SdtCalprd_TRN_N = (byte)(0) ;
         gxTv_SdtCalprd_TRN_Emprnom = sdt.getgxTv_SdtCalprd_TRN_Emprnom() ;
      }
   }

   public String getgxTv_SdtCalprd_TRN_Emprcod( )
   {
      return gxTv_SdtCalprd_TRN_Emprcod ;
   }

   public void setgxTv_SdtCalprd_TRN_Emprcod( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtCalprd_TRN_Emprcod, value) != 0 )
      {
         gxTv_SdtCalprd_TRN_Mode = "INS" ;
         this.setgxTv_SdtCalprd_TRN_Emprcod_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albprocod_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albpropri_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albproest_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albprofch_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albfecsal_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albhorsal_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albusu_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Guiremcli_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Guiremcln_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albclides_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albdomenv_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Trncod_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Trnnom_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albmat_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albsec_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albenvftp_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Alblic_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albproat_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albhhfm_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albgrosst_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albtrnnc_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albfmd_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albtrnnm_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albfmdc_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albtrndm_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albmarca_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Alblocdes_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albloccar_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albpobscon_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albivacod_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albcolca_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albdesp_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albcambio_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albtipdoc_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albmottr_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albtipcal_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albobscb_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albnumt_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albmarco_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albocomp_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Trnnif_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albdivtcod_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albdivabr_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albdivcod_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Busdomenv_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Emprguirem_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Guiremdom_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Guiremdivt_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Guiremdiv_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Emprnom_Z_SetNull( );
      }
      SetDirty("Emprcod");
      gxTv_SdtCalprd_TRN_Emprcod = value ;
   }

   public long getgxTv_SdtCalprd_TRN_Albprocod( )
   {
      return gxTv_SdtCalprd_TRN_Albprocod ;
   }

   public void setgxTv_SdtCalprd_TRN_Albprocod( long value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      if ( gxTv_SdtCalprd_TRN_Albprocod != value )
      {
         gxTv_SdtCalprd_TRN_Mode = "INS" ;
         this.setgxTv_SdtCalprd_TRN_Emprcod_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albprocod_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albpropri_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albproest_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albprofch_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albfecsal_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albhorsal_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albusu_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Guiremcli_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Guiremcln_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albclides_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albdomenv_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Trncod_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Trnnom_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albmat_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albsec_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albenvftp_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Alblic_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albproat_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albhhfm_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albgrosst_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albtrnnc_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albfmd_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albtrnnm_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albfmdc_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albtrndm_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albmarca_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Alblocdes_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albloccar_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albpobscon_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albivacod_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albcolca_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albdesp_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albcambio_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albtipdoc_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albmottr_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albtipcal_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albobscb_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albnumt_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albmarco_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albocomp_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Trnnif_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albdivtcod_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albdivabr_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Albdivcod_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Busdomenv_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Emprguirem_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Guiremdom_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Guiremdivt_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Guiremdiv_Z_SetNull( );
         this.setgxTv_SdtCalprd_TRN_Emprnom_Z_SetNull( );
      }
      SetDirty("Albprocod");
      gxTv_SdtCalprd_TRN_Albprocod = value ;
   }

   public String getgxTv_SdtCalprd_TRN_Albpropri( )
   {
      return gxTv_SdtCalprd_TRN_Albpropri ;
   }

   public void setgxTv_SdtCalprd_TRN_Albpropri( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albpropri");
      gxTv_SdtCalprd_TRN_Albpropri = value ;
   }

   public byte getgxTv_SdtCalprd_TRN_Albproest( )
   {
      return gxTv_SdtCalprd_TRN_Albproest ;
   }

   public void setgxTv_SdtCalprd_TRN_Albproest( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albproest");
      gxTv_SdtCalprd_TRN_Albproest = value ;
   }

   public java.util.Date getgxTv_SdtCalprd_TRN_Albprofch( )
   {
      return gxTv_SdtCalprd_TRN_Albprofch ;
   }

   public void setgxTv_SdtCalprd_TRN_Albprofch( java.util.Date value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albprofch");
      gxTv_SdtCalprd_TRN_Albprofch = value ;
   }

   public java.util.Date getgxTv_SdtCalprd_TRN_Albfecsal( )
   {
      return gxTv_SdtCalprd_TRN_Albfecsal ;
   }

   public void setgxTv_SdtCalprd_TRN_Albfecsal( java.util.Date value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albfecsal");
      gxTv_SdtCalprd_TRN_Albfecsal = value ;
   }

   public String getgxTv_SdtCalprd_TRN_Albhorsal( )
   {
      return gxTv_SdtCalprd_TRN_Albhorsal ;
   }

   public void setgxTv_SdtCalprd_TRN_Albhorsal( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albhorsal");
      gxTv_SdtCalprd_TRN_Albhorsal = value ;
   }

   public String getgxTv_SdtCalprd_TRN_Albusu( )
   {
      return gxTv_SdtCalprd_TRN_Albusu ;
   }

   public void setgxTv_SdtCalprd_TRN_Albusu( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albusu");
      gxTv_SdtCalprd_TRN_Albusu = value ;
   }

   public int getgxTv_SdtCalprd_TRN_Guiremcli( )
   {
      return gxTv_SdtCalprd_TRN_Guiremcli ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremcli( int value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Guiremcli");
      gxTv_SdtCalprd_TRN_Guiremcli = value ;
   }

   public String getgxTv_SdtCalprd_TRN_Guiremcln( )
   {
      return gxTv_SdtCalprd_TRN_Guiremcln ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremcln( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Guiremcln");
      gxTv_SdtCalprd_TRN_Guiremcln = value ;
   }

   public int getgxTv_SdtCalprd_TRN_Albclides( )
   {
      return gxTv_SdtCalprd_TRN_Albclides ;
   }

   public void setgxTv_SdtCalprd_TRN_Albclides( int value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albclides");
      gxTv_SdtCalprd_TRN_Albclides = value ;
   }

   public byte getgxTv_SdtCalprd_TRN_Albdomenv( )
   {
      return gxTv_SdtCalprd_TRN_Albdomenv ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdomenv( byte value )
   {
      gxTv_SdtCalprd_TRN_Albdomenv_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albdomenv");
      gxTv_SdtCalprd_TRN_Albdomenv = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdomenv_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albdomenv_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Albdomenv = (byte)(0) ;
      SetDirty("Albdomenv");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albdomenv_IsNull( )
   {
      return (gxTv_SdtCalprd_TRN_Albdomenv_N==1) ;
   }

   public short getgxTv_SdtCalprd_TRN_Trncod( )
   {
      return gxTv_SdtCalprd_TRN_Trncod ;
   }

   public void setgxTv_SdtCalprd_TRN_Trncod( short value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Trncod");
      gxTv_SdtCalprd_TRN_Trncod = value ;
   }

   public String getgxTv_SdtCalprd_TRN_Trnnom( )
   {
      return gxTv_SdtCalprd_TRN_Trnnom ;
   }

   public void setgxTv_SdtCalprd_TRN_Trnnom( String value )
   {
      gxTv_SdtCalprd_TRN_Trnnom_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Trnnom");
      gxTv_SdtCalprd_TRN_Trnnom = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Trnnom_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Trnnom_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Trnnom = "" ;
      SetDirty("Trnnom");
   }

   public boolean getgxTv_SdtCalprd_TRN_Trnnom_IsNull( )
   {
      return (gxTv_SdtCalprd_TRN_Trnnom_N==1) ;
   }

   public String getgxTv_SdtCalprd_TRN_Albmat( )
   {
      return gxTv_SdtCalprd_TRN_Albmat ;
   }

   public void setgxTv_SdtCalprd_TRN_Albmat( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albmat");
      gxTv_SdtCalprd_TRN_Albmat = value ;
   }

   public String getgxTv_SdtCalprd_TRN_Albsec( )
   {
      return gxTv_SdtCalprd_TRN_Albsec ;
   }

   public void setgxTv_SdtCalprd_TRN_Albsec( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albsec");
      gxTv_SdtCalprd_TRN_Albsec = value ;
   }

   public byte getgxTv_SdtCalprd_TRN_Albenvftp( )
   {
      return gxTv_SdtCalprd_TRN_Albenvftp ;
   }

   public void setgxTv_SdtCalprd_TRN_Albenvftp( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albenvftp");
      gxTv_SdtCalprd_TRN_Albenvftp = value ;
   }

   public String getgxTv_SdtCalprd_TRN_Alblic( )
   {
      return gxTv_SdtCalprd_TRN_Alblic ;
   }

   public void setgxTv_SdtCalprd_TRN_Alblic( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Alblic");
      gxTv_SdtCalprd_TRN_Alblic = value ;
   }

   public String getgxTv_SdtCalprd_TRN_Albproat( )
   {
      return gxTv_SdtCalprd_TRN_Albproat ;
   }

   public void setgxTv_SdtCalprd_TRN_Albproat( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albproat");
      gxTv_SdtCalprd_TRN_Albproat = value ;
   }

   public java.util.Date getgxTv_SdtCalprd_TRN_Albhhfm( )
   {
      return gxTv_SdtCalprd_TRN_Albhhfm ;
   }

   public void setgxTv_SdtCalprd_TRN_Albhhfm( java.util.Date value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albhhfm");
      gxTv_SdtCalprd_TRN_Albhhfm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCalprd_TRN_Albgrosst( )
   {
      return gxTv_SdtCalprd_TRN_Albgrosst ;
   }

   public void setgxTv_SdtCalprd_TRN_Albgrosst( java.math.BigDecimal value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albgrosst");
      gxTv_SdtCalprd_TRN_Albgrosst = value ;
   }

   public String getgxTv_SdtCalprd_TRN_Albtrnnc( )
   {
      return gxTv_SdtCalprd_TRN_Albtrnnc ;
   }

   public void setgxTv_SdtCalprd_TRN_Albtrnnc( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albtrnnc");
      gxTv_SdtCalprd_TRN_Albtrnnc = value ;
   }

   public String getgxTv_SdtCalprd_TRN_Albfmd( )
   {
      return gxTv_SdtCalprd_TRN_Albfmd ;
   }

   public void setgxTv_SdtCalprd_TRN_Albfmd( String value )
   {
      gxTv_SdtCalprd_TRN_Albfmd_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albfmd");
      gxTv_SdtCalprd_TRN_Albfmd = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albfmd_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albfmd_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Albfmd = "" ;
      SetDirty("Albfmd");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albfmd_IsNull( )
   {
      return (gxTv_SdtCalprd_TRN_Albfmd_N==1) ;
   }

   public String getgxTv_SdtCalprd_TRN_Albtrnnm( )
   {
      return gxTv_SdtCalprd_TRN_Albtrnnm ;
   }

   public void setgxTv_SdtCalprd_TRN_Albtrnnm( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albtrnnm");
      gxTv_SdtCalprd_TRN_Albtrnnm = value ;
   }

   public String getgxTv_SdtCalprd_TRN_Albfmdc( )
   {
      return gxTv_SdtCalprd_TRN_Albfmdc ;
   }

   public void setgxTv_SdtCalprd_TRN_Albfmdc( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albfmdc");
      gxTv_SdtCalprd_TRN_Albfmdc = value ;
   }

   public String getgxTv_SdtCalprd_TRN_Albtrndm( )
   {
      return gxTv_SdtCalprd_TRN_Albtrndm ;
   }

   public void setgxTv_SdtCalprd_TRN_Albtrndm( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albtrndm");
      gxTv_SdtCalprd_TRN_Albtrndm = value ;
   }

   public String getgxTv_SdtCalprd_TRN_Albmarca( )
   {
      return gxTv_SdtCalprd_TRN_Albmarca ;
   }

   public void setgxTv_SdtCalprd_TRN_Albmarca( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albmarca");
      gxTv_SdtCalprd_TRN_Albmarca = value ;
   }

   public byte getgxTv_SdtCalprd_TRN_Alblocdes( )
   {
      return gxTv_SdtCalprd_TRN_Alblocdes ;
   }

   public void setgxTv_SdtCalprd_TRN_Alblocdes( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Alblocdes");
      gxTv_SdtCalprd_TRN_Alblocdes = value ;
   }

   public byte getgxTv_SdtCalprd_TRN_Albloccar( )
   {
      return gxTv_SdtCalprd_TRN_Albloccar ;
   }

   public void setgxTv_SdtCalprd_TRN_Albloccar( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albloccar");
      gxTv_SdtCalprd_TRN_Albloccar = value ;
   }

   public byte getgxTv_SdtCalprd_TRN_Albpobscon( )
   {
      return gxTv_SdtCalprd_TRN_Albpobscon ;
   }

   public void setgxTv_SdtCalprd_TRN_Albpobscon( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albpobscon");
      gxTv_SdtCalprd_TRN_Albpobscon = value ;
   }

   public String getgxTv_SdtCalprd_TRN_Albivacod( )
   {
      return gxTv_SdtCalprd_TRN_Albivacod ;
   }

   public void setgxTv_SdtCalprd_TRN_Albivacod( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albivacod");
      gxTv_SdtCalprd_TRN_Albivacod = value ;
   }

   public String getgxTv_SdtCalprd_TRN_Albcolca( )
   {
      return gxTv_SdtCalprd_TRN_Albcolca ;
   }

   public void setgxTv_SdtCalprd_TRN_Albcolca( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albcolca");
      gxTv_SdtCalprd_TRN_Albcolca = value ;
   }

   public int getgxTv_SdtCalprd_TRN_Albdesp( )
   {
      return gxTv_SdtCalprd_TRN_Albdesp ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdesp( int value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albdesp");
      gxTv_SdtCalprd_TRN_Albdesp = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCalprd_TRN_Albcambio( )
   {
      return gxTv_SdtCalprd_TRN_Albcambio ;
   }

   public void setgxTv_SdtCalprd_TRN_Albcambio( java.math.BigDecimal value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albcambio");
      gxTv_SdtCalprd_TRN_Albcambio = value ;
   }

   public int getgxTv_SdtCalprd_TRN_Albtipdoc( )
   {
      return gxTv_SdtCalprd_TRN_Albtipdoc ;
   }

   public void setgxTv_SdtCalprd_TRN_Albtipdoc( int value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albtipdoc");
      gxTv_SdtCalprd_TRN_Albtipdoc = value ;
   }

   public String getgxTv_SdtCalprd_TRN_Albmottr( )
   {
      return gxTv_SdtCalprd_TRN_Albmottr ;
   }

   public void setgxTv_SdtCalprd_TRN_Albmottr( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albmottr");
      gxTv_SdtCalprd_TRN_Albmottr = value ;
   }

   public byte getgxTv_SdtCalprd_TRN_Albtipcal( )
   {
      return gxTv_SdtCalprd_TRN_Albtipcal ;
   }

   public void setgxTv_SdtCalprd_TRN_Albtipcal( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albtipcal");
      gxTv_SdtCalprd_TRN_Albtipcal = value ;
   }

   public String getgxTv_SdtCalprd_TRN_Albobscb( )
   {
      return gxTv_SdtCalprd_TRN_Albobscb ;
   }

   public void setgxTv_SdtCalprd_TRN_Albobscb( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albobscb");
      gxTv_SdtCalprd_TRN_Albobscb = value ;
   }

   public long getgxTv_SdtCalprd_TRN_Albnumt( )
   {
      return gxTv_SdtCalprd_TRN_Albnumt ;
   }

   public void setgxTv_SdtCalprd_TRN_Albnumt( long value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albnumt");
      gxTv_SdtCalprd_TRN_Albnumt = value ;
   }

   public String getgxTv_SdtCalprd_TRN_Albmarco( )
   {
      return gxTv_SdtCalprd_TRN_Albmarco ;
   }

   public void setgxTv_SdtCalprd_TRN_Albmarco( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albmarco");
      gxTv_SdtCalprd_TRN_Albmarco = value ;
   }

   public String getgxTv_SdtCalprd_TRN_Albocomp( )
   {
      return gxTv_SdtCalprd_TRN_Albocomp ;
   }

   public void setgxTv_SdtCalprd_TRN_Albocomp( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albocomp");
      gxTv_SdtCalprd_TRN_Albocomp = value ;
   }

   public String getgxTv_SdtCalprd_TRN_Trnnif( )
   {
      return gxTv_SdtCalprd_TRN_Trnnif ;
   }

   public void setgxTv_SdtCalprd_TRN_Trnnif( String value )
   {
      gxTv_SdtCalprd_TRN_Trnnif_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Trnnif");
      gxTv_SdtCalprd_TRN_Trnnif = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Trnnif_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Trnnif_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Trnnif = "" ;
      SetDirty("Trnnif");
   }

   public boolean getgxTv_SdtCalprd_TRN_Trnnif_IsNull( )
   {
      return (gxTv_SdtCalprd_TRN_Trnnif_N==1) ;
   }

   public String getgxTv_SdtCalprd_TRN_Albdivtcod( )
   {
      return gxTv_SdtCalprd_TRN_Albdivtcod ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdivtcod( String value )
   {
      gxTv_SdtCalprd_TRN_Albdivtcod_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albdivtcod");
      gxTv_SdtCalprd_TRN_Albdivtcod = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdivtcod_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albdivtcod_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Albdivtcod = "" ;
      SetDirty("Albdivtcod");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albdivtcod_IsNull( )
   {
      return (gxTv_SdtCalprd_TRN_Albdivtcod_N==1) ;
   }

   public String getgxTv_SdtCalprd_TRN_Albdivabr( )
   {
      return gxTv_SdtCalprd_TRN_Albdivabr ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdivabr( String value )
   {
      gxTv_SdtCalprd_TRN_Albdivabr_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albdivabr");
      gxTv_SdtCalprd_TRN_Albdivabr = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdivabr_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albdivabr_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Albdivabr = "" ;
      SetDirty("Albdivabr");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albdivabr_IsNull( )
   {
      return (gxTv_SdtCalprd_TRN_Albdivabr_N==1) ;
   }

   public byte getgxTv_SdtCalprd_TRN_Albdivcod( )
   {
      return gxTv_SdtCalprd_TRN_Albdivcod ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdivcod( byte value )
   {
      gxTv_SdtCalprd_TRN_Albdivcod_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albdivcod");
      gxTv_SdtCalprd_TRN_Albdivcod = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdivcod_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albdivcod_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Albdivcod = (byte)(0) ;
      SetDirty("Albdivcod");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albdivcod_IsNull( )
   {
      return (gxTv_SdtCalprd_TRN_Albdivcod_N==1) ;
   }

   public byte getgxTv_SdtCalprd_TRN_Busdomenv( )
   {
      return gxTv_SdtCalprd_TRN_Busdomenv ;
   }

   public void setgxTv_SdtCalprd_TRN_Busdomenv( byte value )
   {
      gxTv_SdtCalprd_TRN_Busdomenv_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Busdomenv");
      gxTv_SdtCalprd_TRN_Busdomenv = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Busdomenv_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Busdomenv_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Busdomenv = (byte)(0) ;
      SetDirty("Busdomenv");
   }

   public boolean getgxTv_SdtCalprd_TRN_Busdomenv_IsNull( )
   {
      return (gxTv_SdtCalprd_TRN_Busdomenv_N==1) ;
   }

   public String getgxTv_SdtCalprd_TRN_Emprguirem( )
   {
      return gxTv_SdtCalprd_TRN_Emprguirem ;
   }

   public void setgxTv_SdtCalprd_TRN_Emprguirem( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Emprguirem");
      gxTv_SdtCalprd_TRN_Emprguirem = value ;
   }

   public byte getgxTv_SdtCalprd_TRN_Guiremdom( )
   {
      return gxTv_SdtCalprd_TRN_Guiremdom ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremdom( byte value )
   {
      gxTv_SdtCalprd_TRN_Guiremdom_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Guiremdom");
      gxTv_SdtCalprd_TRN_Guiremdom = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremdom_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Guiremdom_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Guiremdom = (byte)(0) ;
      SetDirty("Guiremdom");
   }

   public boolean getgxTv_SdtCalprd_TRN_Guiremdom_IsNull( )
   {
      return (gxTv_SdtCalprd_TRN_Guiremdom_N==1) ;
   }

   public String getgxTv_SdtCalprd_TRN_Guiremdivt( )
   {
      return gxTv_SdtCalprd_TRN_Guiremdivt ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremdivt( String value )
   {
      gxTv_SdtCalprd_TRN_Guiremdivt_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Guiremdivt");
      gxTv_SdtCalprd_TRN_Guiremdivt = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremdivt_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Guiremdivt_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Guiremdivt = "" ;
      SetDirty("Guiremdivt");
   }

   public boolean getgxTv_SdtCalprd_TRN_Guiremdivt_IsNull( )
   {
      return (gxTv_SdtCalprd_TRN_Guiremdivt_N==1) ;
   }

   public byte getgxTv_SdtCalprd_TRN_Guiremdiv( )
   {
      return gxTv_SdtCalprd_TRN_Guiremdiv ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremdiv( byte value )
   {
      gxTv_SdtCalprd_TRN_Guiremdiv_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Guiremdiv");
      gxTv_SdtCalprd_TRN_Guiremdiv = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremdiv_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Guiremdiv_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Guiremdiv = (byte)(0) ;
      SetDirty("Guiremdiv");
   }

   public boolean getgxTv_SdtCalprd_TRN_Guiremdiv_IsNull( )
   {
      return (gxTv_SdtCalprd_TRN_Guiremdiv_N==1) ;
   }

   public String getgxTv_SdtCalprd_TRN_Emprnom( )
   {
      return gxTv_SdtCalprd_TRN_Emprnom ;
   }

   public void setgxTv_SdtCalprd_TRN_Emprnom( String value )
   {
      gxTv_SdtCalprd_TRN_Emprnom_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Emprnom");
      gxTv_SdtCalprd_TRN_Emprnom = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Emprnom_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Emprnom_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Emprnom = "" ;
      SetDirty("Emprnom");
   }

   public boolean getgxTv_SdtCalprd_TRN_Emprnom_IsNull( )
   {
      return (gxTv_SdtCalprd_TRN_Emprnom_N==1) ;
   }

   public String getgxTv_SdtCalprd_TRN_Mode( )
   {
      return gxTv_SdtCalprd_TRN_Mode ;
   }

   public void setgxTv_SdtCalprd_TRN_Mode( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtCalprd_TRN_Mode = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Mode_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtCalprd_TRN_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtCalprd_TRN_Initialized( )
   {
      return gxTv_SdtCalprd_TRN_Initialized ;
   }

   public void setgxTv_SdtCalprd_TRN_Initialized( short value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtCalprd_TRN_Initialized = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Initialized_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtCalprd_TRN_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Emprcod_Z( )
   {
      return gxTv_SdtCalprd_TRN_Emprcod_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Emprcod_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Emprcod_Z");
      gxTv_SdtCalprd_TRN_Emprcod_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Emprcod_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Emprcod_Z = "" ;
      SetDirty("Emprcod_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Emprcod_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtCalprd_TRN_Albprocod_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albprocod_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albprocod_Z( long value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albprocod_Z");
      gxTv_SdtCalprd_TRN_Albprocod_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albprocod_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albprocod_Z = 0 ;
      SetDirty("Albprocod_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albprocod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Albpropri_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albpropri_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albpropri_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albpropri_Z");
      gxTv_SdtCalprd_TRN_Albpropri_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albpropri_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albpropri_Z = "" ;
      SetDirty("Albpropri_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albpropri_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Albproest_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albproest_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albproest_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albproest_Z");
      gxTv_SdtCalprd_TRN_Albproest_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albproest_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albproest_Z = (byte)(0) ;
      SetDirty("Albproest_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albproest_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtCalprd_TRN_Albprofch_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albprofch_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albprofch_Z( java.util.Date value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albprofch_Z");
      gxTv_SdtCalprd_TRN_Albprofch_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albprofch_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albprofch_Z = GXutil.nullDate() ;
      SetDirty("Albprofch_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albprofch_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtCalprd_TRN_Albfecsal_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albfecsal_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albfecsal_Z( java.util.Date value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albfecsal_Z");
      gxTv_SdtCalprd_TRN_Albfecsal_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albfecsal_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albfecsal_Z = GXutil.nullDate() ;
      SetDirty("Albfecsal_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albfecsal_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Albhorsal_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albhorsal_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albhorsal_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albhorsal_Z");
      gxTv_SdtCalprd_TRN_Albhorsal_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albhorsal_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albhorsal_Z = "" ;
      SetDirty("Albhorsal_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albhorsal_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Albusu_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albusu_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albusu_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albusu_Z");
      gxTv_SdtCalprd_TRN_Albusu_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albusu_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albusu_Z = "" ;
      SetDirty("Albusu_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albusu_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtCalprd_TRN_Guiremcli_Z( )
   {
      return gxTv_SdtCalprd_TRN_Guiremcli_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremcli_Z( int value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Guiremcli_Z");
      gxTv_SdtCalprd_TRN_Guiremcli_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremcli_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Guiremcli_Z = 0 ;
      SetDirty("Guiremcli_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Guiremcli_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Guiremcln_Z( )
   {
      return gxTv_SdtCalprd_TRN_Guiremcln_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremcln_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Guiremcln_Z");
      gxTv_SdtCalprd_TRN_Guiremcln_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremcln_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Guiremcln_Z = "" ;
      SetDirty("Guiremcln_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Guiremcln_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtCalprd_TRN_Albclides_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albclides_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albclides_Z( int value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albclides_Z");
      gxTv_SdtCalprd_TRN_Albclides_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albclides_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albclides_Z = 0 ;
      SetDirty("Albclides_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albclides_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Albdomenv_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albdomenv_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdomenv_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albdomenv_Z");
      gxTv_SdtCalprd_TRN_Albdomenv_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdomenv_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albdomenv_Z = (byte)(0) ;
      SetDirty("Albdomenv_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albdomenv_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtCalprd_TRN_Trncod_Z( )
   {
      return gxTv_SdtCalprd_TRN_Trncod_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Trncod_Z( short value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Trncod_Z");
      gxTv_SdtCalprd_TRN_Trncod_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Trncod_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Trncod_Z = (short)(0) ;
      SetDirty("Trncod_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Trncod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Trnnom_Z( )
   {
      return gxTv_SdtCalprd_TRN_Trnnom_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Trnnom_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Trnnom_Z");
      gxTv_SdtCalprd_TRN_Trnnom_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Trnnom_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Trnnom_Z = "" ;
      SetDirty("Trnnom_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Trnnom_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Albmat_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albmat_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albmat_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albmat_Z");
      gxTv_SdtCalprd_TRN_Albmat_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albmat_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albmat_Z = "" ;
      SetDirty("Albmat_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albmat_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Albsec_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albsec_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albsec_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albsec_Z");
      gxTv_SdtCalprd_TRN_Albsec_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albsec_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albsec_Z = "" ;
      SetDirty("Albsec_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albsec_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Albenvftp_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albenvftp_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albenvftp_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albenvftp_Z");
      gxTv_SdtCalprd_TRN_Albenvftp_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albenvftp_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albenvftp_Z = (byte)(0) ;
      SetDirty("Albenvftp_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albenvftp_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Alblic_Z( )
   {
      return gxTv_SdtCalprd_TRN_Alblic_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Alblic_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Alblic_Z");
      gxTv_SdtCalprd_TRN_Alblic_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Alblic_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Alblic_Z = "" ;
      SetDirty("Alblic_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Alblic_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Albproat_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albproat_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albproat_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albproat_Z");
      gxTv_SdtCalprd_TRN_Albproat_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albproat_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albproat_Z = "" ;
      SetDirty("Albproat_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albproat_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtCalprd_TRN_Albhhfm_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albhhfm_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albhhfm_Z( java.util.Date value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albhhfm_Z");
      gxTv_SdtCalprd_TRN_Albhhfm_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albhhfm_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albhhfm_Z = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Albhhfm_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albhhfm_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtCalprd_TRN_Albgrosst_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albgrosst_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albgrosst_Z( java.math.BigDecimal value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albgrosst_Z");
      gxTv_SdtCalprd_TRN_Albgrosst_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albgrosst_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albgrosst_Z = DecimalUtil.ZERO ;
      SetDirty("Albgrosst_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albgrosst_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Albtrnnc_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albtrnnc_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albtrnnc_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albtrnnc_Z");
      gxTv_SdtCalprd_TRN_Albtrnnc_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albtrnnc_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albtrnnc_Z = "" ;
      SetDirty("Albtrnnc_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albtrnnc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Albfmd_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albfmd_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albfmd_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albfmd_Z");
      gxTv_SdtCalprd_TRN_Albfmd_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albfmd_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albfmd_Z = "" ;
      SetDirty("Albfmd_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albfmd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Albtrnnm_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albtrnnm_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albtrnnm_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albtrnnm_Z");
      gxTv_SdtCalprd_TRN_Albtrnnm_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albtrnnm_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albtrnnm_Z = "" ;
      SetDirty("Albtrnnm_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albtrnnm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Albfmdc_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albfmdc_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albfmdc_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albfmdc_Z");
      gxTv_SdtCalprd_TRN_Albfmdc_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albfmdc_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albfmdc_Z = "" ;
      SetDirty("Albfmdc_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albfmdc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Albtrndm_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albtrndm_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albtrndm_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albtrndm_Z");
      gxTv_SdtCalprd_TRN_Albtrndm_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albtrndm_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albtrndm_Z = "" ;
      SetDirty("Albtrndm_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albtrndm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Albmarca_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albmarca_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albmarca_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albmarca_Z");
      gxTv_SdtCalprd_TRN_Albmarca_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albmarca_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albmarca_Z = "" ;
      SetDirty("Albmarca_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albmarca_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Alblocdes_Z( )
   {
      return gxTv_SdtCalprd_TRN_Alblocdes_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Alblocdes_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Alblocdes_Z");
      gxTv_SdtCalprd_TRN_Alblocdes_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Alblocdes_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Alblocdes_Z = (byte)(0) ;
      SetDirty("Alblocdes_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Alblocdes_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Albloccar_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albloccar_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albloccar_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albloccar_Z");
      gxTv_SdtCalprd_TRN_Albloccar_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albloccar_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albloccar_Z = (byte)(0) ;
      SetDirty("Albloccar_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albloccar_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Albpobscon_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albpobscon_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albpobscon_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albpobscon_Z");
      gxTv_SdtCalprd_TRN_Albpobscon_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albpobscon_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albpobscon_Z = (byte)(0) ;
      SetDirty("Albpobscon_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albpobscon_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Albivacod_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albivacod_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albivacod_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albivacod_Z");
      gxTv_SdtCalprd_TRN_Albivacod_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albivacod_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albivacod_Z = "" ;
      SetDirty("Albivacod_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albivacod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Albcolca_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albcolca_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albcolca_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albcolca_Z");
      gxTv_SdtCalprd_TRN_Albcolca_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albcolca_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albcolca_Z = "" ;
      SetDirty("Albcolca_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albcolca_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtCalprd_TRN_Albdesp_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albdesp_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdesp_Z( int value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albdesp_Z");
      gxTv_SdtCalprd_TRN_Albdesp_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdesp_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albdesp_Z = 0 ;
      SetDirty("Albdesp_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albdesp_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtCalprd_TRN_Albcambio_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albcambio_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albcambio_Z( java.math.BigDecimal value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albcambio_Z");
      gxTv_SdtCalprd_TRN_Albcambio_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albcambio_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albcambio_Z = DecimalUtil.ZERO ;
      SetDirty("Albcambio_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albcambio_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtCalprd_TRN_Albtipdoc_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albtipdoc_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albtipdoc_Z( int value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albtipdoc_Z");
      gxTv_SdtCalprd_TRN_Albtipdoc_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albtipdoc_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albtipdoc_Z = 0 ;
      SetDirty("Albtipdoc_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albtipdoc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Albmottr_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albmottr_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albmottr_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albmottr_Z");
      gxTv_SdtCalprd_TRN_Albmottr_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albmottr_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albmottr_Z = "" ;
      SetDirty("Albmottr_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albmottr_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Albtipcal_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albtipcal_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albtipcal_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albtipcal_Z");
      gxTv_SdtCalprd_TRN_Albtipcal_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albtipcal_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albtipcal_Z = (byte)(0) ;
      SetDirty("Albtipcal_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albtipcal_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Albobscb_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albobscb_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albobscb_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albobscb_Z");
      gxTv_SdtCalprd_TRN_Albobscb_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albobscb_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albobscb_Z = "" ;
      SetDirty("Albobscb_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albobscb_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtCalprd_TRN_Albnumt_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albnumt_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albnumt_Z( long value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albnumt_Z");
      gxTv_SdtCalprd_TRN_Albnumt_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albnumt_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albnumt_Z = 0 ;
      SetDirty("Albnumt_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albnumt_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Albmarco_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albmarco_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albmarco_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albmarco_Z");
      gxTv_SdtCalprd_TRN_Albmarco_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albmarco_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albmarco_Z = "" ;
      SetDirty("Albmarco_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albmarco_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Albocomp_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albocomp_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albocomp_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albocomp_Z");
      gxTv_SdtCalprd_TRN_Albocomp_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albocomp_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albocomp_Z = "" ;
      SetDirty("Albocomp_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albocomp_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Trnnif_Z( )
   {
      return gxTv_SdtCalprd_TRN_Trnnif_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Trnnif_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Trnnif_Z");
      gxTv_SdtCalprd_TRN_Trnnif_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Trnnif_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Trnnif_Z = "" ;
      SetDirty("Trnnif_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Trnnif_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Albdivtcod_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albdivtcod_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdivtcod_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albdivtcod_Z");
      gxTv_SdtCalprd_TRN_Albdivtcod_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdivtcod_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albdivtcod_Z = "" ;
      SetDirty("Albdivtcod_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albdivtcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Albdivabr_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albdivabr_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdivabr_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albdivabr_Z");
      gxTv_SdtCalprd_TRN_Albdivabr_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdivabr_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albdivabr_Z = "" ;
      SetDirty("Albdivabr_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albdivabr_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Albdivcod_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albdivcod_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdivcod_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albdivcod_Z");
      gxTv_SdtCalprd_TRN_Albdivcod_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdivcod_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albdivcod_Z = (byte)(0) ;
      SetDirty("Albdivcod_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albdivcod_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Busdomenv_Z( )
   {
      return gxTv_SdtCalprd_TRN_Busdomenv_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Busdomenv_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Busdomenv_Z");
      gxTv_SdtCalprd_TRN_Busdomenv_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Busdomenv_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Busdomenv_Z = (byte)(0) ;
      SetDirty("Busdomenv_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Busdomenv_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Emprguirem_Z( )
   {
      return gxTv_SdtCalprd_TRN_Emprguirem_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Emprguirem_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Emprguirem_Z");
      gxTv_SdtCalprd_TRN_Emprguirem_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Emprguirem_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Emprguirem_Z = "" ;
      SetDirty("Emprguirem_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Emprguirem_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Guiremdom_Z( )
   {
      return gxTv_SdtCalprd_TRN_Guiremdom_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremdom_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Guiremdom_Z");
      gxTv_SdtCalprd_TRN_Guiremdom_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremdom_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Guiremdom_Z = (byte)(0) ;
      SetDirty("Guiremdom_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Guiremdom_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Guiremdivt_Z( )
   {
      return gxTv_SdtCalprd_TRN_Guiremdivt_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremdivt_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Guiremdivt_Z");
      gxTv_SdtCalprd_TRN_Guiremdivt_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremdivt_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Guiremdivt_Z = "" ;
      SetDirty("Guiremdivt_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Guiremdivt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Guiremdiv_Z( )
   {
      return gxTv_SdtCalprd_TRN_Guiremdiv_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremdiv_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Guiremdiv_Z");
      gxTv_SdtCalprd_TRN_Guiremdiv_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremdiv_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Guiremdiv_Z = (byte)(0) ;
      SetDirty("Guiremdiv_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Guiremdiv_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCalprd_TRN_Emprnom_Z( )
   {
      return gxTv_SdtCalprd_TRN_Emprnom_Z ;
   }

   public void setgxTv_SdtCalprd_TRN_Emprnom_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Emprnom_Z");
      gxTv_SdtCalprd_TRN_Emprnom_Z = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Emprnom_Z_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Emprnom_Z = "" ;
      SetDirty("Emprnom_Z");
   }

   public boolean getgxTv_SdtCalprd_TRN_Emprnom_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Albdomenv_N( )
   {
      return gxTv_SdtCalprd_TRN_Albdomenv_N ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdomenv_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albdomenv_N");
      gxTv_SdtCalprd_TRN_Albdomenv_N = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdomenv_N_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albdomenv_N = (byte)(0) ;
      SetDirty("Albdomenv_N");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albdomenv_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Trnnom_N( )
   {
      return gxTv_SdtCalprd_TRN_Trnnom_N ;
   }

   public void setgxTv_SdtCalprd_TRN_Trnnom_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Trnnom_N");
      gxTv_SdtCalprd_TRN_Trnnom_N = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Trnnom_N_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Trnnom_N = (byte)(0) ;
      SetDirty("Trnnom_N");
   }

   public boolean getgxTv_SdtCalprd_TRN_Trnnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Albfmd_N( )
   {
      return gxTv_SdtCalprd_TRN_Albfmd_N ;
   }

   public void setgxTv_SdtCalprd_TRN_Albfmd_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albfmd_N");
      gxTv_SdtCalprd_TRN_Albfmd_N = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albfmd_N_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albfmd_N = (byte)(0) ;
      SetDirty("Albfmd_N");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albfmd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Trnnif_N( )
   {
      return gxTv_SdtCalprd_TRN_Trnnif_N ;
   }

   public void setgxTv_SdtCalprd_TRN_Trnnif_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Trnnif_N");
      gxTv_SdtCalprd_TRN_Trnnif_N = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Trnnif_N_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Trnnif_N = (byte)(0) ;
      SetDirty("Trnnif_N");
   }

   public boolean getgxTv_SdtCalprd_TRN_Trnnif_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Albdivtcod_N( )
   {
      return gxTv_SdtCalprd_TRN_Albdivtcod_N ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdivtcod_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albdivtcod_N");
      gxTv_SdtCalprd_TRN_Albdivtcod_N = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdivtcod_N_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albdivtcod_N = (byte)(0) ;
      SetDirty("Albdivtcod_N");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albdivtcod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Albdivabr_N( )
   {
      return gxTv_SdtCalprd_TRN_Albdivabr_N ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdivabr_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albdivabr_N");
      gxTv_SdtCalprd_TRN_Albdivabr_N = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdivabr_N_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albdivabr_N = (byte)(0) ;
      SetDirty("Albdivabr_N");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albdivabr_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Albdivcod_N( )
   {
      return gxTv_SdtCalprd_TRN_Albdivcod_N ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdivcod_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Albdivcod_N");
      gxTv_SdtCalprd_TRN_Albdivcod_N = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Albdivcod_N_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Albdivcod_N = (byte)(0) ;
      SetDirty("Albdivcod_N");
   }

   public boolean getgxTv_SdtCalprd_TRN_Albdivcod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Busdomenv_N( )
   {
      return gxTv_SdtCalprd_TRN_Busdomenv_N ;
   }

   public void setgxTv_SdtCalprd_TRN_Busdomenv_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Busdomenv_N");
      gxTv_SdtCalprd_TRN_Busdomenv_N = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Busdomenv_N_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Busdomenv_N = (byte)(0) ;
      SetDirty("Busdomenv_N");
   }

   public boolean getgxTv_SdtCalprd_TRN_Busdomenv_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Guiremdom_N( )
   {
      return gxTv_SdtCalprd_TRN_Guiremdom_N ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremdom_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Guiremdom_N");
      gxTv_SdtCalprd_TRN_Guiremdom_N = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremdom_N_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Guiremdom_N = (byte)(0) ;
      SetDirty("Guiremdom_N");
   }

   public boolean getgxTv_SdtCalprd_TRN_Guiremdom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Guiremdivt_N( )
   {
      return gxTv_SdtCalprd_TRN_Guiremdivt_N ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremdivt_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Guiremdivt_N");
      gxTv_SdtCalprd_TRN_Guiremdivt_N = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremdivt_N_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Guiremdivt_N = (byte)(0) ;
      SetDirty("Guiremdivt_N");
   }

   public boolean getgxTv_SdtCalprd_TRN_Guiremdivt_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Guiremdiv_N( )
   {
      return gxTv_SdtCalprd_TRN_Guiremdiv_N ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremdiv_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Guiremdiv_N");
      gxTv_SdtCalprd_TRN_Guiremdiv_N = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Guiremdiv_N_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Guiremdiv_N = (byte)(0) ;
      SetDirty("Guiremdiv_N");
   }

   public boolean getgxTv_SdtCalprd_TRN_Guiremdiv_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCalprd_TRN_Emprnom_N( )
   {
      return gxTv_SdtCalprd_TRN_Emprnom_N ;
   }

   public void setgxTv_SdtCalprd_TRN_Emprnom_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      SetDirty("Emprnom_N");
      gxTv_SdtCalprd_TRN_Emprnom_N = value ;
   }

   public void setgxTv_SdtCalprd_TRN_Emprnom_N_SetNull( )
   {
      gxTv_SdtCalprd_TRN_Emprnom_N = (byte)(0) ;
      SetDirty("Emprnom_N");
   }

   public boolean getgxTv_SdtCalprd_TRN_Emprnom_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.calprd_trn_bc obj;
      obj = new app.calprd_trn_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtCalprd_TRN_Emprcod = "" ;
      gxTv_SdtCalprd_TRN_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Albpropri = "" ;
      gxTv_SdtCalprd_TRN_Albprofch = GXutil.nullDate() ;
      gxTv_SdtCalprd_TRN_Albfecsal = GXutil.nullDate() ;
      gxTv_SdtCalprd_TRN_Albhorsal = "" ;
      gxTv_SdtCalprd_TRN_Albusu = "" ;
      gxTv_SdtCalprd_TRN_Guiremcln = "" ;
      gxTv_SdtCalprd_TRN_Trnnom = "" ;
      gxTv_SdtCalprd_TRN_Albmat = "" ;
      gxTv_SdtCalprd_TRN_Albsec = "" ;
      gxTv_SdtCalprd_TRN_Alblic = "" ;
      gxTv_SdtCalprd_TRN_Albproat = "" ;
      gxTv_SdtCalprd_TRN_Albhhfm = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtCalprd_TRN_Albgrosst = DecimalUtil.ZERO ;
      gxTv_SdtCalprd_TRN_Albtrnnc = "" ;
      gxTv_SdtCalprd_TRN_Albfmd = "" ;
      gxTv_SdtCalprd_TRN_Albtrnnm = "" ;
      gxTv_SdtCalprd_TRN_Albfmdc = "" ;
      gxTv_SdtCalprd_TRN_Albtrndm = "" ;
      gxTv_SdtCalprd_TRN_Albmarca = "" ;
      gxTv_SdtCalprd_TRN_Albivacod = "" ;
      gxTv_SdtCalprd_TRN_Albcolca = "" ;
      gxTv_SdtCalprd_TRN_Albcambio = DecimalUtil.ZERO ;
      gxTv_SdtCalprd_TRN_Albmottr = "" ;
      gxTv_SdtCalprd_TRN_Albobscb = "" ;
      gxTv_SdtCalprd_TRN_Albmarco = "" ;
      gxTv_SdtCalprd_TRN_Albocomp = "" ;
      gxTv_SdtCalprd_TRN_Trnnif = "" ;
      gxTv_SdtCalprd_TRN_Albdivtcod = "" ;
      gxTv_SdtCalprd_TRN_Albdivabr = "" ;
      gxTv_SdtCalprd_TRN_Emprguirem = "" ;
      gxTv_SdtCalprd_TRN_Guiremdivt = "" ;
      gxTv_SdtCalprd_TRN_Emprnom = "" ;
      gxTv_SdtCalprd_TRN_Mode = "" ;
      gxTv_SdtCalprd_TRN_Emprcod_Z = "" ;
      gxTv_SdtCalprd_TRN_Albpropri_Z = "" ;
      gxTv_SdtCalprd_TRN_Albprofch_Z = GXutil.nullDate() ;
      gxTv_SdtCalprd_TRN_Albfecsal_Z = GXutil.nullDate() ;
      gxTv_SdtCalprd_TRN_Albhorsal_Z = "" ;
      gxTv_SdtCalprd_TRN_Albusu_Z = "" ;
      gxTv_SdtCalprd_TRN_Guiremcln_Z = "" ;
      gxTv_SdtCalprd_TRN_Trnnom_Z = "" ;
      gxTv_SdtCalprd_TRN_Albmat_Z = "" ;
      gxTv_SdtCalprd_TRN_Albsec_Z = "" ;
      gxTv_SdtCalprd_TRN_Alblic_Z = "" ;
      gxTv_SdtCalprd_TRN_Albproat_Z = "" ;
      gxTv_SdtCalprd_TRN_Albhhfm_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtCalprd_TRN_Albgrosst_Z = DecimalUtil.ZERO ;
      gxTv_SdtCalprd_TRN_Albtrnnc_Z = "" ;
      gxTv_SdtCalprd_TRN_Albfmd_Z = "" ;
      gxTv_SdtCalprd_TRN_Albtrnnm_Z = "" ;
      gxTv_SdtCalprd_TRN_Albfmdc_Z = "" ;
      gxTv_SdtCalprd_TRN_Albtrndm_Z = "" ;
      gxTv_SdtCalprd_TRN_Albmarca_Z = "" ;
      gxTv_SdtCalprd_TRN_Albivacod_Z = "" ;
      gxTv_SdtCalprd_TRN_Albcolca_Z = "" ;
      gxTv_SdtCalprd_TRN_Albcambio_Z = DecimalUtil.ZERO ;
      gxTv_SdtCalprd_TRN_Albmottr_Z = "" ;
      gxTv_SdtCalprd_TRN_Albobscb_Z = "" ;
      gxTv_SdtCalprd_TRN_Albmarco_Z = "" ;
      gxTv_SdtCalprd_TRN_Albocomp_Z = "" ;
      gxTv_SdtCalprd_TRN_Trnnif_Z = "" ;
      gxTv_SdtCalprd_TRN_Albdivtcod_Z = "" ;
      gxTv_SdtCalprd_TRN_Albdivabr_Z = "" ;
      gxTv_SdtCalprd_TRN_Emprguirem_Z = "" ;
      gxTv_SdtCalprd_TRN_Guiremdivt_Z = "" ;
      gxTv_SdtCalprd_TRN_Emprnom_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtCalprd_TRN_N ;
   }

   public app.SdtCalprd_TRN Clone( )
   {
      app.SdtCalprd_TRN sdt;
      app.calprd_trn_bc obj;
      sdt = (app.SdtCalprd_TRN)(clone()) ;
      obj = (app.calprd_trn_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.StructSdtCalprd_TRN struct )
   {
      setgxTv_SdtCalprd_TRN_Emprcod(struct.getEmprcod());
      setgxTv_SdtCalprd_TRN_Albprocod(struct.getAlbprocod());
      setgxTv_SdtCalprd_TRN_Albpropri(struct.getAlbpropri());
      setgxTv_SdtCalprd_TRN_Albproest(struct.getAlbproest());
      setgxTv_SdtCalprd_TRN_Albprofch(struct.getAlbprofch());
      setgxTv_SdtCalprd_TRN_Albfecsal(struct.getAlbfecsal());
      setgxTv_SdtCalprd_TRN_Albhorsal(struct.getAlbhorsal());
      setgxTv_SdtCalprd_TRN_Albusu(struct.getAlbusu());
      setgxTv_SdtCalprd_TRN_Guiremcli(struct.getGuiremcli());
      setgxTv_SdtCalprd_TRN_Guiremcln(struct.getGuiremcln());
      setgxTv_SdtCalprd_TRN_Albclides(struct.getAlbclides());
      setgxTv_SdtCalprd_TRN_Albdomenv(struct.getAlbdomenv());
      setgxTv_SdtCalprd_TRN_Trncod(struct.getTrncod());
      setgxTv_SdtCalprd_TRN_Trnnom(struct.getTrnnom());
      setgxTv_SdtCalprd_TRN_Albmat(struct.getAlbmat());
      setgxTv_SdtCalprd_TRN_Albsec(struct.getAlbsec());
      setgxTv_SdtCalprd_TRN_Albenvftp(struct.getAlbenvftp());
      setgxTv_SdtCalprd_TRN_Alblic(struct.getAlblic());
      setgxTv_SdtCalprd_TRN_Albproat(struct.getAlbproat());
      setgxTv_SdtCalprd_TRN_Albhhfm(struct.getAlbhhfm());
      setgxTv_SdtCalprd_TRN_Albgrosst(struct.getAlbgrosst());
      setgxTv_SdtCalprd_TRN_Albtrnnc(struct.getAlbtrnnc());
      setgxTv_SdtCalprd_TRN_Albfmd(struct.getAlbfmd());
      setgxTv_SdtCalprd_TRN_Albtrnnm(struct.getAlbtrnnm());
      setgxTv_SdtCalprd_TRN_Albfmdc(struct.getAlbfmdc());
      setgxTv_SdtCalprd_TRN_Albtrndm(struct.getAlbtrndm());
      setgxTv_SdtCalprd_TRN_Albmarca(struct.getAlbmarca());
      setgxTv_SdtCalprd_TRN_Alblocdes(struct.getAlblocdes());
      setgxTv_SdtCalprd_TRN_Albloccar(struct.getAlbloccar());
      setgxTv_SdtCalprd_TRN_Albpobscon(struct.getAlbpobscon());
      setgxTv_SdtCalprd_TRN_Albivacod(struct.getAlbivacod());
      setgxTv_SdtCalprd_TRN_Albcolca(struct.getAlbcolca());
      setgxTv_SdtCalprd_TRN_Albdesp(struct.getAlbdesp());
      setgxTv_SdtCalprd_TRN_Albcambio(struct.getAlbcambio());
      setgxTv_SdtCalprd_TRN_Albtipdoc(struct.getAlbtipdoc());
      setgxTv_SdtCalprd_TRN_Albmottr(struct.getAlbmottr());
      setgxTv_SdtCalprd_TRN_Albtipcal(struct.getAlbtipcal());
      setgxTv_SdtCalprd_TRN_Albobscb(struct.getAlbobscb());
      setgxTv_SdtCalprd_TRN_Albnumt(struct.getAlbnumt());
      setgxTv_SdtCalprd_TRN_Albmarco(struct.getAlbmarco());
      setgxTv_SdtCalprd_TRN_Albocomp(struct.getAlbocomp());
      setgxTv_SdtCalprd_TRN_Trnnif(struct.getTrnnif());
      setgxTv_SdtCalprd_TRN_Albdivtcod(struct.getAlbdivtcod());
      setgxTv_SdtCalprd_TRN_Albdivabr(struct.getAlbdivabr());
      setgxTv_SdtCalprd_TRN_Albdivcod(struct.getAlbdivcod());
      setgxTv_SdtCalprd_TRN_Busdomenv(struct.getBusdomenv());
      setgxTv_SdtCalprd_TRN_Emprguirem(struct.getEmprguirem());
      setgxTv_SdtCalprd_TRN_Guiremdom(struct.getGuiremdom());
      setgxTv_SdtCalprd_TRN_Guiremdivt(struct.getGuiremdivt());
      setgxTv_SdtCalprd_TRN_Guiremdiv(struct.getGuiremdiv());
      setgxTv_SdtCalprd_TRN_Emprnom(struct.getEmprnom());
      setgxTv_SdtCalprd_TRN_Mode(struct.getMode());
      setgxTv_SdtCalprd_TRN_Initialized(struct.getInitialized());
      setgxTv_SdtCalprd_TRN_Emprcod_Z(struct.getEmprcod_Z());
      setgxTv_SdtCalprd_TRN_Albprocod_Z(struct.getAlbprocod_Z());
      setgxTv_SdtCalprd_TRN_Albpropri_Z(struct.getAlbpropri_Z());
      setgxTv_SdtCalprd_TRN_Albproest_Z(struct.getAlbproest_Z());
      setgxTv_SdtCalprd_TRN_Albprofch_Z(struct.getAlbprofch_Z());
      setgxTv_SdtCalprd_TRN_Albfecsal_Z(struct.getAlbfecsal_Z());
      setgxTv_SdtCalprd_TRN_Albhorsal_Z(struct.getAlbhorsal_Z());
      setgxTv_SdtCalprd_TRN_Albusu_Z(struct.getAlbusu_Z());
      setgxTv_SdtCalprd_TRN_Guiremcli_Z(struct.getGuiremcli_Z());
      setgxTv_SdtCalprd_TRN_Guiremcln_Z(struct.getGuiremcln_Z());
      setgxTv_SdtCalprd_TRN_Albclides_Z(struct.getAlbclides_Z());
      setgxTv_SdtCalprd_TRN_Albdomenv_Z(struct.getAlbdomenv_Z());
      setgxTv_SdtCalprd_TRN_Trncod_Z(struct.getTrncod_Z());
      setgxTv_SdtCalprd_TRN_Trnnom_Z(struct.getTrnnom_Z());
      setgxTv_SdtCalprd_TRN_Albmat_Z(struct.getAlbmat_Z());
      setgxTv_SdtCalprd_TRN_Albsec_Z(struct.getAlbsec_Z());
      setgxTv_SdtCalprd_TRN_Albenvftp_Z(struct.getAlbenvftp_Z());
      setgxTv_SdtCalprd_TRN_Alblic_Z(struct.getAlblic_Z());
      setgxTv_SdtCalprd_TRN_Albproat_Z(struct.getAlbproat_Z());
      setgxTv_SdtCalprd_TRN_Albhhfm_Z(struct.getAlbhhfm_Z());
      setgxTv_SdtCalprd_TRN_Albgrosst_Z(struct.getAlbgrosst_Z());
      setgxTv_SdtCalprd_TRN_Albtrnnc_Z(struct.getAlbtrnnc_Z());
      setgxTv_SdtCalprd_TRN_Albfmd_Z(struct.getAlbfmd_Z());
      setgxTv_SdtCalprd_TRN_Albtrnnm_Z(struct.getAlbtrnnm_Z());
      setgxTv_SdtCalprd_TRN_Albfmdc_Z(struct.getAlbfmdc_Z());
      setgxTv_SdtCalprd_TRN_Albtrndm_Z(struct.getAlbtrndm_Z());
      setgxTv_SdtCalprd_TRN_Albmarca_Z(struct.getAlbmarca_Z());
      setgxTv_SdtCalprd_TRN_Alblocdes_Z(struct.getAlblocdes_Z());
      setgxTv_SdtCalprd_TRN_Albloccar_Z(struct.getAlbloccar_Z());
      setgxTv_SdtCalprd_TRN_Albpobscon_Z(struct.getAlbpobscon_Z());
      setgxTv_SdtCalprd_TRN_Albivacod_Z(struct.getAlbivacod_Z());
      setgxTv_SdtCalprd_TRN_Albcolca_Z(struct.getAlbcolca_Z());
      setgxTv_SdtCalprd_TRN_Albdesp_Z(struct.getAlbdesp_Z());
      setgxTv_SdtCalprd_TRN_Albcambio_Z(struct.getAlbcambio_Z());
      setgxTv_SdtCalprd_TRN_Albtipdoc_Z(struct.getAlbtipdoc_Z());
      setgxTv_SdtCalprd_TRN_Albmottr_Z(struct.getAlbmottr_Z());
      setgxTv_SdtCalprd_TRN_Albtipcal_Z(struct.getAlbtipcal_Z());
      setgxTv_SdtCalprd_TRN_Albobscb_Z(struct.getAlbobscb_Z());
      setgxTv_SdtCalprd_TRN_Albnumt_Z(struct.getAlbnumt_Z());
      setgxTv_SdtCalprd_TRN_Albmarco_Z(struct.getAlbmarco_Z());
      setgxTv_SdtCalprd_TRN_Albocomp_Z(struct.getAlbocomp_Z());
      setgxTv_SdtCalprd_TRN_Trnnif_Z(struct.getTrnnif_Z());
      setgxTv_SdtCalprd_TRN_Albdivtcod_Z(struct.getAlbdivtcod_Z());
      setgxTv_SdtCalprd_TRN_Albdivabr_Z(struct.getAlbdivabr_Z());
      setgxTv_SdtCalprd_TRN_Albdivcod_Z(struct.getAlbdivcod_Z());
      setgxTv_SdtCalprd_TRN_Busdomenv_Z(struct.getBusdomenv_Z());
      setgxTv_SdtCalprd_TRN_Emprguirem_Z(struct.getEmprguirem_Z());
      setgxTv_SdtCalprd_TRN_Guiremdom_Z(struct.getGuiremdom_Z());
      setgxTv_SdtCalprd_TRN_Guiremdivt_Z(struct.getGuiremdivt_Z());
      setgxTv_SdtCalprd_TRN_Guiremdiv_Z(struct.getGuiremdiv_Z());
      setgxTv_SdtCalprd_TRN_Emprnom_Z(struct.getEmprnom_Z());
      setgxTv_SdtCalprd_TRN_Albdomenv_N(struct.getAlbdomenv_N());
      setgxTv_SdtCalprd_TRN_Trnnom_N(struct.getTrnnom_N());
      setgxTv_SdtCalprd_TRN_Albfmd_N(struct.getAlbfmd_N());
      setgxTv_SdtCalprd_TRN_Trnnif_N(struct.getTrnnif_N());
      setgxTv_SdtCalprd_TRN_Albdivtcod_N(struct.getAlbdivtcod_N());
      setgxTv_SdtCalprd_TRN_Albdivabr_N(struct.getAlbdivabr_N());
      setgxTv_SdtCalprd_TRN_Albdivcod_N(struct.getAlbdivcod_N());
      setgxTv_SdtCalprd_TRN_Busdomenv_N(struct.getBusdomenv_N());
      setgxTv_SdtCalprd_TRN_Guiremdom_N(struct.getGuiremdom_N());
      setgxTv_SdtCalprd_TRN_Guiremdivt_N(struct.getGuiremdivt_N());
      setgxTv_SdtCalprd_TRN_Guiremdiv_N(struct.getGuiremdiv_N());
      setgxTv_SdtCalprd_TRN_Emprnom_N(struct.getEmprnom_N());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtCalprd_TRN getStruct( )
   {
      app.StructSdtCalprd_TRN struct = new app.StructSdtCalprd_TRN ();
      struct.setEmprcod(getgxTv_SdtCalprd_TRN_Emprcod());
      struct.setAlbprocod(getgxTv_SdtCalprd_TRN_Albprocod());
      struct.setAlbpropri(getgxTv_SdtCalprd_TRN_Albpropri());
      struct.setAlbproest(getgxTv_SdtCalprd_TRN_Albproest());
      struct.setAlbprofch(getgxTv_SdtCalprd_TRN_Albprofch());
      struct.setAlbfecsal(getgxTv_SdtCalprd_TRN_Albfecsal());
      struct.setAlbhorsal(getgxTv_SdtCalprd_TRN_Albhorsal());
      struct.setAlbusu(getgxTv_SdtCalprd_TRN_Albusu());
      struct.setGuiremcli(getgxTv_SdtCalprd_TRN_Guiremcli());
      struct.setGuiremcln(getgxTv_SdtCalprd_TRN_Guiremcln());
      struct.setAlbclides(getgxTv_SdtCalprd_TRN_Albclides());
      struct.setAlbdomenv(getgxTv_SdtCalprd_TRN_Albdomenv());
      struct.setTrncod(getgxTv_SdtCalprd_TRN_Trncod());
      struct.setTrnnom(getgxTv_SdtCalprd_TRN_Trnnom());
      struct.setAlbmat(getgxTv_SdtCalprd_TRN_Albmat());
      struct.setAlbsec(getgxTv_SdtCalprd_TRN_Albsec());
      struct.setAlbenvftp(getgxTv_SdtCalprd_TRN_Albenvftp());
      struct.setAlblic(getgxTv_SdtCalprd_TRN_Alblic());
      struct.setAlbproat(getgxTv_SdtCalprd_TRN_Albproat());
      struct.setAlbhhfm(getgxTv_SdtCalprd_TRN_Albhhfm());
      struct.setAlbgrosst(getgxTv_SdtCalprd_TRN_Albgrosst());
      struct.setAlbtrnnc(getgxTv_SdtCalprd_TRN_Albtrnnc());
      struct.setAlbfmd(getgxTv_SdtCalprd_TRN_Albfmd());
      struct.setAlbtrnnm(getgxTv_SdtCalprd_TRN_Albtrnnm());
      struct.setAlbfmdc(getgxTv_SdtCalprd_TRN_Albfmdc());
      struct.setAlbtrndm(getgxTv_SdtCalprd_TRN_Albtrndm());
      struct.setAlbmarca(getgxTv_SdtCalprd_TRN_Albmarca());
      struct.setAlblocdes(getgxTv_SdtCalprd_TRN_Alblocdes());
      struct.setAlbloccar(getgxTv_SdtCalprd_TRN_Albloccar());
      struct.setAlbpobscon(getgxTv_SdtCalprd_TRN_Albpobscon());
      struct.setAlbivacod(getgxTv_SdtCalprd_TRN_Albivacod());
      struct.setAlbcolca(getgxTv_SdtCalprd_TRN_Albcolca());
      struct.setAlbdesp(getgxTv_SdtCalprd_TRN_Albdesp());
      struct.setAlbcambio(getgxTv_SdtCalprd_TRN_Albcambio());
      struct.setAlbtipdoc(getgxTv_SdtCalprd_TRN_Albtipdoc());
      struct.setAlbmottr(getgxTv_SdtCalprd_TRN_Albmottr());
      struct.setAlbtipcal(getgxTv_SdtCalprd_TRN_Albtipcal());
      struct.setAlbobscb(getgxTv_SdtCalprd_TRN_Albobscb());
      struct.setAlbnumt(getgxTv_SdtCalprd_TRN_Albnumt());
      struct.setAlbmarco(getgxTv_SdtCalprd_TRN_Albmarco());
      struct.setAlbocomp(getgxTv_SdtCalprd_TRN_Albocomp());
      struct.setTrnnif(getgxTv_SdtCalprd_TRN_Trnnif());
      struct.setAlbdivtcod(getgxTv_SdtCalprd_TRN_Albdivtcod());
      struct.setAlbdivabr(getgxTv_SdtCalprd_TRN_Albdivabr());
      struct.setAlbdivcod(getgxTv_SdtCalprd_TRN_Albdivcod());
      struct.setBusdomenv(getgxTv_SdtCalprd_TRN_Busdomenv());
      struct.setEmprguirem(getgxTv_SdtCalprd_TRN_Emprguirem());
      struct.setGuiremdom(getgxTv_SdtCalprd_TRN_Guiremdom());
      struct.setGuiremdivt(getgxTv_SdtCalprd_TRN_Guiremdivt());
      struct.setGuiremdiv(getgxTv_SdtCalprd_TRN_Guiremdiv());
      struct.setEmprnom(getgxTv_SdtCalprd_TRN_Emprnom());
      struct.setMode(getgxTv_SdtCalprd_TRN_Mode());
      struct.setInitialized(getgxTv_SdtCalprd_TRN_Initialized());
      struct.setEmprcod_Z(getgxTv_SdtCalprd_TRN_Emprcod_Z());
      struct.setAlbprocod_Z(getgxTv_SdtCalprd_TRN_Albprocod_Z());
      struct.setAlbpropri_Z(getgxTv_SdtCalprd_TRN_Albpropri_Z());
      struct.setAlbproest_Z(getgxTv_SdtCalprd_TRN_Albproest_Z());
      struct.setAlbprofch_Z(getgxTv_SdtCalprd_TRN_Albprofch_Z());
      struct.setAlbfecsal_Z(getgxTv_SdtCalprd_TRN_Albfecsal_Z());
      struct.setAlbhorsal_Z(getgxTv_SdtCalprd_TRN_Albhorsal_Z());
      struct.setAlbusu_Z(getgxTv_SdtCalprd_TRN_Albusu_Z());
      struct.setGuiremcli_Z(getgxTv_SdtCalprd_TRN_Guiremcli_Z());
      struct.setGuiremcln_Z(getgxTv_SdtCalprd_TRN_Guiremcln_Z());
      struct.setAlbclides_Z(getgxTv_SdtCalprd_TRN_Albclides_Z());
      struct.setAlbdomenv_Z(getgxTv_SdtCalprd_TRN_Albdomenv_Z());
      struct.setTrncod_Z(getgxTv_SdtCalprd_TRN_Trncod_Z());
      struct.setTrnnom_Z(getgxTv_SdtCalprd_TRN_Trnnom_Z());
      struct.setAlbmat_Z(getgxTv_SdtCalprd_TRN_Albmat_Z());
      struct.setAlbsec_Z(getgxTv_SdtCalprd_TRN_Albsec_Z());
      struct.setAlbenvftp_Z(getgxTv_SdtCalprd_TRN_Albenvftp_Z());
      struct.setAlblic_Z(getgxTv_SdtCalprd_TRN_Alblic_Z());
      struct.setAlbproat_Z(getgxTv_SdtCalprd_TRN_Albproat_Z());
      struct.setAlbhhfm_Z(getgxTv_SdtCalprd_TRN_Albhhfm_Z());
      struct.setAlbgrosst_Z(getgxTv_SdtCalprd_TRN_Albgrosst_Z());
      struct.setAlbtrnnc_Z(getgxTv_SdtCalprd_TRN_Albtrnnc_Z());
      struct.setAlbfmd_Z(getgxTv_SdtCalprd_TRN_Albfmd_Z());
      struct.setAlbtrnnm_Z(getgxTv_SdtCalprd_TRN_Albtrnnm_Z());
      struct.setAlbfmdc_Z(getgxTv_SdtCalprd_TRN_Albfmdc_Z());
      struct.setAlbtrndm_Z(getgxTv_SdtCalprd_TRN_Albtrndm_Z());
      struct.setAlbmarca_Z(getgxTv_SdtCalprd_TRN_Albmarca_Z());
      struct.setAlblocdes_Z(getgxTv_SdtCalprd_TRN_Alblocdes_Z());
      struct.setAlbloccar_Z(getgxTv_SdtCalprd_TRN_Albloccar_Z());
      struct.setAlbpobscon_Z(getgxTv_SdtCalprd_TRN_Albpobscon_Z());
      struct.setAlbivacod_Z(getgxTv_SdtCalprd_TRN_Albivacod_Z());
      struct.setAlbcolca_Z(getgxTv_SdtCalprd_TRN_Albcolca_Z());
      struct.setAlbdesp_Z(getgxTv_SdtCalprd_TRN_Albdesp_Z());
      struct.setAlbcambio_Z(getgxTv_SdtCalprd_TRN_Albcambio_Z());
      struct.setAlbtipdoc_Z(getgxTv_SdtCalprd_TRN_Albtipdoc_Z());
      struct.setAlbmottr_Z(getgxTv_SdtCalprd_TRN_Albmottr_Z());
      struct.setAlbtipcal_Z(getgxTv_SdtCalprd_TRN_Albtipcal_Z());
      struct.setAlbobscb_Z(getgxTv_SdtCalprd_TRN_Albobscb_Z());
      struct.setAlbnumt_Z(getgxTv_SdtCalprd_TRN_Albnumt_Z());
      struct.setAlbmarco_Z(getgxTv_SdtCalprd_TRN_Albmarco_Z());
      struct.setAlbocomp_Z(getgxTv_SdtCalprd_TRN_Albocomp_Z());
      struct.setTrnnif_Z(getgxTv_SdtCalprd_TRN_Trnnif_Z());
      struct.setAlbdivtcod_Z(getgxTv_SdtCalprd_TRN_Albdivtcod_Z());
      struct.setAlbdivabr_Z(getgxTv_SdtCalprd_TRN_Albdivabr_Z());
      struct.setAlbdivcod_Z(getgxTv_SdtCalprd_TRN_Albdivcod_Z());
      struct.setBusdomenv_Z(getgxTv_SdtCalprd_TRN_Busdomenv_Z());
      struct.setEmprguirem_Z(getgxTv_SdtCalprd_TRN_Emprguirem_Z());
      struct.setGuiremdom_Z(getgxTv_SdtCalprd_TRN_Guiremdom_Z());
      struct.setGuiremdivt_Z(getgxTv_SdtCalprd_TRN_Guiremdivt_Z());
      struct.setGuiremdiv_Z(getgxTv_SdtCalprd_TRN_Guiremdiv_Z());
      struct.setEmprnom_Z(getgxTv_SdtCalprd_TRN_Emprnom_Z());
      struct.setAlbdomenv_N(getgxTv_SdtCalprd_TRN_Albdomenv_N());
      struct.setTrnnom_N(getgxTv_SdtCalprd_TRN_Trnnom_N());
      struct.setAlbfmd_N(getgxTv_SdtCalprd_TRN_Albfmd_N());
      struct.setTrnnif_N(getgxTv_SdtCalprd_TRN_Trnnif_N());
      struct.setAlbdivtcod_N(getgxTv_SdtCalprd_TRN_Albdivtcod_N());
      struct.setAlbdivabr_N(getgxTv_SdtCalprd_TRN_Albdivabr_N());
      struct.setAlbdivcod_N(getgxTv_SdtCalprd_TRN_Albdivcod_N());
      struct.setBusdomenv_N(getgxTv_SdtCalprd_TRN_Busdomenv_N());
      struct.setGuiremdom_N(getgxTv_SdtCalprd_TRN_Guiremdom_N());
      struct.setGuiremdivt_N(getgxTv_SdtCalprd_TRN_Guiremdivt_N());
      struct.setGuiremdiv_N(getgxTv_SdtCalprd_TRN_Guiremdiv_N());
      struct.setEmprnom_N(getgxTv_SdtCalprd_TRN_Emprnom_N());
      return struct ;
   }

   private byte gxTv_SdtCalprd_TRN_N ;
   private byte gxTv_SdtCalprd_TRN_Albproest ;
   private byte gxTv_SdtCalprd_TRN_Albdomenv ;
   private byte gxTv_SdtCalprd_TRN_Albenvftp ;
   private byte gxTv_SdtCalprd_TRN_Alblocdes ;
   private byte gxTv_SdtCalprd_TRN_Albloccar ;
   private byte gxTv_SdtCalprd_TRN_Albpobscon ;
   private byte gxTv_SdtCalprd_TRN_Albtipcal ;
   private byte gxTv_SdtCalprd_TRN_Albdivcod ;
   private byte gxTv_SdtCalprd_TRN_Busdomenv ;
   private byte gxTv_SdtCalprd_TRN_Guiremdom ;
   private byte gxTv_SdtCalprd_TRN_Guiremdiv ;
   private byte gxTv_SdtCalprd_TRN_Albproest_Z ;
   private byte gxTv_SdtCalprd_TRN_Albdomenv_Z ;
   private byte gxTv_SdtCalprd_TRN_Albenvftp_Z ;
   private byte gxTv_SdtCalprd_TRN_Alblocdes_Z ;
   private byte gxTv_SdtCalprd_TRN_Albloccar_Z ;
   private byte gxTv_SdtCalprd_TRN_Albpobscon_Z ;
   private byte gxTv_SdtCalprd_TRN_Albtipcal_Z ;
   private byte gxTv_SdtCalprd_TRN_Albdivcod_Z ;
   private byte gxTv_SdtCalprd_TRN_Busdomenv_Z ;
   private byte gxTv_SdtCalprd_TRN_Guiremdom_Z ;
   private byte gxTv_SdtCalprd_TRN_Guiremdiv_Z ;
   private byte gxTv_SdtCalprd_TRN_Albdomenv_N ;
   private byte gxTv_SdtCalprd_TRN_Trnnom_N ;
   private byte gxTv_SdtCalprd_TRN_Albfmd_N ;
   private byte gxTv_SdtCalprd_TRN_Trnnif_N ;
   private byte gxTv_SdtCalprd_TRN_Albdivtcod_N ;
   private byte gxTv_SdtCalprd_TRN_Albdivabr_N ;
   private byte gxTv_SdtCalprd_TRN_Albdivcod_N ;
   private byte gxTv_SdtCalprd_TRN_Busdomenv_N ;
   private byte gxTv_SdtCalprd_TRN_Guiremdom_N ;
   private byte gxTv_SdtCalprd_TRN_Guiremdivt_N ;
   private byte gxTv_SdtCalprd_TRN_Guiremdiv_N ;
   private byte gxTv_SdtCalprd_TRN_Emprnom_N ;
   private short gxTv_SdtCalprd_TRN_Trncod ;
   private short gxTv_SdtCalprd_TRN_Initialized ;
   private short gxTv_SdtCalprd_TRN_Trncod_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtCalprd_TRN_Guiremcli ;
   private int gxTv_SdtCalprd_TRN_Albclides ;
   private int gxTv_SdtCalprd_TRN_Albdesp ;
   private int gxTv_SdtCalprd_TRN_Albtipdoc ;
   private int gxTv_SdtCalprd_TRN_Guiremcli_Z ;
   private int gxTv_SdtCalprd_TRN_Albclides_Z ;
   private int gxTv_SdtCalprd_TRN_Albdesp_Z ;
   private int gxTv_SdtCalprd_TRN_Albtipdoc_Z ;
   private long gxTv_SdtCalprd_TRN_Albprocod ;
   private long gxTv_SdtCalprd_TRN_Albnumt ;
   private long gxTv_SdtCalprd_TRN_Albprocod_Z ;
   private long gxTv_SdtCalprd_TRN_Albnumt_Z ;
   private java.math.BigDecimal gxTv_SdtCalprd_TRN_Albgrosst ;
   private java.math.BigDecimal gxTv_SdtCalprd_TRN_Albcambio ;
   private java.math.BigDecimal gxTv_SdtCalprd_TRN_Albgrosst_Z ;
   private java.math.BigDecimal gxTv_SdtCalprd_TRN_Albcambio_Z ;
   private String gxTv_SdtCalprd_TRN_Emprcod ;
   private String gxTv_SdtCalprd_TRN_Albpropri ;
   private String gxTv_SdtCalprd_TRN_Albhorsal ;
   private String gxTv_SdtCalprd_TRN_Albusu ;
   private String gxTv_SdtCalprd_TRN_Guiremcln ;
   private String gxTv_SdtCalprd_TRN_Trnnom ;
   private String gxTv_SdtCalprd_TRN_Albmat ;
   private String gxTv_SdtCalprd_TRN_Albsec ;
   private String gxTv_SdtCalprd_TRN_Alblic ;
   private String gxTv_SdtCalprd_TRN_Albproat ;
   private String gxTv_SdtCalprd_TRN_Albtrnnc ;
   private String gxTv_SdtCalprd_TRN_Albtrnnm ;
   private String gxTv_SdtCalprd_TRN_Albfmdc ;
   private String gxTv_SdtCalprd_TRN_Albtrndm ;
   private String gxTv_SdtCalprd_TRN_Albmarca ;
   private String gxTv_SdtCalprd_TRN_Albivacod ;
   private String gxTv_SdtCalprd_TRN_Albcolca ;
   private String gxTv_SdtCalprd_TRN_Albmottr ;
   private String gxTv_SdtCalprd_TRN_Albobscb ;
   private String gxTv_SdtCalprd_TRN_Albmarco ;
   private String gxTv_SdtCalprd_TRN_Albocomp ;
   private String gxTv_SdtCalprd_TRN_Trnnif ;
   private String gxTv_SdtCalprd_TRN_Albdivtcod ;
   private String gxTv_SdtCalprd_TRN_Albdivabr ;
   private String gxTv_SdtCalprd_TRN_Emprguirem ;
   private String gxTv_SdtCalprd_TRN_Guiremdivt ;
   private String gxTv_SdtCalprd_TRN_Emprnom ;
   private String gxTv_SdtCalprd_TRN_Mode ;
   private String gxTv_SdtCalprd_TRN_Emprcod_Z ;
   private String gxTv_SdtCalprd_TRN_Albpropri_Z ;
   private String gxTv_SdtCalprd_TRN_Albhorsal_Z ;
   private String gxTv_SdtCalprd_TRN_Albusu_Z ;
   private String gxTv_SdtCalprd_TRN_Guiremcln_Z ;
   private String gxTv_SdtCalprd_TRN_Trnnom_Z ;
   private String gxTv_SdtCalprd_TRN_Albmat_Z ;
   private String gxTv_SdtCalprd_TRN_Albsec_Z ;
   private String gxTv_SdtCalprd_TRN_Alblic_Z ;
   private String gxTv_SdtCalprd_TRN_Albproat_Z ;
   private String gxTv_SdtCalprd_TRN_Albtrnnc_Z ;
   private String gxTv_SdtCalprd_TRN_Albtrnnm_Z ;
   private String gxTv_SdtCalprd_TRN_Albfmdc_Z ;
   private String gxTv_SdtCalprd_TRN_Albtrndm_Z ;
   private String gxTv_SdtCalprd_TRN_Albmarca_Z ;
   private String gxTv_SdtCalprd_TRN_Albivacod_Z ;
   private String gxTv_SdtCalprd_TRN_Albcolca_Z ;
   private String gxTv_SdtCalprd_TRN_Albmottr_Z ;
   private String gxTv_SdtCalprd_TRN_Albobscb_Z ;
   private String gxTv_SdtCalprd_TRN_Albmarco_Z ;
   private String gxTv_SdtCalprd_TRN_Albocomp_Z ;
   private String gxTv_SdtCalprd_TRN_Trnnif_Z ;
   private String gxTv_SdtCalprd_TRN_Albdivtcod_Z ;
   private String gxTv_SdtCalprd_TRN_Albdivabr_Z ;
   private String gxTv_SdtCalprd_TRN_Emprguirem_Z ;
   private String gxTv_SdtCalprd_TRN_Guiremdivt_Z ;
   private String gxTv_SdtCalprd_TRN_Emprnom_Z ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtCalprd_TRN_Albhhfm ;
   private java.util.Date gxTv_SdtCalprd_TRN_Albhhfm_Z ;
   private java.util.Date datetime_STZ ;
   private java.util.Date gxTv_SdtCalprd_TRN_Albprofch ;
   private java.util.Date gxTv_SdtCalprd_TRN_Albfecsal ;
   private java.util.Date gxTv_SdtCalprd_TRN_Albprofch_Z ;
   private java.util.Date gxTv_SdtCalprd_TRN_Albfecsal_Z ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtCalprd_TRN_Albfmd ;
   private String gxTv_SdtCalprd_TRN_Albfmd_Z ;
}

