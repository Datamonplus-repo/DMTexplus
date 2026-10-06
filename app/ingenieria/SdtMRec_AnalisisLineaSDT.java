package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtMRec_AnalisisLineaSDT extends GxUserType
{
   public SdtMRec_AnalisisLineaSDT( )
   {
      this(  new ModelContext(SdtMRec_AnalisisLineaSDT.class));
   }

   public SdtMRec_AnalisisLineaSDT( ModelContext context )
   {
      super( context, "SdtMRec_AnalisisLineaSDT");
   }

   public SdtMRec_AnalisisLineaSDT( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtMRec_AnalisisLineaSDT");
   }

   public SdtMRec_AnalisisLineaSDT( StructSdtMRec_AnalisisLineaSDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRPrFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec_N = (byte)(0) ;
                  gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRPrParId") )
            {
               gxTv_SdtMRec_AnalisisLineaSDT_Mrprparid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRPrParDsc") )
            {
               gxTv_SdtMRec_AnalisisLineaSDT_Mrprpardsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRPrVal") )
            {
               gxTv_SdtMRec_AnalisisLineaSDT_Mrprval = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRPrEr") )
            {
               gxTv_SdtMRec_AnalisisLineaSDT_Mrprer = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRPrMaqCod") )
            {
               gxTv_SdtMRec_AnalisisLineaSDT_Mrprmaqcod = oReader.getValue() ;
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
         sName = "MRec_AnalisisLineaSDT" ;
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
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec) && ( gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec_N == 1 ) )
      {
         oWriter.writeElement("MRPrFec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("MRPrFec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("MRPrParId", GXutil.trim( GXutil.str( gxTv_SdtMRec_AnalisisLineaSDT_Mrprparid, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MRPrParDsc", gxTv_SdtMRec_AnalisisLineaSDT_Mrprpardsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MRPrVal", gxTv_SdtMRec_AnalisisLineaSDT_Mrprval);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MRPrEr", GXutil.booltostr( gxTv_SdtMRec_AnalisisLineaSDT_Mrprer));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MRPrMaqCod", gxTv_SdtMRec_AnalisisLineaSDT_Mrprmaqcod);
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
      datetime_STZ = gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec ;
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
      AddObjectProperty("MRPrFec", sDateCnv, false, false);
      AddObjectProperty("MRPrParId", gxTv_SdtMRec_AnalisisLineaSDT_Mrprparid, false, false);
      AddObjectProperty("MRPrParDsc", gxTv_SdtMRec_AnalisisLineaSDT_Mrprpardsc, false, false);
      AddObjectProperty("MRPrVal", gxTv_SdtMRec_AnalisisLineaSDT_Mrprval, false, false);
      AddObjectProperty("MRPrEr", gxTv_SdtMRec_AnalisisLineaSDT_Mrprer, false, false);
      AddObjectProperty("MRPrMaqCod", gxTv_SdtMRec_AnalisisLineaSDT_Mrprmaqcod, false, false);
   }

   public java.util.Date getgxTv_SdtMRec_AnalisisLineaSDT_Mrprfec( )
   {
      return gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec ;
   }

   public void setgxTv_SdtMRec_AnalisisLineaSDT_Mrprfec( java.util.Date value )
   {
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisLineaSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec = value ;
   }

   public long getgxTv_SdtMRec_AnalisisLineaSDT_Mrprparid( )
   {
      return gxTv_SdtMRec_AnalisisLineaSDT_Mrprparid ;
   }

   public void setgxTv_SdtMRec_AnalisisLineaSDT_Mrprparid( long value )
   {
      gxTv_SdtMRec_AnalisisLineaSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprparid = value ;
   }

   public String getgxTv_SdtMRec_AnalisisLineaSDT_Mrprpardsc( )
   {
      return gxTv_SdtMRec_AnalisisLineaSDT_Mrprpardsc ;
   }

   public void setgxTv_SdtMRec_AnalisisLineaSDT_Mrprpardsc( String value )
   {
      gxTv_SdtMRec_AnalisisLineaSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprpardsc = value ;
   }

   public String getgxTv_SdtMRec_AnalisisLineaSDT_Mrprval( )
   {
      return gxTv_SdtMRec_AnalisisLineaSDT_Mrprval ;
   }

   public void setgxTv_SdtMRec_AnalisisLineaSDT_Mrprval( String value )
   {
      gxTv_SdtMRec_AnalisisLineaSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprval = value ;
   }

   public boolean getgxTv_SdtMRec_AnalisisLineaSDT_Mrprer( )
   {
      return gxTv_SdtMRec_AnalisisLineaSDT_Mrprer ;
   }

   public void setgxTv_SdtMRec_AnalisisLineaSDT_Mrprer( boolean value )
   {
      gxTv_SdtMRec_AnalisisLineaSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprer = value ;
   }

   public String getgxTv_SdtMRec_AnalisisLineaSDT_Mrprmaqcod( )
   {
      return gxTv_SdtMRec_AnalisisLineaSDT_Mrprmaqcod ;
   }

   public void setgxTv_SdtMRec_AnalisisLineaSDT_Mrprmaqcod( String value )
   {
      gxTv_SdtMRec_AnalisisLineaSDT_N = (byte)(0) ;
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprmaqcod = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec_N = (byte)(1) ;
      gxTv_SdtMRec_AnalisisLineaSDT_N = (byte)(1) ;
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprpardsc = "" ;
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprval = "" ;
      gxTv_SdtMRec_AnalisisLineaSDT_Mrprmaqcod = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtMRec_AnalisisLineaSDT_N ;
   }

   public app.ingenieria.SdtMRec_AnalisisLineaSDT Clone( )
   {
      return (app.ingenieria.SdtMRec_AnalisisLineaSDT)(clone()) ;
   }

   public void setStruct( app.ingenieria.StructSdtMRec_AnalisisLineaSDT struct )
   {
      if ( struct.gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec_N == 0 )
      {
         setgxTv_SdtMRec_AnalisisLineaSDT_Mrprfec(struct.getMrprfec());
      }
      setgxTv_SdtMRec_AnalisisLineaSDT_Mrprparid(struct.getMrprparid());
      setgxTv_SdtMRec_AnalisisLineaSDT_Mrprpardsc(struct.getMrprpardsc());
      setgxTv_SdtMRec_AnalisisLineaSDT_Mrprval(struct.getMrprval());
      setgxTv_SdtMRec_AnalisisLineaSDT_Mrprer(struct.getMrprer());
      setgxTv_SdtMRec_AnalisisLineaSDT_Mrprmaqcod(struct.getMrprmaqcod());
   }

   @SuppressWarnings("unchecked")
   public app.ingenieria.StructSdtMRec_AnalisisLineaSDT getStruct( )
   {
      app.ingenieria.StructSdtMRec_AnalisisLineaSDT struct = new app.ingenieria.StructSdtMRec_AnalisisLineaSDT ();
      if ( gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec_N == 0 )
      {
         struct.setMrprfec(getgxTv_SdtMRec_AnalisisLineaSDT_Mrprfec());
      }
      struct.setMrprparid(getgxTv_SdtMRec_AnalisisLineaSDT_Mrprparid());
      struct.setMrprpardsc(getgxTv_SdtMRec_AnalisisLineaSDT_Mrprpardsc());
      struct.setMrprval(getgxTv_SdtMRec_AnalisisLineaSDT_Mrprval());
      struct.setMrprer(getgxTv_SdtMRec_AnalisisLineaSDT_Mrprer());
      struct.setMrprmaqcod(getgxTv_SdtMRec_AnalisisLineaSDT_Mrprmaqcod());
      return struct ;
   }

   protected byte gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec_N ;
   protected byte gxTv_SdtMRec_AnalisisLineaSDT_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtMRec_AnalisisLineaSDT_Mrprparid ;
   protected String gxTv_SdtMRec_AnalisisLineaSDT_Mrprval ;
   protected String gxTv_SdtMRec_AnalisisLineaSDT_Mrprmaqcod ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtMRec_AnalisisLineaSDT_Mrprfec ;
   protected java.util.Date datetime_STZ ;
   protected boolean gxTv_SdtMRec_AnalisisLineaSDT_Mrprer ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtMRec_AnalisisLineaSDT_Mrprpardsc ;
}

