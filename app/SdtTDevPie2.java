package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTDevPie2 extends GxSilentTrnSdt
{
   public SdtTDevPie2( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTDevPie2.class));
   }

   public SdtTDevPie2( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle, context, "SdtTDevPie2");
      initialize( remoteHandle) ;
   }

   public SdtTDevPie2( int remoteHandle ,
                       StructSdtTDevPie2 struct )
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
                     int AV323DevGenCod )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV396EmprCod,Integer.valueOf(AV323DevGenCod)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"EmprCod", String.class}, new Object[]{"DevGenCod", int.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "TDevPie2");
      metadata.set("BT", "TXPDEVGEN");
      metadata.set("PK", "[ \"DevGenCod\" ]");
      metadata.set("Levels", "[ \"Level1Item\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"AlbRecCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"TrnCod\" ],\"FKMap\":[ \"DevGenTrn-TrnCod\" ] } ]");
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
               gxTv_SdtTDevPie2_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtTDevPie2_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevGenCod") )
            {
               gxTv_SdtTDevPie2_Devgencod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevGenFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTDevPie2_Devgenfec = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtTDevPie2_Devgenfec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRecCod") )
            {
               gxTv_SdtTDevPie2_Albreccod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevGenDom") )
            {
               gxTv_SdtTDevPie2_Devgendom = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtTDevPie2_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtTDevPie2_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRef") )
            {
               gxTv_SdtTDevPie2_Albref = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevGenTrn") )
            {
               gxTv_SdtTDevPie2_Devgentrn = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevTrnNom") )
            {
               gxTv_SdtTDevPie2_Devtrnnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniDis") )
            {
               gxTv_SdtTDevPie2_Albrunidis = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPieDis") )
            {
               gxTv_SdtTDevPie2_Albrpiedis = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUni") )
            {
               gxTv_SdtTDevPie2_Albruni = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevGenUni") )
            {
               gxTv_SdtTDevPie2_Devgenuni = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevGenPie") )
            {
               gxTv_SdtTDevPie2_Devgenpie = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniUti") )
            {
               gxTv_SdtTDevPie2_Albruniuti = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPieUti") )
            {
               gxTv_SdtTDevPie2_Albrpieuti = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPieEnt") )
            {
               gxTv_SdtTDevPie2_Albrpieent = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniEnt") )
            {
               gxTv_SdtTDevPie2_Albrunient = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbREst") )
            {
               gxTv_SdtTDevPie2_Albrest = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevGenEst") )
            {
               gxTv_SdtTDevPie2_Devgenest = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDevPUni") )
            {
               gxTv_SdtTDevPie2_Albdevpuni = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDevPPie") )
            {
               gxTv_SdtTDevPie2_Albdevppie = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevUlin") )
            {
               gxTv_SdtTDevPie2_Devulin = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Level1") )
            {
               if ( gxTv_SdtTDevPie2_Level1 == null )
               {
                  gxTv_SdtTDevPie2_Level1 = new GXBCLevelCollection<app.SdtTDevPie2_Level1Item>(app.SdtTDevPie2_Level1Item.class, "TDevPie2.Level1Item", "TexplusNET", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtTDevPie2_Level1.readxml(oReader, "Level1") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Level1") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTDevPie2_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTDevPie2_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod_Z") )
            {
               gxTv_SdtTDevPie2_Emprcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_Z") )
            {
               gxTv_SdtTDevPie2_Emprnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevGenCod_Z") )
            {
               gxTv_SdtTDevPie2_Devgencod_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevGenFec_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTDevPie2_Devgenfec_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtTDevPie2_Devgenfec_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRecCod_Z") )
            {
               gxTv_SdtTDevPie2_Albreccod_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevGenDom_Z") )
            {
               gxTv_SdtTDevPie2_Devgendom_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod_Z") )
            {
               gxTv_SdtTDevPie2_Clicod_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom_Z") )
            {
               gxTv_SdtTDevPie2_Clinom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRef_Z") )
            {
               gxTv_SdtTDevPie2_Albref_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevGenTrn_Z") )
            {
               gxTv_SdtTDevPie2_Devgentrn_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevTrnNom_Z") )
            {
               gxTv_SdtTDevPie2_Devtrnnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniDis_Z") )
            {
               gxTv_SdtTDevPie2_Albrunidis_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPieDis_Z") )
            {
               gxTv_SdtTDevPie2_Albrpiedis_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUni_Z") )
            {
               gxTv_SdtTDevPie2_Albruni_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevGenUni_Z") )
            {
               gxTv_SdtTDevPie2_Devgenuni_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevGenPie_Z") )
            {
               gxTv_SdtTDevPie2_Devgenpie_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniUti_Z") )
            {
               gxTv_SdtTDevPie2_Albruniuti_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPieUti_Z") )
            {
               gxTv_SdtTDevPie2_Albrpieuti_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRPieEnt_Z") )
            {
               gxTv_SdtTDevPie2_Albrpieent_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRUniEnt_Z") )
            {
               gxTv_SdtTDevPie2_Albrunient_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbREst_Z") )
            {
               gxTv_SdtTDevPie2_Albrest_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevGenEst_Z") )
            {
               gxTv_SdtTDevPie2_Devgenest_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDevPUni_Z") )
            {
               gxTv_SdtTDevPie2_Albdevpuni_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbDevPPie_Z") )
            {
               gxTv_SdtTDevPie2_Albdevppie_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevUlin_Z") )
            {
               gxTv_SdtTDevPie2_Devulin_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_N") )
            {
               gxTv_SdtTDevPie2_Emprnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevGenFec_N") )
            {
               gxTv_SdtTDevPie2_Devgenfec_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbRecCod_N") )
            {
               gxTv_SdtTDevPie2_Albreccod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevGenDom_N") )
            {
               gxTv_SdtTDevPie2_Devgendom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod_N") )
            {
               gxTv_SdtTDevPie2_Clicod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevGenTrn_N") )
            {
               gxTv_SdtTDevPie2_Devgentrn_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevTrnNom_N") )
            {
               gxTv_SdtTDevPie2_Devtrnnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevGenUni_N") )
            {
               gxTv_SdtTDevPie2_Devgenuni_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevGenPie_N") )
            {
               gxTv_SdtTDevPie2_Devgenpie_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevGenEst_N") )
            {
               gxTv_SdtTDevPie2_Devgenest_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DevUlin_N") )
            {
               gxTv_SdtTDevPie2_Devulin_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "TDevPie2" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtTDevPie2_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtTDevPie2_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DevGenCod", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Devgencod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTDevPie2_Devgenfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTDevPie2_Devgenfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTDevPie2_Devgenfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("DevGenFec", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRecCod", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Albreccod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DevGenDom", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Devgendom, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtTDevPie2_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRef", gxTv_SdtTDevPie2_Albref);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DevGenTrn", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Devgentrn, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DevTrnNom", gxTv_SdtTDevPie2_Devtrnnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRUniDis", GXutil.trim( GXutil.strNoRound( gxTv_SdtTDevPie2_Albrunidis, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRPieDis", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Albrpiedis, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRUni", gxTv_SdtTDevPie2_Albruni);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DevGenUni", GXutil.trim( GXutil.strNoRound( gxTv_SdtTDevPie2_Devgenuni, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DevGenPie", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Devgenpie, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRUniUti", GXutil.trim( GXutil.strNoRound( gxTv_SdtTDevPie2_Albruniuti, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRPieUti", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Albrpieuti, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRPieEnt", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Albrpieent, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbRUniEnt", GXutil.trim( GXutil.strNoRound( gxTv_SdtTDevPie2_Albrunient, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbREst", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Albrest, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DevGenEst", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Devgenest, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDevPUni", GXutil.trim( GXutil.strNoRound( gxTv_SdtTDevPie2_Albdevpuni, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbDevPPie", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Albdevppie, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DevUlin", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Devulin, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtTDevPie2_Level1 != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtTDevPie2_Level1.writexml(oWriter, "Level1", sNameSpace1, sIncludeState);
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtTDevPie2_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprCod_Z", gxTv_SdtTDevPie2_Emprcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_Z", gxTv_SdtTDevPie2_Emprnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DevGenCod_Z", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Devgencod_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTDevPie2_Devgenfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTDevPie2_Devgenfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTDevPie2_Devgenfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("DevGenFec_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRecCod_Z", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Albreccod_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DevGenDom_Z", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Devgendom_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CliCod_Z", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Clicod_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CliNom_Z", gxTv_SdtTDevPie2_Clinom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRef_Z", gxTv_SdtTDevPie2_Albref_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DevGenTrn_Z", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Devgentrn_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DevTrnNom_Z", gxTv_SdtTDevPie2_Devtrnnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRUniDis_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTDevPie2_Albrunidis_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRPieDis_Z", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Albrpiedis_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRUni_Z", gxTv_SdtTDevPie2_Albruni_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DevGenUni_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTDevPie2_Devgenuni_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DevGenPie_Z", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Devgenpie_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRUniUti_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTDevPie2_Albruniuti_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRPieUti_Z", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Albrpieuti_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRPieEnt_Z", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Albrpieent_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRUniEnt_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTDevPie2_Albrunient_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbREst_Z", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Albrest_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DevGenEst_Z", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Devgenest_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbDevPUni_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTDevPie2_Albdevpuni_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbDevPPie_Z", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Albdevppie_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DevUlin_Z", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Devulin_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_N", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Emprnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DevGenFec_N", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Devgenfec_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("AlbRecCod_N", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Albreccod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DevGenDom_N", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Devgendom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CliCod_N", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Clicod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DevGenTrn_N", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Devgentrn_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DevTrnNom_N", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Devtrnnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DevGenUni_N", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Devgenuni_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DevGenPie_N", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Devgenpie_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DevGenEst_N", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Devgenest_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DevUlin_N", GXutil.trim( GXutil.str( gxTv_SdtTDevPie2_Devulin_N, 1, 0)));
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
      AddObjectProperty("EmprCod", gxTv_SdtTDevPie2_Emprcod, false, includeNonInitialized);
      AddObjectProperty("EmprNom", gxTv_SdtTDevPie2_Emprnom, false, includeNonInitialized);
      AddObjectProperty("EmprNom_N", gxTv_SdtTDevPie2_Emprnom_N, false, includeNonInitialized);
      AddObjectProperty("DevGenCod", gxTv_SdtTDevPie2_Devgencod, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTDevPie2_Devgenfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTDevPie2_Devgenfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTDevPie2_Devgenfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("DevGenFec", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("DevGenFec_N", gxTv_SdtTDevPie2_Devgenfec_N, false, includeNonInitialized);
      AddObjectProperty("AlbRecCod", gxTv_SdtTDevPie2_Albreccod, false, includeNonInitialized);
      AddObjectProperty("AlbRecCod_N", gxTv_SdtTDevPie2_Albreccod_N, false, includeNonInitialized);
      AddObjectProperty("DevGenDom", gxTv_SdtTDevPie2_Devgendom, false, includeNonInitialized);
      AddObjectProperty("DevGenDom_N", gxTv_SdtTDevPie2_Devgendom_N, false, includeNonInitialized);
      AddObjectProperty("CliCod", gxTv_SdtTDevPie2_Clicod, false, includeNonInitialized);
      AddObjectProperty("CliCod_N", gxTv_SdtTDevPie2_Clicod_N, false, includeNonInitialized);
      AddObjectProperty("CliNom", gxTv_SdtTDevPie2_Clinom, false, includeNonInitialized);
      AddObjectProperty("AlbRef", gxTv_SdtTDevPie2_Albref, false, includeNonInitialized);
      AddObjectProperty("DevGenTrn", gxTv_SdtTDevPie2_Devgentrn, false, includeNonInitialized);
      AddObjectProperty("DevGenTrn_N", gxTv_SdtTDevPie2_Devgentrn_N, false, includeNonInitialized);
      AddObjectProperty("DevTrnNom", gxTv_SdtTDevPie2_Devtrnnom, false, includeNonInitialized);
      AddObjectProperty("DevTrnNom_N", gxTv_SdtTDevPie2_Devtrnnom_N, false, includeNonInitialized);
      AddObjectProperty("AlbRUniDis", gxTv_SdtTDevPie2_Albrunidis, false, includeNonInitialized);
      AddObjectProperty("AlbRPieDis", gxTv_SdtTDevPie2_Albrpiedis, false, includeNonInitialized);
      AddObjectProperty("AlbRUni", gxTv_SdtTDevPie2_Albruni, false, includeNonInitialized);
      AddObjectProperty("DevGenUni", gxTv_SdtTDevPie2_Devgenuni, false, includeNonInitialized);
      AddObjectProperty("DevGenUni_N", gxTv_SdtTDevPie2_Devgenuni_N, false, includeNonInitialized);
      AddObjectProperty("DevGenPie", gxTv_SdtTDevPie2_Devgenpie, false, includeNonInitialized);
      AddObjectProperty("DevGenPie_N", gxTv_SdtTDevPie2_Devgenpie_N, false, includeNonInitialized);
      AddObjectProperty("AlbRUniUti", gxTv_SdtTDevPie2_Albruniuti, false, includeNonInitialized);
      AddObjectProperty("AlbRPieUti", gxTv_SdtTDevPie2_Albrpieuti, false, includeNonInitialized);
      AddObjectProperty("AlbRPieEnt", gxTv_SdtTDevPie2_Albrpieent, false, includeNonInitialized);
      AddObjectProperty("AlbRUniEnt", gxTv_SdtTDevPie2_Albrunient, false, includeNonInitialized);
      AddObjectProperty("AlbREst", gxTv_SdtTDevPie2_Albrest, false, includeNonInitialized);
      AddObjectProperty("DevGenEst", gxTv_SdtTDevPie2_Devgenest, false, includeNonInitialized);
      AddObjectProperty("DevGenEst_N", gxTv_SdtTDevPie2_Devgenest_N, false, includeNonInitialized);
      AddObjectProperty("AlbDevPUni", gxTv_SdtTDevPie2_Albdevpuni, false, includeNonInitialized);
      AddObjectProperty("AlbDevPPie", gxTv_SdtTDevPie2_Albdevppie, false, includeNonInitialized);
      AddObjectProperty("DevUlin", gxTv_SdtTDevPie2_Devulin, false, includeNonInitialized);
      AddObjectProperty("DevUlin_N", gxTv_SdtTDevPie2_Devulin_N, false, includeNonInitialized);
      if ( gxTv_SdtTDevPie2_Level1 != null )
      {
         AddObjectProperty("Level1", gxTv_SdtTDevPie2_Level1, includeState, includeNonInitialized);
      }
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTDevPie2_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtTDevPie2_Initialized, false, includeNonInitialized);
         AddObjectProperty("EmprCod_Z", gxTv_SdtTDevPie2_Emprcod_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_Z", gxTv_SdtTDevPie2_Emprnom_Z, false, includeNonInitialized);
         AddObjectProperty("DevGenCod_Z", gxTv_SdtTDevPie2_Devgencod_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTDevPie2_Devgenfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTDevPie2_Devgenfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTDevPie2_Devgenfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("DevGenFec_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("AlbRecCod_Z", gxTv_SdtTDevPie2_Albreccod_Z, false, includeNonInitialized);
         AddObjectProperty("DevGenDom_Z", gxTv_SdtTDevPie2_Devgendom_Z, false, includeNonInitialized);
         AddObjectProperty("CliCod_Z", gxTv_SdtTDevPie2_Clicod_Z, false, includeNonInitialized);
         AddObjectProperty("CliNom_Z", gxTv_SdtTDevPie2_Clinom_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRef_Z", gxTv_SdtTDevPie2_Albref_Z, false, includeNonInitialized);
         AddObjectProperty("DevGenTrn_Z", gxTv_SdtTDevPie2_Devgentrn_Z, false, includeNonInitialized);
         AddObjectProperty("DevTrnNom_Z", gxTv_SdtTDevPie2_Devtrnnom_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRUniDis_Z", gxTv_SdtTDevPie2_Albrunidis_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRPieDis_Z", gxTv_SdtTDevPie2_Albrpiedis_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRUni_Z", gxTv_SdtTDevPie2_Albruni_Z, false, includeNonInitialized);
         AddObjectProperty("DevGenUni_Z", gxTv_SdtTDevPie2_Devgenuni_Z, false, includeNonInitialized);
         AddObjectProperty("DevGenPie_Z", gxTv_SdtTDevPie2_Devgenpie_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRUniUti_Z", gxTv_SdtTDevPie2_Albruniuti_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRPieUti_Z", gxTv_SdtTDevPie2_Albrpieuti_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRPieEnt_Z", gxTv_SdtTDevPie2_Albrpieent_Z, false, includeNonInitialized);
         AddObjectProperty("AlbRUniEnt_Z", gxTv_SdtTDevPie2_Albrunient_Z, false, includeNonInitialized);
         AddObjectProperty("AlbREst_Z", gxTv_SdtTDevPie2_Albrest_Z, false, includeNonInitialized);
         AddObjectProperty("DevGenEst_Z", gxTv_SdtTDevPie2_Devgenest_Z, false, includeNonInitialized);
         AddObjectProperty("AlbDevPUni_Z", gxTv_SdtTDevPie2_Albdevpuni_Z, false, includeNonInitialized);
         AddObjectProperty("AlbDevPPie_Z", gxTv_SdtTDevPie2_Albdevppie_Z, false, includeNonInitialized);
         AddObjectProperty("DevUlin_Z", gxTv_SdtTDevPie2_Devulin_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_N", gxTv_SdtTDevPie2_Emprnom_N, false, includeNonInitialized);
         AddObjectProperty("DevGenFec_N", gxTv_SdtTDevPie2_Devgenfec_N, false, includeNonInitialized);
         AddObjectProperty("AlbRecCod_N", gxTv_SdtTDevPie2_Albreccod_N, false, includeNonInitialized);
         AddObjectProperty("DevGenDom_N", gxTv_SdtTDevPie2_Devgendom_N, false, includeNonInitialized);
         AddObjectProperty("CliCod_N", gxTv_SdtTDevPie2_Clicod_N, false, includeNonInitialized);
         AddObjectProperty("DevGenTrn_N", gxTv_SdtTDevPie2_Devgentrn_N, false, includeNonInitialized);
         AddObjectProperty("DevTrnNom_N", gxTv_SdtTDevPie2_Devtrnnom_N, false, includeNonInitialized);
         AddObjectProperty("DevGenUni_N", gxTv_SdtTDevPie2_Devgenuni_N, false, includeNonInitialized);
         AddObjectProperty("DevGenPie_N", gxTv_SdtTDevPie2_Devgenpie_N, false, includeNonInitialized);
         AddObjectProperty("DevGenEst_N", gxTv_SdtTDevPie2_Devgenest_N, false, includeNonInitialized);
         AddObjectProperty("DevUlin_N", gxTv_SdtTDevPie2_Devulin_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.SdtTDevPie2 sdt )
   {
      if ( sdt.IsDirty("EmprCod") )
      {
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Emprcod = sdt.getgxTv_SdtTDevPie2_Emprcod() ;
      }
      if ( sdt.IsDirty("EmprNom") )
      {
         gxTv_SdtTDevPie2_Emprnom_N = sdt.getgxTv_SdtTDevPie2_Emprnom_N() ;
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Emprnom = sdt.getgxTv_SdtTDevPie2_Emprnom() ;
      }
      if ( sdt.IsDirty("DevGenCod") )
      {
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Devgencod = sdt.getgxTv_SdtTDevPie2_Devgencod() ;
      }
      if ( sdt.IsDirty("DevGenFec") )
      {
         gxTv_SdtTDevPie2_Devgenfec_N = sdt.getgxTv_SdtTDevPie2_Devgenfec_N() ;
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Devgenfec = sdt.getgxTv_SdtTDevPie2_Devgenfec() ;
      }
      if ( sdt.IsDirty("AlbRecCod") )
      {
         gxTv_SdtTDevPie2_Albreccod_N = sdt.getgxTv_SdtTDevPie2_Albreccod_N() ;
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Albreccod = sdt.getgxTv_SdtTDevPie2_Albreccod() ;
      }
      if ( sdt.IsDirty("DevGenDom") )
      {
         gxTv_SdtTDevPie2_Devgendom_N = sdt.getgxTv_SdtTDevPie2_Devgendom_N() ;
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Devgendom = sdt.getgxTv_SdtTDevPie2_Devgendom() ;
      }
      if ( sdt.IsDirty("CliCod") )
      {
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Clicod = sdt.getgxTv_SdtTDevPie2_Clicod() ;
      }
      if ( sdt.IsDirty("CliNom") )
      {
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Clinom = sdt.getgxTv_SdtTDevPie2_Clinom() ;
      }
      if ( sdt.IsDirty("AlbRef") )
      {
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Albref = sdt.getgxTv_SdtTDevPie2_Albref() ;
      }
      if ( sdt.IsDirty("DevGenTrn") )
      {
         gxTv_SdtTDevPie2_Devgentrn_N = sdt.getgxTv_SdtTDevPie2_Devgentrn_N() ;
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Devgentrn = sdt.getgxTv_SdtTDevPie2_Devgentrn() ;
      }
      if ( sdt.IsDirty("DevTrnNom") )
      {
         gxTv_SdtTDevPie2_Devtrnnom_N = sdt.getgxTv_SdtTDevPie2_Devtrnnom_N() ;
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Devtrnnom = sdt.getgxTv_SdtTDevPie2_Devtrnnom() ;
      }
      if ( sdt.IsDirty("AlbRUniDis") )
      {
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Albrunidis = sdt.getgxTv_SdtTDevPie2_Albrunidis() ;
      }
      if ( sdt.IsDirty("AlbRPieDis") )
      {
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Albrpiedis = sdt.getgxTv_SdtTDevPie2_Albrpiedis() ;
      }
      if ( sdt.IsDirty("AlbRUni") )
      {
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Albruni = sdt.getgxTv_SdtTDevPie2_Albruni() ;
      }
      if ( sdt.IsDirty("DevGenUni") )
      {
         gxTv_SdtTDevPie2_Devgenuni_N = sdt.getgxTv_SdtTDevPie2_Devgenuni_N() ;
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Devgenuni = sdt.getgxTv_SdtTDevPie2_Devgenuni() ;
      }
      if ( sdt.IsDirty("DevGenPie") )
      {
         gxTv_SdtTDevPie2_Devgenpie_N = sdt.getgxTv_SdtTDevPie2_Devgenpie_N() ;
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Devgenpie = sdt.getgxTv_SdtTDevPie2_Devgenpie() ;
      }
      if ( sdt.IsDirty("AlbRUniUti") )
      {
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Albruniuti = sdt.getgxTv_SdtTDevPie2_Albruniuti() ;
      }
      if ( sdt.IsDirty("AlbRPieUti") )
      {
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Albrpieuti = sdt.getgxTv_SdtTDevPie2_Albrpieuti() ;
      }
      if ( sdt.IsDirty("AlbRPieEnt") )
      {
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Albrpieent = sdt.getgxTv_SdtTDevPie2_Albrpieent() ;
      }
      if ( sdt.IsDirty("AlbRUniEnt") )
      {
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Albrunient = sdt.getgxTv_SdtTDevPie2_Albrunient() ;
      }
      if ( sdt.IsDirty("AlbREst") )
      {
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Albrest = sdt.getgxTv_SdtTDevPie2_Albrest() ;
      }
      if ( sdt.IsDirty("DevGenEst") )
      {
         gxTv_SdtTDevPie2_Devgenest_N = sdt.getgxTv_SdtTDevPie2_Devgenest_N() ;
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Devgenest = sdt.getgxTv_SdtTDevPie2_Devgenest() ;
      }
      if ( sdt.IsDirty("AlbDevPUni") )
      {
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Albdevpuni = sdt.getgxTv_SdtTDevPie2_Albdevpuni() ;
      }
      if ( sdt.IsDirty("AlbDevPPie") )
      {
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Albdevppie = sdt.getgxTv_SdtTDevPie2_Albdevppie() ;
      }
      if ( sdt.IsDirty("DevUlin") )
      {
         gxTv_SdtTDevPie2_Devulin_N = sdt.getgxTv_SdtTDevPie2_Devulin_N() ;
         gxTv_SdtTDevPie2_N = (byte)(0) ;
         gxTv_SdtTDevPie2_Devulin = sdt.getgxTv_SdtTDevPie2_Devulin() ;
      }
      if ( gxTv_SdtTDevPie2_Level1 != null )
      {
         GXBCLevelCollection<app.SdtTDevPie2_Level1Item> newCollectionLevel1 = sdt.getgxTv_SdtTDevPie2_Level1();
         app.SdtTDevPie2_Level1Item currItemLevel1;
         app.SdtTDevPie2_Level1Item newItemLevel1;
         short idx = 1;
         while ( idx <= newCollectionLevel1.size() )
         {
            newItemLevel1 = (app.SdtTDevPie2_Level1Item)((app.SdtTDevPie2_Level1Item)newCollectionLevel1.elementAt(-1+idx));
            currItemLevel1 = (app.SdtTDevPie2_Level1Item)gxTv_SdtTDevPie2_Level1.getByKey(newItemLevel1.getgxTv_SdtTDevPie2_Level1Item_Albrecpie());
            if ( GXutil.strcmp(currItemLevel1.getgxTv_SdtTDevPie2_Level1Item_Mode(), "UPD") == 0 )
            {
               currItemLevel1.updateDirties(newItemLevel1);
               if ( GXutil.strcmp(newItemLevel1.getgxTv_SdtTDevPie2_Level1Item_Mode(), "DLT") == 0 )
               {
                  currItemLevel1.setgxTv_SdtTDevPie2_Level1Item_Mode( "DLT" );
               }
               currItemLevel1.setgxTv_SdtTDevPie2_Level1Item_Modified( (short)(1) );
            }
            else
            {
               gxTv_SdtTDevPie2_Level1.add(newItemLevel1, 0);
            }
            idx = (short)(idx+1) ;
         }
      }
   }

   public String getgxTv_SdtTDevPie2_Emprcod( )
   {
      return gxTv_SdtTDevPie2_Emprcod ;
   }

   public void setgxTv_SdtTDevPie2_Emprcod( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtTDevPie2_Emprcod, value) != 0 )
      {
         gxTv_SdtTDevPie2_Mode = "INS" ;
         this.setgxTv_SdtTDevPie2_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Emprnom_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Devgencod_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Devgenfec_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albreccod_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Devgendom_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Clicod_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Clinom_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albref_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Devgentrn_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Devtrnnom_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albrunidis_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albrpiedis_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albruni_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Devgenuni_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Devgenpie_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albruniuti_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albrpieuti_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albrpieent_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albrunient_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albrest_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Devgenest_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albdevpuni_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albdevppie_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Devulin_Z_SetNull( );
         if ( gxTv_SdtTDevPie2_Level1 != null )
         {
            GXBCLevelCollection<app.SdtTDevPie2_Level1Item> collectionLevel1 = gxTv_SdtTDevPie2_Level1;
            app.SdtTDevPie2_Level1Item currItemLevel1;
            short idx = 1;
            while ( idx <= collectionLevel1.size() )
            {
               currItemLevel1 = (app.SdtTDevPie2_Level1Item)((app.SdtTDevPie2_Level1Item)collectionLevel1.elementAt(-1+idx));
               currItemLevel1.setgxTv_SdtTDevPie2_Level1Item_Mode( "INS" );
               currItemLevel1.setgxTv_SdtTDevPie2_Level1Item_Modified( (short)(1) );
               idx = (short)(idx+1) ;
            }
         }
      }
      SetDirty("Emprcod");
      gxTv_SdtTDevPie2_Emprcod = value ;
   }

   public String getgxTv_SdtTDevPie2_Emprnom( )
   {
      return gxTv_SdtTDevPie2_Emprnom ;
   }

   public void setgxTv_SdtTDevPie2_Emprnom( String value )
   {
      gxTv_SdtTDevPie2_Emprnom_N = (byte)(0) ;
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Emprnom");
      gxTv_SdtTDevPie2_Emprnom = value ;
   }

   public void setgxTv_SdtTDevPie2_Emprnom_SetNull( )
   {
      gxTv_SdtTDevPie2_Emprnom_N = (byte)(1) ;
      gxTv_SdtTDevPie2_Emprnom = "" ;
      SetDirty("Emprnom");
   }

   public boolean getgxTv_SdtTDevPie2_Emprnom_IsNull( )
   {
      return (gxTv_SdtTDevPie2_Emprnom_N==1) ;
   }

   public int getgxTv_SdtTDevPie2_Devgencod( )
   {
      return gxTv_SdtTDevPie2_Devgencod ;
   }

   public void setgxTv_SdtTDevPie2_Devgencod( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      if ( gxTv_SdtTDevPie2_Devgencod != value )
      {
         gxTv_SdtTDevPie2_Mode = "INS" ;
         this.setgxTv_SdtTDevPie2_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Emprnom_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Devgencod_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Devgenfec_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albreccod_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Devgendom_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Clicod_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Clinom_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albref_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Devgentrn_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Devtrnnom_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albrunidis_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albrpiedis_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albruni_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Devgenuni_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Devgenpie_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albruniuti_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albrpieuti_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albrpieent_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albrunient_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albrest_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Devgenest_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albdevpuni_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Albdevppie_Z_SetNull( );
         this.setgxTv_SdtTDevPie2_Devulin_Z_SetNull( );
         if ( gxTv_SdtTDevPie2_Level1 != null )
         {
            GXBCLevelCollection<app.SdtTDevPie2_Level1Item> collectionLevel1 = gxTv_SdtTDevPie2_Level1;
            app.SdtTDevPie2_Level1Item currItemLevel1;
            short idx = 1;
            while ( idx <= collectionLevel1.size() )
            {
               currItemLevel1 = (app.SdtTDevPie2_Level1Item)((app.SdtTDevPie2_Level1Item)collectionLevel1.elementAt(-1+idx));
               currItemLevel1.setgxTv_SdtTDevPie2_Level1Item_Mode( "INS" );
               currItemLevel1.setgxTv_SdtTDevPie2_Level1Item_Modified( (short)(1) );
               idx = (short)(idx+1) ;
            }
         }
      }
      SetDirty("Devgencod");
      gxTv_SdtTDevPie2_Devgencod = value ;
   }

   public java.util.Date getgxTv_SdtTDevPie2_Devgenfec( )
   {
      return gxTv_SdtTDevPie2_Devgenfec ;
   }

   public void setgxTv_SdtTDevPie2_Devgenfec( java.util.Date value )
   {
      gxTv_SdtTDevPie2_Devgenfec_N = (byte)(0) ;
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devgenfec");
      gxTv_SdtTDevPie2_Devgenfec = value ;
   }

   public void setgxTv_SdtTDevPie2_Devgenfec_SetNull( )
   {
      gxTv_SdtTDevPie2_Devgenfec_N = (byte)(1) ;
      gxTv_SdtTDevPie2_Devgenfec = GXutil.nullDate() ;
      SetDirty("Devgenfec");
   }

   public boolean getgxTv_SdtTDevPie2_Devgenfec_IsNull( )
   {
      return (gxTv_SdtTDevPie2_Devgenfec_N==1) ;
   }

   public int getgxTv_SdtTDevPie2_Albreccod( )
   {
      return gxTv_SdtTDevPie2_Albreccod ;
   }

   public void setgxTv_SdtTDevPie2_Albreccod( int value )
   {
      gxTv_SdtTDevPie2_Albreccod_N = (byte)(0) ;
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albreccod");
      gxTv_SdtTDevPie2_Albreccod = value ;
   }

   public void setgxTv_SdtTDevPie2_Albreccod_SetNull( )
   {
      gxTv_SdtTDevPie2_Albreccod_N = (byte)(1) ;
      gxTv_SdtTDevPie2_Albreccod = 0 ;
      SetDirty("Albreccod");
   }

   public boolean getgxTv_SdtTDevPie2_Albreccod_IsNull( )
   {
      return (gxTv_SdtTDevPie2_Albreccod_N==1) ;
   }

   public byte getgxTv_SdtTDevPie2_Devgendom( )
   {
      return gxTv_SdtTDevPie2_Devgendom ;
   }

   public void setgxTv_SdtTDevPie2_Devgendom( byte value )
   {
      gxTv_SdtTDevPie2_Devgendom_N = (byte)(0) ;
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devgendom");
      gxTv_SdtTDevPie2_Devgendom = value ;
   }

   public void setgxTv_SdtTDevPie2_Devgendom_SetNull( )
   {
      gxTv_SdtTDevPie2_Devgendom_N = (byte)(1) ;
      gxTv_SdtTDevPie2_Devgendom = (byte)(0) ;
      SetDirty("Devgendom");
   }

   public boolean getgxTv_SdtTDevPie2_Devgendom_IsNull( )
   {
      return (gxTv_SdtTDevPie2_Devgendom_N==1) ;
   }

   public int getgxTv_SdtTDevPie2_Clicod( )
   {
      return gxTv_SdtTDevPie2_Clicod ;
   }

   public void setgxTv_SdtTDevPie2_Clicod( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Clicod");
      gxTv_SdtTDevPie2_Clicod = value ;
   }

   public String getgxTv_SdtTDevPie2_Clinom( )
   {
      return gxTv_SdtTDevPie2_Clinom ;
   }

   public void setgxTv_SdtTDevPie2_Clinom( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Clinom");
      gxTv_SdtTDevPie2_Clinom = value ;
   }

   public String getgxTv_SdtTDevPie2_Albref( )
   {
      return gxTv_SdtTDevPie2_Albref ;
   }

   public void setgxTv_SdtTDevPie2_Albref( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albref");
      gxTv_SdtTDevPie2_Albref = value ;
   }

   public short getgxTv_SdtTDevPie2_Devgentrn( )
   {
      return gxTv_SdtTDevPie2_Devgentrn ;
   }

   public void setgxTv_SdtTDevPie2_Devgentrn( short value )
   {
      gxTv_SdtTDevPie2_Devgentrn_N = (byte)(0) ;
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devgentrn");
      gxTv_SdtTDevPie2_Devgentrn = value ;
   }

   public void setgxTv_SdtTDevPie2_Devgentrn_SetNull( )
   {
      gxTv_SdtTDevPie2_Devgentrn_N = (byte)(1) ;
      gxTv_SdtTDevPie2_Devgentrn = (short)(0) ;
      SetDirty("Devgentrn");
   }

   public boolean getgxTv_SdtTDevPie2_Devgentrn_IsNull( )
   {
      return (gxTv_SdtTDevPie2_Devgentrn_N==1) ;
   }

   public String getgxTv_SdtTDevPie2_Devtrnnom( )
   {
      return gxTv_SdtTDevPie2_Devtrnnom ;
   }

   public void setgxTv_SdtTDevPie2_Devtrnnom( String value )
   {
      gxTv_SdtTDevPie2_Devtrnnom_N = (byte)(0) ;
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devtrnnom");
      gxTv_SdtTDevPie2_Devtrnnom = value ;
   }

   public void setgxTv_SdtTDevPie2_Devtrnnom_SetNull( )
   {
      gxTv_SdtTDevPie2_Devtrnnom_N = (byte)(1) ;
      gxTv_SdtTDevPie2_Devtrnnom = "" ;
      SetDirty("Devtrnnom");
   }

   public boolean getgxTv_SdtTDevPie2_Devtrnnom_IsNull( )
   {
      return (gxTv_SdtTDevPie2_Devtrnnom_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTDevPie2_Albrunidis( )
   {
      return gxTv_SdtTDevPie2_Albrunidis ;
   }

   public void setgxTv_SdtTDevPie2_Albrunidis( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albrunidis");
      gxTv_SdtTDevPie2_Albrunidis = value ;
   }

   public void setgxTv_SdtTDevPie2_Albrunidis_SetNull( )
   {
      gxTv_SdtTDevPie2_Albrunidis = DecimalUtil.ZERO ;
      SetDirty("Albrunidis");
   }

   public boolean getgxTv_SdtTDevPie2_Albrunidis_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTDevPie2_Albrpiedis( )
   {
      return gxTv_SdtTDevPie2_Albrpiedis ;
   }

   public void setgxTv_SdtTDevPie2_Albrpiedis( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albrpiedis");
      gxTv_SdtTDevPie2_Albrpiedis = value ;
   }

   public void setgxTv_SdtTDevPie2_Albrpiedis_SetNull( )
   {
      gxTv_SdtTDevPie2_Albrpiedis = 0 ;
      SetDirty("Albrpiedis");
   }

   public boolean getgxTv_SdtTDevPie2_Albrpiedis_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTDevPie2_Albruni( )
   {
      return gxTv_SdtTDevPie2_Albruni ;
   }

   public void setgxTv_SdtTDevPie2_Albruni( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albruni");
      gxTv_SdtTDevPie2_Albruni = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTDevPie2_Devgenuni( )
   {
      return gxTv_SdtTDevPie2_Devgenuni ;
   }

   public void setgxTv_SdtTDevPie2_Devgenuni( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPie2_Devgenuni_N = (byte)(0) ;
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devgenuni");
      gxTv_SdtTDevPie2_Devgenuni = value ;
   }

   public void setgxTv_SdtTDevPie2_Devgenuni_SetNull( )
   {
      gxTv_SdtTDevPie2_Devgenuni_N = (byte)(1) ;
      gxTv_SdtTDevPie2_Devgenuni = DecimalUtil.ZERO ;
      SetDirty("Devgenuni");
   }

   public boolean getgxTv_SdtTDevPie2_Devgenuni_IsNull( )
   {
      return (gxTv_SdtTDevPie2_Devgenuni_N==1) ;
   }

   public short getgxTv_SdtTDevPie2_Devgenpie( )
   {
      return gxTv_SdtTDevPie2_Devgenpie ;
   }

   public void setgxTv_SdtTDevPie2_Devgenpie( short value )
   {
      gxTv_SdtTDevPie2_Devgenpie_N = (byte)(0) ;
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devgenpie");
      gxTv_SdtTDevPie2_Devgenpie = value ;
   }

   public void setgxTv_SdtTDevPie2_Devgenpie_SetNull( )
   {
      gxTv_SdtTDevPie2_Devgenpie_N = (byte)(1) ;
      gxTv_SdtTDevPie2_Devgenpie = (short)(0) ;
      SetDirty("Devgenpie");
   }

   public boolean getgxTv_SdtTDevPie2_Devgenpie_IsNull( )
   {
      return (gxTv_SdtTDevPie2_Devgenpie_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTDevPie2_Albruniuti( )
   {
      return gxTv_SdtTDevPie2_Albruniuti ;
   }

   public void setgxTv_SdtTDevPie2_Albruniuti( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albruniuti");
      gxTv_SdtTDevPie2_Albruniuti = value ;
   }

   public int getgxTv_SdtTDevPie2_Albrpieuti( )
   {
      return gxTv_SdtTDevPie2_Albrpieuti ;
   }

   public void setgxTv_SdtTDevPie2_Albrpieuti( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albrpieuti");
      gxTv_SdtTDevPie2_Albrpieuti = value ;
   }

   public int getgxTv_SdtTDevPie2_Albrpieent( )
   {
      return gxTv_SdtTDevPie2_Albrpieent ;
   }

   public void setgxTv_SdtTDevPie2_Albrpieent( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albrpieent");
      gxTv_SdtTDevPie2_Albrpieent = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTDevPie2_Albrunient( )
   {
      return gxTv_SdtTDevPie2_Albrunient ;
   }

   public void setgxTv_SdtTDevPie2_Albrunient( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albrunient");
      gxTv_SdtTDevPie2_Albrunient = value ;
   }

   public byte getgxTv_SdtTDevPie2_Albrest( )
   {
      return gxTv_SdtTDevPie2_Albrest ;
   }

   public void setgxTv_SdtTDevPie2_Albrest( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albrest");
      gxTv_SdtTDevPie2_Albrest = value ;
   }

   public byte getgxTv_SdtTDevPie2_Devgenest( )
   {
      return gxTv_SdtTDevPie2_Devgenest ;
   }

   public void setgxTv_SdtTDevPie2_Devgenest( byte value )
   {
      gxTv_SdtTDevPie2_Devgenest_N = (byte)(0) ;
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devgenest");
      gxTv_SdtTDevPie2_Devgenest = value ;
   }

   public void setgxTv_SdtTDevPie2_Devgenest_SetNull( )
   {
      gxTv_SdtTDevPie2_Devgenest_N = (byte)(1) ;
      gxTv_SdtTDevPie2_Devgenest = (byte)(0) ;
      SetDirty("Devgenest");
   }

   public boolean getgxTv_SdtTDevPie2_Devgenest_IsNull( )
   {
      return (gxTv_SdtTDevPie2_Devgenest_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTDevPie2_Albdevpuni( )
   {
      return gxTv_SdtTDevPie2_Albdevpuni ;
   }

   public void setgxTv_SdtTDevPie2_Albdevpuni( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albdevpuni");
      gxTv_SdtTDevPie2_Albdevpuni = value ;
   }

   public void setgxTv_SdtTDevPie2_Albdevpuni_SetNull( )
   {
      gxTv_SdtTDevPie2_Albdevpuni = DecimalUtil.ZERO ;
      SetDirty("Albdevpuni");
   }

   public boolean getgxTv_SdtTDevPie2_Albdevpuni_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTDevPie2_Albdevppie( )
   {
      return gxTv_SdtTDevPie2_Albdevppie ;
   }

   public void setgxTv_SdtTDevPie2_Albdevppie( short value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albdevppie");
      gxTv_SdtTDevPie2_Albdevppie = value ;
   }

   public void setgxTv_SdtTDevPie2_Albdevppie_SetNull( )
   {
      gxTv_SdtTDevPie2_Albdevppie = (short)(0) ;
      SetDirty("Albdevppie");
   }

   public boolean getgxTv_SdtTDevPie2_Albdevppie_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTDevPie2_Devulin( )
   {
      return gxTv_SdtTDevPie2_Devulin ;
   }

   public void setgxTv_SdtTDevPie2_Devulin( byte value )
   {
      gxTv_SdtTDevPie2_Devulin_N = (byte)(0) ;
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devulin");
      gxTv_SdtTDevPie2_Devulin = value ;
   }

   public void setgxTv_SdtTDevPie2_Devulin_SetNull( )
   {
      gxTv_SdtTDevPie2_Devulin_N = (byte)(1) ;
      gxTv_SdtTDevPie2_Devulin = (byte)(0) ;
      SetDirty("Devulin");
   }

   public boolean getgxTv_SdtTDevPie2_Devulin_IsNull( )
   {
      return (gxTv_SdtTDevPie2_Devulin_N==1) ;
   }

   public GXBCLevelCollection<app.SdtTDevPie2_Level1Item> getgxTv_SdtTDevPie2_Level1( )
   {
      if ( gxTv_SdtTDevPie2_Level1 == null )
      {
         gxTv_SdtTDevPie2_Level1 = new GXBCLevelCollection<app.SdtTDevPie2_Level1Item>(app.SdtTDevPie2_Level1Item.class, "TDevPie2.Level1Item", "TexplusNET", remoteHandle);
      }
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      return gxTv_SdtTDevPie2_Level1 ;
   }

   public void setgxTv_SdtTDevPie2_Level1( GXBCLevelCollection<app.SdtTDevPie2_Level1Item> value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Level1");
      gxTv_SdtTDevPie2_Level1 = value ;
   }

   public void setgxTv_SdtTDevPie2_Level1_SetNull( )
   {
      gxTv_SdtTDevPie2_Level1 = null ;
      SetDirty("Level1");
   }

   public boolean getgxTv_SdtTDevPie2_Level1_IsNull( )
   {
      if ( gxTv_SdtTDevPie2_Level1 == null )
      {
         return true ;
      }
      return false ;
   }

   public String getgxTv_SdtTDevPie2_Mode( )
   {
      return gxTv_SdtTDevPie2_Mode ;
   }

   public void setgxTv_SdtTDevPie2_Mode( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtTDevPie2_Mode = value ;
   }

   public void setgxTv_SdtTDevPie2_Mode_SetNull( )
   {
      gxTv_SdtTDevPie2_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtTDevPie2_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTDevPie2_Initialized( )
   {
      return gxTv_SdtTDevPie2_Initialized ;
   }

   public void setgxTv_SdtTDevPie2_Initialized( short value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtTDevPie2_Initialized = value ;
   }

   public void setgxTv_SdtTDevPie2_Initialized_SetNull( )
   {
      gxTv_SdtTDevPie2_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtTDevPie2_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTDevPie2_Emprcod_Z( )
   {
      return gxTv_SdtTDevPie2_Emprcod_Z ;
   }

   public void setgxTv_SdtTDevPie2_Emprcod_Z( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Emprcod_Z");
      gxTv_SdtTDevPie2_Emprcod_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Emprcod_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Emprcod_Z = "" ;
      SetDirty("Emprcod_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Emprcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTDevPie2_Emprnom_Z( )
   {
      return gxTv_SdtTDevPie2_Emprnom_Z ;
   }

   public void setgxTv_SdtTDevPie2_Emprnom_Z( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Emprnom_Z");
      gxTv_SdtTDevPie2_Emprnom_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Emprnom_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Emprnom_Z = "" ;
      SetDirty("Emprnom_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Emprnom_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTDevPie2_Devgencod_Z( )
   {
      return gxTv_SdtTDevPie2_Devgencod_Z ;
   }

   public void setgxTv_SdtTDevPie2_Devgencod_Z( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devgencod_Z");
      gxTv_SdtTDevPie2_Devgencod_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Devgencod_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Devgencod_Z = 0 ;
      SetDirty("Devgencod_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Devgencod_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTDevPie2_Devgenfec_Z( )
   {
      return gxTv_SdtTDevPie2_Devgenfec_Z ;
   }

   public void setgxTv_SdtTDevPie2_Devgenfec_Z( java.util.Date value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devgenfec_Z");
      gxTv_SdtTDevPie2_Devgenfec_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Devgenfec_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Devgenfec_Z = GXutil.nullDate() ;
      SetDirty("Devgenfec_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Devgenfec_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTDevPie2_Albreccod_Z( )
   {
      return gxTv_SdtTDevPie2_Albreccod_Z ;
   }

   public void setgxTv_SdtTDevPie2_Albreccod_Z( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albreccod_Z");
      gxTv_SdtTDevPie2_Albreccod_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Albreccod_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Albreccod_Z = 0 ;
      SetDirty("Albreccod_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Albreccod_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTDevPie2_Devgendom_Z( )
   {
      return gxTv_SdtTDevPie2_Devgendom_Z ;
   }

   public void setgxTv_SdtTDevPie2_Devgendom_Z( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devgendom_Z");
      gxTv_SdtTDevPie2_Devgendom_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Devgendom_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Devgendom_Z = (byte)(0) ;
      SetDirty("Devgendom_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Devgendom_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTDevPie2_Clicod_Z( )
   {
      return gxTv_SdtTDevPie2_Clicod_Z ;
   }

   public void setgxTv_SdtTDevPie2_Clicod_Z( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Clicod_Z");
      gxTv_SdtTDevPie2_Clicod_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Clicod_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Clicod_Z = 0 ;
      SetDirty("Clicod_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Clicod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTDevPie2_Clinom_Z( )
   {
      return gxTv_SdtTDevPie2_Clinom_Z ;
   }

   public void setgxTv_SdtTDevPie2_Clinom_Z( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Clinom_Z");
      gxTv_SdtTDevPie2_Clinom_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Clinom_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Clinom_Z = "" ;
      SetDirty("Clinom_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Clinom_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTDevPie2_Albref_Z( )
   {
      return gxTv_SdtTDevPie2_Albref_Z ;
   }

   public void setgxTv_SdtTDevPie2_Albref_Z( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albref_Z");
      gxTv_SdtTDevPie2_Albref_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Albref_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Albref_Z = "" ;
      SetDirty("Albref_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Albref_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTDevPie2_Devgentrn_Z( )
   {
      return gxTv_SdtTDevPie2_Devgentrn_Z ;
   }

   public void setgxTv_SdtTDevPie2_Devgentrn_Z( short value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devgentrn_Z");
      gxTv_SdtTDevPie2_Devgentrn_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Devgentrn_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Devgentrn_Z = (short)(0) ;
      SetDirty("Devgentrn_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Devgentrn_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTDevPie2_Devtrnnom_Z( )
   {
      return gxTv_SdtTDevPie2_Devtrnnom_Z ;
   }

   public void setgxTv_SdtTDevPie2_Devtrnnom_Z( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devtrnnom_Z");
      gxTv_SdtTDevPie2_Devtrnnom_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Devtrnnom_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Devtrnnom_Z = "" ;
      SetDirty("Devtrnnom_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Devtrnnom_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTDevPie2_Albrunidis_Z( )
   {
      return gxTv_SdtTDevPie2_Albrunidis_Z ;
   }

   public void setgxTv_SdtTDevPie2_Albrunidis_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albrunidis_Z");
      gxTv_SdtTDevPie2_Albrunidis_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Albrunidis_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Albrunidis_Z = DecimalUtil.ZERO ;
      SetDirty("Albrunidis_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Albrunidis_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTDevPie2_Albrpiedis_Z( )
   {
      return gxTv_SdtTDevPie2_Albrpiedis_Z ;
   }

   public void setgxTv_SdtTDevPie2_Albrpiedis_Z( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albrpiedis_Z");
      gxTv_SdtTDevPie2_Albrpiedis_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Albrpiedis_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Albrpiedis_Z = 0 ;
      SetDirty("Albrpiedis_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Albrpiedis_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTDevPie2_Albruni_Z( )
   {
      return gxTv_SdtTDevPie2_Albruni_Z ;
   }

   public void setgxTv_SdtTDevPie2_Albruni_Z( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albruni_Z");
      gxTv_SdtTDevPie2_Albruni_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Albruni_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Albruni_Z = "" ;
      SetDirty("Albruni_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Albruni_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTDevPie2_Devgenuni_Z( )
   {
      return gxTv_SdtTDevPie2_Devgenuni_Z ;
   }

   public void setgxTv_SdtTDevPie2_Devgenuni_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devgenuni_Z");
      gxTv_SdtTDevPie2_Devgenuni_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Devgenuni_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Devgenuni_Z = DecimalUtil.ZERO ;
      SetDirty("Devgenuni_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Devgenuni_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTDevPie2_Devgenpie_Z( )
   {
      return gxTv_SdtTDevPie2_Devgenpie_Z ;
   }

   public void setgxTv_SdtTDevPie2_Devgenpie_Z( short value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devgenpie_Z");
      gxTv_SdtTDevPie2_Devgenpie_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Devgenpie_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Devgenpie_Z = (short)(0) ;
      SetDirty("Devgenpie_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Devgenpie_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTDevPie2_Albruniuti_Z( )
   {
      return gxTv_SdtTDevPie2_Albruniuti_Z ;
   }

   public void setgxTv_SdtTDevPie2_Albruniuti_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albruniuti_Z");
      gxTv_SdtTDevPie2_Albruniuti_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Albruniuti_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Albruniuti_Z = DecimalUtil.ZERO ;
      SetDirty("Albruniuti_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Albruniuti_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTDevPie2_Albrpieuti_Z( )
   {
      return gxTv_SdtTDevPie2_Albrpieuti_Z ;
   }

   public void setgxTv_SdtTDevPie2_Albrpieuti_Z( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albrpieuti_Z");
      gxTv_SdtTDevPie2_Albrpieuti_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Albrpieuti_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Albrpieuti_Z = 0 ;
      SetDirty("Albrpieuti_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Albrpieuti_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTDevPie2_Albrpieent_Z( )
   {
      return gxTv_SdtTDevPie2_Albrpieent_Z ;
   }

   public void setgxTv_SdtTDevPie2_Albrpieent_Z( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albrpieent_Z");
      gxTv_SdtTDevPie2_Albrpieent_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Albrpieent_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Albrpieent_Z = 0 ;
      SetDirty("Albrpieent_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Albrpieent_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTDevPie2_Albrunient_Z( )
   {
      return gxTv_SdtTDevPie2_Albrunient_Z ;
   }

   public void setgxTv_SdtTDevPie2_Albrunient_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albrunient_Z");
      gxTv_SdtTDevPie2_Albrunient_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Albrunient_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Albrunient_Z = DecimalUtil.ZERO ;
      SetDirty("Albrunient_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Albrunient_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTDevPie2_Albrest_Z( )
   {
      return gxTv_SdtTDevPie2_Albrest_Z ;
   }

   public void setgxTv_SdtTDevPie2_Albrest_Z( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albrest_Z");
      gxTv_SdtTDevPie2_Albrest_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Albrest_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Albrest_Z = (byte)(0) ;
      SetDirty("Albrest_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Albrest_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTDevPie2_Devgenest_Z( )
   {
      return gxTv_SdtTDevPie2_Devgenest_Z ;
   }

   public void setgxTv_SdtTDevPie2_Devgenest_Z( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devgenest_Z");
      gxTv_SdtTDevPie2_Devgenest_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Devgenest_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Devgenest_Z = (byte)(0) ;
      SetDirty("Devgenest_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Devgenest_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTDevPie2_Albdevpuni_Z( )
   {
      return gxTv_SdtTDevPie2_Albdevpuni_Z ;
   }

   public void setgxTv_SdtTDevPie2_Albdevpuni_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albdevpuni_Z");
      gxTv_SdtTDevPie2_Albdevpuni_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Albdevpuni_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Albdevpuni_Z = DecimalUtil.ZERO ;
      SetDirty("Albdevpuni_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Albdevpuni_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTDevPie2_Albdevppie_Z( )
   {
      return gxTv_SdtTDevPie2_Albdevppie_Z ;
   }

   public void setgxTv_SdtTDevPie2_Albdevppie_Z( short value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albdevppie_Z");
      gxTv_SdtTDevPie2_Albdevppie_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Albdevppie_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Albdevppie_Z = (short)(0) ;
      SetDirty("Albdevppie_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Albdevppie_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTDevPie2_Devulin_Z( )
   {
      return gxTv_SdtTDevPie2_Devulin_Z ;
   }

   public void setgxTv_SdtTDevPie2_Devulin_Z( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devulin_Z");
      gxTv_SdtTDevPie2_Devulin_Z = value ;
   }

   public void setgxTv_SdtTDevPie2_Devulin_Z_SetNull( )
   {
      gxTv_SdtTDevPie2_Devulin_Z = (byte)(0) ;
      SetDirty("Devulin_Z");
   }

   public boolean getgxTv_SdtTDevPie2_Devulin_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTDevPie2_Emprnom_N( )
   {
      return gxTv_SdtTDevPie2_Emprnom_N ;
   }

   public void setgxTv_SdtTDevPie2_Emprnom_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Emprnom_N");
      gxTv_SdtTDevPie2_Emprnom_N = value ;
   }

   public void setgxTv_SdtTDevPie2_Emprnom_N_SetNull( )
   {
      gxTv_SdtTDevPie2_Emprnom_N = (byte)(0) ;
      SetDirty("Emprnom_N");
   }

   public boolean getgxTv_SdtTDevPie2_Emprnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTDevPie2_Devgenfec_N( )
   {
      return gxTv_SdtTDevPie2_Devgenfec_N ;
   }

   public void setgxTv_SdtTDevPie2_Devgenfec_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devgenfec_N");
      gxTv_SdtTDevPie2_Devgenfec_N = value ;
   }

   public void setgxTv_SdtTDevPie2_Devgenfec_N_SetNull( )
   {
      gxTv_SdtTDevPie2_Devgenfec_N = (byte)(0) ;
      SetDirty("Devgenfec_N");
   }

   public boolean getgxTv_SdtTDevPie2_Devgenfec_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTDevPie2_Albreccod_N( )
   {
      return gxTv_SdtTDevPie2_Albreccod_N ;
   }

   public void setgxTv_SdtTDevPie2_Albreccod_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Albreccod_N");
      gxTv_SdtTDevPie2_Albreccod_N = value ;
   }

   public void setgxTv_SdtTDevPie2_Albreccod_N_SetNull( )
   {
      gxTv_SdtTDevPie2_Albreccod_N = (byte)(0) ;
      SetDirty("Albreccod_N");
   }

   public boolean getgxTv_SdtTDevPie2_Albreccod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTDevPie2_Devgendom_N( )
   {
      return gxTv_SdtTDevPie2_Devgendom_N ;
   }

   public void setgxTv_SdtTDevPie2_Devgendom_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devgendom_N");
      gxTv_SdtTDevPie2_Devgendom_N = value ;
   }

   public void setgxTv_SdtTDevPie2_Devgendom_N_SetNull( )
   {
      gxTv_SdtTDevPie2_Devgendom_N = (byte)(0) ;
      SetDirty("Devgendom_N");
   }

   public boolean getgxTv_SdtTDevPie2_Devgendom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTDevPie2_Clicod_N( )
   {
      return gxTv_SdtTDevPie2_Clicod_N ;
   }

   public void setgxTv_SdtTDevPie2_Clicod_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Clicod_N");
      gxTv_SdtTDevPie2_Clicod_N = value ;
   }

   public void setgxTv_SdtTDevPie2_Clicod_N_SetNull( )
   {
      gxTv_SdtTDevPie2_Clicod_N = (byte)(0) ;
      SetDirty("Clicod_N");
   }

   public boolean getgxTv_SdtTDevPie2_Clicod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTDevPie2_Devgentrn_N( )
   {
      return gxTv_SdtTDevPie2_Devgentrn_N ;
   }

   public void setgxTv_SdtTDevPie2_Devgentrn_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devgentrn_N");
      gxTv_SdtTDevPie2_Devgentrn_N = value ;
   }

   public void setgxTv_SdtTDevPie2_Devgentrn_N_SetNull( )
   {
      gxTv_SdtTDevPie2_Devgentrn_N = (byte)(0) ;
      SetDirty("Devgentrn_N");
   }

   public boolean getgxTv_SdtTDevPie2_Devgentrn_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTDevPie2_Devtrnnom_N( )
   {
      return gxTv_SdtTDevPie2_Devtrnnom_N ;
   }

   public void setgxTv_SdtTDevPie2_Devtrnnom_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devtrnnom_N");
      gxTv_SdtTDevPie2_Devtrnnom_N = value ;
   }

   public void setgxTv_SdtTDevPie2_Devtrnnom_N_SetNull( )
   {
      gxTv_SdtTDevPie2_Devtrnnom_N = (byte)(0) ;
      SetDirty("Devtrnnom_N");
   }

   public boolean getgxTv_SdtTDevPie2_Devtrnnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTDevPie2_Devgenuni_N( )
   {
      return gxTv_SdtTDevPie2_Devgenuni_N ;
   }

   public void setgxTv_SdtTDevPie2_Devgenuni_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devgenuni_N");
      gxTv_SdtTDevPie2_Devgenuni_N = value ;
   }

   public void setgxTv_SdtTDevPie2_Devgenuni_N_SetNull( )
   {
      gxTv_SdtTDevPie2_Devgenuni_N = (byte)(0) ;
      SetDirty("Devgenuni_N");
   }

   public boolean getgxTv_SdtTDevPie2_Devgenuni_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTDevPie2_Devgenpie_N( )
   {
      return gxTv_SdtTDevPie2_Devgenpie_N ;
   }

   public void setgxTv_SdtTDevPie2_Devgenpie_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devgenpie_N");
      gxTv_SdtTDevPie2_Devgenpie_N = value ;
   }

   public void setgxTv_SdtTDevPie2_Devgenpie_N_SetNull( )
   {
      gxTv_SdtTDevPie2_Devgenpie_N = (byte)(0) ;
      SetDirty("Devgenpie_N");
   }

   public boolean getgxTv_SdtTDevPie2_Devgenpie_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTDevPie2_Devgenest_N( )
   {
      return gxTv_SdtTDevPie2_Devgenest_N ;
   }

   public void setgxTv_SdtTDevPie2_Devgenest_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devgenest_N");
      gxTv_SdtTDevPie2_Devgenest_N = value ;
   }

   public void setgxTv_SdtTDevPie2_Devgenest_N_SetNull( )
   {
      gxTv_SdtTDevPie2_Devgenest_N = (byte)(0) ;
      SetDirty("Devgenest_N");
   }

   public boolean getgxTv_SdtTDevPie2_Devgenest_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTDevPie2_Devulin_N( )
   {
      return gxTv_SdtTDevPie2_Devulin_N ;
   }

   public void setgxTv_SdtTDevPie2_Devulin_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      SetDirty("Devulin_N");
      gxTv_SdtTDevPie2_Devulin_N = value ;
   }

   public void setgxTv_SdtTDevPie2_Devulin_N_SetNull( )
   {
      gxTv_SdtTDevPie2_Devulin_N = (byte)(0) ;
      SetDirty("Devulin_N");
   }

   public boolean getgxTv_SdtTDevPie2_Devulin_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.tdevpie2_bc obj;
      obj = new app.tdevpie2_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTDevPie2_Emprcod = "" ;
      gxTv_SdtTDevPie2_N = (byte)(1) ;
      gxTv_SdtTDevPie2_Emprnom = "" ;
      gxTv_SdtTDevPie2_Devgenfec = GXutil.nullDate() ;
      gxTv_SdtTDevPie2_Clinom = "" ;
      gxTv_SdtTDevPie2_Albref = "" ;
      gxTv_SdtTDevPie2_Devtrnnom = "" ;
      gxTv_SdtTDevPie2_Albrunidis = DecimalUtil.ZERO ;
      gxTv_SdtTDevPie2_Albruni = "" ;
      gxTv_SdtTDevPie2_Devgenuni = DecimalUtil.ZERO ;
      gxTv_SdtTDevPie2_Albruniuti = DecimalUtil.ZERO ;
      gxTv_SdtTDevPie2_Albrunient = DecimalUtil.ZERO ;
      gxTv_SdtTDevPie2_Albdevpuni = DecimalUtil.ZERO ;
      gxTv_SdtTDevPie2_Mode = "" ;
      gxTv_SdtTDevPie2_Emprcod_Z = "" ;
      gxTv_SdtTDevPie2_Emprnom_Z = "" ;
      gxTv_SdtTDevPie2_Devgenfec_Z = GXutil.nullDate() ;
      gxTv_SdtTDevPie2_Clinom_Z = "" ;
      gxTv_SdtTDevPie2_Albref_Z = "" ;
      gxTv_SdtTDevPie2_Devtrnnom_Z = "" ;
      gxTv_SdtTDevPie2_Albrunidis_Z = DecimalUtil.ZERO ;
      gxTv_SdtTDevPie2_Albruni_Z = "" ;
      gxTv_SdtTDevPie2_Devgenuni_Z = DecimalUtil.ZERO ;
      gxTv_SdtTDevPie2_Albruniuti_Z = DecimalUtil.ZERO ;
      gxTv_SdtTDevPie2_Albrunient_Z = DecimalUtil.ZERO ;
      gxTv_SdtTDevPie2_Albdevpuni_Z = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTDevPie2_N ;
   }

   public app.SdtTDevPie2 Clone( )
   {
      app.SdtTDevPie2 sdt;
      app.tdevpie2_bc obj;
      sdt = (app.SdtTDevPie2)(clone()) ;
      obj = (app.tdevpie2_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.StructSdtTDevPie2 struct )
   {
      setgxTv_SdtTDevPie2_Emprcod(struct.getEmprcod());
      setgxTv_SdtTDevPie2_Emprnom(struct.getEmprnom());
      setgxTv_SdtTDevPie2_Devgencod(struct.getDevgencod());
      setgxTv_SdtTDevPie2_Devgenfec(struct.getDevgenfec());
      setgxTv_SdtTDevPie2_Albreccod(struct.getAlbreccod());
      setgxTv_SdtTDevPie2_Devgendom(struct.getDevgendom());
      setgxTv_SdtTDevPie2_Clicod(struct.getClicod());
      setgxTv_SdtTDevPie2_Clinom(struct.getClinom());
      setgxTv_SdtTDevPie2_Albref(struct.getAlbref());
      setgxTv_SdtTDevPie2_Devgentrn(struct.getDevgentrn());
      setgxTv_SdtTDevPie2_Devtrnnom(struct.getDevtrnnom());
      setgxTv_SdtTDevPie2_Albrunidis(struct.getAlbrunidis());
      setgxTv_SdtTDevPie2_Albrpiedis(struct.getAlbrpiedis());
      setgxTv_SdtTDevPie2_Albruni(struct.getAlbruni());
      setgxTv_SdtTDevPie2_Devgenuni(struct.getDevgenuni());
      setgxTv_SdtTDevPie2_Devgenpie(struct.getDevgenpie());
      setgxTv_SdtTDevPie2_Albruniuti(struct.getAlbruniuti());
      setgxTv_SdtTDevPie2_Albrpieuti(struct.getAlbrpieuti());
      setgxTv_SdtTDevPie2_Albrpieent(struct.getAlbrpieent());
      setgxTv_SdtTDevPie2_Albrunient(struct.getAlbrunient());
      setgxTv_SdtTDevPie2_Albrest(struct.getAlbrest());
      setgxTv_SdtTDevPie2_Devgenest(struct.getDevgenest());
      setgxTv_SdtTDevPie2_Albdevpuni(struct.getAlbdevpuni());
      setgxTv_SdtTDevPie2_Albdevppie(struct.getAlbdevppie());
      setgxTv_SdtTDevPie2_Devulin(struct.getDevulin());
      GXBCLevelCollection<app.SdtTDevPie2_Level1Item> gxTv_SdtTDevPie2_Level1_aux = new GXBCLevelCollection<app.SdtTDevPie2_Level1Item>(app.SdtTDevPie2_Level1Item.class, "TDevPie2.Level1Item", "TexplusNET", remoteHandle);
      Vector<app.StructSdtTDevPie2_Level1Item> gxTv_SdtTDevPie2_Level1_aux1 = struct.getLevel1();
      if (gxTv_SdtTDevPie2_Level1_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtTDevPie2_Level1_aux1.size(); i++)
         {
            gxTv_SdtTDevPie2_Level1_aux.add(new app.SdtTDevPie2_Level1Item(remoteHandle, gxTv_SdtTDevPie2_Level1_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtTDevPie2_Level1(gxTv_SdtTDevPie2_Level1_aux);
      setgxTv_SdtTDevPie2_Mode(struct.getMode());
      setgxTv_SdtTDevPie2_Initialized(struct.getInitialized());
      setgxTv_SdtTDevPie2_Emprcod_Z(struct.getEmprcod_Z());
      setgxTv_SdtTDevPie2_Emprnom_Z(struct.getEmprnom_Z());
      setgxTv_SdtTDevPie2_Devgencod_Z(struct.getDevgencod_Z());
      setgxTv_SdtTDevPie2_Devgenfec_Z(struct.getDevgenfec_Z());
      setgxTv_SdtTDevPie2_Albreccod_Z(struct.getAlbreccod_Z());
      setgxTv_SdtTDevPie2_Devgendom_Z(struct.getDevgendom_Z());
      setgxTv_SdtTDevPie2_Clicod_Z(struct.getClicod_Z());
      setgxTv_SdtTDevPie2_Clinom_Z(struct.getClinom_Z());
      setgxTv_SdtTDevPie2_Albref_Z(struct.getAlbref_Z());
      setgxTv_SdtTDevPie2_Devgentrn_Z(struct.getDevgentrn_Z());
      setgxTv_SdtTDevPie2_Devtrnnom_Z(struct.getDevtrnnom_Z());
      setgxTv_SdtTDevPie2_Albrunidis_Z(struct.getAlbrunidis_Z());
      setgxTv_SdtTDevPie2_Albrpiedis_Z(struct.getAlbrpiedis_Z());
      setgxTv_SdtTDevPie2_Albruni_Z(struct.getAlbruni_Z());
      setgxTv_SdtTDevPie2_Devgenuni_Z(struct.getDevgenuni_Z());
      setgxTv_SdtTDevPie2_Devgenpie_Z(struct.getDevgenpie_Z());
      setgxTv_SdtTDevPie2_Albruniuti_Z(struct.getAlbruniuti_Z());
      setgxTv_SdtTDevPie2_Albrpieuti_Z(struct.getAlbrpieuti_Z());
      setgxTv_SdtTDevPie2_Albrpieent_Z(struct.getAlbrpieent_Z());
      setgxTv_SdtTDevPie2_Albrunient_Z(struct.getAlbrunient_Z());
      setgxTv_SdtTDevPie2_Albrest_Z(struct.getAlbrest_Z());
      setgxTv_SdtTDevPie2_Devgenest_Z(struct.getDevgenest_Z());
      setgxTv_SdtTDevPie2_Albdevpuni_Z(struct.getAlbdevpuni_Z());
      setgxTv_SdtTDevPie2_Albdevppie_Z(struct.getAlbdevppie_Z());
      setgxTv_SdtTDevPie2_Devulin_Z(struct.getDevulin_Z());
      setgxTv_SdtTDevPie2_Emprnom_N(struct.getEmprnom_N());
      setgxTv_SdtTDevPie2_Devgenfec_N(struct.getDevgenfec_N());
      setgxTv_SdtTDevPie2_Albreccod_N(struct.getAlbreccod_N());
      setgxTv_SdtTDevPie2_Devgendom_N(struct.getDevgendom_N());
      setgxTv_SdtTDevPie2_Clicod_N(struct.getClicod_N());
      setgxTv_SdtTDevPie2_Devgentrn_N(struct.getDevgentrn_N());
      setgxTv_SdtTDevPie2_Devtrnnom_N(struct.getDevtrnnom_N());
      setgxTv_SdtTDevPie2_Devgenuni_N(struct.getDevgenuni_N());
      setgxTv_SdtTDevPie2_Devgenpie_N(struct.getDevgenpie_N());
      setgxTv_SdtTDevPie2_Devgenest_N(struct.getDevgenest_N());
      setgxTv_SdtTDevPie2_Devulin_N(struct.getDevulin_N());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtTDevPie2 getStruct( )
   {
      app.StructSdtTDevPie2 struct = new app.StructSdtTDevPie2 ();
      struct.setEmprcod(getgxTv_SdtTDevPie2_Emprcod());
      struct.setEmprnom(getgxTv_SdtTDevPie2_Emprnom());
      struct.setDevgencod(getgxTv_SdtTDevPie2_Devgencod());
      struct.setDevgenfec(getgxTv_SdtTDevPie2_Devgenfec());
      struct.setAlbreccod(getgxTv_SdtTDevPie2_Albreccod());
      struct.setDevgendom(getgxTv_SdtTDevPie2_Devgendom());
      struct.setClicod(getgxTv_SdtTDevPie2_Clicod());
      struct.setClinom(getgxTv_SdtTDevPie2_Clinom());
      struct.setAlbref(getgxTv_SdtTDevPie2_Albref());
      struct.setDevgentrn(getgxTv_SdtTDevPie2_Devgentrn());
      struct.setDevtrnnom(getgxTv_SdtTDevPie2_Devtrnnom());
      struct.setAlbrunidis(getgxTv_SdtTDevPie2_Albrunidis());
      struct.setAlbrpiedis(getgxTv_SdtTDevPie2_Albrpiedis());
      struct.setAlbruni(getgxTv_SdtTDevPie2_Albruni());
      struct.setDevgenuni(getgxTv_SdtTDevPie2_Devgenuni());
      struct.setDevgenpie(getgxTv_SdtTDevPie2_Devgenpie());
      struct.setAlbruniuti(getgxTv_SdtTDevPie2_Albruniuti());
      struct.setAlbrpieuti(getgxTv_SdtTDevPie2_Albrpieuti());
      struct.setAlbrpieent(getgxTv_SdtTDevPie2_Albrpieent());
      struct.setAlbrunient(getgxTv_SdtTDevPie2_Albrunient());
      struct.setAlbrest(getgxTv_SdtTDevPie2_Albrest());
      struct.setDevgenest(getgxTv_SdtTDevPie2_Devgenest());
      struct.setAlbdevpuni(getgxTv_SdtTDevPie2_Albdevpuni());
      struct.setAlbdevppie(getgxTv_SdtTDevPie2_Albdevppie());
      struct.setDevulin(getgxTv_SdtTDevPie2_Devulin());
      struct.setLevel1(getgxTv_SdtTDevPie2_Level1().getStruct());
      struct.setMode(getgxTv_SdtTDevPie2_Mode());
      struct.setInitialized(getgxTv_SdtTDevPie2_Initialized());
      struct.setEmprcod_Z(getgxTv_SdtTDevPie2_Emprcod_Z());
      struct.setEmprnom_Z(getgxTv_SdtTDevPie2_Emprnom_Z());
      struct.setDevgencod_Z(getgxTv_SdtTDevPie2_Devgencod_Z());
      struct.setDevgenfec_Z(getgxTv_SdtTDevPie2_Devgenfec_Z());
      struct.setAlbreccod_Z(getgxTv_SdtTDevPie2_Albreccod_Z());
      struct.setDevgendom_Z(getgxTv_SdtTDevPie2_Devgendom_Z());
      struct.setClicod_Z(getgxTv_SdtTDevPie2_Clicod_Z());
      struct.setClinom_Z(getgxTv_SdtTDevPie2_Clinom_Z());
      struct.setAlbref_Z(getgxTv_SdtTDevPie2_Albref_Z());
      struct.setDevgentrn_Z(getgxTv_SdtTDevPie2_Devgentrn_Z());
      struct.setDevtrnnom_Z(getgxTv_SdtTDevPie2_Devtrnnom_Z());
      struct.setAlbrunidis_Z(getgxTv_SdtTDevPie2_Albrunidis_Z());
      struct.setAlbrpiedis_Z(getgxTv_SdtTDevPie2_Albrpiedis_Z());
      struct.setAlbruni_Z(getgxTv_SdtTDevPie2_Albruni_Z());
      struct.setDevgenuni_Z(getgxTv_SdtTDevPie2_Devgenuni_Z());
      struct.setDevgenpie_Z(getgxTv_SdtTDevPie2_Devgenpie_Z());
      struct.setAlbruniuti_Z(getgxTv_SdtTDevPie2_Albruniuti_Z());
      struct.setAlbrpieuti_Z(getgxTv_SdtTDevPie2_Albrpieuti_Z());
      struct.setAlbrpieent_Z(getgxTv_SdtTDevPie2_Albrpieent_Z());
      struct.setAlbrunient_Z(getgxTv_SdtTDevPie2_Albrunient_Z());
      struct.setAlbrest_Z(getgxTv_SdtTDevPie2_Albrest_Z());
      struct.setDevgenest_Z(getgxTv_SdtTDevPie2_Devgenest_Z());
      struct.setAlbdevpuni_Z(getgxTv_SdtTDevPie2_Albdevpuni_Z());
      struct.setAlbdevppie_Z(getgxTv_SdtTDevPie2_Albdevppie_Z());
      struct.setDevulin_Z(getgxTv_SdtTDevPie2_Devulin_Z());
      struct.setEmprnom_N(getgxTv_SdtTDevPie2_Emprnom_N());
      struct.setDevgenfec_N(getgxTv_SdtTDevPie2_Devgenfec_N());
      struct.setAlbreccod_N(getgxTv_SdtTDevPie2_Albreccod_N());
      struct.setDevgendom_N(getgxTv_SdtTDevPie2_Devgendom_N());
      struct.setClicod_N(getgxTv_SdtTDevPie2_Clicod_N());
      struct.setDevgentrn_N(getgxTv_SdtTDevPie2_Devgentrn_N());
      struct.setDevtrnnom_N(getgxTv_SdtTDevPie2_Devtrnnom_N());
      struct.setDevgenuni_N(getgxTv_SdtTDevPie2_Devgenuni_N());
      struct.setDevgenpie_N(getgxTv_SdtTDevPie2_Devgenpie_N());
      struct.setDevgenest_N(getgxTv_SdtTDevPie2_Devgenest_N());
      struct.setDevulin_N(getgxTv_SdtTDevPie2_Devulin_N());
      return struct ;
   }

   private byte gxTv_SdtTDevPie2_N ;
   private byte gxTv_SdtTDevPie2_Devgendom ;
   private byte gxTv_SdtTDevPie2_Albrest ;
   private byte gxTv_SdtTDevPie2_Devgenest ;
   private byte gxTv_SdtTDevPie2_Devulin ;
   private byte gxTv_SdtTDevPie2_Devgendom_Z ;
   private byte gxTv_SdtTDevPie2_Albrest_Z ;
   private byte gxTv_SdtTDevPie2_Devgenest_Z ;
   private byte gxTv_SdtTDevPie2_Devulin_Z ;
   private byte gxTv_SdtTDevPie2_Emprnom_N ;
   private byte gxTv_SdtTDevPie2_Devgenfec_N ;
   private byte gxTv_SdtTDevPie2_Albreccod_N ;
   private byte gxTv_SdtTDevPie2_Devgendom_N ;
   private byte gxTv_SdtTDevPie2_Clicod_N ;
   private byte gxTv_SdtTDevPie2_Devgentrn_N ;
   private byte gxTv_SdtTDevPie2_Devtrnnom_N ;
   private byte gxTv_SdtTDevPie2_Devgenuni_N ;
   private byte gxTv_SdtTDevPie2_Devgenpie_N ;
   private byte gxTv_SdtTDevPie2_Devgenest_N ;
   private byte gxTv_SdtTDevPie2_Devulin_N ;
   private short gxTv_SdtTDevPie2_Devgentrn ;
   private short gxTv_SdtTDevPie2_Devgenpie ;
   private short gxTv_SdtTDevPie2_Albdevppie ;
   private short gxTv_SdtTDevPie2_Initialized ;
   private short gxTv_SdtTDevPie2_Devgentrn_Z ;
   private short gxTv_SdtTDevPie2_Devgenpie_Z ;
   private short gxTv_SdtTDevPie2_Albdevppie_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtTDevPie2_Devgencod ;
   private int gxTv_SdtTDevPie2_Albreccod ;
   private int gxTv_SdtTDevPie2_Clicod ;
   private int gxTv_SdtTDevPie2_Albrpiedis ;
   private int gxTv_SdtTDevPie2_Albrpieuti ;
   private int gxTv_SdtTDevPie2_Albrpieent ;
   private int gxTv_SdtTDevPie2_Devgencod_Z ;
   private int gxTv_SdtTDevPie2_Albreccod_Z ;
   private int gxTv_SdtTDevPie2_Clicod_Z ;
   private int gxTv_SdtTDevPie2_Albrpiedis_Z ;
   private int gxTv_SdtTDevPie2_Albrpieuti_Z ;
   private int gxTv_SdtTDevPie2_Albrpieent_Z ;
   private java.math.BigDecimal gxTv_SdtTDevPie2_Albrunidis ;
   private java.math.BigDecimal gxTv_SdtTDevPie2_Devgenuni ;
   private java.math.BigDecimal gxTv_SdtTDevPie2_Albruniuti ;
   private java.math.BigDecimal gxTv_SdtTDevPie2_Albrunient ;
   private java.math.BigDecimal gxTv_SdtTDevPie2_Albdevpuni ;
   private java.math.BigDecimal gxTv_SdtTDevPie2_Albrunidis_Z ;
   private java.math.BigDecimal gxTv_SdtTDevPie2_Devgenuni_Z ;
   private java.math.BigDecimal gxTv_SdtTDevPie2_Albruniuti_Z ;
   private java.math.BigDecimal gxTv_SdtTDevPie2_Albrunient_Z ;
   private java.math.BigDecimal gxTv_SdtTDevPie2_Albdevpuni_Z ;
   private String gxTv_SdtTDevPie2_Emprcod ;
   private String gxTv_SdtTDevPie2_Emprnom ;
   private String gxTv_SdtTDevPie2_Clinom ;
   private String gxTv_SdtTDevPie2_Albref ;
   private String gxTv_SdtTDevPie2_Devtrnnom ;
   private String gxTv_SdtTDevPie2_Albruni ;
   private String gxTv_SdtTDevPie2_Mode ;
   private String gxTv_SdtTDevPie2_Emprcod_Z ;
   private String gxTv_SdtTDevPie2_Emprnom_Z ;
   private String gxTv_SdtTDevPie2_Clinom_Z ;
   private String gxTv_SdtTDevPie2_Albref_Z ;
   private String gxTv_SdtTDevPie2_Devtrnnom_Z ;
   private String gxTv_SdtTDevPie2_Albruni_Z ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTDevPie2_Devgenfec ;
   private java.util.Date gxTv_SdtTDevPie2_Devgenfec_Z ;
   private boolean readElement ;
   private boolean formatError ;
   private GXBCLevelCollection<app.SdtTDevPie2_Level1Item> gxTv_SdtTDevPie2_Level1_aux ;
   private GXBCLevelCollection<app.SdtTDevPie2_Level1Item> gxTv_SdtTDevPie2_Level1=null ;
}

