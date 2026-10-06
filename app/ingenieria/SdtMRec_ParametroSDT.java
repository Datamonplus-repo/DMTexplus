package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtMRec_ParametroSDT extends GxUserType
{
   public SdtMRec_ParametroSDT( )
   {
      this(  new ModelContext(SdtMRec_ParametroSDT.class));
   }

   public SdtMRec_ParametroSDT( ModelContext context )
   {
      super( context, "SdtMRec_ParametroSDT");
   }

   public SdtMRec_ParametroSDT( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtMRec_ParametroSDT");
   }

   public SdtMRec_ParametroSDT( StructSdtMRec_ParametroSDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRPrParId") )
            {
               gxTv_SdtMRec_ParametroSDT_Mrprparid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRPrParCod") )
            {
               gxTv_SdtMRec_ParametroSDT_Mrprparcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRPrParDsc") )
            {
               gxTv_SdtMRec_ParametroSDT_Mrprpardsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRPrPLC") )
            {
               gxTv_SdtMRec_ParametroSDT_Mrprplc = oReader.getValue() ;
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
         sName = "MRec_ParametroSDT" ;
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
      oWriter.writeElement("MRPrParId", GXutil.trim( GXutil.str( gxTv_SdtMRec_ParametroSDT_Mrprparid, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MRPrParCod", GXutil.trim( GXutil.str( gxTv_SdtMRec_ParametroSDT_Mrprparcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MRPrParDsc", gxTv_SdtMRec_ParametroSDT_Mrprpardsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MRPrPLC", gxTv_SdtMRec_ParametroSDT_Mrprplc);
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
      AddObjectProperty("MRPrParId", gxTv_SdtMRec_ParametroSDT_Mrprparid, false, false);
      AddObjectProperty("MRPrParCod", gxTv_SdtMRec_ParametroSDT_Mrprparcod, false, false);
      AddObjectProperty("MRPrParDsc", gxTv_SdtMRec_ParametroSDT_Mrprpardsc, false, false);
      AddObjectProperty("MRPrPLC", gxTv_SdtMRec_ParametroSDT_Mrprplc, false, false);
   }

   public long getgxTv_SdtMRec_ParametroSDT_Mrprparid( )
   {
      return gxTv_SdtMRec_ParametroSDT_Mrprparid ;
   }

   public void setgxTv_SdtMRec_ParametroSDT_Mrprparid( long value )
   {
      gxTv_SdtMRec_ParametroSDT_N = (byte)(0) ;
      gxTv_SdtMRec_ParametroSDT_Mrprparid = value ;
   }

   public short getgxTv_SdtMRec_ParametroSDT_Mrprparcod( )
   {
      return gxTv_SdtMRec_ParametroSDT_Mrprparcod ;
   }

   public void setgxTv_SdtMRec_ParametroSDT_Mrprparcod( short value )
   {
      gxTv_SdtMRec_ParametroSDT_N = (byte)(0) ;
      gxTv_SdtMRec_ParametroSDT_Mrprparcod = value ;
   }

   public String getgxTv_SdtMRec_ParametroSDT_Mrprpardsc( )
   {
      return gxTv_SdtMRec_ParametroSDT_Mrprpardsc ;
   }

   public void setgxTv_SdtMRec_ParametroSDT_Mrprpardsc( String value )
   {
      gxTv_SdtMRec_ParametroSDT_N = (byte)(0) ;
      gxTv_SdtMRec_ParametroSDT_Mrprpardsc = value ;
   }

   public String getgxTv_SdtMRec_ParametroSDT_Mrprplc( )
   {
      return gxTv_SdtMRec_ParametroSDT_Mrprplc ;
   }

   public void setgxTv_SdtMRec_ParametroSDT_Mrprplc( String value )
   {
      gxTv_SdtMRec_ParametroSDT_N = (byte)(0) ;
      gxTv_SdtMRec_ParametroSDT_Mrprplc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtMRec_ParametroSDT_N = (byte)(1) ;
      gxTv_SdtMRec_ParametroSDT_Mrprpardsc = "" ;
      gxTv_SdtMRec_ParametroSDT_Mrprplc = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtMRec_ParametroSDT_N ;
   }

   public app.ingenieria.SdtMRec_ParametroSDT Clone( )
   {
      return (app.ingenieria.SdtMRec_ParametroSDT)(clone()) ;
   }

   public void setStruct( app.ingenieria.StructSdtMRec_ParametroSDT struct )
   {
      setgxTv_SdtMRec_ParametroSDT_Mrprparid(struct.getMrprparid());
      setgxTv_SdtMRec_ParametroSDT_Mrprparcod(struct.getMrprparcod());
      setgxTv_SdtMRec_ParametroSDT_Mrprpardsc(struct.getMrprpardsc());
      setgxTv_SdtMRec_ParametroSDT_Mrprplc(struct.getMrprplc());
   }

   @SuppressWarnings("unchecked")
   public app.ingenieria.StructSdtMRec_ParametroSDT getStruct( )
   {
      app.ingenieria.StructSdtMRec_ParametroSDT struct = new app.ingenieria.StructSdtMRec_ParametroSDT ();
      struct.setMrprparid(getgxTv_SdtMRec_ParametroSDT_Mrprparid());
      struct.setMrprparcod(getgxTv_SdtMRec_ParametroSDT_Mrprparcod());
      struct.setMrprpardsc(getgxTv_SdtMRec_ParametroSDT_Mrprpardsc());
      struct.setMrprplc(getgxTv_SdtMRec_ParametroSDT_Mrprplc());
      return struct ;
   }

   protected byte gxTv_SdtMRec_ParametroSDT_N ;
   protected short gxTv_SdtMRec_ParametroSDT_Mrprparcod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtMRec_ParametroSDT_Mrprparid ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtMRec_ParametroSDT_Mrprpardsc ;
   protected String gxTv_SdtMRec_ParametroSDT_Mrprplc ;
}

