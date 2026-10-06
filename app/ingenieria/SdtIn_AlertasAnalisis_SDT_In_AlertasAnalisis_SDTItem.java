package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem extends GxUserType
{
   public SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem( )
   {
      this(  new ModelContext(SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem.class));
   }

   public SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem( ModelContext context )
   {
      super( context, "SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem");
   }

   public SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem( int remoteHandle ,
                                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem");
   }

   public SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem( StructSdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem struct )
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
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCodVir") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir = oReader.getValue() ;
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir_N = (byte)(0) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCod") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec = GXutil.nullDate() ;
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec_N = (byte)(0) ;
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProULin") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproulin = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotUni") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Totuni = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProLin") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolin = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCod") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodReo") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodPar") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GruOpeCod") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopecod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GruOpeDsc") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopedsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarOrdLin") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fase") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fase = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FaseDsc") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fasedsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProUni") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprouni = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProTur") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotur = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProHin") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohin = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProMin") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromin = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProHfi") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohfi = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProMfi") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromfi = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProF") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprof = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ParCod") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ParCodNom") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcodnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProTre") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotre = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProTte") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotte = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisBarTip") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisbartip = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProEst") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproest = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProKgr") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokgr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProMtr") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProTip") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotip = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProCod") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProLot") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolot = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProTc") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotc = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProReo") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProBot") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprobot = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProNPart") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpart = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProNpzs") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpzs = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProBan") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproban = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProDi") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi = GXutil.nullDate() ;
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi_N = (byte)(0) ;
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProHi") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi_N = (byte)(0) ;
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi = GXutil.resetDate(localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), "."))))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProDf") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf = GXutil.nullDate() ;
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf_N = (byte)(0) ;
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProHf") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf_N = (byte)(0) ;
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf = GXutil.resetDate(localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), "."))))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProDTI") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti_N = (byte)(0) ;
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProDTF") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf_N = (byte)(0) ;
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProTr2") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotr2 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisproTdab") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotdab = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisproNPd") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpd = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProCtr") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproctr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisproGf") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprogf = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisHhMaq") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhmaq = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisHhIni") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhini = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProMq") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromq = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProFd") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd = GXutil.nullDate() ;
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd_N = (byte)(0) ;
                  gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProDibC") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProDibI") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibi = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProCom") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProFon") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofon = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProMtHd") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromthd = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProKgHd") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokghd = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProPzHd") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispropzhd = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarSer") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarSerDsc") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barserdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ParFasCod") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfascod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ParFasDsc") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarParVl2") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvl2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarParVMn") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarParVMx") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarValPar") )
            {
               gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar = oReader.getValue() ;
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
         sName = "In_AlertasAnalisis_SDT.In_AlertasAnalisis_SDTItem" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( (GXutil.strcmp("", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir)==0) && ( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir_N == 1 ) )
      {
         oWriter.writeStartElement("EmprCodVir");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         oWriter.writeElement("EmprCodVir", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("MaqCod", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec)) && ( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec_N == 1 ) )
      {
         oWriter.writeElement("HisProFec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("HisProFec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("HisProULin", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproulin, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotUni", GXutil.trim( GXutil.strNoRound( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Totuni, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProLin", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolin, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCod", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCodReo", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCodPar", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GruOpeCod", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopecod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GruOpeDsc", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopedsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarOrdLin", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fase", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fase);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FaseDsc", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fasedsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProUni", GXutil.trim( GXutil.strNoRound( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprouni, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProTur", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotur, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProHin", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohin, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProMin", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromin, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProHfi", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohfi, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProMfi", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromfi, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProF", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprof);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ParCod", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ParCodNom", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcodnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProTre", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotre, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProTte", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotte, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisBarTip", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisbartip, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProEst", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproest, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProKgr", GXutil.trim( GXutil.strNoRound( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokgr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProTip", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotip, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProCod", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProLot", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolot);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProTc", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotc, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProReo", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProBot", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprobot, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProNPart", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpart, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProNpzs", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpzs, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProBan", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproban);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi)) && ( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi_N == 1 ) )
      {
         oWriter.writeElement("HisProDi", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("HisProDi", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi) && ( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi_N == 1 ) )
      {
         oWriter.writeElement("HisProHi", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("HisProHi", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf)) && ( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf_N == 1 ) )
      {
         oWriter.writeElement("HisProDf", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("HisProDf", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf) && ( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf_N == 1 ) )
      {
         oWriter.writeElement("HisProHf", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("HisProHf", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti) && ( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti_N == 1 ) )
      {
         oWriter.writeElement("HisProDTI", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("HisProDTI", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf) && ( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf_N == 1 ) )
      {
         oWriter.writeElement("HisProDTF", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("HisProDTF", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("HisProTr2", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotr2, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisproTdab", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotdab, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisproNPd", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpd, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProCtr", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproctr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisproGf", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprogf, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisHhMaq", GXutil.trim( GXutil.strNoRound( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhmaq, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisHhIni", GXutil.trim( GXutil.strNoRound( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhini, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProMq", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromq);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd)) && ( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd_N == 1 ) )
      {
         oWriter.writeElement("HisProFd", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("HisProFd", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("HisProDibC", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProDibI", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibi, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProCom", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProFon", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofon);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProMtHd", GXutil.trim( GXutil.strNoRound( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromthd, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProKgHd", GXutil.trim( GXutil.strNoRound( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokghd, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProPzHd", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispropzhd, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarSer", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarSerDsc", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barserdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ParFasCod", GXutil.trim( GXutil.str( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfascod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ParFasDsc", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarParVl2", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvl2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarParVMn", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarParVMx", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarValPar", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar);
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
      AddObjectProperty("EmprCod", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcod, false, false);
      AddObjectProperty("EmprNom", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprnom, false, false);
      AddObjectProperty("EmprCodVir", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir, false, false);
      AddObjectProperty("MaqCod", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqdsc, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("HisProFec", sDateCnv, false, false);
      AddObjectProperty("HisProULin", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproulin, false, false);
      AddObjectProperty("TotUni", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Totuni, false, false);
      AddObjectProperty("HisProLin", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolin, false, false);
      AddObjectProperty("BarCod", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod, false, false);
      AddObjectProperty("BarCodReo", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo, false, false);
      AddObjectProperty("BarCodPar", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar, false, false);
      AddObjectProperty("GruOpeCod", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopecod, false, false);
      AddObjectProperty("GruOpeDsc", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopedsc, false, false);
      AddObjectProperty("BarOrdLin", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin, false, false);
      AddObjectProperty("Fase", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fase, false, false);
      AddObjectProperty("FaseDsc", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fasedsc, false, false);
      AddObjectProperty("HisProUni", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprouni, false, false);
      AddObjectProperty("HisProTur", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotur, false, false);
      AddObjectProperty("HisProHin", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohin, false, false);
      AddObjectProperty("HisProMin", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromin, false, false);
      AddObjectProperty("HisProHfi", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohfi, false, false);
      AddObjectProperty("HisProMfi", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromfi, false, false);
      AddObjectProperty("HisProF", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprof, false, false);
      AddObjectProperty("ParCod", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcod, false, false);
      AddObjectProperty("ParCodNom", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcodnom, false, false);
      AddObjectProperty("HisProTre", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotre, false, false);
      AddObjectProperty("HisProTte", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotte, false, false);
      AddObjectProperty("HisBarTip", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisbartip, false, false);
      AddObjectProperty("HisProEst", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproest, false, false);
      AddObjectProperty("HisProKgr", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokgr, false, false);
      AddObjectProperty("HisProMtr", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromtr, false, false);
      AddObjectProperty("HisProTip", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotip, false, false);
      AddObjectProperty("HisProCod", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocod, false, false);
      AddObjectProperty("HisProLot", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolot, false, false);
      AddObjectProperty("HisProTc", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotc, false, false);
      AddObjectProperty("HisProReo", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproreo, false, false);
      AddObjectProperty("HisProBot", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprobot, false, false);
      AddObjectProperty("HisProNPart", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpart, false, false);
      AddObjectProperty("HisProNpzs", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpzs, false, false);
      AddObjectProperty("HisProBan", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproban, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("HisProDi", sDateCnv, false, false);
      datetime_STZ = gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi ;
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
      AddObjectProperty("HisProHi", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("HisProDf", sDateCnv, false, false);
      datetime_STZ = gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf ;
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
      AddObjectProperty("HisProHf", sDateCnv, false, false);
      datetime_STZ = gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti ;
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
      AddObjectProperty("HisProDTI", sDateCnv, false, false);
      datetime_STZ = gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf ;
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
      AddObjectProperty("HisProDTF", sDateCnv, false, false);
      AddObjectProperty("HisProTr2", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotr2, false, false);
      AddObjectProperty("HisproTdab", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotdab, false, false);
      AddObjectProperty("HisproNPd", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpd, false, false);
      AddObjectProperty("HisProCtr", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproctr, false, false);
      AddObjectProperty("HisproGf", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprogf, false, false);
      AddObjectProperty("HisHhMaq", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhmaq, false, false);
      AddObjectProperty("HisHhIni", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhini, false, false);
      AddObjectProperty("HisProMq", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromq, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("HisProFd", sDateCnv, false, false);
      AddObjectProperty("HisProDibC", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibc, false, false);
      AddObjectProperty("HisProDibI", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibi, false, false);
      AddObjectProperty("HisProCom", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocom, false, false);
      AddObjectProperty("HisProFon", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofon, false, false);
      AddObjectProperty("HisProMtHd", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromthd, false, false);
      AddObjectProperty("HisProKgHd", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokghd, false, false);
      AddObjectProperty("HisProPzHd", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispropzhd, false, false);
      AddObjectProperty("CliCod", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clinom, false, false);
      AddObjectProperty("BarSer", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barser, false, false);
      AddObjectProperty("BarSerDsc", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barserdsc, false, false);
      AddObjectProperty("ParFasCod", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfascod, false, false);
      AddObjectProperty("ParFasDsc", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfasdsc, false, false);
      AddObjectProperty("BarParVl2", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvl2, false, false);
      AddObjectProperty("BarParVMn", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn, false, false);
      AddObjectProperty("BarParVMx", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx, false, false);
      AddObjectProperty("BarValPar", gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar, false, false);
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcod( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcod ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcod( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcod = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprnom( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprnom ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprnom( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprnom = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqcod( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqcod ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqcod( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqcod = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqdsc( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqdsc ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqdsc( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqdsc = value ;
   }

   public java.util.Date getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec( java.util.Date value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec = value ;
   }

   public int getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproulin( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproulin ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproulin( int value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproulin = value ;
   }

   public java.math.BigDecimal getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Totuni( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Totuni ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Totuni( java.math.BigDecimal value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Totuni = value ;
   }

   public int getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolin( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolin ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolin( int value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolin = value ;
   }

   public int getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod( int value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod = value ;
   }

   public byte getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar = value ;
   }

   public int getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopecod( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopecod ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopecod( int value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopecod = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopedsc( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopedsc ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopedsc( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopedsc = value ;
   }

   public short getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin( short value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fase( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fase ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fase( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fase = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fasedsc( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fasedsc ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fasedsc( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fasedsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprouni( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprouni ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprouni( java.math.BigDecimal value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprouni = value ;
   }

   public byte getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotur( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotur ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotur( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotur = value ;
   }

   public byte getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohin( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohin ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohin( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohin = value ;
   }

   public byte getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromin( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromin ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromin( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromin = value ;
   }

   public byte getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohfi( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohfi ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohfi( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohfi = value ;
   }

   public byte getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromfi( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromfi ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromfi( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromfi = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprof( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprof ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprof( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprof = value ;
   }

   public short getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcod( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcod ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcod( short value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcod = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcodnom( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcodnom ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcodnom( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcodnom = value ;
   }

   public short getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotre( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotre ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotre( short value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotre = value ;
   }

   public short getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotte( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotte ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotte( short value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotte = value ;
   }

   public byte getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisbartip( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisbartip ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisbartip( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisbartip = value ;
   }

   public byte getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproest( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproest ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproest( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproest = value ;
   }

   public java.math.BigDecimal getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokgr( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokgr ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokgr( java.math.BigDecimal value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokgr = value ;
   }

   public java.math.BigDecimal getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromtr( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromtr ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromtr( java.math.BigDecimal value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromtr = value ;
   }

   public short getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotip( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotip ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotip( short value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotip = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocod( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocod ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocod( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocod = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolot( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolot ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolot( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolot = value ;
   }

   public byte getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotc( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotc ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotc( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotc = value ;
   }

   public byte getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproreo( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproreo ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproreo( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproreo = value ;
   }

   public int getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprobot( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprobot ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprobot( int value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprobot = value ;
   }

   public int getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpart( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpart ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpart( int value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpart = value ;
   }

   public short getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpzs( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpzs ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpzs( short value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpzs = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproban( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproban ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproban( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproban = value ;
   }

   public java.util.Date getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi( java.util.Date value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi = value ;
   }

   public java.util.Date getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi( java.util.Date value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi = value ;
   }

   public java.util.Date getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf( java.util.Date value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf = value ;
   }

   public java.util.Date getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf( java.util.Date value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf = value ;
   }

   public java.util.Date getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti( java.util.Date value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti = value ;
   }

   public java.util.Date getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf( java.util.Date value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf = value ;
   }

   public short getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotr2( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotr2 ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotr2( short value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotr2 = value ;
   }

   public short getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotdab( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotdab ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotdab( short value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotdab = value ;
   }

   public byte getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpd( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpd ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpd( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpd = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproctr( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproctr ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproctr( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproctr = value ;
   }

   public short getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprogf( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprogf ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprogf( short value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprogf = value ;
   }

   public java.math.BigDecimal getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhmaq( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhmaq ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhmaq( java.math.BigDecimal value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhmaq = value ;
   }

   public java.math.BigDecimal getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhini( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhini ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhini( java.math.BigDecimal value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhini = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromq( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromq ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromq( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromq = value ;
   }

   public java.util.Date getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd( java.util.Date value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibc( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibc ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibc( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibc = value ;
   }

   public int getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibi( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibi ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibi( int value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibi = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocom( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocom ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocom( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocom = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofon( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofon ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofon( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofon = value ;
   }

   public java.math.BigDecimal getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromthd( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromthd ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromthd( java.math.BigDecimal value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromthd = value ;
   }

   public java.math.BigDecimal getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokghd( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokghd ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokghd( java.math.BigDecimal value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokghd = value ;
   }

   public int getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispropzhd( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispropzhd ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispropzhd( int value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispropzhd = value ;
   }

   public int getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clicod( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clicod ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clicod( int value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clicod = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clinom( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clinom ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clinom( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clinom = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barser( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barser ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barser( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barser = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barserdsc( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barserdsc ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barserdsc( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barserdsc = value ;
   }

   public short getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfascod( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfascod ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfascod( short value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfascod = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfasdsc( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfasdsc ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfasdsc( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfasdsc = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvl2( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvl2 ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvl2( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvl2 = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx = value ;
   }

   public String getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar ;
   }

   public void setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcod = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(1) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprnom = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir_N = (byte)(1) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqcod = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqdsc = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec = GXutil.nullDate() ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec_N = (byte)(1) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Totuni = DecimalUtil.ZERO ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopedsc = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fase = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fasedsc = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprouni = DecimalUtil.ZERO ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprof = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcodnom = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokgr = DecimalUtil.ZERO ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromtr = DecimalUtil.ZERO ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocod = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolot = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproban = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi = GXutil.nullDate() ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi_N = (byte)(1) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi_N = (byte)(1) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf = GXutil.nullDate() ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf_N = (byte)(1) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf_N = (byte)(1) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti_N = (byte)(1) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf_N = (byte)(1) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproctr = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhmaq = DecimalUtil.ZERO ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhini = DecimalUtil.ZERO ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromq = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd = GXutil.nullDate() ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd_N = (byte)(1) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibc = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocom = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofon = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromthd = DecimalUtil.ZERO ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokghd = DecimalUtil.ZERO ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clinom = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barser = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barserdsc = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfasdsc = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvl2 = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N ;
   }

   public app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem Clone( )
   {
      return (app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(clone()) ;
   }

   public void setStruct( app.ingenieria.StructSdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem struct )
   {
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcod(struct.getEmprcod());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprnom(struct.getEmprnom());
      if ( struct.gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir_N == 0 )
      {
         setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir(struct.getEmprcodvir());
      }
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqcod(struct.getMaqcod());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqdsc(struct.getMaqdsc());
      if ( struct.gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec_N == 0 )
      {
         setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec(struct.getHisprofec());
      }
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproulin(struct.getHisproulin());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Totuni(struct.getTotuni());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolin(struct.getHisprolin());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod(struct.getBarcod());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopecod(struct.getGruopecod());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopedsc(struct.getGruopedsc());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin(struct.getBarordlin());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fase(struct.getFase());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fasedsc(struct.getFasedsc());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprouni(struct.getHisprouni());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotur(struct.getHisprotur());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohin(struct.getHisprohin());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromin(struct.getHispromin());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohfi(struct.getHisprohfi());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromfi(struct.getHispromfi());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprof(struct.getHisprof());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcod(struct.getParcod());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcodnom(struct.getParcodnom());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotre(struct.getHisprotre());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotte(struct.getHisprotte());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisbartip(struct.getHisbartip());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproest(struct.getHisproest());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokgr(struct.getHisprokgr());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromtr(struct.getHispromtr());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotip(struct.getHisprotip());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocod(struct.getHisprocod());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolot(struct.getHisprolot());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotc(struct.getHisprotc());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproreo(struct.getHisproreo());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprobot(struct.getHisprobot());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpart(struct.getHispronpart());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpzs(struct.getHispronpzs());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproban(struct.getHisproban());
      if ( struct.gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi_N == 0 )
      {
         setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi(struct.getHisprodi());
      }
      if ( struct.gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi_N == 0 )
      {
         setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi(struct.getHisprohi());
      }
      if ( struct.gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf_N == 0 )
      {
         setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf(struct.getHisprodf());
      }
      if ( struct.gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf_N == 0 )
      {
         setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf(struct.getHisprohf());
      }
      if ( struct.gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti_N == 0 )
      {
         setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti(struct.getHisprodti());
      }
      if ( struct.gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf_N == 0 )
      {
         setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf(struct.getHisprodtf());
      }
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotr2(struct.getHisprotr2());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotdab(struct.getHisprotdab());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpd(struct.getHispronpd());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproctr(struct.getHisproctr());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprogf(struct.getHisprogf());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhmaq(struct.getHishhmaq());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhini(struct.getHishhini());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromq(struct.getHispromq());
      if ( struct.gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd_N == 0 )
      {
         setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd(struct.getHisprofd());
      }
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibc(struct.getHisprodibc());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibi(struct.getHisprodibi());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocom(struct.getHisprocom());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofon(struct.getHisprofon());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromthd(struct.getHispromthd());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokghd(struct.getHisprokghd());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispropzhd(struct.getHispropzhd());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clicod(struct.getClicod());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clinom(struct.getClinom());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barser(struct.getBarser());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barserdsc(struct.getBarserdsc());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfascod(struct.getParfascod());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfasdsc(struct.getParfasdsc());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvl2(struct.getBarparvl2());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn(struct.getBarparvmn());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx(struct.getBarparvmx());
      setgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar(struct.getBarvalpar());
   }

   @SuppressWarnings("unchecked")
   public app.ingenieria.StructSdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem getStruct( )
   {
      app.ingenieria.StructSdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem struct = new app.ingenieria.StructSdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem ();
      struct.setEmprcod(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcod());
      struct.setEmprnom(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprnom());
      if ( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir_N == 0 )
      {
         struct.setEmprcodvir(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir());
      }
      struct.setMaqcod(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqcod());
      struct.setMaqdsc(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqdsc());
      if ( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec_N == 0 )
      {
         struct.setHisprofec(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec());
      }
      struct.setHisproulin(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproulin());
      struct.setTotuni(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Totuni());
      struct.setHisprolin(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolin());
      struct.setBarcod(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod());
      struct.setBarcodreo(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar());
      struct.setGruopecod(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopecod());
      struct.setGruopedsc(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopedsc());
      struct.setBarordlin(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin());
      struct.setFase(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fase());
      struct.setFasedsc(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fasedsc());
      struct.setHisprouni(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprouni());
      struct.setHisprotur(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotur());
      struct.setHisprohin(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohin());
      struct.setHispromin(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromin());
      struct.setHisprohfi(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohfi());
      struct.setHispromfi(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromfi());
      struct.setHisprof(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprof());
      struct.setParcod(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcod());
      struct.setParcodnom(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcodnom());
      struct.setHisprotre(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotre());
      struct.setHisprotte(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotte());
      struct.setHisbartip(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisbartip());
      struct.setHisproest(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproest());
      struct.setHisprokgr(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokgr());
      struct.setHispromtr(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromtr());
      struct.setHisprotip(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotip());
      struct.setHisprocod(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocod());
      struct.setHisprolot(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolot());
      struct.setHisprotc(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotc());
      struct.setHisproreo(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproreo());
      struct.setHisprobot(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprobot());
      struct.setHispronpart(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpart());
      struct.setHispronpzs(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpzs());
      struct.setHisproban(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproban());
      if ( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi_N == 0 )
      {
         struct.setHisprodi(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi());
      }
      if ( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi_N == 0 )
      {
         struct.setHisprohi(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi());
      }
      if ( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf_N == 0 )
      {
         struct.setHisprodf(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf());
      }
      if ( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf_N == 0 )
      {
         struct.setHisprohf(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf());
      }
      if ( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti_N == 0 )
      {
         struct.setHisprodti(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti());
      }
      if ( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf_N == 0 )
      {
         struct.setHisprodtf(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf());
      }
      struct.setHisprotr2(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotr2());
      struct.setHisprotdab(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotdab());
      struct.setHispronpd(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpd());
      struct.setHisproctr(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproctr());
      struct.setHisprogf(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprogf());
      struct.setHishhmaq(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhmaq());
      struct.setHishhini(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhini());
      struct.setHispromq(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromq());
      if ( gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd_N == 0 )
      {
         struct.setHisprofd(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd());
      }
      struct.setHisprodibc(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibc());
      struct.setHisprodibi(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibi());
      struct.setHisprocom(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocom());
      struct.setHisprofon(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofon());
      struct.setHispromthd(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromthd());
      struct.setHisprokghd(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokghd());
      struct.setHispropzhd(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispropzhd());
      struct.setClicod(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clicod());
      struct.setClinom(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clinom());
      struct.setBarser(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barser());
      struct.setBarserdsc(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barserdsc());
      struct.setParfascod(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfascod());
      struct.setParfasdsc(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfasdsc());
      struct.setBarparvl2(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvl2());
      struct.setBarparvmn(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn());
      struct.setBarparvmx(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx());
      struct.setBarvalpar(getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar());
      return struct ;
   }

   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir_N ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec_N ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotur ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohin ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromin ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohfi ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromfi ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisbartip ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproest ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotc ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproreo ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi_N ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi_N ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf_N ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf_N ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti_N ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf_N ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpd ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd_N ;
   protected short gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin ;
   protected short gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcod ;
   protected short gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotre ;
   protected short gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotte ;
   protected short gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotip ;
   protected short gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpzs ;
   protected short gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotr2 ;
   protected short gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotdab ;
   protected short gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprogf ;
   protected short gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfascod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproulin ;
   protected int gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolin ;
   protected int gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod ;
   protected int gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopecod ;
   protected int gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprobot ;
   protected int gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpart ;
   protected int gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibi ;
   protected int gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispropzhd ;
   protected int gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clicod ;
   protected java.math.BigDecimal gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Totuni ;
   protected java.math.BigDecimal gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprouni ;
   protected java.math.BigDecimal gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokgr ;
   protected java.math.BigDecimal gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromtr ;
   protected java.math.BigDecimal gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhmaq ;
   protected java.math.BigDecimal gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhini ;
   protected java.math.BigDecimal gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromthd ;
   protected java.math.BigDecimal gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokghd ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcod ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprnom ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqcod ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqdsc ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopedsc ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fase ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fasedsc ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprof ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcodnom ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocod ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolot ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproban ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproctr ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromq ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibc ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocom ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofon ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clinom ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barser ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barserdsc ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfasdsc ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvl2 ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi ;
   protected java.util.Date gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf ;
   protected java.util.Date gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti ;
   protected java.util.Date gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf ;
   protected java.util.Date datetime_STZ ;
   protected java.util.Date gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec ;
   protected java.util.Date gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi ;
   protected java.util.Date gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf ;
   protected java.util.Date gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd ;
   protected boolean readElement ;
   protected boolean formatError ;
}

