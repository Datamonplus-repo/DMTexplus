package app.asyncbatch ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtJOB extends GxSilentTrnSdt
{
   public SdtJOB( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtJOB.class));
   }

   public SdtJOB( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle, context, "SdtJOB");
      initialize( remoteHandle) ;
   }

   public SdtJOB( int remoteHandle ,
                  StructSdtJOB struct )
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

   public void Load( java.util.UUID AV14423JobId )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV14423JobId});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"JobId", java.util.UUID.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "AsyncBatch\\JOB");
      metadata.set("BT", "TXPJOB");
      metadata.set("PK", "[ \"JobId\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobId") )
            {
               gxTv_SdtJOB_Jobid = GXutil.strToGuid(oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobDesc") )
            {
               gxTv_SdtJOB_Jobdesc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobType") )
            {
               gxTv_SdtJOB_Jobtype = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobExec") )
            {
               gxTv_SdtJOB_Jobexec = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobStat") )
            {
               gxTv_SdtJOB_Jobstat = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsrCreat") )
            {
               gxTv_SdtJOB_Usrcreat = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsrSocket") )
            {
               gxTv_SdtJOB_Usrsocket = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DtCreat") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtJOB_Dtcreat = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtJOB_Dtcreat = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DtStart") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtJOB_Dtstart = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtJOB_Dtstart = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DtEnd") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtJOB_Dtend = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtJOB_Dtend = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotItem") )
            {
               gxTv_SdtJOB_Totitem = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrcItem") )
            {
               gxTv_SdtJOB_Prcitem = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OkItem") )
            {
               gxTv_SdtJOB_Okitem = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ErItem") )
            {
               gxTv_SdtJOB_Eritem = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrgPct") )
            {
               gxTv_SdtJOB_Prgpct = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CurItem") )
            {
               gxTv_SdtJOB_Curitem = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BasePath") )
            {
               gxTv_SdtJOB_Basepath = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OutPath") )
            {
               gxTv_SdtJOB_Outpath = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ZipPath") )
            {
               gxTv_SdtJOB_Zippath = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ZipUrl") )
            {
               gxTv_SdtJOB_Zipurl = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LastErr") )
            {
               gxTv_SdtJOB_Lasterr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LockId") )
            {
               gxTv_SdtJOB_Lockid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LockDt") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtJOB_Lockdt = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtJOB_Lockdt = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
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
               gxTv_SdtJOB_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtJOB_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobId_Z") )
            {
               gxTv_SdtJOB_Jobid_Z = GXutil.strToGuid(oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobDesc_Z") )
            {
               gxTv_SdtJOB_Jobdesc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobType_Z") )
            {
               gxTv_SdtJOB_Jobtype_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobExec_Z") )
            {
               gxTv_SdtJOB_Jobexec_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobStat_Z") )
            {
               gxTv_SdtJOB_Jobstat_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsrCreat_Z") )
            {
               gxTv_SdtJOB_Usrcreat_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsrSocket_Z") )
            {
               gxTv_SdtJOB_Usrsocket_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DtCreat_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtJOB_Dtcreat_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtJOB_Dtcreat_Z = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DtStart_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtJOB_Dtstart_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtJOB_Dtstart_Z = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DtEnd_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtJOB_Dtend_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtJOB_Dtend_Z = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotItem_Z") )
            {
               gxTv_SdtJOB_Totitem_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrcItem_Z") )
            {
               gxTv_SdtJOB_Prcitem_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OkItem_Z") )
            {
               gxTv_SdtJOB_Okitem_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ErItem_Z") )
            {
               gxTv_SdtJOB_Eritem_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrgPct_Z") )
            {
               gxTv_SdtJOB_Prgpct_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CurItem_Z") )
            {
               gxTv_SdtJOB_Curitem_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BasePath_Z") )
            {
               gxTv_SdtJOB_Basepath_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OutPath_Z") )
            {
               gxTv_SdtJOB_Outpath_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ZipPath_Z") )
            {
               gxTv_SdtJOB_Zippath_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ZipUrl_Z") )
            {
               gxTv_SdtJOB_Zipurl_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LockId_Z") )
            {
               gxTv_SdtJOB_Lockid_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LockDt_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtJOB_Lockdt_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtJOB_Lockdt_Z = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobDesc_N") )
            {
               gxTv_SdtJOB_Jobdesc_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobType_N") )
            {
               gxTv_SdtJOB_Jobtype_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobExec_N") )
            {
               gxTv_SdtJOB_Jobexec_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobStat_N") )
            {
               gxTv_SdtJOB_Jobstat_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsrCreat_N") )
            {
               gxTv_SdtJOB_Usrcreat_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UsrSocket_N") )
            {
               gxTv_SdtJOB_Usrsocket_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DtCreat_N") )
            {
               gxTv_SdtJOB_Dtcreat_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DtStart_N") )
            {
               gxTv_SdtJOB_Dtstart_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DtEnd_N") )
            {
               gxTv_SdtJOB_Dtend_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotItem_N") )
            {
               gxTv_SdtJOB_Totitem_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrcItem_N") )
            {
               gxTv_SdtJOB_Prcitem_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OkItem_N") )
            {
               gxTv_SdtJOB_Okitem_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ErItem_N") )
            {
               gxTv_SdtJOB_Eritem_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrgPct_N") )
            {
               gxTv_SdtJOB_Prgpct_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CurItem_N") )
            {
               gxTv_SdtJOB_Curitem_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BasePath_N") )
            {
               gxTv_SdtJOB_Basepath_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OutPath_N") )
            {
               gxTv_SdtJOB_Outpath_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ZipPath_N") )
            {
               gxTv_SdtJOB_Zippath_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ZipUrl_N") )
            {
               gxTv_SdtJOB_Zipurl_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LastErr_N") )
            {
               gxTv_SdtJOB_Lasterr_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LockId_N") )
            {
               gxTv_SdtJOB_Lockid_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LockDt_N") )
            {
               gxTv_SdtJOB_Lockdt_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "JOB" ;
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
      oWriter.writeElement("JobId", gxTv_SdtJOB_Jobid.toString());
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("JobDesc", gxTv_SdtJOB_Jobdesc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("JobType", gxTv_SdtJOB_Jobtype);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("JobExec", gxTv_SdtJOB_Jobexec);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("JobStat", gxTv_SdtJOB_Jobstat);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UsrCreat", gxTv_SdtJOB_Usrcreat);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UsrSocket", gxTv_SdtJOB_Usrsocket);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtJOB_Dtcreat), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtJOB_Dtcreat), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtJOB_Dtcreat), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtJOB_Dtcreat), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtJOB_Dtcreat), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtJOB_Dtcreat), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("DtCreat", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtJOB_Dtstart), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtJOB_Dtstart), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtJOB_Dtstart), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtJOB_Dtstart), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtJOB_Dtstart), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtJOB_Dtstart), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("DtStart", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtJOB_Dtend), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtJOB_Dtend), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtJOB_Dtend), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtJOB_Dtend), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtJOB_Dtend), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtJOB_Dtend), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("DtEnd", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotItem", GXutil.trim( GXutil.str( gxTv_SdtJOB_Totitem, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrcItem", GXutil.trim( GXutil.str( gxTv_SdtJOB_Prcitem, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OkItem", GXutil.trim( GXutil.str( gxTv_SdtJOB_Okitem, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ErItem", GXutil.trim( GXutil.str( gxTv_SdtJOB_Eritem, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrgPct", GXutil.trim( GXutil.str( gxTv_SdtJOB_Prgpct, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CurItem", gxTv_SdtJOB_Curitem);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BasePath", gxTv_SdtJOB_Basepath);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OutPath", gxTv_SdtJOB_Outpath);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ZipPath", gxTv_SdtJOB_Zippath);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ZipUrl", gxTv_SdtJOB_Zipurl);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("LastErr", gxTv_SdtJOB_Lasterr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("LockId", gxTv_SdtJOB_Lockid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtJOB_Lockdt), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtJOB_Lockdt), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtJOB_Lockdt), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtJOB_Lockdt), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtJOB_Lockdt), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtJOB_Lockdt), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("LockDt", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtJOB_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtJOB_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("JobId_Z", gxTv_SdtJOB_Jobid_Z.toString());
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("JobDesc_Z", gxTv_SdtJOB_Jobdesc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("JobType_Z", gxTv_SdtJOB_Jobtype_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("JobExec_Z", gxTv_SdtJOB_Jobexec_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("JobStat_Z", gxTv_SdtJOB_Jobstat_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsrCreat_Z", gxTv_SdtJOB_Usrcreat_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsrSocket_Z", gxTv_SdtJOB_Usrsocket_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtJOB_Dtcreat_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtJOB_Dtcreat_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtJOB_Dtcreat_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtJOB_Dtcreat_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtJOB_Dtcreat_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtJOB_Dtcreat_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("DtCreat_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtJOB_Dtstart_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtJOB_Dtstart_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtJOB_Dtstart_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtJOB_Dtstart_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtJOB_Dtstart_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtJOB_Dtstart_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("DtStart_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtJOB_Dtend_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtJOB_Dtend_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtJOB_Dtend_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtJOB_Dtend_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtJOB_Dtend_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtJOB_Dtend_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("DtEnd_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TotItem_Z", GXutil.trim( GXutil.str( gxTv_SdtJOB_Totitem_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrcItem_Z", GXutil.trim( GXutil.str( gxTv_SdtJOB_Prcitem_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("OkItem_Z", GXutil.trim( GXutil.str( gxTv_SdtJOB_Okitem_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ErItem_Z", GXutil.trim( GXutil.str( gxTv_SdtJOB_Eritem_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrgPct_Z", GXutil.trim( GXutil.str( gxTv_SdtJOB_Prgpct_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CurItem_Z", gxTv_SdtJOB_Curitem_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BasePath_Z", gxTv_SdtJOB_Basepath_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("OutPath_Z", gxTv_SdtJOB_Outpath_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ZipPath_Z", gxTv_SdtJOB_Zippath_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ZipUrl_Z", gxTv_SdtJOB_Zipurl_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("LockId_Z", gxTv_SdtJOB_Lockid_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtJOB_Lockdt_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtJOB_Lockdt_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtJOB_Lockdt_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtJOB_Lockdt_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtJOB_Lockdt_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtJOB_Lockdt_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("LockDt_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("JobDesc_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Jobdesc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("JobType_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Jobtype_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("JobExec_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Jobexec_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("JobStat_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Jobstat_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsrCreat_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Usrcreat_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("UsrSocket_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Usrsocket_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DtCreat_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Dtcreat_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DtStart_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Dtstart_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DtEnd_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Dtend_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TotItem_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Totitem_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrcItem_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Prcitem_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("OkItem_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Okitem_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ErItem_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Eritem_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("PrgPct_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Prgpct_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("CurItem_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Curitem_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BasePath_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Basepath_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("OutPath_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Outpath_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ZipPath_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Zippath_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ZipUrl_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Zipurl_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("LastErr_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Lasterr_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("LockId_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Lockid_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("LockDt_N", GXutil.trim( GXutil.str( gxTv_SdtJOB_Lockdt_N, 1, 0)));
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
      AddObjectProperty("JobId", gxTv_SdtJOB_Jobid, false, includeNonInitialized);
      AddObjectProperty("JobDesc", gxTv_SdtJOB_Jobdesc, false, includeNonInitialized);
      AddObjectProperty("JobDesc_N", gxTv_SdtJOB_Jobdesc_N, false, includeNonInitialized);
      AddObjectProperty("JobType", gxTv_SdtJOB_Jobtype, false, includeNonInitialized);
      AddObjectProperty("JobType_N", gxTv_SdtJOB_Jobtype_N, false, includeNonInitialized);
      AddObjectProperty("JobExec", gxTv_SdtJOB_Jobexec, false, includeNonInitialized);
      AddObjectProperty("JobExec_N", gxTv_SdtJOB_Jobexec_N, false, includeNonInitialized);
      AddObjectProperty("JobStat", gxTv_SdtJOB_Jobstat, false, includeNonInitialized);
      AddObjectProperty("JobStat_N", gxTv_SdtJOB_Jobstat_N, false, includeNonInitialized);
      AddObjectProperty("UsrCreat", gxTv_SdtJOB_Usrcreat, false, includeNonInitialized);
      AddObjectProperty("UsrCreat_N", gxTv_SdtJOB_Usrcreat_N, false, includeNonInitialized);
      AddObjectProperty("UsrSocket", gxTv_SdtJOB_Usrsocket, false, includeNonInitialized);
      AddObjectProperty("UsrSocket_N", gxTv_SdtJOB_Usrsocket_N, false, includeNonInitialized);
      datetime_STZ = gxTv_SdtJOB_Dtcreat ;
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
      AddObjectProperty("DtCreat", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("DtCreat_N", gxTv_SdtJOB_Dtcreat_N, false, includeNonInitialized);
      datetime_STZ = gxTv_SdtJOB_Dtstart ;
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
      AddObjectProperty("DtStart", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("DtStart_N", gxTv_SdtJOB_Dtstart_N, false, includeNonInitialized);
      datetime_STZ = gxTv_SdtJOB_Dtend ;
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
      AddObjectProperty("DtEnd", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("DtEnd_N", gxTv_SdtJOB_Dtend_N, false, includeNonInitialized);
      AddObjectProperty("TotItem", gxTv_SdtJOB_Totitem, false, includeNonInitialized);
      AddObjectProperty("TotItem_N", gxTv_SdtJOB_Totitem_N, false, includeNonInitialized);
      AddObjectProperty("PrcItem", gxTv_SdtJOB_Prcitem, false, includeNonInitialized);
      AddObjectProperty("PrcItem_N", gxTv_SdtJOB_Prcitem_N, false, includeNonInitialized);
      AddObjectProperty("OkItem", gxTv_SdtJOB_Okitem, false, includeNonInitialized);
      AddObjectProperty("OkItem_N", gxTv_SdtJOB_Okitem_N, false, includeNonInitialized);
      AddObjectProperty("ErItem", gxTv_SdtJOB_Eritem, false, includeNonInitialized);
      AddObjectProperty("ErItem_N", gxTv_SdtJOB_Eritem_N, false, includeNonInitialized);
      AddObjectProperty("PrgPct", gxTv_SdtJOB_Prgpct, false, includeNonInitialized);
      AddObjectProperty("PrgPct_N", gxTv_SdtJOB_Prgpct_N, false, includeNonInitialized);
      AddObjectProperty("CurItem", gxTv_SdtJOB_Curitem, false, includeNonInitialized);
      AddObjectProperty("CurItem_N", gxTv_SdtJOB_Curitem_N, false, includeNonInitialized);
      AddObjectProperty("BasePath", gxTv_SdtJOB_Basepath, false, includeNonInitialized);
      AddObjectProperty("BasePath_N", gxTv_SdtJOB_Basepath_N, false, includeNonInitialized);
      AddObjectProperty("OutPath", gxTv_SdtJOB_Outpath, false, includeNonInitialized);
      AddObjectProperty("OutPath_N", gxTv_SdtJOB_Outpath_N, false, includeNonInitialized);
      AddObjectProperty("ZipPath", gxTv_SdtJOB_Zippath, false, includeNonInitialized);
      AddObjectProperty("ZipPath_N", gxTv_SdtJOB_Zippath_N, false, includeNonInitialized);
      AddObjectProperty("ZipUrl", gxTv_SdtJOB_Zipurl, false, includeNonInitialized);
      AddObjectProperty("ZipUrl_N", gxTv_SdtJOB_Zipurl_N, false, includeNonInitialized);
      AddObjectProperty("LastErr", gxTv_SdtJOB_Lasterr, false, includeNonInitialized);
      AddObjectProperty("LastErr_N", gxTv_SdtJOB_Lasterr_N, false, includeNonInitialized);
      AddObjectProperty("LockId", gxTv_SdtJOB_Lockid, false, includeNonInitialized);
      AddObjectProperty("LockId_N", gxTv_SdtJOB_Lockid_N, false, includeNonInitialized);
      datetime_STZ = gxTv_SdtJOB_Lockdt ;
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
      AddObjectProperty("LockDt", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("LockDt_N", gxTv_SdtJOB_Lockdt_N, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtJOB_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtJOB_Initialized, false, includeNonInitialized);
         AddObjectProperty("JobId_Z", gxTv_SdtJOB_Jobid_Z, false, includeNonInitialized);
         AddObjectProperty("JobDesc_Z", gxTv_SdtJOB_Jobdesc_Z, false, includeNonInitialized);
         AddObjectProperty("JobType_Z", gxTv_SdtJOB_Jobtype_Z, false, includeNonInitialized);
         AddObjectProperty("JobExec_Z", gxTv_SdtJOB_Jobexec_Z, false, includeNonInitialized);
         AddObjectProperty("JobStat_Z", gxTv_SdtJOB_Jobstat_Z, false, includeNonInitialized);
         AddObjectProperty("UsrCreat_Z", gxTv_SdtJOB_Usrcreat_Z, false, includeNonInitialized);
         AddObjectProperty("UsrSocket_Z", gxTv_SdtJOB_Usrsocket_Z, false, includeNonInitialized);
         datetime_STZ = gxTv_SdtJOB_Dtcreat_Z ;
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
         AddObjectProperty("DtCreat_Z", sDateCnv, false, includeNonInitialized);
         datetime_STZ = gxTv_SdtJOB_Dtstart_Z ;
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
         AddObjectProperty("DtStart_Z", sDateCnv, false, includeNonInitialized);
         datetime_STZ = gxTv_SdtJOB_Dtend_Z ;
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
         AddObjectProperty("DtEnd_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("TotItem_Z", gxTv_SdtJOB_Totitem_Z, false, includeNonInitialized);
         AddObjectProperty("PrcItem_Z", gxTv_SdtJOB_Prcitem_Z, false, includeNonInitialized);
         AddObjectProperty("OkItem_Z", gxTv_SdtJOB_Okitem_Z, false, includeNonInitialized);
         AddObjectProperty("ErItem_Z", gxTv_SdtJOB_Eritem_Z, false, includeNonInitialized);
         AddObjectProperty("PrgPct_Z", gxTv_SdtJOB_Prgpct_Z, false, includeNonInitialized);
         AddObjectProperty("CurItem_Z", gxTv_SdtJOB_Curitem_Z, false, includeNonInitialized);
         AddObjectProperty("BasePath_Z", gxTv_SdtJOB_Basepath_Z, false, includeNonInitialized);
         AddObjectProperty("OutPath_Z", gxTv_SdtJOB_Outpath_Z, false, includeNonInitialized);
         AddObjectProperty("ZipPath_Z", gxTv_SdtJOB_Zippath_Z, false, includeNonInitialized);
         AddObjectProperty("ZipUrl_Z", gxTv_SdtJOB_Zipurl_Z, false, includeNonInitialized);
         AddObjectProperty("LockId_Z", gxTv_SdtJOB_Lockid_Z, false, includeNonInitialized);
         datetime_STZ = gxTv_SdtJOB_Lockdt_Z ;
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
         AddObjectProperty("LockDt_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("JobDesc_N", gxTv_SdtJOB_Jobdesc_N, false, includeNonInitialized);
         AddObjectProperty("JobType_N", gxTv_SdtJOB_Jobtype_N, false, includeNonInitialized);
         AddObjectProperty("JobExec_N", gxTv_SdtJOB_Jobexec_N, false, includeNonInitialized);
         AddObjectProperty("JobStat_N", gxTv_SdtJOB_Jobstat_N, false, includeNonInitialized);
         AddObjectProperty("UsrCreat_N", gxTv_SdtJOB_Usrcreat_N, false, includeNonInitialized);
         AddObjectProperty("UsrSocket_N", gxTv_SdtJOB_Usrsocket_N, false, includeNonInitialized);
         AddObjectProperty("DtCreat_N", gxTv_SdtJOB_Dtcreat_N, false, includeNonInitialized);
         AddObjectProperty("DtStart_N", gxTv_SdtJOB_Dtstart_N, false, includeNonInitialized);
         AddObjectProperty("DtEnd_N", gxTv_SdtJOB_Dtend_N, false, includeNonInitialized);
         AddObjectProperty("TotItem_N", gxTv_SdtJOB_Totitem_N, false, includeNonInitialized);
         AddObjectProperty("PrcItem_N", gxTv_SdtJOB_Prcitem_N, false, includeNonInitialized);
         AddObjectProperty("OkItem_N", gxTv_SdtJOB_Okitem_N, false, includeNonInitialized);
         AddObjectProperty("ErItem_N", gxTv_SdtJOB_Eritem_N, false, includeNonInitialized);
         AddObjectProperty("PrgPct_N", gxTv_SdtJOB_Prgpct_N, false, includeNonInitialized);
         AddObjectProperty("CurItem_N", gxTv_SdtJOB_Curitem_N, false, includeNonInitialized);
         AddObjectProperty("BasePath_N", gxTv_SdtJOB_Basepath_N, false, includeNonInitialized);
         AddObjectProperty("OutPath_N", gxTv_SdtJOB_Outpath_N, false, includeNonInitialized);
         AddObjectProperty("ZipPath_N", gxTv_SdtJOB_Zippath_N, false, includeNonInitialized);
         AddObjectProperty("ZipUrl_N", gxTv_SdtJOB_Zipurl_N, false, includeNonInitialized);
         AddObjectProperty("LastErr_N", gxTv_SdtJOB_Lasterr_N, false, includeNonInitialized);
         AddObjectProperty("LockId_N", gxTv_SdtJOB_Lockid_N, false, includeNonInitialized);
         AddObjectProperty("LockDt_N", gxTv_SdtJOB_Lockdt_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.asyncbatch.SdtJOB sdt )
   {
      if ( sdt.IsDirty("JobId") )
      {
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Jobid = sdt.getgxTv_SdtJOB_Jobid() ;
      }
      if ( sdt.IsDirty("JobDesc") )
      {
         gxTv_SdtJOB_Jobdesc_N = sdt.getgxTv_SdtJOB_Jobdesc_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Jobdesc = sdt.getgxTv_SdtJOB_Jobdesc() ;
      }
      if ( sdt.IsDirty("JobType") )
      {
         gxTv_SdtJOB_Jobtype_N = sdt.getgxTv_SdtJOB_Jobtype_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Jobtype = sdt.getgxTv_SdtJOB_Jobtype() ;
      }
      if ( sdt.IsDirty("JobExec") )
      {
         gxTv_SdtJOB_Jobexec_N = sdt.getgxTv_SdtJOB_Jobexec_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Jobexec = sdt.getgxTv_SdtJOB_Jobexec() ;
      }
      if ( sdt.IsDirty("JobStat") )
      {
         gxTv_SdtJOB_Jobstat_N = sdt.getgxTv_SdtJOB_Jobstat_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Jobstat = sdt.getgxTv_SdtJOB_Jobstat() ;
      }
      if ( sdt.IsDirty("UsrCreat") )
      {
         gxTv_SdtJOB_Usrcreat_N = sdt.getgxTv_SdtJOB_Usrcreat_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Usrcreat = sdt.getgxTv_SdtJOB_Usrcreat() ;
      }
      if ( sdt.IsDirty("UsrSocket") )
      {
         gxTv_SdtJOB_Usrsocket_N = sdt.getgxTv_SdtJOB_Usrsocket_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Usrsocket = sdt.getgxTv_SdtJOB_Usrsocket() ;
      }
      if ( sdt.IsDirty("DtCreat") )
      {
         gxTv_SdtJOB_Dtcreat_N = sdt.getgxTv_SdtJOB_Dtcreat_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Dtcreat = sdt.getgxTv_SdtJOB_Dtcreat() ;
      }
      if ( sdt.IsDirty("DtStart") )
      {
         gxTv_SdtJOB_Dtstart_N = sdt.getgxTv_SdtJOB_Dtstart_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Dtstart = sdt.getgxTv_SdtJOB_Dtstart() ;
      }
      if ( sdt.IsDirty("DtEnd") )
      {
         gxTv_SdtJOB_Dtend_N = sdt.getgxTv_SdtJOB_Dtend_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Dtend = sdt.getgxTv_SdtJOB_Dtend() ;
      }
      if ( sdt.IsDirty("TotItem") )
      {
         gxTv_SdtJOB_Totitem_N = sdt.getgxTv_SdtJOB_Totitem_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Totitem = sdt.getgxTv_SdtJOB_Totitem() ;
      }
      if ( sdt.IsDirty("PrcItem") )
      {
         gxTv_SdtJOB_Prcitem_N = sdt.getgxTv_SdtJOB_Prcitem_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Prcitem = sdt.getgxTv_SdtJOB_Prcitem() ;
      }
      if ( sdt.IsDirty("OkItem") )
      {
         gxTv_SdtJOB_Okitem_N = sdt.getgxTv_SdtJOB_Okitem_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Okitem = sdt.getgxTv_SdtJOB_Okitem() ;
      }
      if ( sdt.IsDirty("ErItem") )
      {
         gxTv_SdtJOB_Eritem_N = sdt.getgxTv_SdtJOB_Eritem_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Eritem = sdt.getgxTv_SdtJOB_Eritem() ;
      }
      if ( sdt.IsDirty("PrgPct") )
      {
         gxTv_SdtJOB_Prgpct_N = sdt.getgxTv_SdtJOB_Prgpct_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Prgpct = sdt.getgxTv_SdtJOB_Prgpct() ;
      }
      if ( sdt.IsDirty("CurItem") )
      {
         gxTv_SdtJOB_Curitem_N = sdt.getgxTv_SdtJOB_Curitem_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Curitem = sdt.getgxTv_SdtJOB_Curitem() ;
      }
      if ( sdt.IsDirty("BasePath") )
      {
         gxTv_SdtJOB_Basepath_N = sdt.getgxTv_SdtJOB_Basepath_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Basepath = sdt.getgxTv_SdtJOB_Basepath() ;
      }
      if ( sdt.IsDirty("OutPath") )
      {
         gxTv_SdtJOB_Outpath_N = sdt.getgxTv_SdtJOB_Outpath_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Outpath = sdt.getgxTv_SdtJOB_Outpath() ;
      }
      if ( sdt.IsDirty("ZipPath") )
      {
         gxTv_SdtJOB_Zippath_N = sdt.getgxTv_SdtJOB_Zippath_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Zippath = sdt.getgxTv_SdtJOB_Zippath() ;
      }
      if ( sdt.IsDirty("ZipUrl") )
      {
         gxTv_SdtJOB_Zipurl_N = sdt.getgxTv_SdtJOB_Zipurl_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Zipurl = sdt.getgxTv_SdtJOB_Zipurl() ;
      }
      if ( sdt.IsDirty("LastErr") )
      {
         gxTv_SdtJOB_Lasterr_N = sdt.getgxTv_SdtJOB_Lasterr_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Lasterr = sdt.getgxTv_SdtJOB_Lasterr() ;
      }
      if ( sdt.IsDirty("LockId") )
      {
         gxTv_SdtJOB_Lockid_N = sdt.getgxTv_SdtJOB_Lockid_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Lockid = sdt.getgxTv_SdtJOB_Lockid() ;
      }
      if ( sdt.IsDirty("LockDt") )
      {
         gxTv_SdtJOB_Lockdt_N = sdt.getgxTv_SdtJOB_Lockdt_N() ;
         gxTv_SdtJOB_N = (byte)(0) ;
         gxTv_SdtJOB_Lockdt = sdt.getgxTv_SdtJOB_Lockdt() ;
      }
   }

   public java.util.UUID getgxTv_SdtJOB_Jobid( )
   {
      return gxTv_SdtJOB_Jobid ;
   }

   public void setgxTv_SdtJOB_Jobid( java.util.UUID value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      if ( !( gxTv_SdtJOB_Jobid.equals( value ) ) )
      {
         gxTv_SdtJOB_Mode = "INS" ;
         this.setgxTv_SdtJOB_Jobid_Z_SetNull( );
         this.setgxTv_SdtJOB_Jobdesc_Z_SetNull( );
         this.setgxTv_SdtJOB_Jobtype_Z_SetNull( );
         this.setgxTv_SdtJOB_Jobexec_Z_SetNull( );
         this.setgxTv_SdtJOB_Jobstat_Z_SetNull( );
         this.setgxTv_SdtJOB_Usrcreat_Z_SetNull( );
         this.setgxTv_SdtJOB_Usrsocket_Z_SetNull( );
         this.setgxTv_SdtJOB_Dtcreat_Z_SetNull( );
         this.setgxTv_SdtJOB_Dtstart_Z_SetNull( );
         this.setgxTv_SdtJOB_Dtend_Z_SetNull( );
         this.setgxTv_SdtJOB_Totitem_Z_SetNull( );
         this.setgxTv_SdtJOB_Prcitem_Z_SetNull( );
         this.setgxTv_SdtJOB_Okitem_Z_SetNull( );
         this.setgxTv_SdtJOB_Eritem_Z_SetNull( );
         this.setgxTv_SdtJOB_Prgpct_Z_SetNull( );
         this.setgxTv_SdtJOB_Curitem_Z_SetNull( );
         this.setgxTv_SdtJOB_Basepath_Z_SetNull( );
         this.setgxTv_SdtJOB_Outpath_Z_SetNull( );
         this.setgxTv_SdtJOB_Zippath_Z_SetNull( );
         this.setgxTv_SdtJOB_Zipurl_Z_SetNull( );
         this.setgxTv_SdtJOB_Lockid_Z_SetNull( );
         this.setgxTv_SdtJOB_Lockdt_Z_SetNull( );
      }
      SetDirty("Jobid");
      gxTv_SdtJOB_Jobid = value ;
   }

   public String getgxTv_SdtJOB_Jobdesc( )
   {
      return gxTv_SdtJOB_Jobdesc ;
   }

   public void setgxTv_SdtJOB_Jobdesc( String value )
   {
      gxTv_SdtJOB_Jobdesc_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Jobdesc");
      gxTv_SdtJOB_Jobdesc = value ;
   }

   public void setgxTv_SdtJOB_Jobdesc_SetNull( )
   {
      gxTv_SdtJOB_Jobdesc_N = (byte)(1) ;
      gxTv_SdtJOB_Jobdesc = "" ;
      SetDirty("Jobdesc");
   }

   public boolean getgxTv_SdtJOB_Jobdesc_IsNull( )
   {
      return (gxTv_SdtJOB_Jobdesc_N==1) ;
   }

   public String getgxTv_SdtJOB_Jobtype( )
   {
      return gxTv_SdtJOB_Jobtype ;
   }

   public void setgxTv_SdtJOB_Jobtype( String value )
   {
      gxTv_SdtJOB_Jobtype_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Jobtype");
      gxTv_SdtJOB_Jobtype = value ;
   }

   public void setgxTv_SdtJOB_Jobtype_SetNull( )
   {
      gxTv_SdtJOB_Jobtype_N = (byte)(1) ;
      gxTv_SdtJOB_Jobtype = "" ;
      SetDirty("Jobtype");
   }

   public boolean getgxTv_SdtJOB_Jobtype_IsNull( )
   {
      return (gxTv_SdtJOB_Jobtype_N==1) ;
   }

   public String getgxTv_SdtJOB_Jobexec( )
   {
      return gxTv_SdtJOB_Jobexec ;
   }

   public void setgxTv_SdtJOB_Jobexec( String value )
   {
      gxTv_SdtJOB_Jobexec_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Jobexec");
      gxTv_SdtJOB_Jobexec = value ;
   }

   public void setgxTv_SdtJOB_Jobexec_SetNull( )
   {
      gxTv_SdtJOB_Jobexec_N = (byte)(1) ;
      gxTv_SdtJOB_Jobexec = "" ;
      SetDirty("Jobexec");
   }

   public boolean getgxTv_SdtJOB_Jobexec_IsNull( )
   {
      return (gxTv_SdtJOB_Jobexec_N==1) ;
   }

   public String getgxTv_SdtJOB_Jobstat( )
   {
      return gxTv_SdtJOB_Jobstat ;
   }

   public void setgxTv_SdtJOB_Jobstat( String value )
   {
      gxTv_SdtJOB_Jobstat_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Jobstat");
      gxTv_SdtJOB_Jobstat = value ;
   }

   public void setgxTv_SdtJOB_Jobstat_SetNull( )
   {
      gxTv_SdtJOB_Jobstat_N = (byte)(1) ;
      gxTv_SdtJOB_Jobstat = "" ;
      SetDirty("Jobstat");
   }

   public boolean getgxTv_SdtJOB_Jobstat_IsNull( )
   {
      return (gxTv_SdtJOB_Jobstat_N==1) ;
   }

   public String getgxTv_SdtJOB_Usrcreat( )
   {
      return gxTv_SdtJOB_Usrcreat ;
   }

   public void setgxTv_SdtJOB_Usrcreat( String value )
   {
      gxTv_SdtJOB_Usrcreat_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Usrcreat");
      gxTv_SdtJOB_Usrcreat = value ;
   }

   public void setgxTv_SdtJOB_Usrcreat_SetNull( )
   {
      gxTv_SdtJOB_Usrcreat_N = (byte)(1) ;
      gxTv_SdtJOB_Usrcreat = "" ;
      SetDirty("Usrcreat");
   }

   public boolean getgxTv_SdtJOB_Usrcreat_IsNull( )
   {
      return (gxTv_SdtJOB_Usrcreat_N==1) ;
   }

   public String getgxTv_SdtJOB_Usrsocket( )
   {
      return gxTv_SdtJOB_Usrsocket ;
   }

   public void setgxTv_SdtJOB_Usrsocket( String value )
   {
      gxTv_SdtJOB_Usrsocket_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Usrsocket");
      gxTv_SdtJOB_Usrsocket = value ;
   }

   public void setgxTv_SdtJOB_Usrsocket_SetNull( )
   {
      gxTv_SdtJOB_Usrsocket_N = (byte)(1) ;
      gxTv_SdtJOB_Usrsocket = "" ;
      SetDirty("Usrsocket");
   }

   public boolean getgxTv_SdtJOB_Usrsocket_IsNull( )
   {
      return (gxTv_SdtJOB_Usrsocket_N==1) ;
   }

   public java.util.Date getgxTv_SdtJOB_Dtcreat( )
   {
      return gxTv_SdtJOB_Dtcreat ;
   }

   public void setgxTv_SdtJOB_Dtcreat( java.util.Date value )
   {
      gxTv_SdtJOB_Dtcreat_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Dtcreat");
      gxTv_SdtJOB_Dtcreat = value ;
   }

   public void setgxTv_SdtJOB_Dtcreat_SetNull( )
   {
      gxTv_SdtJOB_Dtcreat_N = (byte)(1) ;
      gxTv_SdtJOB_Dtcreat = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Dtcreat");
   }

   public boolean getgxTv_SdtJOB_Dtcreat_IsNull( )
   {
      return (gxTv_SdtJOB_Dtcreat_N==1) ;
   }

   public java.util.Date getgxTv_SdtJOB_Dtstart( )
   {
      return gxTv_SdtJOB_Dtstart ;
   }

   public void setgxTv_SdtJOB_Dtstart( java.util.Date value )
   {
      gxTv_SdtJOB_Dtstart_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Dtstart");
      gxTv_SdtJOB_Dtstart = value ;
   }

   public void setgxTv_SdtJOB_Dtstart_SetNull( )
   {
      gxTv_SdtJOB_Dtstart_N = (byte)(1) ;
      gxTv_SdtJOB_Dtstart = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Dtstart");
   }

   public boolean getgxTv_SdtJOB_Dtstart_IsNull( )
   {
      return (gxTv_SdtJOB_Dtstart_N==1) ;
   }

   public java.util.Date getgxTv_SdtJOB_Dtend( )
   {
      return gxTv_SdtJOB_Dtend ;
   }

   public void setgxTv_SdtJOB_Dtend( java.util.Date value )
   {
      gxTv_SdtJOB_Dtend_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Dtend");
      gxTv_SdtJOB_Dtend = value ;
   }

   public void setgxTv_SdtJOB_Dtend_SetNull( )
   {
      gxTv_SdtJOB_Dtend_N = (byte)(1) ;
      gxTv_SdtJOB_Dtend = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Dtend");
   }

   public boolean getgxTv_SdtJOB_Dtend_IsNull( )
   {
      return (gxTv_SdtJOB_Dtend_N==1) ;
   }

   public long getgxTv_SdtJOB_Totitem( )
   {
      return gxTv_SdtJOB_Totitem ;
   }

   public void setgxTv_SdtJOB_Totitem( long value )
   {
      gxTv_SdtJOB_Totitem_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Totitem");
      gxTv_SdtJOB_Totitem = value ;
   }

   public void setgxTv_SdtJOB_Totitem_SetNull( )
   {
      gxTv_SdtJOB_Totitem_N = (byte)(1) ;
      gxTv_SdtJOB_Totitem = 0 ;
      SetDirty("Totitem");
   }

   public boolean getgxTv_SdtJOB_Totitem_IsNull( )
   {
      return (gxTv_SdtJOB_Totitem_N==1) ;
   }

   public long getgxTv_SdtJOB_Prcitem( )
   {
      return gxTv_SdtJOB_Prcitem ;
   }

   public void setgxTv_SdtJOB_Prcitem( long value )
   {
      gxTv_SdtJOB_Prcitem_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Prcitem");
      gxTv_SdtJOB_Prcitem = value ;
   }

   public void setgxTv_SdtJOB_Prcitem_SetNull( )
   {
      gxTv_SdtJOB_Prcitem_N = (byte)(1) ;
      gxTv_SdtJOB_Prcitem = 0 ;
      SetDirty("Prcitem");
   }

   public boolean getgxTv_SdtJOB_Prcitem_IsNull( )
   {
      return (gxTv_SdtJOB_Prcitem_N==1) ;
   }

   public long getgxTv_SdtJOB_Okitem( )
   {
      return gxTv_SdtJOB_Okitem ;
   }

   public void setgxTv_SdtJOB_Okitem( long value )
   {
      gxTv_SdtJOB_Okitem_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Okitem");
      gxTv_SdtJOB_Okitem = value ;
   }

   public void setgxTv_SdtJOB_Okitem_SetNull( )
   {
      gxTv_SdtJOB_Okitem_N = (byte)(1) ;
      gxTv_SdtJOB_Okitem = 0 ;
      SetDirty("Okitem");
   }

   public boolean getgxTv_SdtJOB_Okitem_IsNull( )
   {
      return (gxTv_SdtJOB_Okitem_N==1) ;
   }

   public long getgxTv_SdtJOB_Eritem( )
   {
      return gxTv_SdtJOB_Eritem ;
   }

   public void setgxTv_SdtJOB_Eritem( long value )
   {
      gxTv_SdtJOB_Eritem_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Eritem");
      gxTv_SdtJOB_Eritem = value ;
   }

   public void setgxTv_SdtJOB_Eritem_SetNull( )
   {
      gxTv_SdtJOB_Eritem_N = (byte)(1) ;
      gxTv_SdtJOB_Eritem = 0 ;
      SetDirty("Eritem");
   }

   public boolean getgxTv_SdtJOB_Eritem_IsNull( )
   {
      return (gxTv_SdtJOB_Eritem_N==1) ;
   }

   public short getgxTv_SdtJOB_Prgpct( )
   {
      return gxTv_SdtJOB_Prgpct ;
   }

   public void setgxTv_SdtJOB_Prgpct( short value )
   {
      gxTv_SdtJOB_Prgpct_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Prgpct");
      gxTv_SdtJOB_Prgpct = value ;
   }

   public void setgxTv_SdtJOB_Prgpct_SetNull( )
   {
      gxTv_SdtJOB_Prgpct_N = (byte)(1) ;
      gxTv_SdtJOB_Prgpct = (short)(0) ;
      SetDirty("Prgpct");
   }

   public boolean getgxTv_SdtJOB_Prgpct_IsNull( )
   {
      return (gxTv_SdtJOB_Prgpct_N==1) ;
   }

   public String getgxTv_SdtJOB_Curitem( )
   {
      return gxTv_SdtJOB_Curitem ;
   }

   public void setgxTv_SdtJOB_Curitem( String value )
   {
      gxTv_SdtJOB_Curitem_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Curitem");
      gxTv_SdtJOB_Curitem = value ;
   }

   public void setgxTv_SdtJOB_Curitem_SetNull( )
   {
      gxTv_SdtJOB_Curitem_N = (byte)(1) ;
      gxTv_SdtJOB_Curitem = "" ;
      SetDirty("Curitem");
   }

   public boolean getgxTv_SdtJOB_Curitem_IsNull( )
   {
      return (gxTv_SdtJOB_Curitem_N==1) ;
   }

   public String getgxTv_SdtJOB_Basepath( )
   {
      return gxTv_SdtJOB_Basepath ;
   }

   public void setgxTv_SdtJOB_Basepath( String value )
   {
      gxTv_SdtJOB_Basepath_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Basepath");
      gxTv_SdtJOB_Basepath = value ;
   }

   public void setgxTv_SdtJOB_Basepath_SetNull( )
   {
      gxTv_SdtJOB_Basepath_N = (byte)(1) ;
      gxTv_SdtJOB_Basepath = "" ;
      SetDirty("Basepath");
   }

   public boolean getgxTv_SdtJOB_Basepath_IsNull( )
   {
      return (gxTv_SdtJOB_Basepath_N==1) ;
   }

   public String getgxTv_SdtJOB_Outpath( )
   {
      return gxTv_SdtJOB_Outpath ;
   }

   public void setgxTv_SdtJOB_Outpath( String value )
   {
      gxTv_SdtJOB_Outpath_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Outpath");
      gxTv_SdtJOB_Outpath = value ;
   }

   public void setgxTv_SdtJOB_Outpath_SetNull( )
   {
      gxTv_SdtJOB_Outpath_N = (byte)(1) ;
      gxTv_SdtJOB_Outpath = "" ;
      SetDirty("Outpath");
   }

   public boolean getgxTv_SdtJOB_Outpath_IsNull( )
   {
      return (gxTv_SdtJOB_Outpath_N==1) ;
   }

   public String getgxTv_SdtJOB_Zippath( )
   {
      return gxTv_SdtJOB_Zippath ;
   }

   public void setgxTv_SdtJOB_Zippath( String value )
   {
      gxTv_SdtJOB_Zippath_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Zippath");
      gxTv_SdtJOB_Zippath = value ;
   }

   public void setgxTv_SdtJOB_Zippath_SetNull( )
   {
      gxTv_SdtJOB_Zippath_N = (byte)(1) ;
      gxTv_SdtJOB_Zippath = "" ;
      SetDirty("Zippath");
   }

   public boolean getgxTv_SdtJOB_Zippath_IsNull( )
   {
      return (gxTv_SdtJOB_Zippath_N==1) ;
   }

   public String getgxTv_SdtJOB_Zipurl( )
   {
      return gxTv_SdtJOB_Zipurl ;
   }

   public void setgxTv_SdtJOB_Zipurl( String value )
   {
      gxTv_SdtJOB_Zipurl_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Zipurl");
      gxTv_SdtJOB_Zipurl = value ;
   }

   public void setgxTv_SdtJOB_Zipurl_SetNull( )
   {
      gxTv_SdtJOB_Zipurl_N = (byte)(1) ;
      gxTv_SdtJOB_Zipurl = "" ;
      SetDirty("Zipurl");
   }

   public boolean getgxTv_SdtJOB_Zipurl_IsNull( )
   {
      return (gxTv_SdtJOB_Zipurl_N==1) ;
   }

   public String getgxTv_SdtJOB_Lasterr( )
   {
      return gxTv_SdtJOB_Lasterr ;
   }

   public void setgxTv_SdtJOB_Lasterr( String value )
   {
      gxTv_SdtJOB_Lasterr_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Lasterr");
      gxTv_SdtJOB_Lasterr = value ;
   }

   public void setgxTv_SdtJOB_Lasterr_SetNull( )
   {
      gxTv_SdtJOB_Lasterr_N = (byte)(1) ;
      gxTv_SdtJOB_Lasterr = "" ;
      SetDirty("Lasterr");
   }

   public boolean getgxTv_SdtJOB_Lasterr_IsNull( )
   {
      return (gxTv_SdtJOB_Lasterr_N==1) ;
   }

   public String getgxTv_SdtJOB_Lockid( )
   {
      return gxTv_SdtJOB_Lockid ;
   }

   public void setgxTv_SdtJOB_Lockid( String value )
   {
      gxTv_SdtJOB_Lockid_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Lockid");
      gxTv_SdtJOB_Lockid = value ;
   }

   public void setgxTv_SdtJOB_Lockid_SetNull( )
   {
      gxTv_SdtJOB_Lockid_N = (byte)(1) ;
      gxTv_SdtJOB_Lockid = "" ;
      SetDirty("Lockid");
   }

   public boolean getgxTv_SdtJOB_Lockid_IsNull( )
   {
      return (gxTv_SdtJOB_Lockid_N==1) ;
   }

   public java.util.Date getgxTv_SdtJOB_Lockdt( )
   {
      return gxTv_SdtJOB_Lockdt ;
   }

   public void setgxTv_SdtJOB_Lockdt( java.util.Date value )
   {
      gxTv_SdtJOB_Lockdt_N = (byte)(0) ;
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Lockdt");
      gxTv_SdtJOB_Lockdt = value ;
   }

   public void setgxTv_SdtJOB_Lockdt_SetNull( )
   {
      gxTv_SdtJOB_Lockdt_N = (byte)(1) ;
      gxTv_SdtJOB_Lockdt = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Lockdt");
   }

   public boolean getgxTv_SdtJOB_Lockdt_IsNull( )
   {
      return (gxTv_SdtJOB_Lockdt_N==1) ;
   }

   public String getgxTv_SdtJOB_Mode( )
   {
      return gxTv_SdtJOB_Mode ;
   }

   public void setgxTv_SdtJOB_Mode( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtJOB_Mode = value ;
   }

   public void setgxTv_SdtJOB_Mode_SetNull( )
   {
      gxTv_SdtJOB_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtJOB_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtJOB_Initialized( )
   {
      return gxTv_SdtJOB_Initialized ;
   }

   public void setgxTv_SdtJOB_Initialized( short value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtJOB_Initialized = value ;
   }

   public void setgxTv_SdtJOB_Initialized_SetNull( )
   {
      gxTv_SdtJOB_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtJOB_Initialized_IsNull( )
   {
      return false ;
   }

   public java.util.UUID getgxTv_SdtJOB_Jobid_Z( )
   {
      return gxTv_SdtJOB_Jobid_Z ;
   }

   public void setgxTv_SdtJOB_Jobid_Z( java.util.UUID value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Jobid_Z");
      gxTv_SdtJOB_Jobid_Z = value ;
   }

   public void setgxTv_SdtJOB_Jobid_Z_SetNull( )
   {
      gxTv_SdtJOB_Jobid_Z = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      SetDirty("Jobid_Z");
   }

   public boolean getgxTv_SdtJOB_Jobid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtJOB_Jobdesc_Z( )
   {
      return gxTv_SdtJOB_Jobdesc_Z ;
   }

   public void setgxTv_SdtJOB_Jobdesc_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Jobdesc_Z");
      gxTv_SdtJOB_Jobdesc_Z = value ;
   }

   public void setgxTv_SdtJOB_Jobdesc_Z_SetNull( )
   {
      gxTv_SdtJOB_Jobdesc_Z = "" ;
      SetDirty("Jobdesc_Z");
   }

   public boolean getgxTv_SdtJOB_Jobdesc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtJOB_Jobtype_Z( )
   {
      return gxTv_SdtJOB_Jobtype_Z ;
   }

   public void setgxTv_SdtJOB_Jobtype_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Jobtype_Z");
      gxTv_SdtJOB_Jobtype_Z = value ;
   }

   public void setgxTv_SdtJOB_Jobtype_Z_SetNull( )
   {
      gxTv_SdtJOB_Jobtype_Z = "" ;
      SetDirty("Jobtype_Z");
   }

   public boolean getgxTv_SdtJOB_Jobtype_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtJOB_Jobexec_Z( )
   {
      return gxTv_SdtJOB_Jobexec_Z ;
   }

   public void setgxTv_SdtJOB_Jobexec_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Jobexec_Z");
      gxTv_SdtJOB_Jobexec_Z = value ;
   }

   public void setgxTv_SdtJOB_Jobexec_Z_SetNull( )
   {
      gxTv_SdtJOB_Jobexec_Z = "" ;
      SetDirty("Jobexec_Z");
   }

   public boolean getgxTv_SdtJOB_Jobexec_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtJOB_Jobstat_Z( )
   {
      return gxTv_SdtJOB_Jobstat_Z ;
   }

   public void setgxTv_SdtJOB_Jobstat_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Jobstat_Z");
      gxTv_SdtJOB_Jobstat_Z = value ;
   }

   public void setgxTv_SdtJOB_Jobstat_Z_SetNull( )
   {
      gxTv_SdtJOB_Jobstat_Z = "" ;
      SetDirty("Jobstat_Z");
   }

   public boolean getgxTv_SdtJOB_Jobstat_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtJOB_Usrcreat_Z( )
   {
      return gxTv_SdtJOB_Usrcreat_Z ;
   }

   public void setgxTv_SdtJOB_Usrcreat_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Usrcreat_Z");
      gxTv_SdtJOB_Usrcreat_Z = value ;
   }

   public void setgxTv_SdtJOB_Usrcreat_Z_SetNull( )
   {
      gxTv_SdtJOB_Usrcreat_Z = "" ;
      SetDirty("Usrcreat_Z");
   }

   public boolean getgxTv_SdtJOB_Usrcreat_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtJOB_Usrsocket_Z( )
   {
      return gxTv_SdtJOB_Usrsocket_Z ;
   }

   public void setgxTv_SdtJOB_Usrsocket_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Usrsocket_Z");
      gxTv_SdtJOB_Usrsocket_Z = value ;
   }

   public void setgxTv_SdtJOB_Usrsocket_Z_SetNull( )
   {
      gxTv_SdtJOB_Usrsocket_Z = "" ;
      SetDirty("Usrsocket_Z");
   }

   public boolean getgxTv_SdtJOB_Usrsocket_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtJOB_Dtcreat_Z( )
   {
      return gxTv_SdtJOB_Dtcreat_Z ;
   }

   public void setgxTv_SdtJOB_Dtcreat_Z( java.util.Date value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Dtcreat_Z");
      gxTv_SdtJOB_Dtcreat_Z = value ;
   }

   public void setgxTv_SdtJOB_Dtcreat_Z_SetNull( )
   {
      gxTv_SdtJOB_Dtcreat_Z = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Dtcreat_Z");
   }

   public boolean getgxTv_SdtJOB_Dtcreat_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtJOB_Dtstart_Z( )
   {
      return gxTv_SdtJOB_Dtstart_Z ;
   }

   public void setgxTv_SdtJOB_Dtstart_Z( java.util.Date value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Dtstart_Z");
      gxTv_SdtJOB_Dtstart_Z = value ;
   }

   public void setgxTv_SdtJOB_Dtstart_Z_SetNull( )
   {
      gxTv_SdtJOB_Dtstart_Z = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Dtstart_Z");
   }

   public boolean getgxTv_SdtJOB_Dtstart_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtJOB_Dtend_Z( )
   {
      return gxTv_SdtJOB_Dtend_Z ;
   }

   public void setgxTv_SdtJOB_Dtend_Z( java.util.Date value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Dtend_Z");
      gxTv_SdtJOB_Dtend_Z = value ;
   }

   public void setgxTv_SdtJOB_Dtend_Z_SetNull( )
   {
      gxTv_SdtJOB_Dtend_Z = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Dtend_Z");
   }

   public boolean getgxTv_SdtJOB_Dtend_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtJOB_Totitem_Z( )
   {
      return gxTv_SdtJOB_Totitem_Z ;
   }

   public void setgxTv_SdtJOB_Totitem_Z( long value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Totitem_Z");
      gxTv_SdtJOB_Totitem_Z = value ;
   }

   public void setgxTv_SdtJOB_Totitem_Z_SetNull( )
   {
      gxTv_SdtJOB_Totitem_Z = 0 ;
      SetDirty("Totitem_Z");
   }

   public boolean getgxTv_SdtJOB_Totitem_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtJOB_Prcitem_Z( )
   {
      return gxTv_SdtJOB_Prcitem_Z ;
   }

   public void setgxTv_SdtJOB_Prcitem_Z( long value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Prcitem_Z");
      gxTv_SdtJOB_Prcitem_Z = value ;
   }

   public void setgxTv_SdtJOB_Prcitem_Z_SetNull( )
   {
      gxTv_SdtJOB_Prcitem_Z = 0 ;
      SetDirty("Prcitem_Z");
   }

   public boolean getgxTv_SdtJOB_Prcitem_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtJOB_Okitem_Z( )
   {
      return gxTv_SdtJOB_Okitem_Z ;
   }

   public void setgxTv_SdtJOB_Okitem_Z( long value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Okitem_Z");
      gxTv_SdtJOB_Okitem_Z = value ;
   }

   public void setgxTv_SdtJOB_Okitem_Z_SetNull( )
   {
      gxTv_SdtJOB_Okitem_Z = 0 ;
      SetDirty("Okitem_Z");
   }

   public boolean getgxTv_SdtJOB_Okitem_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtJOB_Eritem_Z( )
   {
      return gxTv_SdtJOB_Eritem_Z ;
   }

   public void setgxTv_SdtJOB_Eritem_Z( long value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Eritem_Z");
      gxTv_SdtJOB_Eritem_Z = value ;
   }

   public void setgxTv_SdtJOB_Eritem_Z_SetNull( )
   {
      gxTv_SdtJOB_Eritem_Z = 0 ;
      SetDirty("Eritem_Z");
   }

   public boolean getgxTv_SdtJOB_Eritem_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtJOB_Prgpct_Z( )
   {
      return gxTv_SdtJOB_Prgpct_Z ;
   }

   public void setgxTv_SdtJOB_Prgpct_Z( short value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Prgpct_Z");
      gxTv_SdtJOB_Prgpct_Z = value ;
   }

   public void setgxTv_SdtJOB_Prgpct_Z_SetNull( )
   {
      gxTv_SdtJOB_Prgpct_Z = (short)(0) ;
      SetDirty("Prgpct_Z");
   }

   public boolean getgxTv_SdtJOB_Prgpct_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtJOB_Curitem_Z( )
   {
      return gxTv_SdtJOB_Curitem_Z ;
   }

   public void setgxTv_SdtJOB_Curitem_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Curitem_Z");
      gxTv_SdtJOB_Curitem_Z = value ;
   }

   public void setgxTv_SdtJOB_Curitem_Z_SetNull( )
   {
      gxTv_SdtJOB_Curitem_Z = "" ;
      SetDirty("Curitem_Z");
   }

   public boolean getgxTv_SdtJOB_Curitem_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtJOB_Basepath_Z( )
   {
      return gxTv_SdtJOB_Basepath_Z ;
   }

   public void setgxTv_SdtJOB_Basepath_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Basepath_Z");
      gxTv_SdtJOB_Basepath_Z = value ;
   }

   public void setgxTv_SdtJOB_Basepath_Z_SetNull( )
   {
      gxTv_SdtJOB_Basepath_Z = "" ;
      SetDirty("Basepath_Z");
   }

   public boolean getgxTv_SdtJOB_Basepath_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtJOB_Outpath_Z( )
   {
      return gxTv_SdtJOB_Outpath_Z ;
   }

   public void setgxTv_SdtJOB_Outpath_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Outpath_Z");
      gxTv_SdtJOB_Outpath_Z = value ;
   }

   public void setgxTv_SdtJOB_Outpath_Z_SetNull( )
   {
      gxTv_SdtJOB_Outpath_Z = "" ;
      SetDirty("Outpath_Z");
   }

   public boolean getgxTv_SdtJOB_Outpath_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtJOB_Zippath_Z( )
   {
      return gxTv_SdtJOB_Zippath_Z ;
   }

   public void setgxTv_SdtJOB_Zippath_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Zippath_Z");
      gxTv_SdtJOB_Zippath_Z = value ;
   }

   public void setgxTv_SdtJOB_Zippath_Z_SetNull( )
   {
      gxTv_SdtJOB_Zippath_Z = "" ;
      SetDirty("Zippath_Z");
   }

   public boolean getgxTv_SdtJOB_Zippath_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtJOB_Zipurl_Z( )
   {
      return gxTv_SdtJOB_Zipurl_Z ;
   }

   public void setgxTv_SdtJOB_Zipurl_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Zipurl_Z");
      gxTv_SdtJOB_Zipurl_Z = value ;
   }

   public void setgxTv_SdtJOB_Zipurl_Z_SetNull( )
   {
      gxTv_SdtJOB_Zipurl_Z = "" ;
      SetDirty("Zipurl_Z");
   }

   public boolean getgxTv_SdtJOB_Zipurl_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtJOB_Lockid_Z( )
   {
      return gxTv_SdtJOB_Lockid_Z ;
   }

   public void setgxTv_SdtJOB_Lockid_Z( String value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Lockid_Z");
      gxTv_SdtJOB_Lockid_Z = value ;
   }

   public void setgxTv_SdtJOB_Lockid_Z_SetNull( )
   {
      gxTv_SdtJOB_Lockid_Z = "" ;
      SetDirty("Lockid_Z");
   }

   public boolean getgxTv_SdtJOB_Lockid_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtJOB_Lockdt_Z( )
   {
      return gxTv_SdtJOB_Lockdt_Z ;
   }

   public void setgxTv_SdtJOB_Lockdt_Z( java.util.Date value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Lockdt_Z");
      gxTv_SdtJOB_Lockdt_Z = value ;
   }

   public void setgxTv_SdtJOB_Lockdt_Z_SetNull( )
   {
      gxTv_SdtJOB_Lockdt_Z = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Lockdt_Z");
   }

   public boolean getgxTv_SdtJOB_Lockdt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Jobdesc_N( )
   {
      return gxTv_SdtJOB_Jobdesc_N ;
   }

   public void setgxTv_SdtJOB_Jobdesc_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Jobdesc_N");
      gxTv_SdtJOB_Jobdesc_N = value ;
   }

   public void setgxTv_SdtJOB_Jobdesc_N_SetNull( )
   {
      gxTv_SdtJOB_Jobdesc_N = (byte)(0) ;
      SetDirty("Jobdesc_N");
   }

   public boolean getgxTv_SdtJOB_Jobdesc_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Jobtype_N( )
   {
      return gxTv_SdtJOB_Jobtype_N ;
   }

   public void setgxTv_SdtJOB_Jobtype_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Jobtype_N");
      gxTv_SdtJOB_Jobtype_N = value ;
   }

   public void setgxTv_SdtJOB_Jobtype_N_SetNull( )
   {
      gxTv_SdtJOB_Jobtype_N = (byte)(0) ;
      SetDirty("Jobtype_N");
   }

   public boolean getgxTv_SdtJOB_Jobtype_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Jobexec_N( )
   {
      return gxTv_SdtJOB_Jobexec_N ;
   }

   public void setgxTv_SdtJOB_Jobexec_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Jobexec_N");
      gxTv_SdtJOB_Jobexec_N = value ;
   }

   public void setgxTv_SdtJOB_Jobexec_N_SetNull( )
   {
      gxTv_SdtJOB_Jobexec_N = (byte)(0) ;
      SetDirty("Jobexec_N");
   }

   public boolean getgxTv_SdtJOB_Jobexec_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Jobstat_N( )
   {
      return gxTv_SdtJOB_Jobstat_N ;
   }

   public void setgxTv_SdtJOB_Jobstat_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Jobstat_N");
      gxTv_SdtJOB_Jobstat_N = value ;
   }

   public void setgxTv_SdtJOB_Jobstat_N_SetNull( )
   {
      gxTv_SdtJOB_Jobstat_N = (byte)(0) ;
      SetDirty("Jobstat_N");
   }

   public boolean getgxTv_SdtJOB_Jobstat_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Usrcreat_N( )
   {
      return gxTv_SdtJOB_Usrcreat_N ;
   }

   public void setgxTv_SdtJOB_Usrcreat_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Usrcreat_N");
      gxTv_SdtJOB_Usrcreat_N = value ;
   }

   public void setgxTv_SdtJOB_Usrcreat_N_SetNull( )
   {
      gxTv_SdtJOB_Usrcreat_N = (byte)(0) ;
      SetDirty("Usrcreat_N");
   }

   public boolean getgxTv_SdtJOB_Usrcreat_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Usrsocket_N( )
   {
      return gxTv_SdtJOB_Usrsocket_N ;
   }

   public void setgxTv_SdtJOB_Usrsocket_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Usrsocket_N");
      gxTv_SdtJOB_Usrsocket_N = value ;
   }

   public void setgxTv_SdtJOB_Usrsocket_N_SetNull( )
   {
      gxTv_SdtJOB_Usrsocket_N = (byte)(0) ;
      SetDirty("Usrsocket_N");
   }

   public boolean getgxTv_SdtJOB_Usrsocket_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Dtcreat_N( )
   {
      return gxTv_SdtJOB_Dtcreat_N ;
   }

   public void setgxTv_SdtJOB_Dtcreat_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Dtcreat_N");
      gxTv_SdtJOB_Dtcreat_N = value ;
   }

   public void setgxTv_SdtJOB_Dtcreat_N_SetNull( )
   {
      gxTv_SdtJOB_Dtcreat_N = (byte)(0) ;
      SetDirty("Dtcreat_N");
   }

   public boolean getgxTv_SdtJOB_Dtcreat_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Dtstart_N( )
   {
      return gxTv_SdtJOB_Dtstart_N ;
   }

   public void setgxTv_SdtJOB_Dtstart_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Dtstart_N");
      gxTv_SdtJOB_Dtstart_N = value ;
   }

   public void setgxTv_SdtJOB_Dtstart_N_SetNull( )
   {
      gxTv_SdtJOB_Dtstart_N = (byte)(0) ;
      SetDirty("Dtstart_N");
   }

   public boolean getgxTv_SdtJOB_Dtstart_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Dtend_N( )
   {
      return gxTv_SdtJOB_Dtend_N ;
   }

   public void setgxTv_SdtJOB_Dtend_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Dtend_N");
      gxTv_SdtJOB_Dtend_N = value ;
   }

   public void setgxTv_SdtJOB_Dtend_N_SetNull( )
   {
      gxTv_SdtJOB_Dtend_N = (byte)(0) ;
      SetDirty("Dtend_N");
   }

   public boolean getgxTv_SdtJOB_Dtend_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Totitem_N( )
   {
      return gxTv_SdtJOB_Totitem_N ;
   }

   public void setgxTv_SdtJOB_Totitem_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Totitem_N");
      gxTv_SdtJOB_Totitem_N = value ;
   }

   public void setgxTv_SdtJOB_Totitem_N_SetNull( )
   {
      gxTv_SdtJOB_Totitem_N = (byte)(0) ;
      SetDirty("Totitem_N");
   }

   public boolean getgxTv_SdtJOB_Totitem_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Prcitem_N( )
   {
      return gxTv_SdtJOB_Prcitem_N ;
   }

   public void setgxTv_SdtJOB_Prcitem_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Prcitem_N");
      gxTv_SdtJOB_Prcitem_N = value ;
   }

   public void setgxTv_SdtJOB_Prcitem_N_SetNull( )
   {
      gxTv_SdtJOB_Prcitem_N = (byte)(0) ;
      SetDirty("Prcitem_N");
   }

   public boolean getgxTv_SdtJOB_Prcitem_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Okitem_N( )
   {
      return gxTv_SdtJOB_Okitem_N ;
   }

   public void setgxTv_SdtJOB_Okitem_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Okitem_N");
      gxTv_SdtJOB_Okitem_N = value ;
   }

   public void setgxTv_SdtJOB_Okitem_N_SetNull( )
   {
      gxTv_SdtJOB_Okitem_N = (byte)(0) ;
      SetDirty("Okitem_N");
   }

   public boolean getgxTv_SdtJOB_Okitem_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Eritem_N( )
   {
      return gxTv_SdtJOB_Eritem_N ;
   }

   public void setgxTv_SdtJOB_Eritem_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Eritem_N");
      gxTv_SdtJOB_Eritem_N = value ;
   }

   public void setgxTv_SdtJOB_Eritem_N_SetNull( )
   {
      gxTv_SdtJOB_Eritem_N = (byte)(0) ;
      SetDirty("Eritem_N");
   }

   public boolean getgxTv_SdtJOB_Eritem_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Prgpct_N( )
   {
      return gxTv_SdtJOB_Prgpct_N ;
   }

   public void setgxTv_SdtJOB_Prgpct_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Prgpct_N");
      gxTv_SdtJOB_Prgpct_N = value ;
   }

   public void setgxTv_SdtJOB_Prgpct_N_SetNull( )
   {
      gxTv_SdtJOB_Prgpct_N = (byte)(0) ;
      SetDirty("Prgpct_N");
   }

   public boolean getgxTv_SdtJOB_Prgpct_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Curitem_N( )
   {
      return gxTv_SdtJOB_Curitem_N ;
   }

   public void setgxTv_SdtJOB_Curitem_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Curitem_N");
      gxTv_SdtJOB_Curitem_N = value ;
   }

   public void setgxTv_SdtJOB_Curitem_N_SetNull( )
   {
      gxTv_SdtJOB_Curitem_N = (byte)(0) ;
      SetDirty("Curitem_N");
   }

   public boolean getgxTv_SdtJOB_Curitem_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Basepath_N( )
   {
      return gxTv_SdtJOB_Basepath_N ;
   }

   public void setgxTv_SdtJOB_Basepath_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Basepath_N");
      gxTv_SdtJOB_Basepath_N = value ;
   }

   public void setgxTv_SdtJOB_Basepath_N_SetNull( )
   {
      gxTv_SdtJOB_Basepath_N = (byte)(0) ;
      SetDirty("Basepath_N");
   }

   public boolean getgxTv_SdtJOB_Basepath_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Outpath_N( )
   {
      return gxTv_SdtJOB_Outpath_N ;
   }

   public void setgxTv_SdtJOB_Outpath_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Outpath_N");
      gxTv_SdtJOB_Outpath_N = value ;
   }

   public void setgxTv_SdtJOB_Outpath_N_SetNull( )
   {
      gxTv_SdtJOB_Outpath_N = (byte)(0) ;
      SetDirty("Outpath_N");
   }

   public boolean getgxTv_SdtJOB_Outpath_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Zippath_N( )
   {
      return gxTv_SdtJOB_Zippath_N ;
   }

   public void setgxTv_SdtJOB_Zippath_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Zippath_N");
      gxTv_SdtJOB_Zippath_N = value ;
   }

   public void setgxTv_SdtJOB_Zippath_N_SetNull( )
   {
      gxTv_SdtJOB_Zippath_N = (byte)(0) ;
      SetDirty("Zippath_N");
   }

   public boolean getgxTv_SdtJOB_Zippath_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Zipurl_N( )
   {
      return gxTv_SdtJOB_Zipurl_N ;
   }

   public void setgxTv_SdtJOB_Zipurl_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Zipurl_N");
      gxTv_SdtJOB_Zipurl_N = value ;
   }

   public void setgxTv_SdtJOB_Zipurl_N_SetNull( )
   {
      gxTv_SdtJOB_Zipurl_N = (byte)(0) ;
      SetDirty("Zipurl_N");
   }

   public boolean getgxTv_SdtJOB_Zipurl_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Lasterr_N( )
   {
      return gxTv_SdtJOB_Lasterr_N ;
   }

   public void setgxTv_SdtJOB_Lasterr_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Lasterr_N");
      gxTv_SdtJOB_Lasterr_N = value ;
   }

   public void setgxTv_SdtJOB_Lasterr_N_SetNull( )
   {
      gxTv_SdtJOB_Lasterr_N = (byte)(0) ;
      SetDirty("Lasterr_N");
   }

   public boolean getgxTv_SdtJOB_Lasterr_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Lockid_N( )
   {
      return gxTv_SdtJOB_Lockid_N ;
   }

   public void setgxTv_SdtJOB_Lockid_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Lockid_N");
      gxTv_SdtJOB_Lockid_N = value ;
   }

   public void setgxTv_SdtJOB_Lockid_N_SetNull( )
   {
      gxTv_SdtJOB_Lockid_N = (byte)(0) ;
      SetDirty("Lockid_N");
   }

   public boolean getgxTv_SdtJOB_Lockid_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOB_Lockdt_N( )
   {
      return gxTv_SdtJOB_Lockdt_N ;
   }

   public void setgxTv_SdtJOB_Lockdt_N( byte value )
   {
      gxTv_SdtJOB_N = (byte)(0) ;
      SetDirty("Lockdt_N");
      gxTv_SdtJOB_Lockdt_N = value ;
   }

   public void setgxTv_SdtJOB_Lockdt_N_SetNull( )
   {
      gxTv_SdtJOB_Lockdt_N = (byte)(0) ;
      SetDirty("Lockdt_N");
   }

   public boolean getgxTv_SdtJOB_Lockdt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.asyncbatch.job_bc obj;
      obj = new app.asyncbatch.job_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtJOB_Jobid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      gxTv_SdtJOB_N = (byte)(1) ;
      gxTv_SdtJOB_Jobdesc = "" ;
      gxTv_SdtJOB_Jobtype = "" ;
      gxTv_SdtJOB_Jobexec = "" ;
      gxTv_SdtJOB_Jobstat = "" ;
      gxTv_SdtJOB_Usrcreat = "" ;
      gxTv_SdtJOB_Usrsocket = "" ;
      gxTv_SdtJOB_Dtcreat = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtJOB_Dtstart = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtJOB_Dtend = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtJOB_Curitem = "" ;
      gxTv_SdtJOB_Basepath = "" ;
      gxTv_SdtJOB_Outpath = "" ;
      gxTv_SdtJOB_Zippath = "" ;
      gxTv_SdtJOB_Zipurl = "" ;
      gxTv_SdtJOB_Lasterr = "" ;
      gxTv_SdtJOB_Lockid = "" ;
      gxTv_SdtJOB_Lockdt = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtJOB_Mode = "" ;
      gxTv_SdtJOB_Jobid_Z = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      gxTv_SdtJOB_Jobdesc_Z = "" ;
      gxTv_SdtJOB_Jobtype_Z = "" ;
      gxTv_SdtJOB_Jobexec_Z = "" ;
      gxTv_SdtJOB_Jobstat_Z = "" ;
      gxTv_SdtJOB_Usrcreat_Z = "" ;
      gxTv_SdtJOB_Usrsocket_Z = "" ;
      gxTv_SdtJOB_Dtcreat_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtJOB_Dtstart_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtJOB_Dtend_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtJOB_Curitem_Z = "" ;
      gxTv_SdtJOB_Basepath_Z = "" ;
      gxTv_SdtJOB_Outpath_Z = "" ;
      gxTv_SdtJOB_Zippath_Z = "" ;
      gxTv_SdtJOB_Zipurl_Z = "" ;
      gxTv_SdtJOB_Lockid_Z = "" ;
      gxTv_SdtJOB_Lockdt_Z = GXutil.resetTime( GXutil.nullDate() );
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtJOB_N ;
   }

   public app.asyncbatch.SdtJOB Clone( )
   {
      app.asyncbatch.SdtJOB sdt;
      app.asyncbatch.job_bc obj;
      sdt = (app.asyncbatch.SdtJOB)(clone()) ;
      obj = (app.asyncbatch.job_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.asyncbatch.StructSdtJOB struct )
   {
      setgxTv_SdtJOB_Jobid(struct.getJobid());
      setgxTv_SdtJOB_Jobdesc(struct.getJobdesc());
      setgxTv_SdtJOB_Jobtype(struct.getJobtype());
      setgxTv_SdtJOB_Jobexec(struct.getJobexec());
      setgxTv_SdtJOB_Jobstat(struct.getJobstat());
      setgxTv_SdtJOB_Usrcreat(struct.getUsrcreat());
      setgxTv_SdtJOB_Usrsocket(struct.getUsrsocket());
      setgxTv_SdtJOB_Dtcreat(struct.getDtcreat());
      setgxTv_SdtJOB_Dtstart(struct.getDtstart());
      setgxTv_SdtJOB_Dtend(struct.getDtend());
      setgxTv_SdtJOB_Totitem(struct.getTotitem());
      setgxTv_SdtJOB_Prcitem(struct.getPrcitem());
      setgxTv_SdtJOB_Okitem(struct.getOkitem());
      setgxTv_SdtJOB_Eritem(struct.getEritem());
      setgxTv_SdtJOB_Prgpct(struct.getPrgpct());
      setgxTv_SdtJOB_Curitem(struct.getCuritem());
      setgxTv_SdtJOB_Basepath(struct.getBasepath());
      setgxTv_SdtJOB_Outpath(struct.getOutpath());
      setgxTv_SdtJOB_Zippath(struct.getZippath());
      setgxTv_SdtJOB_Zipurl(struct.getZipurl());
      setgxTv_SdtJOB_Lasterr(struct.getLasterr());
      setgxTv_SdtJOB_Lockid(struct.getLockid());
      setgxTv_SdtJOB_Lockdt(struct.getLockdt());
      setgxTv_SdtJOB_Mode(struct.getMode());
      setgxTv_SdtJOB_Initialized(struct.getInitialized());
      setgxTv_SdtJOB_Jobid_Z(struct.getJobid_Z());
      setgxTv_SdtJOB_Jobdesc_Z(struct.getJobdesc_Z());
      setgxTv_SdtJOB_Jobtype_Z(struct.getJobtype_Z());
      setgxTv_SdtJOB_Jobexec_Z(struct.getJobexec_Z());
      setgxTv_SdtJOB_Jobstat_Z(struct.getJobstat_Z());
      setgxTv_SdtJOB_Usrcreat_Z(struct.getUsrcreat_Z());
      setgxTv_SdtJOB_Usrsocket_Z(struct.getUsrsocket_Z());
      setgxTv_SdtJOB_Dtcreat_Z(struct.getDtcreat_Z());
      setgxTv_SdtJOB_Dtstart_Z(struct.getDtstart_Z());
      setgxTv_SdtJOB_Dtend_Z(struct.getDtend_Z());
      setgxTv_SdtJOB_Totitem_Z(struct.getTotitem_Z());
      setgxTv_SdtJOB_Prcitem_Z(struct.getPrcitem_Z());
      setgxTv_SdtJOB_Okitem_Z(struct.getOkitem_Z());
      setgxTv_SdtJOB_Eritem_Z(struct.getEritem_Z());
      setgxTv_SdtJOB_Prgpct_Z(struct.getPrgpct_Z());
      setgxTv_SdtJOB_Curitem_Z(struct.getCuritem_Z());
      setgxTv_SdtJOB_Basepath_Z(struct.getBasepath_Z());
      setgxTv_SdtJOB_Outpath_Z(struct.getOutpath_Z());
      setgxTv_SdtJOB_Zippath_Z(struct.getZippath_Z());
      setgxTv_SdtJOB_Zipurl_Z(struct.getZipurl_Z());
      setgxTv_SdtJOB_Lockid_Z(struct.getLockid_Z());
      setgxTv_SdtJOB_Lockdt_Z(struct.getLockdt_Z());
      setgxTv_SdtJOB_Jobdesc_N(struct.getJobdesc_N());
      setgxTv_SdtJOB_Jobtype_N(struct.getJobtype_N());
      setgxTv_SdtJOB_Jobexec_N(struct.getJobexec_N());
      setgxTv_SdtJOB_Jobstat_N(struct.getJobstat_N());
      setgxTv_SdtJOB_Usrcreat_N(struct.getUsrcreat_N());
      setgxTv_SdtJOB_Usrsocket_N(struct.getUsrsocket_N());
      setgxTv_SdtJOB_Dtcreat_N(struct.getDtcreat_N());
      setgxTv_SdtJOB_Dtstart_N(struct.getDtstart_N());
      setgxTv_SdtJOB_Dtend_N(struct.getDtend_N());
      setgxTv_SdtJOB_Totitem_N(struct.getTotitem_N());
      setgxTv_SdtJOB_Prcitem_N(struct.getPrcitem_N());
      setgxTv_SdtJOB_Okitem_N(struct.getOkitem_N());
      setgxTv_SdtJOB_Eritem_N(struct.getEritem_N());
      setgxTv_SdtJOB_Prgpct_N(struct.getPrgpct_N());
      setgxTv_SdtJOB_Curitem_N(struct.getCuritem_N());
      setgxTv_SdtJOB_Basepath_N(struct.getBasepath_N());
      setgxTv_SdtJOB_Outpath_N(struct.getOutpath_N());
      setgxTv_SdtJOB_Zippath_N(struct.getZippath_N());
      setgxTv_SdtJOB_Zipurl_N(struct.getZipurl_N());
      setgxTv_SdtJOB_Lasterr_N(struct.getLasterr_N());
      setgxTv_SdtJOB_Lockid_N(struct.getLockid_N());
      setgxTv_SdtJOB_Lockdt_N(struct.getLockdt_N());
   }

   @SuppressWarnings("unchecked")
   public app.asyncbatch.StructSdtJOB getStruct( )
   {
      app.asyncbatch.StructSdtJOB struct = new app.asyncbatch.StructSdtJOB ();
      struct.setJobid(getgxTv_SdtJOB_Jobid());
      struct.setJobdesc(getgxTv_SdtJOB_Jobdesc());
      struct.setJobtype(getgxTv_SdtJOB_Jobtype());
      struct.setJobexec(getgxTv_SdtJOB_Jobexec());
      struct.setJobstat(getgxTv_SdtJOB_Jobstat());
      struct.setUsrcreat(getgxTv_SdtJOB_Usrcreat());
      struct.setUsrsocket(getgxTv_SdtJOB_Usrsocket());
      struct.setDtcreat(getgxTv_SdtJOB_Dtcreat());
      struct.setDtstart(getgxTv_SdtJOB_Dtstart());
      struct.setDtend(getgxTv_SdtJOB_Dtend());
      struct.setTotitem(getgxTv_SdtJOB_Totitem());
      struct.setPrcitem(getgxTv_SdtJOB_Prcitem());
      struct.setOkitem(getgxTv_SdtJOB_Okitem());
      struct.setEritem(getgxTv_SdtJOB_Eritem());
      struct.setPrgpct(getgxTv_SdtJOB_Prgpct());
      struct.setCuritem(getgxTv_SdtJOB_Curitem());
      struct.setBasepath(getgxTv_SdtJOB_Basepath());
      struct.setOutpath(getgxTv_SdtJOB_Outpath());
      struct.setZippath(getgxTv_SdtJOB_Zippath());
      struct.setZipurl(getgxTv_SdtJOB_Zipurl());
      struct.setLasterr(getgxTv_SdtJOB_Lasterr());
      struct.setLockid(getgxTv_SdtJOB_Lockid());
      struct.setLockdt(getgxTv_SdtJOB_Lockdt());
      struct.setMode(getgxTv_SdtJOB_Mode());
      struct.setInitialized(getgxTv_SdtJOB_Initialized());
      struct.setJobid_Z(getgxTv_SdtJOB_Jobid_Z());
      struct.setJobdesc_Z(getgxTv_SdtJOB_Jobdesc_Z());
      struct.setJobtype_Z(getgxTv_SdtJOB_Jobtype_Z());
      struct.setJobexec_Z(getgxTv_SdtJOB_Jobexec_Z());
      struct.setJobstat_Z(getgxTv_SdtJOB_Jobstat_Z());
      struct.setUsrcreat_Z(getgxTv_SdtJOB_Usrcreat_Z());
      struct.setUsrsocket_Z(getgxTv_SdtJOB_Usrsocket_Z());
      struct.setDtcreat_Z(getgxTv_SdtJOB_Dtcreat_Z());
      struct.setDtstart_Z(getgxTv_SdtJOB_Dtstart_Z());
      struct.setDtend_Z(getgxTv_SdtJOB_Dtend_Z());
      struct.setTotitem_Z(getgxTv_SdtJOB_Totitem_Z());
      struct.setPrcitem_Z(getgxTv_SdtJOB_Prcitem_Z());
      struct.setOkitem_Z(getgxTv_SdtJOB_Okitem_Z());
      struct.setEritem_Z(getgxTv_SdtJOB_Eritem_Z());
      struct.setPrgpct_Z(getgxTv_SdtJOB_Prgpct_Z());
      struct.setCuritem_Z(getgxTv_SdtJOB_Curitem_Z());
      struct.setBasepath_Z(getgxTv_SdtJOB_Basepath_Z());
      struct.setOutpath_Z(getgxTv_SdtJOB_Outpath_Z());
      struct.setZippath_Z(getgxTv_SdtJOB_Zippath_Z());
      struct.setZipurl_Z(getgxTv_SdtJOB_Zipurl_Z());
      struct.setLockid_Z(getgxTv_SdtJOB_Lockid_Z());
      struct.setLockdt_Z(getgxTv_SdtJOB_Lockdt_Z());
      struct.setJobdesc_N(getgxTv_SdtJOB_Jobdesc_N());
      struct.setJobtype_N(getgxTv_SdtJOB_Jobtype_N());
      struct.setJobexec_N(getgxTv_SdtJOB_Jobexec_N());
      struct.setJobstat_N(getgxTv_SdtJOB_Jobstat_N());
      struct.setUsrcreat_N(getgxTv_SdtJOB_Usrcreat_N());
      struct.setUsrsocket_N(getgxTv_SdtJOB_Usrsocket_N());
      struct.setDtcreat_N(getgxTv_SdtJOB_Dtcreat_N());
      struct.setDtstart_N(getgxTv_SdtJOB_Dtstart_N());
      struct.setDtend_N(getgxTv_SdtJOB_Dtend_N());
      struct.setTotitem_N(getgxTv_SdtJOB_Totitem_N());
      struct.setPrcitem_N(getgxTv_SdtJOB_Prcitem_N());
      struct.setOkitem_N(getgxTv_SdtJOB_Okitem_N());
      struct.setEritem_N(getgxTv_SdtJOB_Eritem_N());
      struct.setPrgpct_N(getgxTv_SdtJOB_Prgpct_N());
      struct.setCuritem_N(getgxTv_SdtJOB_Curitem_N());
      struct.setBasepath_N(getgxTv_SdtJOB_Basepath_N());
      struct.setOutpath_N(getgxTv_SdtJOB_Outpath_N());
      struct.setZippath_N(getgxTv_SdtJOB_Zippath_N());
      struct.setZipurl_N(getgxTv_SdtJOB_Zipurl_N());
      struct.setLasterr_N(getgxTv_SdtJOB_Lasterr_N());
      struct.setLockid_N(getgxTv_SdtJOB_Lockid_N());
      struct.setLockdt_N(getgxTv_SdtJOB_Lockdt_N());
      return struct ;
   }

   private byte gxTv_SdtJOB_N ;
   private byte gxTv_SdtJOB_Jobdesc_N ;
   private byte gxTv_SdtJOB_Jobtype_N ;
   private byte gxTv_SdtJOB_Jobexec_N ;
   private byte gxTv_SdtJOB_Jobstat_N ;
   private byte gxTv_SdtJOB_Usrcreat_N ;
   private byte gxTv_SdtJOB_Usrsocket_N ;
   private byte gxTv_SdtJOB_Dtcreat_N ;
   private byte gxTv_SdtJOB_Dtstart_N ;
   private byte gxTv_SdtJOB_Dtend_N ;
   private byte gxTv_SdtJOB_Totitem_N ;
   private byte gxTv_SdtJOB_Prcitem_N ;
   private byte gxTv_SdtJOB_Okitem_N ;
   private byte gxTv_SdtJOB_Eritem_N ;
   private byte gxTv_SdtJOB_Prgpct_N ;
   private byte gxTv_SdtJOB_Curitem_N ;
   private byte gxTv_SdtJOB_Basepath_N ;
   private byte gxTv_SdtJOB_Outpath_N ;
   private byte gxTv_SdtJOB_Zippath_N ;
   private byte gxTv_SdtJOB_Zipurl_N ;
   private byte gxTv_SdtJOB_Lasterr_N ;
   private byte gxTv_SdtJOB_Lockid_N ;
   private byte gxTv_SdtJOB_Lockdt_N ;
   private short gxTv_SdtJOB_Prgpct ;
   private short gxTv_SdtJOB_Initialized ;
   private short gxTv_SdtJOB_Prgpct_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtJOB_Totitem ;
   private long gxTv_SdtJOB_Prcitem ;
   private long gxTv_SdtJOB_Okitem ;
   private long gxTv_SdtJOB_Eritem ;
   private long gxTv_SdtJOB_Totitem_Z ;
   private long gxTv_SdtJOB_Prcitem_Z ;
   private long gxTv_SdtJOB_Okitem_Z ;
   private long gxTv_SdtJOB_Eritem_Z ;
   private String gxTv_SdtJOB_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtJOB_Dtcreat ;
   private java.util.Date gxTv_SdtJOB_Dtstart ;
   private java.util.Date gxTv_SdtJOB_Dtend ;
   private java.util.Date gxTv_SdtJOB_Lockdt ;
   private java.util.Date gxTv_SdtJOB_Dtcreat_Z ;
   private java.util.Date gxTv_SdtJOB_Dtstart_Z ;
   private java.util.Date gxTv_SdtJOB_Dtend_Z ;
   private java.util.Date gxTv_SdtJOB_Lockdt_Z ;
   private java.util.Date datetime_STZ ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtJOB_Lasterr ;
   private String gxTv_SdtJOB_Jobdesc ;
   private String gxTv_SdtJOB_Jobtype ;
   private String gxTv_SdtJOB_Jobexec ;
   private String gxTv_SdtJOB_Jobstat ;
   private String gxTv_SdtJOB_Usrcreat ;
   private String gxTv_SdtJOB_Usrsocket ;
   private String gxTv_SdtJOB_Curitem ;
   private String gxTv_SdtJOB_Basepath ;
   private String gxTv_SdtJOB_Outpath ;
   private String gxTv_SdtJOB_Zippath ;
   private String gxTv_SdtJOB_Zipurl ;
   private String gxTv_SdtJOB_Lockid ;
   private String gxTv_SdtJOB_Jobdesc_Z ;
   private String gxTv_SdtJOB_Jobtype_Z ;
   private String gxTv_SdtJOB_Jobexec_Z ;
   private String gxTv_SdtJOB_Jobstat_Z ;
   private String gxTv_SdtJOB_Usrcreat_Z ;
   private String gxTv_SdtJOB_Usrsocket_Z ;
   private String gxTv_SdtJOB_Curitem_Z ;
   private String gxTv_SdtJOB_Basepath_Z ;
   private String gxTv_SdtJOB_Outpath_Z ;
   private String gxTv_SdtJOB_Zippath_Z ;
   private String gxTv_SdtJOB_Zipurl_Z ;
   private String gxTv_SdtJOB_Lockid_Z ;
   private java.util.UUID gxTv_SdtJOB_Jobid ;
   private java.util.UUID gxTv_SdtJOB_Jobid_Z ;
}

