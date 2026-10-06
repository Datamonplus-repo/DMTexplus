package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtMRec_AnalisisSDT extends GxUserType
{
   public SdtMRec_AnalisisSDT( )
   {
      this(  new ModelContext(SdtMRec_AnalisisSDT.class));
   }

   public SdtMRec_AnalisisSDT( ModelContext context )
   {
      super( context, "SdtMRec_AnalisisSDT");
   }

   public SdtMRec_AnalisisSDT( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle, context, "SdtMRec_AnalisisSDT");
   }

   public SdtMRec_AnalisisSDT( StructSdtMRec_AnalisisSDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtMRec_AnalisisSDT_Mprecfec = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtMRec_AnalisisSDT_Mprecfec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtMRec_AnalisisSDT_Mprecfec_N = (byte)(0) ;
                  gxTv_SdtMRec_AnalisisSDT_Mprecfec = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), "."))), (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 21, 3), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_1") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_1 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_2") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_3") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_3 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_4") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_4 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_5") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_5 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_6") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_6 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_7") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_7 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_8") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_8 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_9") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_9 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_10") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_10 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_11") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_11 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_12") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_12 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_13") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_13 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_14") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_14 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_15") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_15 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_16") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_16 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_17") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_17 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_18") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_18 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_19") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_19 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_20") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_20 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_21") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_21 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_22") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_22 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_23") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_23 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_24") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_24 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_25") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_25 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_26") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_26 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_27") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_27 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_28") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_28 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_29") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_29 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_30") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_30 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_31") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_31 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_32") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_32 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_33") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_33 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_34") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_34 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_35") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_35 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_36") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_36 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_37") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_37 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_38") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_38 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_39") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_39 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_40") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_40 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_41") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_41 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_42") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_42 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_43") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_43 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_44") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_44 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_45") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_45 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_46") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_46 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_47") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_47 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_48") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_48 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_49") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_49 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_50") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_50 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_51") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_51 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_52") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_52 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_53") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_53 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_54") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_54 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_55") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_55 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_56") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_56 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_57") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_57 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_58") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_58 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_59") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_59 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_60") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_60 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_61") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_61 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_62") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_62 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_63") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_63 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_64") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_64 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_65") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_65 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_66") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_66 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_67") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_67 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_68") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_68 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_69") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_69 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_70") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_70 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_71") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_71 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_72") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_72 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_73") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_73 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_74") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_74 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_75") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_75 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_76") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_76 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_77") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_77 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_78") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_78 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MPRecPLC_79") )
            {
               gxTv_SdtMRec_AnalisisSDT_Mprecplc_79 = oReader.getValue() ;
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
         sName = "MRec_AnalisisSDT" ;
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
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtMRec_AnalisisSDT_Mprecfec) && ( gxTv_SdtMRec_AnalisisSDT_Mprecfec_N == 1 ) )
      {
         oWriter.writeElement("MPRecFec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtMRec_AnalisisSDT_Mprecfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtMRec_AnalisisSDT_Mprecfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtMRec_AnalisisSDT_Mprecfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtMRec_AnalisisSDT_Mprecfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtMRec_AnalisisSDT_Mprecfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtMRec_AnalisisSDT_Mprecfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "." ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.millisecond( gxTv_SdtMRec_AnalisisSDT_Mprecfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "000", 1, 3-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("MPRecFec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("MPRecPLC_1", gxTv_SdtMRec_AnalisisSDT_Mprecplc_1);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_2", gxTv_SdtMRec_AnalisisSDT_Mprecplc_2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_3", gxTv_SdtMRec_AnalisisSDT_Mprecplc_3);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_4", gxTv_SdtMRec_AnalisisSDT_Mprecplc_4);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_5", gxTv_SdtMRec_AnalisisSDT_Mprecplc_5);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_6", gxTv_SdtMRec_AnalisisSDT_Mprecplc_6);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_7", gxTv_SdtMRec_AnalisisSDT_Mprecplc_7);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_8", gxTv_SdtMRec_AnalisisSDT_Mprecplc_8);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_9", gxTv_SdtMRec_AnalisisSDT_Mprecplc_9);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_10", gxTv_SdtMRec_AnalisisSDT_Mprecplc_10);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_11", gxTv_SdtMRec_AnalisisSDT_Mprecplc_11);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_12", gxTv_SdtMRec_AnalisisSDT_Mprecplc_12);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_13", gxTv_SdtMRec_AnalisisSDT_Mprecplc_13);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_14", gxTv_SdtMRec_AnalisisSDT_Mprecplc_14);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_15", gxTv_SdtMRec_AnalisisSDT_Mprecplc_15);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_16", gxTv_SdtMRec_AnalisisSDT_Mprecplc_16);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_17", gxTv_SdtMRec_AnalisisSDT_Mprecplc_17);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_18", gxTv_SdtMRec_AnalisisSDT_Mprecplc_18);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_19", gxTv_SdtMRec_AnalisisSDT_Mprecplc_19);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_20", gxTv_SdtMRec_AnalisisSDT_Mprecplc_20);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_21", gxTv_SdtMRec_AnalisisSDT_Mprecplc_21);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_22", gxTv_SdtMRec_AnalisisSDT_Mprecplc_22);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_23", gxTv_SdtMRec_AnalisisSDT_Mprecplc_23);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_24", gxTv_SdtMRec_AnalisisSDT_Mprecplc_24);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_25", gxTv_SdtMRec_AnalisisSDT_Mprecplc_25);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_26", gxTv_SdtMRec_AnalisisSDT_Mprecplc_26);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_27", gxTv_SdtMRec_AnalisisSDT_Mprecplc_27);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_28", gxTv_SdtMRec_AnalisisSDT_Mprecplc_28);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_29", gxTv_SdtMRec_AnalisisSDT_Mprecplc_29);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_30", gxTv_SdtMRec_AnalisisSDT_Mprecplc_30);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_31", gxTv_SdtMRec_AnalisisSDT_Mprecplc_31);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_32", gxTv_SdtMRec_AnalisisSDT_Mprecplc_32);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_33", gxTv_SdtMRec_AnalisisSDT_Mprecplc_33);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_34", gxTv_SdtMRec_AnalisisSDT_Mprecplc_34);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_35", gxTv_SdtMRec_AnalisisSDT_Mprecplc_35);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_36", gxTv_SdtMRec_AnalisisSDT_Mprecplc_36);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_37", gxTv_SdtMRec_AnalisisSDT_Mprecplc_37);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_38", gxTv_SdtMRec_AnalisisSDT_Mprecplc_38);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_39", gxTv_SdtMRec_AnalisisSDT_Mprecplc_39);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_40", gxTv_SdtMRec_AnalisisSDT_Mprecplc_40);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_41", gxTv_SdtMRec_AnalisisSDT_Mprecplc_41);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_42", gxTv_SdtMRec_AnalisisSDT_Mprecplc_42);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_43", gxTv_SdtMRec_AnalisisSDT_Mprecplc_43);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_44", gxTv_SdtMRec_AnalisisSDT_Mprecplc_44);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_45", gxTv_SdtMRec_AnalisisSDT_Mprecplc_45);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_46", gxTv_SdtMRec_AnalisisSDT_Mprecplc_46);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_47", gxTv_SdtMRec_AnalisisSDT_Mprecplc_47);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_48", gxTv_SdtMRec_AnalisisSDT_Mprecplc_48);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_49", gxTv_SdtMRec_AnalisisSDT_Mprecplc_49);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_50", gxTv_SdtMRec_AnalisisSDT_Mprecplc_50);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_51", gxTv_SdtMRec_AnalisisSDT_Mprecplc_51);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_52", gxTv_SdtMRec_AnalisisSDT_Mprecplc_52);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_53", gxTv_SdtMRec_AnalisisSDT_Mprecplc_53);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_54", gxTv_SdtMRec_AnalisisSDT_Mprecplc_54);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_55", gxTv_SdtMRec_AnalisisSDT_Mprecplc_55);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_56", gxTv_SdtMRec_AnalisisSDT_Mprecplc_56);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_57", gxTv_SdtMRec_AnalisisSDT_Mprecplc_57);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_58", gxTv_SdtMRec_AnalisisSDT_Mprecplc_58);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_59", gxTv_SdtMRec_AnalisisSDT_Mprecplc_59);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_60", gxTv_SdtMRec_AnalisisSDT_Mprecplc_60);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_61", gxTv_SdtMRec_AnalisisSDT_Mprecplc_61);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_62", gxTv_SdtMRec_AnalisisSDT_Mprecplc_62);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_63", gxTv_SdtMRec_AnalisisSDT_Mprecplc_63);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_64", gxTv_SdtMRec_AnalisisSDT_Mprecplc_64);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_65", gxTv_SdtMRec_AnalisisSDT_Mprecplc_65);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_66", gxTv_SdtMRec_AnalisisSDT_Mprecplc_66);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_67", gxTv_SdtMRec_AnalisisSDT_Mprecplc_67);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_68", gxTv_SdtMRec_AnalisisSDT_Mprecplc_68);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_69", gxTv_SdtMRec_AnalisisSDT_Mprecplc_69);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_70", gxTv_SdtMRec_AnalisisSDT_Mprecplc_70);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_71", gxTv_SdtMRec_AnalisisSDT_Mprecplc_71);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_72", gxTv_SdtMRec_AnalisisSDT_Mprecplc_72);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_73", gxTv_SdtMRec_AnalisisSDT_Mprecplc_73);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_74", gxTv_SdtMRec_AnalisisSDT_Mprecplc_74);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_75", gxTv_SdtMRec_AnalisisSDT_Mprecplc_75);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_76", gxTv_SdtMRec_AnalisisSDT_Mprecplc_76);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_77", gxTv_SdtMRec_AnalisisSDT_Mprecplc_77);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_78", gxTv_SdtMRec_AnalisisSDT_Mprecplc_78);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MPRecPLC_79", gxTv_SdtMRec_AnalisisSDT_Mprecplc_79);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeEndElement();
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
      datetimemil_STZ = gxTv_SdtMRec_AnalisisSDT_Mprecfec ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "." ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.millisecond( datetimemil_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "000", 1, 3-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("MPRecFec", sDateCnv, false, false);
      AddObjectProperty("MPRecPLC_1", gxTv_SdtMRec_AnalisisSDT_Mprecplc_1, false, false);
      AddObjectProperty("MPRecPLC_2", gxTv_SdtMRec_AnalisisSDT_Mprecplc_2, false, false);
      AddObjectProperty("MPRecPLC_3", gxTv_SdtMRec_AnalisisSDT_Mprecplc_3, false, false);
      AddObjectProperty("MPRecPLC_4", gxTv_SdtMRec_AnalisisSDT_Mprecplc_4, false, false);
      AddObjectProperty("MPRecPLC_5", gxTv_SdtMRec_AnalisisSDT_Mprecplc_5, false, false);
      AddObjectProperty("MPRecPLC_6", gxTv_SdtMRec_AnalisisSDT_Mprecplc_6, false, false);
      AddObjectProperty("MPRecPLC_7", gxTv_SdtMRec_AnalisisSDT_Mprecplc_7, false, false);
      AddObjectProperty("MPRecPLC_8", gxTv_SdtMRec_AnalisisSDT_Mprecplc_8, false, false);
      AddObjectProperty("MPRecPLC_9", gxTv_SdtMRec_AnalisisSDT_Mprecplc_9, false, false);
      AddObjectProperty("MPRecPLC_10", gxTv_SdtMRec_AnalisisSDT_Mprecplc_10, false, false);
      AddObjectProperty("MPRecPLC_11", gxTv_SdtMRec_AnalisisSDT_Mprecplc_11, false, false);
      AddObjectProperty("MPRecPLC_12", gxTv_SdtMRec_AnalisisSDT_Mprecplc_12, false, false);
      AddObjectProperty("MPRecPLC_13", gxTv_SdtMRec_AnalisisSDT_Mprecplc_13, false, false);
      AddObjectProperty("MPRecPLC_14", gxTv_SdtMRec_AnalisisSDT_Mprecplc_14, false, false);
      AddObjectProperty("MPRecPLC_15", gxTv_SdtMRec_AnalisisSDT_Mprecplc_15, false, false);
      AddObjectProperty("MPRecPLC_16", gxTv_SdtMRec_AnalisisSDT_Mprecplc_16, false, false);
      AddObjectProperty("MPRecPLC_17", gxTv_SdtMRec_AnalisisSDT_Mprecplc_17, false, false);
      AddObjectProperty("MPRecPLC_18", gxTv_SdtMRec_AnalisisSDT_Mprecplc_18, false, false);
      AddObjectProperty("MPRecPLC_19", gxTv_SdtMRec_AnalisisSDT_Mprecplc_19, false, false);
      AddObjectProperty("MPRecPLC_20", gxTv_SdtMRec_AnalisisSDT_Mprecplc_20, false, false);
      AddObjectProperty("MPRecPLC_21", gxTv_SdtMRec_AnalisisSDT_Mprecplc_21, false, false);
      AddObjectProperty("MPRecPLC_22", gxTv_SdtMRec_AnalisisSDT_Mprecplc_22, false, false);
      AddObjectProperty("MPRecPLC_23", gxTv_SdtMRec_AnalisisSDT_Mprecplc_23, false, false);
      AddObjectProperty("MPRecPLC_24", gxTv_SdtMRec_AnalisisSDT_Mprecplc_24, false, false);
      AddObjectProperty("MPRecPLC_25", gxTv_SdtMRec_AnalisisSDT_Mprecplc_25, false, false);
      AddObjectProperty("MPRecPLC_26", gxTv_SdtMRec_AnalisisSDT_Mprecplc_26, false, false);
      AddObjectProperty("MPRecPLC_27", gxTv_SdtMRec_AnalisisSDT_Mprecplc_27, false, false);
      AddObjectProperty("MPRecPLC_28", gxTv_SdtMRec_AnalisisSDT_Mprecplc_28, false, false);
      AddObjectProperty("MPRecPLC_29", gxTv_SdtMRec_AnalisisSDT_Mprecplc_29, false, false);
      AddObjectProperty("MPRecPLC_30", gxTv_SdtMRec_AnalisisSDT_Mprecplc_30, false, false);
      AddObjectProperty("MPRecPLC_31", gxTv_SdtMRec_AnalisisSDT_Mprecplc_31, false, false);
      AddObjectProperty("MPRecPLC_32", gxTv_SdtMRec_AnalisisSDT_Mprecplc_32, false, false);
      AddObjectProperty("MPRecPLC_33", gxTv_SdtMRec_AnalisisSDT_Mprecplc_33, false, false);
      AddObjectProperty("MPRecPLC_34", gxTv_SdtMRec_AnalisisSDT_Mprecplc_34, false, false);
      AddObjectProperty("MPRecPLC_35", gxTv_SdtMRec_AnalisisSDT_Mprecplc_35, false, false);
      AddObjectProperty("MPRecPLC_36", gxTv_SdtMRec_AnalisisSDT_Mprecplc_36, false, false);
      AddObjectProperty("MPRecPLC_37", gxTv_SdtMRec_AnalisisSDT_Mprecplc_37, false, false);
      AddObjectProperty("MPRecPLC_38", gxTv_SdtMRec_AnalisisSDT_Mprecplc_38, false, false);
      AddObjectProperty("MPRecPLC_39", gxTv_SdtMRec_AnalisisSDT_Mprecplc_39, false, false);
      AddObjectProperty("MPRecPLC_40", gxTv_SdtMRec_AnalisisSDT_Mprecplc_40, false, false);
      AddObjectProperty("MPRecPLC_41", gxTv_SdtMRec_AnalisisSDT_Mprecplc_41, false, false);
      AddObjectProperty("MPRecPLC_42", gxTv_SdtMRec_AnalisisSDT_Mprecplc_42, false, false);
      AddObjectProperty("MPRecPLC_43", gxTv_SdtMRec_AnalisisSDT_Mprecplc_43, false, false);
      AddObjectProperty("MPRecPLC_44", gxTv_SdtMRec_AnalisisSDT_Mprecplc_44, false, false);
      AddObjectProperty("MPRecPLC_45", gxTv_SdtMRec_AnalisisSDT_Mprecplc_45, false, false);
      AddObjectProperty("MPRecPLC_46", gxTv_SdtMRec_AnalisisSDT_Mprecplc_46, false, false);
      AddObjectProperty("MPRecPLC_47", gxTv_SdtMRec_AnalisisSDT_Mprecplc_47, false, false);
      AddObjectProperty("MPRecPLC_48", gxTv_SdtMRec_AnalisisSDT_Mprecplc_48, false, false);
      AddObjectProperty("MPRecPLC_49", gxTv_SdtMRec_AnalisisSDT_Mprecplc_49, false, false);
      AddObjectProperty("MPRecPLC_50", gxTv_SdtMRec_AnalisisSDT_Mprecplc_50, false, false);
      AddObjectProperty("MPRecPLC_51", gxTv_SdtMRec_AnalisisSDT_Mprecplc_51, false, false);
      AddObjectProperty("MPRecPLC_52", gxTv_SdtMRec_AnalisisSDT_Mprecplc_52, false, false);
      AddObjectProperty("MPRecPLC_53", gxTv_SdtMRec_AnalisisSDT_Mprecplc_53, false, false);
      AddObjectProperty("MPRecPLC_54", gxTv_SdtMRec_AnalisisSDT_Mprecplc_54, false, false);
      AddObjectProperty("MPRecPLC_55", gxTv_SdtMRec_AnalisisSDT_Mprecplc_55, false, false);
      AddObjectProperty("MPRecPLC_56", gxTv_SdtMRec_AnalisisSDT_Mprecplc_56, false, false);
      AddObjectProperty("MPRecPLC_57", gxTv_SdtMRec_AnalisisSDT_Mprecplc_57, false, false);
      AddObjectProperty("MPRecPLC_58", gxTv_SdtMRec_AnalisisSDT_Mprecplc_58, false, false);
      AddObjectProperty("MPRecPLC_59", gxTv_SdtMRec_AnalisisSDT_Mprecplc_59, false, false);
      AddObjectProperty("MPRecPLC_60", gxTv_SdtMRec_AnalisisSDT_Mprecplc_60, false, false);
      AddObjectProperty("MPRecPLC_61", gxTv_SdtMRec_AnalisisSDT_Mprecplc_61, false, false);
      AddObjectProperty("MPRecPLC_62", gxTv_SdtMRec_AnalisisSDT_Mprecplc_62, false, false);
      AddObjectProperty("MPRecPLC_63", gxTv_SdtMRec_AnalisisSDT_Mprecplc_63, false, false);
      AddObjectProperty("MPRecPLC_64", gxTv_SdtMRec_AnalisisSDT_Mprecplc_64, false, false);
      AddObjectProperty("MPRecPLC_65", gxTv_SdtMRec_AnalisisSDT_Mprecplc_65, false, false);
      AddObjectProperty("MPRecPLC_66", gxTv_SdtMRec_AnalisisSDT_Mprecplc_66, false, false);
      AddObjectProperty("MPRecPLC_67", gxTv_SdtMRec_AnalisisSDT_Mprecplc_67, false, false);
      AddObjectProperty("MPRecPLC_68", gxTv_SdtMRec_AnalisisSDT_Mprecplc_68, false, false);
      AddObjectProperty("MPRecPLC_69", gxTv_SdtMRec_AnalisisSDT_Mprecplc_69, false, false);
      AddObjectProperty("MPRecPLC_70", gxTv_SdtMRec_AnalisisSDT_Mprecplc_70, false, false);
      AddObjectProperty("MPRecPLC_71", gxTv_SdtMRec_AnalisisSDT_Mprecplc_71, false, false);
      AddObjectProperty("MPRecPLC_72", gxTv_SdtMRec_AnalisisSDT_Mprecplc_72, false, false);
      AddObjectProperty("MPRecPLC_73", gxTv_SdtMRec_AnalisisSDT_Mprecplc_73, false, false);
      AddObjectProperty("MPRecPLC_74", gxTv_SdtMRec_AnalisisSDT_Mprecplc_74, false, false);
      AddObjectProperty("MPRecPLC_75", gxTv_SdtMRec_AnalisisSDT_Mprecplc_75, false, false);
      AddObjectProperty("MPRecPLC_76", gxTv_SdtMRec_AnalisisSDT_Mprecplc_76, false, false);
      AddObjectProperty("MPRecPLC_77", gxTv_SdtMRec_AnalisisSDT_Mprecplc_77, false, false);
      AddObjectProperty("MPRecPLC_78", gxTv_SdtMRec_AnalisisSDT_Mprecplc_78, false, false);
      AddObjectProperty("MPRecPLC_79", gxTv_SdtMRec_AnalisisSDT_Mprecplc_79, false, false);
   }

   public java.util.Date getgxTv_SdtMRec_AnalisisSDT_Mprecfec( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecfec ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecfec( java.util.Date value )
   {
      gxTv_SdtMRec_AnalisisSDT_Mprecfec_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecfec = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_1( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_1 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_1( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_1 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_2( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_2 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_2( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_2 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_3( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_3 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_3( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_3 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_4( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_4 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_4( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_4 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_5( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_5 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_5( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_5 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_6( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_6 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_6( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_6 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_7( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_7 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_7( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_7 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_8( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_8 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_8( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_8 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_9( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_9 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_9( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_9 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_10( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_10 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_10( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_10 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_11( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_11 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_11( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_11 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_12( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_12 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_12( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_12 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_13( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_13 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_13( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_13 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_14( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_14 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_14( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_14 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_15( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_15 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_15( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_15 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_16( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_16 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_16( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_16 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_17( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_17 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_17( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_17 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_18( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_18 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_18( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_18 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_19( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_19 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_19( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_19 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_20( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_20 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_20( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_20 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_21( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_21 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_21( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_21 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_22( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_22 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_22( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_22 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_23( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_23 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_23( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_23 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_24( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_24 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_24( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_24 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_25( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_25 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_25( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_25 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_26( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_26 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_26( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_26 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_27( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_27 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_27( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_27 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_28( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_28 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_28( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_28 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_29( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_29 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_29( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_29 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_30( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_30 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_30( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_30 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_31( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_31 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_31( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_31 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_32( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_32 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_32( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_32 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_33( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_33 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_33( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_33 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_34( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_34 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_34( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_34 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_35( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_35 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_35( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_35 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_36( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_36 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_36( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_36 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_37( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_37 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_37( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_37 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_38( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_38 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_38( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_38 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_39( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_39 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_39( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_39 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_40( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_40 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_40( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_40 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_41( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_41 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_41( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_41 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_42( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_42 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_42( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_42 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_43( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_43 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_43( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_43 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_44( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_44 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_44( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_44 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_45( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_45 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_45( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_45 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_46( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_46 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_46( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_46 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_47( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_47 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_47( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_47 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_48( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_48 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_48( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_48 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_49( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_49 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_49( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_49 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_50( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_50 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_50( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_50 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_51( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_51 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_51( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_51 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_52( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_52 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_52( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_52 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_53( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_53 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_53( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_53 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_54( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_54 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_54( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_54 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_55( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_55 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_55( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_55 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_56( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_56 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_56( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_56 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_57( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_57 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_57( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_57 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_58( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_58 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_58( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_58 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_59( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_59 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_59( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_59 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_60( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_60 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_60( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_60 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_61( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_61 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_61( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_61 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_62( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_62 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_62( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_62 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_63( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_63 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_63( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_63 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_64( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_64 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_64( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_64 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_65( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_65 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_65( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_65 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_66( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_66 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_66( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_66 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_67( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_67 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_67( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_67 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_68( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_68 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_68( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_68 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_69( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_69 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_69( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_69 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_70( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_70 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_70( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_70 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_71( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_71 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_71( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_71 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_72( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_72 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_72( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_72 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_73( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_73 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_73( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_73 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_74( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_74 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_74( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_74 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_75( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_75 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_75( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_75 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_76( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_76 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_76( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_76 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_77( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_77 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_77( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_77 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_78( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_78 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_78( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_78 = value ;
   }

   public String getgxTv_SdtMRec_AnalisisSDT_Mprecplc_79( )
   {
      return gxTv_SdtMRec_AnalisisSDT_Mprecplc_79 ;
   }

   public void setgxTv_SdtMRec_AnalisisSDT_Mprecplc_79( String value )
   {
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_79 = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtMRec_AnalisisSDT_Mprecfec = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtMRec_AnalisisSDT_Mprecfec_N = (byte)(1) ;
      gxTv_SdtMRec_AnalisisSDT_N = (byte)(1) ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_1 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_2 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_3 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_4 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_5 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_6 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_7 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_8 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_9 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_10 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_11 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_12 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_13 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_14 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_15 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_16 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_17 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_18 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_19 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_20 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_21 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_22 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_23 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_24 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_25 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_26 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_27 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_28 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_29 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_30 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_31 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_32 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_33 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_34 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_35 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_36 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_37 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_38 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_39 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_40 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_41 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_42 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_43 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_44 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_45 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_46 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_47 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_48 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_49 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_50 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_51 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_52 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_53 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_54 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_55 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_56 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_57 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_58 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_59 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_60 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_61 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_62 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_63 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_64 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_65 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_66 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_67 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_68 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_69 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_70 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_71 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_72 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_73 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_74 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_75 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_76 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_77 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_78 = "" ;
      gxTv_SdtMRec_AnalisisSDT_Mprecplc_79 = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetimemil_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtMRec_AnalisisSDT_N ;
   }

   public app.ingenieria.SdtMRec_AnalisisSDT Clone( )
   {
      return (app.ingenieria.SdtMRec_AnalisisSDT)(clone()) ;
   }

   public void setStruct( app.ingenieria.StructSdtMRec_AnalisisSDT struct )
   {
      if ( struct.gxTv_SdtMRec_AnalisisSDT_Mprecfec_N == 0 )
      {
         setgxTv_SdtMRec_AnalisisSDT_Mprecfec(struct.getMprecfec());
      }
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_1(struct.getMprecplc_1());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_2(struct.getMprecplc_2());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_3(struct.getMprecplc_3());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_4(struct.getMprecplc_4());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_5(struct.getMprecplc_5());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_6(struct.getMprecplc_6());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_7(struct.getMprecplc_7());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_8(struct.getMprecplc_8());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_9(struct.getMprecplc_9());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_10(struct.getMprecplc_10());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_11(struct.getMprecplc_11());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_12(struct.getMprecplc_12());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_13(struct.getMprecplc_13());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_14(struct.getMprecplc_14());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_15(struct.getMprecplc_15());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_16(struct.getMprecplc_16());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_17(struct.getMprecplc_17());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_18(struct.getMprecplc_18());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_19(struct.getMprecplc_19());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_20(struct.getMprecplc_20());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_21(struct.getMprecplc_21());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_22(struct.getMprecplc_22());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_23(struct.getMprecplc_23());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_24(struct.getMprecplc_24());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_25(struct.getMprecplc_25());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_26(struct.getMprecplc_26());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_27(struct.getMprecplc_27());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_28(struct.getMprecplc_28());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_29(struct.getMprecplc_29());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_30(struct.getMprecplc_30());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_31(struct.getMprecplc_31());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_32(struct.getMprecplc_32());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_33(struct.getMprecplc_33());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_34(struct.getMprecplc_34());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_35(struct.getMprecplc_35());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_36(struct.getMprecplc_36());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_37(struct.getMprecplc_37());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_38(struct.getMprecplc_38());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_39(struct.getMprecplc_39());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_40(struct.getMprecplc_40());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_41(struct.getMprecplc_41());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_42(struct.getMprecplc_42());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_43(struct.getMprecplc_43());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_44(struct.getMprecplc_44());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_45(struct.getMprecplc_45());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_46(struct.getMprecplc_46());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_47(struct.getMprecplc_47());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_48(struct.getMprecplc_48());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_49(struct.getMprecplc_49());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_50(struct.getMprecplc_50());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_51(struct.getMprecplc_51());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_52(struct.getMprecplc_52());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_53(struct.getMprecplc_53());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_54(struct.getMprecplc_54());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_55(struct.getMprecplc_55());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_56(struct.getMprecplc_56());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_57(struct.getMprecplc_57());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_58(struct.getMprecplc_58());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_59(struct.getMprecplc_59());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_60(struct.getMprecplc_60());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_61(struct.getMprecplc_61());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_62(struct.getMprecplc_62());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_63(struct.getMprecplc_63());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_64(struct.getMprecplc_64());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_65(struct.getMprecplc_65());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_66(struct.getMprecplc_66());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_67(struct.getMprecplc_67());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_68(struct.getMprecplc_68());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_69(struct.getMprecplc_69());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_70(struct.getMprecplc_70());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_71(struct.getMprecplc_71());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_72(struct.getMprecplc_72());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_73(struct.getMprecplc_73());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_74(struct.getMprecplc_74());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_75(struct.getMprecplc_75());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_76(struct.getMprecplc_76());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_77(struct.getMprecplc_77());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_78(struct.getMprecplc_78());
      setgxTv_SdtMRec_AnalisisSDT_Mprecplc_79(struct.getMprecplc_79());
   }

   @SuppressWarnings("unchecked")
   public app.ingenieria.StructSdtMRec_AnalisisSDT getStruct( )
   {
      app.ingenieria.StructSdtMRec_AnalisisSDT struct = new app.ingenieria.StructSdtMRec_AnalisisSDT ();
      if ( gxTv_SdtMRec_AnalisisSDT_Mprecfec_N == 0 )
      {
         struct.setMprecfec(getgxTv_SdtMRec_AnalisisSDT_Mprecfec());
      }
      struct.setMprecplc_1(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_1());
      struct.setMprecplc_2(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_2());
      struct.setMprecplc_3(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_3());
      struct.setMprecplc_4(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_4());
      struct.setMprecplc_5(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_5());
      struct.setMprecplc_6(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_6());
      struct.setMprecplc_7(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_7());
      struct.setMprecplc_8(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_8());
      struct.setMprecplc_9(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_9());
      struct.setMprecplc_10(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_10());
      struct.setMprecplc_11(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_11());
      struct.setMprecplc_12(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_12());
      struct.setMprecplc_13(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_13());
      struct.setMprecplc_14(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_14());
      struct.setMprecplc_15(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_15());
      struct.setMprecplc_16(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_16());
      struct.setMprecplc_17(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_17());
      struct.setMprecplc_18(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_18());
      struct.setMprecplc_19(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_19());
      struct.setMprecplc_20(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_20());
      struct.setMprecplc_21(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_21());
      struct.setMprecplc_22(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_22());
      struct.setMprecplc_23(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_23());
      struct.setMprecplc_24(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_24());
      struct.setMprecplc_25(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_25());
      struct.setMprecplc_26(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_26());
      struct.setMprecplc_27(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_27());
      struct.setMprecplc_28(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_28());
      struct.setMprecplc_29(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_29());
      struct.setMprecplc_30(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_30());
      struct.setMprecplc_31(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_31());
      struct.setMprecplc_32(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_32());
      struct.setMprecplc_33(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_33());
      struct.setMprecplc_34(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_34());
      struct.setMprecplc_35(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_35());
      struct.setMprecplc_36(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_36());
      struct.setMprecplc_37(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_37());
      struct.setMprecplc_38(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_38());
      struct.setMprecplc_39(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_39());
      struct.setMprecplc_40(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_40());
      struct.setMprecplc_41(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_41());
      struct.setMprecplc_42(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_42());
      struct.setMprecplc_43(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_43());
      struct.setMprecplc_44(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_44());
      struct.setMprecplc_45(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_45());
      struct.setMprecplc_46(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_46());
      struct.setMprecplc_47(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_47());
      struct.setMprecplc_48(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_48());
      struct.setMprecplc_49(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_49());
      struct.setMprecplc_50(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_50());
      struct.setMprecplc_51(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_51());
      struct.setMprecplc_52(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_52());
      struct.setMprecplc_53(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_53());
      struct.setMprecplc_54(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_54());
      struct.setMprecplc_55(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_55());
      struct.setMprecplc_56(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_56());
      struct.setMprecplc_57(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_57());
      struct.setMprecplc_58(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_58());
      struct.setMprecplc_59(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_59());
      struct.setMprecplc_60(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_60());
      struct.setMprecplc_61(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_61());
      struct.setMprecplc_62(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_62());
      struct.setMprecplc_63(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_63());
      struct.setMprecplc_64(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_64());
      struct.setMprecplc_65(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_65());
      struct.setMprecplc_66(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_66());
      struct.setMprecplc_67(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_67());
      struct.setMprecplc_68(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_68());
      struct.setMprecplc_69(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_69());
      struct.setMprecplc_70(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_70());
      struct.setMprecplc_71(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_71());
      struct.setMprecplc_72(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_72());
      struct.setMprecplc_73(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_73());
      struct.setMprecplc_74(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_74());
      struct.setMprecplc_75(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_75());
      struct.setMprecplc_76(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_76());
      struct.setMprecplc_77(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_77());
      struct.setMprecplc_78(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_78());
      struct.setMprecplc_79(getgxTv_SdtMRec_AnalisisSDT_Mprecplc_79());
      return struct ;
   }

   protected byte gxTv_SdtMRec_AnalisisSDT_Mprecfec_N ;
   protected byte gxTv_SdtMRec_AnalisisSDT_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_1 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_2 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_3 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_4 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_5 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_6 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_7 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_8 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_9 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_10 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_11 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_12 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_13 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_14 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_15 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_16 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_17 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_18 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_19 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_20 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_21 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_22 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_23 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_24 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_25 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_26 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_27 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_28 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_29 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_30 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_31 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_32 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_33 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_34 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_35 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_36 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_37 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_38 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_39 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_40 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_41 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_42 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_43 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_44 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_45 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_46 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_47 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_48 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_49 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_50 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_51 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_52 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_53 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_54 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_55 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_56 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_57 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_58 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_59 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_60 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_61 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_62 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_63 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_64 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_65 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_66 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_67 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_68 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_69 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_70 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_71 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_72 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_73 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_74 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_75 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_76 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_77 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_78 ;
   protected String gxTv_SdtMRec_AnalisisSDT_Mprecplc_79 ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtMRec_AnalisisSDT_Mprecfec ;
   protected java.util.Date datetimemil_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
}

