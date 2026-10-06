package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTTERMIN extends GxSilentTrnSdt
{
   public SdtTTERMIN( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTTERMIN.class));
   }

   public SdtTTERMIN( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtTTERMIN");
      initialize( remoteHandle) ;
   }

   public SdtTTERMIN( int remoteHandle ,
                      StructSdtTTERMIN struct )
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

   public void Load( String AV942TermCod )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV942TermCod});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TermCod", String.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "TTERMIN");
      metadata.set("BT", "TXPTERMIN");
      metadata.set("PK", "[ \"TermCod\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"ImpCod\" ],\"FKMap\":[  ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermCod") )
            {
               gxTv_SdtTTERMIN_Termcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtTTERMIN_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtTTERMIN_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermDsc") )
            {
               gxTv_SdtTTERMIN_Termdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpCod") )
            {
               gxTv_SdtTTERMIN_Impcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpDsc") )
            {
               gxTv_SdtTTERMIN_Impdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermUsu") )
            {
               gxTv_SdtTTERMIN_Termusu = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpCod1") )
            {
               gxTv_SdtTTERMIN_Impcod1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpCod2") )
            {
               gxTv_SdtTTERMIN_Impcod2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpCod3") )
            {
               gxTv_SdtTTERMIN_Impcod3 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpCod4") )
            {
               gxTv_SdtTTERMIN_Impcod4 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpCod5") )
            {
               gxTv_SdtTTERMIN_Impcod5 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpLpt1") )
            {
               gxTv_SdtTTERMIN_Implpt1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpLpt2") )
            {
               gxTv_SdtTTERMIN_Implpt2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpLpt3") )
            {
               gxTv_SdtTTERMIN_Implpt3 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpLpt4") )
            {
               gxTv_SdtTTERMIN_Implpt4 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpLpt5") )
            {
               gxTv_SdtTTERMIN_Implpt5 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermBol") )
            {
               gxTv_SdtTTERMIN_Termbol = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermBal") )
            {
               gxTv_SdtTTERMIN_Termbal = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermNoTr") )
            {
               gxTv_SdtTTERMIN_Termnotr = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermLog1") )
            {
               gxTv_SdtTTERMIN_Termlog1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermLog2") )
            {
               gxTv_SdtTTERMIN_Termlog2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPes") )
            {
               gxTv_SdtTTERMIN_Termpes = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermEst") )
            {
               gxTv_SdtTTERMIN_Termest = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTTERMIN_Termfec = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTTERMIN_Termfec = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTTERMIN_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTTERMIN_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermCod_Z") )
            {
               gxTv_SdtTTERMIN_Termcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod_Z") )
            {
               gxTv_SdtTTERMIN_Emprcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_Z") )
            {
               gxTv_SdtTTERMIN_Emprnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermDsc_Z") )
            {
               gxTv_SdtTTERMIN_Termdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpCod_Z") )
            {
               gxTv_SdtTTERMIN_Impcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpDsc_Z") )
            {
               gxTv_SdtTTERMIN_Impdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermUsu_Z") )
            {
               gxTv_SdtTTERMIN_Termusu_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpCod1_Z") )
            {
               gxTv_SdtTTERMIN_Impcod1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpCod2_Z") )
            {
               gxTv_SdtTTERMIN_Impcod2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpCod3_Z") )
            {
               gxTv_SdtTTERMIN_Impcod3_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpCod4_Z") )
            {
               gxTv_SdtTTERMIN_Impcod4_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpCod5_Z") )
            {
               gxTv_SdtTTERMIN_Impcod5_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpLpt1_Z") )
            {
               gxTv_SdtTTERMIN_Implpt1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpLpt2_Z") )
            {
               gxTv_SdtTTERMIN_Implpt2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpLpt3_Z") )
            {
               gxTv_SdtTTERMIN_Implpt3_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpLpt4_Z") )
            {
               gxTv_SdtTTERMIN_Implpt4_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpLpt5_Z") )
            {
               gxTv_SdtTTERMIN_Implpt5_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermBol_Z") )
            {
               gxTv_SdtTTERMIN_Termbol_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermBal_Z") )
            {
               gxTv_SdtTTERMIN_Termbal_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermNoTr_Z") )
            {
               gxTv_SdtTTERMIN_Termnotr_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermLog1_Z") )
            {
               gxTv_SdtTTERMIN_Termlog1_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermLog2_Z") )
            {
               gxTv_SdtTTERMIN_Termlog2_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPes_Z") )
            {
               gxTv_SdtTTERMIN_Termpes_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermEst_Z") )
            {
               gxTv_SdtTTERMIN_Termest_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermFec_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTTERMIN_Termfec_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTTERMIN_Termfec_Z = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod_N") )
            {
               gxTv_SdtTTERMIN_Emprcod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_N") )
            {
               gxTv_SdtTTERMIN_Emprnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermDsc_N") )
            {
               gxTv_SdtTTERMIN_Termdsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpCod_N") )
            {
               gxTv_SdtTTERMIN_Impcod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpDsc_N") )
            {
               gxTv_SdtTTERMIN_Impdsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermUsu_N") )
            {
               gxTv_SdtTTERMIN_Termusu_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpCod1_N") )
            {
               gxTv_SdtTTERMIN_Impcod1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpCod2_N") )
            {
               gxTv_SdtTTERMIN_Impcod2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpCod3_N") )
            {
               gxTv_SdtTTERMIN_Impcod3_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpCod4_N") )
            {
               gxTv_SdtTTERMIN_Impcod4_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpCod5_N") )
            {
               gxTv_SdtTTERMIN_Impcod5_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpLpt1_N") )
            {
               gxTv_SdtTTERMIN_Implpt1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpLpt2_N") )
            {
               gxTv_SdtTTERMIN_Implpt2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpLpt3_N") )
            {
               gxTv_SdtTTERMIN_Implpt3_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpLpt4_N") )
            {
               gxTv_SdtTTERMIN_Implpt4_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImpLpt5_N") )
            {
               gxTv_SdtTTERMIN_Implpt5_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermBol_N") )
            {
               gxTv_SdtTTERMIN_Termbol_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermBal_N") )
            {
               gxTv_SdtTTERMIN_Termbal_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermNoTr_N") )
            {
               gxTv_SdtTTERMIN_Termnotr_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermLog1_N") )
            {
               gxTv_SdtTTERMIN_Termlog1_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermLog2_N") )
            {
               gxTv_SdtTTERMIN_Termlog2_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermPes_N") )
            {
               gxTv_SdtTTERMIN_Termpes_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermEst_N") )
            {
               gxTv_SdtTTERMIN_Termest_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TermFec_N") )
            {
               gxTv_SdtTTERMIN_Termfec_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "TTERMIN" ;
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
      oWriter.writeElement("TermCod", gxTv_SdtTTERMIN_Termcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprCod", gxTv_SdtTTERMIN_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtTTERMIN_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TermDsc", gxTv_SdtTTERMIN_Termdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ImpCod", gxTv_SdtTTERMIN_Impcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ImpDsc", gxTv_SdtTTERMIN_Impdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TermUsu", gxTv_SdtTTERMIN_Termusu);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ImpCod1", gxTv_SdtTTERMIN_Impcod1);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ImpCod2", gxTv_SdtTTERMIN_Impcod2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ImpCod3", gxTv_SdtTTERMIN_Impcod3);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ImpCod4", gxTv_SdtTTERMIN_Impcod4);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ImpCod5", gxTv_SdtTTERMIN_Impcod5);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ImpLpt1", gxTv_SdtTTERMIN_Implpt1);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ImpLpt2", gxTv_SdtTTERMIN_Implpt2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ImpLpt3", gxTv_SdtTTERMIN_Implpt3);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ImpLpt4", gxTv_SdtTTERMIN_Implpt4);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ImpLpt5", gxTv_SdtTTERMIN_Implpt5);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TermBol", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Termbol, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TermBal", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Termbal, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TermNoTr", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Termnotr, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TermLog1", gxTv_SdtTTERMIN_Termlog1);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TermLog2", gxTv_SdtTTERMIN_Termlog2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TermPes", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Termpes, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TermEst", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Termest, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTTERMIN_Termfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTTERMIN_Termfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTTERMIN_Termfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTTERMIN_Termfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTTERMIN_Termfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTTERMIN_Termfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("TermFec", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtTTERMIN_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermCod_Z", gxTv_SdtTTERMIN_Termcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprCod_Z", gxTv_SdtTTERMIN_Emprcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_Z", gxTv_SdtTTERMIN_Emprnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermDsc_Z", gxTv_SdtTTERMIN_Termdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpCod_Z", gxTv_SdtTTERMIN_Impcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpDsc_Z", gxTv_SdtTTERMIN_Impdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermUsu_Z", gxTv_SdtTTERMIN_Termusu_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpCod1_Z", gxTv_SdtTTERMIN_Impcod1_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpCod2_Z", gxTv_SdtTTERMIN_Impcod2_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpCod3_Z", gxTv_SdtTTERMIN_Impcod3_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpCod4_Z", gxTv_SdtTTERMIN_Impcod4_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpCod5_Z", gxTv_SdtTTERMIN_Impcod5_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpLpt1_Z", gxTv_SdtTTERMIN_Implpt1_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpLpt2_Z", gxTv_SdtTTERMIN_Implpt2_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpLpt3_Z", gxTv_SdtTTERMIN_Implpt3_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpLpt4_Z", gxTv_SdtTTERMIN_Implpt4_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpLpt5_Z", gxTv_SdtTTERMIN_Implpt5_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermBol_Z", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Termbol_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermBal_Z", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Termbal_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermNoTr_Z", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Termnotr_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermLog1_Z", gxTv_SdtTTERMIN_Termlog1_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermLog2_Z", gxTv_SdtTTERMIN_Termlog2_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermPes_Z", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Termpes_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermEst_Z", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Termest_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTTERMIN_Termfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTTERMIN_Termfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTTERMIN_Termfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTTERMIN_Termfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTTERMIN_Termfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTTERMIN_Termfec_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TermFec_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprCod_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Emprcod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Emprnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermDsc_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Termdsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpCod_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Impcod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpDsc_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Impdsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermUsu_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Termusu_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpCod1_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Impcod1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpCod2_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Impcod2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpCod3_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Impcod3_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpCod4_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Impcod4_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpCod5_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Impcod5_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpLpt1_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Implpt1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpLpt2_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Implpt2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpLpt3_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Implpt3_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpLpt4_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Implpt4_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ImpLpt5_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Implpt5_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermBol_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Termbol_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermBal_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Termbal_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermNoTr_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Termnotr_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermLog1_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Termlog1_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermLog2_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Termlog2_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermPes_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Termpes_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermEst_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Termest_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TermFec_N", GXutil.trim( GXutil.str( gxTv_SdtTTERMIN_Termfec_N, 1, 0)));
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
      AddObjectProperty("TermCod", gxTv_SdtTTERMIN_Termcod, false, includeNonInitialized);
      AddObjectProperty("EmprCod", gxTv_SdtTTERMIN_Emprcod, false, includeNonInitialized);
      AddObjectProperty("EmprCod_N", gxTv_SdtTTERMIN_Emprcod_N, false, includeNonInitialized);
      AddObjectProperty("EmprNom", gxTv_SdtTTERMIN_Emprnom, false, includeNonInitialized);
      AddObjectProperty("EmprNom_N", gxTv_SdtTTERMIN_Emprnom_N, false, includeNonInitialized);
      AddObjectProperty("TermDsc", gxTv_SdtTTERMIN_Termdsc, false, includeNonInitialized);
      AddObjectProperty("TermDsc_N", gxTv_SdtTTERMIN_Termdsc_N, false, includeNonInitialized);
      AddObjectProperty("ImpCod", gxTv_SdtTTERMIN_Impcod, false, includeNonInitialized);
      AddObjectProperty("ImpCod_N", gxTv_SdtTTERMIN_Impcod_N, false, includeNonInitialized);
      AddObjectProperty("ImpDsc", gxTv_SdtTTERMIN_Impdsc, false, includeNonInitialized);
      AddObjectProperty("ImpDsc_N", gxTv_SdtTTERMIN_Impdsc_N, false, includeNonInitialized);
      AddObjectProperty("TermUsu", gxTv_SdtTTERMIN_Termusu, false, includeNonInitialized);
      AddObjectProperty("TermUsu_N", gxTv_SdtTTERMIN_Termusu_N, false, includeNonInitialized);
      AddObjectProperty("ImpCod1", gxTv_SdtTTERMIN_Impcod1, false, includeNonInitialized);
      AddObjectProperty("ImpCod1_N", gxTv_SdtTTERMIN_Impcod1_N, false, includeNonInitialized);
      AddObjectProperty("ImpCod2", gxTv_SdtTTERMIN_Impcod2, false, includeNonInitialized);
      AddObjectProperty("ImpCod2_N", gxTv_SdtTTERMIN_Impcod2_N, false, includeNonInitialized);
      AddObjectProperty("ImpCod3", gxTv_SdtTTERMIN_Impcod3, false, includeNonInitialized);
      AddObjectProperty("ImpCod3_N", gxTv_SdtTTERMIN_Impcod3_N, false, includeNonInitialized);
      AddObjectProperty("ImpCod4", gxTv_SdtTTERMIN_Impcod4, false, includeNonInitialized);
      AddObjectProperty("ImpCod4_N", gxTv_SdtTTERMIN_Impcod4_N, false, includeNonInitialized);
      AddObjectProperty("ImpCod5", gxTv_SdtTTERMIN_Impcod5, false, includeNonInitialized);
      AddObjectProperty("ImpCod5_N", gxTv_SdtTTERMIN_Impcod5_N, false, includeNonInitialized);
      AddObjectProperty("ImpLpt1", gxTv_SdtTTERMIN_Implpt1, false, includeNonInitialized);
      AddObjectProperty("ImpLpt1_N", gxTv_SdtTTERMIN_Implpt1_N, false, includeNonInitialized);
      AddObjectProperty("ImpLpt2", gxTv_SdtTTERMIN_Implpt2, false, includeNonInitialized);
      AddObjectProperty("ImpLpt2_N", gxTv_SdtTTERMIN_Implpt2_N, false, includeNonInitialized);
      AddObjectProperty("ImpLpt3", gxTv_SdtTTERMIN_Implpt3, false, includeNonInitialized);
      AddObjectProperty("ImpLpt3_N", gxTv_SdtTTERMIN_Implpt3_N, false, includeNonInitialized);
      AddObjectProperty("ImpLpt4", gxTv_SdtTTERMIN_Implpt4, false, includeNonInitialized);
      AddObjectProperty("ImpLpt4_N", gxTv_SdtTTERMIN_Implpt4_N, false, includeNonInitialized);
      AddObjectProperty("ImpLpt5", gxTv_SdtTTERMIN_Implpt5, false, includeNonInitialized);
      AddObjectProperty("ImpLpt5_N", gxTv_SdtTTERMIN_Implpt5_N, false, includeNonInitialized);
      AddObjectProperty("TermBol", gxTv_SdtTTERMIN_Termbol, false, includeNonInitialized);
      AddObjectProperty("TermBol_N", gxTv_SdtTTERMIN_Termbol_N, false, includeNonInitialized);
      AddObjectProperty("TermBal", gxTv_SdtTTERMIN_Termbal, false, includeNonInitialized);
      AddObjectProperty("TermBal_N", gxTv_SdtTTERMIN_Termbal_N, false, includeNonInitialized);
      AddObjectProperty("TermNoTr", gxTv_SdtTTERMIN_Termnotr, false, includeNonInitialized);
      AddObjectProperty("TermNoTr_N", gxTv_SdtTTERMIN_Termnotr_N, false, includeNonInitialized);
      AddObjectProperty("TermLog1", gxTv_SdtTTERMIN_Termlog1, false, includeNonInitialized);
      AddObjectProperty("TermLog1_N", gxTv_SdtTTERMIN_Termlog1_N, false, includeNonInitialized);
      AddObjectProperty("TermLog2", gxTv_SdtTTERMIN_Termlog2, false, includeNonInitialized);
      AddObjectProperty("TermLog2_N", gxTv_SdtTTERMIN_Termlog2_N, false, includeNonInitialized);
      AddObjectProperty("TermPes", gxTv_SdtTTERMIN_Termpes, false, includeNonInitialized);
      AddObjectProperty("TermPes_N", gxTv_SdtTTERMIN_Termpes_N, false, includeNonInitialized);
      AddObjectProperty("TermEst", gxTv_SdtTTERMIN_Termest, false, includeNonInitialized);
      AddObjectProperty("TermEst_N", gxTv_SdtTTERMIN_Termest_N, false, includeNonInitialized);
      datetime_STZ = gxTv_SdtTTERMIN_Termfec ;
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
      AddObjectProperty("TermFec", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("TermFec_N", gxTv_SdtTTERMIN_Termfec_N, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTTERMIN_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtTTERMIN_Initialized, false, includeNonInitialized);
         AddObjectProperty("TermCod_Z", gxTv_SdtTTERMIN_Termcod_Z, false, includeNonInitialized);
         AddObjectProperty("EmprCod_Z", gxTv_SdtTTERMIN_Emprcod_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_Z", gxTv_SdtTTERMIN_Emprnom_Z, false, includeNonInitialized);
         AddObjectProperty("TermDsc_Z", gxTv_SdtTTERMIN_Termdsc_Z, false, includeNonInitialized);
         AddObjectProperty("ImpCod_Z", gxTv_SdtTTERMIN_Impcod_Z, false, includeNonInitialized);
         AddObjectProperty("ImpDsc_Z", gxTv_SdtTTERMIN_Impdsc_Z, false, includeNonInitialized);
         AddObjectProperty("TermUsu_Z", gxTv_SdtTTERMIN_Termusu_Z, false, includeNonInitialized);
         AddObjectProperty("ImpCod1_Z", gxTv_SdtTTERMIN_Impcod1_Z, false, includeNonInitialized);
         AddObjectProperty("ImpCod2_Z", gxTv_SdtTTERMIN_Impcod2_Z, false, includeNonInitialized);
         AddObjectProperty("ImpCod3_Z", gxTv_SdtTTERMIN_Impcod3_Z, false, includeNonInitialized);
         AddObjectProperty("ImpCod4_Z", gxTv_SdtTTERMIN_Impcod4_Z, false, includeNonInitialized);
         AddObjectProperty("ImpCod5_Z", gxTv_SdtTTERMIN_Impcod5_Z, false, includeNonInitialized);
         AddObjectProperty("ImpLpt1_Z", gxTv_SdtTTERMIN_Implpt1_Z, false, includeNonInitialized);
         AddObjectProperty("ImpLpt2_Z", gxTv_SdtTTERMIN_Implpt2_Z, false, includeNonInitialized);
         AddObjectProperty("ImpLpt3_Z", gxTv_SdtTTERMIN_Implpt3_Z, false, includeNonInitialized);
         AddObjectProperty("ImpLpt4_Z", gxTv_SdtTTERMIN_Implpt4_Z, false, includeNonInitialized);
         AddObjectProperty("ImpLpt5_Z", gxTv_SdtTTERMIN_Implpt5_Z, false, includeNonInitialized);
         AddObjectProperty("TermBol_Z", gxTv_SdtTTERMIN_Termbol_Z, false, includeNonInitialized);
         AddObjectProperty("TermBal_Z", gxTv_SdtTTERMIN_Termbal_Z, false, includeNonInitialized);
         AddObjectProperty("TermNoTr_Z", gxTv_SdtTTERMIN_Termnotr_Z, false, includeNonInitialized);
         AddObjectProperty("TermLog1_Z", gxTv_SdtTTERMIN_Termlog1_Z, false, includeNonInitialized);
         AddObjectProperty("TermLog2_Z", gxTv_SdtTTERMIN_Termlog2_Z, false, includeNonInitialized);
         AddObjectProperty("TermPes_Z", gxTv_SdtTTERMIN_Termpes_Z, false, includeNonInitialized);
         AddObjectProperty("TermEst_Z", gxTv_SdtTTERMIN_Termest_Z, false, includeNonInitialized);
         datetime_STZ = gxTv_SdtTTERMIN_Termfec_Z ;
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
         AddObjectProperty("TermFec_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("EmprCod_N", gxTv_SdtTTERMIN_Emprcod_N, false, includeNonInitialized);
         AddObjectProperty("EmprNom_N", gxTv_SdtTTERMIN_Emprnom_N, false, includeNonInitialized);
         AddObjectProperty("TermDsc_N", gxTv_SdtTTERMIN_Termdsc_N, false, includeNonInitialized);
         AddObjectProperty("ImpCod_N", gxTv_SdtTTERMIN_Impcod_N, false, includeNonInitialized);
         AddObjectProperty("ImpDsc_N", gxTv_SdtTTERMIN_Impdsc_N, false, includeNonInitialized);
         AddObjectProperty("TermUsu_N", gxTv_SdtTTERMIN_Termusu_N, false, includeNonInitialized);
         AddObjectProperty("ImpCod1_N", gxTv_SdtTTERMIN_Impcod1_N, false, includeNonInitialized);
         AddObjectProperty("ImpCod2_N", gxTv_SdtTTERMIN_Impcod2_N, false, includeNonInitialized);
         AddObjectProperty("ImpCod3_N", gxTv_SdtTTERMIN_Impcod3_N, false, includeNonInitialized);
         AddObjectProperty("ImpCod4_N", gxTv_SdtTTERMIN_Impcod4_N, false, includeNonInitialized);
         AddObjectProperty("ImpCod5_N", gxTv_SdtTTERMIN_Impcod5_N, false, includeNonInitialized);
         AddObjectProperty("ImpLpt1_N", gxTv_SdtTTERMIN_Implpt1_N, false, includeNonInitialized);
         AddObjectProperty("ImpLpt2_N", gxTv_SdtTTERMIN_Implpt2_N, false, includeNonInitialized);
         AddObjectProperty("ImpLpt3_N", gxTv_SdtTTERMIN_Implpt3_N, false, includeNonInitialized);
         AddObjectProperty("ImpLpt4_N", gxTv_SdtTTERMIN_Implpt4_N, false, includeNonInitialized);
         AddObjectProperty("ImpLpt5_N", gxTv_SdtTTERMIN_Implpt5_N, false, includeNonInitialized);
         AddObjectProperty("TermBol_N", gxTv_SdtTTERMIN_Termbol_N, false, includeNonInitialized);
         AddObjectProperty("TermBal_N", gxTv_SdtTTERMIN_Termbal_N, false, includeNonInitialized);
         AddObjectProperty("TermNoTr_N", gxTv_SdtTTERMIN_Termnotr_N, false, includeNonInitialized);
         AddObjectProperty("TermLog1_N", gxTv_SdtTTERMIN_Termlog1_N, false, includeNonInitialized);
         AddObjectProperty("TermLog2_N", gxTv_SdtTTERMIN_Termlog2_N, false, includeNonInitialized);
         AddObjectProperty("TermPes_N", gxTv_SdtTTERMIN_Termpes_N, false, includeNonInitialized);
         AddObjectProperty("TermEst_N", gxTv_SdtTTERMIN_Termest_N, false, includeNonInitialized);
         AddObjectProperty("TermFec_N", gxTv_SdtTTERMIN_Termfec_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.SdtTTERMIN sdt )
   {
      if ( sdt.IsDirty("TermCod") )
      {
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Termcod = sdt.getgxTv_SdtTTERMIN_Termcod() ;
      }
      if ( sdt.IsDirty("EmprCod") )
      {
         gxTv_SdtTTERMIN_Emprcod_N = sdt.getgxTv_SdtTTERMIN_Emprcod_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Emprcod = sdt.getgxTv_SdtTTERMIN_Emprcod() ;
      }
      if ( sdt.IsDirty("EmprNom") )
      {
         gxTv_SdtTTERMIN_Emprnom_N = sdt.getgxTv_SdtTTERMIN_Emprnom_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Emprnom = sdt.getgxTv_SdtTTERMIN_Emprnom() ;
      }
      if ( sdt.IsDirty("TermDsc") )
      {
         gxTv_SdtTTERMIN_Termdsc_N = sdt.getgxTv_SdtTTERMIN_Termdsc_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Termdsc = sdt.getgxTv_SdtTTERMIN_Termdsc() ;
      }
      if ( sdt.IsDirty("ImpCod") )
      {
         gxTv_SdtTTERMIN_Impcod_N = sdt.getgxTv_SdtTTERMIN_Impcod_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Impcod = sdt.getgxTv_SdtTTERMIN_Impcod() ;
      }
      if ( sdt.IsDirty("ImpDsc") )
      {
         gxTv_SdtTTERMIN_Impdsc_N = sdt.getgxTv_SdtTTERMIN_Impdsc_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Impdsc = sdt.getgxTv_SdtTTERMIN_Impdsc() ;
      }
      if ( sdt.IsDirty("TermUsu") )
      {
         gxTv_SdtTTERMIN_Termusu_N = sdt.getgxTv_SdtTTERMIN_Termusu_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Termusu = sdt.getgxTv_SdtTTERMIN_Termusu() ;
      }
      if ( sdt.IsDirty("ImpCod1") )
      {
         gxTv_SdtTTERMIN_Impcod1_N = sdt.getgxTv_SdtTTERMIN_Impcod1_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Impcod1 = sdt.getgxTv_SdtTTERMIN_Impcod1() ;
      }
      if ( sdt.IsDirty("ImpCod2") )
      {
         gxTv_SdtTTERMIN_Impcod2_N = sdt.getgxTv_SdtTTERMIN_Impcod2_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Impcod2 = sdt.getgxTv_SdtTTERMIN_Impcod2() ;
      }
      if ( sdt.IsDirty("ImpCod3") )
      {
         gxTv_SdtTTERMIN_Impcod3_N = sdt.getgxTv_SdtTTERMIN_Impcod3_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Impcod3 = sdt.getgxTv_SdtTTERMIN_Impcod3() ;
      }
      if ( sdt.IsDirty("ImpCod4") )
      {
         gxTv_SdtTTERMIN_Impcod4_N = sdt.getgxTv_SdtTTERMIN_Impcod4_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Impcod4 = sdt.getgxTv_SdtTTERMIN_Impcod4() ;
      }
      if ( sdt.IsDirty("ImpCod5") )
      {
         gxTv_SdtTTERMIN_Impcod5_N = sdt.getgxTv_SdtTTERMIN_Impcod5_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Impcod5 = sdt.getgxTv_SdtTTERMIN_Impcod5() ;
      }
      if ( sdt.IsDirty("ImpLpt1") )
      {
         gxTv_SdtTTERMIN_Implpt1_N = sdt.getgxTv_SdtTTERMIN_Implpt1_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Implpt1 = sdt.getgxTv_SdtTTERMIN_Implpt1() ;
      }
      if ( sdt.IsDirty("ImpLpt2") )
      {
         gxTv_SdtTTERMIN_Implpt2_N = sdt.getgxTv_SdtTTERMIN_Implpt2_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Implpt2 = sdt.getgxTv_SdtTTERMIN_Implpt2() ;
      }
      if ( sdt.IsDirty("ImpLpt3") )
      {
         gxTv_SdtTTERMIN_Implpt3_N = sdt.getgxTv_SdtTTERMIN_Implpt3_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Implpt3 = sdt.getgxTv_SdtTTERMIN_Implpt3() ;
      }
      if ( sdt.IsDirty("ImpLpt4") )
      {
         gxTv_SdtTTERMIN_Implpt4_N = sdt.getgxTv_SdtTTERMIN_Implpt4_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Implpt4 = sdt.getgxTv_SdtTTERMIN_Implpt4() ;
      }
      if ( sdt.IsDirty("ImpLpt5") )
      {
         gxTv_SdtTTERMIN_Implpt5_N = sdt.getgxTv_SdtTTERMIN_Implpt5_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Implpt5 = sdt.getgxTv_SdtTTERMIN_Implpt5() ;
      }
      if ( sdt.IsDirty("TermBol") )
      {
         gxTv_SdtTTERMIN_Termbol_N = sdt.getgxTv_SdtTTERMIN_Termbol_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Termbol = sdt.getgxTv_SdtTTERMIN_Termbol() ;
      }
      if ( sdt.IsDirty("TermBal") )
      {
         gxTv_SdtTTERMIN_Termbal_N = sdt.getgxTv_SdtTTERMIN_Termbal_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Termbal = sdt.getgxTv_SdtTTERMIN_Termbal() ;
      }
      if ( sdt.IsDirty("TermNoTr") )
      {
         gxTv_SdtTTERMIN_Termnotr_N = sdt.getgxTv_SdtTTERMIN_Termnotr_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Termnotr = sdt.getgxTv_SdtTTERMIN_Termnotr() ;
      }
      if ( sdt.IsDirty("TermLog1") )
      {
         gxTv_SdtTTERMIN_Termlog1_N = sdt.getgxTv_SdtTTERMIN_Termlog1_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Termlog1 = sdt.getgxTv_SdtTTERMIN_Termlog1() ;
      }
      if ( sdt.IsDirty("TermLog2") )
      {
         gxTv_SdtTTERMIN_Termlog2_N = sdt.getgxTv_SdtTTERMIN_Termlog2_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Termlog2 = sdt.getgxTv_SdtTTERMIN_Termlog2() ;
      }
      if ( sdt.IsDirty("TermPes") )
      {
         gxTv_SdtTTERMIN_Termpes_N = sdt.getgxTv_SdtTTERMIN_Termpes_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Termpes = sdt.getgxTv_SdtTTERMIN_Termpes() ;
      }
      if ( sdt.IsDirty("TermEst") )
      {
         gxTv_SdtTTERMIN_Termest_N = sdt.getgxTv_SdtTTERMIN_Termest_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Termest = sdt.getgxTv_SdtTTERMIN_Termest() ;
      }
      if ( sdt.IsDirty("TermFec") )
      {
         gxTv_SdtTTERMIN_Termfec_N = sdt.getgxTv_SdtTTERMIN_Termfec_N() ;
         gxTv_SdtTTERMIN_N = (byte)(0) ;
         gxTv_SdtTTERMIN_Termfec = sdt.getgxTv_SdtTTERMIN_Termfec() ;
      }
   }

   public String getgxTv_SdtTTERMIN_Termcod( )
   {
      return gxTv_SdtTTERMIN_Termcod ;
   }

   public void setgxTv_SdtTTERMIN_Termcod( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtTTERMIN_Termcod, value) != 0 )
      {
         gxTv_SdtTTERMIN_Mode = "INS" ;
         this.setgxTv_SdtTTERMIN_Termcod_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Emprnom_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Termdsc_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Impcod_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Impdsc_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Termusu_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Impcod1_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Impcod2_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Impcod3_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Impcod4_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Impcod5_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Implpt1_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Implpt2_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Implpt3_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Implpt4_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Implpt5_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Termbol_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Termbal_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Termnotr_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Termlog1_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Termlog2_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Termpes_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Termest_Z_SetNull( );
         this.setgxTv_SdtTTERMIN_Termfec_Z_SetNull( );
      }
      SetDirty("Termcod");
      gxTv_SdtTTERMIN_Termcod = value ;
   }

   public String getgxTv_SdtTTERMIN_Emprcod( )
   {
      return gxTv_SdtTTERMIN_Emprcod ;
   }

   public void setgxTv_SdtTTERMIN_Emprcod( String value )
   {
      gxTv_SdtTTERMIN_Emprcod_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Emprcod");
      gxTv_SdtTTERMIN_Emprcod = value ;
   }

   public void setgxTv_SdtTTERMIN_Emprcod_SetNull( )
   {
      gxTv_SdtTTERMIN_Emprcod_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Emprcod = "" ;
      SetDirty("Emprcod");
   }

   public boolean getgxTv_SdtTTERMIN_Emprcod_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Emprcod_N==1) ;
   }

   public String getgxTv_SdtTTERMIN_Emprnom( )
   {
      return gxTv_SdtTTERMIN_Emprnom ;
   }

   public void setgxTv_SdtTTERMIN_Emprnom( String value )
   {
      gxTv_SdtTTERMIN_Emprnom_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Emprnom");
      gxTv_SdtTTERMIN_Emprnom = value ;
   }

   public void setgxTv_SdtTTERMIN_Emprnom_SetNull( )
   {
      gxTv_SdtTTERMIN_Emprnom_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Emprnom = "" ;
      SetDirty("Emprnom");
   }

   public boolean getgxTv_SdtTTERMIN_Emprnom_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Emprnom_N==1) ;
   }

   public String getgxTv_SdtTTERMIN_Termdsc( )
   {
      return gxTv_SdtTTERMIN_Termdsc ;
   }

   public void setgxTv_SdtTTERMIN_Termdsc( String value )
   {
      gxTv_SdtTTERMIN_Termdsc_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termdsc");
      gxTv_SdtTTERMIN_Termdsc = value ;
   }

   public void setgxTv_SdtTTERMIN_Termdsc_SetNull( )
   {
      gxTv_SdtTTERMIN_Termdsc_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Termdsc = "" ;
      SetDirty("Termdsc");
   }

   public boolean getgxTv_SdtTTERMIN_Termdsc_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Termdsc_N==1) ;
   }

   public String getgxTv_SdtTTERMIN_Impcod( )
   {
      return gxTv_SdtTTERMIN_Impcod ;
   }

   public void setgxTv_SdtTTERMIN_Impcod( String value )
   {
      gxTv_SdtTTERMIN_Impcod_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impcod");
      gxTv_SdtTTERMIN_Impcod = value ;
   }

   public void setgxTv_SdtTTERMIN_Impcod_SetNull( )
   {
      gxTv_SdtTTERMIN_Impcod_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Impcod = "" ;
      SetDirty("Impcod");
   }

   public boolean getgxTv_SdtTTERMIN_Impcod_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Impcod_N==1) ;
   }

   public String getgxTv_SdtTTERMIN_Impdsc( )
   {
      return gxTv_SdtTTERMIN_Impdsc ;
   }

   public void setgxTv_SdtTTERMIN_Impdsc( String value )
   {
      gxTv_SdtTTERMIN_Impdsc_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impdsc");
      gxTv_SdtTTERMIN_Impdsc = value ;
   }

   public void setgxTv_SdtTTERMIN_Impdsc_SetNull( )
   {
      gxTv_SdtTTERMIN_Impdsc_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Impdsc = "" ;
      SetDirty("Impdsc");
   }

   public boolean getgxTv_SdtTTERMIN_Impdsc_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Impdsc_N==1) ;
   }

   public String getgxTv_SdtTTERMIN_Termusu( )
   {
      return gxTv_SdtTTERMIN_Termusu ;
   }

   public void setgxTv_SdtTTERMIN_Termusu( String value )
   {
      gxTv_SdtTTERMIN_Termusu_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termusu");
      gxTv_SdtTTERMIN_Termusu = value ;
   }

   public void setgxTv_SdtTTERMIN_Termusu_SetNull( )
   {
      gxTv_SdtTTERMIN_Termusu_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Termusu = "" ;
      SetDirty("Termusu");
   }

   public boolean getgxTv_SdtTTERMIN_Termusu_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Termusu_N==1) ;
   }

   public String getgxTv_SdtTTERMIN_Impcod1( )
   {
      return gxTv_SdtTTERMIN_Impcod1 ;
   }

   public void setgxTv_SdtTTERMIN_Impcod1( String value )
   {
      gxTv_SdtTTERMIN_Impcod1_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impcod1");
      gxTv_SdtTTERMIN_Impcod1 = value ;
   }

   public void setgxTv_SdtTTERMIN_Impcod1_SetNull( )
   {
      gxTv_SdtTTERMIN_Impcod1_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Impcod1 = "" ;
      SetDirty("Impcod1");
   }

   public boolean getgxTv_SdtTTERMIN_Impcod1_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Impcod1_N==1) ;
   }

   public String getgxTv_SdtTTERMIN_Impcod2( )
   {
      return gxTv_SdtTTERMIN_Impcod2 ;
   }

   public void setgxTv_SdtTTERMIN_Impcod2( String value )
   {
      gxTv_SdtTTERMIN_Impcod2_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impcod2");
      gxTv_SdtTTERMIN_Impcod2 = value ;
   }

   public void setgxTv_SdtTTERMIN_Impcod2_SetNull( )
   {
      gxTv_SdtTTERMIN_Impcod2_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Impcod2 = "" ;
      SetDirty("Impcod2");
   }

   public boolean getgxTv_SdtTTERMIN_Impcod2_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Impcod2_N==1) ;
   }

   public String getgxTv_SdtTTERMIN_Impcod3( )
   {
      return gxTv_SdtTTERMIN_Impcod3 ;
   }

   public void setgxTv_SdtTTERMIN_Impcod3( String value )
   {
      gxTv_SdtTTERMIN_Impcod3_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impcod3");
      gxTv_SdtTTERMIN_Impcod3 = value ;
   }

   public void setgxTv_SdtTTERMIN_Impcod3_SetNull( )
   {
      gxTv_SdtTTERMIN_Impcod3_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Impcod3 = "" ;
      SetDirty("Impcod3");
   }

   public boolean getgxTv_SdtTTERMIN_Impcod3_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Impcod3_N==1) ;
   }

   public String getgxTv_SdtTTERMIN_Impcod4( )
   {
      return gxTv_SdtTTERMIN_Impcod4 ;
   }

   public void setgxTv_SdtTTERMIN_Impcod4( String value )
   {
      gxTv_SdtTTERMIN_Impcod4_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impcod4");
      gxTv_SdtTTERMIN_Impcod4 = value ;
   }

   public void setgxTv_SdtTTERMIN_Impcod4_SetNull( )
   {
      gxTv_SdtTTERMIN_Impcod4_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Impcod4 = "" ;
      SetDirty("Impcod4");
   }

   public boolean getgxTv_SdtTTERMIN_Impcod4_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Impcod4_N==1) ;
   }

   public String getgxTv_SdtTTERMIN_Impcod5( )
   {
      return gxTv_SdtTTERMIN_Impcod5 ;
   }

   public void setgxTv_SdtTTERMIN_Impcod5( String value )
   {
      gxTv_SdtTTERMIN_Impcod5_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impcod5");
      gxTv_SdtTTERMIN_Impcod5 = value ;
   }

   public void setgxTv_SdtTTERMIN_Impcod5_SetNull( )
   {
      gxTv_SdtTTERMIN_Impcod5_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Impcod5 = "" ;
      SetDirty("Impcod5");
   }

   public boolean getgxTv_SdtTTERMIN_Impcod5_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Impcod5_N==1) ;
   }

   public String getgxTv_SdtTTERMIN_Implpt1( )
   {
      return gxTv_SdtTTERMIN_Implpt1 ;
   }

   public void setgxTv_SdtTTERMIN_Implpt1( String value )
   {
      gxTv_SdtTTERMIN_Implpt1_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Implpt1");
      gxTv_SdtTTERMIN_Implpt1 = value ;
   }

   public void setgxTv_SdtTTERMIN_Implpt1_SetNull( )
   {
      gxTv_SdtTTERMIN_Implpt1_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Implpt1 = "" ;
      SetDirty("Implpt1");
   }

   public boolean getgxTv_SdtTTERMIN_Implpt1_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Implpt1_N==1) ;
   }

   public String getgxTv_SdtTTERMIN_Implpt2( )
   {
      return gxTv_SdtTTERMIN_Implpt2 ;
   }

   public void setgxTv_SdtTTERMIN_Implpt2( String value )
   {
      gxTv_SdtTTERMIN_Implpt2_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Implpt2");
      gxTv_SdtTTERMIN_Implpt2 = value ;
   }

   public void setgxTv_SdtTTERMIN_Implpt2_SetNull( )
   {
      gxTv_SdtTTERMIN_Implpt2_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Implpt2 = "" ;
      SetDirty("Implpt2");
   }

   public boolean getgxTv_SdtTTERMIN_Implpt2_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Implpt2_N==1) ;
   }

   public String getgxTv_SdtTTERMIN_Implpt3( )
   {
      return gxTv_SdtTTERMIN_Implpt3 ;
   }

   public void setgxTv_SdtTTERMIN_Implpt3( String value )
   {
      gxTv_SdtTTERMIN_Implpt3_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Implpt3");
      gxTv_SdtTTERMIN_Implpt3 = value ;
   }

   public void setgxTv_SdtTTERMIN_Implpt3_SetNull( )
   {
      gxTv_SdtTTERMIN_Implpt3_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Implpt3 = "" ;
      SetDirty("Implpt3");
   }

   public boolean getgxTv_SdtTTERMIN_Implpt3_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Implpt3_N==1) ;
   }

   public String getgxTv_SdtTTERMIN_Implpt4( )
   {
      return gxTv_SdtTTERMIN_Implpt4 ;
   }

   public void setgxTv_SdtTTERMIN_Implpt4( String value )
   {
      gxTv_SdtTTERMIN_Implpt4_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Implpt4");
      gxTv_SdtTTERMIN_Implpt4 = value ;
   }

   public void setgxTv_SdtTTERMIN_Implpt4_SetNull( )
   {
      gxTv_SdtTTERMIN_Implpt4_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Implpt4 = "" ;
      SetDirty("Implpt4");
   }

   public boolean getgxTv_SdtTTERMIN_Implpt4_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Implpt4_N==1) ;
   }

   public String getgxTv_SdtTTERMIN_Implpt5( )
   {
      return gxTv_SdtTTERMIN_Implpt5 ;
   }

   public void setgxTv_SdtTTERMIN_Implpt5( String value )
   {
      gxTv_SdtTTERMIN_Implpt5_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Implpt5");
      gxTv_SdtTTERMIN_Implpt5 = value ;
   }

   public void setgxTv_SdtTTERMIN_Implpt5_SetNull( )
   {
      gxTv_SdtTTERMIN_Implpt5_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Implpt5 = "" ;
      SetDirty("Implpt5");
   }

   public boolean getgxTv_SdtTTERMIN_Implpt5_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Implpt5_N==1) ;
   }

   public byte getgxTv_SdtTTERMIN_Termbol( )
   {
      return gxTv_SdtTTERMIN_Termbol ;
   }

   public void setgxTv_SdtTTERMIN_Termbol( byte value )
   {
      gxTv_SdtTTERMIN_Termbol_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termbol");
      gxTv_SdtTTERMIN_Termbol = value ;
   }

   public void setgxTv_SdtTTERMIN_Termbol_SetNull( )
   {
      gxTv_SdtTTERMIN_Termbol_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Termbol = (byte)(0) ;
      SetDirty("Termbol");
   }

   public boolean getgxTv_SdtTTERMIN_Termbol_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Termbol_N==1) ;
   }

   public byte getgxTv_SdtTTERMIN_Termbal( )
   {
      return gxTv_SdtTTERMIN_Termbal ;
   }

   public void setgxTv_SdtTTERMIN_Termbal( byte value )
   {
      gxTv_SdtTTERMIN_Termbal_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termbal");
      gxTv_SdtTTERMIN_Termbal = value ;
   }

   public void setgxTv_SdtTTERMIN_Termbal_SetNull( )
   {
      gxTv_SdtTTERMIN_Termbal_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Termbal = (byte)(0) ;
      SetDirty("Termbal");
   }

   public boolean getgxTv_SdtTTERMIN_Termbal_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Termbal_N==1) ;
   }

   public byte getgxTv_SdtTTERMIN_Termnotr( )
   {
      return gxTv_SdtTTERMIN_Termnotr ;
   }

   public void setgxTv_SdtTTERMIN_Termnotr( byte value )
   {
      gxTv_SdtTTERMIN_Termnotr_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termnotr");
      gxTv_SdtTTERMIN_Termnotr = value ;
   }

   public void setgxTv_SdtTTERMIN_Termnotr_SetNull( )
   {
      gxTv_SdtTTERMIN_Termnotr_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Termnotr = (byte)(0) ;
      SetDirty("Termnotr");
   }

   public boolean getgxTv_SdtTTERMIN_Termnotr_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Termnotr_N==1) ;
   }

   public String getgxTv_SdtTTERMIN_Termlog1( )
   {
      return gxTv_SdtTTERMIN_Termlog1 ;
   }

   public void setgxTv_SdtTTERMIN_Termlog1( String value )
   {
      gxTv_SdtTTERMIN_Termlog1_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termlog1");
      gxTv_SdtTTERMIN_Termlog1 = value ;
   }

   public void setgxTv_SdtTTERMIN_Termlog1_SetNull( )
   {
      gxTv_SdtTTERMIN_Termlog1_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Termlog1 = "" ;
      SetDirty("Termlog1");
   }

   public boolean getgxTv_SdtTTERMIN_Termlog1_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Termlog1_N==1) ;
   }

   public String getgxTv_SdtTTERMIN_Termlog2( )
   {
      return gxTv_SdtTTERMIN_Termlog2 ;
   }

   public void setgxTv_SdtTTERMIN_Termlog2( String value )
   {
      gxTv_SdtTTERMIN_Termlog2_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termlog2");
      gxTv_SdtTTERMIN_Termlog2 = value ;
   }

   public void setgxTv_SdtTTERMIN_Termlog2_SetNull( )
   {
      gxTv_SdtTTERMIN_Termlog2_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Termlog2 = "" ;
      SetDirty("Termlog2");
   }

   public boolean getgxTv_SdtTTERMIN_Termlog2_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Termlog2_N==1) ;
   }

   public byte getgxTv_SdtTTERMIN_Termpes( )
   {
      return gxTv_SdtTTERMIN_Termpes ;
   }

   public void setgxTv_SdtTTERMIN_Termpes( byte value )
   {
      gxTv_SdtTTERMIN_Termpes_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termpes");
      gxTv_SdtTTERMIN_Termpes = value ;
   }

   public void setgxTv_SdtTTERMIN_Termpes_SetNull( )
   {
      gxTv_SdtTTERMIN_Termpes_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Termpes = (byte)(0) ;
      SetDirty("Termpes");
   }

   public boolean getgxTv_SdtTTERMIN_Termpes_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Termpes_N==1) ;
   }

   public byte getgxTv_SdtTTERMIN_Termest( )
   {
      return gxTv_SdtTTERMIN_Termest ;
   }

   public void setgxTv_SdtTTERMIN_Termest( byte value )
   {
      gxTv_SdtTTERMIN_Termest_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termest");
      gxTv_SdtTTERMIN_Termest = value ;
   }

   public void setgxTv_SdtTTERMIN_Termest_SetNull( )
   {
      gxTv_SdtTTERMIN_Termest_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Termest = (byte)(0) ;
      SetDirty("Termest");
   }

   public boolean getgxTv_SdtTTERMIN_Termest_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Termest_N==1) ;
   }

   public java.util.Date getgxTv_SdtTTERMIN_Termfec( )
   {
      return gxTv_SdtTTERMIN_Termfec ;
   }

   public void setgxTv_SdtTTERMIN_Termfec( java.util.Date value )
   {
      gxTv_SdtTTERMIN_Termfec_N = (byte)(0) ;
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termfec");
      gxTv_SdtTTERMIN_Termfec = value ;
   }

   public void setgxTv_SdtTTERMIN_Termfec_SetNull( )
   {
      gxTv_SdtTTERMIN_Termfec_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Termfec = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Termfec");
   }

   public boolean getgxTv_SdtTTERMIN_Termfec_IsNull( )
   {
      return (gxTv_SdtTTERMIN_Termfec_N==1) ;
   }

   public String getgxTv_SdtTTERMIN_Mode( )
   {
      return gxTv_SdtTTERMIN_Mode ;
   }

   public void setgxTv_SdtTTERMIN_Mode( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtTTERMIN_Mode = value ;
   }

   public void setgxTv_SdtTTERMIN_Mode_SetNull( )
   {
      gxTv_SdtTTERMIN_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtTTERMIN_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTTERMIN_Initialized( )
   {
      return gxTv_SdtTTERMIN_Initialized ;
   }

   public void setgxTv_SdtTTERMIN_Initialized( short value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtTTERMIN_Initialized = value ;
   }

   public void setgxTv_SdtTTERMIN_Initialized_SetNull( )
   {
      gxTv_SdtTTERMIN_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtTTERMIN_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERMIN_Termcod_Z( )
   {
      return gxTv_SdtTTERMIN_Termcod_Z ;
   }

   public void setgxTv_SdtTTERMIN_Termcod_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termcod_Z");
      gxTv_SdtTTERMIN_Termcod_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Termcod_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Termcod_Z = "" ;
      SetDirty("Termcod_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Termcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERMIN_Emprcod_Z( )
   {
      return gxTv_SdtTTERMIN_Emprcod_Z ;
   }

   public void setgxTv_SdtTTERMIN_Emprcod_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Emprcod_Z");
      gxTv_SdtTTERMIN_Emprcod_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Emprcod_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Emprcod_Z = "" ;
      SetDirty("Emprcod_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Emprcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERMIN_Emprnom_Z( )
   {
      return gxTv_SdtTTERMIN_Emprnom_Z ;
   }

   public void setgxTv_SdtTTERMIN_Emprnom_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Emprnom_Z");
      gxTv_SdtTTERMIN_Emprnom_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Emprnom_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Emprnom_Z = "" ;
      SetDirty("Emprnom_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Emprnom_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERMIN_Termdsc_Z( )
   {
      return gxTv_SdtTTERMIN_Termdsc_Z ;
   }

   public void setgxTv_SdtTTERMIN_Termdsc_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termdsc_Z");
      gxTv_SdtTTERMIN_Termdsc_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Termdsc_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Termdsc_Z = "" ;
      SetDirty("Termdsc_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Termdsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERMIN_Impcod_Z( )
   {
      return gxTv_SdtTTERMIN_Impcod_Z ;
   }

   public void setgxTv_SdtTTERMIN_Impcod_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impcod_Z");
      gxTv_SdtTTERMIN_Impcod_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Impcod_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Impcod_Z = "" ;
      SetDirty("Impcod_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Impcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERMIN_Impdsc_Z( )
   {
      return gxTv_SdtTTERMIN_Impdsc_Z ;
   }

   public void setgxTv_SdtTTERMIN_Impdsc_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impdsc_Z");
      gxTv_SdtTTERMIN_Impdsc_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Impdsc_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Impdsc_Z = "" ;
      SetDirty("Impdsc_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Impdsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERMIN_Termusu_Z( )
   {
      return gxTv_SdtTTERMIN_Termusu_Z ;
   }

   public void setgxTv_SdtTTERMIN_Termusu_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termusu_Z");
      gxTv_SdtTTERMIN_Termusu_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Termusu_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Termusu_Z = "" ;
      SetDirty("Termusu_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Termusu_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERMIN_Impcod1_Z( )
   {
      return gxTv_SdtTTERMIN_Impcod1_Z ;
   }

   public void setgxTv_SdtTTERMIN_Impcod1_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impcod1_Z");
      gxTv_SdtTTERMIN_Impcod1_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Impcod1_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Impcod1_Z = "" ;
      SetDirty("Impcod1_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Impcod1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERMIN_Impcod2_Z( )
   {
      return gxTv_SdtTTERMIN_Impcod2_Z ;
   }

   public void setgxTv_SdtTTERMIN_Impcod2_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impcod2_Z");
      gxTv_SdtTTERMIN_Impcod2_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Impcod2_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Impcod2_Z = "" ;
      SetDirty("Impcod2_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Impcod2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERMIN_Impcod3_Z( )
   {
      return gxTv_SdtTTERMIN_Impcod3_Z ;
   }

   public void setgxTv_SdtTTERMIN_Impcod3_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impcod3_Z");
      gxTv_SdtTTERMIN_Impcod3_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Impcod3_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Impcod3_Z = "" ;
      SetDirty("Impcod3_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Impcod3_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERMIN_Impcod4_Z( )
   {
      return gxTv_SdtTTERMIN_Impcod4_Z ;
   }

   public void setgxTv_SdtTTERMIN_Impcod4_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impcod4_Z");
      gxTv_SdtTTERMIN_Impcod4_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Impcod4_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Impcod4_Z = "" ;
      SetDirty("Impcod4_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Impcod4_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERMIN_Impcod5_Z( )
   {
      return gxTv_SdtTTERMIN_Impcod5_Z ;
   }

   public void setgxTv_SdtTTERMIN_Impcod5_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impcod5_Z");
      gxTv_SdtTTERMIN_Impcod5_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Impcod5_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Impcod5_Z = "" ;
      SetDirty("Impcod5_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Impcod5_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERMIN_Implpt1_Z( )
   {
      return gxTv_SdtTTERMIN_Implpt1_Z ;
   }

   public void setgxTv_SdtTTERMIN_Implpt1_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Implpt1_Z");
      gxTv_SdtTTERMIN_Implpt1_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Implpt1_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Implpt1_Z = "" ;
      SetDirty("Implpt1_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Implpt1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERMIN_Implpt2_Z( )
   {
      return gxTv_SdtTTERMIN_Implpt2_Z ;
   }

   public void setgxTv_SdtTTERMIN_Implpt2_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Implpt2_Z");
      gxTv_SdtTTERMIN_Implpt2_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Implpt2_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Implpt2_Z = "" ;
      SetDirty("Implpt2_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Implpt2_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERMIN_Implpt3_Z( )
   {
      return gxTv_SdtTTERMIN_Implpt3_Z ;
   }

   public void setgxTv_SdtTTERMIN_Implpt3_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Implpt3_Z");
      gxTv_SdtTTERMIN_Implpt3_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Implpt3_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Implpt3_Z = "" ;
      SetDirty("Implpt3_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Implpt3_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERMIN_Implpt4_Z( )
   {
      return gxTv_SdtTTERMIN_Implpt4_Z ;
   }

   public void setgxTv_SdtTTERMIN_Implpt4_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Implpt4_Z");
      gxTv_SdtTTERMIN_Implpt4_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Implpt4_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Implpt4_Z = "" ;
      SetDirty("Implpt4_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Implpt4_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERMIN_Implpt5_Z( )
   {
      return gxTv_SdtTTERMIN_Implpt5_Z ;
   }

   public void setgxTv_SdtTTERMIN_Implpt5_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Implpt5_Z");
      gxTv_SdtTTERMIN_Implpt5_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Implpt5_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Implpt5_Z = "" ;
      SetDirty("Implpt5_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Implpt5_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Termbol_Z( )
   {
      return gxTv_SdtTTERMIN_Termbol_Z ;
   }

   public void setgxTv_SdtTTERMIN_Termbol_Z( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termbol_Z");
      gxTv_SdtTTERMIN_Termbol_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Termbol_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Termbol_Z = (byte)(0) ;
      SetDirty("Termbol_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Termbol_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Termbal_Z( )
   {
      return gxTv_SdtTTERMIN_Termbal_Z ;
   }

   public void setgxTv_SdtTTERMIN_Termbal_Z( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termbal_Z");
      gxTv_SdtTTERMIN_Termbal_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Termbal_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Termbal_Z = (byte)(0) ;
      SetDirty("Termbal_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Termbal_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Termnotr_Z( )
   {
      return gxTv_SdtTTERMIN_Termnotr_Z ;
   }

   public void setgxTv_SdtTTERMIN_Termnotr_Z( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termnotr_Z");
      gxTv_SdtTTERMIN_Termnotr_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Termnotr_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Termnotr_Z = (byte)(0) ;
      SetDirty("Termnotr_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Termnotr_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERMIN_Termlog1_Z( )
   {
      return gxTv_SdtTTERMIN_Termlog1_Z ;
   }

   public void setgxTv_SdtTTERMIN_Termlog1_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termlog1_Z");
      gxTv_SdtTTERMIN_Termlog1_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Termlog1_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Termlog1_Z = "" ;
      SetDirty("Termlog1_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Termlog1_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTERMIN_Termlog2_Z( )
   {
      return gxTv_SdtTTERMIN_Termlog2_Z ;
   }

   public void setgxTv_SdtTTERMIN_Termlog2_Z( String value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termlog2_Z");
      gxTv_SdtTTERMIN_Termlog2_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Termlog2_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Termlog2_Z = "" ;
      SetDirty("Termlog2_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Termlog2_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Termpes_Z( )
   {
      return gxTv_SdtTTERMIN_Termpes_Z ;
   }

   public void setgxTv_SdtTTERMIN_Termpes_Z( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termpes_Z");
      gxTv_SdtTTERMIN_Termpes_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Termpes_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Termpes_Z = (byte)(0) ;
      SetDirty("Termpes_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Termpes_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Termest_Z( )
   {
      return gxTv_SdtTTERMIN_Termest_Z ;
   }

   public void setgxTv_SdtTTERMIN_Termest_Z( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termest_Z");
      gxTv_SdtTTERMIN_Termest_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Termest_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Termest_Z = (byte)(0) ;
      SetDirty("Termest_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Termest_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTTERMIN_Termfec_Z( )
   {
      return gxTv_SdtTTERMIN_Termfec_Z ;
   }

   public void setgxTv_SdtTTERMIN_Termfec_Z( java.util.Date value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termfec_Z");
      gxTv_SdtTTERMIN_Termfec_Z = value ;
   }

   public void setgxTv_SdtTTERMIN_Termfec_Z_SetNull( )
   {
      gxTv_SdtTTERMIN_Termfec_Z = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Termfec_Z");
   }

   public boolean getgxTv_SdtTTERMIN_Termfec_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Emprcod_N( )
   {
      return gxTv_SdtTTERMIN_Emprcod_N ;
   }

   public void setgxTv_SdtTTERMIN_Emprcod_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Emprcod_N");
      gxTv_SdtTTERMIN_Emprcod_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Emprcod_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Emprcod_N = (byte)(0) ;
      SetDirty("Emprcod_N");
   }

   public boolean getgxTv_SdtTTERMIN_Emprcod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Emprnom_N( )
   {
      return gxTv_SdtTTERMIN_Emprnom_N ;
   }

   public void setgxTv_SdtTTERMIN_Emprnom_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Emprnom_N");
      gxTv_SdtTTERMIN_Emprnom_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Emprnom_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Emprnom_N = (byte)(0) ;
      SetDirty("Emprnom_N");
   }

   public boolean getgxTv_SdtTTERMIN_Emprnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Termdsc_N( )
   {
      return gxTv_SdtTTERMIN_Termdsc_N ;
   }

   public void setgxTv_SdtTTERMIN_Termdsc_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termdsc_N");
      gxTv_SdtTTERMIN_Termdsc_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Termdsc_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Termdsc_N = (byte)(0) ;
      SetDirty("Termdsc_N");
   }

   public boolean getgxTv_SdtTTERMIN_Termdsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Impcod_N( )
   {
      return gxTv_SdtTTERMIN_Impcod_N ;
   }

   public void setgxTv_SdtTTERMIN_Impcod_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impcod_N");
      gxTv_SdtTTERMIN_Impcod_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Impcod_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Impcod_N = (byte)(0) ;
      SetDirty("Impcod_N");
   }

   public boolean getgxTv_SdtTTERMIN_Impcod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Impdsc_N( )
   {
      return gxTv_SdtTTERMIN_Impdsc_N ;
   }

   public void setgxTv_SdtTTERMIN_Impdsc_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impdsc_N");
      gxTv_SdtTTERMIN_Impdsc_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Impdsc_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Impdsc_N = (byte)(0) ;
      SetDirty("Impdsc_N");
   }

   public boolean getgxTv_SdtTTERMIN_Impdsc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Termusu_N( )
   {
      return gxTv_SdtTTERMIN_Termusu_N ;
   }

   public void setgxTv_SdtTTERMIN_Termusu_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termusu_N");
      gxTv_SdtTTERMIN_Termusu_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Termusu_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Termusu_N = (byte)(0) ;
      SetDirty("Termusu_N");
   }

   public boolean getgxTv_SdtTTERMIN_Termusu_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Impcod1_N( )
   {
      return gxTv_SdtTTERMIN_Impcod1_N ;
   }

   public void setgxTv_SdtTTERMIN_Impcod1_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impcod1_N");
      gxTv_SdtTTERMIN_Impcod1_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Impcod1_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Impcod1_N = (byte)(0) ;
      SetDirty("Impcod1_N");
   }

   public boolean getgxTv_SdtTTERMIN_Impcod1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Impcod2_N( )
   {
      return gxTv_SdtTTERMIN_Impcod2_N ;
   }

   public void setgxTv_SdtTTERMIN_Impcod2_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impcod2_N");
      gxTv_SdtTTERMIN_Impcod2_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Impcod2_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Impcod2_N = (byte)(0) ;
      SetDirty("Impcod2_N");
   }

   public boolean getgxTv_SdtTTERMIN_Impcod2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Impcod3_N( )
   {
      return gxTv_SdtTTERMIN_Impcod3_N ;
   }

   public void setgxTv_SdtTTERMIN_Impcod3_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impcod3_N");
      gxTv_SdtTTERMIN_Impcod3_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Impcod3_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Impcod3_N = (byte)(0) ;
      SetDirty("Impcod3_N");
   }

   public boolean getgxTv_SdtTTERMIN_Impcod3_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Impcod4_N( )
   {
      return gxTv_SdtTTERMIN_Impcod4_N ;
   }

   public void setgxTv_SdtTTERMIN_Impcod4_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impcod4_N");
      gxTv_SdtTTERMIN_Impcod4_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Impcod4_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Impcod4_N = (byte)(0) ;
      SetDirty("Impcod4_N");
   }

   public boolean getgxTv_SdtTTERMIN_Impcod4_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Impcod5_N( )
   {
      return gxTv_SdtTTERMIN_Impcod5_N ;
   }

   public void setgxTv_SdtTTERMIN_Impcod5_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Impcod5_N");
      gxTv_SdtTTERMIN_Impcod5_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Impcod5_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Impcod5_N = (byte)(0) ;
      SetDirty("Impcod5_N");
   }

   public boolean getgxTv_SdtTTERMIN_Impcod5_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Implpt1_N( )
   {
      return gxTv_SdtTTERMIN_Implpt1_N ;
   }

   public void setgxTv_SdtTTERMIN_Implpt1_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Implpt1_N");
      gxTv_SdtTTERMIN_Implpt1_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Implpt1_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Implpt1_N = (byte)(0) ;
      SetDirty("Implpt1_N");
   }

   public boolean getgxTv_SdtTTERMIN_Implpt1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Implpt2_N( )
   {
      return gxTv_SdtTTERMIN_Implpt2_N ;
   }

   public void setgxTv_SdtTTERMIN_Implpt2_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Implpt2_N");
      gxTv_SdtTTERMIN_Implpt2_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Implpt2_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Implpt2_N = (byte)(0) ;
      SetDirty("Implpt2_N");
   }

   public boolean getgxTv_SdtTTERMIN_Implpt2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Implpt3_N( )
   {
      return gxTv_SdtTTERMIN_Implpt3_N ;
   }

   public void setgxTv_SdtTTERMIN_Implpt3_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Implpt3_N");
      gxTv_SdtTTERMIN_Implpt3_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Implpt3_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Implpt3_N = (byte)(0) ;
      SetDirty("Implpt3_N");
   }

   public boolean getgxTv_SdtTTERMIN_Implpt3_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Implpt4_N( )
   {
      return gxTv_SdtTTERMIN_Implpt4_N ;
   }

   public void setgxTv_SdtTTERMIN_Implpt4_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Implpt4_N");
      gxTv_SdtTTERMIN_Implpt4_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Implpt4_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Implpt4_N = (byte)(0) ;
      SetDirty("Implpt4_N");
   }

   public boolean getgxTv_SdtTTERMIN_Implpt4_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Implpt5_N( )
   {
      return gxTv_SdtTTERMIN_Implpt5_N ;
   }

   public void setgxTv_SdtTTERMIN_Implpt5_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Implpt5_N");
      gxTv_SdtTTERMIN_Implpt5_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Implpt5_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Implpt5_N = (byte)(0) ;
      SetDirty("Implpt5_N");
   }

   public boolean getgxTv_SdtTTERMIN_Implpt5_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Termbol_N( )
   {
      return gxTv_SdtTTERMIN_Termbol_N ;
   }

   public void setgxTv_SdtTTERMIN_Termbol_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termbol_N");
      gxTv_SdtTTERMIN_Termbol_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Termbol_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Termbol_N = (byte)(0) ;
      SetDirty("Termbol_N");
   }

   public boolean getgxTv_SdtTTERMIN_Termbol_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Termbal_N( )
   {
      return gxTv_SdtTTERMIN_Termbal_N ;
   }

   public void setgxTv_SdtTTERMIN_Termbal_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termbal_N");
      gxTv_SdtTTERMIN_Termbal_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Termbal_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Termbal_N = (byte)(0) ;
      SetDirty("Termbal_N");
   }

   public boolean getgxTv_SdtTTERMIN_Termbal_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Termnotr_N( )
   {
      return gxTv_SdtTTERMIN_Termnotr_N ;
   }

   public void setgxTv_SdtTTERMIN_Termnotr_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termnotr_N");
      gxTv_SdtTTERMIN_Termnotr_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Termnotr_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Termnotr_N = (byte)(0) ;
      SetDirty("Termnotr_N");
   }

   public boolean getgxTv_SdtTTERMIN_Termnotr_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Termlog1_N( )
   {
      return gxTv_SdtTTERMIN_Termlog1_N ;
   }

   public void setgxTv_SdtTTERMIN_Termlog1_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termlog1_N");
      gxTv_SdtTTERMIN_Termlog1_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Termlog1_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Termlog1_N = (byte)(0) ;
      SetDirty("Termlog1_N");
   }

   public boolean getgxTv_SdtTTERMIN_Termlog1_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Termlog2_N( )
   {
      return gxTv_SdtTTERMIN_Termlog2_N ;
   }

   public void setgxTv_SdtTTERMIN_Termlog2_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termlog2_N");
      gxTv_SdtTTERMIN_Termlog2_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Termlog2_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Termlog2_N = (byte)(0) ;
      SetDirty("Termlog2_N");
   }

   public boolean getgxTv_SdtTTERMIN_Termlog2_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Termpes_N( )
   {
      return gxTv_SdtTTERMIN_Termpes_N ;
   }

   public void setgxTv_SdtTTERMIN_Termpes_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termpes_N");
      gxTv_SdtTTERMIN_Termpes_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Termpes_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Termpes_N = (byte)(0) ;
      SetDirty("Termpes_N");
   }

   public boolean getgxTv_SdtTTERMIN_Termpes_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Termest_N( )
   {
      return gxTv_SdtTTERMIN_Termest_N ;
   }

   public void setgxTv_SdtTTERMIN_Termest_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termest_N");
      gxTv_SdtTTERMIN_Termest_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Termest_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Termest_N = (byte)(0) ;
      SetDirty("Termest_N");
   }

   public boolean getgxTv_SdtTTERMIN_Termest_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTERMIN_Termfec_N( )
   {
      return gxTv_SdtTTERMIN_Termfec_N ;
   }

   public void setgxTv_SdtTTERMIN_Termfec_N( byte value )
   {
      gxTv_SdtTTERMIN_N = (byte)(0) ;
      SetDirty("Termfec_N");
      gxTv_SdtTTERMIN_Termfec_N = value ;
   }

   public void setgxTv_SdtTTERMIN_Termfec_N_SetNull( )
   {
      gxTv_SdtTTERMIN_Termfec_N = (byte)(0) ;
      SetDirty("Termfec_N");
   }

   public boolean getgxTv_SdtTTERMIN_Termfec_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.ttermin_bc obj;
      obj = new app.ttermin_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTTERMIN_Termcod = "" ;
      gxTv_SdtTTERMIN_N = (byte)(1) ;
      gxTv_SdtTTERMIN_Emprcod = "" ;
      gxTv_SdtTTERMIN_Emprnom = "" ;
      gxTv_SdtTTERMIN_Termdsc = "" ;
      gxTv_SdtTTERMIN_Impcod = "" ;
      gxTv_SdtTTERMIN_Impdsc = "" ;
      gxTv_SdtTTERMIN_Termusu = "" ;
      gxTv_SdtTTERMIN_Impcod1 = "" ;
      gxTv_SdtTTERMIN_Impcod2 = "" ;
      gxTv_SdtTTERMIN_Impcod3 = "" ;
      gxTv_SdtTTERMIN_Impcod4 = "" ;
      gxTv_SdtTTERMIN_Impcod5 = "" ;
      gxTv_SdtTTERMIN_Implpt1 = "" ;
      gxTv_SdtTTERMIN_Implpt2 = "" ;
      gxTv_SdtTTERMIN_Implpt3 = "" ;
      gxTv_SdtTTERMIN_Implpt4 = "" ;
      gxTv_SdtTTERMIN_Implpt5 = "" ;
      gxTv_SdtTTERMIN_Termlog1 = "" ;
      gxTv_SdtTTERMIN_Termlog2 = "" ;
      gxTv_SdtTTERMIN_Termfec = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTTERMIN_Mode = "" ;
      gxTv_SdtTTERMIN_Termcod_Z = "" ;
      gxTv_SdtTTERMIN_Emprcod_Z = "" ;
      gxTv_SdtTTERMIN_Emprnom_Z = "" ;
      gxTv_SdtTTERMIN_Termdsc_Z = "" ;
      gxTv_SdtTTERMIN_Impcod_Z = "" ;
      gxTv_SdtTTERMIN_Impdsc_Z = "" ;
      gxTv_SdtTTERMIN_Termusu_Z = "" ;
      gxTv_SdtTTERMIN_Impcod1_Z = "" ;
      gxTv_SdtTTERMIN_Impcod2_Z = "" ;
      gxTv_SdtTTERMIN_Impcod3_Z = "" ;
      gxTv_SdtTTERMIN_Impcod4_Z = "" ;
      gxTv_SdtTTERMIN_Impcod5_Z = "" ;
      gxTv_SdtTTERMIN_Implpt1_Z = "" ;
      gxTv_SdtTTERMIN_Implpt2_Z = "" ;
      gxTv_SdtTTERMIN_Implpt3_Z = "" ;
      gxTv_SdtTTERMIN_Implpt4_Z = "" ;
      gxTv_SdtTTERMIN_Implpt5_Z = "" ;
      gxTv_SdtTTERMIN_Termlog1_Z = "" ;
      gxTv_SdtTTERMIN_Termlog2_Z = "" ;
      gxTv_SdtTTERMIN_Termfec_Z = GXutil.resetTime( GXutil.nullDate() );
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtTTERMIN_N ;
   }

   public app.SdtTTERMIN Clone( )
   {
      app.SdtTTERMIN sdt;
      app.ttermin_bc obj;
      sdt = (app.SdtTTERMIN)(clone()) ;
      obj = (app.ttermin_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.StructSdtTTERMIN struct )
   {
      setgxTv_SdtTTERMIN_Termcod(struct.getTermcod());
      setgxTv_SdtTTERMIN_Emprcod(struct.getEmprcod());
      setgxTv_SdtTTERMIN_Emprnom(struct.getEmprnom());
      setgxTv_SdtTTERMIN_Termdsc(struct.getTermdsc());
      setgxTv_SdtTTERMIN_Impcod(struct.getImpcod());
      setgxTv_SdtTTERMIN_Impdsc(struct.getImpdsc());
      setgxTv_SdtTTERMIN_Termusu(struct.getTermusu());
      setgxTv_SdtTTERMIN_Impcod1(struct.getImpcod1());
      setgxTv_SdtTTERMIN_Impcod2(struct.getImpcod2());
      setgxTv_SdtTTERMIN_Impcod3(struct.getImpcod3());
      setgxTv_SdtTTERMIN_Impcod4(struct.getImpcod4());
      setgxTv_SdtTTERMIN_Impcod5(struct.getImpcod5());
      setgxTv_SdtTTERMIN_Implpt1(struct.getImplpt1());
      setgxTv_SdtTTERMIN_Implpt2(struct.getImplpt2());
      setgxTv_SdtTTERMIN_Implpt3(struct.getImplpt3());
      setgxTv_SdtTTERMIN_Implpt4(struct.getImplpt4());
      setgxTv_SdtTTERMIN_Implpt5(struct.getImplpt5());
      setgxTv_SdtTTERMIN_Termbol(struct.getTermbol());
      setgxTv_SdtTTERMIN_Termbal(struct.getTermbal());
      setgxTv_SdtTTERMIN_Termnotr(struct.getTermnotr());
      setgxTv_SdtTTERMIN_Termlog1(struct.getTermlog1());
      setgxTv_SdtTTERMIN_Termlog2(struct.getTermlog2());
      setgxTv_SdtTTERMIN_Termpes(struct.getTermpes());
      setgxTv_SdtTTERMIN_Termest(struct.getTermest());
      setgxTv_SdtTTERMIN_Termfec(struct.getTermfec());
      setgxTv_SdtTTERMIN_Mode(struct.getMode());
      setgxTv_SdtTTERMIN_Initialized(struct.getInitialized());
      setgxTv_SdtTTERMIN_Termcod_Z(struct.getTermcod_Z());
      setgxTv_SdtTTERMIN_Emprcod_Z(struct.getEmprcod_Z());
      setgxTv_SdtTTERMIN_Emprnom_Z(struct.getEmprnom_Z());
      setgxTv_SdtTTERMIN_Termdsc_Z(struct.getTermdsc_Z());
      setgxTv_SdtTTERMIN_Impcod_Z(struct.getImpcod_Z());
      setgxTv_SdtTTERMIN_Impdsc_Z(struct.getImpdsc_Z());
      setgxTv_SdtTTERMIN_Termusu_Z(struct.getTermusu_Z());
      setgxTv_SdtTTERMIN_Impcod1_Z(struct.getImpcod1_Z());
      setgxTv_SdtTTERMIN_Impcod2_Z(struct.getImpcod2_Z());
      setgxTv_SdtTTERMIN_Impcod3_Z(struct.getImpcod3_Z());
      setgxTv_SdtTTERMIN_Impcod4_Z(struct.getImpcod4_Z());
      setgxTv_SdtTTERMIN_Impcod5_Z(struct.getImpcod5_Z());
      setgxTv_SdtTTERMIN_Implpt1_Z(struct.getImplpt1_Z());
      setgxTv_SdtTTERMIN_Implpt2_Z(struct.getImplpt2_Z());
      setgxTv_SdtTTERMIN_Implpt3_Z(struct.getImplpt3_Z());
      setgxTv_SdtTTERMIN_Implpt4_Z(struct.getImplpt4_Z());
      setgxTv_SdtTTERMIN_Implpt5_Z(struct.getImplpt5_Z());
      setgxTv_SdtTTERMIN_Termbol_Z(struct.getTermbol_Z());
      setgxTv_SdtTTERMIN_Termbal_Z(struct.getTermbal_Z());
      setgxTv_SdtTTERMIN_Termnotr_Z(struct.getTermnotr_Z());
      setgxTv_SdtTTERMIN_Termlog1_Z(struct.getTermlog1_Z());
      setgxTv_SdtTTERMIN_Termlog2_Z(struct.getTermlog2_Z());
      setgxTv_SdtTTERMIN_Termpes_Z(struct.getTermpes_Z());
      setgxTv_SdtTTERMIN_Termest_Z(struct.getTermest_Z());
      setgxTv_SdtTTERMIN_Termfec_Z(struct.getTermfec_Z());
      setgxTv_SdtTTERMIN_Emprcod_N(struct.getEmprcod_N());
      setgxTv_SdtTTERMIN_Emprnom_N(struct.getEmprnom_N());
      setgxTv_SdtTTERMIN_Termdsc_N(struct.getTermdsc_N());
      setgxTv_SdtTTERMIN_Impcod_N(struct.getImpcod_N());
      setgxTv_SdtTTERMIN_Impdsc_N(struct.getImpdsc_N());
      setgxTv_SdtTTERMIN_Termusu_N(struct.getTermusu_N());
      setgxTv_SdtTTERMIN_Impcod1_N(struct.getImpcod1_N());
      setgxTv_SdtTTERMIN_Impcod2_N(struct.getImpcod2_N());
      setgxTv_SdtTTERMIN_Impcod3_N(struct.getImpcod3_N());
      setgxTv_SdtTTERMIN_Impcod4_N(struct.getImpcod4_N());
      setgxTv_SdtTTERMIN_Impcod5_N(struct.getImpcod5_N());
      setgxTv_SdtTTERMIN_Implpt1_N(struct.getImplpt1_N());
      setgxTv_SdtTTERMIN_Implpt2_N(struct.getImplpt2_N());
      setgxTv_SdtTTERMIN_Implpt3_N(struct.getImplpt3_N());
      setgxTv_SdtTTERMIN_Implpt4_N(struct.getImplpt4_N());
      setgxTv_SdtTTERMIN_Implpt5_N(struct.getImplpt5_N());
      setgxTv_SdtTTERMIN_Termbol_N(struct.getTermbol_N());
      setgxTv_SdtTTERMIN_Termbal_N(struct.getTermbal_N());
      setgxTv_SdtTTERMIN_Termnotr_N(struct.getTermnotr_N());
      setgxTv_SdtTTERMIN_Termlog1_N(struct.getTermlog1_N());
      setgxTv_SdtTTERMIN_Termlog2_N(struct.getTermlog2_N());
      setgxTv_SdtTTERMIN_Termpes_N(struct.getTermpes_N());
      setgxTv_SdtTTERMIN_Termest_N(struct.getTermest_N());
      setgxTv_SdtTTERMIN_Termfec_N(struct.getTermfec_N());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtTTERMIN getStruct( )
   {
      app.StructSdtTTERMIN struct = new app.StructSdtTTERMIN ();
      struct.setTermcod(getgxTv_SdtTTERMIN_Termcod());
      struct.setEmprcod(getgxTv_SdtTTERMIN_Emprcod());
      struct.setEmprnom(getgxTv_SdtTTERMIN_Emprnom());
      struct.setTermdsc(getgxTv_SdtTTERMIN_Termdsc());
      struct.setImpcod(getgxTv_SdtTTERMIN_Impcod());
      struct.setImpdsc(getgxTv_SdtTTERMIN_Impdsc());
      struct.setTermusu(getgxTv_SdtTTERMIN_Termusu());
      struct.setImpcod1(getgxTv_SdtTTERMIN_Impcod1());
      struct.setImpcod2(getgxTv_SdtTTERMIN_Impcod2());
      struct.setImpcod3(getgxTv_SdtTTERMIN_Impcod3());
      struct.setImpcod4(getgxTv_SdtTTERMIN_Impcod4());
      struct.setImpcod5(getgxTv_SdtTTERMIN_Impcod5());
      struct.setImplpt1(getgxTv_SdtTTERMIN_Implpt1());
      struct.setImplpt2(getgxTv_SdtTTERMIN_Implpt2());
      struct.setImplpt3(getgxTv_SdtTTERMIN_Implpt3());
      struct.setImplpt4(getgxTv_SdtTTERMIN_Implpt4());
      struct.setImplpt5(getgxTv_SdtTTERMIN_Implpt5());
      struct.setTermbol(getgxTv_SdtTTERMIN_Termbol());
      struct.setTermbal(getgxTv_SdtTTERMIN_Termbal());
      struct.setTermnotr(getgxTv_SdtTTERMIN_Termnotr());
      struct.setTermlog1(getgxTv_SdtTTERMIN_Termlog1());
      struct.setTermlog2(getgxTv_SdtTTERMIN_Termlog2());
      struct.setTermpes(getgxTv_SdtTTERMIN_Termpes());
      struct.setTermest(getgxTv_SdtTTERMIN_Termest());
      struct.setTermfec(getgxTv_SdtTTERMIN_Termfec());
      struct.setMode(getgxTv_SdtTTERMIN_Mode());
      struct.setInitialized(getgxTv_SdtTTERMIN_Initialized());
      struct.setTermcod_Z(getgxTv_SdtTTERMIN_Termcod_Z());
      struct.setEmprcod_Z(getgxTv_SdtTTERMIN_Emprcod_Z());
      struct.setEmprnom_Z(getgxTv_SdtTTERMIN_Emprnom_Z());
      struct.setTermdsc_Z(getgxTv_SdtTTERMIN_Termdsc_Z());
      struct.setImpcod_Z(getgxTv_SdtTTERMIN_Impcod_Z());
      struct.setImpdsc_Z(getgxTv_SdtTTERMIN_Impdsc_Z());
      struct.setTermusu_Z(getgxTv_SdtTTERMIN_Termusu_Z());
      struct.setImpcod1_Z(getgxTv_SdtTTERMIN_Impcod1_Z());
      struct.setImpcod2_Z(getgxTv_SdtTTERMIN_Impcod2_Z());
      struct.setImpcod3_Z(getgxTv_SdtTTERMIN_Impcod3_Z());
      struct.setImpcod4_Z(getgxTv_SdtTTERMIN_Impcod4_Z());
      struct.setImpcod5_Z(getgxTv_SdtTTERMIN_Impcod5_Z());
      struct.setImplpt1_Z(getgxTv_SdtTTERMIN_Implpt1_Z());
      struct.setImplpt2_Z(getgxTv_SdtTTERMIN_Implpt2_Z());
      struct.setImplpt3_Z(getgxTv_SdtTTERMIN_Implpt3_Z());
      struct.setImplpt4_Z(getgxTv_SdtTTERMIN_Implpt4_Z());
      struct.setImplpt5_Z(getgxTv_SdtTTERMIN_Implpt5_Z());
      struct.setTermbol_Z(getgxTv_SdtTTERMIN_Termbol_Z());
      struct.setTermbal_Z(getgxTv_SdtTTERMIN_Termbal_Z());
      struct.setTermnotr_Z(getgxTv_SdtTTERMIN_Termnotr_Z());
      struct.setTermlog1_Z(getgxTv_SdtTTERMIN_Termlog1_Z());
      struct.setTermlog2_Z(getgxTv_SdtTTERMIN_Termlog2_Z());
      struct.setTermpes_Z(getgxTv_SdtTTERMIN_Termpes_Z());
      struct.setTermest_Z(getgxTv_SdtTTERMIN_Termest_Z());
      struct.setTermfec_Z(getgxTv_SdtTTERMIN_Termfec_Z());
      struct.setEmprcod_N(getgxTv_SdtTTERMIN_Emprcod_N());
      struct.setEmprnom_N(getgxTv_SdtTTERMIN_Emprnom_N());
      struct.setTermdsc_N(getgxTv_SdtTTERMIN_Termdsc_N());
      struct.setImpcod_N(getgxTv_SdtTTERMIN_Impcod_N());
      struct.setImpdsc_N(getgxTv_SdtTTERMIN_Impdsc_N());
      struct.setTermusu_N(getgxTv_SdtTTERMIN_Termusu_N());
      struct.setImpcod1_N(getgxTv_SdtTTERMIN_Impcod1_N());
      struct.setImpcod2_N(getgxTv_SdtTTERMIN_Impcod2_N());
      struct.setImpcod3_N(getgxTv_SdtTTERMIN_Impcod3_N());
      struct.setImpcod4_N(getgxTv_SdtTTERMIN_Impcod4_N());
      struct.setImpcod5_N(getgxTv_SdtTTERMIN_Impcod5_N());
      struct.setImplpt1_N(getgxTv_SdtTTERMIN_Implpt1_N());
      struct.setImplpt2_N(getgxTv_SdtTTERMIN_Implpt2_N());
      struct.setImplpt3_N(getgxTv_SdtTTERMIN_Implpt3_N());
      struct.setImplpt4_N(getgxTv_SdtTTERMIN_Implpt4_N());
      struct.setImplpt5_N(getgxTv_SdtTTERMIN_Implpt5_N());
      struct.setTermbol_N(getgxTv_SdtTTERMIN_Termbol_N());
      struct.setTermbal_N(getgxTv_SdtTTERMIN_Termbal_N());
      struct.setTermnotr_N(getgxTv_SdtTTERMIN_Termnotr_N());
      struct.setTermlog1_N(getgxTv_SdtTTERMIN_Termlog1_N());
      struct.setTermlog2_N(getgxTv_SdtTTERMIN_Termlog2_N());
      struct.setTermpes_N(getgxTv_SdtTTERMIN_Termpes_N());
      struct.setTermest_N(getgxTv_SdtTTERMIN_Termest_N());
      struct.setTermfec_N(getgxTv_SdtTTERMIN_Termfec_N());
      return struct ;
   }

   private byte gxTv_SdtTTERMIN_N ;
   private byte gxTv_SdtTTERMIN_Termbol ;
   private byte gxTv_SdtTTERMIN_Termbal ;
   private byte gxTv_SdtTTERMIN_Termnotr ;
   private byte gxTv_SdtTTERMIN_Termpes ;
   private byte gxTv_SdtTTERMIN_Termest ;
   private byte gxTv_SdtTTERMIN_Termbol_Z ;
   private byte gxTv_SdtTTERMIN_Termbal_Z ;
   private byte gxTv_SdtTTERMIN_Termnotr_Z ;
   private byte gxTv_SdtTTERMIN_Termpes_Z ;
   private byte gxTv_SdtTTERMIN_Termest_Z ;
   private byte gxTv_SdtTTERMIN_Emprcod_N ;
   private byte gxTv_SdtTTERMIN_Emprnom_N ;
   private byte gxTv_SdtTTERMIN_Termdsc_N ;
   private byte gxTv_SdtTTERMIN_Impcod_N ;
   private byte gxTv_SdtTTERMIN_Impdsc_N ;
   private byte gxTv_SdtTTERMIN_Termusu_N ;
   private byte gxTv_SdtTTERMIN_Impcod1_N ;
   private byte gxTv_SdtTTERMIN_Impcod2_N ;
   private byte gxTv_SdtTTERMIN_Impcod3_N ;
   private byte gxTv_SdtTTERMIN_Impcod4_N ;
   private byte gxTv_SdtTTERMIN_Impcod5_N ;
   private byte gxTv_SdtTTERMIN_Implpt1_N ;
   private byte gxTv_SdtTTERMIN_Implpt2_N ;
   private byte gxTv_SdtTTERMIN_Implpt3_N ;
   private byte gxTv_SdtTTERMIN_Implpt4_N ;
   private byte gxTv_SdtTTERMIN_Implpt5_N ;
   private byte gxTv_SdtTTERMIN_Termbol_N ;
   private byte gxTv_SdtTTERMIN_Termbal_N ;
   private byte gxTv_SdtTTERMIN_Termnotr_N ;
   private byte gxTv_SdtTTERMIN_Termlog1_N ;
   private byte gxTv_SdtTTERMIN_Termlog2_N ;
   private byte gxTv_SdtTTERMIN_Termpes_N ;
   private byte gxTv_SdtTTERMIN_Termest_N ;
   private byte gxTv_SdtTTERMIN_Termfec_N ;
   private short gxTv_SdtTTERMIN_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_SdtTTERMIN_Termcod ;
   private String gxTv_SdtTTERMIN_Emprcod ;
   private String gxTv_SdtTTERMIN_Emprnom ;
   private String gxTv_SdtTTERMIN_Termdsc ;
   private String gxTv_SdtTTERMIN_Impcod ;
   private String gxTv_SdtTTERMIN_Impdsc ;
   private String gxTv_SdtTTERMIN_Termusu ;
   private String gxTv_SdtTTERMIN_Impcod1 ;
   private String gxTv_SdtTTERMIN_Impcod2 ;
   private String gxTv_SdtTTERMIN_Impcod3 ;
   private String gxTv_SdtTTERMIN_Impcod4 ;
   private String gxTv_SdtTTERMIN_Impcod5 ;
   private String gxTv_SdtTTERMIN_Implpt1 ;
   private String gxTv_SdtTTERMIN_Implpt2 ;
   private String gxTv_SdtTTERMIN_Implpt3 ;
   private String gxTv_SdtTTERMIN_Implpt4 ;
   private String gxTv_SdtTTERMIN_Implpt5 ;
   private String gxTv_SdtTTERMIN_Mode ;
   private String gxTv_SdtTTERMIN_Termcod_Z ;
   private String gxTv_SdtTTERMIN_Emprcod_Z ;
   private String gxTv_SdtTTERMIN_Emprnom_Z ;
   private String gxTv_SdtTTERMIN_Termdsc_Z ;
   private String gxTv_SdtTTERMIN_Impcod_Z ;
   private String gxTv_SdtTTERMIN_Impdsc_Z ;
   private String gxTv_SdtTTERMIN_Termusu_Z ;
   private String gxTv_SdtTTERMIN_Impcod1_Z ;
   private String gxTv_SdtTTERMIN_Impcod2_Z ;
   private String gxTv_SdtTTERMIN_Impcod3_Z ;
   private String gxTv_SdtTTERMIN_Impcod4_Z ;
   private String gxTv_SdtTTERMIN_Impcod5_Z ;
   private String gxTv_SdtTTERMIN_Implpt1_Z ;
   private String gxTv_SdtTTERMIN_Implpt2_Z ;
   private String gxTv_SdtTTERMIN_Implpt3_Z ;
   private String gxTv_SdtTTERMIN_Implpt4_Z ;
   private String gxTv_SdtTTERMIN_Implpt5_Z ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTTERMIN_Termfec ;
   private java.util.Date gxTv_SdtTTERMIN_Termfec_Z ;
   private java.util.Date datetime_STZ ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtTTERMIN_Termlog1 ;
   private String gxTv_SdtTTERMIN_Termlog2 ;
   private String gxTv_SdtTTERMIN_Termlog1_Z ;
   private String gxTv_SdtTTERMIN_Termlog2_Z ;
}

