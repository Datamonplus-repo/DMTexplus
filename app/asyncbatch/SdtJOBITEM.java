package app.asyncbatch ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtJOBITEM extends GxSilentTrnSdt
{
   public SdtJOBITEM( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtJOBITEM.class));
   }

   public SdtJOBITEM( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtJOBITEM");
      initialize( remoteHandle) ;
   }

   public SdtJOBITEM( int remoteHandle ,
                      StructSdtJOBITEM struct )
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

   public void Load( java.util.UUID AV14423JobId ,
                     long AV14468ItmId )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV14423JobId,Long.valueOf(AV14468ItmId)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"JobId", java.util.UUID.class}, new Object[]{"ItmId", long.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "AsyncBatch\\JOBITEM");
      metadata.set("BT", "TXPJOBITE");
      metadata.set("PK", "[ \"ItmId\",\"JobId\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"JobId\" ],\"FKMap\":[  ] } ]");
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
               gxTv_SdtJOBITEM_Jobid = GXutil.strToGuid(oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ItmId") )
            {
               gxTv_SdtJOBITEM_Itmid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobType") )
            {
               gxTv_SdtJOBITEM_Jobtype = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocId") )
            {
               gxTv_SdtJOBITEM_Docid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocLbl") )
            {
               gxTv_SdtJOBITEM_Doclbl = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ItmSts") )
            {
               gxTv_SdtJOBITEM_Itmsts = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RetryQt") )
            {
               gxTv_SdtJOBITEM_Retryqt = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ItmDtStart") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtJOBITEM_Itmdtstart = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtJOBITEM_Itmdtstart = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ItmDtEnd") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtJOBITEM_Itmdtend = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtJOBITEM_Itmdtend = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ItmErr") )
            {
               gxTv_SdtJOBITEM_Itmerr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OutFile") )
            {
               gxTv_SdtJOBITEM_Outfile = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OutUrl") )
            {
               gxTv_SdtJOBITEM_Outurl = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FileNm") )
            {
               gxTv_SdtJOBITEM_Filenm = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtJOBITEM_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtJOBITEM_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobId_Z") )
            {
               gxTv_SdtJOBITEM_Jobid_Z = GXutil.strToGuid(oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ItmId_Z") )
            {
               gxTv_SdtJOBITEM_Itmid_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobType_Z") )
            {
               gxTv_SdtJOBITEM_Jobtype_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocId_Z") )
            {
               gxTv_SdtJOBITEM_Docid_Z = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocLbl_Z") )
            {
               gxTv_SdtJOBITEM_Doclbl_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ItmSts_Z") )
            {
               gxTv_SdtJOBITEM_Itmsts_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RetryQt_Z") )
            {
               gxTv_SdtJOBITEM_Retryqt_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ItmDtStart_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtJOBITEM_Itmdtstart_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtJOBITEM_Itmdtstart_Z = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ItmDtEnd_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtJOBITEM_Itmdtend_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtJOBITEM_Itmdtend_Z = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ItmErr_Z") )
            {
               gxTv_SdtJOBITEM_Itmerr_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OutFile_Z") )
            {
               gxTv_SdtJOBITEM_Outfile_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FileNm_Z") )
            {
               gxTv_SdtJOBITEM_Filenm_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobType_N") )
            {
               gxTv_SdtJOBITEM_Jobtype_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocId_N") )
            {
               gxTv_SdtJOBITEM_Docid_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocLbl_N") )
            {
               gxTv_SdtJOBITEM_Doclbl_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ItmSts_N") )
            {
               gxTv_SdtJOBITEM_Itmsts_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RetryQt_N") )
            {
               gxTv_SdtJOBITEM_Retryqt_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ItmDtStart_N") )
            {
               gxTv_SdtJOBITEM_Itmdtstart_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ItmDtEnd_N") )
            {
               gxTv_SdtJOBITEM_Itmdtend_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ItmErr_N") )
            {
               gxTv_SdtJOBITEM_Itmerr_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OutFile_N") )
            {
               gxTv_SdtJOBITEM_Outfile_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OutUrl_N") )
            {
               gxTv_SdtJOBITEM_Outurl_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FileNm_N") )
            {
               gxTv_SdtJOBITEM_Filenm_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "JOBITEM" ;
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
      oWriter.writeElement("JobId", gxTv_SdtJOBITEM_Jobid.toString());
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ItmId", GXutil.trim( GXutil.str( gxTv_SdtJOBITEM_Itmid, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("JobType", gxTv_SdtJOBITEM_Jobtype);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DocId", GXutil.trim( GXutil.str( gxTv_SdtJOBITEM_Docid, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DocLbl", gxTv_SdtJOBITEM_Doclbl);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ItmSts", gxTv_SdtJOBITEM_Itmsts);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RetryQt", GXutil.trim( GXutil.str( gxTv_SdtJOBITEM_Retryqt, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtJOBITEM_Itmdtstart), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtJOBITEM_Itmdtstart), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtJOBITEM_Itmdtstart), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtJOBITEM_Itmdtstart), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtJOBITEM_Itmdtstart), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtJOBITEM_Itmdtstart), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("ItmDtStart", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtJOBITEM_Itmdtend), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtJOBITEM_Itmdtend), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtJOBITEM_Itmdtend), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtJOBITEM_Itmdtend), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtJOBITEM_Itmdtend), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtJOBITEM_Itmdtend), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("ItmDtEnd", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ItmErr", gxTv_SdtJOBITEM_Itmerr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OutFile", gxTv_SdtJOBITEM_Outfile);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OutUrl", gxTv_SdtJOBITEM_Outurl);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FileNm", gxTv_SdtJOBITEM_Filenm);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtJOBITEM_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtJOBITEM_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("JobId_Z", gxTv_SdtJOBITEM_Jobid_Z.toString());
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ItmId_Z", GXutil.trim( GXutil.str( gxTv_SdtJOBITEM_Itmid_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("JobType_Z", gxTv_SdtJOBITEM_Jobtype_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DocId_Z", GXutil.trim( GXutil.str( gxTv_SdtJOBITEM_Docid_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DocLbl_Z", gxTv_SdtJOBITEM_Doclbl_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ItmSts_Z", gxTv_SdtJOBITEM_Itmsts_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("RetryQt_Z", GXutil.trim( GXutil.str( gxTv_SdtJOBITEM_Retryqt_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtJOBITEM_Itmdtstart_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtJOBITEM_Itmdtstart_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtJOBITEM_Itmdtstart_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtJOBITEM_Itmdtstart_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtJOBITEM_Itmdtstart_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtJOBITEM_Itmdtstart_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("ItmDtStart_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtJOBITEM_Itmdtend_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtJOBITEM_Itmdtend_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtJOBITEM_Itmdtend_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtJOBITEM_Itmdtend_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtJOBITEM_Itmdtend_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtJOBITEM_Itmdtend_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("ItmDtEnd_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ItmErr_Z", gxTv_SdtJOBITEM_Itmerr_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("OutFile_Z", gxTv_SdtJOBITEM_Outfile_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("FileNm_Z", gxTv_SdtJOBITEM_Filenm_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("JobType_N", GXutil.trim( GXutil.str( gxTv_SdtJOBITEM_Jobtype_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DocId_N", GXutil.trim( GXutil.str( gxTv_SdtJOBITEM_Docid_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DocLbl_N", GXutil.trim( GXutil.str( gxTv_SdtJOBITEM_Doclbl_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ItmSts_N", GXutil.trim( GXutil.str( gxTv_SdtJOBITEM_Itmsts_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("RetryQt_N", GXutil.trim( GXutil.str( gxTv_SdtJOBITEM_Retryqt_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ItmDtStart_N", GXutil.trim( GXutil.str( gxTv_SdtJOBITEM_Itmdtstart_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ItmDtEnd_N", GXutil.trim( GXutil.str( gxTv_SdtJOBITEM_Itmdtend_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("ItmErr_N", GXutil.trim( GXutil.str( gxTv_SdtJOBITEM_Itmerr_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("OutFile_N", GXutil.trim( GXutil.str( gxTv_SdtJOBITEM_Outfile_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("OutUrl_N", GXutil.trim( GXutil.str( gxTv_SdtJOBITEM_Outurl_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("FileNm_N", GXutil.trim( GXutil.str( gxTv_SdtJOBITEM_Filenm_N, 1, 0)));
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
      AddObjectProperty("JobId", gxTv_SdtJOBITEM_Jobid, false, includeNonInitialized);
      AddObjectProperty("ItmId", gxTv_SdtJOBITEM_Itmid, false, includeNonInitialized);
      AddObjectProperty("JobType", gxTv_SdtJOBITEM_Jobtype, false, includeNonInitialized);
      AddObjectProperty("JobType_N", gxTv_SdtJOBITEM_Jobtype_N, false, includeNonInitialized);
      AddObjectProperty("DocId", gxTv_SdtJOBITEM_Docid, false, includeNonInitialized);
      AddObjectProperty("DocId_N", gxTv_SdtJOBITEM_Docid_N, false, includeNonInitialized);
      AddObjectProperty("DocLbl", gxTv_SdtJOBITEM_Doclbl, false, includeNonInitialized);
      AddObjectProperty("DocLbl_N", gxTv_SdtJOBITEM_Doclbl_N, false, includeNonInitialized);
      AddObjectProperty("ItmSts", gxTv_SdtJOBITEM_Itmsts, false, includeNonInitialized);
      AddObjectProperty("ItmSts_N", gxTv_SdtJOBITEM_Itmsts_N, false, includeNonInitialized);
      AddObjectProperty("RetryQt", gxTv_SdtJOBITEM_Retryqt, false, includeNonInitialized);
      AddObjectProperty("RetryQt_N", gxTv_SdtJOBITEM_Retryqt_N, false, includeNonInitialized);
      datetime_STZ = gxTv_SdtJOBITEM_Itmdtstart ;
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
      AddObjectProperty("ItmDtStart", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("ItmDtStart_N", gxTv_SdtJOBITEM_Itmdtstart_N, false, includeNonInitialized);
      datetime_STZ = gxTv_SdtJOBITEM_Itmdtend ;
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
      AddObjectProperty("ItmDtEnd", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("ItmDtEnd_N", gxTv_SdtJOBITEM_Itmdtend_N, false, includeNonInitialized);
      AddObjectProperty("ItmErr", gxTv_SdtJOBITEM_Itmerr, false, includeNonInitialized);
      AddObjectProperty("ItmErr_N", gxTv_SdtJOBITEM_Itmerr_N, false, includeNonInitialized);
      AddObjectProperty("OutFile", gxTv_SdtJOBITEM_Outfile, false, includeNonInitialized);
      AddObjectProperty("OutFile_N", gxTv_SdtJOBITEM_Outfile_N, false, includeNonInitialized);
      AddObjectProperty("OutUrl", gxTv_SdtJOBITEM_Outurl, false, includeNonInitialized);
      AddObjectProperty("OutUrl_N", gxTv_SdtJOBITEM_Outurl_N, false, includeNonInitialized);
      AddObjectProperty("FileNm", gxTv_SdtJOBITEM_Filenm, false, includeNonInitialized);
      AddObjectProperty("FileNm_N", gxTv_SdtJOBITEM_Filenm_N, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtJOBITEM_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtJOBITEM_Initialized, false, includeNonInitialized);
         AddObjectProperty("JobId_Z", gxTv_SdtJOBITEM_Jobid_Z, false, includeNonInitialized);
         AddObjectProperty("ItmId_Z", gxTv_SdtJOBITEM_Itmid_Z, false, includeNonInitialized);
         AddObjectProperty("JobType_Z", gxTv_SdtJOBITEM_Jobtype_Z, false, includeNonInitialized);
         AddObjectProperty("DocId_Z", gxTv_SdtJOBITEM_Docid_Z, false, includeNonInitialized);
         AddObjectProperty("DocLbl_Z", gxTv_SdtJOBITEM_Doclbl_Z, false, includeNonInitialized);
         AddObjectProperty("ItmSts_Z", gxTv_SdtJOBITEM_Itmsts_Z, false, includeNonInitialized);
         AddObjectProperty("RetryQt_Z", gxTv_SdtJOBITEM_Retryqt_Z, false, includeNonInitialized);
         datetime_STZ = gxTv_SdtJOBITEM_Itmdtstart_Z ;
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
         AddObjectProperty("ItmDtStart_Z", sDateCnv, false, includeNonInitialized);
         datetime_STZ = gxTv_SdtJOBITEM_Itmdtend_Z ;
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
         AddObjectProperty("ItmDtEnd_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("ItmErr_Z", gxTv_SdtJOBITEM_Itmerr_Z, false, includeNonInitialized);
         AddObjectProperty("OutFile_Z", gxTv_SdtJOBITEM_Outfile_Z, false, includeNonInitialized);
         AddObjectProperty("FileNm_Z", gxTv_SdtJOBITEM_Filenm_Z, false, includeNonInitialized);
         AddObjectProperty("JobType_N", gxTv_SdtJOBITEM_Jobtype_N, false, includeNonInitialized);
         AddObjectProperty("DocId_N", gxTv_SdtJOBITEM_Docid_N, false, includeNonInitialized);
         AddObjectProperty("DocLbl_N", gxTv_SdtJOBITEM_Doclbl_N, false, includeNonInitialized);
         AddObjectProperty("ItmSts_N", gxTv_SdtJOBITEM_Itmsts_N, false, includeNonInitialized);
         AddObjectProperty("RetryQt_N", gxTv_SdtJOBITEM_Retryqt_N, false, includeNonInitialized);
         AddObjectProperty("ItmDtStart_N", gxTv_SdtJOBITEM_Itmdtstart_N, false, includeNonInitialized);
         AddObjectProperty("ItmDtEnd_N", gxTv_SdtJOBITEM_Itmdtend_N, false, includeNonInitialized);
         AddObjectProperty("ItmErr_N", gxTv_SdtJOBITEM_Itmerr_N, false, includeNonInitialized);
         AddObjectProperty("OutFile_N", gxTv_SdtJOBITEM_Outfile_N, false, includeNonInitialized);
         AddObjectProperty("OutUrl_N", gxTv_SdtJOBITEM_Outurl_N, false, includeNonInitialized);
         AddObjectProperty("FileNm_N", gxTv_SdtJOBITEM_Filenm_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.asyncbatch.SdtJOBITEM sdt )
   {
      if ( sdt.IsDirty("JobId") )
      {
         gxTv_SdtJOBITEM_N = (byte)(0) ;
         gxTv_SdtJOBITEM_Jobid = sdt.getgxTv_SdtJOBITEM_Jobid() ;
      }
      if ( sdt.IsDirty("ItmId") )
      {
         gxTv_SdtJOBITEM_N = (byte)(0) ;
         gxTv_SdtJOBITEM_Itmid = sdt.getgxTv_SdtJOBITEM_Itmid() ;
      }
      if ( sdt.IsDirty("JobType") )
      {
         gxTv_SdtJOBITEM_Jobtype_N = sdt.getgxTv_SdtJOBITEM_Jobtype_N() ;
         gxTv_SdtJOBITEM_N = (byte)(0) ;
         gxTv_SdtJOBITEM_Jobtype = sdt.getgxTv_SdtJOBITEM_Jobtype() ;
      }
      if ( sdt.IsDirty("DocId") )
      {
         gxTv_SdtJOBITEM_Docid_N = sdt.getgxTv_SdtJOBITEM_Docid_N() ;
         gxTv_SdtJOBITEM_N = (byte)(0) ;
         gxTv_SdtJOBITEM_Docid = sdt.getgxTv_SdtJOBITEM_Docid() ;
      }
      if ( sdt.IsDirty("DocLbl") )
      {
         gxTv_SdtJOBITEM_Doclbl_N = sdt.getgxTv_SdtJOBITEM_Doclbl_N() ;
         gxTv_SdtJOBITEM_N = (byte)(0) ;
         gxTv_SdtJOBITEM_Doclbl = sdt.getgxTv_SdtJOBITEM_Doclbl() ;
      }
      if ( sdt.IsDirty("ItmSts") )
      {
         gxTv_SdtJOBITEM_Itmsts_N = sdt.getgxTv_SdtJOBITEM_Itmsts_N() ;
         gxTv_SdtJOBITEM_N = (byte)(0) ;
         gxTv_SdtJOBITEM_Itmsts = sdt.getgxTv_SdtJOBITEM_Itmsts() ;
      }
      if ( sdt.IsDirty("RetryQt") )
      {
         gxTv_SdtJOBITEM_Retryqt_N = sdt.getgxTv_SdtJOBITEM_Retryqt_N() ;
         gxTv_SdtJOBITEM_N = (byte)(0) ;
         gxTv_SdtJOBITEM_Retryqt = sdt.getgxTv_SdtJOBITEM_Retryqt() ;
      }
      if ( sdt.IsDirty("ItmDtStart") )
      {
         gxTv_SdtJOBITEM_Itmdtstart_N = sdt.getgxTv_SdtJOBITEM_Itmdtstart_N() ;
         gxTv_SdtJOBITEM_N = (byte)(0) ;
         gxTv_SdtJOBITEM_Itmdtstart = sdt.getgxTv_SdtJOBITEM_Itmdtstart() ;
      }
      if ( sdt.IsDirty("ItmDtEnd") )
      {
         gxTv_SdtJOBITEM_Itmdtend_N = sdt.getgxTv_SdtJOBITEM_Itmdtend_N() ;
         gxTv_SdtJOBITEM_N = (byte)(0) ;
         gxTv_SdtJOBITEM_Itmdtend = sdt.getgxTv_SdtJOBITEM_Itmdtend() ;
      }
      if ( sdt.IsDirty("ItmErr") )
      {
         gxTv_SdtJOBITEM_Itmerr_N = sdt.getgxTv_SdtJOBITEM_Itmerr_N() ;
         gxTv_SdtJOBITEM_N = (byte)(0) ;
         gxTv_SdtJOBITEM_Itmerr = sdt.getgxTv_SdtJOBITEM_Itmerr() ;
      }
      if ( sdt.IsDirty("OutFile") )
      {
         gxTv_SdtJOBITEM_Outfile_N = sdt.getgxTv_SdtJOBITEM_Outfile_N() ;
         gxTv_SdtJOBITEM_N = (byte)(0) ;
         gxTv_SdtJOBITEM_Outfile = sdt.getgxTv_SdtJOBITEM_Outfile() ;
      }
      if ( sdt.IsDirty("OutUrl") )
      {
         gxTv_SdtJOBITEM_Outurl_N = sdt.getgxTv_SdtJOBITEM_Outurl_N() ;
         gxTv_SdtJOBITEM_N = (byte)(0) ;
         gxTv_SdtJOBITEM_Outurl = sdt.getgxTv_SdtJOBITEM_Outurl() ;
      }
      if ( sdt.IsDirty("FileNm") )
      {
         gxTv_SdtJOBITEM_Filenm_N = sdt.getgxTv_SdtJOBITEM_Filenm_N() ;
         gxTv_SdtJOBITEM_N = (byte)(0) ;
         gxTv_SdtJOBITEM_Filenm = sdt.getgxTv_SdtJOBITEM_Filenm() ;
      }
   }

   public java.util.UUID getgxTv_SdtJOBITEM_Jobid( )
   {
      return gxTv_SdtJOBITEM_Jobid ;
   }

   public void setgxTv_SdtJOBITEM_Jobid( java.util.UUID value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      if ( !( gxTv_SdtJOBITEM_Jobid.equals( value ) ) )
      {
         gxTv_SdtJOBITEM_Mode = "INS" ;
         this.setgxTv_SdtJOBITEM_Jobid_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Itmid_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Jobtype_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Docid_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Doclbl_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Itmsts_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Retryqt_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Itmdtstart_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Itmdtend_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Itmerr_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Outfile_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Filenm_Z_SetNull( );
      }
      SetDirty("Jobid");
      gxTv_SdtJOBITEM_Jobid = value ;
   }

   public long getgxTv_SdtJOBITEM_Itmid( )
   {
      return gxTv_SdtJOBITEM_Itmid ;
   }

   public void setgxTv_SdtJOBITEM_Itmid( long value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      if ( gxTv_SdtJOBITEM_Itmid != value )
      {
         gxTv_SdtJOBITEM_Mode = "INS" ;
         this.setgxTv_SdtJOBITEM_Jobid_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Itmid_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Jobtype_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Docid_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Doclbl_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Itmsts_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Retryqt_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Itmdtstart_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Itmdtend_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Itmerr_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Outfile_Z_SetNull( );
         this.setgxTv_SdtJOBITEM_Filenm_Z_SetNull( );
      }
      SetDirty("Itmid");
      gxTv_SdtJOBITEM_Itmid = value ;
   }

   public String getgxTv_SdtJOBITEM_Jobtype( )
   {
      return gxTv_SdtJOBITEM_Jobtype ;
   }

   public void setgxTv_SdtJOBITEM_Jobtype( String value )
   {
      gxTv_SdtJOBITEM_Jobtype_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Jobtype");
      gxTv_SdtJOBITEM_Jobtype = value ;
   }

   public void setgxTv_SdtJOBITEM_Jobtype_SetNull( )
   {
      gxTv_SdtJOBITEM_Jobtype_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Jobtype = "" ;
      SetDirty("Jobtype");
   }

   public boolean getgxTv_SdtJOBITEM_Jobtype_IsNull( )
   {
      return (gxTv_SdtJOBITEM_Jobtype_N==1) ;
   }

   public long getgxTv_SdtJOBITEM_Docid( )
   {
      return gxTv_SdtJOBITEM_Docid ;
   }

   public void setgxTv_SdtJOBITEM_Docid( long value )
   {
      gxTv_SdtJOBITEM_Docid_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Docid");
      gxTv_SdtJOBITEM_Docid = value ;
   }

   public void setgxTv_SdtJOBITEM_Docid_SetNull( )
   {
      gxTv_SdtJOBITEM_Docid_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Docid = 0 ;
      SetDirty("Docid");
   }

   public boolean getgxTv_SdtJOBITEM_Docid_IsNull( )
   {
      return (gxTv_SdtJOBITEM_Docid_N==1) ;
   }

   public String getgxTv_SdtJOBITEM_Doclbl( )
   {
      return gxTv_SdtJOBITEM_Doclbl ;
   }

   public void setgxTv_SdtJOBITEM_Doclbl( String value )
   {
      gxTv_SdtJOBITEM_Doclbl_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Doclbl");
      gxTv_SdtJOBITEM_Doclbl = value ;
   }

   public void setgxTv_SdtJOBITEM_Doclbl_SetNull( )
   {
      gxTv_SdtJOBITEM_Doclbl_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Doclbl = "" ;
      SetDirty("Doclbl");
   }

   public boolean getgxTv_SdtJOBITEM_Doclbl_IsNull( )
   {
      return (gxTv_SdtJOBITEM_Doclbl_N==1) ;
   }

   public String getgxTv_SdtJOBITEM_Itmsts( )
   {
      return gxTv_SdtJOBITEM_Itmsts ;
   }

   public void setgxTv_SdtJOBITEM_Itmsts( String value )
   {
      gxTv_SdtJOBITEM_Itmsts_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Itmsts");
      gxTv_SdtJOBITEM_Itmsts = value ;
   }

   public void setgxTv_SdtJOBITEM_Itmsts_SetNull( )
   {
      gxTv_SdtJOBITEM_Itmsts_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Itmsts = "" ;
      SetDirty("Itmsts");
   }

   public boolean getgxTv_SdtJOBITEM_Itmsts_IsNull( )
   {
      return (gxTv_SdtJOBITEM_Itmsts_N==1) ;
   }

   public short getgxTv_SdtJOBITEM_Retryqt( )
   {
      return gxTv_SdtJOBITEM_Retryqt ;
   }

   public void setgxTv_SdtJOBITEM_Retryqt( short value )
   {
      gxTv_SdtJOBITEM_Retryqt_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Retryqt");
      gxTv_SdtJOBITEM_Retryqt = value ;
   }

   public void setgxTv_SdtJOBITEM_Retryqt_SetNull( )
   {
      gxTv_SdtJOBITEM_Retryqt_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Retryqt = (short)(0) ;
      SetDirty("Retryqt");
   }

   public boolean getgxTv_SdtJOBITEM_Retryqt_IsNull( )
   {
      return (gxTv_SdtJOBITEM_Retryqt_N==1) ;
   }

   public java.util.Date getgxTv_SdtJOBITEM_Itmdtstart( )
   {
      return gxTv_SdtJOBITEM_Itmdtstart ;
   }

   public void setgxTv_SdtJOBITEM_Itmdtstart( java.util.Date value )
   {
      gxTv_SdtJOBITEM_Itmdtstart_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Itmdtstart");
      gxTv_SdtJOBITEM_Itmdtstart = value ;
   }

   public void setgxTv_SdtJOBITEM_Itmdtstart_SetNull( )
   {
      gxTv_SdtJOBITEM_Itmdtstart_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Itmdtstart = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Itmdtstart");
   }

   public boolean getgxTv_SdtJOBITEM_Itmdtstart_IsNull( )
   {
      return (gxTv_SdtJOBITEM_Itmdtstart_N==1) ;
   }

   public java.util.Date getgxTv_SdtJOBITEM_Itmdtend( )
   {
      return gxTv_SdtJOBITEM_Itmdtend ;
   }

   public void setgxTv_SdtJOBITEM_Itmdtend( java.util.Date value )
   {
      gxTv_SdtJOBITEM_Itmdtend_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Itmdtend");
      gxTv_SdtJOBITEM_Itmdtend = value ;
   }

   public void setgxTv_SdtJOBITEM_Itmdtend_SetNull( )
   {
      gxTv_SdtJOBITEM_Itmdtend_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Itmdtend = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Itmdtend");
   }

   public boolean getgxTv_SdtJOBITEM_Itmdtend_IsNull( )
   {
      return (gxTv_SdtJOBITEM_Itmdtend_N==1) ;
   }

   public String getgxTv_SdtJOBITEM_Itmerr( )
   {
      return gxTv_SdtJOBITEM_Itmerr ;
   }

   public void setgxTv_SdtJOBITEM_Itmerr( String value )
   {
      gxTv_SdtJOBITEM_Itmerr_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Itmerr");
      gxTv_SdtJOBITEM_Itmerr = value ;
   }

   public void setgxTv_SdtJOBITEM_Itmerr_SetNull( )
   {
      gxTv_SdtJOBITEM_Itmerr_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Itmerr = "" ;
      SetDirty("Itmerr");
   }

   public boolean getgxTv_SdtJOBITEM_Itmerr_IsNull( )
   {
      return (gxTv_SdtJOBITEM_Itmerr_N==1) ;
   }

   public String getgxTv_SdtJOBITEM_Outfile( )
   {
      return gxTv_SdtJOBITEM_Outfile ;
   }

   public void setgxTv_SdtJOBITEM_Outfile( String value )
   {
      gxTv_SdtJOBITEM_Outfile_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Outfile");
      gxTv_SdtJOBITEM_Outfile = value ;
   }

   public void setgxTv_SdtJOBITEM_Outfile_SetNull( )
   {
      gxTv_SdtJOBITEM_Outfile_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Outfile = "" ;
      SetDirty("Outfile");
   }

   public boolean getgxTv_SdtJOBITEM_Outfile_IsNull( )
   {
      return (gxTv_SdtJOBITEM_Outfile_N==1) ;
   }

   public String getgxTv_SdtJOBITEM_Outurl( )
   {
      return gxTv_SdtJOBITEM_Outurl ;
   }

   public void setgxTv_SdtJOBITEM_Outurl( String value )
   {
      gxTv_SdtJOBITEM_Outurl_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Outurl");
      gxTv_SdtJOBITEM_Outurl = value ;
   }

   public void setgxTv_SdtJOBITEM_Outurl_SetNull( )
   {
      gxTv_SdtJOBITEM_Outurl_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Outurl = "" ;
      SetDirty("Outurl");
   }

   public boolean getgxTv_SdtJOBITEM_Outurl_IsNull( )
   {
      return (gxTv_SdtJOBITEM_Outurl_N==1) ;
   }

   public String getgxTv_SdtJOBITEM_Filenm( )
   {
      return gxTv_SdtJOBITEM_Filenm ;
   }

   public void setgxTv_SdtJOBITEM_Filenm( String value )
   {
      gxTv_SdtJOBITEM_Filenm_N = (byte)(0) ;
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Filenm");
      gxTv_SdtJOBITEM_Filenm = value ;
   }

   public void setgxTv_SdtJOBITEM_Filenm_SetNull( )
   {
      gxTv_SdtJOBITEM_Filenm_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Filenm = "" ;
      SetDirty("Filenm");
   }

   public boolean getgxTv_SdtJOBITEM_Filenm_IsNull( )
   {
      return (gxTv_SdtJOBITEM_Filenm_N==1) ;
   }

   public String getgxTv_SdtJOBITEM_Mode( )
   {
      return gxTv_SdtJOBITEM_Mode ;
   }

   public void setgxTv_SdtJOBITEM_Mode( String value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtJOBITEM_Mode = value ;
   }

   public void setgxTv_SdtJOBITEM_Mode_SetNull( )
   {
      gxTv_SdtJOBITEM_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtJOBITEM_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtJOBITEM_Initialized( )
   {
      return gxTv_SdtJOBITEM_Initialized ;
   }

   public void setgxTv_SdtJOBITEM_Initialized( short value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtJOBITEM_Initialized = value ;
   }

   public void setgxTv_SdtJOBITEM_Initialized_SetNull( )
   {
      gxTv_SdtJOBITEM_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtJOBITEM_Initialized_IsNull( )
   {
      return false ;
   }

   public java.util.UUID getgxTv_SdtJOBITEM_Jobid_Z( )
   {
      return gxTv_SdtJOBITEM_Jobid_Z ;
   }

   public void setgxTv_SdtJOBITEM_Jobid_Z( java.util.UUID value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Jobid_Z");
      gxTv_SdtJOBITEM_Jobid_Z = value ;
   }

   public void setgxTv_SdtJOBITEM_Jobid_Z_SetNull( )
   {
      gxTv_SdtJOBITEM_Jobid_Z = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      SetDirty("Jobid_Z");
   }

   public boolean getgxTv_SdtJOBITEM_Jobid_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtJOBITEM_Itmid_Z( )
   {
      return gxTv_SdtJOBITEM_Itmid_Z ;
   }

   public void setgxTv_SdtJOBITEM_Itmid_Z( long value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Itmid_Z");
      gxTv_SdtJOBITEM_Itmid_Z = value ;
   }

   public void setgxTv_SdtJOBITEM_Itmid_Z_SetNull( )
   {
      gxTv_SdtJOBITEM_Itmid_Z = 0 ;
      SetDirty("Itmid_Z");
   }

   public boolean getgxTv_SdtJOBITEM_Itmid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtJOBITEM_Jobtype_Z( )
   {
      return gxTv_SdtJOBITEM_Jobtype_Z ;
   }

   public void setgxTv_SdtJOBITEM_Jobtype_Z( String value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Jobtype_Z");
      gxTv_SdtJOBITEM_Jobtype_Z = value ;
   }

   public void setgxTv_SdtJOBITEM_Jobtype_Z_SetNull( )
   {
      gxTv_SdtJOBITEM_Jobtype_Z = "" ;
      SetDirty("Jobtype_Z");
   }

   public boolean getgxTv_SdtJOBITEM_Jobtype_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtJOBITEM_Docid_Z( )
   {
      return gxTv_SdtJOBITEM_Docid_Z ;
   }

   public void setgxTv_SdtJOBITEM_Docid_Z( long value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Docid_Z");
      gxTv_SdtJOBITEM_Docid_Z = value ;
   }

   public void setgxTv_SdtJOBITEM_Docid_Z_SetNull( )
   {
      gxTv_SdtJOBITEM_Docid_Z = 0 ;
      SetDirty("Docid_Z");
   }

   public boolean getgxTv_SdtJOBITEM_Docid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtJOBITEM_Doclbl_Z( )
   {
      return gxTv_SdtJOBITEM_Doclbl_Z ;
   }

   public void setgxTv_SdtJOBITEM_Doclbl_Z( String value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Doclbl_Z");
      gxTv_SdtJOBITEM_Doclbl_Z = value ;
   }

   public void setgxTv_SdtJOBITEM_Doclbl_Z_SetNull( )
   {
      gxTv_SdtJOBITEM_Doclbl_Z = "" ;
      SetDirty("Doclbl_Z");
   }

   public boolean getgxTv_SdtJOBITEM_Doclbl_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtJOBITEM_Itmsts_Z( )
   {
      return gxTv_SdtJOBITEM_Itmsts_Z ;
   }

   public void setgxTv_SdtJOBITEM_Itmsts_Z( String value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Itmsts_Z");
      gxTv_SdtJOBITEM_Itmsts_Z = value ;
   }

   public void setgxTv_SdtJOBITEM_Itmsts_Z_SetNull( )
   {
      gxTv_SdtJOBITEM_Itmsts_Z = "" ;
      SetDirty("Itmsts_Z");
   }

   public boolean getgxTv_SdtJOBITEM_Itmsts_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtJOBITEM_Retryqt_Z( )
   {
      return gxTv_SdtJOBITEM_Retryqt_Z ;
   }

   public void setgxTv_SdtJOBITEM_Retryqt_Z( short value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Retryqt_Z");
      gxTv_SdtJOBITEM_Retryqt_Z = value ;
   }

   public void setgxTv_SdtJOBITEM_Retryqt_Z_SetNull( )
   {
      gxTv_SdtJOBITEM_Retryqt_Z = (short)(0) ;
      SetDirty("Retryqt_Z");
   }

   public boolean getgxTv_SdtJOBITEM_Retryqt_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtJOBITEM_Itmdtstart_Z( )
   {
      return gxTv_SdtJOBITEM_Itmdtstart_Z ;
   }

   public void setgxTv_SdtJOBITEM_Itmdtstart_Z( java.util.Date value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Itmdtstart_Z");
      gxTv_SdtJOBITEM_Itmdtstart_Z = value ;
   }

   public void setgxTv_SdtJOBITEM_Itmdtstart_Z_SetNull( )
   {
      gxTv_SdtJOBITEM_Itmdtstart_Z = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Itmdtstart_Z");
   }

   public boolean getgxTv_SdtJOBITEM_Itmdtstart_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtJOBITEM_Itmdtend_Z( )
   {
      return gxTv_SdtJOBITEM_Itmdtend_Z ;
   }

   public void setgxTv_SdtJOBITEM_Itmdtend_Z( java.util.Date value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Itmdtend_Z");
      gxTv_SdtJOBITEM_Itmdtend_Z = value ;
   }

   public void setgxTv_SdtJOBITEM_Itmdtend_Z_SetNull( )
   {
      gxTv_SdtJOBITEM_Itmdtend_Z = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Itmdtend_Z");
   }

   public boolean getgxTv_SdtJOBITEM_Itmdtend_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtJOBITEM_Itmerr_Z( )
   {
      return gxTv_SdtJOBITEM_Itmerr_Z ;
   }

   public void setgxTv_SdtJOBITEM_Itmerr_Z( String value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Itmerr_Z");
      gxTv_SdtJOBITEM_Itmerr_Z = value ;
   }

   public void setgxTv_SdtJOBITEM_Itmerr_Z_SetNull( )
   {
      gxTv_SdtJOBITEM_Itmerr_Z = "" ;
      SetDirty("Itmerr_Z");
   }

   public boolean getgxTv_SdtJOBITEM_Itmerr_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtJOBITEM_Outfile_Z( )
   {
      return gxTv_SdtJOBITEM_Outfile_Z ;
   }

   public void setgxTv_SdtJOBITEM_Outfile_Z( String value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Outfile_Z");
      gxTv_SdtJOBITEM_Outfile_Z = value ;
   }

   public void setgxTv_SdtJOBITEM_Outfile_Z_SetNull( )
   {
      gxTv_SdtJOBITEM_Outfile_Z = "" ;
      SetDirty("Outfile_Z");
   }

   public boolean getgxTv_SdtJOBITEM_Outfile_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtJOBITEM_Filenm_Z( )
   {
      return gxTv_SdtJOBITEM_Filenm_Z ;
   }

   public void setgxTv_SdtJOBITEM_Filenm_Z( String value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Filenm_Z");
      gxTv_SdtJOBITEM_Filenm_Z = value ;
   }

   public void setgxTv_SdtJOBITEM_Filenm_Z_SetNull( )
   {
      gxTv_SdtJOBITEM_Filenm_Z = "" ;
      SetDirty("Filenm_Z");
   }

   public boolean getgxTv_SdtJOBITEM_Filenm_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOBITEM_Jobtype_N( )
   {
      return gxTv_SdtJOBITEM_Jobtype_N ;
   }

   public void setgxTv_SdtJOBITEM_Jobtype_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Jobtype_N");
      gxTv_SdtJOBITEM_Jobtype_N = value ;
   }

   public void setgxTv_SdtJOBITEM_Jobtype_N_SetNull( )
   {
      gxTv_SdtJOBITEM_Jobtype_N = (byte)(0) ;
      SetDirty("Jobtype_N");
   }

   public boolean getgxTv_SdtJOBITEM_Jobtype_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOBITEM_Docid_N( )
   {
      return gxTv_SdtJOBITEM_Docid_N ;
   }

   public void setgxTv_SdtJOBITEM_Docid_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Docid_N");
      gxTv_SdtJOBITEM_Docid_N = value ;
   }

   public void setgxTv_SdtJOBITEM_Docid_N_SetNull( )
   {
      gxTv_SdtJOBITEM_Docid_N = (byte)(0) ;
      SetDirty("Docid_N");
   }

   public boolean getgxTv_SdtJOBITEM_Docid_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOBITEM_Doclbl_N( )
   {
      return gxTv_SdtJOBITEM_Doclbl_N ;
   }

   public void setgxTv_SdtJOBITEM_Doclbl_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Doclbl_N");
      gxTv_SdtJOBITEM_Doclbl_N = value ;
   }

   public void setgxTv_SdtJOBITEM_Doclbl_N_SetNull( )
   {
      gxTv_SdtJOBITEM_Doclbl_N = (byte)(0) ;
      SetDirty("Doclbl_N");
   }

   public boolean getgxTv_SdtJOBITEM_Doclbl_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOBITEM_Itmsts_N( )
   {
      return gxTv_SdtJOBITEM_Itmsts_N ;
   }

   public void setgxTv_SdtJOBITEM_Itmsts_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Itmsts_N");
      gxTv_SdtJOBITEM_Itmsts_N = value ;
   }

   public void setgxTv_SdtJOBITEM_Itmsts_N_SetNull( )
   {
      gxTv_SdtJOBITEM_Itmsts_N = (byte)(0) ;
      SetDirty("Itmsts_N");
   }

   public boolean getgxTv_SdtJOBITEM_Itmsts_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOBITEM_Retryqt_N( )
   {
      return gxTv_SdtJOBITEM_Retryqt_N ;
   }

   public void setgxTv_SdtJOBITEM_Retryqt_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Retryqt_N");
      gxTv_SdtJOBITEM_Retryqt_N = value ;
   }

   public void setgxTv_SdtJOBITEM_Retryqt_N_SetNull( )
   {
      gxTv_SdtJOBITEM_Retryqt_N = (byte)(0) ;
      SetDirty("Retryqt_N");
   }

   public boolean getgxTv_SdtJOBITEM_Retryqt_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOBITEM_Itmdtstart_N( )
   {
      return gxTv_SdtJOBITEM_Itmdtstart_N ;
   }

   public void setgxTv_SdtJOBITEM_Itmdtstart_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Itmdtstart_N");
      gxTv_SdtJOBITEM_Itmdtstart_N = value ;
   }

   public void setgxTv_SdtJOBITEM_Itmdtstart_N_SetNull( )
   {
      gxTv_SdtJOBITEM_Itmdtstart_N = (byte)(0) ;
      SetDirty("Itmdtstart_N");
   }

   public boolean getgxTv_SdtJOBITEM_Itmdtstart_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOBITEM_Itmdtend_N( )
   {
      return gxTv_SdtJOBITEM_Itmdtend_N ;
   }

   public void setgxTv_SdtJOBITEM_Itmdtend_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Itmdtend_N");
      gxTv_SdtJOBITEM_Itmdtend_N = value ;
   }

   public void setgxTv_SdtJOBITEM_Itmdtend_N_SetNull( )
   {
      gxTv_SdtJOBITEM_Itmdtend_N = (byte)(0) ;
      SetDirty("Itmdtend_N");
   }

   public boolean getgxTv_SdtJOBITEM_Itmdtend_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOBITEM_Itmerr_N( )
   {
      return gxTv_SdtJOBITEM_Itmerr_N ;
   }

   public void setgxTv_SdtJOBITEM_Itmerr_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Itmerr_N");
      gxTv_SdtJOBITEM_Itmerr_N = value ;
   }

   public void setgxTv_SdtJOBITEM_Itmerr_N_SetNull( )
   {
      gxTv_SdtJOBITEM_Itmerr_N = (byte)(0) ;
      SetDirty("Itmerr_N");
   }

   public boolean getgxTv_SdtJOBITEM_Itmerr_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOBITEM_Outfile_N( )
   {
      return gxTv_SdtJOBITEM_Outfile_N ;
   }

   public void setgxTv_SdtJOBITEM_Outfile_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Outfile_N");
      gxTv_SdtJOBITEM_Outfile_N = value ;
   }

   public void setgxTv_SdtJOBITEM_Outfile_N_SetNull( )
   {
      gxTv_SdtJOBITEM_Outfile_N = (byte)(0) ;
      SetDirty("Outfile_N");
   }

   public boolean getgxTv_SdtJOBITEM_Outfile_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOBITEM_Outurl_N( )
   {
      return gxTv_SdtJOBITEM_Outurl_N ;
   }

   public void setgxTv_SdtJOBITEM_Outurl_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Outurl_N");
      gxTv_SdtJOBITEM_Outurl_N = value ;
   }

   public void setgxTv_SdtJOBITEM_Outurl_N_SetNull( )
   {
      gxTv_SdtJOBITEM_Outurl_N = (byte)(0) ;
      SetDirty("Outurl_N");
   }

   public boolean getgxTv_SdtJOBITEM_Outurl_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtJOBITEM_Filenm_N( )
   {
      return gxTv_SdtJOBITEM_Filenm_N ;
   }

   public void setgxTv_SdtJOBITEM_Filenm_N( byte value )
   {
      gxTv_SdtJOBITEM_N = (byte)(0) ;
      SetDirty("Filenm_N");
      gxTv_SdtJOBITEM_Filenm_N = value ;
   }

   public void setgxTv_SdtJOBITEM_Filenm_N_SetNull( )
   {
      gxTv_SdtJOBITEM_Filenm_N = (byte)(0) ;
      SetDirty("Filenm_N");
   }

   public boolean getgxTv_SdtJOBITEM_Filenm_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.asyncbatch.jobitem_bc obj;
      obj = new app.asyncbatch.jobitem_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtJOBITEM_Jobid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      gxTv_SdtJOBITEM_N = (byte)(1) ;
      gxTv_SdtJOBITEM_Jobtype = "" ;
      gxTv_SdtJOBITEM_Doclbl = "" ;
      gxTv_SdtJOBITEM_Itmsts = "" ;
      gxTv_SdtJOBITEM_Itmdtstart = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtJOBITEM_Itmdtend = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtJOBITEM_Itmerr = "" ;
      gxTv_SdtJOBITEM_Outfile = "" ;
      gxTv_SdtJOBITEM_Outurl = "" ;
      gxTv_SdtJOBITEM_Filenm = "" ;
      gxTv_SdtJOBITEM_Mode = "" ;
      gxTv_SdtJOBITEM_Jobid_Z = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      gxTv_SdtJOBITEM_Jobtype_Z = "" ;
      gxTv_SdtJOBITEM_Doclbl_Z = "" ;
      gxTv_SdtJOBITEM_Itmsts_Z = "" ;
      gxTv_SdtJOBITEM_Itmdtstart_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtJOBITEM_Itmdtend_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtJOBITEM_Itmerr_Z = "" ;
      gxTv_SdtJOBITEM_Outfile_Z = "" ;
      gxTv_SdtJOBITEM_Filenm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtJOBITEM_N ;
   }

   public app.asyncbatch.SdtJOBITEM Clone( )
   {
      app.asyncbatch.SdtJOBITEM sdt;
      app.asyncbatch.jobitem_bc obj;
      sdt = (app.asyncbatch.SdtJOBITEM)(clone()) ;
      obj = (app.asyncbatch.jobitem_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.asyncbatch.StructSdtJOBITEM struct )
   {
      setgxTv_SdtJOBITEM_Jobid(struct.getJobid());
      setgxTv_SdtJOBITEM_Itmid(struct.getItmid());
      setgxTv_SdtJOBITEM_Jobtype(struct.getJobtype());
      setgxTv_SdtJOBITEM_Docid(struct.getDocid());
      setgxTv_SdtJOBITEM_Doclbl(struct.getDoclbl());
      setgxTv_SdtJOBITEM_Itmsts(struct.getItmsts());
      setgxTv_SdtJOBITEM_Retryqt(struct.getRetryqt());
      setgxTv_SdtJOBITEM_Itmdtstart(struct.getItmdtstart());
      setgxTv_SdtJOBITEM_Itmdtend(struct.getItmdtend());
      setgxTv_SdtJOBITEM_Itmerr(struct.getItmerr());
      setgxTv_SdtJOBITEM_Outfile(struct.getOutfile());
      setgxTv_SdtJOBITEM_Outurl(struct.getOuturl());
      setgxTv_SdtJOBITEM_Filenm(struct.getFilenm());
      setgxTv_SdtJOBITEM_Mode(struct.getMode());
      setgxTv_SdtJOBITEM_Initialized(struct.getInitialized());
      setgxTv_SdtJOBITEM_Jobid_Z(struct.getJobid_Z());
      setgxTv_SdtJOBITEM_Itmid_Z(struct.getItmid_Z());
      setgxTv_SdtJOBITEM_Jobtype_Z(struct.getJobtype_Z());
      setgxTv_SdtJOBITEM_Docid_Z(struct.getDocid_Z());
      setgxTv_SdtJOBITEM_Doclbl_Z(struct.getDoclbl_Z());
      setgxTv_SdtJOBITEM_Itmsts_Z(struct.getItmsts_Z());
      setgxTv_SdtJOBITEM_Retryqt_Z(struct.getRetryqt_Z());
      setgxTv_SdtJOBITEM_Itmdtstart_Z(struct.getItmdtstart_Z());
      setgxTv_SdtJOBITEM_Itmdtend_Z(struct.getItmdtend_Z());
      setgxTv_SdtJOBITEM_Itmerr_Z(struct.getItmerr_Z());
      setgxTv_SdtJOBITEM_Outfile_Z(struct.getOutfile_Z());
      setgxTv_SdtJOBITEM_Filenm_Z(struct.getFilenm_Z());
      setgxTv_SdtJOBITEM_Jobtype_N(struct.getJobtype_N());
      setgxTv_SdtJOBITEM_Docid_N(struct.getDocid_N());
      setgxTv_SdtJOBITEM_Doclbl_N(struct.getDoclbl_N());
      setgxTv_SdtJOBITEM_Itmsts_N(struct.getItmsts_N());
      setgxTv_SdtJOBITEM_Retryqt_N(struct.getRetryqt_N());
      setgxTv_SdtJOBITEM_Itmdtstart_N(struct.getItmdtstart_N());
      setgxTv_SdtJOBITEM_Itmdtend_N(struct.getItmdtend_N());
      setgxTv_SdtJOBITEM_Itmerr_N(struct.getItmerr_N());
      setgxTv_SdtJOBITEM_Outfile_N(struct.getOutfile_N());
      setgxTv_SdtJOBITEM_Outurl_N(struct.getOuturl_N());
      setgxTv_SdtJOBITEM_Filenm_N(struct.getFilenm_N());
   }

   @SuppressWarnings("unchecked")
   public app.asyncbatch.StructSdtJOBITEM getStruct( )
   {
      app.asyncbatch.StructSdtJOBITEM struct = new app.asyncbatch.StructSdtJOBITEM ();
      struct.setJobid(getgxTv_SdtJOBITEM_Jobid());
      struct.setItmid(getgxTv_SdtJOBITEM_Itmid());
      struct.setJobtype(getgxTv_SdtJOBITEM_Jobtype());
      struct.setDocid(getgxTv_SdtJOBITEM_Docid());
      struct.setDoclbl(getgxTv_SdtJOBITEM_Doclbl());
      struct.setItmsts(getgxTv_SdtJOBITEM_Itmsts());
      struct.setRetryqt(getgxTv_SdtJOBITEM_Retryqt());
      struct.setItmdtstart(getgxTv_SdtJOBITEM_Itmdtstart());
      struct.setItmdtend(getgxTv_SdtJOBITEM_Itmdtend());
      struct.setItmerr(getgxTv_SdtJOBITEM_Itmerr());
      struct.setOutfile(getgxTv_SdtJOBITEM_Outfile());
      struct.setOuturl(getgxTv_SdtJOBITEM_Outurl());
      struct.setFilenm(getgxTv_SdtJOBITEM_Filenm());
      struct.setMode(getgxTv_SdtJOBITEM_Mode());
      struct.setInitialized(getgxTv_SdtJOBITEM_Initialized());
      struct.setJobid_Z(getgxTv_SdtJOBITEM_Jobid_Z());
      struct.setItmid_Z(getgxTv_SdtJOBITEM_Itmid_Z());
      struct.setJobtype_Z(getgxTv_SdtJOBITEM_Jobtype_Z());
      struct.setDocid_Z(getgxTv_SdtJOBITEM_Docid_Z());
      struct.setDoclbl_Z(getgxTv_SdtJOBITEM_Doclbl_Z());
      struct.setItmsts_Z(getgxTv_SdtJOBITEM_Itmsts_Z());
      struct.setRetryqt_Z(getgxTv_SdtJOBITEM_Retryqt_Z());
      struct.setItmdtstart_Z(getgxTv_SdtJOBITEM_Itmdtstart_Z());
      struct.setItmdtend_Z(getgxTv_SdtJOBITEM_Itmdtend_Z());
      struct.setItmerr_Z(getgxTv_SdtJOBITEM_Itmerr_Z());
      struct.setOutfile_Z(getgxTv_SdtJOBITEM_Outfile_Z());
      struct.setFilenm_Z(getgxTv_SdtJOBITEM_Filenm_Z());
      struct.setJobtype_N(getgxTv_SdtJOBITEM_Jobtype_N());
      struct.setDocid_N(getgxTv_SdtJOBITEM_Docid_N());
      struct.setDoclbl_N(getgxTv_SdtJOBITEM_Doclbl_N());
      struct.setItmsts_N(getgxTv_SdtJOBITEM_Itmsts_N());
      struct.setRetryqt_N(getgxTv_SdtJOBITEM_Retryqt_N());
      struct.setItmdtstart_N(getgxTv_SdtJOBITEM_Itmdtstart_N());
      struct.setItmdtend_N(getgxTv_SdtJOBITEM_Itmdtend_N());
      struct.setItmerr_N(getgxTv_SdtJOBITEM_Itmerr_N());
      struct.setOutfile_N(getgxTv_SdtJOBITEM_Outfile_N());
      struct.setOuturl_N(getgxTv_SdtJOBITEM_Outurl_N());
      struct.setFilenm_N(getgxTv_SdtJOBITEM_Filenm_N());
      return struct ;
   }

   private byte gxTv_SdtJOBITEM_N ;
   private byte gxTv_SdtJOBITEM_Jobtype_N ;
   private byte gxTv_SdtJOBITEM_Docid_N ;
   private byte gxTv_SdtJOBITEM_Doclbl_N ;
   private byte gxTv_SdtJOBITEM_Itmsts_N ;
   private byte gxTv_SdtJOBITEM_Retryqt_N ;
   private byte gxTv_SdtJOBITEM_Itmdtstart_N ;
   private byte gxTv_SdtJOBITEM_Itmdtend_N ;
   private byte gxTv_SdtJOBITEM_Itmerr_N ;
   private byte gxTv_SdtJOBITEM_Outfile_N ;
   private byte gxTv_SdtJOBITEM_Outurl_N ;
   private byte gxTv_SdtJOBITEM_Filenm_N ;
   private short gxTv_SdtJOBITEM_Retryqt ;
   private short gxTv_SdtJOBITEM_Initialized ;
   private short gxTv_SdtJOBITEM_Retryqt_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtJOBITEM_Itmid ;
   private long gxTv_SdtJOBITEM_Docid ;
   private long gxTv_SdtJOBITEM_Itmid_Z ;
   private long gxTv_SdtJOBITEM_Docid_Z ;
   private String gxTv_SdtJOBITEM_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtJOBITEM_Itmdtstart ;
   private java.util.Date gxTv_SdtJOBITEM_Itmdtend ;
   private java.util.Date gxTv_SdtJOBITEM_Itmdtstart_Z ;
   private java.util.Date gxTv_SdtJOBITEM_Itmdtend_Z ;
   private java.util.Date datetime_STZ ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtJOBITEM_Outurl ;
   private String gxTv_SdtJOBITEM_Jobtype ;
   private String gxTv_SdtJOBITEM_Doclbl ;
   private String gxTv_SdtJOBITEM_Itmsts ;
   private String gxTv_SdtJOBITEM_Itmerr ;
   private String gxTv_SdtJOBITEM_Outfile ;
   private String gxTv_SdtJOBITEM_Filenm ;
   private String gxTv_SdtJOBITEM_Jobtype_Z ;
   private String gxTv_SdtJOBITEM_Doclbl_Z ;
   private String gxTv_SdtJOBITEM_Itmsts_Z ;
   private String gxTv_SdtJOBITEM_Itmerr_Z ;
   private String gxTv_SdtJOBITEM_Outfile_Z ;
   private String gxTv_SdtJOBITEM_Filenm_Z ;
   private java.util.UUID gxTv_SdtJOBITEM_Jobid ;
   private java.util.UUID gxTv_SdtJOBITEM_Jobid_Z ;
}

