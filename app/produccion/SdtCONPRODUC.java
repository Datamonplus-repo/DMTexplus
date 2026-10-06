package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtCONPRODUC extends GxSilentTrnSdt
{
   public SdtCONPRODUC( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtCONPRODUC.class));
   }

   public SdtCONPRODUC( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle, context, "SdtCONPRODUC");
      initialize( remoteHandle) ;
   }

   public SdtCONPRODUC( int remoteHandle ,
                        StructSdtCONPRODUC struct )
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

   public void Load( long AV14297CP_ID )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {Long.valueOf(AV14297CP_ID)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"CP_ID", long.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Produccion\\CONPRODUC");
      metadata.set("BT", "TXPCONPRO");
      metadata.set("PK", "[ \"CP_ID\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_ID") )
            {
               gxTv_SdtCONPRODUC_Cp_id = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_EMPRCOD") )
            {
               gxTv_SdtCONPRODUC_Cp_emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_CLICOD") )
            {
               gxTv_SdtCONPRODUC_Cp_clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_CLINOM") )
            {
               gxTv_SdtCONPRODUC_Cp_clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARCOD") )
            {
               gxTv_SdtCONPRODUC_Cp_barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARCODREO") )
            {
               gxTv_SdtCONPRODUC_Cp_barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARCODPAR") )
            {
               gxTv_SdtCONPRODUC_Cp_barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARFECFPR") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtCONPRODUC_Cp_barfecfpr = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtCONPRODUC_Cp_barfecfpr = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARNUMCLI") )
            {
               gxTv_SdtCONPRODUC_Cp_barnumcli = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARPLF") )
            {
               gxTv_SdtCONPRODUC_Cp_barplf = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARSIT") )
            {
               gxTv_SdtCONPRODUC_Cp_barsit = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARFECCLI") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtCONPRODUC_Cp_barfeccli = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtCONPRODUC_Cp_barfeccli = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARFECSAL") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtCONPRODUC_Cp_barfecsal = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtCONPRODUC_Cp_barfecsal = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARFECGEN") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtCONPRODUC_Cp_barfecgen = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtCONPRODUC_Cp_barfecgen = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARSER") )
            {
               gxTv_SdtCONPRODUC_Cp_barser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARSERDSC") )
            {
               gxTv_SdtCONPRODUC_Cp_barserdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARCOLO") )
            {
               gxTv_SdtCONPRODUC_Cp_barcolo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARCOLU") )
            {
               gxTv_SdtCONPRODUC_Cp_barcolu = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARNOMCLI") )
            {
               gxTv_SdtCONPRODUC_Cp_barnomcli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARTIPART") )
            {
               gxTv_SdtCONPRODUC_Cp_bartipart = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_TARTDSC") )
            {
               gxTv_SdtCONPRODUC_Cp_tartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARGIRAR") )
            {
               gxTv_SdtCONPRODUC_Cp_bargirar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARACAANH") )
            {
               gxTv_SdtCONPRODUC_Cp_baracaanh = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARAGREST") )
            {
               gxTv_SdtCONPRODUC_Cp_baragrest = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BAREXT") )
            {
               gxTv_SdtCONPRODUC_Cp_barext = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_DISDES") )
            {
               gxTv_SdtCONPRODUC_Cp_disdes = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_DISCOD") )
            {
               gxTv_SdtCONPRODUC_Cp_discod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARPROPER") )
            {
               gxTv_SdtCONPRODUC_Cp_barproper = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_DSC_BAR") )
            {
               gxTv_SdtCONPRODUC_Cp_dsc_bar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARDISNUM") )
            {
               gxTv_SdtCONPRODUC_Cp_bardisnum = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARKGM") )
            {
               gxTv_SdtCONPRODUC_Cp_barkgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARMTR") )
            {
               gxTv_SdtCONPRODUC_Cp_barmtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARPIE") )
            {
               gxTv_SdtCONPRODUC_Cp_barpie = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARALBK") )
            {
               gxTv_SdtCONPRODUC_Cp_baralbk = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARALBM") )
            {
               gxTv_SdtCONPRODUC_Cp_baralbm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARENCCLI") )
            {
               gxTv_SdtCONPRODUC_Cp_barenccli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_DISUSRC") )
            {
               gxTv_SdtCONPRODUC_Cp_disusrc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARMAQCD") )
            {
               gxTv_SdtCONPRODUC_Cp_barmaqcd = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARESTR") )
            {
               gxTv_SdtCONPRODUC_Cp_barestr = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtCONPRODUC_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtCONPRODUC_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_ID_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_id_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_EMPRCOD_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_emprcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_CLICOD_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_clicod_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_CLINOM_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_clinom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARCOD_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_barcod_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARCODREO_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_barcodreo_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARCODPAR_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_barcodpar_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARFECFPR_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtCONPRODUC_Cp_barfecfpr_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtCONPRODUC_Cp_barfecfpr_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARNUMCLI_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_barnumcli_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARPLF_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_barplf_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARSIT_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_barsit_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARFECCLI_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtCONPRODUC_Cp_barfeccli_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtCONPRODUC_Cp_barfeccli_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARFECSAL_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtCONPRODUC_Cp_barfecsal_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtCONPRODUC_Cp_barfecsal_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARFECGEN_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtCONPRODUC_Cp_barfecgen_Z = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtCONPRODUC_Cp_barfecgen_Z = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARSER_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_barser_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARSERDSC_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_barserdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARCOLO_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_barcolo_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARCOLU_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_barcolu_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARNOMCLI_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_barnomcli_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARTIPART_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_bartipart_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_TARTDSC_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_tartdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARGIRAR_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_bargirar_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARACAANH_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_baracaanh_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARAGREST_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_baragrest_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BAREXT_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_barext_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_DISDES_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_disdes_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_DISCOD_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_discod_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARPROPER_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_barproper_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_DSC_BAR_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_dsc_bar_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARDISNUM_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_bardisnum_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARKGM_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_barkgm_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARMTR_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_barmtr_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARPIE_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_barpie_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARALBK_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_baralbk_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARALBM_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_baralbm_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARENCCLI_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_barenccli_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_DISUSRC_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_disusrc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARMAQCD_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_barmaqcd_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CP_BARESTR_Z") )
            {
               gxTv_SdtCONPRODUC_Cp_barestr_Z = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "CONPRODUC" ;
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
      oWriter.writeElement("CP_ID", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_EMPRCOD", gxTv_SdtCONPRODUC_Cp_emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_CLICOD", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_CLINOM", gxTv_SdtCONPRODUC_Cp_clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARCOD", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARCODREO", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARCODPAR", gxTv_SdtCONPRODUC_Cp_barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCONPRODUC_Cp_barfecfpr), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCONPRODUC_Cp_barfecfpr), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCONPRODUC_Cp_barfecfpr), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("CP_BARFECFPR", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARNUMCLI", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_barnumcli, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARPLF", gxTv_SdtCONPRODUC_Cp_barplf);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARSIT", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_barsit, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCONPRODUC_Cp_barfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCONPRODUC_Cp_barfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCONPRODUC_Cp_barfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("CP_BARFECCLI", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCONPRODUC_Cp_barfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCONPRODUC_Cp_barfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCONPRODUC_Cp_barfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("CP_BARFECSAL", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCONPRODUC_Cp_barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCONPRODUC_Cp_barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCONPRODUC_Cp_barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("CP_BARFECGEN", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARSER", gxTv_SdtCONPRODUC_Cp_barser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARSERDSC", gxTv_SdtCONPRODUC_Cp_barserdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARCOLO", gxTv_SdtCONPRODUC_Cp_barcolo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARCOLU", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_barcolu, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARNOMCLI", gxTv_SdtCONPRODUC_Cp_barnomcli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARTIPART", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_bartipart, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_TARTDSC", gxTv_SdtCONPRODUC_Cp_tartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARGIRAR", gxTv_SdtCONPRODUC_Cp_bargirar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARACAANH", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_baracaanh, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARAGREST", gxTv_SdtCONPRODUC_Cp_baragrest);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BAREXT", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_barext, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_DISDES", gxTv_SdtCONPRODUC_Cp_disdes);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_DISCOD", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_discod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARPROPER", gxTv_SdtCONPRODUC_Cp_barproper);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_DSC_BAR", gxTv_SdtCONPRODUC_Cp_dsc_bar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARDISNUM", gxTv_SdtCONPRODUC_Cp_bardisnum);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARKGM", GXutil.trim( GXutil.strNoRound( gxTv_SdtCONPRODUC_Cp_barkgm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARMTR", GXutil.trim( GXutil.strNoRound( gxTv_SdtCONPRODUC_Cp_barmtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARPIE", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_barpie, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARALBK", GXutil.trim( GXutil.strNoRound( gxTv_SdtCONPRODUC_Cp_baralbk, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARALBM", GXutil.trim( GXutil.strNoRound( gxTv_SdtCONPRODUC_Cp_baralbm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARENCCLI", gxTv_SdtCONPRODUC_Cp_barenccli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_DISUSRC", gxTv_SdtCONPRODUC_Cp_disusrc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARMAQCD", gxTv_SdtCONPRODUC_Cp_barmaqcd);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CP_BARESTR", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_barestr, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtCONPRODUC_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_id_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_EMPRCOD_Z", gxTv_SdtCONPRODUC_Cp_emprcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_CLICOD_Z", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_clicod_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_CLINOM_Z", gxTv_SdtCONPRODUC_Cp_clinom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARCOD_Z", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_barcod_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARCODREO_Z", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_barcodreo_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARCODPAR_Z", gxTv_SdtCONPRODUC_Cp_barcodpar_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCONPRODUC_Cp_barfecfpr_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCONPRODUC_Cp_barfecfpr_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCONPRODUC_Cp_barfecfpr_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("CP_BARFECFPR_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARNUMCLI_Z", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_barnumcli_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARPLF_Z", gxTv_SdtCONPRODUC_Cp_barplf_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARSIT_Z", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_barsit_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCONPRODUC_Cp_barfeccli_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCONPRODUC_Cp_barfeccli_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCONPRODUC_Cp_barfeccli_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("CP_BARFECCLI_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCONPRODUC_Cp_barfecsal_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCONPRODUC_Cp_barfecsal_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCONPRODUC_Cp_barfecsal_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("CP_BARFECSAL_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCONPRODUC_Cp_barfecgen_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCONPRODUC_Cp_barfecgen_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCONPRODUC_Cp_barfecgen_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("CP_BARFECGEN_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARSER_Z", gxTv_SdtCONPRODUC_Cp_barser_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARSERDSC_Z", gxTv_SdtCONPRODUC_Cp_barserdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARCOLO_Z", gxTv_SdtCONPRODUC_Cp_barcolo_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARCOLU_Z", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_barcolu_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARNOMCLI_Z", gxTv_SdtCONPRODUC_Cp_barnomcli_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARTIPART_Z", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_bartipart_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_TARTDSC_Z", gxTv_SdtCONPRODUC_Cp_tartdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARGIRAR_Z", gxTv_SdtCONPRODUC_Cp_bargirar_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARACAANH_Z", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_baracaanh_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARAGREST_Z", gxTv_SdtCONPRODUC_Cp_baragrest_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BAREXT_Z", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_barext_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_DISDES_Z", gxTv_SdtCONPRODUC_Cp_disdes_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_DISCOD_Z", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_discod_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARPROPER_Z", gxTv_SdtCONPRODUC_Cp_barproper_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_DSC_BAR_Z", gxTv_SdtCONPRODUC_Cp_dsc_bar_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARDISNUM_Z", gxTv_SdtCONPRODUC_Cp_bardisnum_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARKGM_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtCONPRODUC_Cp_barkgm_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARMTR_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtCONPRODUC_Cp_barmtr_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARPIE_Z", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_barpie_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARALBK_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtCONPRODUC_Cp_baralbk_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARALBM_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtCONPRODUC_Cp_baralbm_Z, 9, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARENCCLI_Z", gxTv_SdtCONPRODUC_Cp_barenccli_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_DISUSRC_Z", gxTv_SdtCONPRODUC_Cp_disusrc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARMAQCD_Z", gxTv_SdtCONPRODUC_Cp_barmaqcd_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CP_BARESTR_Z", GXutil.trim( GXutil.str( gxTv_SdtCONPRODUC_Cp_barestr_Z, 1, 0)));
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
      AddObjectProperty("CP_ID", gxTv_SdtCONPRODUC_Cp_id, false, includeNonInitialized);
      AddObjectProperty("CP_EMPRCOD", gxTv_SdtCONPRODUC_Cp_emprcod, false, includeNonInitialized);
      AddObjectProperty("CP_CLICOD", gxTv_SdtCONPRODUC_Cp_clicod, false, includeNonInitialized);
      AddObjectProperty("CP_CLINOM", gxTv_SdtCONPRODUC_Cp_clinom, false, includeNonInitialized);
      AddObjectProperty("CP_BARCOD", gxTv_SdtCONPRODUC_Cp_barcod, false, includeNonInitialized);
      AddObjectProperty("CP_BARCODREO", gxTv_SdtCONPRODUC_Cp_barcodreo, false, includeNonInitialized);
      AddObjectProperty("CP_BARCODPAR", gxTv_SdtCONPRODUC_Cp_barcodpar, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCONPRODUC_Cp_barfecfpr), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCONPRODUC_Cp_barfecfpr), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCONPRODUC_Cp_barfecfpr), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("CP_BARFECFPR", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("CP_BARNUMCLI", gxTv_SdtCONPRODUC_Cp_barnumcli, false, includeNonInitialized);
      AddObjectProperty("CP_BARPLF", gxTv_SdtCONPRODUC_Cp_barplf, false, includeNonInitialized);
      AddObjectProperty("CP_BARSIT", gxTv_SdtCONPRODUC_Cp_barsit, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCONPRODUC_Cp_barfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCONPRODUC_Cp_barfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCONPRODUC_Cp_barfeccli), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("CP_BARFECCLI", sDateCnv, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCONPRODUC_Cp_barfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCONPRODUC_Cp_barfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCONPRODUC_Cp_barfecsal), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("CP_BARFECSAL", sDateCnv, false, includeNonInitialized);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCONPRODUC_Cp_barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCONPRODUC_Cp_barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCONPRODUC_Cp_barfecgen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("CP_BARFECGEN", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("CP_BARSER", gxTv_SdtCONPRODUC_Cp_barser, false, includeNonInitialized);
      AddObjectProperty("CP_BARSERDSC", gxTv_SdtCONPRODUC_Cp_barserdsc, false, includeNonInitialized);
      AddObjectProperty("CP_BARCOLO", gxTv_SdtCONPRODUC_Cp_barcolo, false, includeNonInitialized);
      AddObjectProperty("CP_BARCOLU", gxTv_SdtCONPRODUC_Cp_barcolu, false, includeNonInitialized);
      AddObjectProperty("CP_BARNOMCLI", gxTv_SdtCONPRODUC_Cp_barnomcli, false, includeNonInitialized);
      AddObjectProperty("CP_BARTIPART", gxTv_SdtCONPRODUC_Cp_bartipart, false, includeNonInitialized);
      AddObjectProperty("CP_TARTDSC", gxTv_SdtCONPRODUC_Cp_tartdsc, false, includeNonInitialized);
      AddObjectProperty("CP_BARGIRAR", gxTv_SdtCONPRODUC_Cp_bargirar, false, includeNonInitialized);
      AddObjectProperty("CP_BARACAANH", gxTv_SdtCONPRODUC_Cp_baracaanh, false, includeNonInitialized);
      AddObjectProperty("CP_BARAGREST", gxTv_SdtCONPRODUC_Cp_baragrest, false, includeNonInitialized);
      AddObjectProperty("CP_BAREXT", gxTv_SdtCONPRODUC_Cp_barext, false, includeNonInitialized);
      AddObjectProperty("CP_DISDES", gxTv_SdtCONPRODUC_Cp_disdes, false, includeNonInitialized);
      AddObjectProperty("CP_DISCOD", gxTv_SdtCONPRODUC_Cp_discod, false, includeNonInitialized);
      AddObjectProperty("CP_BARPROPER", gxTv_SdtCONPRODUC_Cp_barproper, false, includeNonInitialized);
      AddObjectProperty("CP_DSC_BAR", gxTv_SdtCONPRODUC_Cp_dsc_bar, false, includeNonInitialized);
      AddObjectProperty("CP_BARDISNUM", gxTv_SdtCONPRODUC_Cp_bardisnum, false, includeNonInitialized);
      AddObjectProperty("CP_BARKGM", gxTv_SdtCONPRODUC_Cp_barkgm, false, includeNonInitialized);
      AddObjectProperty("CP_BARMTR", gxTv_SdtCONPRODUC_Cp_barmtr, false, includeNonInitialized);
      AddObjectProperty("CP_BARPIE", gxTv_SdtCONPRODUC_Cp_barpie, false, includeNonInitialized);
      AddObjectProperty("CP_BARALBK", gxTv_SdtCONPRODUC_Cp_baralbk, false, includeNonInitialized);
      AddObjectProperty("CP_BARALBM", gxTv_SdtCONPRODUC_Cp_baralbm, false, includeNonInitialized);
      AddObjectProperty("CP_BARENCCLI", gxTv_SdtCONPRODUC_Cp_barenccli, false, includeNonInitialized);
      AddObjectProperty("CP_DISUSRC", gxTv_SdtCONPRODUC_Cp_disusrc, false, includeNonInitialized);
      AddObjectProperty("CP_BARMAQCD", gxTv_SdtCONPRODUC_Cp_barmaqcd, false, includeNonInitialized);
      AddObjectProperty("CP_BARESTR", gxTv_SdtCONPRODUC_Cp_barestr, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtCONPRODUC_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtCONPRODUC_Initialized, false, includeNonInitialized);
         AddObjectProperty("CP_ID_Z", gxTv_SdtCONPRODUC_Cp_id_Z, false, includeNonInitialized);
         AddObjectProperty("CP_EMPRCOD_Z", gxTv_SdtCONPRODUC_Cp_emprcod_Z, false, includeNonInitialized);
         AddObjectProperty("CP_CLICOD_Z", gxTv_SdtCONPRODUC_Cp_clicod_Z, false, includeNonInitialized);
         AddObjectProperty("CP_CLINOM_Z", gxTv_SdtCONPRODUC_Cp_clinom_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARCOD_Z", gxTv_SdtCONPRODUC_Cp_barcod_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARCODREO_Z", gxTv_SdtCONPRODUC_Cp_barcodreo_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARCODPAR_Z", gxTv_SdtCONPRODUC_Cp_barcodpar_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCONPRODUC_Cp_barfecfpr_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCONPRODUC_Cp_barfecfpr_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCONPRODUC_Cp_barfecfpr_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("CP_BARFECFPR_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("CP_BARNUMCLI_Z", gxTv_SdtCONPRODUC_Cp_barnumcli_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARPLF_Z", gxTv_SdtCONPRODUC_Cp_barplf_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARSIT_Z", gxTv_SdtCONPRODUC_Cp_barsit_Z, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCONPRODUC_Cp_barfeccli_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCONPRODUC_Cp_barfeccli_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCONPRODUC_Cp_barfeccli_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("CP_BARFECCLI_Z", sDateCnv, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCONPRODUC_Cp_barfecsal_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCONPRODUC_Cp_barfecsal_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCONPRODUC_Cp_barfecsal_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("CP_BARFECSAL_Z", sDateCnv, false, includeNonInitialized);
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtCONPRODUC_Cp_barfecgen_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtCONPRODUC_Cp_barfecgen_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtCONPRODUC_Cp_barfecgen_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("CP_BARFECGEN_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("CP_BARSER_Z", gxTv_SdtCONPRODUC_Cp_barser_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARSERDSC_Z", gxTv_SdtCONPRODUC_Cp_barserdsc_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARCOLO_Z", gxTv_SdtCONPRODUC_Cp_barcolo_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARCOLU_Z", gxTv_SdtCONPRODUC_Cp_barcolu_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARNOMCLI_Z", gxTv_SdtCONPRODUC_Cp_barnomcli_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARTIPART_Z", gxTv_SdtCONPRODUC_Cp_bartipart_Z, false, includeNonInitialized);
         AddObjectProperty("CP_TARTDSC_Z", gxTv_SdtCONPRODUC_Cp_tartdsc_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARGIRAR_Z", gxTv_SdtCONPRODUC_Cp_bargirar_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARACAANH_Z", gxTv_SdtCONPRODUC_Cp_baracaanh_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARAGREST_Z", gxTv_SdtCONPRODUC_Cp_baragrest_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BAREXT_Z", gxTv_SdtCONPRODUC_Cp_barext_Z, false, includeNonInitialized);
         AddObjectProperty("CP_DISDES_Z", gxTv_SdtCONPRODUC_Cp_disdes_Z, false, includeNonInitialized);
         AddObjectProperty("CP_DISCOD_Z", gxTv_SdtCONPRODUC_Cp_discod_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARPROPER_Z", gxTv_SdtCONPRODUC_Cp_barproper_Z, false, includeNonInitialized);
         AddObjectProperty("CP_DSC_BAR_Z", gxTv_SdtCONPRODUC_Cp_dsc_bar_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARDISNUM_Z", gxTv_SdtCONPRODUC_Cp_bardisnum_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARKGM_Z", gxTv_SdtCONPRODUC_Cp_barkgm_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARMTR_Z", gxTv_SdtCONPRODUC_Cp_barmtr_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARPIE_Z", gxTv_SdtCONPRODUC_Cp_barpie_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARALBK_Z", gxTv_SdtCONPRODUC_Cp_baralbk_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARALBM_Z", gxTv_SdtCONPRODUC_Cp_baralbm_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARENCCLI_Z", gxTv_SdtCONPRODUC_Cp_barenccli_Z, false, includeNonInitialized);
         AddObjectProperty("CP_DISUSRC_Z", gxTv_SdtCONPRODUC_Cp_disusrc_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARMAQCD_Z", gxTv_SdtCONPRODUC_Cp_barmaqcd_Z, false, includeNonInitialized);
         AddObjectProperty("CP_BARESTR_Z", gxTv_SdtCONPRODUC_Cp_barestr_Z, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.produccion.SdtCONPRODUC sdt )
   {
      if ( sdt.IsDirty("CP_ID") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_id = sdt.getgxTv_SdtCONPRODUC_Cp_id() ;
      }
      if ( sdt.IsDirty("CP_EMPRCOD") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_emprcod = sdt.getgxTv_SdtCONPRODUC_Cp_emprcod() ;
      }
      if ( sdt.IsDirty("CP_CLICOD") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_clicod = sdt.getgxTv_SdtCONPRODUC_Cp_clicod() ;
      }
      if ( sdt.IsDirty("CP_CLINOM") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_clinom = sdt.getgxTv_SdtCONPRODUC_Cp_clinom() ;
      }
      if ( sdt.IsDirty("CP_BARCOD") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barcod = sdt.getgxTv_SdtCONPRODUC_Cp_barcod() ;
      }
      if ( sdt.IsDirty("CP_BARCODREO") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barcodreo = sdt.getgxTv_SdtCONPRODUC_Cp_barcodreo() ;
      }
      if ( sdt.IsDirty("CP_BARCODPAR") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barcodpar = sdt.getgxTv_SdtCONPRODUC_Cp_barcodpar() ;
      }
      if ( sdt.IsDirty("CP_BARFECFPR") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barfecfpr = sdt.getgxTv_SdtCONPRODUC_Cp_barfecfpr() ;
      }
      if ( sdt.IsDirty("CP_BARNUMCLI") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barnumcli = sdt.getgxTv_SdtCONPRODUC_Cp_barnumcli() ;
      }
      if ( sdt.IsDirty("CP_BARPLF") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barplf = sdt.getgxTv_SdtCONPRODUC_Cp_barplf() ;
      }
      if ( sdt.IsDirty("CP_BARSIT") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barsit = sdt.getgxTv_SdtCONPRODUC_Cp_barsit() ;
      }
      if ( sdt.IsDirty("CP_BARFECCLI") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barfeccli = sdt.getgxTv_SdtCONPRODUC_Cp_barfeccli() ;
      }
      if ( sdt.IsDirty("CP_BARFECSAL") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barfecsal = sdt.getgxTv_SdtCONPRODUC_Cp_barfecsal() ;
      }
      if ( sdt.IsDirty("CP_BARFECGEN") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barfecgen = sdt.getgxTv_SdtCONPRODUC_Cp_barfecgen() ;
      }
      if ( sdt.IsDirty("CP_BARSER") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barser = sdt.getgxTv_SdtCONPRODUC_Cp_barser() ;
      }
      if ( sdt.IsDirty("CP_BARSERDSC") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barserdsc = sdt.getgxTv_SdtCONPRODUC_Cp_barserdsc() ;
      }
      if ( sdt.IsDirty("CP_BARCOLO") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barcolo = sdt.getgxTv_SdtCONPRODUC_Cp_barcolo() ;
      }
      if ( sdt.IsDirty("CP_BARCOLU") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barcolu = sdt.getgxTv_SdtCONPRODUC_Cp_barcolu() ;
      }
      if ( sdt.IsDirty("CP_BARNOMCLI") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barnomcli = sdt.getgxTv_SdtCONPRODUC_Cp_barnomcli() ;
      }
      if ( sdt.IsDirty("CP_BARTIPART") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_bartipart = sdt.getgxTv_SdtCONPRODUC_Cp_bartipart() ;
      }
      if ( sdt.IsDirty("CP_TARTDSC") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_tartdsc = sdt.getgxTv_SdtCONPRODUC_Cp_tartdsc() ;
      }
      if ( sdt.IsDirty("CP_BARGIRAR") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_bargirar = sdt.getgxTv_SdtCONPRODUC_Cp_bargirar() ;
      }
      if ( sdt.IsDirty("CP_BARACAANH") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_baracaanh = sdt.getgxTv_SdtCONPRODUC_Cp_baracaanh() ;
      }
      if ( sdt.IsDirty("CP_BARAGREST") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_baragrest = sdt.getgxTv_SdtCONPRODUC_Cp_baragrest() ;
      }
      if ( sdt.IsDirty("CP_BAREXT") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barext = sdt.getgxTv_SdtCONPRODUC_Cp_barext() ;
      }
      if ( sdt.IsDirty("CP_DISDES") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_disdes = sdt.getgxTv_SdtCONPRODUC_Cp_disdes() ;
      }
      if ( sdt.IsDirty("CP_DISCOD") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_discod = sdt.getgxTv_SdtCONPRODUC_Cp_discod() ;
      }
      if ( sdt.IsDirty("CP_BARPROPER") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barproper = sdt.getgxTv_SdtCONPRODUC_Cp_barproper() ;
      }
      if ( sdt.IsDirty("CP_DSC_BAR") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_dsc_bar = sdt.getgxTv_SdtCONPRODUC_Cp_dsc_bar() ;
      }
      if ( sdt.IsDirty("CP_BARDISNUM") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_bardisnum = sdt.getgxTv_SdtCONPRODUC_Cp_bardisnum() ;
      }
      if ( sdt.IsDirty("CP_BARKGM") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barkgm = sdt.getgxTv_SdtCONPRODUC_Cp_barkgm() ;
      }
      if ( sdt.IsDirty("CP_BARMTR") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barmtr = sdt.getgxTv_SdtCONPRODUC_Cp_barmtr() ;
      }
      if ( sdt.IsDirty("CP_BARPIE") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barpie = sdt.getgxTv_SdtCONPRODUC_Cp_barpie() ;
      }
      if ( sdt.IsDirty("CP_BARALBK") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_baralbk = sdt.getgxTv_SdtCONPRODUC_Cp_baralbk() ;
      }
      if ( sdt.IsDirty("CP_BARALBM") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_baralbm = sdt.getgxTv_SdtCONPRODUC_Cp_baralbm() ;
      }
      if ( sdt.IsDirty("CP_BARENCCLI") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barenccli = sdt.getgxTv_SdtCONPRODUC_Cp_barenccli() ;
      }
      if ( sdt.IsDirty("CP_DISUSRC") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_disusrc = sdt.getgxTv_SdtCONPRODUC_Cp_disusrc() ;
      }
      if ( sdt.IsDirty("CP_BARMAQCD") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barmaqcd = sdt.getgxTv_SdtCONPRODUC_Cp_barmaqcd() ;
      }
      if ( sdt.IsDirty("CP_BARESTR") )
      {
         gxTv_SdtCONPRODUC_N = (byte)(0) ;
         gxTv_SdtCONPRODUC_Cp_barestr = sdt.getgxTv_SdtCONPRODUC_Cp_barestr() ;
      }
   }

   public long getgxTv_SdtCONPRODUC_Cp_id( )
   {
      return gxTv_SdtCONPRODUC_Cp_id ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_id( long value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      if ( gxTv_SdtCONPRODUC_Cp_id != value )
      {
         gxTv_SdtCONPRODUC_Mode = "INS" ;
         this.setgxTv_SdtCONPRODUC_Cp_id_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_emprcod_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_clicod_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_clinom_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barcod_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barcodreo_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barcodpar_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barfecfpr_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barnumcli_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barplf_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barsit_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barfeccli_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barfecsal_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barfecgen_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barser_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barserdsc_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barcolo_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barcolu_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barnomcli_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_bartipart_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_tartdsc_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_bargirar_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_baracaanh_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_baragrest_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barext_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_disdes_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_discod_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barproper_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_dsc_bar_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_bardisnum_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barkgm_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barmtr_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barpie_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_baralbk_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_baralbm_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barenccli_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_disusrc_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barmaqcd_Z_SetNull( );
         this.setgxTv_SdtCONPRODUC_Cp_barestr_Z_SetNull( );
      }
      SetDirty("Cp_id");
      gxTv_SdtCONPRODUC_Cp_id = value ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_emprcod( )
   {
      return gxTv_SdtCONPRODUC_Cp_emprcod ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_emprcod( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_emprcod");
      gxTv_SdtCONPRODUC_Cp_emprcod = value ;
   }

   public int getgxTv_SdtCONPRODUC_Cp_clicod( )
   {
      return gxTv_SdtCONPRODUC_Cp_clicod ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_clicod( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_clicod");
      gxTv_SdtCONPRODUC_Cp_clicod = value ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_clinom( )
   {
      return gxTv_SdtCONPRODUC_Cp_clinom ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_clinom( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_clinom");
      gxTv_SdtCONPRODUC_Cp_clinom = value ;
   }

   public int getgxTv_SdtCONPRODUC_Cp_barcod( )
   {
      return gxTv_SdtCONPRODUC_Cp_barcod ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barcod( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barcod");
      gxTv_SdtCONPRODUC_Cp_barcod = value ;
   }

   public byte getgxTv_SdtCONPRODUC_Cp_barcodreo( )
   {
      return gxTv_SdtCONPRODUC_Cp_barcodreo ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barcodreo( byte value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barcodreo");
      gxTv_SdtCONPRODUC_Cp_barcodreo = value ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_barcodpar( )
   {
      return gxTv_SdtCONPRODUC_Cp_barcodpar ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barcodpar( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barcodpar");
      gxTv_SdtCONPRODUC_Cp_barcodpar = value ;
   }

   public java.util.Date getgxTv_SdtCONPRODUC_Cp_barfecfpr( )
   {
      return gxTv_SdtCONPRODUC_Cp_barfecfpr ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barfecfpr( java.util.Date value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barfecfpr");
      gxTv_SdtCONPRODUC_Cp_barfecfpr = value ;
   }

   public int getgxTv_SdtCONPRODUC_Cp_barnumcli( )
   {
      return gxTv_SdtCONPRODUC_Cp_barnumcli ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barnumcli( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barnumcli");
      gxTv_SdtCONPRODUC_Cp_barnumcli = value ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_barplf( )
   {
      return gxTv_SdtCONPRODUC_Cp_barplf ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barplf( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barplf");
      gxTv_SdtCONPRODUC_Cp_barplf = value ;
   }

   public byte getgxTv_SdtCONPRODUC_Cp_barsit( )
   {
      return gxTv_SdtCONPRODUC_Cp_barsit ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barsit( byte value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barsit");
      gxTv_SdtCONPRODUC_Cp_barsit = value ;
   }

   public java.util.Date getgxTv_SdtCONPRODUC_Cp_barfeccli( )
   {
      return gxTv_SdtCONPRODUC_Cp_barfeccli ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barfeccli( java.util.Date value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barfeccli");
      gxTv_SdtCONPRODUC_Cp_barfeccli = value ;
   }

   public java.util.Date getgxTv_SdtCONPRODUC_Cp_barfecsal( )
   {
      return gxTv_SdtCONPRODUC_Cp_barfecsal ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barfecsal( java.util.Date value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barfecsal");
      gxTv_SdtCONPRODUC_Cp_barfecsal = value ;
   }

   public java.util.Date getgxTv_SdtCONPRODUC_Cp_barfecgen( )
   {
      return gxTv_SdtCONPRODUC_Cp_barfecgen ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barfecgen( java.util.Date value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barfecgen");
      gxTv_SdtCONPRODUC_Cp_barfecgen = value ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_barser( )
   {
      return gxTv_SdtCONPRODUC_Cp_barser ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barser( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barser");
      gxTv_SdtCONPRODUC_Cp_barser = value ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_barserdsc( )
   {
      return gxTv_SdtCONPRODUC_Cp_barserdsc ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barserdsc( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barserdsc");
      gxTv_SdtCONPRODUC_Cp_barserdsc = value ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_barcolo( )
   {
      return gxTv_SdtCONPRODUC_Cp_barcolo ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barcolo( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barcolo");
      gxTv_SdtCONPRODUC_Cp_barcolo = value ;
   }

   public int getgxTv_SdtCONPRODUC_Cp_barcolu( )
   {
      return gxTv_SdtCONPRODUC_Cp_barcolu ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barcolu( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barcolu");
      gxTv_SdtCONPRODUC_Cp_barcolu = value ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_barnomcli( )
   {
      return gxTv_SdtCONPRODUC_Cp_barnomcli ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barnomcli( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barnomcli");
      gxTv_SdtCONPRODUC_Cp_barnomcli = value ;
   }

   public short getgxTv_SdtCONPRODUC_Cp_bartipart( )
   {
      return gxTv_SdtCONPRODUC_Cp_bartipart ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_bartipart( short value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_bartipart");
      gxTv_SdtCONPRODUC_Cp_bartipart = value ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_tartdsc( )
   {
      return gxTv_SdtCONPRODUC_Cp_tartdsc ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_tartdsc( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_tartdsc");
      gxTv_SdtCONPRODUC_Cp_tartdsc = value ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_bargirar( )
   {
      return gxTv_SdtCONPRODUC_Cp_bargirar ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_bargirar( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_bargirar");
      gxTv_SdtCONPRODUC_Cp_bargirar = value ;
   }

   public short getgxTv_SdtCONPRODUC_Cp_baracaanh( )
   {
      return gxTv_SdtCONPRODUC_Cp_baracaanh ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_baracaanh( short value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_baracaanh");
      gxTv_SdtCONPRODUC_Cp_baracaanh = value ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_baragrest( )
   {
      return gxTv_SdtCONPRODUC_Cp_baragrest ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_baragrest( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_baragrest");
      gxTv_SdtCONPRODUC_Cp_baragrest = value ;
   }

   public byte getgxTv_SdtCONPRODUC_Cp_barext( )
   {
      return gxTv_SdtCONPRODUC_Cp_barext ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barext( byte value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barext");
      gxTv_SdtCONPRODUC_Cp_barext = value ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_disdes( )
   {
      return gxTv_SdtCONPRODUC_Cp_disdes ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_disdes( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_disdes");
      gxTv_SdtCONPRODUC_Cp_disdes = value ;
   }

   public int getgxTv_SdtCONPRODUC_Cp_discod( )
   {
      return gxTv_SdtCONPRODUC_Cp_discod ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_discod( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_discod");
      gxTv_SdtCONPRODUC_Cp_discod = value ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_barproper( )
   {
      return gxTv_SdtCONPRODUC_Cp_barproper ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barproper( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barproper");
      gxTv_SdtCONPRODUC_Cp_barproper = value ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_dsc_bar( )
   {
      return gxTv_SdtCONPRODUC_Cp_dsc_bar ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_dsc_bar( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_dsc_bar");
      gxTv_SdtCONPRODUC_Cp_dsc_bar = value ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_bardisnum( )
   {
      return gxTv_SdtCONPRODUC_Cp_bardisnum ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_bardisnum( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_bardisnum");
      gxTv_SdtCONPRODUC_Cp_bardisnum = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCONPRODUC_Cp_barkgm( )
   {
      return gxTv_SdtCONPRODUC_Cp_barkgm ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barkgm( java.math.BigDecimal value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barkgm");
      gxTv_SdtCONPRODUC_Cp_barkgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCONPRODUC_Cp_barmtr( )
   {
      return gxTv_SdtCONPRODUC_Cp_barmtr ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barmtr( java.math.BigDecimal value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barmtr");
      gxTv_SdtCONPRODUC_Cp_barmtr = value ;
   }

   public int getgxTv_SdtCONPRODUC_Cp_barpie( )
   {
      return gxTv_SdtCONPRODUC_Cp_barpie ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barpie( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barpie");
      gxTv_SdtCONPRODUC_Cp_barpie = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCONPRODUC_Cp_baralbk( )
   {
      return gxTv_SdtCONPRODUC_Cp_baralbk ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_baralbk( java.math.BigDecimal value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_baralbk");
      gxTv_SdtCONPRODUC_Cp_baralbk = value ;
   }

   public java.math.BigDecimal getgxTv_SdtCONPRODUC_Cp_baralbm( )
   {
      return gxTv_SdtCONPRODUC_Cp_baralbm ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_baralbm( java.math.BigDecimal value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_baralbm");
      gxTv_SdtCONPRODUC_Cp_baralbm = value ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_barenccli( )
   {
      return gxTv_SdtCONPRODUC_Cp_barenccli ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barenccli( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barenccli");
      gxTv_SdtCONPRODUC_Cp_barenccli = value ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_disusrc( )
   {
      return gxTv_SdtCONPRODUC_Cp_disusrc ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_disusrc( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_disusrc");
      gxTv_SdtCONPRODUC_Cp_disusrc = value ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_barmaqcd( )
   {
      return gxTv_SdtCONPRODUC_Cp_barmaqcd ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barmaqcd( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barmaqcd");
      gxTv_SdtCONPRODUC_Cp_barmaqcd = value ;
   }

   public byte getgxTv_SdtCONPRODUC_Cp_barestr( )
   {
      return gxTv_SdtCONPRODUC_Cp_barestr ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barestr( byte value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barestr");
      gxTv_SdtCONPRODUC_Cp_barestr = value ;
   }

   public String getgxTv_SdtCONPRODUC_Mode( )
   {
      return gxTv_SdtCONPRODUC_Mode ;
   }

   public void setgxTv_SdtCONPRODUC_Mode( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtCONPRODUC_Mode = value ;
   }

   public void setgxTv_SdtCONPRODUC_Mode_SetNull( )
   {
      gxTv_SdtCONPRODUC_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtCONPRODUC_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtCONPRODUC_Initialized( )
   {
      return gxTv_SdtCONPRODUC_Initialized ;
   }

   public void setgxTv_SdtCONPRODUC_Initialized( short value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtCONPRODUC_Initialized = value ;
   }

   public void setgxTv_SdtCONPRODUC_Initialized_SetNull( )
   {
      gxTv_SdtCONPRODUC_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtCONPRODUC_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtCONPRODUC_Cp_id_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_id_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_id_Z( long value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_id_Z");
      gxTv_SdtCONPRODUC_Cp_id_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_id_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_id_Z = 0 ;
      SetDirty("Cp_id_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_emprcod_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_emprcod_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_emprcod_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_emprcod_Z");
      gxTv_SdtCONPRODUC_Cp_emprcod_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_emprcod_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_emprcod_Z = "" ;
      SetDirty("Cp_emprcod_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_emprcod_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtCONPRODUC_Cp_clicod_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_clicod_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_clicod_Z( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_clicod_Z");
      gxTv_SdtCONPRODUC_Cp_clicod_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_clicod_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_clicod_Z = 0 ;
      SetDirty("Cp_clicod_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_clicod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_clinom_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_clinom_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_clinom_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_clinom_Z");
      gxTv_SdtCONPRODUC_Cp_clinom_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_clinom_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_clinom_Z = "" ;
      SetDirty("Cp_clinom_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_clinom_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtCONPRODUC_Cp_barcod_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barcod_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barcod_Z( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barcod_Z");
      gxTv_SdtCONPRODUC_Cp_barcod_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barcod_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barcod_Z = 0 ;
      SetDirty("Cp_barcod_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barcod_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCONPRODUC_Cp_barcodreo_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barcodreo_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barcodreo_Z( byte value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barcodreo_Z");
      gxTv_SdtCONPRODUC_Cp_barcodreo_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barcodreo_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barcodreo_Z = (byte)(0) ;
      SetDirty("Cp_barcodreo_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barcodreo_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_barcodpar_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barcodpar_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barcodpar_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barcodpar_Z");
      gxTv_SdtCONPRODUC_Cp_barcodpar_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barcodpar_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barcodpar_Z = "" ;
      SetDirty("Cp_barcodpar_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barcodpar_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtCONPRODUC_Cp_barfecfpr_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barfecfpr_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barfecfpr_Z( java.util.Date value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barfecfpr_Z");
      gxTv_SdtCONPRODUC_Cp_barfecfpr_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barfecfpr_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barfecfpr_Z = GXutil.nullDate() ;
      SetDirty("Cp_barfecfpr_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barfecfpr_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtCONPRODUC_Cp_barnumcli_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barnumcli_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barnumcli_Z( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barnumcli_Z");
      gxTv_SdtCONPRODUC_Cp_barnumcli_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barnumcli_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barnumcli_Z = 0 ;
      SetDirty("Cp_barnumcli_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barnumcli_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_barplf_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barplf_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barplf_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barplf_Z");
      gxTv_SdtCONPRODUC_Cp_barplf_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barplf_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barplf_Z = "" ;
      SetDirty("Cp_barplf_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barplf_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCONPRODUC_Cp_barsit_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barsit_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barsit_Z( byte value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barsit_Z");
      gxTv_SdtCONPRODUC_Cp_barsit_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barsit_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barsit_Z = (byte)(0) ;
      SetDirty("Cp_barsit_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barsit_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtCONPRODUC_Cp_barfeccli_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barfeccli_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barfeccli_Z( java.util.Date value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barfeccli_Z");
      gxTv_SdtCONPRODUC_Cp_barfeccli_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barfeccli_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barfeccli_Z = GXutil.nullDate() ;
      SetDirty("Cp_barfeccli_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barfeccli_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtCONPRODUC_Cp_barfecsal_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barfecsal_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barfecsal_Z( java.util.Date value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barfecsal_Z");
      gxTv_SdtCONPRODUC_Cp_barfecsal_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barfecsal_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barfecsal_Z = GXutil.nullDate() ;
      SetDirty("Cp_barfecsal_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barfecsal_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtCONPRODUC_Cp_barfecgen_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barfecgen_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barfecgen_Z( java.util.Date value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barfecgen_Z");
      gxTv_SdtCONPRODUC_Cp_barfecgen_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barfecgen_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barfecgen_Z = GXutil.nullDate() ;
      SetDirty("Cp_barfecgen_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barfecgen_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_barser_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barser_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barser_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barser_Z");
      gxTv_SdtCONPRODUC_Cp_barser_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barser_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barser_Z = "" ;
      SetDirty("Cp_barser_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barser_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_barserdsc_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barserdsc_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barserdsc_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barserdsc_Z");
      gxTv_SdtCONPRODUC_Cp_barserdsc_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barserdsc_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barserdsc_Z = "" ;
      SetDirty("Cp_barserdsc_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barserdsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_barcolo_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barcolo_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barcolo_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barcolo_Z");
      gxTv_SdtCONPRODUC_Cp_barcolo_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barcolo_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barcolo_Z = "" ;
      SetDirty("Cp_barcolo_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barcolo_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtCONPRODUC_Cp_barcolu_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barcolu_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barcolu_Z( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barcolu_Z");
      gxTv_SdtCONPRODUC_Cp_barcolu_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barcolu_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barcolu_Z = 0 ;
      SetDirty("Cp_barcolu_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barcolu_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_barnomcli_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barnomcli_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barnomcli_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barnomcli_Z");
      gxTv_SdtCONPRODUC_Cp_barnomcli_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barnomcli_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barnomcli_Z = "" ;
      SetDirty("Cp_barnomcli_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barnomcli_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtCONPRODUC_Cp_bartipart_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_bartipart_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_bartipart_Z( short value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_bartipart_Z");
      gxTv_SdtCONPRODUC_Cp_bartipart_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_bartipart_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_bartipart_Z = (short)(0) ;
      SetDirty("Cp_bartipart_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_bartipart_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_tartdsc_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_tartdsc_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_tartdsc_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_tartdsc_Z");
      gxTv_SdtCONPRODUC_Cp_tartdsc_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_tartdsc_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_tartdsc_Z = "" ;
      SetDirty("Cp_tartdsc_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_tartdsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_bargirar_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_bargirar_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_bargirar_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_bargirar_Z");
      gxTv_SdtCONPRODUC_Cp_bargirar_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_bargirar_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_bargirar_Z = "" ;
      SetDirty("Cp_bargirar_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_bargirar_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtCONPRODUC_Cp_baracaanh_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_baracaanh_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_baracaanh_Z( short value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_baracaanh_Z");
      gxTv_SdtCONPRODUC_Cp_baracaanh_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_baracaanh_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_baracaanh_Z = (short)(0) ;
      SetDirty("Cp_baracaanh_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_baracaanh_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_baragrest_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_baragrest_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_baragrest_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_baragrest_Z");
      gxTv_SdtCONPRODUC_Cp_baragrest_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_baragrest_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_baragrest_Z = "" ;
      SetDirty("Cp_baragrest_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_baragrest_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCONPRODUC_Cp_barext_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barext_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barext_Z( byte value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barext_Z");
      gxTv_SdtCONPRODUC_Cp_barext_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barext_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barext_Z = (byte)(0) ;
      SetDirty("Cp_barext_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barext_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_disdes_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_disdes_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_disdes_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_disdes_Z");
      gxTv_SdtCONPRODUC_Cp_disdes_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_disdes_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_disdes_Z = "" ;
      SetDirty("Cp_disdes_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_disdes_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtCONPRODUC_Cp_discod_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_discod_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_discod_Z( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_discod_Z");
      gxTv_SdtCONPRODUC_Cp_discod_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_discod_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_discod_Z = 0 ;
      SetDirty("Cp_discod_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_discod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_barproper_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barproper_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barproper_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barproper_Z");
      gxTv_SdtCONPRODUC_Cp_barproper_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barproper_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barproper_Z = "" ;
      SetDirty("Cp_barproper_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barproper_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_dsc_bar_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_dsc_bar_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_dsc_bar_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_dsc_bar_Z");
      gxTv_SdtCONPRODUC_Cp_dsc_bar_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_dsc_bar_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_dsc_bar_Z = "" ;
      SetDirty("Cp_dsc_bar_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_dsc_bar_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_bardisnum_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_bardisnum_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_bardisnum_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_bardisnum_Z");
      gxTv_SdtCONPRODUC_Cp_bardisnum_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_bardisnum_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_bardisnum_Z = "" ;
      SetDirty("Cp_bardisnum_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_bardisnum_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtCONPRODUC_Cp_barkgm_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barkgm_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barkgm_Z( java.math.BigDecimal value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barkgm_Z");
      gxTv_SdtCONPRODUC_Cp_barkgm_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barkgm_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barkgm_Z = DecimalUtil.ZERO ;
      SetDirty("Cp_barkgm_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barkgm_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtCONPRODUC_Cp_barmtr_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barmtr_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barmtr_Z( java.math.BigDecimal value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barmtr_Z");
      gxTv_SdtCONPRODUC_Cp_barmtr_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barmtr_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barmtr_Z = DecimalUtil.ZERO ;
      SetDirty("Cp_barmtr_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barmtr_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtCONPRODUC_Cp_barpie_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barpie_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barpie_Z( int value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barpie_Z");
      gxTv_SdtCONPRODUC_Cp_barpie_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barpie_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barpie_Z = 0 ;
      SetDirty("Cp_barpie_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barpie_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtCONPRODUC_Cp_baralbk_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_baralbk_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_baralbk_Z( java.math.BigDecimal value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_baralbk_Z");
      gxTv_SdtCONPRODUC_Cp_baralbk_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_baralbk_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_baralbk_Z = DecimalUtil.ZERO ;
      SetDirty("Cp_baralbk_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_baralbk_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtCONPRODUC_Cp_baralbm_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_baralbm_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_baralbm_Z( java.math.BigDecimal value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_baralbm_Z");
      gxTv_SdtCONPRODUC_Cp_baralbm_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_baralbm_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_baralbm_Z = DecimalUtil.ZERO ;
      SetDirty("Cp_baralbm_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_baralbm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_barenccli_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barenccli_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barenccli_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barenccli_Z");
      gxTv_SdtCONPRODUC_Cp_barenccli_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barenccli_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barenccli_Z = "" ;
      SetDirty("Cp_barenccli_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barenccli_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_disusrc_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_disusrc_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_disusrc_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_disusrc_Z");
      gxTv_SdtCONPRODUC_Cp_disusrc_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_disusrc_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_disusrc_Z = "" ;
      SetDirty("Cp_disusrc_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_disusrc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtCONPRODUC_Cp_barmaqcd_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barmaqcd_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barmaqcd_Z( String value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barmaqcd_Z");
      gxTv_SdtCONPRODUC_Cp_barmaqcd_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barmaqcd_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barmaqcd_Z = "" ;
      SetDirty("Cp_barmaqcd_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barmaqcd_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtCONPRODUC_Cp_barestr_Z( )
   {
      return gxTv_SdtCONPRODUC_Cp_barestr_Z ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barestr_Z( byte value )
   {
      gxTv_SdtCONPRODUC_N = (byte)(0) ;
      SetDirty("Cp_barestr_Z");
      gxTv_SdtCONPRODUC_Cp_barestr_Z = value ;
   }

   public void setgxTv_SdtCONPRODUC_Cp_barestr_Z_SetNull( )
   {
      gxTv_SdtCONPRODUC_Cp_barestr_Z = (byte)(0) ;
      SetDirty("Cp_barestr_Z");
   }

   public boolean getgxTv_SdtCONPRODUC_Cp_barestr_Z_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.produccion.conproduc_bc obj;
      obj = new app.produccion.conproduc_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtCONPRODUC_N = (byte)(1) ;
      gxTv_SdtCONPRODUC_Cp_emprcod = "" ;
      gxTv_SdtCONPRODUC_Cp_clinom = "" ;
      gxTv_SdtCONPRODUC_Cp_barcodpar = "" ;
      gxTv_SdtCONPRODUC_Cp_barfecfpr = GXutil.nullDate() ;
      gxTv_SdtCONPRODUC_Cp_barplf = "" ;
      gxTv_SdtCONPRODUC_Cp_barfeccli = GXutil.nullDate() ;
      gxTv_SdtCONPRODUC_Cp_barfecsal = GXutil.nullDate() ;
      gxTv_SdtCONPRODUC_Cp_barfecgen = GXutil.nullDate() ;
      gxTv_SdtCONPRODUC_Cp_barser = "" ;
      gxTv_SdtCONPRODUC_Cp_barserdsc = "" ;
      gxTv_SdtCONPRODUC_Cp_barcolo = "" ;
      gxTv_SdtCONPRODUC_Cp_barnomcli = "" ;
      gxTv_SdtCONPRODUC_Cp_tartdsc = "" ;
      gxTv_SdtCONPRODUC_Cp_bargirar = "" ;
      gxTv_SdtCONPRODUC_Cp_baragrest = "" ;
      gxTv_SdtCONPRODUC_Cp_disdes = "" ;
      gxTv_SdtCONPRODUC_Cp_barproper = "" ;
      gxTv_SdtCONPRODUC_Cp_dsc_bar = "" ;
      gxTv_SdtCONPRODUC_Cp_bardisnum = "" ;
      gxTv_SdtCONPRODUC_Cp_barkgm = DecimalUtil.ZERO ;
      gxTv_SdtCONPRODUC_Cp_barmtr = DecimalUtil.ZERO ;
      gxTv_SdtCONPRODUC_Cp_baralbk = DecimalUtil.ZERO ;
      gxTv_SdtCONPRODUC_Cp_baralbm = DecimalUtil.ZERO ;
      gxTv_SdtCONPRODUC_Cp_barenccli = "" ;
      gxTv_SdtCONPRODUC_Cp_disusrc = "" ;
      gxTv_SdtCONPRODUC_Cp_barmaqcd = "" ;
      gxTv_SdtCONPRODUC_Mode = "" ;
      gxTv_SdtCONPRODUC_Cp_emprcod_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_clinom_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_barcodpar_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_barfecfpr_Z = GXutil.nullDate() ;
      gxTv_SdtCONPRODUC_Cp_barplf_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_barfeccli_Z = GXutil.nullDate() ;
      gxTv_SdtCONPRODUC_Cp_barfecsal_Z = GXutil.nullDate() ;
      gxTv_SdtCONPRODUC_Cp_barfecgen_Z = GXutil.nullDate() ;
      gxTv_SdtCONPRODUC_Cp_barser_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_barserdsc_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_barcolo_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_barnomcli_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_tartdsc_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_bargirar_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_baragrest_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_disdes_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_barproper_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_dsc_bar_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_bardisnum_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_barkgm_Z = DecimalUtil.ZERO ;
      gxTv_SdtCONPRODUC_Cp_barmtr_Z = DecimalUtil.ZERO ;
      gxTv_SdtCONPRODUC_Cp_baralbk_Z = DecimalUtil.ZERO ;
      gxTv_SdtCONPRODUC_Cp_baralbm_Z = DecimalUtil.ZERO ;
      gxTv_SdtCONPRODUC_Cp_barenccli_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_disusrc_Z = "" ;
      gxTv_SdtCONPRODUC_Cp_barmaqcd_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtCONPRODUC_N ;
   }

   public app.produccion.SdtCONPRODUC Clone( )
   {
      app.produccion.SdtCONPRODUC sdt;
      app.produccion.conproduc_bc obj;
      sdt = (app.produccion.SdtCONPRODUC)(clone()) ;
      obj = (app.produccion.conproduc_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.produccion.StructSdtCONPRODUC struct )
   {
      setgxTv_SdtCONPRODUC_Cp_id(struct.getCp_id());
      setgxTv_SdtCONPRODUC_Cp_emprcod(struct.getCp_emprcod());
      setgxTv_SdtCONPRODUC_Cp_clicod(struct.getCp_clicod());
      setgxTv_SdtCONPRODUC_Cp_clinom(struct.getCp_clinom());
      setgxTv_SdtCONPRODUC_Cp_barcod(struct.getCp_barcod());
      setgxTv_SdtCONPRODUC_Cp_barcodreo(struct.getCp_barcodreo());
      setgxTv_SdtCONPRODUC_Cp_barcodpar(struct.getCp_barcodpar());
      setgxTv_SdtCONPRODUC_Cp_barfecfpr(struct.getCp_barfecfpr());
      setgxTv_SdtCONPRODUC_Cp_barnumcli(struct.getCp_barnumcli());
      setgxTv_SdtCONPRODUC_Cp_barplf(struct.getCp_barplf());
      setgxTv_SdtCONPRODUC_Cp_barsit(struct.getCp_barsit());
      setgxTv_SdtCONPRODUC_Cp_barfeccli(struct.getCp_barfeccli());
      setgxTv_SdtCONPRODUC_Cp_barfecsal(struct.getCp_barfecsal());
      setgxTv_SdtCONPRODUC_Cp_barfecgen(struct.getCp_barfecgen());
      setgxTv_SdtCONPRODUC_Cp_barser(struct.getCp_barser());
      setgxTv_SdtCONPRODUC_Cp_barserdsc(struct.getCp_barserdsc());
      setgxTv_SdtCONPRODUC_Cp_barcolo(struct.getCp_barcolo());
      setgxTv_SdtCONPRODUC_Cp_barcolu(struct.getCp_barcolu());
      setgxTv_SdtCONPRODUC_Cp_barnomcli(struct.getCp_barnomcli());
      setgxTv_SdtCONPRODUC_Cp_bartipart(struct.getCp_bartipart());
      setgxTv_SdtCONPRODUC_Cp_tartdsc(struct.getCp_tartdsc());
      setgxTv_SdtCONPRODUC_Cp_bargirar(struct.getCp_bargirar());
      setgxTv_SdtCONPRODUC_Cp_baracaanh(struct.getCp_baracaanh());
      setgxTv_SdtCONPRODUC_Cp_baragrest(struct.getCp_baragrest());
      setgxTv_SdtCONPRODUC_Cp_barext(struct.getCp_barext());
      setgxTv_SdtCONPRODUC_Cp_disdes(struct.getCp_disdes());
      setgxTv_SdtCONPRODUC_Cp_discod(struct.getCp_discod());
      setgxTv_SdtCONPRODUC_Cp_barproper(struct.getCp_barproper());
      setgxTv_SdtCONPRODUC_Cp_dsc_bar(struct.getCp_dsc_bar());
      setgxTv_SdtCONPRODUC_Cp_bardisnum(struct.getCp_bardisnum());
      setgxTv_SdtCONPRODUC_Cp_barkgm(struct.getCp_barkgm());
      setgxTv_SdtCONPRODUC_Cp_barmtr(struct.getCp_barmtr());
      setgxTv_SdtCONPRODUC_Cp_barpie(struct.getCp_barpie());
      setgxTv_SdtCONPRODUC_Cp_baralbk(struct.getCp_baralbk());
      setgxTv_SdtCONPRODUC_Cp_baralbm(struct.getCp_baralbm());
      setgxTv_SdtCONPRODUC_Cp_barenccli(struct.getCp_barenccli());
      setgxTv_SdtCONPRODUC_Cp_disusrc(struct.getCp_disusrc());
      setgxTv_SdtCONPRODUC_Cp_barmaqcd(struct.getCp_barmaqcd());
      setgxTv_SdtCONPRODUC_Cp_barestr(struct.getCp_barestr());
      setgxTv_SdtCONPRODUC_Mode(struct.getMode());
      setgxTv_SdtCONPRODUC_Initialized(struct.getInitialized());
      setgxTv_SdtCONPRODUC_Cp_id_Z(struct.getCp_id_Z());
      setgxTv_SdtCONPRODUC_Cp_emprcod_Z(struct.getCp_emprcod_Z());
      setgxTv_SdtCONPRODUC_Cp_clicod_Z(struct.getCp_clicod_Z());
      setgxTv_SdtCONPRODUC_Cp_clinom_Z(struct.getCp_clinom_Z());
      setgxTv_SdtCONPRODUC_Cp_barcod_Z(struct.getCp_barcod_Z());
      setgxTv_SdtCONPRODUC_Cp_barcodreo_Z(struct.getCp_barcodreo_Z());
      setgxTv_SdtCONPRODUC_Cp_barcodpar_Z(struct.getCp_barcodpar_Z());
      setgxTv_SdtCONPRODUC_Cp_barfecfpr_Z(struct.getCp_barfecfpr_Z());
      setgxTv_SdtCONPRODUC_Cp_barnumcli_Z(struct.getCp_barnumcli_Z());
      setgxTv_SdtCONPRODUC_Cp_barplf_Z(struct.getCp_barplf_Z());
      setgxTv_SdtCONPRODUC_Cp_barsit_Z(struct.getCp_barsit_Z());
      setgxTv_SdtCONPRODUC_Cp_barfeccli_Z(struct.getCp_barfeccli_Z());
      setgxTv_SdtCONPRODUC_Cp_barfecsal_Z(struct.getCp_barfecsal_Z());
      setgxTv_SdtCONPRODUC_Cp_barfecgen_Z(struct.getCp_barfecgen_Z());
      setgxTv_SdtCONPRODUC_Cp_barser_Z(struct.getCp_barser_Z());
      setgxTv_SdtCONPRODUC_Cp_barserdsc_Z(struct.getCp_barserdsc_Z());
      setgxTv_SdtCONPRODUC_Cp_barcolo_Z(struct.getCp_barcolo_Z());
      setgxTv_SdtCONPRODUC_Cp_barcolu_Z(struct.getCp_barcolu_Z());
      setgxTv_SdtCONPRODUC_Cp_barnomcli_Z(struct.getCp_barnomcli_Z());
      setgxTv_SdtCONPRODUC_Cp_bartipart_Z(struct.getCp_bartipart_Z());
      setgxTv_SdtCONPRODUC_Cp_tartdsc_Z(struct.getCp_tartdsc_Z());
      setgxTv_SdtCONPRODUC_Cp_bargirar_Z(struct.getCp_bargirar_Z());
      setgxTv_SdtCONPRODUC_Cp_baracaanh_Z(struct.getCp_baracaanh_Z());
      setgxTv_SdtCONPRODUC_Cp_baragrest_Z(struct.getCp_baragrest_Z());
      setgxTv_SdtCONPRODUC_Cp_barext_Z(struct.getCp_barext_Z());
      setgxTv_SdtCONPRODUC_Cp_disdes_Z(struct.getCp_disdes_Z());
      setgxTv_SdtCONPRODUC_Cp_discod_Z(struct.getCp_discod_Z());
      setgxTv_SdtCONPRODUC_Cp_barproper_Z(struct.getCp_barproper_Z());
      setgxTv_SdtCONPRODUC_Cp_dsc_bar_Z(struct.getCp_dsc_bar_Z());
      setgxTv_SdtCONPRODUC_Cp_bardisnum_Z(struct.getCp_bardisnum_Z());
      setgxTv_SdtCONPRODUC_Cp_barkgm_Z(struct.getCp_barkgm_Z());
      setgxTv_SdtCONPRODUC_Cp_barmtr_Z(struct.getCp_barmtr_Z());
      setgxTv_SdtCONPRODUC_Cp_barpie_Z(struct.getCp_barpie_Z());
      setgxTv_SdtCONPRODUC_Cp_baralbk_Z(struct.getCp_baralbk_Z());
      setgxTv_SdtCONPRODUC_Cp_baralbm_Z(struct.getCp_baralbm_Z());
      setgxTv_SdtCONPRODUC_Cp_barenccli_Z(struct.getCp_barenccli_Z());
      setgxTv_SdtCONPRODUC_Cp_disusrc_Z(struct.getCp_disusrc_Z());
      setgxTv_SdtCONPRODUC_Cp_barmaqcd_Z(struct.getCp_barmaqcd_Z());
      setgxTv_SdtCONPRODUC_Cp_barestr_Z(struct.getCp_barestr_Z());
   }

   @SuppressWarnings("unchecked")
   public app.produccion.StructSdtCONPRODUC getStruct( )
   {
      app.produccion.StructSdtCONPRODUC struct = new app.produccion.StructSdtCONPRODUC ();
      struct.setCp_id(getgxTv_SdtCONPRODUC_Cp_id());
      struct.setCp_emprcod(getgxTv_SdtCONPRODUC_Cp_emprcod());
      struct.setCp_clicod(getgxTv_SdtCONPRODUC_Cp_clicod());
      struct.setCp_clinom(getgxTv_SdtCONPRODUC_Cp_clinom());
      struct.setCp_barcod(getgxTv_SdtCONPRODUC_Cp_barcod());
      struct.setCp_barcodreo(getgxTv_SdtCONPRODUC_Cp_barcodreo());
      struct.setCp_barcodpar(getgxTv_SdtCONPRODUC_Cp_barcodpar());
      struct.setCp_barfecfpr(getgxTv_SdtCONPRODUC_Cp_barfecfpr());
      struct.setCp_barnumcli(getgxTv_SdtCONPRODUC_Cp_barnumcli());
      struct.setCp_barplf(getgxTv_SdtCONPRODUC_Cp_barplf());
      struct.setCp_barsit(getgxTv_SdtCONPRODUC_Cp_barsit());
      struct.setCp_barfeccli(getgxTv_SdtCONPRODUC_Cp_barfeccli());
      struct.setCp_barfecsal(getgxTv_SdtCONPRODUC_Cp_barfecsal());
      struct.setCp_barfecgen(getgxTv_SdtCONPRODUC_Cp_barfecgen());
      struct.setCp_barser(getgxTv_SdtCONPRODUC_Cp_barser());
      struct.setCp_barserdsc(getgxTv_SdtCONPRODUC_Cp_barserdsc());
      struct.setCp_barcolo(getgxTv_SdtCONPRODUC_Cp_barcolo());
      struct.setCp_barcolu(getgxTv_SdtCONPRODUC_Cp_barcolu());
      struct.setCp_barnomcli(getgxTv_SdtCONPRODUC_Cp_barnomcli());
      struct.setCp_bartipart(getgxTv_SdtCONPRODUC_Cp_bartipart());
      struct.setCp_tartdsc(getgxTv_SdtCONPRODUC_Cp_tartdsc());
      struct.setCp_bargirar(getgxTv_SdtCONPRODUC_Cp_bargirar());
      struct.setCp_baracaanh(getgxTv_SdtCONPRODUC_Cp_baracaanh());
      struct.setCp_baragrest(getgxTv_SdtCONPRODUC_Cp_baragrest());
      struct.setCp_barext(getgxTv_SdtCONPRODUC_Cp_barext());
      struct.setCp_disdes(getgxTv_SdtCONPRODUC_Cp_disdes());
      struct.setCp_discod(getgxTv_SdtCONPRODUC_Cp_discod());
      struct.setCp_barproper(getgxTv_SdtCONPRODUC_Cp_barproper());
      struct.setCp_dsc_bar(getgxTv_SdtCONPRODUC_Cp_dsc_bar());
      struct.setCp_bardisnum(getgxTv_SdtCONPRODUC_Cp_bardisnum());
      struct.setCp_barkgm(getgxTv_SdtCONPRODUC_Cp_barkgm());
      struct.setCp_barmtr(getgxTv_SdtCONPRODUC_Cp_barmtr());
      struct.setCp_barpie(getgxTv_SdtCONPRODUC_Cp_barpie());
      struct.setCp_baralbk(getgxTv_SdtCONPRODUC_Cp_baralbk());
      struct.setCp_baralbm(getgxTv_SdtCONPRODUC_Cp_baralbm());
      struct.setCp_barenccli(getgxTv_SdtCONPRODUC_Cp_barenccli());
      struct.setCp_disusrc(getgxTv_SdtCONPRODUC_Cp_disusrc());
      struct.setCp_barmaqcd(getgxTv_SdtCONPRODUC_Cp_barmaqcd());
      struct.setCp_barestr(getgxTv_SdtCONPRODUC_Cp_barestr());
      struct.setMode(getgxTv_SdtCONPRODUC_Mode());
      struct.setInitialized(getgxTv_SdtCONPRODUC_Initialized());
      struct.setCp_id_Z(getgxTv_SdtCONPRODUC_Cp_id_Z());
      struct.setCp_emprcod_Z(getgxTv_SdtCONPRODUC_Cp_emprcod_Z());
      struct.setCp_clicod_Z(getgxTv_SdtCONPRODUC_Cp_clicod_Z());
      struct.setCp_clinom_Z(getgxTv_SdtCONPRODUC_Cp_clinom_Z());
      struct.setCp_barcod_Z(getgxTv_SdtCONPRODUC_Cp_barcod_Z());
      struct.setCp_barcodreo_Z(getgxTv_SdtCONPRODUC_Cp_barcodreo_Z());
      struct.setCp_barcodpar_Z(getgxTv_SdtCONPRODUC_Cp_barcodpar_Z());
      struct.setCp_barfecfpr_Z(getgxTv_SdtCONPRODUC_Cp_barfecfpr_Z());
      struct.setCp_barnumcli_Z(getgxTv_SdtCONPRODUC_Cp_barnumcli_Z());
      struct.setCp_barplf_Z(getgxTv_SdtCONPRODUC_Cp_barplf_Z());
      struct.setCp_barsit_Z(getgxTv_SdtCONPRODUC_Cp_barsit_Z());
      struct.setCp_barfeccli_Z(getgxTv_SdtCONPRODUC_Cp_barfeccli_Z());
      struct.setCp_barfecsal_Z(getgxTv_SdtCONPRODUC_Cp_barfecsal_Z());
      struct.setCp_barfecgen_Z(getgxTv_SdtCONPRODUC_Cp_barfecgen_Z());
      struct.setCp_barser_Z(getgxTv_SdtCONPRODUC_Cp_barser_Z());
      struct.setCp_barserdsc_Z(getgxTv_SdtCONPRODUC_Cp_barserdsc_Z());
      struct.setCp_barcolo_Z(getgxTv_SdtCONPRODUC_Cp_barcolo_Z());
      struct.setCp_barcolu_Z(getgxTv_SdtCONPRODUC_Cp_barcolu_Z());
      struct.setCp_barnomcli_Z(getgxTv_SdtCONPRODUC_Cp_barnomcli_Z());
      struct.setCp_bartipart_Z(getgxTv_SdtCONPRODUC_Cp_bartipart_Z());
      struct.setCp_tartdsc_Z(getgxTv_SdtCONPRODUC_Cp_tartdsc_Z());
      struct.setCp_bargirar_Z(getgxTv_SdtCONPRODUC_Cp_bargirar_Z());
      struct.setCp_baracaanh_Z(getgxTv_SdtCONPRODUC_Cp_baracaanh_Z());
      struct.setCp_baragrest_Z(getgxTv_SdtCONPRODUC_Cp_baragrest_Z());
      struct.setCp_barext_Z(getgxTv_SdtCONPRODUC_Cp_barext_Z());
      struct.setCp_disdes_Z(getgxTv_SdtCONPRODUC_Cp_disdes_Z());
      struct.setCp_discod_Z(getgxTv_SdtCONPRODUC_Cp_discod_Z());
      struct.setCp_barproper_Z(getgxTv_SdtCONPRODUC_Cp_barproper_Z());
      struct.setCp_dsc_bar_Z(getgxTv_SdtCONPRODUC_Cp_dsc_bar_Z());
      struct.setCp_bardisnum_Z(getgxTv_SdtCONPRODUC_Cp_bardisnum_Z());
      struct.setCp_barkgm_Z(getgxTv_SdtCONPRODUC_Cp_barkgm_Z());
      struct.setCp_barmtr_Z(getgxTv_SdtCONPRODUC_Cp_barmtr_Z());
      struct.setCp_barpie_Z(getgxTv_SdtCONPRODUC_Cp_barpie_Z());
      struct.setCp_baralbk_Z(getgxTv_SdtCONPRODUC_Cp_baralbk_Z());
      struct.setCp_baralbm_Z(getgxTv_SdtCONPRODUC_Cp_baralbm_Z());
      struct.setCp_barenccli_Z(getgxTv_SdtCONPRODUC_Cp_barenccli_Z());
      struct.setCp_disusrc_Z(getgxTv_SdtCONPRODUC_Cp_disusrc_Z());
      struct.setCp_barmaqcd_Z(getgxTv_SdtCONPRODUC_Cp_barmaqcd_Z());
      struct.setCp_barestr_Z(getgxTv_SdtCONPRODUC_Cp_barestr_Z());
      return struct ;
   }

   private byte gxTv_SdtCONPRODUC_N ;
   private byte gxTv_SdtCONPRODUC_Cp_barcodreo ;
   private byte gxTv_SdtCONPRODUC_Cp_barsit ;
   private byte gxTv_SdtCONPRODUC_Cp_barext ;
   private byte gxTv_SdtCONPRODUC_Cp_barestr ;
   private byte gxTv_SdtCONPRODUC_Cp_barcodreo_Z ;
   private byte gxTv_SdtCONPRODUC_Cp_barsit_Z ;
   private byte gxTv_SdtCONPRODUC_Cp_barext_Z ;
   private byte gxTv_SdtCONPRODUC_Cp_barestr_Z ;
   private short gxTv_SdtCONPRODUC_Cp_bartipart ;
   private short gxTv_SdtCONPRODUC_Cp_baracaanh ;
   private short gxTv_SdtCONPRODUC_Initialized ;
   private short gxTv_SdtCONPRODUC_Cp_bartipart_Z ;
   private short gxTv_SdtCONPRODUC_Cp_baracaanh_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtCONPRODUC_Cp_clicod ;
   private int gxTv_SdtCONPRODUC_Cp_barcod ;
   private int gxTv_SdtCONPRODUC_Cp_barnumcli ;
   private int gxTv_SdtCONPRODUC_Cp_barcolu ;
   private int gxTv_SdtCONPRODUC_Cp_discod ;
   private int gxTv_SdtCONPRODUC_Cp_barpie ;
   private int gxTv_SdtCONPRODUC_Cp_clicod_Z ;
   private int gxTv_SdtCONPRODUC_Cp_barcod_Z ;
   private int gxTv_SdtCONPRODUC_Cp_barnumcli_Z ;
   private int gxTv_SdtCONPRODUC_Cp_barcolu_Z ;
   private int gxTv_SdtCONPRODUC_Cp_discod_Z ;
   private int gxTv_SdtCONPRODUC_Cp_barpie_Z ;
   private long gxTv_SdtCONPRODUC_Cp_id ;
   private long gxTv_SdtCONPRODUC_Cp_id_Z ;
   private java.math.BigDecimal gxTv_SdtCONPRODUC_Cp_barkgm ;
   private java.math.BigDecimal gxTv_SdtCONPRODUC_Cp_barmtr ;
   private java.math.BigDecimal gxTv_SdtCONPRODUC_Cp_baralbk ;
   private java.math.BigDecimal gxTv_SdtCONPRODUC_Cp_baralbm ;
   private java.math.BigDecimal gxTv_SdtCONPRODUC_Cp_barkgm_Z ;
   private java.math.BigDecimal gxTv_SdtCONPRODUC_Cp_barmtr_Z ;
   private java.math.BigDecimal gxTv_SdtCONPRODUC_Cp_baralbk_Z ;
   private java.math.BigDecimal gxTv_SdtCONPRODUC_Cp_baralbm_Z ;
   private String gxTv_SdtCONPRODUC_Cp_emprcod ;
   private String gxTv_SdtCONPRODUC_Cp_barcodpar ;
   private String gxTv_SdtCONPRODUC_Cp_barplf ;
   private String gxTv_SdtCONPRODUC_Cp_barser ;
   private String gxTv_SdtCONPRODUC_Cp_barcolo ;
   private String gxTv_SdtCONPRODUC_Cp_baragrest ;
   private String gxTv_SdtCONPRODUC_Cp_disdes ;
   private String gxTv_SdtCONPRODUC_Cp_barproper ;
   private String gxTv_SdtCONPRODUC_Cp_bardisnum ;
   private String gxTv_SdtCONPRODUC_Cp_barenccli ;
   private String gxTv_SdtCONPRODUC_Cp_disusrc ;
   private String gxTv_SdtCONPRODUC_Cp_barmaqcd ;
   private String gxTv_SdtCONPRODUC_Mode ;
   private String gxTv_SdtCONPRODUC_Cp_emprcod_Z ;
   private String gxTv_SdtCONPRODUC_Cp_barcodpar_Z ;
   private String gxTv_SdtCONPRODUC_Cp_barplf_Z ;
   private String gxTv_SdtCONPRODUC_Cp_barser_Z ;
   private String gxTv_SdtCONPRODUC_Cp_barcolo_Z ;
   private String gxTv_SdtCONPRODUC_Cp_baragrest_Z ;
   private String gxTv_SdtCONPRODUC_Cp_disdes_Z ;
   private String gxTv_SdtCONPRODUC_Cp_barproper_Z ;
   private String gxTv_SdtCONPRODUC_Cp_bardisnum_Z ;
   private String gxTv_SdtCONPRODUC_Cp_barenccli_Z ;
   private String gxTv_SdtCONPRODUC_Cp_disusrc_Z ;
   private String gxTv_SdtCONPRODUC_Cp_barmaqcd_Z ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtCONPRODUC_Cp_barfecfpr ;
   private java.util.Date gxTv_SdtCONPRODUC_Cp_barfeccli ;
   private java.util.Date gxTv_SdtCONPRODUC_Cp_barfecsal ;
   private java.util.Date gxTv_SdtCONPRODUC_Cp_barfecgen ;
   private java.util.Date gxTv_SdtCONPRODUC_Cp_barfecfpr_Z ;
   private java.util.Date gxTv_SdtCONPRODUC_Cp_barfeccli_Z ;
   private java.util.Date gxTv_SdtCONPRODUC_Cp_barfecsal_Z ;
   private java.util.Date gxTv_SdtCONPRODUC_Cp_barfecgen_Z ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtCONPRODUC_Cp_clinom ;
   private String gxTv_SdtCONPRODUC_Cp_barserdsc ;
   private String gxTv_SdtCONPRODUC_Cp_barnomcli ;
   private String gxTv_SdtCONPRODUC_Cp_tartdsc ;
   private String gxTv_SdtCONPRODUC_Cp_bargirar ;
   private String gxTv_SdtCONPRODUC_Cp_dsc_bar ;
   private String gxTv_SdtCONPRODUC_Cp_clinom_Z ;
   private String gxTv_SdtCONPRODUC_Cp_barserdsc_Z ;
   private String gxTv_SdtCONPRODUC_Cp_barnomcli_Z ;
   private String gxTv_SdtCONPRODUC_Cp_tartdsc_Z ;
   private String gxTv_SdtCONPRODUC_Cp_bargirar_Z ;
   private String gxTv_SdtCONPRODUC_Cp_dsc_bar_Z ;
}

