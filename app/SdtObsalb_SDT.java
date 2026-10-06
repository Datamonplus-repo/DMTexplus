package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtObsalb_SDT extends GxUserType
{
   public SdtObsalb_SDT( )
   {
      this(  new ModelContext(SdtObsalb_SDT.class));
   }

   public SdtObsalb_SDT( ModelContext context )
   {
      super( context, "SdtObsalb_SDT");
   }

   public SdtObsalb_SDT( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle, context, "SdtObsalb_SDT");
   }

   public SdtObsalb_SDT( StructSdtObsalb_SDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtObsalb_SDT_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProCod") )
            {
               gxTv_SdtObsalb_SDT_Albprocod = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPObsLin") )
            {
               gxTv_SdtObsalb_SDT_Albpobslin = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPObs") )
            {
               gxTv_SdtObsalb_SDT_Albpobs = oReader.getValue() ;
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
         sName = "Obsalb_SDT" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtObsalb_SDT_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProCod", GXutil.trim( GXutil.str( gxTv_SdtObsalb_SDT_Albprocod, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbPObsLin", GXutil.trim( GXutil.str( gxTv_SdtObsalb_SDT_Albpobslin, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbPObs", gxTv_SdtObsalb_SDT_Albpobs);
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
      AddObjectProperty("EmprCod", gxTv_SdtObsalb_SDT_Emprcod, false, false);
      AddObjectProperty("AlbProCod", gxTv_SdtObsalb_SDT_Albprocod, false, false);
      AddObjectProperty("AlbPObsLin", gxTv_SdtObsalb_SDT_Albpobslin, false, false);
      AddObjectProperty("AlbPObs", gxTv_SdtObsalb_SDT_Albpobs, false, false);
   }

   public String getgxTv_SdtObsalb_SDT_Emprcod( )
   {
      return gxTv_SdtObsalb_SDT_Emprcod ;
   }

   public void setgxTv_SdtObsalb_SDT_Emprcod( String value )
   {
      gxTv_SdtObsalb_SDT_N = (byte)(0) ;
      gxTv_SdtObsalb_SDT_Emprcod = value ;
   }

   public long getgxTv_SdtObsalb_SDT_Albprocod( )
   {
      return gxTv_SdtObsalb_SDT_Albprocod ;
   }

   public void setgxTv_SdtObsalb_SDT_Albprocod( long value )
   {
      gxTv_SdtObsalb_SDT_N = (byte)(0) ;
      gxTv_SdtObsalb_SDT_Albprocod = value ;
   }

   public byte getgxTv_SdtObsalb_SDT_Albpobslin( )
   {
      return gxTv_SdtObsalb_SDT_Albpobslin ;
   }

   public void setgxTv_SdtObsalb_SDT_Albpobslin( byte value )
   {
      gxTv_SdtObsalb_SDT_N = (byte)(0) ;
      gxTv_SdtObsalb_SDT_Albpobslin = value ;
   }

   public String getgxTv_SdtObsalb_SDT_Albpobs( )
   {
      return gxTv_SdtObsalb_SDT_Albpobs ;
   }

   public void setgxTv_SdtObsalb_SDT_Albpobs( String value )
   {
      gxTv_SdtObsalb_SDT_N = (byte)(0) ;
      gxTv_SdtObsalb_SDT_Albpobs = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtObsalb_SDT_Emprcod = "" ;
      gxTv_SdtObsalb_SDT_N = (byte)(1) ;
      gxTv_SdtObsalb_SDT_Albpobs = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtObsalb_SDT_N ;
   }

   public app.SdtObsalb_SDT Clone( )
   {
      return (app.SdtObsalb_SDT)(clone()) ;
   }

   public void setStruct( app.StructSdtObsalb_SDT struct )
   {
      setgxTv_SdtObsalb_SDT_Emprcod(struct.getEmprcod());
      setgxTv_SdtObsalb_SDT_Albprocod(struct.getAlbprocod());
      setgxTv_SdtObsalb_SDT_Albpobslin(struct.getAlbpobslin());
      setgxTv_SdtObsalb_SDT_Albpobs(struct.getAlbpobs());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtObsalb_SDT getStruct( )
   {
      app.StructSdtObsalb_SDT struct = new app.StructSdtObsalb_SDT ();
      struct.setEmprcod(getgxTv_SdtObsalb_SDT_Emprcod());
      struct.setAlbprocod(getgxTv_SdtObsalb_SDT_Albprocod());
      struct.setAlbpobslin(getgxTv_SdtObsalb_SDT_Albpobslin());
      struct.setAlbpobs(getgxTv_SdtObsalb_SDT_Albpobs());
      return struct ;
   }

   protected byte gxTv_SdtObsalb_SDT_N ;
   protected byte gxTv_SdtObsalb_SDT_Albpobslin ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtObsalb_SDT_Albprocod ;
   protected String gxTv_SdtObsalb_SDT_Emprcod ;
   protected String gxTv_SdtObsalb_SDT_Albpobs ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

