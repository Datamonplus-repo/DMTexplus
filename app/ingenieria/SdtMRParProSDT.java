package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtMRParProSDT extends GxUserType
{
   public SdtMRParProSDT( )
   {
      this(  new ModelContext(SdtMRParProSDT.class));
   }

   public SdtMRParProSDT( ModelContext context )
   {
      super( context, "SdtMRParProSDT");
   }

   public SdtMRParProSDT( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle, context, "SdtMRParProSDT");
   }

   public SdtMRParProSDT( StructSdtMRParProSDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRParPrId") )
            {
               gxTv_SdtMRParProSDT_Mrparprid = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRParPrDsc") )
            {
               gxTv_SdtMRParProSDT_Mrparprdsc = oReader.getValue() ;
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
         sName = "MRParProSDT" ;
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
      oWriter.writeElement("MRParPrId", GXutil.trim( GXutil.str( gxTv_SdtMRParProSDT_Mrparprid, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MRParPrDsc", gxTv_SdtMRParProSDT_Mrparprdsc);
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
      AddObjectProperty("MRParPrId", gxTv_SdtMRParProSDT_Mrparprid, false, false);
      AddObjectProperty("MRParPrDsc", gxTv_SdtMRParProSDT_Mrparprdsc, false, false);
   }

   public long getgxTv_SdtMRParProSDT_Mrparprid( )
   {
      return gxTv_SdtMRParProSDT_Mrparprid ;
   }

   public void setgxTv_SdtMRParProSDT_Mrparprid( long value )
   {
      gxTv_SdtMRParProSDT_N = (byte)(0) ;
      gxTv_SdtMRParProSDT_Mrparprid = value ;
   }

   public String getgxTv_SdtMRParProSDT_Mrparprdsc( )
   {
      return gxTv_SdtMRParProSDT_Mrparprdsc ;
   }

   public void setgxTv_SdtMRParProSDT_Mrparprdsc( String value )
   {
      gxTv_SdtMRParProSDT_N = (byte)(0) ;
      gxTv_SdtMRParProSDT_Mrparprdsc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtMRParProSDT_N = (byte)(1) ;
      gxTv_SdtMRParProSDT_Mrparprdsc = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtMRParProSDT_N ;
   }

   public app.ingenieria.SdtMRParProSDT Clone( )
   {
      return (app.ingenieria.SdtMRParProSDT)(clone()) ;
   }

   public void setStruct( app.ingenieria.StructSdtMRParProSDT struct )
   {
      setgxTv_SdtMRParProSDT_Mrparprid(struct.getMrparprid());
      setgxTv_SdtMRParProSDT_Mrparprdsc(struct.getMrparprdsc());
   }

   @SuppressWarnings("unchecked")
   public app.ingenieria.StructSdtMRParProSDT getStruct( )
   {
      app.ingenieria.StructSdtMRParProSDT struct = new app.ingenieria.StructSdtMRParProSDT ();
      struct.setMrparprid(getgxTv_SdtMRParProSDT_Mrparprid());
      struct.setMrparprdsc(getgxTv_SdtMRParProSDT_Mrparprdsc());
      return struct ;
   }

   protected byte gxTv_SdtMRParProSDT_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtMRParProSDT_Mrparprid ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtMRParProSDT_Mrparprdsc ;
}

