package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtCalprd_SDT extends GxUserType
{
   public SdtCalprd_SDT( )
   {
      this(  new ModelContext(SdtCalprd_SDT.class));
   }

   public SdtCalprd_SDT( ModelContext context )
   {
      super( context, "SdtCalprd_SDT");
   }

   public SdtCalprd_SDT( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle, context, "SdtCalprd_SDT");
   }

   public SdtCalprd_SDT( StructSdtCalprd_SDT struct )
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
               gxTv_SdtCalprd_SDT_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProCod") )
            {
               gxTv_SdtCalprd_SDT_Albprocod = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProPri") )
            {
               gxTv_SdtCalprd_SDT_Albpropri = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProEst") )
            {
               gxTv_SdtCalprd_SDT_Albproest = (byte)(getnumericvalue(oReader.getValue())) ;
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
                  gxTv_SdtCalprd_SDT_Albprofch = GXutil.nullDate() ;
                  gxTv_SdtCalprd_SDT_Albprofch_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtCalprd_SDT_Albprofch_N = (byte)(0) ;
                  gxTv_SdtCalprd_SDT_Albprofch = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
                  gxTv_SdtCalprd_SDT_Albfecsal = GXutil.nullDate() ;
                  gxTv_SdtCalprd_SDT_Albfecsal_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtCalprd_SDT_Albfecsal_N = (byte)(0) ;
                  gxTv_SdtCalprd_SDT_Albfecsal = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
               gxTv_SdtCalprd_SDT_Albhorsal = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbUsu") )
            {
               gxTv_SdtCalprd_SDT_Albusu = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemCli") )
            {
               gxTv_SdtCalprd_SDT_Guiremcli = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemCln") )
            {
               gxTv_SdtCalprd_SDT_Guiremcln = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbCliDes") )
            {
               gxTv_SdtCalprd_SDT_Albclides = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDomEnv") )
            {
               gxTv_SdtCalprd_SDT_Albdomenv = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnCod") )
            {
               gxTv_SdtCalprd_SDT_Trncod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnNom") )
            {
               gxTv_SdtCalprd_SDT_Trnnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbMat") )
            {
               gxTv_SdtCalprd_SDT_Albmat = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbSec") )
            {
               gxTv_SdtCalprd_SDT_Albsec = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbEnvFtp") )
            {
               gxTv_SdtCalprd_SDT_Albenvftp = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbLic") )
            {
               gxTv_SdtCalprd_SDT_Alblic = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProAT") )
            {
               gxTv_SdtCalprd_SDT_Albproat = oReader.getValue() ;
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
                  gxTv_SdtCalprd_SDT_Albhhfm = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtCalprd_SDT_Albhhfm_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtCalprd_SDT_Albhhfm_N = (byte)(0) ;
                  gxTv_SdtCalprd_SDT_Albhhfm = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
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
               gxTv_SdtCalprd_SDT_Albgrosst = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTrnNc") )
            {
               gxTv_SdtCalprd_SDT_Albtrnnc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbFmd") )
            {
               gxTv_SdtCalprd_SDT_Albfmd = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTrnNm") )
            {
               gxTv_SdtCalprd_SDT_Albtrnnm = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ALbFmdc") )
            {
               gxTv_SdtCalprd_SDT_Albfmdc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTrnDm") )
            {
               gxTv_SdtCalprd_SDT_Albtrndm = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbMarca") )
            {
               gxTv_SdtCalprd_SDT_Albmarca = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbLocDes") )
            {
               gxTv_SdtCalprd_SDT_Alblocdes = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbLocCar") )
            {
               gxTv_SdtCalprd_SDT_Albloccar = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPObsCon") )
            {
               gxTv_SdtCalprd_SDT_Albpobscon = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbIvaCod") )
            {
               gxTv_SdtCalprd_SDT_Albivacod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbColCa") )
            {
               gxTv_SdtCalprd_SDT_Albcolca = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDesp") )
            {
               gxTv_SdtCalprd_SDT_Albdesp = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbCambio") )
            {
               gxTv_SdtCalprd_SDT_Albcambio = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTipDoc") )
            {
               gxTv_SdtCalprd_SDT_Albtipdoc = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbMotTr") )
            {
               gxTv_SdtCalprd_SDT_Albmottr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbTipCal") )
            {
               gxTv_SdtCalprd_SDT_Albtipcal = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbObsCb") )
            {
               gxTv_SdtCalprd_SDT_Albobscb = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbNumT") )
            {
               gxTv_SdtCalprd_SDT_Albnumt = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbMarCo") )
            {
               gxTv_SdtCalprd_SDT_Albmarco = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbOComp") )
            {
               gxTv_SdtCalprd_SDT_Albocomp = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TrnNif") )
            {
               gxTv_SdtCalprd_SDT_Trnnif = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDivTCod") )
            {
               gxTv_SdtCalprd_SDT_Albdivtcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDivAbr") )
            {
               gxTv_SdtCalprd_SDT_Albdivabr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDivCod") )
            {
               gxTv_SdtCalprd_SDT_Albdivcod = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BusDomEnv") )
            {
               gxTv_SdtCalprd_SDT_Busdomenv = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprGuiRem") )
            {
               gxTv_SdtCalprd_SDT_Emprguirem = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemDom") )
            {
               gxTv_SdtCalprd_SDT_Guiremdom = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemDivT") )
            {
               gxTv_SdtCalprd_SDT_Guiremdivt = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GuiRemDiv") )
            {
               gxTv_SdtCalprd_SDT_Guiremdiv = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtCalprd_SDT_Emprnom = oReader.getValue() ;
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
         sName = "Calprd_SDT" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtCalprd_SDT_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProCod", GXutil.trim( GXutil.str( gxTv_SdtCalprd_SDT_Albprocod, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProPri", gxTv_SdtCalprd_SDT_Albpropri);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProEst", GXutil.trim( GXutil.str( gxTv_SdtCalprd_SDT_Albproest, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtCalprd_SDT_Albprofch)) && ( gxTv_SdtCalprd_SDT_Albprofch_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCalprd_SDT_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCalprd_SDT_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCalprd_SDT_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbProfch", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtCalprd_SDT_Albfecsal)) && ( gxTv_SdtCalprd_SDT_Albfecsal_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCalprd_SDT_Albfecsal), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCalprd_SDT_Albfecsal), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCalprd_SDT_Albfecsal), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbFecSal", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("AlbHorSal", gxTv_SdtCalprd_SDT_Albhorsal);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbUsu", gxTv_SdtCalprd_SDT_Albusu);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GuiRemCli", GXutil.trim( GXutil.str( gxTv_SdtCalprd_SDT_Guiremcli, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GuiRemCln", gxTv_SdtCalprd_SDT_Guiremcln);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbCliDes", GXutil.trim( GXutil.str( gxTv_SdtCalprd_SDT_Albclides, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDomEnv", GXutil.trim( GXutil.str( gxTv_SdtCalprd_SDT_Albdomenv, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TrnCod", GXutil.trim( GXutil.str( gxTv_SdtCalprd_SDT_Trncod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TrnNom", gxTv_SdtCalprd_SDT_Trnnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbMat", gxTv_SdtCalprd_SDT_Albmat);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbSec", gxTv_SdtCalprd_SDT_Albsec);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbEnvFtp", GXutil.trim( GXutil.str( gxTv_SdtCalprd_SDT_Albenvftp, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbLic", gxTv_SdtCalprd_SDT_Alblic);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProAT", gxTv_SdtCalprd_SDT_Albproat);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtCalprd_SDT_Albhhfm) && ( gxTv_SdtCalprd_SDT_Albhhfm_N == 1 ) )
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
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCalprd_SDT_Albhhfm), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCalprd_SDT_Albhhfm), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCalprd_SDT_Albhhfm), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtCalprd_SDT_Albhhfm), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtCalprd_SDT_Albhhfm), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtCalprd_SDT_Albhhfm), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbHhfm", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("AlbGrossT", GXutil.trim( GXutil.strNoRound( gxTv_SdtCalprd_SDT_Albgrosst, 13, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbTrnNc", gxTv_SdtCalprd_SDT_Albtrnnc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbFmd", gxTv_SdtCalprd_SDT_Albfmd);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbTrnNm", gxTv_SdtCalprd_SDT_Albtrnnm);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ALbFmdc", gxTv_SdtCalprd_SDT_Albfmdc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbTrnDm", gxTv_SdtCalprd_SDT_Albtrndm);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbMarca", gxTv_SdtCalprd_SDT_Albmarca);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbLocDes", GXutil.trim( GXutil.str( gxTv_SdtCalprd_SDT_Alblocdes, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbLocCar", GXutil.trim( GXutil.str( gxTv_SdtCalprd_SDT_Albloccar, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbPObsCon", GXutil.trim( GXutil.str( gxTv_SdtCalprd_SDT_Albpobscon, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbIvaCod", gxTv_SdtCalprd_SDT_Albivacod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbColCa", gxTv_SdtCalprd_SDT_Albcolca);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDesp", GXutil.trim( GXutil.str( gxTv_SdtCalprd_SDT_Albdesp, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbCambio", GXutil.trim( GXutil.strNoRound( gxTv_SdtCalprd_SDT_Albcambio, 7, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbTipDoc", GXutil.trim( GXutil.str( gxTv_SdtCalprd_SDT_Albtipdoc, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbMotTr", gxTv_SdtCalprd_SDT_Albmottr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbTipCal", GXutil.trim( GXutil.str( gxTv_SdtCalprd_SDT_Albtipcal, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbObsCb", gxTv_SdtCalprd_SDT_Albobscb);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbNumT", GXutil.trim( GXutil.str( gxTv_SdtCalprd_SDT_Albnumt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbMarCo", gxTv_SdtCalprd_SDT_Albmarco);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbOComp", gxTv_SdtCalprd_SDT_Albocomp);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TrnNif", gxTv_SdtCalprd_SDT_Trnnif);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDivTCod", gxTv_SdtCalprd_SDT_Albdivtcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDivAbr", gxTv_SdtCalprd_SDT_Albdivabr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDivCod", GXutil.trim( GXutil.str( gxTv_SdtCalprd_SDT_Albdivcod, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BusDomEnv", GXutil.trim( GXutil.str( gxTv_SdtCalprd_SDT_Busdomenv, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprGuiRem", gxTv_SdtCalprd_SDT_Emprguirem);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GuiRemDom", GXutil.trim( GXutil.str( gxTv_SdtCalprd_SDT_Guiremdom, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GuiRemDivT", gxTv_SdtCalprd_SDT_Guiremdivt);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GuiRemDiv", GXutil.trim( GXutil.str( gxTv_SdtCalprd_SDT_Guiremdiv, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtCalprd_SDT_Emprnom);
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
      AddObjectProperty("EmprCod", gxTv_SdtCalprd_SDT_Emprcod, false, false);
      AddObjectProperty("AlbProCod", gxTv_SdtCalprd_SDT_Albprocod, false, false);
      AddObjectProperty("AlbProPri", gxTv_SdtCalprd_SDT_Albpropri, false, false);
      AddObjectProperty("AlbProEst", gxTv_SdtCalprd_SDT_Albproest, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCalprd_SDT_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCalprd_SDT_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCalprd_SDT_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("AlbProfch", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCalprd_SDT_Albfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCalprd_SDT_Albfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCalprd_SDT_Albfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("AlbFecSal", sDateCnv, false, false);
      AddObjectProperty("AlbHorSal", gxTv_SdtCalprd_SDT_Albhorsal, false, false);
      AddObjectProperty("AlbUsu", gxTv_SdtCalprd_SDT_Albusu, false, false);
      AddObjectProperty("GuiRemCli", gxTv_SdtCalprd_SDT_Guiremcli, false, false);
      AddObjectProperty("GuiRemCln", gxTv_SdtCalprd_SDT_Guiremcln, false, false);
      AddObjectProperty("AlbCliDes", gxTv_SdtCalprd_SDT_Albclides, false, false);
      AddObjectProperty("AlbDomEnv", gxTv_SdtCalprd_SDT_Albdomenv, false, false);
      AddObjectProperty("TrnCod", gxTv_SdtCalprd_SDT_Trncod, false, false);
      AddObjectProperty("TrnNom", gxTv_SdtCalprd_SDT_Trnnom, false, false);
      AddObjectProperty("AlbMat", gxTv_SdtCalprd_SDT_Albmat, false, false);
      AddObjectProperty("AlbSec", gxTv_SdtCalprd_SDT_Albsec, false, false);
      AddObjectProperty("AlbEnvFtp", gxTv_SdtCalprd_SDT_Albenvftp, false, false);
      AddObjectProperty("AlbLic", gxTv_SdtCalprd_SDT_Alblic, false, false);
      AddObjectProperty("AlbProAT", gxTv_SdtCalprd_SDT_Albproat, false, false);
      datetime_STZ = gxTv_SdtCalprd_SDT_Albhhfm ;
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
      AddObjectProperty("AlbGrossT", gxTv_SdtCalprd_SDT_Albgrosst, false, false);
      AddObjectProperty("AlbTrnNc", gxTv_SdtCalprd_SDT_Albtrnnc, false, false);
      AddObjectProperty("AlbFmd", gxTv_SdtCalprd_SDT_Albfmd, false, false);
      AddObjectProperty("AlbTrnNm", gxTv_SdtCalprd_SDT_Albtrnnm, false, false);
      AddObjectProperty("ALbFmdc", gxTv_SdtCalprd_SDT_Albfmdc, false, false);
      AddObjectProperty("AlbTrnDm", gxTv_SdtCalprd_SDT_Albtrndm, false, false);
      AddObjectProperty("AlbMarca", gxTv_SdtCalprd_SDT_Albmarca, false, false);
      AddObjectProperty("AlbLocDes", gxTv_SdtCalprd_SDT_Alblocdes, false, false);
      AddObjectProperty("AlbLocCar", gxTv_SdtCalprd_SDT_Albloccar, false, false);
      AddObjectProperty("AlbPObsCon", gxTv_SdtCalprd_SDT_Albpobscon, false, false);
      AddObjectProperty("AlbIvaCod", gxTv_SdtCalprd_SDT_Albivacod, false, false);
      AddObjectProperty("AlbColCa", gxTv_SdtCalprd_SDT_Albcolca, false, false);
      AddObjectProperty("AlbDesp", gxTv_SdtCalprd_SDT_Albdesp, false, false);
      AddObjectProperty("AlbCambio", gxTv_SdtCalprd_SDT_Albcambio, false, false);
      AddObjectProperty("AlbTipDoc", gxTv_SdtCalprd_SDT_Albtipdoc, false, false);
      AddObjectProperty("AlbMotTr", gxTv_SdtCalprd_SDT_Albmottr, false, false);
      AddObjectProperty("AlbTipCal", gxTv_SdtCalprd_SDT_Albtipcal, false, false);
      AddObjectProperty("AlbObsCb", gxTv_SdtCalprd_SDT_Albobscb, false, false);
      AddObjectProperty("AlbNumT", gxTv_SdtCalprd_SDT_Albnumt, false, false);
      AddObjectProperty("AlbMarCo", gxTv_SdtCalprd_SDT_Albmarco, false, false);
      AddObjectProperty("AlbOComp", gxTv_SdtCalprd_SDT_Albocomp, false, false);
      AddObjectProperty("TrnNif", gxTv_SdtCalprd_SDT_Trnnif, false, false);
      AddObjectProperty("AlbDivTCod", gxTv_SdtCalprd_SDT_Albdivtcod, false, false);
      AddObjectProperty("AlbDivAbr", gxTv_SdtCalprd_SDT_Albdivabr, false, false);
      AddObjectProperty("AlbDivCod", gxTv_SdtCalprd_SDT_Albdivcod, false, false);
      AddObjectProperty("BusDomEnv", gxTv_SdtCalprd_SDT_Busdomenv, false, false);
      AddObjectProperty("EmprGuiRem", gxTv_SdtCalprd_SDT_Emprguirem, false, false);
      AddObjectProperty("GuiRemDom", gxTv_SdtCalprd_SDT_Guiremdom, false, false);
      AddObjectProperty("GuiRemDivT", gxTv_SdtCalprd_SDT_Guiremdivt, false, false);
      AddObjectProperty("GuiRemDiv", gxTv_SdtCalprd_SDT_Guiremdiv, false, false);
      AddObjectProperty("EmprNom", gxTv_SdtCalprd_SDT_Emprnom, false, false);
   }

   public String getgxTv_SdtCalprd_SDT_Emprcod( )
   {
      return gxTv_SdtCalprd_SDT_Emprcod ;
   }

   public void setgxTv_SdtCalprd_SDT_Emprcod( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Emprcod = value ;
   }

   public long getgxTv_SdtCalprd_SDT_Albprocod( )
   {
      return gxTv_SdtCalprd_SDT_Albprocod ;
   }

   public void setgxTv_SdtCalprd_SDT_Albprocod( long value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albprocod = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Albpropri( )
   {
      return gxTv_SdtCalprd_SDT_Albpropri ;
   }

   public void setgxTv_SdtCalprd_SDT_Albpropri( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albpropri = value ;
   }

   public byte getgxTv_SdtCalprd_SDT_Albproest( )
   {
      return gxTv_SdtCalprd_SDT_Albproest ;
   }

   public void setgxTv_SdtCalprd_SDT_Albproest( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albproest = value ;
   }

   public java.util.Date getgxTv_SdtCalprd_SDT_Albprofch( )
   {
      return gxTv_SdtCalprd_SDT_Albprofch ;
   }

   public void setgxTv_SdtCalprd_SDT_Albprofch( java.util.Date value )
   {
      gxTv_SdtCalprd_SDT_Albprofch_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albprofch = value ;
   }

   public java.util.Date getgxTv_SdtCalprd_SDT_Albfecsal( )
   {
      return gxTv_SdtCalprd_SDT_Albfecsal ;
   }

   public void setgxTv_SdtCalprd_SDT_Albfecsal( java.util.Date value )
   {
      gxTv_SdtCalprd_SDT_Albfecsal_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albfecsal = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Albhorsal( )
   {
      return gxTv_SdtCalprd_SDT_Albhorsal ;
   }

   public void setgxTv_SdtCalprd_SDT_Albhorsal( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albhorsal = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Albusu( )
   {
      return gxTv_SdtCalprd_SDT_Albusu ;
   }

   public void setgxTv_SdtCalprd_SDT_Albusu( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albusu = value ;
   }

   public int getgxTv_SdtCalprd_SDT_Guiremcli( )
   {
      return gxTv_SdtCalprd_SDT_Guiremcli ;
   }

   public void setgxTv_SdtCalprd_SDT_Guiremcli( int value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Guiremcli = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Guiremcln( )
   {
      return gxTv_SdtCalprd_SDT_Guiremcln ;
   }

   public void setgxTv_SdtCalprd_SDT_Guiremcln( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Guiremcln = value ;
   }

   public int getgxTv_SdtCalprd_SDT_Albclides( )
   {
      return gxTv_SdtCalprd_SDT_Albclides ;
   }

   public void setgxTv_SdtCalprd_SDT_Albclides( int value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albclides = value ;
   }

   public byte getgxTv_SdtCalprd_SDT_Albdomenv( )
   {
      return gxTv_SdtCalprd_SDT_Albdomenv ;
   }

   public void setgxTv_SdtCalprd_SDT_Albdomenv( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albdomenv = value ;
   }

   public short getgxTv_SdtCalprd_SDT_Trncod( )
   {
      return gxTv_SdtCalprd_SDT_Trncod ;
   }

   public void setgxTv_SdtCalprd_SDT_Trncod( short value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Trncod = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Trnnom( )
   {
      return gxTv_SdtCalprd_SDT_Trnnom ;
   }

   public void setgxTv_SdtCalprd_SDT_Trnnom( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Trnnom = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Albmat( )
   {
      return gxTv_SdtCalprd_SDT_Albmat ;
   }

   public void setgxTv_SdtCalprd_SDT_Albmat( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albmat = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Albsec( )
   {
      return gxTv_SdtCalprd_SDT_Albsec ;
   }

   public void setgxTv_SdtCalprd_SDT_Albsec( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albsec = value ;
   }

   public byte getgxTv_SdtCalprd_SDT_Albenvftp( )
   {
      return gxTv_SdtCalprd_SDT_Albenvftp ;
   }

   public void setgxTv_SdtCalprd_SDT_Albenvftp( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albenvftp = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Alblic( )
   {
      return gxTv_SdtCalprd_SDT_Alblic ;
   }

   public void setgxTv_SdtCalprd_SDT_Alblic( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Alblic = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Albproat( )
   {
      return gxTv_SdtCalprd_SDT_Albproat ;
   }

   public void setgxTv_SdtCalprd_SDT_Albproat( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albproat = value ;
   }

   public java.util.Date getgxTv_SdtCalprd_SDT_Albhhfm( )
   {
      return gxTv_SdtCalprd_SDT_Albhhfm ;
   }

   public void setgxTv_SdtCalprd_SDT_Albhhfm( java.util.Date value )
   {
      gxTv_SdtCalprd_SDT_Albhhfm_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albhhfm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCalprd_SDT_Albgrosst( )
   {
      return gxTv_SdtCalprd_SDT_Albgrosst ;
   }

   public void setgxTv_SdtCalprd_SDT_Albgrosst( java.math.BigDecimal value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albgrosst = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Albtrnnc( )
   {
      return gxTv_SdtCalprd_SDT_Albtrnnc ;
   }

   public void setgxTv_SdtCalprd_SDT_Albtrnnc( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albtrnnc = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Albfmd( )
   {
      return gxTv_SdtCalprd_SDT_Albfmd ;
   }

   public void setgxTv_SdtCalprd_SDT_Albfmd( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albfmd = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Albtrnnm( )
   {
      return gxTv_SdtCalprd_SDT_Albtrnnm ;
   }

   public void setgxTv_SdtCalprd_SDT_Albtrnnm( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albtrnnm = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Albfmdc( )
   {
      return gxTv_SdtCalprd_SDT_Albfmdc ;
   }

   public void setgxTv_SdtCalprd_SDT_Albfmdc( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albfmdc = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Albtrndm( )
   {
      return gxTv_SdtCalprd_SDT_Albtrndm ;
   }

   public void setgxTv_SdtCalprd_SDT_Albtrndm( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albtrndm = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Albmarca( )
   {
      return gxTv_SdtCalprd_SDT_Albmarca ;
   }

   public void setgxTv_SdtCalprd_SDT_Albmarca( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albmarca = value ;
   }

   public byte getgxTv_SdtCalprd_SDT_Alblocdes( )
   {
      return gxTv_SdtCalprd_SDT_Alblocdes ;
   }

   public void setgxTv_SdtCalprd_SDT_Alblocdes( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Alblocdes = value ;
   }

   public byte getgxTv_SdtCalprd_SDT_Albloccar( )
   {
      return gxTv_SdtCalprd_SDT_Albloccar ;
   }

   public void setgxTv_SdtCalprd_SDT_Albloccar( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albloccar = value ;
   }

   public byte getgxTv_SdtCalprd_SDT_Albpobscon( )
   {
      return gxTv_SdtCalprd_SDT_Albpobscon ;
   }

   public void setgxTv_SdtCalprd_SDT_Albpobscon( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albpobscon = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Albivacod( )
   {
      return gxTv_SdtCalprd_SDT_Albivacod ;
   }

   public void setgxTv_SdtCalprd_SDT_Albivacod( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albivacod = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Albcolca( )
   {
      return gxTv_SdtCalprd_SDT_Albcolca ;
   }

   public void setgxTv_SdtCalprd_SDT_Albcolca( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albcolca = value ;
   }

   public int getgxTv_SdtCalprd_SDT_Albdesp( )
   {
      return gxTv_SdtCalprd_SDT_Albdesp ;
   }

   public void setgxTv_SdtCalprd_SDT_Albdesp( int value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albdesp = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCalprd_SDT_Albcambio( )
   {
      return gxTv_SdtCalprd_SDT_Albcambio ;
   }

   public void setgxTv_SdtCalprd_SDT_Albcambio( java.math.BigDecimal value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albcambio = value ;
   }

   public int getgxTv_SdtCalprd_SDT_Albtipdoc( )
   {
      return gxTv_SdtCalprd_SDT_Albtipdoc ;
   }

   public void setgxTv_SdtCalprd_SDT_Albtipdoc( int value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albtipdoc = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Albmottr( )
   {
      return gxTv_SdtCalprd_SDT_Albmottr ;
   }

   public void setgxTv_SdtCalprd_SDT_Albmottr( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albmottr = value ;
   }

   public byte getgxTv_SdtCalprd_SDT_Albtipcal( )
   {
      return gxTv_SdtCalprd_SDT_Albtipcal ;
   }

   public void setgxTv_SdtCalprd_SDT_Albtipcal( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albtipcal = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Albobscb( )
   {
      return gxTv_SdtCalprd_SDT_Albobscb ;
   }

   public void setgxTv_SdtCalprd_SDT_Albobscb( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albobscb = value ;
   }

   public long getgxTv_SdtCalprd_SDT_Albnumt( )
   {
      return gxTv_SdtCalprd_SDT_Albnumt ;
   }

   public void setgxTv_SdtCalprd_SDT_Albnumt( long value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albnumt = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Albmarco( )
   {
      return gxTv_SdtCalprd_SDT_Albmarco ;
   }

   public void setgxTv_SdtCalprd_SDT_Albmarco( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albmarco = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Albocomp( )
   {
      return gxTv_SdtCalprd_SDT_Albocomp ;
   }

   public void setgxTv_SdtCalprd_SDT_Albocomp( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albocomp = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Trnnif( )
   {
      return gxTv_SdtCalprd_SDT_Trnnif ;
   }

   public void setgxTv_SdtCalprd_SDT_Trnnif( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Trnnif = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Albdivtcod( )
   {
      return gxTv_SdtCalprd_SDT_Albdivtcod ;
   }

   public void setgxTv_SdtCalprd_SDT_Albdivtcod( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albdivtcod = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Albdivabr( )
   {
      return gxTv_SdtCalprd_SDT_Albdivabr ;
   }

   public void setgxTv_SdtCalprd_SDT_Albdivabr( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albdivabr = value ;
   }

   public byte getgxTv_SdtCalprd_SDT_Albdivcod( )
   {
      return gxTv_SdtCalprd_SDT_Albdivcod ;
   }

   public void setgxTv_SdtCalprd_SDT_Albdivcod( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albdivcod = value ;
   }

   public byte getgxTv_SdtCalprd_SDT_Busdomenv( )
   {
      return gxTv_SdtCalprd_SDT_Busdomenv ;
   }

   public void setgxTv_SdtCalprd_SDT_Busdomenv( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Busdomenv = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Emprguirem( )
   {
      return gxTv_SdtCalprd_SDT_Emprguirem ;
   }

   public void setgxTv_SdtCalprd_SDT_Emprguirem( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Emprguirem = value ;
   }

   public byte getgxTv_SdtCalprd_SDT_Guiremdom( )
   {
      return gxTv_SdtCalprd_SDT_Guiremdom ;
   }

   public void setgxTv_SdtCalprd_SDT_Guiremdom( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Guiremdom = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Guiremdivt( )
   {
      return gxTv_SdtCalprd_SDT_Guiremdivt ;
   }

   public void setgxTv_SdtCalprd_SDT_Guiremdivt( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Guiremdivt = value ;
   }

   public byte getgxTv_SdtCalprd_SDT_Guiremdiv( )
   {
      return gxTv_SdtCalprd_SDT_Guiremdiv ;
   }

   public void setgxTv_SdtCalprd_SDT_Guiremdiv( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Guiremdiv = value ;
   }

   public String getgxTv_SdtCalprd_SDT_Emprnom( )
   {
      return gxTv_SdtCalprd_SDT_Emprnom ;
   }

   public void setgxTv_SdtCalprd_SDT_Emprnom( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Emprnom = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtCalprd_SDT_Emprcod = "" ;
      gxTv_SdtCalprd_SDT_N = (byte)(1) ;
      gxTv_SdtCalprd_SDT_Albpropri = "" ;
      gxTv_SdtCalprd_SDT_Albprofch = GXutil.nullDate() ;
      gxTv_SdtCalprd_SDT_Albprofch_N = (byte)(1) ;
      gxTv_SdtCalprd_SDT_Albfecsal = GXutil.nullDate() ;
      gxTv_SdtCalprd_SDT_Albfecsal_N = (byte)(1) ;
      gxTv_SdtCalprd_SDT_Albhorsal = "" ;
      gxTv_SdtCalprd_SDT_Albusu = "" ;
      gxTv_SdtCalprd_SDT_Guiremcln = "" ;
      gxTv_SdtCalprd_SDT_Trnnom = "" ;
      gxTv_SdtCalprd_SDT_Albmat = "" ;
      gxTv_SdtCalprd_SDT_Albsec = "" ;
      gxTv_SdtCalprd_SDT_Alblic = "" ;
      gxTv_SdtCalprd_SDT_Albproat = "" ;
      gxTv_SdtCalprd_SDT_Albhhfm = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtCalprd_SDT_Albhhfm_N = (byte)(1) ;
      gxTv_SdtCalprd_SDT_Albgrosst = DecimalUtil.ZERO ;
      gxTv_SdtCalprd_SDT_Albtrnnc = "" ;
      gxTv_SdtCalprd_SDT_Albfmd = "" ;
      gxTv_SdtCalprd_SDT_Albtrnnm = "" ;
      gxTv_SdtCalprd_SDT_Albfmdc = "" ;
      gxTv_SdtCalprd_SDT_Albtrndm = "" ;
      gxTv_SdtCalprd_SDT_Albmarca = "" ;
      gxTv_SdtCalprd_SDT_Albivacod = "" ;
      gxTv_SdtCalprd_SDT_Albcolca = "" ;
      gxTv_SdtCalprd_SDT_Albcambio = DecimalUtil.ZERO ;
      gxTv_SdtCalprd_SDT_Albmottr = "" ;
      gxTv_SdtCalprd_SDT_Albobscb = "" ;
      gxTv_SdtCalprd_SDT_Albmarco = "" ;
      gxTv_SdtCalprd_SDT_Albocomp = "" ;
      gxTv_SdtCalprd_SDT_Trnnif = "" ;
      gxTv_SdtCalprd_SDT_Albdivtcod = "" ;
      gxTv_SdtCalprd_SDT_Albdivabr = "" ;
      gxTv_SdtCalprd_SDT_Emprguirem = "" ;
      gxTv_SdtCalprd_SDT_Guiremdivt = "" ;
      gxTv_SdtCalprd_SDT_Emprnom = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtCalprd_SDT_N ;
   }

   public app.SdtCalprd_SDT Clone( )
   {
      return (app.SdtCalprd_SDT)(clone()) ;
   }

   public void setStruct( app.StructSdtCalprd_SDT struct )
   {
      setgxTv_SdtCalprd_SDT_Emprcod(struct.getEmprcod());
      setgxTv_SdtCalprd_SDT_Albprocod(struct.getAlbprocod());
      setgxTv_SdtCalprd_SDT_Albpropri(struct.getAlbpropri());
      setgxTv_SdtCalprd_SDT_Albproest(struct.getAlbproest());
      if ( struct.gxTv_SdtCalprd_SDT_Albprofch_N == 0 )
      {
         setgxTv_SdtCalprd_SDT_Albprofch(struct.getAlbprofch());
      }
      if ( struct.gxTv_SdtCalprd_SDT_Albfecsal_N == 0 )
      {
         setgxTv_SdtCalprd_SDT_Albfecsal(struct.getAlbfecsal());
      }
      setgxTv_SdtCalprd_SDT_Albhorsal(struct.getAlbhorsal());
      setgxTv_SdtCalprd_SDT_Albusu(struct.getAlbusu());
      setgxTv_SdtCalprd_SDT_Guiremcli(struct.getGuiremcli());
      setgxTv_SdtCalprd_SDT_Guiremcln(struct.getGuiremcln());
      setgxTv_SdtCalprd_SDT_Albclides(struct.getAlbclides());
      setgxTv_SdtCalprd_SDT_Albdomenv(struct.getAlbdomenv());
      setgxTv_SdtCalprd_SDT_Trncod(struct.getTrncod());
      setgxTv_SdtCalprd_SDT_Trnnom(struct.getTrnnom());
      setgxTv_SdtCalprd_SDT_Albmat(struct.getAlbmat());
      setgxTv_SdtCalprd_SDT_Albsec(struct.getAlbsec());
      setgxTv_SdtCalprd_SDT_Albenvftp(struct.getAlbenvftp());
      setgxTv_SdtCalprd_SDT_Alblic(struct.getAlblic());
      setgxTv_SdtCalprd_SDT_Albproat(struct.getAlbproat());
      if ( struct.gxTv_SdtCalprd_SDT_Albhhfm_N == 0 )
      {
         setgxTv_SdtCalprd_SDT_Albhhfm(struct.getAlbhhfm());
      }
      setgxTv_SdtCalprd_SDT_Albgrosst(struct.getAlbgrosst());
      setgxTv_SdtCalprd_SDT_Albtrnnc(struct.getAlbtrnnc());
      setgxTv_SdtCalprd_SDT_Albfmd(struct.getAlbfmd());
      setgxTv_SdtCalprd_SDT_Albtrnnm(struct.getAlbtrnnm());
      setgxTv_SdtCalprd_SDT_Albfmdc(struct.getAlbfmdc());
      setgxTv_SdtCalprd_SDT_Albtrndm(struct.getAlbtrndm());
      setgxTv_SdtCalprd_SDT_Albmarca(struct.getAlbmarca());
      setgxTv_SdtCalprd_SDT_Alblocdes(struct.getAlblocdes());
      setgxTv_SdtCalprd_SDT_Albloccar(struct.getAlbloccar());
      setgxTv_SdtCalprd_SDT_Albpobscon(struct.getAlbpobscon());
      setgxTv_SdtCalprd_SDT_Albivacod(struct.getAlbivacod());
      setgxTv_SdtCalprd_SDT_Albcolca(struct.getAlbcolca());
      setgxTv_SdtCalprd_SDT_Albdesp(struct.getAlbdesp());
      setgxTv_SdtCalprd_SDT_Albcambio(struct.getAlbcambio());
      setgxTv_SdtCalprd_SDT_Albtipdoc(struct.getAlbtipdoc());
      setgxTv_SdtCalprd_SDT_Albmottr(struct.getAlbmottr());
      setgxTv_SdtCalprd_SDT_Albtipcal(struct.getAlbtipcal());
      setgxTv_SdtCalprd_SDT_Albobscb(struct.getAlbobscb());
      setgxTv_SdtCalprd_SDT_Albnumt(struct.getAlbnumt());
      setgxTv_SdtCalprd_SDT_Albmarco(struct.getAlbmarco());
      setgxTv_SdtCalprd_SDT_Albocomp(struct.getAlbocomp());
      setgxTv_SdtCalprd_SDT_Trnnif(struct.getTrnnif());
      setgxTv_SdtCalprd_SDT_Albdivtcod(struct.getAlbdivtcod());
      setgxTv_SdtCalprd_SDT_Albdivabr(struct.getAlbdivabr());
      setgxTv_SdtCalprd_SDT_Albdivcod(struct.getAlbdivcod());
      setgxTv_SdtCalprd_SDT_Busdomenv(struct.getBusdomenv());
      setgxTv_SdtCalprd_SDT_Emprguirem(struct.getEmprguirem());
      setgxTv_SdtCalprd_SDT_Guiremdom(struct.getGuiremdom());
      setgxTv_SdtCalprd_SDT_Guiremdivt(struct.getGuiremdivt());
      setgxTv_SdtCalprd_SDT_Guiremdiv(struct.getGuiremdiv());
      setgxTv_SdtCalprd_SDT_Emprnom(struct.getEmprnom());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtCalprd_SDT getStruct( )
   {
      app.StructSdtCalprd_SDT struct = new app.StructSdtCalprd_SDT ();
      struct.setEmprcod(getgxTv_SdtCalprd_SDT_Emprcod());
      struct.setAlbprocod(getgxTv_SdtCalprd_SDT_Albprocod());
      struct.setAlbpropri(getgxTv_SdtCalprd_SDT_Albpropri());
      struct.setAlbproest(getgxTv_SdtCalprd_SDT_Albproest());
      if ( gxTv_SdtCalprd_SDT_Albprofch_N == 0 )
      {
         struct.setAlbprofch(getgxTv_SdtCalprd_SDT_Albprofch());
      }
      if ( gxTv_SdtCalprd_SDT_Albfecsal_N == 0 )
      {
         struct.setAlbfecsal(getgxTv_SdtCalprd_SDT_Albfecsal());
      }
      struct.setAlbhorsal(getgxTv_SdtCalprd_SDT_Albhorsal());
      struct.setAlbusu(getgxTv_SdtCalprd_SDT_Albusu());
      struct.setGuiremcli(getgxTv_SdtCalprd_SDT_Guiremcli());
      struct.setGuiremcln(getgxTv_SdtCalprd_SDT_Guiremcln());
      struct.setAlbclides(getgxTv_SdtCalprd_SDT_Albclides());
      struct.setAlbdomenv(getgxTv_SdtCalprd_SDT_Albdomenv());
      struct.setTrncod(getgxTv_SdtCalprd_SDT_Trncod());
      struct.setTrnnom(getgxTv_SdtCalprd_SDT_Trnnom());
      struct.setAlbmat(getgxTv_SdtCalprd_SDT_Albmat());
      struct.setAlbsec(getgxTv_SdtCalprd_SDT_Albsec());
      struct.setAlbenvftp(getgxTv_SdtCalprd_SDT_Albenvftp());
      struct.setAlblic(getgxTv_SdtCalprd_SDT_Alblic());
      struct.setAlbproat(getgxTv_SdtCalprd_SDT_Albproat());
      if ( gxTv_SdtCalprd_SDT_Albhhfm_N == 0 )
      {
         struct.setAlbhhfm(getgxTv_SdtCalprd_SDT_Albhhfm());
      }
      struct.setAlbgrosst(getgxTv_SdtCalprd_SDT_Albgrosst());
      struct.setAlbtrnnc(getgxTv_SdtCalprd_SDT_Albtrnnc());
      struct.setAlbfmd(getgxTv_SdtCalprd_SDT_Albfmd());
      struct.setAlbtrnnm(getgxTv_SdtCalprd_SDT_Albtrnnm());
      struct.setAlbfmdc(getgxTv_SdtCalprd_SDT_Albfmdc());
      struct.setAlbtrndm(getgxTv_SdtCalprd_SDT_Albtrndm());
      struct.setAlbmarca(getgxTv_SdtCalprd_SDT_Albmarca());
      struct.setAlblocdes(getgxTv_SdtCalprd_SDT_Alblocdes());
      struct.setAlbloccar(getgxTv_SdtCalprd_SDT_Albloccar());
      struct.setAlbpobscon(getgxTv_SdtCalprd_SDT_Albpobscon());
      struct.setAlbivacod(getgxTv_SdtCalprd_SDT_Albivacod());
      struct.setAlbcolca(getgxTv_SdtCalprd_SDT_Albcolca());
      struct.setAlbdesp(getgxTv_SdtCalprd_SDT_Albdesp());
      struct.setAlbcambio(getgxTv_SdtCalprd_SDT_Albcambio());
      struct.setAlbtipdoc(getgxTv_SdtCalprd_SDT_Albtipdoc());
      struct.setAlbmottr(getgxTv_SdtCalprd_SDT_Albmottr());
      struct.setAlbtipcal(getgxTv_SdtCalprd_SDT_Albtipcal());
      struct.setAlbobscb(getgxTv_SdtCalprd_SDT_Albobscb());
      struct.setAlbnumt(getgxTv_SdtCalprd_SDT_Albnumt());
      struct.setAlbmarco(getgxTv_SdtCalprd_SDT_Albmarco());
      struct.setAlbocomp(getgxTv_SdtCalprd_SDT_Albocomp());
      struct.setTrnnif(getgxTv_SdtCalprd_SDT_Trnnif());
      struct.setAlbdivtcod(getgxTv_SdtCalprd_SDT_Albdivtcod());
      struct.setAlbdivabr(getgxTv_SdtCalprd_SDT_Albdivabr());
      struct.setAlbdivcod(getgxTv_SdtCalprd_SDT_Albdivcod());
      struct.setBusdomenv(getgxTv_SdtCalprd_SDT_Busdomenv());
      struct.setEmprguirem(getgxTv_SdtCalprd_SDT_Emprguirem());
      struct.setGuiremdom(getgxTv_SdtCalprd_SDT_Guiremdom());
      struct.setGuiremdivt(getgxTv_SdtCalprd_SDT_Guiremdivt());
      struct.setGuiremdiv(getgxTv_SdtCalprd_SDT_Guiremdiv());
      struct.setEmprnom(getgxTv_SdtCalprd_SDT_Emprnom());
      return struct ;
   }

   protected byte gxTv_SdtCalprd_SDT_N ;
   protected byte gxTv_SdtCalprd_SDT_Albproest ;
   protected byte gxTv_SdtCalprd_SDT_Albprofch_N ;
   protected byte gxTv_SdtCalprd_SDT_Albfecsal_N ;
   protected byte gxTv_SdtCalprd_SDT_Albdomenv ;
   protected byte gxTv_SdtCalprd_SDT_Albenvftp ;
   protected byte gxTv_SdtCalprd_SDT_Albhhfm_N ;
   protected byte gxTv_SdtCalprd_SDT_Alblocdes ;
   protected byte gxTv_SdtCalprd_SDT_Albloccar ;
   protected byte gxTv_SdtCalprd_SDT_Albpobscon ;
   protected byte gxTv_SdtCalprd_SDT_Albtipcal ;
   protected byte gxTv_SdtCalprd_SDT_Albdivcod ;
   protected byte gxTv_SdtCalprd_SDT_Busdomenv ;
   protected byte gxTv_SdtCalprd_SDT_Guiremdom ;
   protected byte gxTv_SdtCalprd_SDT_Guiremdiv ;
   protected short gxTv_SdtCalprd_SDT_Trncod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtCalprd_SDT_Guiremcli ;
   protected int gxTv_SdtCalprd_SDT_Albclides ;
   protected int gxTv_SdtCalprd_SDT_Albdesp ;
   protected int gxTv_SdtCalprd_SDT_Albtipdoc ;
   protected long gxTv_SdtCalprd_SDT_Albprocod ;
   protected long gxTv_SdtCalprd_SDT_Albnumt ;
   protected java.math.BigDecimal gxTv_SdtCalprd_SDT_Albgrosst ;
   protected java.math.BigDecimal gxTv_SdtCalprd_SDT_Albcambio ;
   protected String gxTv_SdtCalprd_SDT_Emprcod ;
   protected String gxTv_SdtCalprd_SDT_Albpropri ;
   protected String gxTv_SdtCalprd_SDT_Albhorsal ;
   protected String gxTv_SdtCalprd_SDT_Albusu ;
   protected String gxTv_SdtCalprd_SDT_Guiremcln ;
   protected String gxTv_SdtCalprd_SDT_Trnnom ;
   protected String gxTv_SdtCalprd_SDT_Albmat ;
   protected String gxTv_SdtCalprd_SDT_Albsec ;
   protected String gxTv_SdtCalprd_SDT_Alblic ;
   protected String gxTv_SdtCalprd_SDT_Albproat ;
   protected String gxTv_SdtCalprd_SDT_Albtrnnc ;
   protected String gxTv_SdtCalprd_SDT_Albtrnnm ;
   protected String gxTv_SdtCalprd_SDT_Albfmdc ;
   protected String gxTv_SdtCalprd_SDT_Albtrndm ;
   protected String gxTv_SdtCalprd_SDT_Albmarca ;
   protected String gxTv_SdtCalprd_SDT_Albivacod ;
   protected String gxTv_SdtCalprd_SDT_Albcolca ;
   protected String gxTv_SdtCalprd_SDT_Albmottr ;
   protected String gxTv_SdtCalprd_SDT_Albobscb ;
   protected String gxTv_SdtCalprd_SDT_Albmarco ;
   protected String gxTv_SdtCalprd_SDT_Albocomp ;
   protected String gxTv_SdtCalprd_SDT_Trnnif ;
   protected String gxTv_SdtCalprd_SDT_Albdivtcod ;
   protected String gxTv_SdtCalprd_SDT_Albdivabr ;
   protected String gxTv_SdtCalprd_SDT_Emprguirem ;
   protected String gxTv_SdtCalprd_SDT_Guiremdivt ;
   protected String gxTv_SdtCalprd_SDT_Emprnom ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtCalprd_SDT_Albhhfm ;
   protected java.util.Date datetime_STZ ;
   protected java.util.Date gxTv_SdtCalprd_SDT_Albprofch ;
   protected java.util.Date gxTv_SdtCalprd_SDT_Albfecsal ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtCalprd_SDT_Albfmd ;
}

