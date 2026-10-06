package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_Maquina extends GxUserType
{
   public SdtSDT_Maquina( )
   {
      this(  new ModelContext(SdtSDT_Maquina.class));
   }

   public SdtSDT_Maquina( ModelContext context )
   {
      super( context, "SdtSDT_Maquina");
   }

   public SdtSDT_Maquina( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_Maquina");
   }

   public SdtSDT_Maquina( StructSdtSDT_Maquina struct )
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
               gxTv_SdtSDT_Maquina_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCod") )
            {
               gxTv_SdtSDT_Maquina_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtSDT_Maquina_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCap") )
            {
               gxTv_SdtSDT_Maquina_Maqcap = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCosMin") )
            {
               gxTv_SdtSDT_Maquina_Maqcosmin = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqHorPro") )
            {
               gxTv_SdtSDT_Maquina_Maqhorpro = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqMinPro") )
            {
               gxTv_SdtSDT_Maquina_Maqminpro = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqTip") )
            {
               gxTv_SdtSDT_Maquina_Maqtip = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqEst") )
            {
               gxTv_SdtSDT_Maquina_Maqest = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqUltFec") )
            {
               gxTv_SdtSDT_Maquina_Maqultfec = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqResDia") )
            {
               gxTv_SdtSDT_Maquina_Maqresdia = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqHorAsi") )
            {
               gxTv_SdtSDT_Maquina_Maqhorasi = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqOrdSeq") )
            {
               gxTv_SdtSDT_Maquina_Maqordseq = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqUltLin") )
            {
               gxTv_SdtSDT_Maquina_Maqultlin = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipMaqCod") )
            {
               gxTv_SdtSDT_Maquina_Tipmaqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipMaqDsc") )
            {
               gxTv_SdtSDT_Maquina_Tipmaqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqFormul") )
            {
               gxTv_SdtSDT_Maquina_Maqformul = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqKgsMin") )
            {
               gxTv_SdtSDT_Maquina_Maqkgsmin = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqKgsMed") )
            {
               gxTv_SdtSDT_Maquina_Maqkgsmed = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqKgsMax") )
            {
               gxTv_SdtSDT_Maquina_Maqkgsmax = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqPrdMin") )
            {
               gxTv_SdtSDT_Maquina_Maqprdmin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqPrdMed") )
            {
               gxTv_SdtSDT_Maquina_Maqprdmed = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqPrdMax") )
            {
               gxTv_SdtSDT_Maquina_Maqprdmax = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqVolMax") )
            {
               gxTv_SdtSDT_Maquina_Maqvolmax = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqVolMin") )
            {
               gxTv_SdtSDT_Maquina_Maqvolmin = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqVolMed") )
            {
               gxTv_SdtSDT_Maquina_Maqvolmed = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqVolRes") )
            {
               gxTv_SdtSDT_Maquina_Maqvolres = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqVolTop") )
            {
               gxTv_SdtSDT_Maquina_Maqvoltop = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqTemMax") )
            {
               gxTv_SdtSDT_Maquina_Maqtemmax = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqChp") )
            {
               gxTv_SdtSDT_Maquina_Maqchp = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqTinTip") )
            {
               gxTv_SdtSDT_Maquina_Maqtintip = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqMicro") )
            {
               gxTv_SdtSDT_Maquina_Maqmicro = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqNroTub") )
            {
               gxTv_SdtSDT_Maquina_Maqnrotub = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCodBan") )
            {
               gxTv_SdtSDT_Maquina_Maqcodban = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqSalM") )
            {
               gxTv_SdtSDT_Maquina_Maqsalm = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqSalMKi") )
            {
               gxTv_SdtSDT_Maquina_Maqsalmki = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqSalMKf") )
            {
               gxTv_SdtSDT_Maquina_Maqsalmkf = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCantCor") )
            {
               gxTv_SdtSDT_Maquina_Maqcantcor = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqTipCen") )
            {
               gxTv_SdtSDT_Maquina_Maqtipcen = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDosifP") )
            {
               gxTv_SdtSDT_Maquina_Maqdosifp = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDteCol") )
            {
               gxTv_SdtSDT_Maquina_Maqdtecol = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCodFor") )
            {
               gxTv_SdtSDT_Maquina_Maqcodfor = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqFacAbs") )
            {
               gxTv_SdtSDT_Maquina_Maqfacabs = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqKgsId") )
            {
               gxTv_SdtSDT_Maquina_Maqkgsid = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqPln") )
            {
               gxTv_SdtSDT_Maquina_Maqpln = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqPlnVis") )
            {
               gxTv_SdtSDT_Maquina_Maqplnvis = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqConFas") )
            {
               gxTv_SdtSDT_Maquina_Maqconfas = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqVaril") )
            {
               gxTv_SdtSDT_Maquina_Maqvaril = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqTipMaq") )
            {
               gxTv_SdtSDT_Maquina_Maqtipmaq = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqRelBan") )
            {
               gxTv_SdtSDT_Maquina_Maqrelban = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqLoc") )
            {
               gxTv_SdtSDT_Maquina_Maqloc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqObs") )
            {
               gxTv_SdtSDT_Maquina_Maqobs = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqFabsHm") )
            {
               gxTv_SdtSDT_Maquina_Maqfabshm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqHhCon") )
            {
               gxTv_SdtSDT_Maquina_Maqhhcon = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqHhCtr") )
            {
               gxTv_SdtSDT_Maquina_Maqhhctr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqVolBal") )
            {
               gxTv_SdtSDT_Maquina_Maqvolbal = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCosGen") )
            {
               gxTv_SdtSDT_Maquina_Maqcosgen = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqOgtId") )
            {
               gxTv_SdtSDT_Maquina_Maqogtid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqOgtDsc") )
            {
               gxTv_SdtSDT_Maquina_Maqogtdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqMOD") )
            {
               gxTv_SdtSDT_Maquina_Maqmod = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqMOI") )
            {
               gxTv_SdtSDT_Maquina_Maqmoi = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqEnerg") )
            {
               gxTv_SdtSDT_Maquina_Maqenerg = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqGas") )
            {
               gxTv_SdtSDT_Maquina_Maqgas = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqAgua") )
            {
               gxTv_SdtSDT_Maquina_Maqagua = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCosMm") )
            {
               gxTv_SdtSDT_Maquina_Maqcosmm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqTmCarg") )
            {
               gxTv_SdtSDT_Maquina_Maqtmcarg = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqTmDcarg") )
            {
               gxTv_SdtSDT_Maquina_Maqtmdcarg = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqMtsMn") )
            {
               gxTv_SdtSDT_Maquina_Maqmtsmn = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqMtsMx") )
            {
               gxTv_SdtSDT_Maquina_Maqmtsmx = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCosFijo") )
            {
               gxTv_SdtSDT_Maquina_Maqcosfijo = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCosKg") )
            {
               gxTv_SdtSDT_Maquina_Maqcoskg = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCDsc") )
            {
               gxTv_SdtSDT_Maquina_Maqcdsc = oReader.getValue() ;
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
         sName = "SDT_Maquina" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtSDT_Maquina_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCod", gxTv_SdtSDT_Maquina_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtSDT_Maquina_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCap", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqcap, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCosMin", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqcosmin, 10, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqHorPro", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqhorpro, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqMinPro", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqminpro, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqTip", gxTv_SdtSDT_Maquina_Maqtip);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqEst", gxTv_SdtSDT_Maquina_Maqest);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqUltFec", gxTv_SdtSDT_Maquina_Maqultfec);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqResDia", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqresdia, 5, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqHorAsi", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqhorasi, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqOrdSeq", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqordseq, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqUltLin", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqultlin, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipMaqCod", gxTv_SdtSDT_Maquina_Tipmaqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipMaqDsc", gxTv_SdtSDT_Maquina_Tipmaqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqFormul", gxTv_SdtSDT_Maquina_Maqformul);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqKgsMin", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqkgsmin, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqKgsMed", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqkgsmed, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqKgsMax", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqkgsmax, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqPrdMin", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqprdmin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqPrdMed", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqprdmed, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqPrdMax", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqprdmax, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqVolMax", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqvolmax, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqVolMin", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqvolmin, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqVolMed", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqvolmed, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqVolRes", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqvolres, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqVolTop", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqvoltop, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqTemMax", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqtemmax, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqChp", gxTv_SdtSDT_Maquina_Maqchp);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqTinTip", gxTv_SdtSDT_Maquina_Maqtintip);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqMicro", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqmicro, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqNroTub", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqnrotub, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCodBan", gxTv_SdtSDT_Maquina_Maqcodban);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqSalM", gxTv_SdtSDT_Maquina_Maqsalm);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqSalMKi", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqsalmki, 11, 3)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqSalMKf", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqsalmkf, 11, 3)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCantCor", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqcantcor, 11, 3)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqTipCen", gxTv_SdtSDT_Maquina_Maqtipcen);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDosifP", gxTv_SdtSDT_Maquina_Maqdosifp);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDteCol", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqdtecol, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCodFor", gxTv_SdtSDT_Maquina_Maqcodfor);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqFacAbs", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqfacabs, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqKgsId", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqkgsid, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqPln", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqpln, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqPlnVis", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqplnvis, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqConFas", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqconfas, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqVaril", gxTv_SdtSDT_Maquina_Maqvaril);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqTipMaq", gxTv_SdtSDT_Maquina_Maqtipmaq);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqRelBan", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqrelban, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqLoc", gxTv_SdtSDT_Maquina_Maqloc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqObs", gxTv_SdtSDT_Maquina_Maqobs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqFabsHm", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqfabshm, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqHhCon", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqhhcon, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqHhCtr", gxTv_SdtSDT_Maquina_Maqhhctr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqVolBal", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqvolbal, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCosGen", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqcosgen, 8, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqOgtId", gxTv_SdtSDT_Maquina_Maqogtid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqOgtDsc", gxTv_SdtSDT_Maquina_Maqogtdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqMOD", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqmod, 10, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqMOI", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqmoi, 10, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqEnerg", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqenerg, 10, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqGas", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqgas, 10, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqAgua", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqagua, 10, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCosMm", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqcosmm, 10, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqTmCarg", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqtmcarg, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqTmDcarg", GXutil.trim( GXutil.str( gxTv_SdtSDT_Maquina_Maqtmdcarg, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqMtsMn", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqmtsmn, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqMtsMx", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqmtsmx, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCosFijo", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqcosfijo, 10, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCosKg", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_Maquina_Maqcoskg, 10, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCDsc", gxTv_SdtSDT_Maquina_Maqcdsc);
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
      AddObjectProperty("EmprCod", gxTv_SdtSDT_Maquina_Emprcod, false, false);
      AddObjectProperty("MaqCod", gxTv_SdtSDT_Maquina_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtSDT_Maquina_Maqdsc, false, false);
      AddObjectProperty("MaqCap", gxTv_SdtSDT_Maquina_Maqcap, false, false);
      AddObjectProperty("MaqCosMin", gxTv_SdtSDT_Maquina_Maqcosmin, false, false);
      AddObjectProperty("MaqHorPro", gxTv_SdtSDT_Maquina_Maqhorpro, false, false);
      AddObjectProperty("MaqMinPro", gxTv_SdtSDT_Maquina_Maqminpro, false, false);
      AddObjectProperty("MaqTip", gxTv_SdtSDT_Maquina_Maqtip, false, false);
      AddObjectProperty("MaqEst", gxTv_SdtSDT_Maquina_Maqest, false, false);
      AddObjectProperty("MaqUltFec", gxTv_SdtSDT_Maquina_Maqultfec, false, false);
      AddObjectProperty("MaqResDia", gxTv_SdtSDT_Maquina_Maqresdia, false, false);
      AddObjectProperty("MaqHorAsi", gxTv_SdtSDT_Maquina_Maqhorasi, false, false);
      AddObjectProperty("MaqOrdSeq", gxTv_SdtSDT_Maquina_Maqordseq, false, false);
      AddObjectProperty("MaqUltLin", gxTv_SdtSDT_Maquina_Maqultlin, false, false);
      AddObjectProperty("TipMaqCod", gxTv_SdtSDT_Maquina_Tipmaqcod, false, false);
      AddObjectProperty("TipMaqDsc", gxTv_SdtSDT_Maquina_Tipmaqdsc, false, false);
      AddObjectProperty("MaqFormul", gxTv_SdtSDT_Maquina_Maqformul, false, false);
      AddObjectProperty("MaqKgsMin", gxTv_SdtSDT_Maquina_Maqkgsmin, false, false);
      AddObjectProperty("MaqKgsMed", gxTv_SdtSDT_Maquina_Maqkgsmed, false, false);
      AddObjectProperty("MaqKgsMax", gxTv_SdtSDT_Maquina_Maqkgsmax, false, false);
      AddObjectProperty("MaqPrdMin", gxTv_SdtSDT_Maquina_Maqprdmin, false, false);
      AddObjectProperty("MaqPrdMed", gxTv_SdtSDT_Maquina_Maqprdmed, false, false);
      AddObjectProperty("MaqPrdMax", gxTv_SdtSDT_Maquina_Maqprdmax, false, false);
      AddObjectProperty("MaqVolMax", gxTv_SdtSDT_Maquina_Maqvolmax, false, false);
      AddObjectProperty("MaqVolMin", gxTv_SdtSDT_Maquina_Maqvolmin, false, false);
      AddObjectProperty("MaqVolMed", gxTv_SdtSDT_Maquina_Maqvolmed, false, false);
      AddObjectProperty("MaqVolRes", gxTv_SdtSDT_Maquina_Maqvolres, false, false);
      AddObjectProperty("MaqVolTop", gxTv_SdtSDT_Maquina_Maqvoltop, false, false);
      AddObjectProperty("MaqTemMax", gxTv_SdtSDT_Maquina_Maqtemmax, false, false);
      AddObjectProperty("MaqChp", gxTv_SdtSDT_Maquina_Maqchp, false, false);
      AddObjectProperty("MaqTinTip", gxTv_SdtSDT_Maquina_Maqtintip, false, false);
      AddObjectProperty("MaqMicro", gxTv_SdtSDT_Maquina_Maqmicro, false, false);
      AddObjectProperty("MaqNroTub", gxTv_SdtSDT_Maquina_Maqnrotub, false, false);
      AddObjectProperty("MaqCodBan", gxTv_SdtSDT_Maquina_Maqcodban, false, false);
      AddObjectProperty("MaqSalM", gxTv_SdtSDT_Maquina_Maqsalm, false, false);
      AddObjectProperty("MaqSalMKi", gxTv_SdtSDT_Maquina_Maqsalmki, false, false);
      AddObjectProperty("MaqSalMKf", gxTv_SdtSDT_Maquina_Maqsalmkf, false, false);
      AddObjectProperty("MaqCantCor", gxTv_SdtSDT_Maquina_Maqcantcor, false, false);
      AddObjectProperty("MaqTipCen", gxTv_SdtSDT_Maquina_Maqtipcen, false, false);
      AddObjectProperty("MaqDosifP", gxTv_SdtSDT_Maquina_Maqdosifp, false, false);
      AddObjectProperty("MaqDteCol", gxTv_SdtSDT_Maquina_Maqdtecol, false, false);
      AddObjectProperty("MaqCodFor", gxTv_SdtSDT_Maquina_Maqcodfor, false, false);
      AddObjectProperty("MaqFacAbs", gxTv_SdtSDT_Maquina_Maqfacabs, false, false);
      AddObjectProperty("MaqKgsId", gxTv_SdtSDT_Maquina_Maqkgsid, false, false);
      AddObjectProperty("MaqPln", gxTv_SdtSDT_Maquina_Maqpln, false, false);
      AddObjectProperty("MaqPlnVis", gxTv_SdtSDT_Maquina_Maqplnvis, false, false);
      AddObjectProperty("MaqConFas", gxTv_SdtSDT_Maquina_Maqconfas, false, false);
      AddObjectProperty("MaqVaril", gxTv_SdtSDT_Maquina_Maqvaril, false, false);
      AddObjectProperty("MaqTipMaq", gxTv_SdtSDT_Maquina_Maqtipmaq, false, false);
      AddObjectProperty("MaqRelBan", gxTv_SdtSDT_Maquina_Maqrelban, false, false);
      AddObjectProperty("MaqLoc", gxTv_SdtSDT_Maquina_Maqloc, false, false);
      AddObjectProperty("MaqObs", gxTv_SdtSDT_Maquina_Maqobs, false, false);
      AddObjectProperty("MaqFabsHm", gxTv_SdtSDT_Maquina_Maqfabshm, false, false);
      AddObjectProperty("MaqHhCon", gxTv_SdtSDT_Maquina_Maqhhcon, false, false);
      AddObjectProperty("MaqHhCtr", gxTv_SdtSDT_Maquina_Maqhhctr, false, false);
      AddObjectProperty("MaqVolBal", gxTv_SdtSDT_Maquina_Maqvolbal, false, false);
      AddObjectProperty("MaqCosGen", gxTv_SdtSDT_Maquina_Maqcosgen, false, false);
      AddObjectProperty("MaqOgtId", gxTv_SdtSDT_Maquina_Maqogtid, false, false);
      AddObjectProperty("MaqOgtDsc", gxTv_SdtSDT_Maquina_Maqogtdsc, false, false);
      AddObjectProperty("MaqMOD", gxTv_SdtSDT_Maquina_Maqmod, false, false);
      AddObjectProperty("MaqMOI", gxTv_SdtSDT_Maquina_Maqmoi, false, false);
      AddObjectProperty("MaqEnerg", gxTv_SdtSDT_Maquina_Maqenerg, false, false);
      AddObjectProperty("MaqGas", gxTv_SdtSDT_Maquina_Maqgas, false, false);
      AddObjectProperty("MaqAgua", gxTv_SdtSDT_Maquina_Maqagua, false, false);
      AddObjectProperty("MaqCosMm", gxTv_SdtSDT_Maquina_Maqcosmm, false, false);
      AddObjectProperty("MaqTmCarg", gxTv_SdtSDT_Maquina_Maqtmcarg, false, false);
      AddObjectProperty("MaqTmDcarg", gxTv_SdtSDT_Maquina_Maqtmdcarg, false, false);
      AddObjectProperty("MaqMtsMn", gxTv_SdtSDT_Maquina_Maqmtsmn, false, false);
      AddObjectProperty("MaqMtsMx", gxTv_SdtSDT_Maquina_Maqmtsmx, false, false);
      AddObjectProperty("MaqCosFijo", gxTv_SdtSDT_Maquina_Maqcosfijo, false, false);
      AddObjectProperty("MaqCosKg", gxTv_SdtSDT_Maquina_Maqcoskg, false, false);
      AddObjectProperty("MaqCDsc", gxTv_SdtSDT_Maquina_Maqcdsc, false, false);
   }

   public String getgxTv_SdtSDT_Maquina_Emprcod( )
   {
      return gxTv_SdtSDT_Maquina_Emprcod ;
   }

   public void setgxTv_SdtSDT_Maquina_Emprcod( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Emprcod = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqcod( )
   {
      return gxTv_SdtSDT_Maquina_Maqcod ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqcod( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcod = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqdsc( )
   {
      return gxTv_SdtSDT_Maquina_Maqdsc ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqdsc( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqdsc = value ;
   }

   public int getgxTv_SdtSDT_Maquina_Maqcap( )
   {
      return gxTv_SdtSDT_Maquina_Maqcap ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqcap( int value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcap = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqcosmin( )
   {
      return gxTv_SdtSDT_Maquina_Maqcosmin ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqcosmin( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcosmin = value ;
   }

   public byte getgxTv_SdtSDT_Maquina_Maqhorpro( )
   {
      return gxTv_SdtSDT_Maquina_Maqhorpro ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqhorpro( byte value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqhorpro = value ;
   }

   public byte getgxTv_SdtSDT_Maquina_Maqminpro( )
   {
      return gxTv_SdtSDT_Maquina_Maqminpro ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqminpro( byte value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqminpro = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqtip( )
   {
      return gxTv_SdtSDT_Maquina_Maqtip ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqtip( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqtip = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqest( )
   {
      return gxTv_SdtSDT_Maquina_Maqest ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqest( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqest = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqultfec( )
   {
      return gxTv_SdtSDT_Maquina_Maqultfec ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqultfec( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqultfec = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqresdia( )
   {
      return gxTv_SdtSDT_Maquina_Maqresdia ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqresdia( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqresdia = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqhorasi( )
   {
      return gxTv_SdtSDT_Maquina_Maqhorasi ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqhorasi( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqhorasi = value ;
   }

   public short getgxTv_SdtSDT_Maquina_Maqordseq( )
   {
      return gxTv_SdtSDT_Maquina_Maqordseq ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqordseq( short value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqordseq = value ;
   }

   public byte getgxTv_SdtSDT_Maquina_Maqultlin( )
   {
      return gxTv_SdtSDT_Maquina_Maqultlin ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqultlin( byte value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqultlin = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Tipmaqcod( )
   {
      return gxTv_SdtSDT_Maquina_Tipmaqcod ;
   }

   public void setgxTv_SdtSDT_Maquina_Tipmaqcod( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Tipmaqcod = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Tipmaqdsc( )
   {
      return gxTv_SdtSDT_Maquina_Tipmaqdsc ;
   }

   public void setgxTv_SdtSDT_Maquina_Tipmaqdsc( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Tipmaqdsc = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqformul( )
   {
      return gxTv_SdtSDT_Maquina_Maqformul ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqformul( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqformul = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqkgsmin( )
   {
      return gxTv_SdtSDT_Maquina_Maqkgsmin ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqkgsmin( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqkgsmin = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqkgsmed( )
   {
      return gxTv_SdtSDT_Maquina_Maqkgsmed ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqkgsmed( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqkgsmed = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqkgsmax( )
   {
      return gxTv_SdtSDT_Maquina_Maqkgsmax ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqkgsmax( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqkgsmax = value ;
   }

   public short getgxTv_SdtSDT_Maquina_Maqprdmin( )
   {
      return gxTv_SdtSDT_Maquina_Maqprdmin ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqprdmin( short value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqprdmin = value ;
   }

   public short getgxTv_SdtSDT_Maquina_Maqprdmed( )
   {
      return gxTv_SdtSDT_Maquina_Maqprdmed ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqprdmed( short value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqprdmed = value ;
   }

   public short getgxTv_SdtSDT_Maquina_Maqprdmax( )
   {
      return gxTv_SdtSDT_Maquina_Maqprdmax ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqprdmax( short value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqprdmax = value ;
   }

   public int getgxTv_SdtSDT_Maquina_Maqvolmax( )
   {
      return gxTv_SdtSDT_Maquina_Maqvolmax ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqvolmax( int value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqvolmax = value ;
   }

   public int getgxTv_SdtSDT_Maquina_Maqvolmin( )
   {
      return gxTv_SdtSDT_Maquina_Maqvolmin ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqvolmin( int value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqvolmin = value ;
   }

   public int getgxTv_SdtSDT_Maquina_Maqvolmed( )
   {
      return gxTv_SdtSDT_Maquina_Maqvolmed ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqvolmed( int value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqvolmed = value ;
   }

   public int getgxTv_SdtSDT_Maquina_Maqvolres( )
   {
      return gxTv_SdtSDT_Maquina_Maqvolres ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqvolres( int value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqvolres = value ;
   }

   public int getgxTv_SdtSDT_Maquina_Maqvoltop( )
   {
      return gxTv_SdtSDT_Maquina_Maqvoltop ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqvoltop( int value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqvoltop = value ;
   }

   public short getgxTv_SdtSDT_Maquina_Maqtemmax( )
   {
      return gxTv_SdtSDT_Maquina_Maqtemmax ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqtemmax( short value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqtemmax = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqchp( )
   {
      return gxTv_SdtSDT_Maquina_Maqchp ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqchp( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqchp = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqtintip( )
   {
      return gxTv_SdtSDT_Maquina_Maqtintip ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqtintip( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqtintip = value ;
   }

   public byte getgxTv_SdtSDT_Maquina_Maqmicro( )
   {
      return gxTv_SdtSDT_Maquina_Maqmicro ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqmicro( byte value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqmicro = value ;
   }

   public byte getgxTv_SdtSDT_Maquina_Maqnrotub( )
   {
      return gxTv_SdtSDT_Maquina_Maqnrotub ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqnrotub( byte value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqnrotub = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqcodban( )
   {
      return gxTv_SdtSDT_Maquina_Maqcodban ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqcodban( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcodban = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqsalm( )
   {
      return gxTv_SdtSDT_Maquina_Maqsalm ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqsalm( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqsalm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqsalmki( )
   {
      return gxTv_SdtSDT_Maquina_Maqsalmki ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqsalmki( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqsalmki = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqsalmkf( )
   {
      return gxTv_SdtSDT_Maquina_Maqsalmkf ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqsalmkf( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqsalmkf = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqcantcor( )
   {
      return gxTv_SdtSDT_Maquina_Maqcantcor ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqcantcor( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcantcor = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqtipcen( )
   {
      return gxTv_SdtSDT_Maquina_Maqtipcen ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqtipcen( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqtipcen = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqdosifp( )
   {
      return gxTv_SdtSDT_Maquina_Maqdosifp ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqdosifp( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqdosifp = value ;
   }

   public int getgxTv_SdtSDT_Maquina_Maqdtecol( )
   {
      return gxTv_SdtSDT_Maquina_Maqdtecol ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqdtecol( int value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqdtecol = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqcodfor( )
   {
      return gxTv_SdtSDT_Maquina_Maqcodfor ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqcodfor( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcodfor = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqfacabs( )
   {
      return gxTv_SdtSDT_Maquina_Maqfacabs ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqfacabs( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqfacabs = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqkgsid( )
   {
      return gxTv_SdtSDT_Maquina_Maqkgsid ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqkgsid( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqkgsid = value ;
   }

   public byte getgxTv_SdtSDT_Maquina_Maqpln( )
   {
      return gxTv_SdtSDT_Maquina_Maqpln ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqpln( byte value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqpln = value ;
   }

   public byte getgxTv_SdtSDT_Maquina_Maqplnvis( )
   {
      return gxTv_SdtSDT_Maquina_Maqplnvis ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqplnvis( byte value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqplnvis = value ;
   }

   public int getgxTv_SdtSDT_Maquina_Maqconfas( )
   {
      return gxTv_SdtSDT_Maquina_Maqconfas ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqconfas( int value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqconfas = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqvaril( )
   {
      return gxTv_SdtSDT_Maquina_Maqvaril ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqvaril( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqvaril = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqtipmaq( )
   {
      return gxTv_SdtSDT_Maquina_Maqtipmaq ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqtipmaq( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqtipmaq = value ;
   }

   public byte getgxTv_SdtSDT_Maquina_Maqrelban( )
   {
      return gxTv_SdtSDT_Maquina_Maqrelban ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqrelban( byte value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqrelban = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqloc( )
   {
      return gxTv_SdtSDT_Maquina_Maqloc ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqloc( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqloc = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqobs( )
   {
      return gxTv_SdtSDT_Maquina_Maqobs ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqobs( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqobs = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqfabshm( )
   {
      return gxTv_SdtSDT_Maquina_Maqfabshm ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqfabshm( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqfabshm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqhhcon( )
   {
      return gxTv_SdtSDT_Maquina_Maqhhcon ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqhhcon( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqhhcon = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqhhctr( )
   {
      return gxTv_SdtSDT_Maquina_Maqhhctr ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqhhctr( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqhhctr = value ;
   }

   public int getgxTv_SdtSDT_Maquina_Maqvolbal( )
   {
      return gxTv_SdtSDT_Maquina_Maqvolbal ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqvolbal( int value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqvolbal = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqcosgen( )
   {
      return gxTv_SdtSDT_Maquina_Maqcosgen ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqcosgen( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcosgen = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqogtid( )
   {
      return gxTv_SdtSDT_Maquina_Maqogtid ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqogtid( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqogtid = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqogtdsc( )
   {
      return gxTv_SdtSDT_Maquina_Maqogtdsc ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqogtdsc( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqogtdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqmod( )
   {
      return gxTv_SdtSDT_Maquina_Maqmod ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqmod( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqmod = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqmoi( )
   {
      return gxTv_SdtSDT_Maquina_Maqmoi ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqmoi( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqmoi = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqenerg( )
   {
      return gxTv_SdtSDT_Maquina_Maqenerg ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqenerg( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqenerg = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqgas( )
   {
      return gxTv_SdtSDT_Maquina_Maqgas ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqgas( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqgas = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqagua( )
   {
      return gxTv_SdtSDT_Maquina_Maqagua ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqagua( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqagua = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqcosmm( )
   {
      return gxTv_SdtSDT_Maquina_Maqcosmm ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqcosmm( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcosmm = value ;
   }

   public short getgxTv_SdtSDT_Maquina_Maqtmcarg( )
   {
      return gxTv_SdtSDT_Maquina_Maqtmcarg ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqtmcarg( short value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqtmcarg = value ;
   }

   public short getgxTv_SdtSDT_Maquina_Maqtmdcarg( )
   {
      return gxTv_SdtSDT_Maquina_Maqtmdcarg ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqtmdcarg( short value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqtmdcarg = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqmtsmn( )
   {
      return gxTv_SdtSDT_Maquina_Maqmtsmn ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqmtsmn( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqmtsmn = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqmtsmx( )
   {
      return gxTv_SdtSDT_Maquina_Maqmtsmx ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqmtsmx( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqmtsmx = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqcosfijo( )
   {
      return gxTv_SdtSDT_Maquina_Maqcosfijo ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqcosfijo( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcosfijo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_Maquina_Maqcoskg( )
   {
      return gxTv_SdtSDT_Maquina_Maqcoskg ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqcoskg( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcoskg = value ;
   }

   public String getgxTv_SdtSDT_Maquina_Maqcdsc( )
   {
      return gxTv_SdtSDT_Maquina_Maqcdsc ;
   }

   public void setgxTv_SdtSDT_Maquina_Maqcdsc( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcdsc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_Maquina_Emprcod = "" ;
      gxTv_SdtSDT_Maquina_N = (byte)(1) ;
      gxTv_SdtSDT_Maquina_Maqcod = "" ;
      gxTv_SdtSDT_Maquina_Maqdsc = "" ;
      gxTv_SdtSDT_Maquina_Maqcosmin = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqtip = "" ;
      gxTv_SdtSDT_Maquina_Maqest = "" ;
      gxTv_SdtSDT_Maquina_Maqultfec = "" ;
      gxTv_SdtSDT_Maquina_Maqresdia = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqhorasi = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Tipmaqcod = "" ;
      gxTv_SdtSDT_Maquina_Tipmaqdsc = "" ;
      gxTv_SdtSDT_Maquina_Maqformul = "" ;
      gxTv_SdtSDT_Maquina_Maqkgsmin = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqkgsmed = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqkgsmax = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqchp = "" ;
      gxTv_SdtSDT_Maquina_Maqtintip = "" ;
      gxTv_SdtSDT_Maquina_Maqcodban = "" ;
      gxTv_SdtSDT_Maquina_Maqsalm = "" ;
      gxTv_SdtSDT_Maquina_Maqsalmki = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqsalmkf = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqcantcor = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqtipcen = "" ;
      gxTv_SdtSDT_Maquina_Maqdosifp = "" ;
      gxTv_SdtSDT_Maquina_Maqcodfor = "" ;
      gxTv_SdtSDT_Maquina_Maqfacabs = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqkgsid = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqvaril = "" ;
      gxTv_SdtSDT_Maquina_Maqtipmaq = "" ;
      gxTv_SdtSDT_Maquina_Maqloc = "" ;
      gxTv_SdtSDT_Maquina_Maqobs = "" ;
      gxTv_SdtSDT_Maquina_Maqfabshm = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqhhcon = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqhhctr = "" ;
      gxTv_SdtSDT_Maquina_Maqcosgen = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqogtid = "" ;
      gxTv_SdtSDT_Maquina_Maqogtdsc = "" ;
      gxTv_SdtSDT_Maquina_Maqmod = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqmoi = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqenerg = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqgas = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqagua = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqcosmm = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqmtsmn = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqmtsmx = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqcosfijo = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqcoskg = DecimalUtil.ZERO ;
      gxTv_SdtSDT_Maquina_Maqcdsc = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDT_Maquina_N ;
   }

   public app.expedicionesautomatizadas.SdtSDT_Maquina Clone( )
   {
      return (app.expedicionesautomatizadas.SdtSDT_Maquina)(clone()) ;
   }

   public void setStruct( app.expedicionesautomatizadas.StructSdtSDT_Maquina struct )
   {
      setgxTv_SdtSDT_Maquina_Emprcod(struct.getEmprcod());
      setgxTv_SdtSDT_Maquina_Maqcod(struct.getMaqcod());
      setgxTv_SdtSDT_Maquina_Maqdsc(struct.getMaqdsc());
      setgxTv_SdtSDT_Maquina_Maqcap(struct.getMaqcap());
      setgxTv_SdtSDT_Maquina_Maqcosmin(struct.getMaqcosmin());
      setgxTv_SdtSDT_Maquina_Maqhorpro(struct.getMaqhorpro());
      setgxTv_SdtSDT_Maquina_Maqminpro(struct.getMaqminpro());
      setgxTv_SdtSDT_Maquina_Maqtip(struct.getMaqtip());
      setgxTv_SdtSDT_Maquina_Maqest(struct.getMaqest());
      setgxTv_SdtSDT_Maquina_Maqultfec(struct.getMaqultfec());
      setgxTv_SdtSDT_Maquina_Maqresdia(struct.getMaqresdia());
      setgxTv_SdtSDT_Maquina_Maqhorasi(struct.getMaqhorasi());
      setgxTv_SdtSDT_Maquina_Maqordseq(struct.getMaqordseq());
      setgxTv_SdtSDT_Maquina_Maqultlin(struct.getMaqultlin());
      setgxTv_SdtSDT_Maquina_Tipmaqcod(struct.getTipmaqcod());
      setgxTv_SdtSDT_Maquina_Tipmaqdsc(struct.getTipmaqdsc());
      setgxTv_SdtSDT_Maquina_Maqformul(struct.getMaqformul());
      setgxTv_SdtSDT_Maquina_Maqkgsmin(struct.getMaqkgsmin());
      setgxTv_SdtSDT_Maquina_Maqkgsmed(struct.getMaqkgsmed());
      setgxTv_SdtSDT_Maquina_Maqkgsmax(struct.getMaqkgsmax());
      setgxTv_SdtSDT_Maquina_Maqprdmin(struct.getMaqprdmin());
      setgxTv_SdtSDT_Maquina_Maqprdmed(struct.getMaqprdmed());
      setgxTv_SdtSDT_Maquina_Maqprdmax(struct.getMaqprdmax());
      setgxTv_SdtSDT_Maquina_Maqvolmax(struct.getMaqvolmax());
      setgxTv_SdtSDT_Maquina_Maqvolmin(struct.getMaqvolmin());
      setgxTv_SdtSDT_Maquina_Maqvolmed(struct.getMaqvolmed());
      setgxTv_SdtSDT_Maquina_Maqvolres(struct.getMaqvolres());
      setgxTv_SdtSDT_Maquina_Maqvoltop(struct.getMaqvoltop());
      setgxTv_SdtSDT_Maquina_Maqtemmax(struct.getMaqtemmax());
      setgxTv_SdtSDT_Maquina_Maqchp(struct.getMaqchp());
      setgxTv_SdtSDT_Maquina_Maqtintip(struct.getMaqtintip());
      setgxTv_SdtSDT_Maquina_Maqmicro(struct.getMaqmicro());
      setgxTv_SdtSDT_Maquina_Maqnrotub(struct.getMaqnrotub());
      setgxTv_SdtSDT_Maquina_Maqcodban(struct.getMaqcodban());
      setgxTv_SdtSDT_Maquina_Maqsalm(struct.getMaqsalm());
      setgxTv_SdtSDT_Maquina_Maqsalmki(struct.getMaqsalmki());
      setgxTv_SdtSDT_Maquina_Maqsalmkf(struct.getMaqsalmkf());
      setgxTv_SdtSDT_Maquina_Maqcantcor(struct.getMaqcantcor());
      setgxTv_SdtSDT_Maquina_Maqtipcen(struct.getMaqtipcen());
      setgxTv_SdtSDT_Maquina_Maqdosifp(struct.getMaqdosifp());
      setgxTv_SdtSDT_Maquina_Maqdtecol(struct.getMaqdtecol());
      setgxTv_SdtSDT_Maquina_Maqcodfor(struct.getMaqcodfor());
      setgxTv_SdtSDT_Maquina_Maqfacabs(struct.getMaqfacabs());
      setgxTv_SdtSDT_Maquina_Maqkgsid(struct.getMaqkgsid());
      setgxTv_SdtSDT_Maquina_Maqpln(struct.getMaqpln());
      setgxTv_SdtSDT_Maquina_Maqplnvis(struct.getMaqplnvis());
      setgxTv_SdtSDT_Maquina_Maqconfas(struct.getMaqconfas());
      setgxTv_SdtSDT_Maquina_Maqvaril(struct.getMaqvaril());
      setgxTv_SdtSDT_Maquina_Maqtipmaq(struct.getMaqtipmaq());
      setgxTv_SdtSDT_Maquina_Maqrelban(struct.getMaqrelban());
      setgxTv_SdtSDT_Maquina_Maqloc(struct.getMaqloc());
      setgxTv_SdtSDT_Maquina_Maqobs(struct.getMaqobs());
      setgxTv_SdtSDT_Maquina_Maqfabshm(struct.getMaqfabshm());
      setgxTv_SdtSDT_Maquina_Maqhhcon(struct.getMaqhhcon());
      setgxTv_SdtSDT_Maquina_Maqhhctr(struct.getMaqhhctr());
      setgxTv_SdtSDT_Maquina_Maqvolbal(struct.getMaqvolbal());
      setgxTv_SdtSDT_Maquina_Maqcosgen(struct.getMaqcosgen());
      setgxTv_SdtSDT_Maquina_Maqogtid(struct.getMaqogtid());
      setgxTv_SdtSDT_Maquina_Maqogtdsc(struct.getMaqogtdsc());
      setgxTv_SdtSDT_Maquina_Maqmod(struct.getMaqmod());
      setgxTv_SdtSDT_Maquina_Maqmoi(struct.getMaqmoi());
      setgxTv_SdtSDT_Maquina_Maqenerg(struct.getMaqenerg());
      setgxTv_SdtSDT_Maquina_Maqgas(struct.getMaqgas());
      setgxTv_SdtSDT_Maquina_Maqagua(struct.getMaqagua());
      setgxTv_SdtSDT_Maquina_Maqcosmm(struct.getMaqcosmm());
      setgxTv_SdtSDT_Maquina_Maqtmcarg(struct.getMaqtmcarg());
      setgxTv_SdtSDT_Maquina_Maqtmdcarg(struct.getMaqtmdcarg());
      setgxTv_SdtSDT_Maquina_Maqmtsmn(struct.getMaqmtsmn());
      setgxTv_SdtSDT_Maquina_Maqmtsmx(struct.getMaqmtsmx());
      setgxTv_SdtSDT_Maquina_Maqcosfijo(struct.getMaqcosfijo());
      setgxTv_SdtSDT_Maquina_Maqcoskg(struct.getMaqcoskg());
      setgxTv_SdtSDT_Maquina_Maqcdsc(struct.getMaqcdsc());
   }

   @SuppressWarnings("unchecked")
   public app.expedicionesautomatizadas.StructSdtSDT_Maquina getStruct( )
   {
      app.expedicionesautomatizadas.StructSdtSDT_Maquina struct = new app.expedicionesautomatizadas.StructSdtSDT_Maquina ();
      struct.setEmprcod(getgxTv_SdtSDT_Maquina_Emprcod());
      struct.setMaqcod(getgxTv_SdtSDT_Maquina_Maqcod());
      struct.setMaqdsc(getgxTv_SdtSDT_Maquina_Maqdsc());
      struct.setMaqcap(getgxTv_SdtSDT_Maquina_Maqcap());
      struct.setMaqcosmin(getgxTv_SdtSDT_Maquina_Maqcosmin());
      struct.setMaqhorpro(getgxTv_SdtSDT_Maquina_Maqhorpro());
      struct.setMaqminpro(getgxTv_SdtSDT_Maquina_Maqminpro());
      struct.setMaqtip(getgxTv_SdtSDT_Maquina_Maqtip());
      struct.setMaqest(getgxTv_SdtSDT_Maquina_Maqest());
      struct.setMaqultfec(getgxTv_SdtSDT_Maquina_Maqultfec());
      struct.setMaqresdia(getgxTv_SdtSDT_Maquina_Maqresdia());
      struct.setMaqhorasi(getgxTv_SdtSDT_Maquina_Maqhorasi());
      struct.setMaqordseq(getgxTv_SdtSDT_Maquina_Maqordseq());
      struct.setMaqultlin(getgxTv_SdtSDT_Maquina_Maqultlin());
      struct.setTipmaqcod(getgxTv_SdtSDT_Maquina_Tipmaqcod());
      struct.setTipmaqdsc(getgxTv_SdtSDT_Maquina_Tipmaqdsc());
      struct.setMaqformul(getgxTv_SdtSDT_Maquina_Maqformul());
      struct.setMaqkgsmin(getgxTv_SdtSDT_Maquina_Maqkgsmin());
      struct.setMaqkgsmed(getgxTv_SdtSDT_Maquina_Maqkgsmed());
      struct.setMaqkgsmax(getgxTv_SdtSDT_Maquina_Maqkgsmax());
      struct.setMaqprdmin(getgxTv_SdtSDT_Maquina_Maqprdmin());
      struct.setMaqprdmed(getgxTv_SdtSDT_Maquina_Maqprdmed());
      struct.setMaqprdmax(getgxTv_SdtSDT_Maquina_Maqprdmax());
      struct.setMaqvolmax(getgxTv_SdtSDT_Maquina_Maqvolmax());
      struct.setMaqvolmin(getgxTv_SdtSDT_Maquina_Maqvolmin());
      struct.setMaqvolmed(getgxTv_SdtSDT_Maquina_Maqvolmed());
      struct.setMaqvolres(getgxTv_SdtSDT_Maquina_Maqvolres());
      struct.setMaqvoltop(getgxTv_SdtSDT_Maquina_Maqvoltop());
      struct.setMaqtemmax(getgxTv_SdtSDT_Maquina_Maqtemmax());
      struct.setMaqchp(getgxTv_SdtSDT_Maquina_Maqchp());
      struct.setMaqtintip(getgxTv_SdtSDT_Maquina_Maqtintip());
      struct.setMaqmicro(getgxTv_SdtSDT_Maquina_Maqmicro());
      struct.setMaqnrotub(getgxTv_SdtSDT_Maquina_Maqnrotub());
      struct.setMaqcodban(getgxTv_SdtSDT_Maquina_Maqcodban());
      struct.setMaqsalm(getgxTv_SdtSDT_Maquina_Maqsalm());
      struct.setMaqsalmki(getgxTv_SdtSDT_Maquina_Maqsalmki());
      struct.setMaqsalmkf(getgxTv_SdtSDT_Maquina_Maqsalmkf());
      struct.setMaqcantcor(getgxTv_SdtSDT_Maquina_Maqcantcor());
      struct.setMaqtipcen(getgxTv_SdtSDT_Maquina_Maqtipcen());
      struct.setMaqdosifp(getgxTv_SdtSDT_Maquina_Maqdosifp());
      struct.setMaqdtecol(getgxTv_SdtSDT_Maquina_Maqdtecol());
      struct.setMaqcodfor(getgxTv_SdtSDT_Maquina_Maqcodfor());
      struct.setMaqfacabs(getgxTv_SdtSDT_Maquina_Maqfacabs());
      struct.setMaqkgsid(getgxTv_SdtSDT_Maquina_Maqkgsid());
      struct.setMaqpln(getgxTv_SdtSDT_Maquina_Maqpln());
      struct.setMaqplnvis(getgxTv_SdtSDT_Maquina_Maqplnvis());
      struct.setMaqconfas(getgxTv_SdtSDT_Maquina_Maqconfas());
      struct.setMaqvaril(getgxTv_SdtSDT_Maquina_Maqvaril());
      struct.setMaqtipmaq(getgxTv_SdtSDT_Maquina_Maqtipmaq());
      struct.setMaqrelban(getgxTv_SdtSDT_Maquina_Maqrelban());
      struct.setMaqloc(getgxTv_SdtSDT_Maquina_Maqloc());
      struct.setMaqobs(getgxTv_SdtSDT_Maquina_Maqobs());
      struct.setMaqfabshm(getgxTv_SdtSDT_Maquina_Maqfabshm());
      struct.setMaqhhcon(getgxTv_SdtSDT_Maquina_Maqhhcon());
      struct.setMaqhhctr(getgxTv_SdtSDT_Maquina_Maqhhctr());
      struct.setMaqvolbal(getgxTv_SdtSDT_Maquina_Maqvolbal());
      struct.setMaqcosgen(getgxTv_SdtSDT_Maquina_Maqcosgen());
      struct.setMaqogtid(getgxTv_SdtSDT_Maquina_Maqogtid());
      struct.setMaqogtdsc(getgxTv_SdtSDT_Maquina_Maqogtdsc());
      struct.setMaqmod(getgxTv_SdtSDT_Maquina_Maqmod());
      struct.setMaqmoi(getgxTv_SdtSDT_Maquina_Maqmoi());
      struct.setMaqenerg(getgxTv_SdtSDT_Maquina_Maqenerg());
      struct.setMaqgas(getgxTv_SdtSDT_Maquina_Maqgas());
      struct.setMaqagua(getgxTv_SdtSDT_Maquina_Maqagua());
      struct.setMaqcosmm(getgxTv_SdtSDT_Maquina_Maqcosmm());
      struct.setMaqtmcarg(getgxTv_SdtSDT_Maquina_Maqtmcarg());
      struct.setMaqtmdcarg(getgxTv_SdtSDT_Maquina_Maqtmdcarg());
      struct.setMaqmtsmn(getgxTv_SdtSDT_Maquina_Maqmtsmn());
      struct.setMaqmtsmx(getgxTv_SdtSDT_Maquina_Maqmtsmx());
      struct.setMaqcosfijo(getgxTv_SdtSDT_Maquina_Maqcosfijo());
      struct.setMaqcoskg(getgxTv_SdtSDT_Maquina_Maqcoskg());
      struct.setMaqcdsc(getgxTv_SdtSDT_Maquina_Maqcdsc());
      return struct ;
   }

   protected byte gxTv_SdtSDT_Maquina_N ;
   protected byte gxTv_SdtSDT_Maquina_Maqhorpro ;
   protected byte gxTv_SdtSDT_Maquina_Maqminpro ;
   protected byte gxTv_SdtSDT_Maquina_Maqultlin ;
   protected byte gxTv_SdtSDT_Maquina_Maqmicro ;
   protected byte gxTv_SdtSDT_Maquina_Maqnrotub ;
   protected byte gxTv_SdtSDT_Maquina_Maqpln ;
   protected byte gxTv_SdtSDT_Maquina_Maqplnvis ;
   protected byte gxTv_SdtSDT_Maquina_Maqrelban ;
   protected short gxTv_SdtSDT_Maquina_Maqordseq ;
   protected short gxTv_SdtSDT_Maquina_Maqprdmin ;
   protected short gxTv_SdtSDT_Maquina_Maqprdmed ;
   protected short gxTv_SdtSDT_Maquina_Maqprdmax ;
   protected short gxTv_SdtSDT_Maquina_Maqtemmax ;
   protected short gxTv_SdtSDT_Maquina_Maqtmcarg ;
   protected short gxTv_SdtSDT_Maquina_Maqtmdcarg ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDT_Maquina_Maqcap ;
   protected int gxTv_SdtSDT_Maquina_Maqvolmax ;
   protected int gxTv_SdtSDT_Maquina_Maqvolmin ;
   protected int gxTv_SdtSDT_Maquina_Maqvolmed ;
   protected int gxTv_SdtSDT_Maquina_Maqvolres ;
   protected int gxTv_SdtSDT_Maquina_Maqvoltop ;
   protected int gxTv_SdtSDT_Maquina_Maqdtecol ;
   protected int gxTv_SdtSDT_Maquina_Maqconfas ;
   protected int gxTv_SdtSDT_Maquina_Maqvolbal ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqcosmin ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqresdia ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqhorasi ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqkgsmin ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqkgsmed ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqkgsmax ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqsalmki ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqsalmkf ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqcantcor ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqfacabs ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqkgsid ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqfabshm ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqhhcon ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqcosgen ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqmod ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqmoi ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqenerg ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqgas ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqagua ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqcosmm ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqmtsmn ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqmtsmx ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqcosfijo ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqcoskg ;
   protected String gxTv_SdtSDT_Maquina_Emprcod ;
   protected String gxTv_SdtSDT_Maquina_Maqcod ;
   protected String gxTv_SdtSDT_Maquina_Maqdsc ;
   protected String gxTv_SdtSDT_Maquina_Maqtip ;
   protected String gxTv_SdtSDT_Maquina_Maqest ;
   protected String gxTv_SdtSDT_Maquina_Maqultfec ;
   protected String gxTv_SdtSDT_Maquina_Tipmaqcod ;
   protected String gxTv_SdtSDT_Maquina_Tipmaqdsc ;
   protected String gxTv_SdtSDT_Maquina_Maqformul ;
   protected String gxTv_SdtSDT_Maquina_Maqchp ;
   protected String gxTv_SdtSDT_Maquina_Maqtintip ;
   protected String gxTv_SdtSDT_Maquina_Maqcodban ;
   protected String gxTv_SdtSDT_Maquina_Maqsalm ;
   protected String gxTv_SdtSDT_Maquina_Maqtipcen ;
   protected String gxTv_SdtSDT_Maquina_Maqdosifp ;
   protected String gxTv_SdtSDT_Maquina_Maqcodfor ;
   protected String gxTv_SdtSDT_Maquina_Maqvaril ;
   protected String gxTv_SdtSDT_Maquina_Maqtipmaq ;
   protected String gxTv_SdtSDT_Maquina_Maqloc ;
   protected String gxTv_SdtSDT_Maquina_Maqhhctr ;
   protected String gxTv_SdtSDT_Maquina_Maqogtid ;
   protected String gxTv_SdtSDT_Maquina_Maqogtdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDT_Maquina_Maqobs ;
   protected String gxTv_SdtSDT_Maquina_Maqcdsc ;
}

