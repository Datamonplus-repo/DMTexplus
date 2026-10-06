package app.asyncbatch ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtJobItemSdt_Item extends GxUserType
{
   public SdtJobItemSdt_Item( )
   {
      this(  new ModelContext(SdtJobItemSdt_Item.class));
   }

   public SdtJobItemSdt_Item( ModelContext context )
   {
      super( context, "SdtJobItemSdt_Item");
   }

   public SdtJobItemSdt_Item( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle, context, "SdtJobItemSdt_Item");
   }

   public SdtJobItemSdt_Item( StructSdtJobItemSdt_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobId") )
            {
               gxTv_SdtJobItemSdt_Item_Jobid = GXutil.strToGuid(oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ItmId") )
            {
               gxTv_SdtJobItemSdt_Item_Itmid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocId") )
            {
               gxTv_SdtJobItemSdt_Item_Docid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocLbl") )
            {
               gxTv_SdtJobItemSdt_Item_Doclbl = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ItmSts") )
            {
               gxTv_SdtJobItemSdt_Item_Itmsts = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RetryQt") )
            {
               gxTv_SdtJobItemSdt_Item_Retryqt = (short)(getnumericvalue(oReader.getValue())) ;
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
                  gxTv_SdtJobItemSdt_Item_Itmdtstart = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtJobItemSdt_Item_Itmdtstart_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtJobItemSdt_Item_Itmdtstart_N = (byte)(0) ;
                  gxTv_SdtJobItemSdt_Item_Itmdtstart = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
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
                  gxTv_SdtJobItemSdt_Item_Itmdtend = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtJobItemSdt_Item_Itmdtend_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtJobItemSdt_Item_Itmdtend_N = (byte)(0) ;
                  gxTv_SdtJobItemSdt_Item_Itmdtend = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OutFile") )
            {
               gxTv_SdtJobItemSdt_Item_Outfile = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OutUrl") )
            {
               gxTv_SdtJobItemSdt_Item_Outurl = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FileNm") )
            {
               gxTv_SdtJobItemSdt_Item_Filenm = oReader.getValue() ;
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
         sName = "JobItemSdt.Item" ;
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
      oWriter.writeElement("JobId", gxTv_SdtJobItemSdt_Item_Jobid.toString());
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ItmId", GXutil.trim( GXutil.str( gxTv_SdtJobItemSdt_Item_Itmid, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DocId", GXutil.trim( GXutil.str( gxTv_SdtJobItemSdt_Item_Docid, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DocLbl", gxTv_SdtJobItemSdt_Item_Doclbl);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ItmSts", gxTv_SdtJobItemSdt_Item_Itmsts);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("RetryQt", GXutil.trim( GXutil.str( gxTv_SdtJobItemSdt_Item_Retryqt, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtJobItemSdt_Item_Itmdtstart) && ( gxTv_SdtJobItemSdt_Item_Itmdtstart_N == 1 ) )
      {
         oWriter.writeElement("ItmDtStart", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtJobItemSdt_Item_Itmdtstart), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtJobItemSdt_Item_Itmdtstart), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtJobItemSdt_Item_Itmdtstart), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtJobItemSdt_Item_Itmdtstart), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtJobItemSdt_Item_Itmdtstart), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtJobItemSdt_Item_Itmdtstart), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("ItmDtStart", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtJobItemSdt_Item_Itmdtend) && ( gxTv_SdtJobItemSdt_Item_Itmdtend_N == 1 ) )
      {
         oWriter.writeElement("ItmDtEnd", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtJobItemSdt_Item_Itmdtend), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtJobItemSdt_Item_Itmdtend), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtJobItemSdt_Item_Itmdtend), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtJobItemSdt_Item_Itmdtend), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtJobItemSdt_Item_Itmdtend), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtJobItemSdt_Item_Itmdtend), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("ItmDtEnd", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("OutFile", gxTv_SdtJobItemSdt_Item_Outfile);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OutUrl", gxTv_SdtJobItemSdt_Item_Outurl);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FileNm", gxTv_SdtJobItemSdt_Item_Filenm);
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
      AddObjectProperty("JobId", gxTv_SdtJobItemSdt_Item_Jobid, false, false);
      AddObjectProperty("ItmId", gxTv_SdtJobItemSdt_Item_Itmid, false, false);
      AddObjectProperty("DocId", gxTv_SdtJobItemSdt_Item_Docid, false, false);
      AddObjectProperty("DocLbl", gxTv_SdtJobItemSdt_Item_Doclbl, false, false);
      AddObjectProperty("ItmSts", gxTv_SdtJobItemSdt_Item_Itmsts, false, false);
      AddObjectProperty("RetryQt", gxTv_SdtJobItemSdt_Item_Retryqt, false, false);
      datetime_STZ = gxTv_SdtJobItemSdt_Item_Itmdtstart ;
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
      AddObjectProperty("ItmDtStart", sDateCnv, false, false);
      datetime_STZ = gxTv_SdtJobItemSdt_Item_Itmdtend ;
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
      AddObjectProperty("ItmDtEnd", sDateCnv, false, false);
      AddObjectProperty("OutFile", gxTv_SdtJobItemSdt_Item_Outfile, false, false);
      AddObjectProperty("OutUrl", gxTv_SdtJobItemSdt_Item_Outurl, false, false);
      AddObjectProperty("FileNm", gxTv_SdtJobItemSdt_Item_Filenm, false, false);
   }

   public java.util.UUID getgxTv_SdtJobItemSdt_Item_Jobid( )
   {
      return gxTv_SdtJobItemSdt_Item_Jobid ;
   }

   public void setgxTv_SdtJobItemSdt_Item_Jobid( java.util.UUID value )
   {
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Jobid = value ;
   }

   public long getgxTv_SdtJobItemSdt_Item_Itmid( )
   {
      return gxTv_SdtJobItemSdt_Item_Itmid ;
   }

   public void setgxTv_SdtJobItemSdt_Item_Itmid( long value )
   {
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Itmid = value ;
   }

   public long getgxTv_SdtJobItemSdt_Item_Docid( )
   {
      return gxTv_SdtJobItemSdt_Item_Docid ;
   }

   public void setgxTv_SdtJobItemSdt_Item_Docid( long value )
   {
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Docid = value ;
   }

   public String getgxTv_SdtJobItemSdt_Item_Doclbl( )
   {
      return gxTv_SdtJobItemSdt_Item_Doclbl ;
   }

   public void setgxTv_SdtJobItemSdt_Item_Doclbl( String value )
   {
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Doclbl = value ;
   }

   public String getgxTv_SdtJobItemSdt_Item_Itmsts( )
   {
      return gxTv_SdtJobItemSdt_Item_Itmsts ;
   }

   public void setgxTv_SdtJobItemSdt_Item_Itmsts( String value )
   {
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Itmsts = value ;
   }

   public short getgxTv_SdtJobItemSdt_Item_Retryqt( )
   {
      return gxTv_SdtJobItemSdt_Item_Retryqt ;
   }

   public void setgxTv_SdtJobItemSdt_Item_Retryqt( short value )
   {
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Retryqt = value ;
   }

   public java.util.Date getgxTv_SdtJobItemSdt_Item_Itmdtstart( )
   {
      return gxTv_SdtJobItemSdt_Item_Itmdtstart ;
   }

   public void setgxTv_SdtJobItemSdt_Item_Itmdtstart( java.util.Date value )
   {
      gxTv_SdtJobItemSdt_Item_Itmdtstart_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Itmdtstart = value ;
   }

   public java.util.Date getgxTv_SdtJobItemSdt_Item_Itmdtend( )
   {
      return gxTv_SdtJobItemSdt_Item_Itmdtend ;
   }

   public void setgxTv_SdtJobItemSdt_Item_Itmdtend( java.util.Date value )
   {
      gxTv_SdtJobItemSdt_Item_Itmdtend_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Itmdtend = value ;
   }

   public String getgxTv_SdtJobItemSdt_Item_Outfile( )
   {
      return gxTv_SdtJobItemSdt_Item_Outfile ;
   }

   public void setgxTv_SdtJobItemSdt_Item_Outfile( String value )
   {
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Outfile = value ;
   }

   public String getgxTv_SdtJobItemSdt_Item_Outurl( )
   {
      return gxTv_SdtJobItemSdt_Item_Outurl ;
   }

   public void setgxTv_SdtJobItemSdt_Item_Outurl( String value )
   {
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Outurl = value ;
   }

   public String getgxTv_SdtJobItemSdt_Item_Filenm( )
   {
      return gxTv_SdtJobItemSdt_Item_Filenm ;
   }

   public void setgxTv_SdtJobItemSdt_Item_Filenm( String value )
   {
      gxTv_SdtJobItemSdt_Item_N = (byte)(0) ;
      gxTv_SdtJobItemSdt_Item_Filenm = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtJobItemSdt_Item_Jobid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      gxTv_SdtJobItemSdt_Item_N = (byte)(1) ;
      gxTv_SdtJobItemSdt_Item_Doclbl = "" ;
      gxTv_SdtJobItemSdt_Item_Itmsts = "" ;
      gxTv_SdtJobItemSdt_Item_Itmdtstart = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtJobItemSdt_Item_Itmdtstart_N = (byte)(1) ;
      gxTv_SdtJobItemSdt_Item_Itmdtend = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtJobItemSdt_Item_Itmdtend_N = (byte)(1) ;
      gxTv_SdtJobItemSdt_Item_Outfile = "" ;
      gxTv_SdtJobItemSdt_Item_Outurl = "" ;
      gxTv_SdtJobItemSdt_Item_Filenm = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtJobItemSdt_Item_N ;
   }

   public app.asyncbatch.SdtJobItemSdt_Item Clone( )
   {
      return (app.asyncbatch.SdtJobItemSdt_Item)(clone()) ;
   }

   public void setStruct( app.asyncbatch.StructSdtJobItemSdt_Item struct )
   {
      setgxTv_SdtJobItemSdt_Item_Jobid(struct.getJobid());
      setgxTv_SdtJobItemSdt_Item_Itmid(struct.getItmid());
      setgxTv_SdtJobItemSdt_Item_Docid(struct.getDocid());
      setgxTv_SdtJobItemSdt_Item_Doclbl(struct.getDoclbl());
      setgxTv_SdtJobItemSdt_Item_Itmsts(struct.getItmsts());
      setgxTv_SdtJobItemSdt_Item_Retryqt(struct.getRetryqt());
      if ( struct.gxTv_SdtJobItemSdt_Item_Itmdtstart_N == 0 )
      {
         setgxTv_SdtJobItemSdt_Item_Itmdtstart(struct.getItmdtstart());
      }
      if ( struct.gxTv_SdtJobItemSdt_Item_Itmdtend_N == 0 )
      {
         setgxTv_SdtJobItemSdt_Item_Itmdtend(struct.getItmdtend());
      }
      setgxTv_SdtJobItemSdt_Item_Outfile(struct.getOutfile());
      setgxTv_SdtJobItemSdt_Item_Outurl(struct.getOuturl());
      setgxTv_SdtJobItemSdt_Item_Filenm(struct.getFilenm());
   }

   @SuppressWarnings("unchecked")
   public app.asyncbatch.StructSdtJobItemSdt_Item getStruct( )
   {
      app.asyncbatch.StructSdtJobItemSdt_Item struct = new app.asyncbatch.StructSdtJobItemSdt_Item ();
      struct.setJobid(getgxTv_SdtJobItemSdt_Item_Jobid());
      struct.setItmid(getgxTv_SdtJobItemSdt_Item_Itmid());
      struct.setDocid(getgxTv_SdtJobItemSdt_Item_Docid());
      struct.setDoclbl(getgxTv_SdtJobItemSdt_Item_Doclbl());
      struct.setItmsts(getgxTv_SdtJobItemSdt_Item_Itmsts());
      struct.setRetryqt(getgxTv_SdtJobItemSdt_Item_Retryqt());
      if ( gxTv_SdtJobItemSdt_Item_Itmdtstart_N == 0 )
      {
         struct.setItmdtstart(getgxTv_SdtJobItemSdt_Item_Itmdtstart());
      }
      if ( gxTv_SdtJobItemSdt_Item_Itmdtend_N == 0 )
      {
         struct.setItmdtend(getgxTv_SdtJobItemSdt_Item_Itmdtend());
      }
      struct.setOutfile(getgxTv_SdtJobItemSdt_Item_Outfile());
      struct.setOuturl(getgxTv_SdtJobItemSdt_Item_Outurl());
      struct.setFilenm(getgxTv_SdtJobItemSdt_Item_Filenm());
      return struct ;
   }

   protected byte gxTv_SdtJobItemSdt_Item_N ;
   protected byte gxTv_SdtJobItemSdt_Item_Itmdtstart_N ;
   protected byte gxTv_SdtJobItemSdt_Item_Itmdtend_N ;
   protected short gxTv_SdtJobItemSdt_Item_Retryqt ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtJobItemSdt_Item_Itmid ;
   protected long gxTv_SdtJobItemSdt_Item_Docid ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtJobItemSdt_Item_Itmdtstart ;
   protected java.util.Date gxTv_SdtJobItemSdt_Item_Itmdtend ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtJobItemSdt_Item_Outurl ;
   protected String gxTv_SdtJobItemSdt_Item_Doclbl ;
   protected String gxTv_SdtJobItemSdt_Item_Itmsts ;
   protected String gxTv_SdtJobItemSdt_Item_Outfile ;
   protected String gxTv_SdtJobItemSdt_Item_Filenm ;
   protected java.util.UUID gxTv_SdtJobItemSdt_Item_Jobid ;
}

