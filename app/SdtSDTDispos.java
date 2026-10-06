package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTDispos extends GxUserType
{
   public SdtSDTDispos( )
   {
      this(  new ModelContext(SdtSDTDispos.class));
   }

   public SdtSDTDispos( ModelContext context )
   {
      super( context, "SdtSDTDispos");
   }

   public SdtSDTDispos( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTDispos");
   }

   public SdtSDTDispos( StructSdtSDTDispos struct )
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
               gxTv_SdtSDTDispos_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisCod") )
            {
               gxTv_SdtSDTDispos_Discod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisDes") )
            {
               gxTv_SdtSDTDispos_Disdes = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtCod") )
            {
               gxTv_SdtSDTDispos_Disartcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNumPie") )
            {
               gxTv_SdtSDTDispos_Disnumpie = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNumUni") )
            {
               gxTv_SdtSDTDispos_Disnumuni = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisUniMed") )
            {
               gxTv_SdtSDTDispos_Disunimed = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPes") )
            {
               gxTv_SdtSDTDispos_Disartpes = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PriCod") )
            {
               gxTv_SdtSDTDispos_Pricod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisCliNum") )
            {
               gxTv_SdtSDTDispos_Disclinum = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFecCli") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTDispos_Disfeccli = GXutil.nullDate() ;
                  gxTv_SdtSDTDispos_Disfeccli_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTDispos_Disfeccli_N = (byte)(0) ;
                  gxTv_SdtSDTDispos_Disfeccli = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTDispos_Disfec = GXutil.nullDate() ;
                  gxTv_SdtSDTDispos_Disfec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTDispos_Disfec_N = (byte)(0) ;
                  gxTv_SdtSDTDispos_Disfec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFecEnt") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTDispos_Disfecent = GXutil.nullDate() ;
                  gxTv_SdtSDTDispos_Disfecent_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTDispos_Disfecent_N = (byte)(0) ;
                  gxTv_SdtSDTDispos_Disfecent = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisColNom") )
            {
               gxTv_SdtSDTDispos_Discolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisColNum") )
            {
               gxTv_SdtSDTDispos_Discolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisTipCol") )
            {
               gxTv_SdtSDTDispos_Distipcol = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtDsc") )
            {
               gxTv_SdtSDTDispos_Disartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPiePie") )
            {
               gxTv_SdtSDTDispos_Dispiepie = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPieKgm") )
            {
               gxTv_SdtSDTDispos_Dispiekgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPieMtr") )
            {
               gxTv_SdtSDTDispos_Dispiemtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisDefCon") )
            {
               gxTv_SdtSDTDispos_Disdefcon = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPieNor") )
            {
               gxTv_SdtSDTDispos_Dispienor = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SumPor") )
            {
               gxTv_SdtSDTDispos_Sumpor = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisEnt") )
            {
               gxTv_SdtSDTDispos_Disent = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisObsULin") )
            {
               gxTv_SdtSDTDispos_Disobsulin = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtMat") )
            {
               gxTv_SdtSDTDispos_Disartmat = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtLar") )
            {
               gxTv_SdtSDTDispos_Disartlar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtSua") )
            {
               gxTv_SdtSDTDispos_Disartsua = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtAca") )
            {
               gxTv_SdtSDTDispos_Disartaca = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPle") )
            {
               gxTv_SdtSDTDispos_Disartple = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtTip") )
            {
               gxTv_SdtSDTDispos_Disarttip = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtEnc") )
            {
               gxTv_SdtSDTDispos_Disartenc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtCor") )
            {
               gxTv_SdtSDTDispos_Disartcor = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtOpe") )
            {
               gxTv_SdtSDTDispos_Disartope = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtTr1") )
            {
               gxTv_SdtSDTDispos_Disarttr1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPt1") )
            {
               gxTv_SdtSDTDispos_Disartpt1 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtTr2") )
            {
               gxTv_SdtSDTDispos_Disarttr2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPt2") )
            {
               gxTv_SdtSDTDispos_Disartpt2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtTr3") )
            {
               gxTv_SdtSDTDispos_Disarttr3 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPt3") )
            {
               gxTv_SdtSDTDispos_Disartpt3 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtRdt") )
            {
               gxTv_SdtSDTDispos_Disartrdt = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtUrg") )
            {
               gxTv_SdtSDTDispos_Disarturg = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtUr1") )
            {
               gxTv_SdtSDTDispos_Disartur1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPu1") )
            {
               gxTv_SdtSDTDispos_Disartpu1 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtUr2") )
            {
               gxTv_SdtSDTDispos_Disartur2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPu2") )
            {
               gxTv_SdtSDTDispos_Disartpu2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtUr3") )
            {
               gxTv_SdtSDTDispos_Disartur3 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtPu3") )
            {
               gxTv_SdtSDTDispos_Disartpu3 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtAnh") )
            {
               gxTv_SdtSDTDispos_Disartanh = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisEst") )
            {
               gxTv_SdtSDTDispos_Disest = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPreKgm") )
            {
               gxTv_SdtSDTDispos_Disprekgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPreMtr") )
            {
               gxTv_SdtSDTDispos_Dispremtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPieLan") )
            {
               gxTv_SdtSDTDispos_Dispielan = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisKgmLan") )
            {
               gxTv_SdtSDTDispos_Diskgmlan = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisMtrLan") )
            {
               gxTv_SdtSDTDispos_Dismtrlan = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCodDis") )
            {
               gxTv_SdtSDTDispos_Emprcoddis = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCodDis") )
            {
               gxTv_SdtSDTDispos_Clicoddis = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FindCol") )
            {
               gxTv_SdtSDTDispos_Findcol = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPie") )
            {
               gxTv_SdtSDTDispos_Dispie = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisUni") )
            {
               gxTv_SdtSDTDispos_Disuni = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNMtr") )
            {
               gxTv_SdtSDTDispos_Disnmtr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNMez") )
            {
               gxTv_SdtSDTDispos_Disnmez = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FindInt") )
            {
               gxTv_SdtSDTDispos_Findint = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FindTon") )
            {
               gxTv_SdtSDTDispos_Findton = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNumTen") )
            {
               gxTv_SdtSDTDispos_Disnumten = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCodDis") )
            {
               gxTv_SdtSDTDispos_Maqcoddis = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PartCod") )
            {
               gxTv_SdtSDTDispos_Partcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtSDTDispos_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipConCod") )
            {
               gxTv_SdtSDTDispos_Tipconcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipConNom") )
            {
               gxTv_SdtSDTDispos_Tipconnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNomCli") )
            {
               gxTv_SdtSDTDispos_Disnomcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNumCli") )
            {
               gxTv_SdtSDTDispos_Disnumcli = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisEncCom") )
            {
               gxTv_SdtSDTDispos_Disenccom = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisEncAnh") )
            {
               gxTv_SdtSDTDispos_Disencanh = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisGraCru") )
            {
               gxTv_SdtSDTDispos_Disgracru = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtAn1") )
            {
               gxTv_SdtSDTDispos_Disartan1 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtAcb") )
            {
               gxTv_SdtSDTDispos_Disartacb = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtAc2") )
            {
               gxTv_SdtSDTDispos_Disartac2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisLoc") )
            {
               gxTv_SdtSDTDispos_Disloc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPart") )
            {
               gxTv_SdtSDTDispos_Dispart = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisGraAca") )
            {
               gxTv_SdtSDTDispos_Disgraaca = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisRdoN") )
            {
               gxTv_SdtSDTDispos_Disrdon = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisRdoA") )
            {
               gxTv_SdtSDTDispos_Disrdoa = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisRes") )
            {
               gxTv_SdtSDTDispos_Disres = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisTipDis") )
            {
               gxTv_SdtSDTDispos_Distipdis = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNumBas") )
            {
               gxTv_SdtSDTDispos_Disnumbas = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisCliDes") )
            {
               gxTv_SdtSDTDispos_Disclides = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisManCod") )
            {
               gxTv_SdtSDTDispos_Dismancod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisOpeAnt") )
            {
               gxTv_SdtSDTDispos_Disopeant = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisCodTex") )
            {
               gxTv_SdtSDTDispos_Discodtex = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNumTex1") )
            {
               gxTv_SdtSDTDispos_Disnumtex1 = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNumTex2") )
            {
               gxTv_SdtSDTDispos_Disnumtex2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNumLot") )
            {
               gxTv_SdtSDTDispos_Disnumlot = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisKgsLot") )
            {
               gxTv_SdtSDTDispos_Diskgslot = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisMtrLot") )
            {
               gxTv_SdtSDTDispos_Dismtrlot = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPla") )
            {
               gxTv_SdtSDTDispos_Displa = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPle2") )
            {
               gxTv_SdtSDTDispos_Disple2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNumCor") )
            {
               gxTv_SdtSDTDispos_Disnumcor = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisAncSal1") )
            {
               gxTv_SdtSDTDispos_Disancsal1 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisAncSal2") )
            {
               gxTv_SdtSDTDispos_Disancsal2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisAncSal3") )
            {
               gxTv_SdtSDTDispos_Disancsal3 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisGraAca2") )
            {
               gxTv_SdtSDTDispos_Disgraaca2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisGraCru2") )
            {
               gxTv_SdtSDTDispos_Disgracru2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFac") )
            {
               gxTv_SdtSDTDispos_Disfac = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisManCod1") )
            {
               gxTv_SdtSDTDispos_Dismancod1 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisManCod2") )
            {
               gxTv_SdtSDTDispos_Dismancod2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNumTon") )
            {
               gxTv_SdtSDTDispos_Disnumton = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNumAlb") )
            {
               gxTv_SdtSDTDispos_Disnumalb = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisRefTMt") )
            {
               gxTv_SdtSDTDispos_Disreftmt = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisRefTKg") )
            {
               gxTv_SdtSDTDispos_Disreftkg = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisRefTPz") )
            {
               gxTv_SdtSDTDispos_Disreftpz = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFecLan") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTDispos_Disfeclan = GXutil.nullDate() ;
                  gxTv_SdtSDTDispos_Disfeclan_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTDispos_Disfeclan_N = (byte)(0) ;
                  gxTv_SdtSDTDispos_Disfeclan = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RetCod") )
            {
               gxTv_SdtSDTDispos_Retcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtMer") )
            {
               gxTv_SdtSDTDispos_Disartmer = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmpesCod") )
            {
               gxTv_SdtSDTDispos_Empescod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DibCli") )
            {
               gxTv_SdtSDTDispos_Dibcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DibInt") )
            {
               gxTv_SdtSDTDispos_Dibint = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisDibNum") )
            {
               gxTv_SdtSDTDispos_Disdibnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNumCol") )
            {
               gxTv_SdtSDTDispos_Disnumcol = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisObs") )
            {
               gxTv_SdtSDTDispos_Disobs = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotNPie") )
            {
               gxTv_SdtSDTDispos_Totnpie = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotNUni") )
            {
               gxTv_SdtSDTDispos_Totnuni = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisComULin") )
            {
               gxTv_SdtSDTDispos_Discomulin = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisEnv") )
            {
               gxTv_SdtSDTDispos_Disenv = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisTin") )
            {
               gxTv_SdtSDTDispos_Distin = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNPzas") )
            {
               gxTv_SdtSDTDispos_Disnpzas = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNPzasL") )
            {
               gxTv_SdtSDTDispos_Disnpzasl = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisUsrCod") )
            {
               gxTv_SdtSDTDispos_Disusrcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPelAnh") )
            {
               gxTv_SdtSDTDispos_Dispelanh = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisCruMts") )
            {
               gxTv_SdtSDTDispos_Discrumts = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisCruKgs") )
            {
               gxTv_SdtSDTDispos_Discrukgs = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisCruEnr") )
            {
               gxTv_SdtSDTDispos_Discruenr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisLotMts") )
            {
               gxTv_SdtSDTDispos_Dislotmts = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisLotKgs") )
            {
               gxTv_SdtSDTDispos_Dislotkgs = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisAcaBak") )
            {
               gxTv_SdtSDTDispos_Disacabak = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisAcaAnh") )
            {
               gxTv_SdtSDTDispos_Disacaanh = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisAcaMar") )
            {
               gxTv_SdtSDTDispos_Disacamar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisMdlCod") )
            {
               gxTv_SdtSDTDispos_Dismdlcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisTam") )
            {
               gxTv_SdtSDTDispos_Distam = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisHorEnt") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTDispos_Dishorent = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSDTDispos_Dishorent_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTDispos_Dishorent_N = (byte)(0) ;
                  gxTv_SdtSDTDispos_Dishorent = GXutil.resetDate(localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), "."))))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisHorReg") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTDispos_Dishorreg = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSDTDispos_Dishorreg_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTDispos_Dishorreg_N = (byte)(0) ;
                  gxTv_SdtSDTDispos_Dishorreg = GXutil.resetDate(localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), "."))))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisDishCod") )
            {
               gxTv_SdtSDTDispos_Disdishcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNroCor") )
            {
               gxTv_SdtSDTDispos_Disnrocor = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisEncCli") )
            {
               gxTv_SdtSDTDispos_Disenccli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DibColDib") )
            {
               gxTv_SdtSDTDispos_Dibcoldib = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisTipEst") )
            {
               gxTv_SdtSDTDispos_Distipest = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisGraCob") )
            {
               gxTv_SdtSDTDispos_Disgracob = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisCom") )
            {
               gxTv_SdtSDTDispos_Discom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisEstTip") )
            {
               gxTv_SdtSDTDispos_Disesttip = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPiePdM") )
            {
               gxTv_SdtSDTDispos_Dispiepdm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPiePdK") )
            {
               gxTv_SdtSDTDispos_Dispiepdk = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPiePdP") )
            {
               gxTv_SdtSDTDispos_Dispiepdp = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisAcc") )
            {
               gxTv_SdtSDTDispos_Disacc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisTipCor") )
            {
               gxTv_SdtSDTDispos_Distipcor = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisObsGrm") )
            {
               gxTv_SdtSDTDispos_Disobsgrm = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisObsAnc") )
            {
               gxTv_SdtSDTDispos_Disobsanc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisAntp") )
            {
               gxTv_SdtSDTDispos_Disantp = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisAntpT") )
            {
               gxTv_SdtSDTDispos_Disantpt = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisVolMaq") )
            {
               gxTv_SdtSDTDispos_Disvolmaq = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisRbMaq") )
            {
               gxTv_SdtSDTDispos_Disrbmaq = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisDto") )
            {
               gxTv_SdtSDTDispos_Disdto = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFacSep") )
            {
               gxTv_SdtSDTDispos_Disfacsep = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFacGra") )
            {
               gxTv_SdtSDTDispos_Disfacgra = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisOrdSep") )
            {
               gxTv_SdtSDTDispos_Disordsep = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisOrdGra") )
            {
               gxTv_SdtSDTDispos_Disordgra = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisDesCol") )
            {
               gxTv_SdtSDTDispos_Disdescol = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisGraTam") )
            {
               gxTv_SdtSDTDispos_Disgratam = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisRec") )
            {
               gxTv_SdtSDTDispos_Disrec = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisMaqEst") )
            {
               gxTv_SdtSDTDispos_Dismaqest = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisExp") )
            {
               gxTv_SdtSDTDispos_Disexp = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFEnt") )
            {
               gxTv_SdtSDTDispos_Disfent = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisDest") )
            {
               gxTv_SdtSDTDispos_Disdest = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFchT") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTDispos_Disfcht = GXutil.nullDate() ;
                  gxTv_SdtSDTDispos_Disfcht_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTDispos_Disfcht_N = (byte)(0) ;
                  gxTv_SdtSDTDispos_Disfcht = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tb1_Dscf") )
            {
               gxTv_SdtSDTDispos_Tb1_dscf = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisItem1") )
            {
               gxTv_SdtSDTDispos_Disitem1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisItem2") )
            {
               gxTv_SdtSDTDispos_Disitem2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisItem3") )
            {
               gxTv_SdtSDTDispos_Disitem3 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisItem4") )
            {
               gxTv_SdtSDTDispos_Disitem4 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisItem5") )
            {
               gxTv_SdtSDTDispos_Disitem5 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisItem6") )
            {
               gxTv_SdtSDTDispos_Disitem6 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cod_Idtx") )
            {
               gxTv_SdtSDTDispos_Cod_idtx = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisFecPed") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTDispos_Disfecped = GXutil.nullDate() ;
                  gxTv_SdtSDTDispos_Disfecped_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTDispos_Disfecped_N = (byte)(0) ;
                  gxTv_SdtSDTDispos_Disfecped = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisLotPza") )
            {
               gxTv_SdtSDTDispos_Dislotpza = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisLotMaq") )
            {
               gxTv_SdtSDTDispos_Dislotmaq = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisAcaFor") )
            {
               gxTv_SdtSDTDispos_Disacafor = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DibColCol") )
            {
               gxTv_SdtSDTDispos_Dibcolcol = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisDibCoCN") )
            {
               gxTv_SdtSDTDispos_Disdibcocn = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DibColColN") )
            {
               gxTv_SdtSDTDispos_Dibcolcoln = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisDibCoDN") )
            {
               gxTv_SdtSDTDispos_Disdibcodn = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisUltNot") )
            {
               gxTv_SdtSDTDispos_Disultnot = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisParCod") )
            {
               gxTv_SdtSDTDispos_Disparcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisParReo") )
            {
               gxTv_SdtSDTDispos_Disparreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisParPar") )
            {
               gxTv_SdtSDTDispos_Disparpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisMemo1") )
            {
               gxTv_SdtSDTDispos_Dismemo1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisMemo2") )
            {
               gxTv_SdtSDTDispos_Dismemo2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MarcaId") )
            {
               gxTv_SdtSDTDispos_Marcaid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisOrdComp") )
            {
               gxTv_SdtSDTDispos_Disordcomp = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisCnoEncO") )
            {
               gxTv_SdtSDTDispos_Discnoenco = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nxt_modelo") )
            {
               gxTv_SdtSDTDispos_Nxt_modelo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CpteId") )
            {
               gxTv_SdtSDTDispos_Cpteid = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nxt_statio") )
            {
               gxTv_SdtSDTDispos_Nxt_statio = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DesaID") )
            {
               gxTv_SdtSDTDispos_Desaid = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DptoID") )
            {
               gxTv_SdtSDTDispos_Dptoid = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nxt_artcli") )
            {
               gxTv_SdtSDTDispos_Nxt_artcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisArtTipD") )
            {
               gxTv_SdtSDTDispos_Disarttipd = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisTipCD") )
            {
               gxTv_SdtSDTDispos_Distipcd = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RevenID") )
            {
               gxTv_SdtSDTDispos_Revenid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisPriorid") )
            {
               gxTv_SdtSDTDispos_Dispriorid = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisTpEstam") )
            {
               gxTv_SdtSDTDispos_Distpestam = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisProdID") )
            {
               gxTv_SdtSDTDispos_Disprodid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisProdDs") )
            {
               gxTv_SdtSDTDispos_Disprodds = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisOEKOTEX") )
            {
               gxTv_SdtSDTDispos_Disoekotex = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisLineaID") )
            {
               gxTv_SdtSDTDispos_Dislineaid = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisCanalID") )
            {
               gxTv_SdtSDTDispos_Discanalid = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisLinPrd") )
            {
               gxTv_SdtSDTDispos_Dislinprd = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisDGUltli") )
            {
               gxTv_SdtSDTDispos_Disdgultli = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisDGSumMts") )
            {
               gxTv_SdtSDTDispos_Disdgsummts = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisDGSumPzs") )
            {
               gxTv_SdtSDTDispos_Disdgsumpzs = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisRGB") )
            {
               gxTv_SdtSDTDispos_Disrgb = (long)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDTDispos" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtSDTDispos_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisCod", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Discod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisDes", gxTv_SdtSDTDispos_Disdes);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtCod", gxTv_SdtSDTDispos_Disartcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNumPie", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disnumpie, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNumUni", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Disnumuni, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisUniMed", gxTv_SdtSDTDispos_Disunimed);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtPes", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disartpes, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PriCod", gxTv_SdtSDTDispos_Pricod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisCliNum", gxTv_SdtSDTDispos_Disclinum);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTDispos_Disfeccli)) && ( gxTv_SdtSDTDispos_Disfeccli_N == 1 ) )
      {
         oWriter.writeElement("DisFecCli", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDispos_Disfeccli), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDispos_Disfeccli), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDispos_Disfeccli), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("DisFecCli", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTDispos_Disfec)) && ( gxTv_SdtSDTDispos_Disfec_N == 1 ) )
      {
         oWriter.writeElement("DisFec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDispos_Disfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDispos_Disfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDispos_Disfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("DisFec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTDispos_Disfecent)) && ( gxTv_SdtSDTDispos_Disfecent_N == 1 ) )
      {
         oWriter.writeElement("DisFecEnt", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDispos_Disfecent), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDispos_Disfecent), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDispos_Disfecent), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("DisFecEnt", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("DisColNom", gxTv_SdtSDTDispos_Discolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisColNum", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Discolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisTipCol", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Distipcol, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtDsc", gxTv_SdtSDTDispos_Disartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPiePie", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Dispiepie, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPieKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Dispiekgm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPieMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Dispiemtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisDefCon", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disdefcon, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPieNor", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Dispienor, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SumPor", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Sumpor, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisEnt", gxTv_SdtSDTDispos_Disent);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisObsULin", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disobsulin, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtMat", gxTv_SdtSDTDispos_Disartmat);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtLar", gxTv_SdtSDTDispos_Disartlar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtSua", gxTv_SdtSDTDispos_Disartsua);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtAca", gxTv_SdtSDTDispos_Disartaca);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtPle", gxTv_SdtSDTDispos_Disartple);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtTip", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disarttip, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtEnc", gxTv_SdtSDTDispos_Disartenc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtCor", gxTv_SdtSDTDispos_Disartcor);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtOpe", gxTv_SdtSDTDispos_Disartope);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtTr1", gxTv_SdtSDTDispos_Disarttr1);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtPt1", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disartpt1, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtTr2", gxTv_SdtSDTDispos_Disarttr2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtPt2", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disartpt2, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtTr3", gxTv_SdtSDTDispos_Disarttr3);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtPt3", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disartpt3, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtRdt", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Disartrdt, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtUrg", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disarturg, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtUr1", gxTv_SdtSDTDispos_Disartur1);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtPu1", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disartpu1, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtUr2", gxTv_SdtSDTDispos_Disartur2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtPu2", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disartpu2, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtUr3", gxTv_SdtSDTDispos_Disartur3);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtPu3", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disartpu3, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtAnh", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disartanh, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisEst", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disest, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPreKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Disprekgm, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPreMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Dispremtr, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPieLan", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Dispielan, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisKgmLan", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Diskgmlan, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisMtrLan", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Dismtrlan, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprCodDis", gxTv_SdtSDTDispos_Emprcoddis);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliCodDis", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Clicoddis, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FindCol", gxTv_SdtSDTDispos_Findcol);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPie", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Dispie, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisUni", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Disuni, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNMtr", gxTv_SdtSDTDispos_Disnmtr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNMez", gxTv_SdtSDTDispos_Disnmez);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FindInt", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Findint, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FindTon", gxTv_SdtSDTDispos_Findton);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNumTen", gxTv_SdtSDTDispos_Disnumten);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCodDis", gxTv_SdtSDTDispos_Maqcoddis);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PartCod", gxTv_SdtSDTDispos_Partcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipConCod", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Tipconcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipConNom", gxTv_SdtSDTDispos_Tipconnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNomCli", gxTv_SdtSDTDispos_Disnomcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNumCli", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disnumcli, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisEncCom", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Disenccom, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisEncAnh", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Disencanh, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisGraCru", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disgracru, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtAn1", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disartan1, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtAcb", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disartacb, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtAc2", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disartac2, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisLoc", gxTv_SdtSDTDispos_Disloc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPart", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Dispart, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisGraAca", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disgraaca, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisRdoN", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Disrdon, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisRdoA", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Disrdoa, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisRes", gxTv_SdtSDTDispos_Disres);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisTipDis", gxTv_SdtSDTDispos_Distipdis);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNumBas", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disnumbas, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisCliDes", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disclides, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisManCod", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Dismancod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisOpeAnt", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disopeant, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisCodTex", gxTv_SdtSDTDispos_Discodtex);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNumTex1", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disnumtex1, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNumTex2", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disnumtex2, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNumLot", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disnumlot, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisKgsLot", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Diskgslot, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisMtrLot", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Dismtrlot, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPla", gxTv_SdtSDTDispos_Displa);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPle2", gxTv_SdtSDTDispos_Disple2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNumCor", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disnumcor, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisAncSal1", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disancsal1, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisAncSal2", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disancsal2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisAncSal3", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disancsal3, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisGraAca2", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disgraaca2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisGraCru2", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disgracru2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisFac", gxTv_SdtSDTDispos_Disfac);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisManCod1", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Dismancod1, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisManCod2", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Dismancod2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNumTon", gxTv_SdtSDTDispos_Disnumton);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNumAlb", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disnumalb, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisRefTMt", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Disreftmt, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisRefTKg", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Disreftkg, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisRefTPz", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disreftpz, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTDispos_Disfeclan)) && ( gxTv_SdtSDTDispos_Disfeclan_N == 1 ) )
      {
         oWriter.writeElement("DisFecLan", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDispos_Disfeclan), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDispos_Disfeclan), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDispos_Disfeclan), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("DisFecLan", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("RetCod", gxTv_SdtSDTDispos_Retcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtMer", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Disartmer, 5, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmpesCod", gxTv_SdtSDTDispos_Empescod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DibCli", gxTv_SdtSDTDispos_Dibcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DibInt", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Dibint, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisDibNum", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disdibnum, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNumCol", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disnumcol, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisObs", gxTv_SdtSDTDispos_Disobs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotNPie", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Totnpie, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotNUni", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Totnuni, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisComULin", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Discomulin, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisEnv", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disenv, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisTin", gxTv_SdtSDTDispos_Distin);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNPzas", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disnpzas, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNPzasL", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disnpzasl, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisUsrCod", gxTv_SdtSDTDispos_Disusrcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPelAnh", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Dispelanh, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisCruMts", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Discrumts, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisCruKgs", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Discrukgs, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisCruEnr", gxTv_SdtSDTDispos_Discruenr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisLotMts", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Dislotmts, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisLotKgs", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Dislotkgs, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisAcaBak", gxTv_SdtSDTDispos_Disacabak);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisAcaAnh", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disacaanh, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisAcaMar", gxTv_SdtSDTDispos_Disacamar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisMdlCod", gxTv_SdtSDTDispos_Dismdlcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisTam", gxTv_SdtSDTDispos_Distam);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTDispos_Dishorent) && ( gxTv_SdtSDTDispos_Dishorent_N == 1 ) )
      {
         oWriter.writeElement("DisHorEnt", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDispos_Dishorent), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDispos_Dishorent), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDispos_Dishorent), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTDispos_Dishorent), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTDispos_Dishorent), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTDispos_Dishorent), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("DisHorEnt", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTDispos_Dishorreg) && ( gxTv_SdtSDTDispos_Dishorreg_N == 1 ) )
      {
         oWriter.writeElement("DisHorReg", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDispos_Dishorreg), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDispos_Dishorreg), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDispos_Dishorreg), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTDispos_Dishorreg), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTDispos_Dishorreg), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTDispos_Dishorreg), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("DisHorReg", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("DisDishCod", gxTv_SdtSDTDispos_Disdishcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNroCor", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disnrocor, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisEncCli", gxTv_SdtSDTDispos_Disenccli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DibColDib", gxTv_SdtSDTDispos_Dibcoldib);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisTipEst", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Distipest, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisGraCob", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disgracob, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisCom", gxTv_SdtSDTDispos_Discom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisEstTip", gxTv_SdtSDTDispos_Disesttip);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPiePdM", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Dispiepdm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPiePdK", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Dispiepdk, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPiePdP", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Dispiepdp, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisAcc", gxTv_SdtSDTDispos_Disacc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisTipCor", gxTv_SdtSDTDispos_Distipcor);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisObsGrm", gxTv_SdtSDTDispos_Disobsgrm);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisObsAnc", gxTv_SdtSDTDispos_Disobsanc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisAntp", gxTv_SdtSDTDispos_Disantp);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisAntpT", gxTv_SdtSDTDispos_Disantpt);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisVolMaq", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disvolmaq, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisRbMaq", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Disrbmaq, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisDto", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Disdto, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisFacSep", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disfacsep, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisFacGra", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disfacgra, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisOrdSep", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disordsep, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisOrdGra", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disordgra, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisDesCol", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disdescol, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisGraTam", gxTv_SdtSDTDispos_Disgratam);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisRec", gxTv_SdtSDTDispos_Disrec);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisMaqEst", gxTv_SdtSDTDispos_Dismaqest);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisExp", gxTv_SdtSDTDispos_Disexp);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisFEnt", gxTv_SdtSDTDispos_Disfent);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisDest", gxTv_SdtSDTDispos_Disdest);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTDispos_Disfcht)) && ( gxTv_SdtSDTDispos_Disfcht_N == 1 ) )
      {
         oWriter.writeElement("DisFchT", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDispos_Disfcht), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDispos_Disfcht), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDispos_Disfcht), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("DisFchT", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Tb1_Dscf", gxTv_SdtSDTDispos_Tb1_dscf);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisItem1", gxTv_SdtSDTDispos_Disitem1);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisItem2", gxTv_SdtSDTDispos_Disitem2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisItem3", gxTv_SdtSDTDispos_Disitem3);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisItem4", gxTv_SdtSDTDispos_Disitem4);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisItem5", gxTv_SdtSDTDispos_Disitem5);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisItem6", gxTv_SdtSDTDispos_Disitem6);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cod_Idtx", gxTv_SdtSDTDispos_Cod_idtx);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTDispos_Disfecped)) && ( gxTv_SdtSDTDispos_Disfecped_N == 1 ) )
      {
         oWriter.writeElement("DisFecPed", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDispos_Disfecped), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDispos_Disfecped), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDispos_Disfecped), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("DisFecPed", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("DisLotPza", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Dislotpza, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisLotMaq", gxTv_SdtSDTDispos_Dislotmaq);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisAcaFor", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disacafor, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DibColCol", gxTv_SdtSDTDispos_Dibcolcol);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisDibCoCN", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disdibcocn, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DibColColN", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Dibcolcoln, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisDibCoDN", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disdibcodn, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisUltNot", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disultnot, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisParCod", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disparcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisParReo", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disparreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisParPar", gxTv_SdtSDTDispos_Disparpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisMemo1", gxTv_SdtSDTDispos_Dismemo1);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisMemo2", gxTv_SdtSDTDispos_Dismemo2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MarcaId", gxTv_SdtSDTDispos_Marcaid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisOrdComp", gxTv_SdtSDTDispos_Disordcomp);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisCnoEncO", gxTv_SdtSDTDispos_Discnoenco);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Nxt_modelo", gxTv_SdtSDTDispos_Nxt_modelo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CpteId", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Cpteid, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Nxt_statio", gxTv_SdtSDTDispos_Nxt_statio);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DesaID", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Desaid, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DptoID", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Dptoid, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Nxt_artcli", gxTv_SdtSDTDispos_Nxt_artcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisArtTipD", gxTv_SdtSDTDispos_Disarttipd);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisTipCD", gxTv_SdtSDTDispos_Distipcd);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RevenID", gxTv_SdtSDTDispos_Revenid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisPriorid", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Dispriorid, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisTpEstam", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Distpestam, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisProdID", gxTv_SdtSDTDispos_Disprodid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisProdDs", gxTv_SdtSDTDispos_Disprodds);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisOEKOTEX", gxTv_SdtSDTDispos_Disoekotex);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisLineaID", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Dislineaid, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisCanalID", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Discanalid, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisLinPrd", gxTv_SdtSDTDispos_Dislinprd);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisDGUltli", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disdgultli, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisDGSumMts", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDispos_Disdgsummts, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisDGSumPzs", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disdgsumpzs, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisRGB", GXutil.trim( GXutil.str( gxTv_SdtSDTDispos_Disrgb, 10, 0)));
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
      AddObjectProperty("EmprCod", gxTv_SdtSDTDispos_Emprcod, false, false);
      AddObjectProperty("DisCod", gxTv_SdtSDTDispos_Discod, false, false);
      AddObjectProperty("DisDes", gxTv_SdtSDTDispos_Disdes, false, false);
      AddObjectProperty("DisArtCod", gxTv_SdtSDTDispos_Disartcod, false, false);
      AddObjectProperty("DisNumPie", gxTv_SdtSDTDispos_Disnumpie, false, false);
      AddObjectProperty("DisNumUni", gxTv_SdtSDTDispos_Disnumuni, false, false);
      AddObjectProperty("DisUniMed", gxTv_SdtSDTDispos_Disunimed, false, false);
      AddObjectProperty("DisArtPes", gxTv_SdtSDTDispos_Disartpes, false, false);
      AddObjectProperty("PriCod", gxTv_SdtSDTDispos_Pricod, false, false);
      AddObjectProperty("DisCliNum", gxTv_SdtSDTDispos_Disclinum, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDispos_Disfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDispos_Disfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDispos_Disfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("DisFecCli", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDispos_Disfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDispos_Disfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDispos_Disfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("DisFec", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDispos_Disfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDispos_Disfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDispos_Disfecent), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("DisFecEnt", sDateCnv, false, false);
      AddObjectProperty("DisColNom", gxTv_SdtSDTDispos_Discolnom, false, false);
      AddObjectProperty("DisColNum", gxTv_SdtSDTDispos_Discolnum, false, false);
      AddObjectProperty("DisTipCol", gxTv_SdtSDTDispos_Distipcol, false, false);
      AddObjectProperty("DisArtDsc", gxTv_SdtSDTDispos_Disartdsc, false, false);
      AddObjectProperty("DisPiePie", gxTv_SdtSDTDispos_Dispiepie, false, false);
      AddObjectProperty("DisPieKgm", gxTv_SdtSDTDispos_Dispiekgm, false, false);
      AddObjectProperty("DisPieMtr", gxTv_SdtSDTDispos_Dispiemtr, false, false);
      AddObjectProperty("DisDefCon", gxTv_SdtSDTDispos_Disdefcon, false, false);
      AddObjectProperty("DisPieNor", gxTv_SdtSDTDispos_Dispienor, false, false);
      AddObjectProperty("SumPor", gxTv_SdtSDTDispos_Sumpor, false, false);
      AddObjectProperty("DisEnt", gxTv_SdtSDTDispos_Disent, false, false);
      AddObjectProperty("DisObsULin", gxTv_SdtSDTDispos_Disobsulin, false, false);
      AddObjectProperty("DisArtMat", gxTv_SdtSDTDispos_Disartmat, false, false);
      AddObjectProperty("DisArtLar", gxTv_SdtSDTDispos_Disartlar, false, false);
      AddObjectProperty("DisArtSua", gxTv_SdtSDTDispos_Disartsua, false, false);
      AddObjectProperty("DisArtAca", gxTv_SdtSDTDispos_Disartaca, false, false);
      AddObjectProperty("DisArtPle", gxTv_SdtSDTDispos_Disartple, false, false);
      AddObjectProperty("DisArtTip", gxTv_SdtSDTDispos_Disarttip, false, false);
      AddObjectProperty("DisArtEnc", gxTv_SdtSDTDispos_Disartenc, false, false);
      AddObjectProperty("DisArtCor", gxTv_SdtSDTDispos_Disartcor, false, false);
      AddObjectProperty("DisArtOpe", gxTv_SdtSDTDispos_Disartope, false, false);
      AddObjectProperty("DisArtTr1", gxTv_SdtSDTDispos_Disarttr1, false, false);
      AddObjectProperty("DisArtPt1", gxTv_SdtSDTDispos_Disartpt1, false, false);
      AddObjectProperty("DisArtTr2", gxTv_SdtSDTDispos_Disarttr2, false, false);
      AddObjectProperty("DisArtPt2", gxTv_SdtSDTDispos_Disartpt2, false, false);
      AddObjectProperty("DisArtTr3", gxTv_SdtSDTDispos_Disarttr3, false, false);
      AddObjectProperty("DisArtPt3", gxTv_SdtSDTDispos_Disartpt3, false, false);
      AddObjectProperty("DisArtRdt", gxTv_SdtSDTDispos_Disartrdt, false, false);
      AddObjectProperty("DisArtUrg", gxTv_SdtSDTDispos_Disarturg, false, false);
      AddObjectProperty("DisArtUr1", gxTv_SdtSDTDispos_Disartur1, false, false);
      AddObjectProperty("DisArtPu1", gxTv_SdtSDTDispos_Disartpu1, false, false);
      AddObjectProperty("DisArtUr2", gxTv_SdtSDTDispos_Disartur2, false, false);
      AddObjectProperty("DisArtPu2", gxTv_SdtSDTDispos_Disartpu2, false, false);
      AddObjectProperty("DisArtUr3", gxTv_SdtSDTDispos_Disartur3, false, false);
      AddObjectProperty("DisArtPu3", gxTv_SdtSDTDispos_Disartpu3, false, false);
      AddObjectProperty("DisArtAnh", gxTv_SdtSDTDispos_Disartanh, false, false);
      AddObjectProperty("DisEst", gxTv_SdtSDTDispos_Disest, false, false);
      AddObjectProperty("DisPreKgm", gxTv_SdtSDTDispos_Disprekgm, false, false);
      AddObjectProperty("DisPreMtr", gxTv_SdtSDTDispos_Dispremtr, false, false);
      AddObjectProperty("DisPieLan", gxTv_SdtSDTDispos_Dispielan, false, false);
      AddObjectProperty("DisKgmLan", gxTv_SdtSDTDispos_Diskgmlan, false, false);
      AddObjectProperty("DisMtrLan", gxTv_SdtSDTDispos_Dismtrlan, false, false);
      AddObjectProperty("EmprCodDis", gxTv_SdtSDTDispos_Emprcoddis, false, false);
      AddObjectProperty("CliCodDis", gxTv_SdtSDTDispos_Clicoddis, false, false);
      AddObjectProperty("FindCol", gxTv_SdtSDTDispos_Findcol, false, false);
      AddObjectProperty("DisPie", gxTv_SdtSDTDispos_Dispie, false, false);
      AddObjectProperty("DisUni", gxTv_SdtSDTDispos_Disuni, false, false);
      AddObjectProperty("DisNMtr", gxTv_SdtSDTDispos_Disnmtr, false, false);
      AddObjectProperty("DisNMez", gxTv_SdtSDTDispos_Disnmez, false, false);
      AddObjectProperty("FindInt", gxTv_SdtSDTDispos_Findint, false, false);
      AddObjectProperty("FindTon", gxTv_SdtSDTDispos_Findton, false, false);
      AddObjectProperty("DisNumTen", gxTv_SdtSDTDispos_Disnumten, false, false);
      AddObjectProperty("MaqCodDis", gxTv_SdtSDTDispos_Maqcoddis, false, false);
      AddObjectProperty("PartCod", gxTv_SdtSDTDispos_Partcod, false, false);
      AddObjectProperty("CliCod", gxTv_SdtSDTDispos_Clicod, false, false);
      AddObjectProperty("TipConCod", gxTv_SdtSDTDispos_Tipconcod, false, false);
      AddObjectProperty("TipConNom", gxTv_SdtSDTDispos_Tipconnom, false, false);
      AddObjectProperty("DisNomCli", gxTv_SdtSDTDispos_Disnomcli, false, false);
      AddObjectProperty("DisNumCli", gxTv_SdtSDTDispos_Disnumcli, false, false);
      AddObjectProperty("DisEncCom", gxTv_SdtSDTDispos_Disenccom, false, false);
      AddObjectProperty("DisEncAnh", gxTv_SdtSDTDispos_Disencanh, false, false);
      AddObjectProperty("DisGraCru", gxTv_SdtSDTDispos_Disgracru, false, false);
      AddObjectProperty("DisArtAn1", gxTv_SdtSDTDispos_Disartan1, false, false);
      AddObjectProperty("DisArtAcb", gxTv_SdtSDTDispos_Disartacb, false, false);
      AddObjectProperty("DisArtAc2", gxTv_SdtSDTDispos_Disartac2, false, false);
      AddObjectProperty("DisLoc", gxTv_SdtSDTDispos_Disloc, false, false);
      AddObjectProperty("DisPart", gxTv_SdtSDTDispos_Dispart, false, false);
      AddObjectProperty("DisGraAca", gxTv_SdtSDTDispos_Disgraaca, false, false);
      AddObjectProperty("DisRdoN", gxTv_SdtSDTDispos_Disrdon, false, false);
      AddObjectProperty("DisRdoA", gxTv_SdtSDTDispos_Disrdoa, false, false);
      AddObjectProperty("DisRes", gxTv_SdtSDTDispos_Disres, false, false);
      AddObjectProperty("DisTipDis", gxTv_SdtSDTDispos_Distipdis, false, false);
      AddObjectProperty("DisNumBas", gxTv_SdtSDTDispos_Disnumbas, false, false);
      AddObjectProperty("DisCliDes", gxTv_SdtSDTDispos_Disclides, false, false);
      AddObjectProperty("DisManCod", gxTv_SdtSDTDispos_Dismancod, false, false);
      AddObjectProperty("DisOpeAnt", gxTv_SdtSDTDispos_Disopeant, false, false);
      AddObjectProperty("DisCodTex", gxTv_SdtSDTDispos_Discodtex, false, false);
      AddObjectProperty("DisNumTex1", gxTv_SdtSDTDispos_Disnumtex1, false, false);
      AddObjectProperty("DisNumTex2", gxTv_SdtSDTDispos_Disnumtex2, false, false);
      AddObjectProperty("DisNumLot", gxTv_SdtSDTDispos_Disnumlot, false, false);
      AddObjectProperty("DisKgsLot", gxTv_SdtSDTDispos_Diskgslot, false, false);
      AddObjectProperty("DisMtrLot", gxTv_SdtSDTDispos_Dismtrlot, false, false);
      AddObjectProperty("DisPla", gxTv_SdtSDTDispos_Displa, false, false);
      AddObjectProperty("DisPle2", gxTv_SdtSDTDispos_Disple2, false, false);
      AddObjectProperty("DisNumCor", gxTv_SdtSDTDispos_Disnumcor, false, false);
      AddObjectProperty("DisAncSal1", gxTv_SdtSDTDispos_Disancsal1, false, false);
      AddObjectProperty("DisAncSal2", gxTv_SdtSDTDispos_Disancsal2, false, false);
      AddObjectProperty("DisAncSal3", gxTv_SdtSDTDispos_Disancsal3, false, false);
      AddObjectProperty("DisGraAca2", gxTv_SdtSDTDispos_Disgraaca2, false, false);
      AddObjectProperty("DisGraCru2", gxTv_SdtSDTDispos_Disgracru2, false, false);
      AddObjectProperty("DisFac", gxTv_SdtSDTDispos_Disfac, false, false);
      AddObjectProperty("DisManCod1", gxTv_SdtSDTDispos_Dismancod1, false, false);
      AddObjectProperty("DisManCod2", gxTv_SdtSDTDispos_Dismancod2, false, false);
      AddObjectProperty("DisNumTon", gxTv_SdtSDTDispos_Disnumton, false, false);
      AddObjectProperty("DisNumAlb", gxTv_SdtSDTDispos_Disnumalb, false, false);
      AddObjectProperty("DisRefTMt", gxTv_SdtSDTDispos_Disreftmt, false, false);
      AddObjectProperty("DisRefTKg", gxTv_SdtSDTDispos_Disreftkg, false, false);
      AddObjectProperty("DisRefTPz", gxTv_SdtSDTDispos_Disreftpz, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDispos_Disfeclan), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDispos_Disfeclan), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDispos_Disfeclan), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("DisFecLan", sDateCnv, false, false);
      AddObjectProperty("RetCod", gxTv_SdtSDTDispos_Retcod, false, false);
      AddObjectProperty("DisArtMer", gxTv_SdtSDTDispos_Disartmer, false, false);
      AddObjectProperty("EmpesCod", gxTv_SdtSDTDispos_Empescod, false, false);
      AddObjectProperty("DibCli", gxTv_SdtSDTDispos_Dibcli, false, false);
      AddObjectProperty("DibInt", gxTv_SdtSDTDispos_Dibint, false, false);
      AddObjectProperty("DisDibNum", gxTv_SdtSDTDispos_Disdibnum, false, false);
      AddObjectProperty("DisNumCol", gxTv_SdtSDTDispos_Disnumcol, false, false);
      AddObjectProperty("DisObs", gxTv_SdtSDTDispos_Disobs, false, false);
      AddObjectProperty("TotNPie", gxTv_SdtSDTDispos_Totnpie, false, false);
      AddObjectProperty("TotNUni", gxTv_SdtSDTDispos_Totnuni, false, false);
      AddObjectProperty("DisComULin", gxTv_SdtSDTDispos_Discomulin, false, false);
      AddObjectProperty("DisEnv", gxTv_SdtSDTDispos_Disenv, false, false);
      AddObjectProperty("DisTin", gxTv_SdtSDTDispos_Distin, false, false);
      AddObjectProperty("DisNPzas", gxTv_SdtSDTDispos_Disnpzas, false, false);
      AddObjectProperty("DisNPzasL", gxTv_SdtSDTDispos_Disnpzasl, false, false);
      AddObjectProperty("DisUsrCod", gxTv_SdtSDTDispos_Disusrcod, false, false);
      AddObjectProperty("DisPelAnh", gxTv_SdtSDTDispos_Dispelanh, false, false);
      AddObjectProperty("DisCruMts", gxTv_SdtSDTDispos_Discrumts, false, false);
      AddObjectProperty("DisCruKgs", gxTv_SdtSDTDispos_Discrukgs, false, false);
      AddObjectProperty("DisCruEnr", gxTv_SdtSDTDispos_Discruenr, false, false);
      AddObjectProperty("DisLotMts", gxTv_SdtSDTDispos_Dislotmts, false, false);
      AddObjectProperty("DisLotKgs", gxTv_SdtSDTDispos_Dislotkgs, false, false);
      AddObjectProperty("DisAcaBak", gxTv_SdtSDTDispos_Disacabak, false, false);
      AddObjectProperty("DisAcaAnh", gxTv_SdtSDTDispos_Disacaanh, false, false);
      AddObjectProperty("DisAcaMar", gxTv_SdtSDTDispos_Disacamar, false, false);
      AddObjectProperty("DisMdlCod", gxTv_SdtSDTDispos_Dismdlcod, false, false);
      AddObjectProperty("DisTam", gxTv_SdtSDTDispos_Distam, false, false);
      datetime_STZ = gxTv_SdtSDTDispos_Dishorent ;
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
      AddObjectProperty("DisHorEnt", sDateCnv, false, false);
      datetime_STZ = gxTv_SdtSDTDispos_Dishorreg ;
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
      AddObjectProperty("DisHorReg", sDateCnv, false, false);
      AddObjectProperty("DisDishCod", gxTv_SdtSDTDispos_Disdishcod, false, false);
      AddObjectProperty("DisNroCor", gxTv_SdtSDTDispos_Disnrocor, false, false);
      AddObjectProperty("DisEncCli", gxTv_SdtSDTDispos_Disenccli, false, false);
      AddObjectProperty("DibColDib", gxTv_SdtSDTDispos_Dibcoldib, false, false);
      AddObjectProperty("DisTipEst", gxTv_SdtSDTDispos_Distipest, false, false);
      AddObjectProperty("DisGraCob", gxTv_SdtSDTDispos_Disgracob, false, false);
      AddObjectProperty("DisCom", gxTv_SdtSDTDispos_Discom, false, false);
      AddObjectProperty("DisEstTip", gxTv_SdtSDTDispos_Disesttip, false, false);
      AddObjectProperty("DisPiePdM", gxTv_SdtSDTDispos_Dispiepdm, false, false);
      AddObjectProperty("DisPiePdK", gxTv_SdtSDTDispos_Dispiepdk, false, false);
      AddObjectProperty("DisPiePdP", gxTv_SdtSDTDispos_Dispiepdp, false, false);
      AddObjectProperty("DisAcc", gxTv_SdtSDTDispos_Disacc, false, false);
      AddObjectProperty("DisTipCor", gxTv_SdtSDTDispos_Distipcor, false, false);
      AddObjectProperty("DisObsGrm", gxTv_SdtSDTDispos_Disobsgrm, false, false);
      AddObjectProperty("DisObsAnc", gxTv_SdtSDTDispos_Disobsanc, false, false);
      AddObjectProperty("DisAntp", gxTv_SdtSDTDispos_Disantp, false, false);
      AddObjectProperty("DisAntpT", gxTv_SdtSDTDispos_Disantpt, false, false);
      AddObjectProperty("DisVolMaq", gxTv_SdtSDTDispos_Disvolmaq, false, false);
      AddObjectProperty("DisRbMaq", gxTv_SdtSDTDispos_Disrbmaq, false, false);
      AddObjectProperty("DisDto", gxTv_SdtSDTDispos_Disdto, false, false);
      AddObjectProperty("DisFacSep", gxTv_SdtSDTDispos_Disfacsep, false, false);
      AddObjectProperty("DisFacGra", gxTv_SdtSDTDispos_Disfacgra, false, false);
      AddObjectProperty("DisOrdSep", gxTv_SdtSDTDispos_Disordsep, false, false);
      AddObjectProperty("DisOrdGra", gxTv_SdtSDTDispos_Disordgra, false, false);
      AddObjectProperty("DisDesCol", gxTv_SdtSDTDispos_Disdescol, false, false);
      AddObjectProperty("DisGraTam", gxTv_SdtSDTDispos_Disgratam, false, false);
      AddObjectProperty("DisRec", gxTv_SdtSDTDispos_Disrec, false, false);
      AddObjectProperty("DisMaqEst", gxTv_SdtSDTDispos_Dismaqest, false, false);
      AddObjectProperty("DisExp", gxTv_SdtSDTDispos_Disexp, false, false);
      AddObjectProperty("DisFEnt", gxTv_SdtSDTDispos_Disfent, false, false);
      AddObjectProperty("DisDest", gxTv_SdtSDTDispos_Disdest, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDispos_Disfcht), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDispos_Disfcht), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDispos_Disfcht), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("DisFchT", sDateCnv, false, false);
      AddObjectProperty("Tb1_Dscf", gxTv_SdtSDTDispos_Tb1_dscf, false, false);
      AddObjectProperty("DisItem1", gxTv_SdtSDTDispos_Disitem1, false, false);
      AddObjectProperty("DisItem2", gxTv_SdtSDTDispos_Disitem2, false, false);
      AddObjectProperty("DisItem3", gxTv_SdtSDTDispos_Disitem3, false, false);
      AddObjectProperty("DisItem4", gxTv_SdtSDTDispos_Disitem4, false, false);
      AddObjectProperty("DisItem5", gxTv_SdtSDTDispos_Disitem5, false, false);
      AddObjectProperty("DisItem6", gxTv_SdtSDTDispos_Disitem6, false, false);
      AddObjectProperty("Cod_Idtx", gxTv_SdtSDTDispos_Cod_idtx, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDispos_Disfecped), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDispos_Disfecped), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDispos_Disfecped), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("DisFecPed", sDateCnv, false, false);
      AddObjectProperty("DisLotPza", gxTv_SdtSDTDispos_Dislotpza, false, false);
      AddObjectProperty("DisLotMaq", gxTv_SdtSDTDispos_Dislotmaq, false, false);
      AddObjectProperty("DisAcaFor", gxTv_SdtSDTDispos_Disacafor, false, false);
      AddObjectProperty("DibColCol", gxTv_SdtSDTDispos_Dibcolcol, false, false);
      AddObjectProperty("DisDibCoCN", gxTv_SdtSDTDispos_Disdibcocn, false, false);
      AddObjectProperty("DibColColN", gxTv_SdtSDTDispos_Dibcolcoln, false, false);
      AddObjectProperty("DisDibCoDN", gxTv_SdtSDTDispos_Disdibcodn, false, false);
      AddObjectProperty("DisUltNot", gxTv_SdtSDTDispos_Disultnot, false, false);
      AddObjectProperty("DisParCod", gxTv_SdtSDTDispos_Disparcod, false, false);
      AddObjectProperty("DisParReo", gxTv_SdtSDTDispos_Disparreo, false, false);
      AddObjectProperty("DisParPar", gxTv_SdtSDTDispos_Disparpar, false, false);
      AddObjectProperty("DisMemo1", gxTv_SdtSDTDispos_Dismemo1, false, false);
      AddObjectProperty("DisMemo2", gxTv_SdtSDTDispos_Dismemo2, false, false);
      AddObjectProperty("MarcaId", gxTv_SdtSDTDispos_Marcaid, false, false);
      AddObjectProperty("DisOrdComp", gxTv_SdtSDTDispos_Disordcomp, false, false);
      AddObjectProperty("DisCnoEncO", gxTv_SdtSDTDispos_Discnoenco, false, false);
      AddObjectProperty("Nxt_modelo", gxTv_SdtSDTDispos_Nxt_modelo, false, false);
      AddObjectProperty("CpteId", gxTv_SdtSDTDispos_Cpteid, false, false);
      AddObjectProperty("Nxt_statio", gxTv_SdtSDTDispos_Nxt_statio, false, false);
      AddObjectProperty("DesaID", gxTv_SdtSDTDispos_Desaid, false, false);
      AddObjectProperty("DptoID", gxTv_SdtSDTDispos_Dptoid, false, false);
      AddObjectProperty("Nxt_artcli", gxTv_SdtSDTDispos_Nxt_artcli, false, false);
      AddObjectProperty("DisArtTipD", gxTv_SdtSDTDispos_Disarttipd, false, false);
      AddObjectProperty("DisTipCD", gxTv_SdtSDTDispos_Distipcd, false, false);
      AddObjectProperty("RevenID", gxTv_SdtSDTDispos_Revenid, false, false);
      AddObjectProperty("DisPriorid", gxTv_SdtSDTDispos_Dispriorid, false, false);
      AddObjectProperty("DisTpEstam", gxTv_SdtSDTDispos_Distpestam, false, false);
      AddObjectProperty("DisProdID", gxTv_SdtSDTDispos_Disprodid, false, false);
      AddObjectProperty("DisProdDs", gxTv_SdtSDTDispos_Disprodds, false, false);
      AddObjectProperty("DisOEKOTEX", gxTv_SdtSDTDispos_Disoekotex, false, false);
      AddObjectProperty("DisLineaID", gxTv_SdtSDTDispos_Dislineaid, false, false);
      AddObjectProperty("DisCanalID", gxTv_SdtSDTDispos_Discanalid, false, false);
      AddObjectProperty("DisLinPrd", gxTv_SdtSDTDispos_Dislinprd, false, false);
      AddObjectProperty("DisDGUltli", gxTv_SdtSDTDispos_Disdgultli, false, false);
      AddObjectProperty("DisDGSumMts", gxTv_SdtSDTDispos_Disdgsummts, false, false);
      AddObjectProperty("DisDGSumPzs", gxTv_SdtSDTDispos_Disdgsumpzs, false, false);
      AddObjectProperty("DisRGB", gxTv_SdtSDTDispos_Disrgb, false, false);
   }

   public String getgxTv_SdtSDTDispos_Emprcod( )
   {
      return gxTv_SdtSDTDispos_Emprcod ;
   }

   public void setgxTv_SdtSDTDispos_Emprcod( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Emprcod = value ;
   }

   public int getgxTv_SdtSDTDispos_Discod( )
   {
      return gxTv_SdtSDTDispos_Discod ;
   }

   public void setgxTv_SdtSDTDispos_Discod( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discod = value ;
   }

   public String getgxTv_SdtSDTDispos_Disdes( )
   {
      return gxTv_SdtSDTDispos_Disdes ;
   }

   public void setgxTv_SdtSDTDispos_Disdes( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdes = value ;
   }

   public String getgxTv_SdtSDTDispos_Disartcod( )
   {
      return gxTv_SdtSDTDispos_Disartcod ;
   }

   public void setgxTv_SdtSDTDispos_Disartcod( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartcod = value ;
   }

   public short getgxTv_SdtSDTDispos_Disnumpie( )
   {
      return gxTv_SdtSDTDispos_Disnumpie ;
   }

   public void setgxTv_SdtSDTDispos_Disnumpie( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumpie = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Disnumuni( )
   {
      return gxTv_SdtSDTDispos_Disnumuni ;
   }

   public void setgxTv_SdtSDTDispos_Disnumuni( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumuni = value ;
   }

   public String getgxTv_SdtSDTDispos_Disunimed( )
   {
      return gxTv_SdtSDTDispos_Disunimed ;
   }

   public void setgxTv_SdtSDTDispos_Disunimed( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disunimed = value ;
   }

   public short getgxTv_SdtSDTDispos_Disartpes( )
   {
      return gxTv_SdtSDTDispos_Disartpes ;
   }

   public void setgxTv_SdtSDTDispos_Disartpes( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartpes = value ;
   }

   public String getgxTv_SdtSDTDispos_Pricod( )
   {
      return gxTv_SdtSDTDispos_Pricod ;
   }

   public void setgxTv_SdtSDTDispos_Pricod( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Pricod = value ;
   }

   public String getgxTv_SdtSDTDispos_Disclinum( )
   {
      return gxTv_SdtSDTDispos_Disclinum ;
   }

   public void setgxTv_SdtSDTDispos_Disclinum( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disclinum = value ;
   }

   public java.util.Date getgxTv_SdtSDTDispos_Disfeccli( )
   {
      return gxTv_SdtSDTDispos_Disfeccli ;
   }

   public void setgxTv_SdtSDTDispos_Disfeccli( java.util.Date value )
   {
      gxTv_SdtSDTDispos_Disfeccli_N = (byte)(0) ;
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disfeccli = value ;
   }

   public java.util.Date getgxTv_SdtSDTDispos_Disfec( )
   {
      return gxTv_SdtSDTDispos_Disfec ;
   }

   public void setgxTv_SdtSDTDispos_Disfec( java.util.Date value )
   {
      gxTv_SdtSDTDispos_Disfec_N = (byte)(0) ;
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disfec = value ;
   }

   public java.util.Date getgxTv_SdtSDTDispos_Disfecent( )
   {
      return gxTv_SdtSDTDispos_Disfecent ;
   }

   public void setgxTv_SdtSDTDispos_Disfecent( java.util.Date value )
   {
      gxTv_SdtSDTDispos_Disfecent_N = (byte)(0) ;
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disfecent = value ;
   }

   public String getgxTv_SdtSDTDispos_Discolnom( )
   {
      return gxTv_SdtSDTDispos_Discolnom ;
   }

   public void setgxTv_SdtSDTDispos_Discolnom( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discolnom = value ;
   }

   public int getgxTv_SdtSDTDispos_Discolnum( )
   {
      return gxTv_SdtSDTDispos_Discolnum ;
   }

   public void setgxTv_SdtSDTDispos_Discolnum( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discolnum = value ;
   }

   public byte getgxTv_SdtSDTDispos_Distipcol( )
   {
      return gxTv_SdtSDTDispos_Distipcol ;
   }

   public void setgxTv_SdtSDTDispos_Distipcol( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Distipcol = value ;
   }

   public String getgxTv_SdtSDTDispos_Disartdsc( )
   {
      return gxTv_SdtSDTDispos_Disartdsc ;
   }

   public void setgxTv_SdtSDTDispos_Disartdsc( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartdsc = value ;
   }

   public short getgxTv_SdtSDTDispos_Dispiepie( )
   {
      return gxTv_SdtSDTDispos_Dispiepie ;
   }

   public void setgxTv_SdtSDTDispos_Dispiepie( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispiepie = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Dispiekgm( )
   {
      return gxTv_SdtSDTDispos_Dispiekgm ;
   }

   public void setgxTv_SdtSDTDispos_Dispiekgm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispiekgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Dispiemtr( )
   {
      return gxTv_SdtSDTDispos_Dispiemtr ;
   }

   public void setgxTv_SdtSDTDispos_Dispiemtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispiemtr = value ;
   }

   public short getgxTv_SdtSDTDispos_Disdefcon( )
   {
      return gxTv_SdtSDTDispos_Disdefcon ;
   }

   public void setgxTv_SdtSDTDispos_Disdefcon( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdefcon = value ;
   }

   public short getgxTv_SdtSDTDispos_Dispienor( )
   {
      return gxTv_SdtSDTDispos_Dispienor ;
   }

   public void setgxTv_SdtSDTDispos_Dispienor( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispienor = value ;
   }

   public short getgxTv_SdtSDTDispos_Sumpor( )
   {
      return gxTv_SdtSDTDispos_Sumpor ;
   }

   public void setgxTv_SdtSDTDispos_Sumpor( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Sumpor = value ;
   }

   public String getgxTv_SdtSDTDispos_Disent( )
   {
      return gxTv_SdtSDTDispos_Disent ;
   }

   public void setgxTv_SdtSDTDispos_Disent( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disent = value ;
   }

   public byte getgxTv_SdtSDTDispos_Disobsulin( )
   {
      return gxTv_SdtSDTDispos_Disobsulin ;
   }

   public void setgxTv_SdtSDTDispos_Disobsulin( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disobsulin = value ;
   }

   public String getgxTv_SdtSDTDispos_Disartmat( )
   {
      return gxTv_SdtSDTDispos_Disartmat ;
   }

   public void setgxTv_SdtSDTDispos_Disartmat( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartmat = value ;
   }

   public String getgxTv_SdtSDTDispos_Disartlar( )
   {
      return gxTv_SdtSDTDispos_Disartlar ;
   }

   public void setgxTv_SdtSDTDispos_Disartlar( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartlar = value ;
   }

   public String getgxTv_SdtSDTDispos_Disartsua( )
   {
      return gxTv_SdtSDTDispos_Disartsua ;
   }

   public void setgxTv_SdtSDTDispos_Disartsua( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartsua = value ;
   }

   public String getgxTv_SdtSDTDispos_Disartaca( )
   {
      return gxTv_SdtSDTDispos_Disartaca ;
   }

   public void setgxTv_SdtSDTDispos_Disartaca( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartaca = value ;
   }

   public String getgxTv_SdtSDTDispos_Disartple( )
   {
      return gxTv_SdtSDTDispos_Disartple ;
   }

   public void setgxTv_SdtSDTDispos_Disartple( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartple = value ;
   }

   public short getgxTv_SdtSDTDispos_Disarttip( )
   {
      return gxTv_SdtSDTDispos_Disarttip ;
   }

   public void setgxTv_SdtSDTDispos_Disarttip( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disarttip = value ;
   }

   public String getgxTv_SdtSDTDispos_Disartenc( )
   {
      return gxTv_SdtSDTDispos_Disartenc ;
   }

   public void setgxTv_SdtSDTDispos_Disartenc( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartenc = value ;
   }

   public String getgxTv_SdtSDTDispos_Disartcor( )
   {
      return gxTv_SdtSDTDispos_Disartcor ;
   }

   public void setgxTv_SdtSDTDispos_Disartcor( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartcor = value ;
   }

   public String getgxTv_SdtSDTDispos_Disartope( )
   {
      return gxTv_SdtSDTDispos_Disartope ;
   }

   public void setgxTv_SdtSDTDispos_Disartope( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartope = value ;
   }

   public String getgxTv_SdtSDTDispos_Disarttr1( )
   {
      return gxTv_SdtSDTDispos_Disarttr1 ;
   }

   public void setgxTv_SdtSDTDispos_Disarttr1( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disarttr1 = value ;
   }

   public short getgxTv_SdtSDTDispos_Disartpt1( )
   {
      return gxTv_SdtSDTDispos_Disartpt1 ;
   }

   public void setgxTv_SdtSDTDispos_Disartpt1( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartpt1 = value ;
   }

   public String getgxTv_SdtSDTDispos_Disarttr2( )
   {
      return gxTv_SdtSDTDispos_Disarttr2 ;
   }

   public void setgxTv_SdtSDTDispos_Disarttr2( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disarttr2 = value ;
   }

   public short getgxTv_SdtSDTDispos_Disartpt2( )
   {
      return gxTv_SdtSDTDispos_Disartpt2 ;
   }

   public void setgxTv_SdtSDTDispos_Disartpt2( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartpt2 = value ;
   }

   public String getgxTv_SdtSDTDispos_Disarttr3( )
   {
      return gxTv_SdtSDTDispos_Disarttr3 ;
   }

   public void setgxTv_SdtSDTDispos_Disarttr3( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disarttr3 = value ;
   }

   public short getgxTv_SdtSDTDispos_Disartpt3( )
   {
      return gxTv_SdtSDTDispos_Disartpt3 ;
   }

   public void setgxTv_SdtSDTDispos_Disartpt3( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartpt3 = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Disartrdt( )
   {
      return gxTv_SdtSDTDispos_Disartrdt ;
   }

   public void setgxTv_SdtSDTDispos_Disartrdt( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartrdt = value ;
   }

   public byte getgxTv_SdtSDTDispos_Disarturg( )
   {
      return gxTv_SdtSDTDispos_Disarturg ;
   }

   public void setgxTv_SdtSDTDispos_Disarturg( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disarturg = value ;
   }

   public String getgxTv_SdtSDTDispos_Disartur1( )
   {
      return gxTv_SdtSDTDispos_Disartur1 ;
   }

   public void setgxTv_SdtSDTDispos_Disartur1( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartur1 = value ;
   }

   public short getgxTv_SdtSDTDispos_Disartpu1( )
   {
      return gxTv_SdtSDTDispos_Disartpu1 ;
   }

   public void setgxTv_SdtSDTDispos_Disartpu1( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartpu1 = value ;
   }

   public String getgxTv_SdtSDTDispos_Disartur2( )
   {
      return gxTv_SdtSDTDispos_Disartur2 ;
   }

   public void setgxTv_SdtSDTDispos_Disartur2( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartur2 = value ;
   }

   public short getgxTv_SdtSDTDispos_Disartpu2( )
   {
      return gxTv_SdtSDTDispos_Disartpu2 ;
   }

   public void setgxTv_SdtSDTDispos_Disartpu2( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartpu2 = value ;
   }

   public String getgxTv_SdtSDTDispos_Disartur3( )
   {
      return gxTv_SdtSDTDispos_Disartur3 ;
   }

   public void setgxTv_SdtSDTDispos_Disartur3( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartur3 = value ;
   }

   public short getgxTv_SdtSDTDispos_Disartpu3( )
   {
      return gxTv_SdtSDTDispos_Disartpu3 ;
   }

   public void setgxTv_SdtSDTDispos_Disartpu3( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartpu3 = value ;
   }

   public short getgxTv_SdtSDTDispos_Disartanh( )
   {
      return gxTv_SdtSDTDispos_Disartanh ;
   }

   public void setgxTv_SdtSDTDispos_Disartanh( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartanh = value ;
   }

   public byte getgxTv_SdtSDTDispos_Disest( )
   {
      return gxTv_SdtSDTDispos_Disest ;
   }

   public void setgxTv_SdtSDTDispos_Disest( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disest = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Disprekgm( )
   {
      return gxTv_SdtSDTDispos_Disprekgm ;
   }

   public void setgxTv_SdtSDTDispos_Disprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disprekgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Dispremtr( )
   {
      return gxTv_SdtSDTDispos_Dispremtr ;
   }

   public void setgxTv_SdtSDTDispos_Dispremtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispremtr = value ;
   }

   public short getgxTv_SdtSDTDispos_Dispielan( )
   {
      return gxTv_SdtSDTDispos_Dispielan ;
   }

   public void setgxTv_SdtSDTDispos_Dispielan( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispielan = value ;
   }

   public short getgxTv_SdtSDTDispos_Diskgmlan( )
   {
      return gxTv_SdtSDTDispos_Diskgmlan ;
   }

   public void setgxTv_SdtSDTDispos_Diskgmlan( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Diskgmlan = value ;
   }

   public short getgxTv_SdtSDTDispos_Dismtrlan( )
   {
      return gxTv_SdtSDTDispos_Dismtrlan ;
   }

   public void setgxTv_SdtSDTDispos_Dismtrlan( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dismtrlan = value ;
   }

   public String getgxTv_SdtSDTDispos_Emprcoddis( )
   {
      return gxTv_SdtSDTDispos_Emprcoddis ;
   }

   public void setgxTv_SdtSDTDispos_Emprcoddis( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Emprcoddis = value ;
   }

   public int getgxTv_SdtSDTDispos_Clicoddis( )
   {
      return gxTv_SdtSDTDispos_Clicoddis ;
   }

   public void setgxTv_SdtSDTDispos_Clicoddis( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Clicoddis = value ;
   }

   public String getgxTv_SdtSDTDispos_Findcol( )
   {
      return gxTv_SdtSDTDispos_Findcol ;
   }

   public void setgxTv_SdtSDTDispos_Findcol( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Findcol = value ;
   }

   public short getgxTv_SdtSDTDispos_Dispie( )
   {
      return gxTv_SdtSDTDispos_Dispie ;
   }

   public void setgxTv_SdtSDTDispos_Dispie( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispie = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Disuni( )
   {
      return gxTv_SdtSDTDispos_Disuni ;
   }

   public void setgxTv_SdtSDTDispos_Disuni( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disuni = value ;
   }

   public String getgxTv_SdtSDTDispos_Disnmtr( )
   {
      return gxTv_SdtSDTDispos_Disnmtr ;
   }

   public void setgxTv_SdtSDTDispos_Disnmtr( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnmtr = value ;
   }

   public String getgxTv_SdtSDTDispos_Disnmez( )
   {
      return gxTv_SdtSDTDispos_Disnmez ;
   }

   public void setgxTv_SdtSDTDispos_Disnmez( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnmez = value ;
   }

   public byte getgxTv_SdtSDTDispos_Findint( )
   {
      return gxTv_SdtSDTDispos_Findint ;
   }

   public void setgxTv_SdtSDTDispos_Findint( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Findint = value ;
   }

   public String getgxTv_SdtSDTDispos_Findton( )
   {
      return gxTv_SdtSDTDispos_Findton ;
   }

   public void setgxTv_SdtSDTDispos_Findton( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Findton = value ;
   }

   public String getgxTv_SdtSDTDispos_Disnumten( )
   {
      return gxTv_SdtSDTDispos_Disnumten ;
   }

   public void setgxTv_SdtSDTDispos_Disnumten( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumten = value ;
   }

   public String getgxTv_SdtSDTDispos_Maqcoddis( )
   {
      return gxTv_SdtSDTDispos_Maqcoddis ;
   }

   public void setgxTv_SdtSDTDispos_Maqcoddis( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Maqcoddis = value ;
   }

   public String getgxTv_SdtSDTDispos_Partcod( )
   {
      return gxTv_SdtSDTDispos_Partcod ;
   }

   public void setgxTv_SdtSDTDispos_Partcod( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Partcod = value ;
   }

   public int getgxTv_SdtSDTDispos_Clicod( )
   {
      return gxTv_SdtSDTDispos_Clicod ;
   }

   public void setgxTv_SdtSDTDispos_Clicod( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Clicod = value ;
   }

   public short getgxTv_SdtSDTDispos_Tipconcod( )
   {
      return gxTv_SdtSDTDispos_Tipconcod ;
   }

   public void setgxTv_SdtSDTDispos_Tipconcod( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Tipconcod = value ;
   }

   public String getgxTv_SdtSDTDispos_Tipconnom( )
   {
      return gxTv_SdtSDTDispos_Tipconnom ;
   }

   public void setgxTv_SdtSDTDispos_Tipconnom( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Tipconnom = value ;
   }

   public String getgxTv_SdtSDTDispos_Disnomcli( )
   {
      return gxTv_SdtSDTDispos_Disnomcli ;
   }

   public void setgxTv_SdtSDTDispos_Disnomcli( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnomcli = value ;
   }

   public int getgxTv_SdtSDTDispos_Disnumcli( )
   {
      return gxTv_SdtSDTDispos_Disnumcli ;
   }

   public void setgxTv_SdtSDTDispos_Disnumcli( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumcli = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Disenccom( )
   {
      return gxTv_SdtSDTDispos_Disenccom ;
   }

   public void setgxTv_SdtSDTDispos_Disenccom( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disenccom = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Disencanh( )
   {
      return gxTv_SdtSDTDispos_Disencanh ;
   }

   public void setgxTv_SdtSDTDispos_Disencanh( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disencanh = value ;
   }

   public short getgxTv_SdtSDTDispos_Disgracru( )
   {
      return gxTv_SdtSDTDispos_Disgracru ;
   }

   public void setgxTv_SdtSDTDispos_Disgracru( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disgracru = value ;
   }

   public short getgxTv_SdtSDTDispos_Disartan1( )
   {
      return gxTv_SdtSDTDispos_Disartan1 ;
   }

   public void setgxTv_SdtSDTDispos_Disartan1( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartan1 = value ;
   }

   public short getgxTv_SdtSDTDispos_Disartacb( )
   {
      return gxTv_SdtSDTDispos_Disartacb ;
   }

   public void setgxTv_SdtSDTDispos_Disartacb( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartacb = value ;
   }

   public short getgxTv_SdtSDTDispos_Disartac2( )
   {
      return gxTv_SdtSDTDispos_Disartac2 ;
   }

   public void setgxTv_SdtSDTDispos_Disartac2( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartac2 = value ;
   }

   public String getgxTv_SdtSDTDispos_Disloc( )
   {
      return gxTv_SdtSDTDispos_Disloc ;
   }

   public void setgxTv_SdtSDTDispos_Disloc( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disloc = value ;
   }

   public short getgxTv_SdtSDTDispos_Dispart( )
   {
      return gxTv_SdtSDTDispos_Dispart ;
   }

   public void setgxTv_SdtSDTDispos_Dispart( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispart = value ;
   }

   public short getgxTv_SdtSDTDispos_Disgraaca( )
   {
      return gxTv_SdtSDTDispos_Disgraaca ;
   }

   public void setgxTv_SdtSDTDispos_Disgraaca( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disgraaca = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Disrdon( )
   {
      return gxTv_SdtSDTDispos_Disrdon ;
   }

   public void setgxTv_SdtSDTDispos_Disrdon( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disrdon = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Disrdoa( )
   {
      return gxTv_SdtSDTDispos_Disrdoa ;
   }

   public void setgxTv_SdtSDTDispos_Disrdoa( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disrdoa = value ;
   }

   public String getgxTv_SdtSDTDispos_Disres( )
   {
      return gxTv_SdtSDTDispos_Disres ;
   }

   public void setgxTv_SdtSDTDispos_Disres( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disres = value ;
   }

   public String getgxTv_SdtSDTDispos_Distipdis( )
   {
      return gxTv_SdtSDTDispos_Distipdis ;
   }

   public void setgxTv_SdtSDTDispos_Distipdis( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Distipdis = value ;
   }

   public short getgxTv_SdtSDTDispos_Disnumbas( )
   {
      return gxTv_SdtSDTDispos_Disnumbas ;
   }

   public void setgxTv_SdtSDTDispos_Disnumbas( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumbas = value ;
   }

   public int getgxTv_SdtSDTDispos_Disclides( )
   {
      return gxTv_SdtSDTDispos_Disclides ;
   }

   public void setgxTv_SdtSDTDispos_Disclides( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disclides = value ;
   }

   public short getgxTv_SdtSDTDispos_Dismancod( )
   {
      return gxTv_SdtSDTDispos_Dismancod ;
   }

   public void setgxTv_SdtSDTDispos_Dismancod( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dismancod = value ;
   }

   public int getgxTv_SdtSDTDispos_Disopeant( )
   {
      return gxTv_SdtSDTDispos_Disopeant ;
   }

   public void setgxTv_SdtSDTDispos_Disopeant( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disopeant = value ;
   }

   public String getgxTv_SdtSDTDispos_Discodtex( )
   {
      return gxTv_SdtSDTDispos_Discodtex ;
   }

   public void setgxTv_SdtSDTDispos_Discodtex( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discodtex = value ;
   }

   public byte getgxTv_SdtSDTDispos_Disnumtex1( )
   {
      return gxTv_SdtSDTDispos_Disnumtex1 ;
   }

   public void setgxTv_SdtSDTDispos_Disnumtex1( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumtex1 = value ;
   }

   public short getgxTv_SdtSDTDispos_Disnumtex2( )
   {
      return gxTv_SdtSDTDispos_Disnumtex2 ;
   }

   public void setgxTv_SdtSDTDispos_Disnumtex2( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumtex2 = value ;
   }

   public int getgxTv_SdtSDTDispos_Disnumlot( )
   {
      return gxTv_SdtSDTDispos_Disnumlot ;
   }

   public void setgxTv_SdtSDTDispos_Disnumlot( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumlot = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Diskgslot( )
   {
      return gxTv_SdtSDTDispos_Diskgslot ;
   }

   public void setgxTv_SdtSDTDispos_Diskgslot( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Diskgslot = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Dismtrlot( )
   {
      return gxTv_SdtSDTDispos_Dismtrlot ;
   }

   public void setgxTv_SdtSDTDispos_Dismtrlot( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dismtrlot = value ;
   }

   public String getgxTv_SdtSDTDispos_Displa( )
   {
      return gxTv_SdtSDTDispos_Displa ;
   }

   public void setgxTv_SdtSDTDispos_Displa( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Displa = value ;
   }

   public String getgxTv_SdtSDTDispos_Disple2( )
   {
      return gxTv_SdtSDTDispos_Disple2 ;
   }

   public void setgxTv_SdtSDTDispos_Disple2( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disple2 = value ;
   }

   public short getgxTv_SdtSDTDispos_Disnumcor( )
   {
      return gxTv_SdtSDTDispos_Disnumcor ;
   }

   public void setgxTv_SdtSDTDispos_Disnumcor( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumcor = value ;
   }

   public short getgxTv_SdtSDTDispos_Disancsal1( )
   {
      return gxTv_SdtSDTDispos_Disancsal1 ;
   }

   public void setgxTv_SdtSDTDispos_Disancsal1( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disancsal1 = value ;
   }

   public short getgxTv_SdtSDTDispos_Disancsal2( )
   {
      return gxTv_SdtSDTDispos_Disancsal2 ;
   }

   public void setgxTv_SdtSDTDispos_Disancsal2( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disancsal2 = value ;
   }

   public short getgxTv_SdtSDTDispos_Disancsal3( )
   {
      return gxTv_SdtSDTDispos_Disancsal3 ;
   }

   public void setgxTv_SdtSDTDispos_Disancsal3( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disancsal3 = value ;
   }

   public short getgxTv_SdtSDTDispos_Disgraaca2( )
   {
      return gxTv_SdtSDTDispos_Disgraaca2 ;
   }

   public void setgxTv_SdtSDTDispos_Disgraaca2( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disgraaca2 = value ;
   }

   public short getgxTv_SdtSDTDispos_Disgracru2( )
   {
      return gxTv_SdtSDTDispos_Disgracru2 ;
   }

   public void setgxTv_SdtSDTDispos_Disgracru2( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disgracru2 = value ;
   }

   public String getgxTv_SdtSDTDispos_Disfac( )
   {
      return gxTv_SdtSDTDispos_Disfac ;
   }

   public void setgxTv_SdtSDTDispos_Disfac( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disfac = value ;
   }

   public short getgxTv_SdtSDTDispos_Dismancod1( )
   {
      return gxTv_SdtSDTDispos_Dismancod1 ;
   }

   public void setgxTv_SdtSDTDispos_Dismancod1( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dismancod1 = value ;
   }

   public short getgxTv_SdtSDTDispos_Dismancod2( )
   {
      return gxTv_SdtSDTDispos_Dismancod2 ;
   }

   public void setgxTv_SdtSDTDispos_Dismancod2( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dismancod2 = value ;
   }

   public String getgxTv_SdtSDTDispos_Disnumton( )
   {
      return gxTv_SdtSDTDispos_Disnumton ;
   }

   public void setgxTv_SdtSDTDispos_Disnumton( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumton = value ;
   }

   public short getgxTv_SdtSDTDispos_Disnumalb( )
   {
      return gxTv_SdtSDTDispos_Disnumalb ;
   }

   public void setgxTv_SdtSDTDispos_Disnumalb( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumalb = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Disreftmt( )
   {
      return gxTv_SdtSDTDispos_Disreftmt ;
   }

   public void setgxTv_SdtSDTDispos_Disreftmt( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disreftmt = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Disreftkg( )
   {
      return gxTv_SdtSDTDispos_Disreftkg ;
   }

   public void setgxTv_SdtSDTDispos_Disreftkg( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disreftkg = value ;
   }

   public short getgxTv_SdtSDTDispos_Disreftpz( )
   {
      return gxTv_SdtSDTDispos_Disreftpz ;
   }

   public void setgxTv_SdtSDTDispos_Disreftpz( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disreftpz = value ;
   }

   public java.util.Date getgxTv_SdtSDTDispos_Disfeclan( )
   {
      return gxTv_SdtSDTDispos_Disfeclan ;
   }

   public void setgxTv_SdtSDTDispos_Disfeclan( java.util.Date value )
   {
      gxTv_SdtSDTDispos_Disfeclan_N = (byte)(0) ;
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disfeclan = value ;
   }

   public String getgxTv_SdtSDTDispos_Retcod( )
   {
      return gxTv_SdtSDTDispos_Retcod ;
   }

   public void setgxTv_SdtSDTDispos_Retcod( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Retcod = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Disartmer( )
   {
      return gxTv_SdtSDTDispos_Disartmer ;
   }

   public void setgxTv_SdtSDTDispos_Disartmer( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartmer = value ;
   }

   public String getgxTv_SdtSDTDispos_Empescod( )
   {
      return gxTv_SdtSDTDispos_Empescod ;
   }

   public void setgxTv_SdtSDTDispos_Empescod( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Empescod = value ;
   }

   public String getgxTv_SdtSDTDispos_Dibcli( )
   {
      return gxTv_SdtSDTDispos_Dibcli ;
   }

   public void setgxTv_SdtSDTDispos_Dibcli( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dibcli = value ;
   }

   public int getgxTv_SdtSDTDispos_Dibint( )
   {
      return gxTv_SdtSDTDispos_Dibint ;
   }

   public void setgxTv_SdtSDTDispos_Dibint( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dibint = value ;
   }

   public int getgxTv_SdtSDTDispos_Disdibnum( )
   {
      return gxTv_SdtSDTDispos_Disdibnum ;
   }

   public void setgxTv_SdtSDTDispos_Disdibnum( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdibnum = value ;
   }

   public short getgxTv_SdtSDTDispos_Disnumcol( )
   {
      return gxTv_SdtSDTDispos_Disnumcol ;
   }

   public void setgxTv_SdtSDTDispos_Disnumcol( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumcol = value ;
   }

   public String getgxTv_SdtSDTDispos_Disobs( )
   {
      return gxTv_SdtSDTDispos_Disobs ;
   }

   public void setgxTv_SdtSDTDispos_Disobs( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disobs = value ;
   }

   public short getgxTv_SdtSDTDispos_Totnpie( )
   {
      return gxTv_SdtSDTDispos_Totnpie ;
   }

   public void setgxTv_SdtSDTDispos_Totnpie( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Totnpie = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Totnuni( )
   {
      return gxTv_SdtSDTDispos_Totnuni ;
   }

   public void setgxTv_SdtSDTDispos_Totnuni( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Totnuni = value ;
   }

   public byte getgxTv_SdtSDTDispos_Discomulin( )
   {
      return gxTv_SdtSDTDispos_Discomulin ;
   }

   public void setgxTv_SdtSDTDispos_Discomulin( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discomulin = value ;
   }

   public byte getgxTv_SdtSDTDispos_Disenv( )
   {
      return gxTv_SdtSDTDispos_Disenv ;
   }

   public void setgxTv_SdtSDTDispos_Disenv( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disenv = value ;
   }

   public String getgxTv_SdtSDTDispos_Distin( )
   {
      return gxTv_SdtSDTDispos_Distin ;
   }

   public void setgxTv_SdtSDTDispos_Distin( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Distin = value ;
   }

   public int getgxTv_SdtSDTDispos_Disnpzas( )
   {
      return gxTv_SdtSDTDispos_Disnpzas ;
   }

   public void setgxTv_SdtSDTDispos_Disnpzas( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnpzas = value ;
   }

   public int getgxTv_SdtSDTDispos_Disnpzasl( )
   {
      return gxTv_SdtSDTDispos_Disnpzasl ;
   }

   public void setgxTv_SdtSDTDispos_Disnpzasl( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnpzasl = value ;
   }

   public String getgxTv_SdtSDTDispos_Disusrcod( )
   {
      return gxTv_SdtSDTDispos_Disusrcod ;
   }

   public void setgxTv_SdtSDTDispos_Disusrcod( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disusrcod = value ;
   }

   public short getgxTv_SdtSDTDispos_Dispelanh( )
   {
      return gxTv_SdtSDTDispos_Dispelanh ;
   }

   public void setgxTv_SdtSDTDispos_Dispelanh( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispelanh = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Discrumts( )
   {
      return gxTv_SdtSDTDispos_Discrumts ;
   }

   public void setgxTv_SdtSDTDispos_Discrumts( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discrumts = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Discrukgs( )
   {
      return gxTv_SdtSDTDispos_Discrukgs ;
   }

   public void setgxTv_SdtSDTDispos_Discrukgs( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discrukgs = value ;
   }

   public String getgxTv_SdtSDTDispos_Discruenr( )
   {
      return gxTv_SdtSDTDispos_Discruenr ;
   }

   public void setgxTv_SdtSDTDispos_Discruenr( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discruenr = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Dislotmts( )
   {
      return gxTv_SdtSDTDispos_Dislotmts ;
   }

   public void setgxTv_SdtSDTDispos_Dislotmts( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dislotmts = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Dislotkgs( )
   {
      return gxTv_SdtSDTDispos_Dislotkgs ;
   }

   public void setgxTv_SdtSDTDispos_Dislotkgs( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dislotkgs = value ;
   }

   public String getgxTv_SdtSDTDispos_Disacabak( )
   {
      return gxTv_SdtSDTDispos_Disacabak ;
   }

   public void setgxTv_SdtSDTDispos_Disacabak( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disacabak = value ;
   }

   public short getgxTv_SdtSDTDispos_Disacaanh( )
   {
      return gxTv_SdtSDTDispos_Disacaanh ;
   }

   public void setgxTv_SdtSDTDispos_Disacaanh( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disacaanh = value ;
   }

   public String getgxTv_SdtSDTDispos_Disacamar( )
   {
      return gxTv_SdtSDTDispos_Disacamar ;
   }

   public void setgxTv_SdtSDTDispos_Disacamar( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disacamar = value ;
   }

   public String getgxTv_SdtSDTDispos_Dismdlcod( )
   {
      return gxTv_SdtSDTDispos_Dismdlcod ;
   }

   public void setgxTv_SdtSDTDispos_Dismdlcod( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dismdlcod = value ;
   }

   public String getgxTv_SdtSDTDispos_Distam( )
   {
      return gxTv_SdtSDTDispos_Distam ;
   }

   public void setgxTv_SdtSDTDispos_Distam( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Distam = value ;
   }

   public java.util.Date getgxTv_SdtSDTDispos_Dishorent( )
   {
      return gxTv_SdtSDTDispos_Dishorent ;
   }

   public void setgxTv_SdtSDTDispos_Dishorent( java.util.Date value )
   {
      gxTv_SdtSDTDispos_Dishorent_N = (byte)(0) ;
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dishorent = value ;
   }

   public java.util.Date getgxTv_SdtSDTDispos_Dishorreg( )
   {
      return gxTv_SdtSDTDispos_Dishorreg ;
   }

   public void setgxTv_SdtSDTDispos_Dishorreg( java.util.Date value )
   {
      gxTv_SdtSDTDispos_Dishorreg_N = (byte)(0) ;
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dishorreg = value ;
   }

   public String getgxTv_SdtSDTDispos_Disdishcod( )
   {
      return gxTv_SdtSDTDispos_Disdishcod ;
   }

   public void setgxTv_SdtSDTDispos_Disdishcod( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdishcod = value ;
   }

   public int getgxTv_SdtSDTDispos_Disnrocor( )
   {
      return gxTv_SdtSDTDispos_Disnrocor ;
   }

   public void setgxTv_SdtSDTDispos_Disnrocor( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnrocor = value ;
   }

   public String getgxTv_SdtSDTDispos_Disenccli( )
   {
      return gxTv_SdtSDTDispos_Disenccli ;
   }

   public void setgxTv_SdtSDTDispos_Disenccli( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disenccli = value ;
   }

   public String getgxTv_SdtSDTDispos_Dibcoldib( )
   {
      return gxTv_SdtSDTDispos_Dibcoldib ;
   }

   public void setgxTv_SdtSDTDispos_Dibcoldib( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dibcoldib = value ;
   }

   public byte getgxTv_SdtSDTDispos_Distipest( )
   {
      return gxTv_SdtSDTDispos_Distipest ;
   }

   public void setgxTv_SdtSDTDispos_Distipest( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Distipest = value ;
   }

   public byte getgxTv_SdtSDTDispos_Disgracob( )
   {
      return gxTv_SdtSDTDispos_Disgracob ;
   }

   public void setgxTv_SdtSDTDispos_Disgracob( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disgracob = value ;
   }

   public String getgxTv_SdtSDTDispos_Discom( )
   {
      return gxTv_SdtSDTDispos_Discom ;
   }

   public void setgxTv_SdtSDTDispos_Discom( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discom = value ;
   }

   public String getgxTv_SdtSDTDispos_Disesttip( )
   {
      return gxTv_SdtSDTDispos_Disesttip ;
   }

   public void setgxTv_SdtSDTDispos_Disesttip( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disesttip = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Dispiepdm( )
   {
      return gxTv_SdtSDTDispos_Dispiepdm ;
   }

   public void setgxTv_SdtSDTDispos_Dispiepdm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispiepdm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Dispiepdk( )
   {
      return gxTv_SdtSDTDispos_Dispiepdk ;
   }

   public void setgxTv_SdtSDTDispos_Dispiepdk( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispiepdk = value ;
   }

   public short getgxTv_SdtSDTDispos_Dispiepdp( )
   {
      return gxTv_SdtSDTDispos_Dispiepdp ;
   }

   public void setgxTv_SdtSDTDispos_Dispiepdp( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispiepdp = value ;
   }

   public String getgxTv_SdtSDTDispos_Disacc( )
   {
      return gxTv_SdtSDTDispos_Disacc ;
   }

   public void setgxTv_SdtSDTDispos_Disacc( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disacc = value ;
   }

   public String getgxTv_SdtSDTDispos_Distipcor( )
   {
      return gxTv_SdtSDTDispos_Distipcor ;
   }

   public void setgxTv_SdtSDTDispos_Distipcor( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Distipcor = value ;
   }

   public String getgxTv_SdtSDTDispos_Disobsgrm( )
   {
      return gxTv_SdtSDTDispos_Disobsgrm ;
   }

   public void setgxTv_SdtSDTDispos_Disobsgrm( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disobsgrm = value ;
   }

   public String getgxTv_SdtSDTDispos_Disobsanc( )
   {
      return gxTv_SdtSDTDispos_Disobsanc ;
   }

   public void setgxTv_SdtSDTDispos_Disobsanc( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disobsanc = value ;
   }

   public String getgxTv_SdtSDTDispos_Disantp( )
   {
      return gxTv_SdtSDTDispos_Disantp ;
   }

   public void setgxTv_SdtSDTDispos_Disantp( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disantp = value ;
   }

   public String getgxTv_SdtSDTDispos_Disantpt( )
   {
      return gxTv_SdtSDTDispos_Disantpt ;
   }

   public void setgxTv_SdtSDTDispos_Disantpt( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disantpt = value ;
   }

   public int getgxTv_SdtSDTDispos_Disvolmaq( )
   {
      return gxTv_SdtSDTDispos_Disvolmaq ;
   }

   public void setgxTv_SdtSDTDispos_Disvolmaq( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disvolmaq = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Disrbmaq( )
   {
      return gxTv_SdtSDTDispos_Disrbmaq ;
   }

   public void setgxTv_SdtSDTDispos_Disrbmaq( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disrbmaq = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Disdto( )
   {
      return gxTv_SdtSDTDispos_Disdto ;
   }

   public void setgxTv_SdtSDTDispos_Disdto( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdto = value ;
   }

   public byte getgxTv_SdtSDTDispos_Disfacsep( )
   {
      return gxTv_SdtSDTDispos_Disfacsep ;
   }

   public void setgxTv_SdtSDTDispos_Disfacsep( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disfacsep = value ;
   }

   public byte getgxTv_SdtSDTDispos_Disfacgra( )
   {
      return gxTv_SdtSDTDispos_Disfacgra ;
   }

   public void setgxTv_SdtSDTDispos_Disfacgra( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disfacgra = value ;
   }

   public byte getgxTv_SdtSDTDispos_Disordsep( )
   {
      return gxTv_SdtSDTDispos_Disordsep ;
   }

   public void setgxTv_SdtSDTDispos_Disordsep( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disordsep = value ;
   }

   public byte getgxTv_SdtSDTDispos_Disordgra( )
   {
      return gxTv_SdtSDTDispos_Disordgra ;
   }

   public void setgxTv_SdtSDTDispos_Disordgra( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disordgra = value ;
   }

   public byte getgxTv_SdtSDTDispos_Disdescol( )
   {
      return gxTv_SdtSDTDispos_Disdescol ;
   }

   public void setgxTv_SdtSDTDispos_Disdescol( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdescol = value ;
   }

   public String getgxTv_SdtSDTDispos_Disgratam( )
   {
      return gxTv_SdtSDTDispos_Disgratam ;
   }

   public void setgxTv_SdtSDTDispos_Disgratam( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disgratam = value ;
   }

   public String getgxTv_SdtSDTDispos_Disrec( )
   {
      return gxTv_SdtSDTDispos_Disrec ;
   }

   public void setgxTv_SdtSDTDispos_Disrec( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disrec = value ;
   }

   public String getgxTv_SdtSDTDispos_Dismaqest( )
   {
      return gxTv_SdtSDTDispos_Dismaqest ;
   }

   public void setgxTv_SdtSDTDispos_Dismaqest( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dismaqest = value ;
   }

   public String getgxTv_SdtSDTDispos_Disexp( )
   {
      return gxTv_SdtSDTDispos_Disexp ;
   }

   public void setgxTv_SdtSDTDispos_Disexp( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disexp = value ;
   }

   public String getgxTv_SdtSDTDispos_Disfent( )
   {
      return gxTv_SdtSDTDispos_Disfent ;
   }

   public void setgxTv_SdtSDTDispos_Disfent( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disfent = value ;
   }

   public String getgxTv_SdtSDTDispos_Disdest( )
   {
      return gxTv_SdtSDTDispos_Disdest ;
   }

   public void setgxTv_SdtSDTDispos_Disdest( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdest = value ;
   }

   public java.util.Date getgxTv_SdtSDTDispos_Disfcht( )
   {
      return gxTv_SdtSDTDispos_Disfcht ;
   }

   public void setgxTv_SdtSDTDispos_Disfcht( java.util.Date value )
   {
      gxTv_SdtSDTDispos_Disfcht_N = (byte)(0) ;
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disfcht = value ;
   }

   public String getgxTv_SdtSDTDispos_Tb1_dscf( )
   {
      return gxTv_SdtSDTDispos_Tb1_dscf ;
   }

   public void setgxTv_SdtSDTDispos_Tb1_dscf( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Tb1_dscf = value ;
   }

   public String getgxTv_SdtSDTDispos_Disitem1( )
   {
      return gxTv_SdtSDTDispos_Disitem1 ;
   }

   public void setgxTv_SdtSDTDispos_Disitem1( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disitem1 = value ;
   }

   public String getgxTv_SdtSDTDispos_Disitem2( )
   {
      return gxTv_SdtSDTDispos_Disitem2 ;
   }

   public void setgxTv_SdtSDTDispos_Disitem2( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disitem2 = value ;
   }

   public String getgxTv_SdtSDTDispos_Disitem3( )
   {
      return gxTv_SdtSDTDispos_Disitem3 ;
   }

   public void setgxTv_SdtSDTDispos_Disitem3( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disitem3 = value ;
   }

   public String getgxTv_SdtSDTDispos_Disitem4( )
   {
      return gxTv_SdtSDTDispos_Disitem4 ;
   }

   public void setgxTv_SdtSDTDispos_Disitem4( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disitem4 = value ;
   }

   public String getgxTv_SdtSDTDispos_Disitem5( )
   {
      return gxTv_SdtSDTDispos_Disitem5 ;
   }

   public void setgxTv_SdtSDTDispos_Disitem5( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disitem5 = value ;
   }

   public String getgxTv_SdtSDTDispos_Disitem6( )
   {
      return gxTv_SdtSDTDispos_Disitem6 ;
   }

   public void setgxTv_SdtSDTDispos_Disitem6( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disitem6 = value ;
   }

   public String getgxTv_SdtSDTDispos_Cod_idtx( )
   {
      return gxTv_SdtSDTDispos_Cod_idtx ;
   }

   public void setgxTv_SdtSDTDispos_Cod_idtx( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Cod_idtx = value ;
   }

   public java.util.Date getgxTv_SdtSDTDispos_Disfecped( )
   {
      return gxTv_SdtSDTDispos_Disfecped ;
   }

   public void setgxTv_SdtSDTDispos_Disfecped( java.util.Date value )
   {
      gxTv_SdtSDTDispos_Disfecped_N = (byte)(0) ;
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disfecped = value ;
   }

   public short getgxTv_SdtSDTDispos_Dislotpza( )
   {
      return gxTv_SdtSDTDispos_Dislotpza ;
   }

   public void setgxTv_SdtSDTDispos_Dislotpza( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dislotpza = value ;
   }

   public String getgxTv_SdtSDTDispos_Dislotmaq( )
   {
      return gxTv_SdtSDTDispos_Dislotmaq ;
   }

   public void setgxTv_SdtSDTDispos_Dislotmaq( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dislotmaq = value ;
   }

   public int getgxTv_SdtSDTDispos_Disacafor( )
   {
      return gxTv_SdtSDTDispos_Disacafor ;
   }

   public void setgxTv_SdtSDTDispos_Disacafor( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disacafor = value ;
   }

   public String getgxTv_SdtSDTDispos_Dibcolcol( )
   {
      return gxTv_SdtSDTDispos_Dibcolcol ;
   }

   public void setgxTv_SdtSDTDispos_Dibcolcol( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dibcolcol = value ;
   }

   public int getgxTv_SdtSDTDispos_Disdibcocn( )
   {
      return gxTv_SdtSDTDispos_Disdibcocn ;
   }

   public void setgxTv_SdtSDTDispos_Disdibcocn( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdibcocn = value ;
   }

   public int getgxTv_SdtSDTDispos_Dibcolcoln( )
   {
      return gxTv_SdtSDTDispos_Dibcolcoln ;
   }

   public void setgxTv_SdtSDTDispos_Dibcolcoln( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dibcolcoln = value ;
   }

   public int getgxTv_SdtSDTDispos_Disdibcodn( )
   {
      return gxTv_SdtSDTDispos_Disdibcodn ;
   }

   public void setgxTv_SdtSDTDispos_Disdibcodn( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdibcodn = value ;
   }

   public byte getgxTv_SdtSDTDispos_Disultnot( )
   {
      return gxTv_SdtSDTDispos_Disultnot ;
   }

   public void setgxTv_SdtSDTDispos_Disultnot( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disultnot = value ;
   }

   public int getgxTv_SdtSDTDispos_Disparcod( )
   {
      return gxTv_SdtSDTDispos_Disparcod ;
   }

   public void setgxTv_SdtSDTDispos_Disparcod( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disparcod = value ;
   }

   public byte getgxTv_SdtSDTDispos_Disparreo( )
   {
      return gxTv_SdtSDTDispos_Disparreo ;
   }

   public void setgxTv_SdtSDTDispos_Disparreo( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disparreo = value ;
   }

   public String getgxTv_SdtSDTDispos_Disparpar( )
   {
      return gxTv_SdtSDTDispos_Disparpar ;
   }

   public void setgxTv_SdtSDTDispos_Disparpar( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disparpar = value ;
   }

   public String getgxTv_SdtSDTDispos_Dismemo1( )
   {
      return gxTv_SdtSDTDispos_Dismemo1 ;
   }

   public void setgxTv_SdtSDTDispos_Dismemo1( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dismemo1 = value ;
   }

   public String getgxTv_SdtSDTDispos_Dismemo2( )
   {
      return gxTv_SdtSDTDispos_Dismemo2 ;
   }

   public void setgxTv_SdtSDTDispos_Dismemo2( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dismemo2 = value ;
   }

   public String getgxTv_SdtSDTDispos_Marcaid( )
   {
      return gxTv_SdtSDTDispos_Marcaid ;
   }

   public void setgxTv_SdtSDTDispos_Marcaid( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Marcaid = value ;
   }

   public String getgxTv_SdtSDTDispos_Disordcomp( )
   {
      return gxTv_SdtSDTDispos_Disordcomp ;
   }

   public void setgxTv_SdtSDTDispos_Disordcomp( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disordcomp = value ;
   }

   public String getgxTv_SdtSDTDispos_Discnoenco( )
   {
      return gxTv_SdtSDTDispos_Discnoenco ;
   }

   public void setgxTv_SdtSDTDispos_Discnoenco( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discnoenco = value ;
   }

   public String getgxTv_SdtSDTDispos_Nxt_modelo( )
   {
      return gxTv_SdtSDTDispos_Nxt_modelo ;
   }

   public void setgxTv_SdtSDTDispos_Nxt_modelo( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Nxt_modelo = value ;
   }

   public short getgxTv_SdtSDTDispos_Cpteid( )
   {
      return gxTv_SdtSDTDispos_Cpteid ;
   }

   public void setgxTv_SdtSDTDispos_Cpteid( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Cpteid = value ;
   }

   public String getgxTv_SdtSDTDispos_Nxt_statio( )
   {
      return gxTv_SdtSDTDispos_Nxt_statio ;
   }

   public void setgxTv_SdtSDTDispos_Nxt_statio( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Nxt_statio = value ;
   }

   public short getgxTv_SdtSDTDispos_Desaid( )
   {
      return gxTv_SdtSDTDispos_Desaid ;
   }

   public void setgxTv_SdtSDTDispos_Desaid( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Desaid = value ;
   }

   public short getgxTv_SdtSDTDispos_Dptoid( )
   {
      return gxTv_SdtSDTDispos_Dptoid ;
   }

   public void setgxTv_SdtSDTDispos_Dptoid( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dptoid = value ;
   }

   public String getgxTv_SdtSDTDispos_Nxt_artcli( )
   {
      return gxTv_SdtSDTDispos_Nxt_artcli ;
   }

   public void setgxTv_SdtSDTDispos_Nxt_artcli( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Nxt_artcli = value ;
   }

   public String getgxTv_SdtSDTDispos_Disarttipd( )
   {
      return gxTv_SdtSDTDispos_Disarttipd ;
   }

   public void setgxTv_SdtSDTDispos_Disarttipd( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disarttipd = value ;
   }

   public String getgxTv_SdtSDTDispos_Distipcd( )
   {
      return gxTv_SdtSDTDispos_Distipcd ;
   }

   public void setgxTv_SdtSDTDispos_Distipcd( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Distipcd = value ;
   }

   public String getgxTv_SdtSDTDispos_Revenid( )
   {
      return gxTv_SdtSDTDispos_Revenid ;
   }

   public void setgxTv_SdtSDTDispos_Revenid( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Revenid = value ;
   }

   public byte getgxTv_SdtSDTDispos_Dispriorid( )
   {
      return gxTv_SdtSDTDispos_Dispriorid ;
   }

   public void setgxTv_SdtSDTDispos_Dispriorid( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispriorid = value ;
   }

   public byte getgxTv_SdtSDTDispos_Distpestam( )
   {
      return gxTv_SdtSDTDispos_Distpestam ;
   }

   public void setgxTv_SdtSDTDispos_Distpestam( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Distpestam = value ;
   }

   public String getgxTv_SdtSDTDispos_Disprodid( )
   {
      return gxTv_SdtSDTDispos_Disprodid ;
   }

   public void setgxTv_SdtSDTDispos_Disprodid( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disprodid = value ;
   }

   public String getgxTv_SdtSDTDispos_Disprodds( )
   {
      return gxTv_SdtSDTDispos_Disprodds ;
   }

   public void setgxTv_SdtSDTDispos_Disprodds( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disprodds = value ;
   }

   public String getgxTv_SdtSDTDispos_Disoekotex( )
   {
      return gxTv_SdtSDTDispos_Disoekotex ;
   }

   public void setgxTv_SdtSDTDispos_Disoekotex( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disoekotex = value ;
   }

   public short getgxTv_SdtSDTDispos_Dislineaid( )
   {
      return gxTv_SdtSDTDispos_Dislineaid ;
   }

   public void setgxTv_SdtSDTDispos_Dislineaid( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dislineaid = value ;
   }

   public int getgxTv_SdtSDTDispos_Discanalid( )
   {
      return gxTv_SdtSDTDispos_Discanalid ;
   }

   public void setgxTv_SdtSDTDispos_Discanalid( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discanalid = value ;
   }

   public String getgxTv_SdtSDTDispos_Dislinprd( )
   {
      return gxTv_SdtSDTDispos_Dislinprd ;
   }

   public void setgxTv_SdtSDTDispos_Dislinprd( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dislinprd = value ;
   }

   public byte getgxTv_SdtSDTDispos_Disdgultli( )
   {
      return gxTv_SdtSDTDispos_Disdgultli ;
   }

   public void setgxTv_SdtSDTDispos_Disdgultli( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdgultli = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDispos_Disdgsummts( )
   {
      return gxTv_SdtSDTDispos_Disdgsummts ;
   }

   public void setgxTv_SdtSDTDispos_Disdgsummts( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdgsummts = value ;
   }

   public int getgxTv_SdtSDTDispos_Disdgsumpzs( )
   {
      return gxTv_SdtSDTDispos_Disdgsumpzs ;
   }

   public void setgxTv_SdtSDTDispos_Disdgsumpzs( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdgsumpzs = value ;
   }

   public long getgxTv_SdtSDTDispos_Disrgb( )
   {
      return gxTv_SdtSDTDispos_Disrgb ;
   }

   public void setgxTv_SdtSDTDispos_Disrgb( long value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disrgb = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTDispos_Emprcod = "" ;
      gxTv_SdtSDTDispos_N = (byte)(1) ;
      gxTv_SdtSDTDispos_Disdes = "" ;
      gxTv_SdtSDTDispos_Disartcod = "" ;
      gxTv_SdtSDTDispos_Disnumuni = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Disunimed = "" ;
      gxTv_SdtSDTDispos_Pricod = "" ;
      gxTv_SdtSDTDispos_Disclinum = "" ;
      gxTv_SdtSDTDispos_Disfeccli = GXutil.nullDate() ;
      gxTv_SdtSDTDispos_Disfeccli_N = (byte)(1) ;
      gxTv_SdtSDTDispos_Disfec = GXutil.nullDate() ;
      gxTv_SdtSDTDispos_Disfec_N = (byte)(1) ;
      gxTv_SdtSDTDispos_Disfecent = GXutil.nullDate() ;
      gxTv_SdtSDTDispos_Disfecent_N = (byte)(1) ;
      gxTv_SdtSDTDispos_Discolnom = "" ;
      gxTv_SdtSDTDispos_Disartdsc = "" ;
      gxTv_SdtSDTDispos_Dispiekgm = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Dispiemtr = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Disent = "" ;
      gxTv_SdtSDTDispos_Disartmat = "" ;
      gxTv_SdtSDTDispos_Disartlar = "" ;
      gxTv_SdtSDTDispos_Disartsua = "" ;
      gxTv_SdtSDTDispos_Disartaca = "" ;
      gxTv_SdtSDTDispos_Disartple = "" ;
      gxTv_SdtSDTDispos_Disartenc = "" ;
      gxTv_SdtSDTDispos_Disartcor = "" ;
      gxTv_SdtSDTDispos_Disartope = "" ;
      gxTv_SdtSDTDispos_Disarttr1 = "" ;
      gxTv_SdtSDTDispos_Disarttr2 = "" ;
      gxTv_SdtSDTDispos_Disarttr3 = "" ;
      gxTv_SdtSDTDispos_Disartrdt = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Disartur1 = "" ;
      gxTv_SdtSDTDispos_Disartur2 = "" ;
      gxTv_SdtSDTDispos_Disartur3 = "" ;
      gxTv_SdtSDTDispos_Disprekgm = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Dispremtr = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Emprcoddis = "" ;
      gxTv_SdtSDTDispos_Findcol = "" ;
      gxTv_SdtSDTDispos_Disuni = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Disnmtr = "" ;
      gxTv_SdtSDTDispos_Disnmez = "" ;
      gxTv_SdtSDTDispos_Findton = "" ;
      gxTv_SdtSDTDispos_Disnumten = "" ;
      gxTv_SdtSDTDispos_Maqcoddis = "" ;
      gxTv_SdtSDTDispos_Partcod = "" ;
      gxTv_SdtSDTDispos_Tipconnom = "" ;
      gxTv_SdtSDTDispos_Disnomcli = "" ;
      gxTv_SdtSDTDispos_Disenccom = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Disencanh = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Disloc = "" ;
      gxTv_SdtSDTDispos_Disrdon = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Disrdoa = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Disres = "" ;
      gxTv_SdtSDTDispos_Distipdis = "" ;
      gxTv_SdtSDTDispos_Discodtex = "" ;
      gxTv_SdtSDTDispos_Diskgslot = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Dismtrlot = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Displa = "" ;
      gxTv_SdtSDTDispos_Disple2 = "" ;
      gxTv_SdtSDTDispos_Disfac = "" ;
      gxTv_SdtSDTDispos_Disnumton = "" ;
      gxTv_SdtSDTDispos_Disreftmt = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Disreftkg = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Disfeclan = GXutil.nullDate() ;
      gxTv_SdtSDTDispos_Disfeclan_N = (byte)(1) ;
      gxTv_SdtSDTDispos_Retcod = "" ;
      gxTv_SdtSDTDispos_Disartmer = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Empescod = "" ;
      gxTv_SdtSDTDispos_Dibcli = "" ;
      gxTv_SdtSDTDispos_Disobs = "" ;
      gxTv_SdtSDTDispos_Totnuni = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Distin = "" ;
      gxTv_SdtSDTDispos_Disusrcod = "" ;
      gxTv_SdtSDTDispos_Discrumts = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Discrukgs = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Discruenr = "" ;
      gxTv_SdtSDTDispos_Dislotmts = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Dislotkgs = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Disacabak = "" ;
      gxTv_SdtSDTDispos_Disacamar = "" ;
      gxTv_SdtSDTDispos_Dismdlcod = "" ;
      gxTv_SdtSDTDispos_Distam = "" ;
      gxTv_SdtSDTDispos_Dishorent = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTDispos_Dishorent_N = (byte)(1) ;
      gxTv_SdtSDTDispos_Dishorreg = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTDispos_Dishorreg_N = (byte)(1) ;
      gxTv_SdtSDTDispos_Disdishcod = "" ;
      gxTv_SdtSDTDispos_Disenccli = "" ;
      gxTv_SdtSDTDispos_Dibcoldib = "" ;
      gxTv_SdtSDTDispos_Discom = "" ;
      gxTv_SdtSDTDispos_Disesttip = "" ;
      gxTv_SdtSDTDispos_Dispiepdm = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Dispiepdk = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Disacc = "" ;
      gxTv_SdtSDTDispos_Distipcor = "" ;
      gxTv_SdtSDTDispos_Disobsgrm = "" ;
      gxTv_SdtSDTDispos_Disobsanc = "" ;
      gxTv_SdtSDTDispos_Disantp = "" ;
      gxTv_SdtSDTDispos_Disantpt = "" ;
      gxTv_SdtSDTDispos_Disrbmaq = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Disdto = DecimalUtil.ZERO ;
      gxTv_SdtSDTDispos_Disgratam = "" ;
      gxTv_SdtSDTDispos_Disrec = "" ;
      gxTv_SdtSDTDispos_Dismaqest = "" ;
      gxTv_SdtSDTDispos_Disexp = "" ;
      gxTv_SdtSDTDispos_Disfent = "" ;
      gxTv_SdtSDTDispos_Disdest = "" ;
      gxTv_SdtSDTDispos_Disfcht = GXutil.nullDate() ;
      gxTv_SdtSDTDispos_Disfcht_N = (byte)(1) ;
      gxTv_SdtSDTDispos_Tb1_dscf = "" ;
      gxTv_SdtSDTDispos_Disitem1 = "" ;
      gxTv_SdtSDTDispos_Disitem2 = "" ;
      gxTv_SdtSDTDispos_Disitem3 = "" ;
      gxTv_SdtSDTDispos_Disitem4 = "" ;
      gxTv_SdtSDTDispos_Disitem5 = "" ;
      gxTv_SdtSDTDispos_Disitem6 = "" ;
      gxTv_SdtSDTDispos_Cod_idtx = "" ;
      gxTv_SdtSDTDispos_Disfecped = GXutil.nullDate() ;
      gxTv_SdtSDTDispos_Disfecped_N = (byte)(1) ;
      gxTv_SdtSDTDispos_Dislotmaq = "" ;
      gxTv_SdtSDTDispos_Dibcolcol = "" ;
      gxTv_SdtSDTDispos_Disparpar = "" ;
      gxTv_SdtSDTDispos_Dismemo1 = "" ;
      gxTv_SdtSDTDispos_Dismemo2 = "" ;
      gxTv_SdtSDTDispos_Marcaid = "" ;
      gxTv_SdtSDTDispos_Disordcomp = "" ;
      gxTv_SdtSDTDispos_Discnoenco = "" ;
      gxTv_SdtSDTDispos_Nxt_modelo = "" ;
      gxTv_SdtSDTDispos_Nxt_statio = "" ;
      gxTv_SdtSDTDispos_Nxt_artcli = "" ;
      gxTv_SdtSDTDispos_Disarttipd = "" ;
      gxTv_SdtSDTDispos_Distipcd = "" ;
      gxTv_SdtSDTDispos_Revenid = "" ;
      gxTv_SdtSDTDispos_Disprodid = "" ;
      gxTv_SdtSDTDispos_Disprodds = "" ;
      gxTv_SdtSDTDispos_Disoekotex = "" ;
      gxTv_SdtSDTDispos_Dislinprd = "" ;
      gxTv_SdtSDTDispos_Disdgsummts = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTDispos_N ;
   }

   public app.SdtSDTDispos Clone( )
   {
      return (app.SdtSDTDispos)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTDispos struct )
   {
      setgxTv_SdtSDTDispos_Emprcod(struct.getEmprcod());
      setgxTv_SdtSDTDispos_Discod(struct.getDiscod());
      setgxTv_SdtSDTDispos_Disdes(struct.getDisdes());
      setgxTv_SdtSDTDispos_Disartcod(struct.getDisartcod());
      setgxTv_SdtSDTDispos_Disnumpie(struct.getDisnumpie());
      setgxTv_SdtSDTDispos_Disnumuni(struct.getDisnumuni());
      setgxTv_SdtSDTDispos_Disunimed(struct.getDisunimed());
      setgxTv_SdtSDTDispos_Disartpes(struct.getDisartpes());
      setgxTv_SdtSDTDispos_Pricod(struct.getPricod());
      setgxTv_SdtSDTDispos_Disclinum(struct.getDisclinum());
      if ( struct.gxTv_SdtSDTDispos_Disfeccli_N == 0 )
      {
         setgxTv_SdtSDTDispos_Disfeccli(struct.getDisfeccli());
      }
      if ( struct.gxTv_SdtSDTDispos_Disfec_N == 0 )
      {
         setgxTv_SdtSDTDispos_Disfec(struct.getDisfec());
      }
      if ( struct.gxTv_SdtSDTDispos_Disfecent_N == 0 )
      {
         setgxTv_SdtSDTDispos_Disfecent(struct.getDisfecent());
      }
      setgxTv_SdtSDTDispos_Discolnom(struct.getDiscolnom());
      setgxTv_SdtSDTDispos_Discolnum(struct.getDiscolnum());
      setgxTv_SdtSDTDispos_Distipcol(struct.getDistipcol());
      setgxTv_SdtSDTDispos_Disartdsc(struct.getDisartdsc());
      setgxTv_SdtSDTDispos_Dispiepie(struct.getDispiepie());
      setgxTv_SdtSDTDispos_Dispiekgm(struct.getDispiekgm());
      setgxTv_SdtSDTDispos_Dispiemtr(struct.getDispiemtr());
      setgxTv_SdtSDTDispos_Disdefcon(struct.getDisdefcon());
      setgxTv_SdtSDTDispos_Dispienor(struct.getDispienor());
      setgxTv_SdtSDTDispos_Sumpor(struct.getSumpor());
      setgxTv_SdtSDTDispos_Disent(struct.getDisent());
      setgxTv_SdtSDTDispos_Disobsulin(struct.getDisobsulin());
      setgxTv_SdtSDTDispos_Disartmat(struct.getDisartmat());
      setgxTv_SdtSDTDispos_Disartlar(struct.getDisartlar());
      setgxTv_SdtSDTDispos_Disartsua(struct.getDisartsua());
      setgxTv_SdtSDTDispos_Disartaca(struct.getDisartaca());
      setgxTv_SdtSDTDispos_Disartple(struct.getDisartple());
      setgxTv_SdtSDTDispos_Disarttip(struct.getDisarttip());
      setgxTv_SdtSDTDispos_Disartenc(struct.getDisartenc());
      setgxTv_SdtSDTDispos_Disartcor(struct.getDisartcor());
      setgxTv_SdtSDTDispos_Disartope(struct.getDisartope());
      setgxTv_SdtSDTDispos_Disarttr1(struct.getDisarttr1());
      setgxTv_SdtSDTDispos_Disartpt1(struct.getDisartpt1());
      setgxTv_SdtSDTDispos_Disarttr2(struct.getDisarttr2());
      setgxTv_SdtSDTDispos_Disartpt2(struct.getDisartpt2());
      setgxTv_SdtSDTDispos_Disarttr3(struct.getDisarttr3());
      setgxTv_SdtSDTDispos_Disartpt3(struct.getDisartpt3());
      setgxTv_SdtSDTDispos_Disartrdt(struct.getDisartrdt());
      setgxTv_SdtSDTDispos_Disarturg(struct.getDisarturg());
      setgxTv_SdtSDTDispos_Disartur1(struct.getDisartur1());
      setgxTv_SdtSDTDispos_Disartpu1(struct.getDisartpu1());
      setgxTv_SdtSDTDispos_Disartur2(struct.getDisartur2());
      setgxTv_SdtSDTDispos_Disartpu2(struct.getDisartpu2());
      setgxTv_SdtSDTDispos_Disartur3(struct.getDisartur3());
      setgxTv_SdtSDTDispos_Disartpu3(struct.getDisartpu3());
      setgxTv_SdtSDTDispos_Disartanh(struct.getDisartanh());
      setgxTv_SdtSDTDispos_Disest(struct.getDisest());
      setgxTv_SdtSDTDispos_Disprekgm(struct.getDisprekgm());
      setgxTv_SdtSDTDispos_Dispremtr(struct.getDispremtr());
      setgxTv_SdtSDTDispos_Dispielan(struct.getDispielan());
      setgxTv_SdtSDTDispos_Diskgmlan(struct.getDiskgmlan());
      setgxTv_SdtSDTDispos_Dismtrlan(struct.getDismtrlan());
      setgxTv_SdtSDTDispos_Emprcoddis(struct.getEmprcoddis());
      setgxTv_SdtSDTDispos_Clicoddis(struct.getClicoddis());
      setgxTv_SdtSDTDispos_Findcol(struct.getFindcol());
      setgxTv_SdtSDTDispos_Dispie(struct.getDispie());
      setgxTv_SdtSDTDispos_Disuni(struct.getDisuni());
      setgxTv_SdtSDTDispos_Disnmtr(struct.getDisnmtr());
      setgxTv_SdtSDTDispos_Disnmez(struct.getDisnmez());
      setgxTv_SdtSDTDispos_Findint(struct.getFindint());
      setgxTv_SdtSDTDispos_Findton(struct.getFindton());
      setgxTv_SdtSDTDispos_Disnumten(struct.getDisnumten());
      setgxTv_SdtSDTDispos_Maqcoddis(struct.getMaqcoddis());
      setgxTv_SdtSDTDispos_Partcod(struct.getPartcod());
      setgxTv_SdtSDTDispos_Clicod(struct.getClicod());
      setgxTv_SdtSDTDispos_Tipconcod(struct.getTipconcod());
      setgxTv_SdtSDTDispos_Tipconnom(struct.getTipconnom());
      setgxTv_SdtSDTDispos_Disnomcli(struct.getDisnomcli());
      setgxTv_SdtSDTDispos_Disnumcli(struct.getDisnumcli());
      setgxTv_SdtSDTDispos_Disenccom(struct.getDisenccom());
      setgxTv_SdtSDTDispos_Disencanh(struct.getDisencanh());
      setgxTv_SdtSDTDispos_Disgracru(struct.getDisgracru());
      setgxTv_SdtSDTDispos_Disartan1(struct.getDisartan1());
      setgxTv_SdtSDTDispos_Disartacb(struct.getDisartacb());
      setgxTv_SdtSDTDispos_Disartac2(struct.getDisartac2());
      setgxTv_SdtSDTDispos_Disloc(struct.getDisloc());
      setgxTv_SdtSDTDispos_Dispart(struct.getDispart());
      setgxTv_SdtSDTDispos_Disgraaca(struct.getDisgraaca());
      setgxTv_SdtSDTDispos_Disrdon(struct.getDisrdon());
      setgxTv_SdtSDTDispos_Disrdoa(struct.getDisrdoa());
      setgxTv_SdtSDTDispos_Disres(struct.getDisres());
      setgxTv_SdtSDTDispos_Distipdis(struct.getDistipdis());
      setgxTv_SdtSDTDispos_Disnumbas(struct.getDisnumbas());
      setgxTv_SdtSDTDispos_Disclides(struct.getDisclides());
      setgxTv_SdtSDTDispos_Dismancod(struct.getDismancod());
      setgxTv_SdtSDTDispos_Disopeant(struct.getDisopeant());
      setgxTv_SdtSDTDispos_Discodtex(struct.getDiscodtex());
      setgxTv_SdtSDTDispos_Disnumtex1(struct.getDisnumtex1());
      setgxTv_SdtSDTDispos_Disnumtex2(struct.getDisnumtex2());
      setgxTv_SdtSDTDispos_Disnumlot(struct.getDisnumlot());
      setgxTv_SdtSDTDispos_Diskgslot(struct.getDiskgslot());
      setgxTv_SdtSDTDispos_Dismtrlot(struct.getDismtrlot());
      setgxTv_SdtSDTDispos_Displa(struct.getDispla());
      setgxTv_SdtSDTDispos_Disple2(struct.getDisple2());
      setgxTv_SdtSDTDispos_Disnumcor(struct.getDisnumcor());
      setgxTv_SdtSDTDispos_Disancsal1(struct.getDisancsal1());
      setgxTv_SdtSDTDispos_Disancsal2(struct.getDisancsal2());
      setgxTv_SdtSDTDispos_Disancsal3(struct.getDisancsal3());
      setgxTv_SdtSDTDispos_Disgraaca2(struct.getDisgraaca2());
      setgxTv_SdtSDTDispos_Disgracru2(struct.getDisgracru2());
      setgxTv_SdtSDTDispos_Disfac(struct.getDisfac());
      setgxTv_SdtSDTDispos_Dismancod1(struct.getDismancod1());
      setgxTv_SdtSDTDispos_Dismancod2(struct.getDismancod2());
      setgxTv_SdtSDTDispos_Disnumton(struct.getDisnumton());
      setgxTv_SdtSDTDispos_Disnumalb(struct.getDisnumalb());
      setgxTv_SdtSDTDispos_Disreftmt(struct.getDisreftmt());
      setgxTv_SdtSDTDispos_Disreftkg(struct.getDisreftkg());
      setgxTv_SdtSDTDispos_Disreftpz(struct.getDisreftpz());
      if ( struct.gxTv_SdtSDTDispos_Disfeclan_N == 0 )
      {
         setgxTv_SdtSDTDispos_Disfeclan(struct.getDisfeclan());
      }
      setgxTv_SdtSDTDispos_Retcod(struct.getRetcod());
      setgxTv_SdtSDTDispos_Disartmer(struct.getDisartmer());
      setgxTv_SdtSDTDispos_Empescod(struct.getEmpescod());
      setgxTv_SdtSDTDispos_Dibcli(struct.getDibcli());
      setgxTv_SdtSDTDispos_Dibint(struct.getDibint());
      setgxTv_SdtSDTDispos_Disdibnum(struct.getDisdibnum());
      setgxTv_SdtSDTDispos_Disnumcol(struct.getDisnumcol());
      setgxTv_SdtSDTDispos_Disobs(struct.getDisobs());
      setgxTv_SdtSDTDispos_Totnpie(struct.getTotnpie());
      setgxTv_SdtSDTDispos_Totnuni(struct.getTotnuni());
      setgxTv_SdtSDTDispos_Discomulin(struct.getDiscomulin());
      setgxTv_SdtSDTDispos_Disenv(struct.getDisenv());
      setgxTv_SdtSDTDispos_Distin(struct.getDistin());
      setgxTv_SdtSDTDispos_Disnpzas(struct.getDisnpzas());
      setgxTv_SdtSDTDispos_Disnpzasl(struct.getDisnpzasl());
      setgxTv_SdtSDTDispos_Disusrcod(struct.getDisusrcod());
      setgxTv_SdtSDTDispos_Dispelanh(struct.getDispelanh());
      setgxTv_SdtSDTDispos_Discrumts(struct.getDiscrumts());
      setgxTv_SdtSDTDispos_Discrukgs(struct.getDiscrukgs());
      setgxTv_SdtSDTDispos_Discruenr(struct.getDiscruenr());
      setgxTv_SdtSDTDispos_Dislotmts(struct.getDislotmts());
      setgxTv_SdtSDTDispos_Dislotkgs(struct.getDislotkgs());
      setgxTv_SdtSDTDispos_Disacabak(struct.getDisacabak());
      setgxTv_SdtSDTDispos_Disacaanh(struct.getDisacaanh());
      setgxTv_SdtSDTDispos_Disacamar(struct.getDisacamar());
      setgxTv_SdtSDTDispos_Dismdlcod(struct.getDismdlcod());
      setgxTv_SdtSDTDispos_Distam(struct.getDistam());
      if ( struct.gxTv_SdtSDTDispos_Dishorent_N == 0 )
      {
         setgxTv_SdtSDTDispos_Dishorent(struct.getDishorent());
      }
      if ( struct.gxTv_SdtSDTDispos_Dishorreg_N == 0 )
      {
         setgxTv_SdtSDTDispos_Dishorreg(struct.getDishorreg());
      }
      setgxTv_SdtSDTDispos_Disdishcod(struct.getDisdishcod());
      setgxTv_SdtSDTDispos_Disnrocor(struct.getDisnrocor());
      setgxTv_SdtSDTDispos_Disenccli(struct.getDisenccli());
      setgxTv_SdtSDTDispos_Dibcoldib(struct.getDibcoldib());
      setgxTv_SdtSDTDispos_Distipest(struct.getDistipest());
      setgxTv_SdtSDTDispos_Disgracob(struct.getDisgracob());
      setgxTv_SdtSDTDispos_Discom(struct.getDiscom());
      setgxTv_SdtSDTDispos_Disesttip(struct.getDisesttip());
      setgxTv_SdtSDTDispos_Dispiepdm(struct.getDispiepdm());
      setgxTv_SdtSDTDispos_Dispiepdk(struct.getDispiepdk());
      setgxTv_SdtSDTDispos_Dispiepdp(struct.getDispiepdp());
      setgxTv_SdtSDTDispos_Disacc(struct.getDisacc());
      setgxTv_SdtSDTDispos_Distipcor(struct.getDistipcor());
      setgxTv_SdtSDTDispos_Disobsgrm(struct.getDisobsgrm());
      setgxTv_SdtSDTDispos_Disobsanc(struct.getDisobsanc());
      setgxTv_SdtSDTDispos_Disantp(struct.getDisantp());
      setgxTv_SdtSDTDispos_Disantpt(struct.getDisantpt());
      setgxTv_SdtSDTDispos_Disvolmaq(struct.getDisvolmaq());
      setgxTv_SdtSDTDispos_Disrbmaq(struct.getDisrbmaq());
      setgxTv_SdtSDTDispos_Disdto(struct.getDisdto());
      setgxTv_SdtSDTDispos_Disfacsep(struct.getDisfacsep());
      setgxTv_SdtSDTDispos_Disfacgra(struct.getDisfacgra());
      setgxTv_SdtSDTDispos_Disordsep(struct.getDisordsep());
      setgxTv_SdtSDTDispos_Disordgra(struct.getDisordgra());
      setgxTv_SdtSDTDispos_Disdescol(struct.getDisdescol());
      setgxTv_SdtSDTDispos_Disgratam(struct.getDisgratam());
      setgxTv_SdtSDTDispos_Disrec(struct.getDisrec());
      setgxTv_SdtSDTDispos_Dismaqest(struct.getDismaqest());
      setgxTv_SdtSDTDispos_Disexp(struct.getDisexp());
      setgxTv_SdtSDTDispos_Disfent(struct.getDisfent());
      setgxTv_SdtSDTDispos_Disdest(struct.getDisdest());
      if ( struct.gxTv_SdtSDTDispos_Disfcht_N == 0 )
      {
         setgxTv_SdtSDTDispos_Disfcht(struct.getDisfcht());
      }
      setgxTv_SdtSDTDispos_Tb1_dscf(struct.getTb1_dscf());
      setgxTv_SdtSDTDispos_Disitem1(struct.getDisitem1());
      setgxTv_SdtSDTDispos_Disitem2(struct.getDisitem2());
      setgxTv_SdtSDTDispos_Disitem3(struct.getDisitem3());
      setgxTv_SdtSDTDispos_Disitem4(struct.getDisitem4());
      setgxTv_SdtSDTDispos_Disitem5(struct.getDisitem5());
      setgxTv_SdtSDTDispos_Disitem6(struct.getDisitem6());
      setgxTv_SdtSDTDispos_Cod_idtx(struct.getCod_idtx());
      if ( struct.gxTv_SdtSDTDispos_Disfecped_N == 0 )
      {
         setgxTv_SdtSDTDispos_Disfecped(struct.getDisfecped());
      }
      setgxTv_SdtSDTDispos_Dislotpza(struct.getDislotpza());
      setgxTv_SdtSDTDispos_Dislotmaq(struct.getDislotmaq());
      setgxTv_SdtSDTDispos_Disacafor(struct.getDisacafor());
      setgxTv_SdtSDTDispos_Dibcolcol(struct.getDibcolcol());
      setgxTv_SdtSDTDispos_Disdibcocn(struct.getDisdibcocn());
      setgxTv_SdtSDTDispos_Dibcolcoln(struct.getDibcolcoln());
      setgxTv_SdtSDTDispos_Disdibcodn(struct.getDisdibcodn());
      setgxTv_SdtSDTDispos_Disultnot(struct.getDisultnot());
      setgxTv_SdtSDTDispos_Disparcod(struct.getDisparcod());
      setgxTv_SdtSDTDispos_Disparreo(struct.getDisparreo());
      setgxTv_SdtSDTDispos_Disparpar(struct.getDisparpar());
      setgxTv_SdtSDTDispos_Dismemo1(struct.getDismemo1());
      setgxTv_SdtSDTDispos_Dismemo2(struct.getDismemo2());
      setgxTv_SdtSDTDispos_Marcaid(struct.getMarcaid());
      setgxTv_SdtSDTDispos_Disordcomp(struct.getDisordcomp());
      setgxTv_SdtSDTDispos_Discnoenco(struct.getDiscnoenco());
      setgxTv_SdtSDTDispos_Nxt_modelo(struct.getNxt_modelo());
      setgxTv_SdtSDTDispos_Cpteid(struct.getCpteid());
      setgxTv_SdtSDTDispos_Nxt_statio(struct.getNxt_statio());
      setgxTv_SdtSDTDispos_Desaid(struct.getDesaid());
      setgxTv_SdtSDTDispos_Dptoid(struct.getDptoid());
      setgxTv_SdtSDTDispos_Nxt_artcli(struct.getNxt_artcli());
      setgxTv_SdtSDTDispos_Disarttipd(struct.getDisarttipd());
      setgxTv_SdtSDTDispos_Distipcd(struct.getDistipcd());
      setgxTv_SdtSDTDispos_Revenid(struct.getRevenid());
      setgxTv_SdtSDTDispos_Dispriorid(struct.getDispriorid());
      setgxTv_SdtSDTDispos_Distpestam(struct.getDistpestam());
      setgxTv_SdtSDTDispos_Disprodid(struct.getDisprodid());
      setgxTv_SdtSDTDispos_Disprodds(struct.getDisprodds());
      setgxTv_SdtSDTDispos_Disoekotex(struct.getDisoekotex());
      setgxTv_SdtSDTDispos_Dislineaid(struct.getDislineaid());
      setgxTv_SdtSDTDispos_Discanalid(struct.getDiscanalid());
      setgxTv_SdtSDTDispos_Dislinprd(struct.getDislinprd());
      setgxTv_SdtSDTDispos_Disdgultli(struct.getDisdgultli());
      setgxTv_SdtSDTDispos_Disdgsummts(struct.getDisdgsummts());
      setgxTv_SdtSDTDispos_Disdgsumpzs(struct.getDisdgsumpzs());
      setgxTv_SdtSDTDispos_Disrgb(struct.getDisrgb());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTDispos getStruct( )
   {
      app.StructSdtSDTDispos struct = new app.StructSdtSDTDispos ();
      struct.setEmprcod(getgxTv_SdtSDTDispos_Emprcod());
      struct.setDiscod(getgxTv_SdtSDTDispos_Discod());
      struct.setDisdes(getgxTv_SdtSDTDispos_Disdes());
      struct.setDisartcod(getgxTv_SdtSDTDispos_Disartcod());
      struct.setDisnumpie(getgxTv_SdtSDTDispos_Disnumpie());
      struct.setDisnumuni(getgxTv_SdtSDTDispos_Disnumuni());
      struct.setDisunimed(getgxTv_SdtSDTDispos_Disunimed());
      struct.setDisartpes(getgxTv_SdtSDTDispos_Disartpes());
      struct.setPricod(getgxTv_SdtSDTDispos_Pricod());
      struct.setDisclinum(getgxTv_SdtSDTDispos_Disclinum());
      if ( gxTv_SdtSDTDispos_Disfeccli_N == 0 )
      {
         struct.setDisfeccli(getgxTv_SdtSDTDispos_Disfeccli());
      }
      if ( gxTv_SdtSDTDispos_Disfec_N == 0 )
      {
         struct.setDisfec(getgxTv_SdtSDTDispos_Disfec());
      }
      if ( gxTv_SdtSDTDispos_Disfecent_N == 0 )
      {
         struct.setDisfecent(getgxTv_SdtSDTDispos_Disfecent());
      }
      struct.setDiscolnom(getgxTv_SdtSDTDispos_Discolnom());
      struct.setDiscolnum(getgxTv_SdtSDTDispos_Discolnum());
      struct.setDistipcol(getgxTv_SdtSDTDispos_Distipcol());
      struct.setDisartdsc(getgxTv_SdtSDTDispos_Disartdsc());
      struct.setDispiepie(getgxTv_SdtSDTDispos_Dispiepie());
      struct.setDispiekgm(getgxTv_SdtSDTDispos_Dispiekgm());
      struct.setDispiemtr(getgxTv_SdtSDTDispos_Dispiemtr());
      struct.setDisdefcon(getgxTv_SdtSDTDispos_Disdefcon());
      struct.setDispienor(getgxTv_SdtSDTDispos_Dispienor());
      struct.setSumpor(getgxTv_SdtSDTDispos_Sumpor());
      struct.setDisent(getgxTv_SdtSDTDispos_Disent());
      struct.setDisobsulin(getgxTv_SdtSDTDispos_Disobsulin());
      struct.setDisartmat(getgxTv_SdtSDTDispos_Disartmat());
      struct.setDisartlar(getgxTv_SdtSDTDispos_Disartlar());
      struct.setDisartsua(getgxTv_SdtSDTDispos_Disartsua());
      struct.setDisartaca(getgxTv_SdtSDTDispos_Disartaca());
      struct.setDisartple(getgxTv_SdtSDTDispos_Disartple());
      struct.setDisarttip(getgxTv_SdtSDTDispos_Disarttip());
      struct.setDisartenc(getgxTv_SdtSDTDispos_Disartenc());
      struct.setDisartcor(getgxTv_SdtSDTDispos_Disartcor());
      struct.setDisartope(getgxTv_SdtSDTDispos_Disartope());
      struct.setDisarttr1(getgxTv_SdtSDTDispos_Disarttr1());
      struct.setDisartpt1(getgxTv_SdtSDTDispos_Disartpt1());
      struct.setDisarttr2(getgxTv_SdtSDTDispos_Disarttr2());
      struct.setDisartpt2(getgxTv_SdtSDTDispos_Disartpt2());
      struct.setDisarttr3(getgxTv_SdtSDTDispos_Disarttr3());
      struct.setDisartpt3(getgxTv_SdtSDTDispos_Disartpt3());
      struct.setDisartrdt(getgxTv_SdtSDTDispos_Disartrdt());
      struct.setDisarturg(getgxTv_SdtSDTDispos_Disarturg());
      struct.setDisartur1(getgxTv_SdtSDTDispos_Disartur1());
      struct.setDisartpu1(getgxTv_SdtSDTDispos_Disartpu1());
      struct.setDisartur2(getgxTv_SdtSDTDispos_Disartur2());
      struct.setDisartpu2(getgxTv_SdtSDTDispos_Disartpu2());
      struct.setDisartur3(getgxTv_SdtSDTDispos_Disartur3());
      struct.setDisartpu3(getgxTv_SdtSDTDispos_Disartpu3());
      struct.setDisartanh(getgxTv_SdtSDTDispos_Disartanh());
      struct.setDisest(getgxTv_SdtSDTDispos_Disest());
      struct.setDisprekgm(getgxTv_SdtSDTDispos_Disprekgm());
      struct.setDispremtr(getgxTv_SdtSDTDispos_Dispremtr());
      struct.setDispielan(getgxTv_SdtSDTDispos_Dispielan());
      struct.setDiskgmlan(getgxTv_SdtSDTDispos_Diskgmlan());
      struct.setDismtrlan(getgxTv_SdtSDTDispos_Dismtrlan());
      struct.setEmprcoddis(getgxTv_SdtSDTDispos_Emprcoddis());
      struct.setClicoddis(getgxTv_SdtSDTDispos_Clicoddis());
      struct.setFindcol(getgxTv_SdtSDTDispos_Findcol());
      struct.setDispie(getgxTv_SdtSDTDispos_Dispie());
      struct.setDisuni(getgxTv_SdtSDTDispos_Disuni());
      struct.setDisnmtr(getgxTv_SdtSDTDispos_Disnmtr());
      struct.setDisnmez(getgxTv_SdtSDTDispos_Disnmez());
      struct.setFindint(getgxTv_SdtSDTDispos_Findint());
      struct.setFindton(getgxTv_SdtSDTDispos_Findton());
      struct.setDisnumten(getgxTv_SdtSDTDispos_Disnumten());
      struct.setMaqcoddis(getgxTv_SdtSDTDispos_Maqcoddis());
      struct.setPartcod(getgxTv_SdtSDTDispos_Partcod());
      struct.setClicod(getgxTv_SdtSDTDispos_Clicod());
      struct.setTipconcod(getgxTv_SdtSDTDispos_Tipconcod());
      struct.setTipconnom(getgxTv_SdtSDTDispos_Tipconnom());
      struct.setDisnomcli(getgxTv_SdtSDTDispos_Disnomcli());
      struct.setDisnumcli(getgxTv_SdtSDTDispos_Disnumcli());
      struct.setDisenccom(getgxTv_SdtSDTDispos_Disenccom());
      struct.setDisencanh(getgxTv_SdtSDTDispos_Disencanh());
      struct.setDisgracru(getgxTv_SdtSDTDispos_Disgracru());
      struct.setDisartan1(getgxTv_SdtSDTDispos_Disartan1());
      struct.setDisartacb(getgxTv_SdtSDTDispos_Disartacb());
      struct.setDisartac2(getgxTv_SdtSDTDispos_Disartac2());
      struct.setDisloc(getgxTv_SdtSDTDispos_Disloc());
      struct.setDispart(getgxTv_SdtSDTDispos_Dispart());
      struct.setDisgraaca(getgxTv_SdtSDTDispos_Disgraaca());
      struct.setDisrdon(getgxTv_SdtSDTDispos_Disrdon());
      struct.setDisrdoa(getgxTv_SdtSDTDispos_Disrdoa());
      struct.setDisres(getgxTv_SdtSDTDispos_Disres());
      struct.setDistipdis(getgxTv_SdtSDTDispos_Distipdis());
      struct.setDisnumbas(getgxTv_SdtSDTDispos_Disnumbas());
      struct.setDisclides(getgxTv_SdtSDTDispos_Disclides());
      struct.setDismancod(getgxTv_SdtSDTDispos_Dismancod());
      struct.setDisopeant(getgxTv_SdtSDTDispos_Disopeant());
      struct.setDiscodtex(getgxTv_SdtSDTDispos_Discodtex());
      struct.setDisnumtex1(getgxTv_SdtSDTDispos_Disnumtex1());
      struct.setDisnumtex2(getgxTv_SdtSDTDispos_Disnumtex2());
      struct.setDisnumlot(getgxTv_SdtSDTDispos_Disnumlot());
      struct.setDiskgslot(getgxTv_SdtSDTDispos_Diskgslot());
      struct.setDismtrlot(getgxTv_SdtSDTDispos_Dismtrlot());
      struct.setDispla(getgxTv_SdtSDTDispos_Displa());
      struct.setDisple2(getgxTv_SdtSDTDispos_Disple2());
      struct.setDisnumcor(getgxTv_SdtSDTDispos_Disnumcor());
      struct.setDisancsal1(getgxTv_SdtSDTDispos_Disancsal1());
      struct.setDisancsal2(getgxTv_SdtSDTDispos_Disancsal2());
      struct.setDisancsal3(getgxTv_SdtSDTDispos_Disancsal3());
      struct.setDisgraaca2(getgxTv_SdtSDTDispos_Disgraaca2());
      struct.setDisgracru2(getgxTv_SdtSDTDispos_Disgracru2());
      struct.setDisfac(getgxTv_SdtSDTDispos_Disfac());
      struct.setDismancod1(getgxTv_SdtSDTDispos_Dismancod1());
      struct.setDismancod2(getgxTv_SdtSDTDispos_Dismancod2());
      struct.setDisnumton(getgxTv_SdtSDTDispos_Disnumton());
      struct.setDisnumalb(getgxTv_SdtSDTDispos_Disnumalb());
      struct.setDisreftmt(getgxTv_SdtSDTDispos_Disreftmt());
      struct.setDisreftkg(getgxTv_SdtSDTDispos_Disreftkg());
      struct.setDisreftpz(getgxTv_SdtSDTDispos_Disreftpz());
      if ( gxTv_SdtSDTDispos_Disfeclan_N == 0 )
      {
         struct.setDisfeclan(getgxTv_SdtSDTDispos_Disfeclan());
      }
      struct.setRetcod(getgxTv_SdtSDTDispos_Retcod());
      struct.setDisartmer(getgxTv_SdtSDTDispos_Disartmer());
      struct.setEmpescod(getgxTv_SdtSDTDispos_Empescod());
      struct.setDibcli(getgxTv_SdtSDTDispos_Dibcli());
      struct.setDibint(getgxTv_SdtSDTDispos_Dibint());
      struct.setDisdibnum(getgxTv_SdtSDTDispos_Disdibnum());
      struct.setDisnumcol(getgxTv_SdtSDTDispos_Disnumcol());
      struct.setDisobs(getgxTv_SdtSDTDispos_Disobs());
      struct.setTotnpie(getgxTv_SdtSDTDispos_Totnpie());
      struct.setTotnuni(getgxTv_SdtSDTDispos_Totnuni());
      struct.setDiscomulin(getgxTv_SdtSDTDispos_Discomulin());
      struct.setDisenv(getgxTv_SdtSDTDispos_Disenv());
      struct.setDistin(getgxTv_SdtSDTDispos_Distin());
      struct.setDisnpzas(getgxTv_SdtSDTDispos_Disnpzas());
      struct.setDisnpzasl(getgxTv_SdtSDTDispos_Disnpzasl());
      struct.setDisusrcod(getgxTv_SdtSDTDispos_Disusrcod());
      struct.setDispelanh(getgxTv_SdtSDTDispos_Dispelanh());
      struct.setDiscrumts(getgxTv_SdtSDTDispos_Discrumts());
      struct.setDiscrukgs(getgxTv_SdtSDTDispos_Discrukgs());
      struct.setDiscruenr(getgxTv_SdtSDTDispos_Discruenr());
      struct.setDislotmts(getgxTv_SdtSDTDispos_Dislotmts());
      struct.setDislotkgs(getgxTv_SdtSDTDispos_Dislotkgs());
      struct.setDisacabak(getgxTv_SdtSDTDispos_Disacabak());
      struct.setDisacaanh(getgxTv_SdtSDTDispos_Disacaanh());
      struct.setDisacamar(getgxTv_SdtSDTDispos_Disacamar());
      struct.setDismdlcod(getgxTv_SdtSDTDispos_Dismdlcod());
      struct.setDistam(getgxTv_SdtSDTDispos_Distam());
      if ( gxTv_SdtSDTDispos_Dishorent_N == 0 )
      {
         struct.setDishorent(getgxTv_SdtSDTDispos_Dishorent());
      }
      if ( gxTv_SdtSDTDispos_Dishorreg_N == 0 )
      {
         struct.setDishorreg(getgxTv_SdtSDTDispos_Dishorreg());
      }
      struct.setDisdishcod(getgxTv_SdtSDTDispos_Disdishcod());
      struct.setDisnrocor(getgxTv_SdtSDTDispos_Disnrocor());
      struct.setDisenccli(getgxTv_SdtSDTDispos_Disenccli());
      struct.setDibcoldib(getgxTv_SdtSDTDispos_Dibcoldib());
      struct.setDistipest(getgxTv_SdtSDTDispos_Distipest());
      struct.setDisgracob(getgxTv_SdtSDTDispos_Disgracob());
      struct.setDiscom(getgxTv_SdtSDTDispos_Discom());
      struct.setDisesttip(getgxTv_SdtSDTDispos_Disesttip());
      struct.setDispiepdm(getgxTv_SdtSDTDispos_Dispiepdm());
      struct.setDispiepdk(getgxTv_SdtSDTDispos_Dispiepdk());
      struct.setDispiepdp(getgxTv_SdtSDTDispos_Dispiepdp());
      struct.setDisacc(getgxTv_SdtSDTDispos_Disacc());
      struct.setDistipcor(getgxTv_SdtSDTDispos_Distipcor());
      struct.setDisobsgrm(getgxTv_SdtSDTDispos_Disobsgrm());
      struct.setDisobsanc(getgxTv_SdtSDTDispos_Disobsanc());
      struct.setDisantp(getgxTv_SdtSDTDispos_Disantp());
      struct.setDisantpt(getgxTv_SdtSDTDispos_Disantpt());
      struct.setDisvolmaq(getgxTv_SdtSDTDispos_Disvolmaq());
      struct.setDisrbmaq(getgxTv_SdtSDTDispos_Disrbmaq());
      struct.setDisdto(getgxTv_SdtSDTDispos_Disdto());
      struct.setDisfacsep(getgxTv_SdtSDTDispos_Disfacsep());
      struct.setDisfacgra(getgxTv_SdtSDTDispos_Disfacgra());
      struct.setDisordsep(getgxTv_SdtSDTDispos_Disordsep());
      struct.setDisordgra(getgxTv_SdtSDTDispos_Disordgra());
      struct.setDisdescol(getgxTv_SdtSDTDispos_Disdescol());
      struct.setDisgratam(getgxTv_SdtSDTDispos_Disgratam());
      struct.setDisrec(getgxTv_SdtSDTDispos_Disrec());
      struct.setDismaqest(getgxTv_SdtSDTDispos_Dismaqest());
      struct.setDisexp(getgxTv_SdtSDTDispos_Disexp());
      struct.setDisfent(getgxTv_SdtSDTDispos_Disfent());
      struct.setDisdest(getgxTv_SdtSDTDispos_Disdest());
      if ( gxTv_SdtSDTDispos_Disfcht_N == 0 )
      {
         struct.setDisfcht(getgxTv_SdtSDTDispos_Disfcht());
      }
      struct.setTb1_dscf(getgxTv_SdtSDTDispos_Tb1_dscf());
      struct.setDisitem1(getgxTv_SdtSDTDispos_Disitem1());
      struct.setDisitem2(getgxTv_SdtSDTDispos_Disitem2());
      struct.setDisitem3(getgxTv_SdtSDTDispos_Disitem3());
      struct.setDisitem4(getgxTv_SdtSDTDispos_Disitem4());
      struct.setDisitem5(getgxTv_SdtSDTDispos_Disitem5());
      struct.setDisitem6(getgxTv_SdtSDTDispos_Disitem6());
      struct.setCod_idtx(getgxTv_SdtSDTDispos_Cod_idtx());
      if ( gxTv_SdtSDTDispos_Disfecped_N == 0 )
      {
         struct.setDisfecped(getgxTv_SdtSDTDispos_Disfecped());
      }
      struct.setDislotpza(getgxTv_SdtSDTDispos_Dislotpza());
      struct.setDislotmaq(getgxTv_SdtSDTDispos_Dislotmaq());
      struct.setDisacafor(getgxTv_SdtSDTDispos_Disacafor());
      struct.setDibcolcol(getgxTv_SdtSDTDispos_Dibcolcol());
      struct.setDisdibcocn(getgxTv_SdtSDTDispos_Disdibcocn());
      struct.setDibcolcoln(getgxTv_SdtSDTDispos_Dibcolcoln());
      struct.setDisdibcodn(getgxTv_SdtSDTDispos_Disdibcodn());
      struct.setDisultnot(getgxTv_SdtSDTDispos_Disultnot());
      struct.setDisparcod(getgxTv_SdtSDTDispos_Disparcod());
      struct.setDisparreo(getgxTv_SdtSDTDispos_Disparreo());
      struct.setDisparpar(getgxTv_SdtSDTDispos_Disparpar());
      struct.setDismemo1(getgxTv_SdtSDTDispos_Dismemo1());
      struct.setDismemo2(getgxTv_SdtSDTDispos_Dismemo2());
      struct.setMarcaid(getgxTv_SdtSDTDispos_Marcaid());
      struct.setDisordcomp(getgxTv_SdtSDTDispos_Disordcomp());
      struct.setDiscnoenco(getgxTv_SdtSDTDispos_Discnoenco());
      struct.setNxt_modelo(getgxTv_SdtSDTDispos_Nxt_modelo());
      struct.setCpteid(getgxTv_SdtSDTDispos_Cpteid());
      struct.setNxt_statio(getgxTv_SdtSDTDispos_Nxt_statio());
      struct.setDesaid(getgxTv_SdtSDTDispos_Desaid());
      struct.setDptoid(getgxTv_SdtSDTDispos_Dptoid());
      struct.setNxt_artcli(getgxTv_SdtSDTDispos_Nxt_artcli());
      struct.setDisarttipd(getgxTv_SdtSDTDispos_Disarttipd());
      struct.setDistipcd(getgxTv_SdtSDTDispos_Distipcd());
      struct.setRevenid(getgxTv_SdtSDTDispos_Revenid());
      struct.setDispriorid(getgxTv_SdtSDTDispos_Dispriorid());
      struct.setDistpestam(getgxTv_SdtSDTDispos_Distpestam());
      struct.setDisprodid(getgxTv_SdtSDTDispos_Disprodid());
      struct.setDisprodds(getgxTv_SdtSDTDispos_Disprodds());
      struct.setDisoekotex(getgxTv_SdtSDTDispos_Disoekotex());
      struct.setDislineaid(getgxTv_SdtSDTDispos_Dislineaid());
      struct.setDiscanalid(getgxTv_SdtSDTDispos_Discanalid());
      struct.setDislinprd(getgxTv_SdtSDTDispos_Dislinprd());
      struct.setDisdgultli(getgxTv_SdtSDTDispos_Disdgultli());
      struct.setDisdgsummts(getgxTv_SdtSDTDispos_Disdgsummts());
      struct.setDisdgsumpzs(getgxTv_SdtSDTDispos_Disdgsumpzs());
      struct.setDisrgb(getgxTv_SdtSDTDispos_Disrgb());
      return struct ;
   }

   protected byte gxTv_SdtSDTDispos_N ;
   protected byte gxTv_SdtSDTDispos_Disfeccli_N ;
   protected byte gxTv_SdtSDTDispos_Disfec_N ;
   protected byte gxTv_SdtSDTDispos_Disfecent_N ;
   protected byte gxTv_SdtSDTDispos_Distipcol ;
   protected byte gxTv_SdtSDTDispos_Disobsulin ;
   protected byte gxTv_SdtSDTDispos_Disarturg ;
   protected byte gxTv_SdtSDTDispos_Disest ;
   protected byte gxTv_SdtSDTDispos_Findint ;
   protected byte gxTv_SdtSDTDispos_Disnumtex1 ;
   protected byte gxTv_SdtSDTDispos_Disfeclan_N ;
   protected byte gxTv_SdtSDTDispos_Discomulin ;
   protected byte gxTv_SdtSDTDispos_Disenv ;
   protected byte gxTv_SdtSDTDispos_Dishorent_N ;
   protected byte gxTv_SdtSDTDispos_Dishorreg_N ;
   protected byte gxTv_SdtSDTDispos_Distipest ;
   protected byte gxTv_SdtSDTDispos_Disgracob ;
   protected byte gxTv_SdtSDTDispos_Disfacsep ;
   protected byte gxTv_SdtSDTDispos_Disfacgra ;
   protected byte gxTv_SdtSDTDispos_Disordsep ;
   protected byte gxTv_SdtSDTDispos_Disordgra ;
   protected byte gxTv_SdtSDTDispos_Disdescol ;
   protected byte gxTv_SdtSDTDispos_Disfcht_N ;
   protected byte gxTv_SdtSDTDispos_Disfecped_N ;
   protected byte gxTv_SdtSDTDispos_Disultnot ;
   protected byte gxTv_SdtSDTDispos_Disparreo ;
   protected byte gxTv_SdtSDTDispos_Dispriorid ;
   protected byte gxTv_SdtSDTDispos_Distpestam ;
   protected byte gxTv_SdtSDTDispos_Disdgultli ;
   protected short gxTv_SdtSDTDispos_Disnumpie ;
   protected short gxTv_SdtSDTDispos_Disartpes ;
   protected short gxTv_SdtSDTDispos_Dispiepie ;
   protected short gxTv_SdtSDTDispos_Disdefcon ;
   protected short gxTv_SdtSDTDispos_Dispienor ;
   protected short gxTv_SdtSDTDispos_Sumpor ;
   protected short gxTv_SdtSDTDispos_Disarttip ;
   protected short gxTv_SdtSDTDispos_Disartpt1 ;
   protected short gxTv_SdtSDTDispos_Disartpt2 ;
   protected short gxTv_SdtSDTDispos_Disartpt3 ;
   protected short gxTv_SdtSDTDispos_Disartpu1 ;
   protected short gxTv_SdtSDTDispos_Disartpu2 ;
   protected short gxTv_SdtSDTDispos_Disartpu3 ;
   protected short gxTv_SdtSDTDispos_Disartanh ;
   protected short gxTv_SdtSDTDispos_Dispielan ;
   protected short gxTv_SdtSDTDispos_Diskgmlan ;
   protected short gxTv_SdtSDTDispos_Dismtrlan ;
   protected short gxTv_SdtSDTDispos_Dispie ;
   protected short gxTv_SdtSDTDispos_Tipconcod ;
   protected short gxTv_SdtSDTDispos_Disgracru ;
   protected short gxTv_SdtSDTDispos_Disartan1 ;
   protected short gxTv_SdtSDTDispos_Disartacb ;
   protected short gxTv_SdtSDTDispos_Disartac2 ;
   protected short gxTv_SdtSDTDispos_Dispart ;
   protected short gxTv_SdtSDTDispos_Disgraaca ;
   protected short gxTv_SdtSDTDispos_Disnumbas ;
   protected short gxTv_SdtSDTDispos_Dismancod ;
   protected short gxTv_SdtSDTDispos_Disnumtex2 ;
   protected short gxTv_SdtSDTDispos_Disnumcor ;
   protected short gxTv_SdtSDTDispos_Disancsal1 ;
   protected short gxTv_SdtSDTDispos_Disancsal2 ;
   protected short gxTv_SdtSDTDispos_Disancsal3 ;
   protected short gxTv_SdtSDTDispos_Disgraaca2 ;
   protected short gxTv_SdtSDTDispos_Disgracru2 ;
   protected short gxTv_SdtSDTDispos_Dismancod1 ;
   protected short gxTv_SdtSDTDispos_Dismancod2 ;
   protected short gxTv_SdtSDTDispos_Disnumalb ;
   protected short gxTv_SdtSDTDispos_Disreftpz ;
   protected short gxTv_SdtSDTDispos_Disnumcol ;
   protected short gxTv_SdtSDTDispos_Totnpie ;
   protected short gxTv_SdtSDTDispos_Dispelanh ;
   protected short gxTv_SdtSDTDispos_Disacaanh ;
   protected short gxTv_SdtSDTDispos_Dispiepdp ;
   protected short gxTv_SdtSDTDispos_Dislotpza ;
   protected short gxTv_SdtSDTDispos_Cpteid ;
   protected short gxTv_SdtSDTDispos_Desaid ;
   protected short gxTv_SdtSDTDispos_Dptoid ;
   protected short gxTv_SdtSDTDispos_Dislineaid ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTDispos_Discod ;
   protected int gxTv_SdtSDTDispos_Discolnum ;
   protected int gxTv_SdtSDTDispos_Clicoddis ;
   protected int gxTv_SdtSDTDispos_Clicod ;
   protected int gxTv_SdtSDTDispos_Disnumcli ;
   protected int gxTv_SdtSDTDispos_Disclides ;
   protected int gxTv_SdtSDTDispos_Disopeant ;
   protected int gxTv_SdtSDTDispos_Disnumlot ;
   protected int gxTv_SdtSDTDispos_Dibint ;
   protected int gxTv_SdtSDTDispos_Disdibnum ;
   protected int gxTv_SdtSDTDispos_Disnpzas ;
   protected int gxTv_SdtSDTDispos_Disnpzasl ;
   protected int gxTv_SdtSDTDispos_Disnrocor ;
   protected int gxTv_SdtSDTDispos_Disvolmaq ;
   protected int gxTv_SdtSDTDispos_Disacafor ;
   protected int gxTv_SdtSDTDispos_Disdibcocn ;
   protected int gxTv_SdtSDTDispos_Dibcolcoln ;
   protected int gxTv_SdtSDTDispos_Disdibcodn ;
   protected int gxTv_SdtSDTDispos_Disparcod ;
   protected int gxTv_SdtSDTDispos_Discanalid ;
   protected int gxTv_SdtSDTDispos_Disdgsumpzs ;
   protected long gxTv_SdtSDTDispos_Disrgb ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disnumuni ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Dispiekgm ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Dispiemtr ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disartrdt ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disprekgm ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Dispremtr ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disuni ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disenccom ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disencanh ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disrdon ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disrdoa ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Diskgslot ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Dismtrlot ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disreftmt ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disreftkg ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disartmer ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Totnuni ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Discrumts ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Discrukgs ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Dislotmts ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Dislotkgs ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Dispiepdm ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Dispiepdk ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disrbmaq ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disdto ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disdgsummts ;
   protected String gxTv_SdtSDTDispos_Emprcod ;
   protected String gxTv_SdtSDTDispos_Disdes ;
   protected String gxTv_SdtSDTDispos_Disartcod ;
   protected String gxTv_SdtSDTDispos_Disunimed ;
   protected String gxTv_SdtSDTDispos_Pricod ;
   protected String gxTv_SdtSDTDispos_Disclinum ;
   protected String gxTv_SdtSDTDispos_Discolnom ;
   protected String gxTv_SdtSDTDispos_Disartdsc ;
   protected String gxTv_SdtSDTDispos_Disent ;
   protected String gxTv_SdtSDTDispos_Disartmat ;
   protected String gxTv_SdtSDTDispos_Disartlar ;
   protected String gxTv_SdtSDTDispos_Disartsua ;
   protected String gxTv_SdtSDTDispos_Disartaca ;
   protected String gxTv_SdtSDTDispos_Disartple ;
   protected String gxTv_SdtSDTDispos_Disartenc ;
   protected String gxTv_SdtSDTDispos_Disartcor ;
   protected String gxTv_SdtSDTDispos_Disartope ;
   protected String gxTv_SdtSDTDispos_Disarttr1 ;
   protected String gxTv_SdtSDTDispos_Disarttr2 ;
   protected String gxTv_SdtSDTDispos_Disarttr3 ;
   protected String gxTv_SdtSDTDispos_Disartur1 ;
   protected String gxTv_SdtSDTDispos_Disartur2 ;
   protected String gxTv_SdtSDTDispos_Disartur3 ;
   protected String gxTv_SdtSDTDispos_Emprcoddis ;
   protected String gxTv_SdtSDTDispos_Findcol ;
   protected String gxTv_SdtSDTDispos_Disnmtr ;
   protected String gxTv_SdtSDTDispos_Disnmez ;
   protected String gxTv_SdtSDTDispos_Findton ;
   protected String gxTv_SdtSDTDispos_Disnumten ;
   protected String gxTv_SdtSDTDispos_Maqcoddis ;
   protected String gxTv_SdtSDTDispos_Partcod ;
   protected String gxTv_SdtSDTDispos_Tipconnom ;
   protected String gxTv_SdtSDTDispos_Disnomcli ;
   protected String gxTv_SdtSDTDispos_Disloc ;
   protected String gxTv_SdtSDTDispos_Disres ;
   protected String gxTv_SdtSDTDispos_Distipdis ;
   protected String gxTv_SdtSDTDispos_Discodtex ;
   protected String gxTv_SdtSDTDispos_Displa ;
   protected String gxTv_SdtSDTDispos_Disple2 ;
   protected String gxTv_SdtSDTDispos_Disfac ;
   protected String gxTv_SdtSDTDispos_Disnumton ;
   protected String gxTv_SdtSDTDispos_Retcod ;
   protected String gxTv_SdtSDTDispos_Empescod ;
   protected String gxTv_SdtSDTDispos_Dibcli ;
   protected String gxTv_SdtSDTDispos_Disobs ;
   protected String gxTv_SdtSDTDispos_Distin ;
   protected String gxTv_SdtSDTDispos_Disusrcod ;
   protected String gxTv_SdtSDTDispos_Discruenr ;
   protected String gxTv_SdtSDTDispos_Disacabak ;
   protected String gxTv_SdtSDTDispos_Disacamar ;
   protected String gxTv_SdtSDTDispos_Dismdlcod ;
   protected String gxTv_SdtSDTDispos_Distam ;
   protected String gxTv_SdtSDTDispos_Disdishcod ;
   protected String gxTv_SdtSDTDispos_Disenccli ;
   protected String gxTv_SdtSDTDispos_Dibcoldib ;
   protected String gxTv_SdtSDTDispos_Discom ;
   protected String gxTv_SdtSDTDispos_Disesttip ;
   protected String gxTv_SdtSDTDispos_Disacc ;
   protected String gxTv_SdtSDTDispos_Distipcor ;
   protected String gxTv_SdtSDTDispos_Disobsgrm ;
   protected String gxTv_SdtSDTDispos_Disobsanc ;
   protected String gxTv_SdtSDTDispos_Disantp ;
   protected String gxTv_SdtSDTDispos_Disantpt ;
   protected String gxTv_SdtSDTDispos_Disgratam ;
   protected String gxTv_SdtSDTDispos_Disrec ;
   protected String gxTv_SdtSDTDispos_Dismaqest ;
   protected String gxTv_SdtSDTDispos_Disexp ;
   protected String gxTv_SdtSDTDispos_Disfent ;
   protected String gxTv_SdtSDTDispos_Disdest ;
   protected String gxTv_SdtSDTDispos_Tb1_dscf ;
   protected String gxTv_SdtSDTDispos_Disitem1 ;
   protected String gxTv_SdtSDTDispos_Disitem2 ;
   protected String gxTv_SdtSDTDispos_Disitem3 ;
   protected String gxTv_SdtSDTDispos_Disitem4 ;
   protected String gxTv_SdtSDTDispos_Disitem5 ;
   protected String gxTv_SdtSDTDispos_Disitem6 ;
   protected String gxTv_SdtSDTDispos_Cod_idtx ;
   protected String gxTv_SdtSDTDispos_Dislotmaq ;
   protected String gxTv_SdtSDTDispos_Dibcolcol ;
   protected String gxTv_SdtSDTDispos_Disparpar ;
   protected String gxTv_SdtSDTDispos_Marcaid ;
   protected String gxTv_SdtSDTDispos_Nxt_modelo ;
   protected String gxTv_SdtSDTDispos_Nxt_statio ;
   protected String gxTv_SdtSDTDispos_Nxt_artcli ;
   protected String gxTv_SdtSDTDispos_Disarttipd ;
   protected String gxTv_SdtSDTDispos_Distipcd ;
   protected String gxTv_SdtSDTDispos_Revenid ;
   protected String gxTv_SdtSDTDispos_Disprodid ;
   protected String gxTv_SdtSDTDispos_Disprodds ;
   protected String gxTv_SdtSDTDispos_Disoekotex ;
   protected String gxTv_SdtSDTDispos_Dislinprd ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTDispos_Dishorent ;
   protected java.util.Date gxTv_SdtSDTDispos_Dishorreg ;
   protected java.util.Date datetime_STZ ;
   protected java.util.Date gxTv_SdtSDTDispos_Disfeccli ;
   protected java.util.Date gxTv_SdtSDTDispos_Disfec ;
   protected java.util.Date gxTv_SdtSDTDispos_Disfecent ;
   protected java.util.Date gxTv_SdtSDTDispos_Disfeclan ;
   protected java.util.Date gxTv_SdtSDTDispos_Disfcht ;
   protected java.util.Date gxTv_SdtSDTDispos_Disfecped ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTDispos_Dismemo1 ;
   protected String gxTv_SdtSDTDispos_Dismemo2 ;
   protected String gxTv_SdtSDTDispos_Disordcomp ;
   protected String gxTv_SdtSDTDispos_Discnoenco ;
}

