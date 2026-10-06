package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtImpresionHdrCv_SDT extends GxUserType
{
   public SdtImpresionHdrCv_SDT( )
   {
      this(  new ModelContext(SdtImpresionHdrCv_SDT.class));
   }

   public SdtImpresionHdrCv_SDT( ModelContext context )
   {
      super( context, "SdtImpresionHdrCv_SDT");
   }

   public SdtImpresionHdrCv_SDT( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtImpresionHdrCv_SDT");
   }

   public SdtImpresionHdrCv_SDT( StructSdtImpresionHdrCv_SDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtImpresionHdrCv_SDT_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtImpresionHdrCv_SDT_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarEnccli") )
            {
               gxTv_SdtImpresionHdrCv_SDT_Barenccli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Numero") )
            {
               if ( gxTv_SdtImpresionHdrCv_SDT_Numero == null )
               {
                  gxTv_SdtImpresionHdrCv_SDT_Numero = new app.SdtImpresionHdrCv_SDT_Numero(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtImpresionHdrCv_SDT_Numero.readxml(oReader, "Numero") ;
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
         sName = "ImpresionHdrCv_SDT" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtImpresionHdrCv_SDT_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtImpresionHdrCv_SDT_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarEnccli", gxTv_SdtImpresionHdrCv_SDT_Barenccli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtImpresionHdrCv_SDT_Numero != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtImpresionHdrCv_SDT_Numero.writexml(oWriter, "Numero", sNameSpace1);
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
      AddObjectProperty("Clicod", gxTv_SdtImpresionHdrCv_SDT_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtImpresionHdrCv_SDT_Clinom, false, false);
      AddObjectProperty("BarEnccli", gxTv_SdtImpresionHdrCv_SDT_Barenccli, false, false);
      if ( gxTv_SdtImpresionHdrCv_SDT_Numero != null )
      {
         AddObjectProperty("Numero", gxTv_SdtImpresionHdrCv_SDT_Numero, false, false);
      }
   }

   public int getgxTv_SdtImpresionHdrCv_SDT_Clicod( )
   {
      return gxTv_SdtImpresionHdrCv_SDT_Clicod ;
   }

   public void setgxTv_SdtImpresionHdrCv_SDT_Clicod( int value )
   {
      gxTv_SdtImpresionHdrCv_SDT_N = (byte)(0) ;
      gxTv_SdtImpresionHdrCv_SDT_Clicod = value ;
   }

   public String getgxTv_SdtImpresionHdrCv_SDT_Clinom( )
   {
      return gxTv_SdtImpresionHdrCv_SDT_Clinom ;
   }

   public void setgxTv_SdtImpresionHdrCv_SDT_Clinom( String value )
   {
      gxTv_SdtImpresionHdrCv_SDT_N = (byte)(0) ;
      gxTv_SdtImpresionHdrCv_SDT_Clinom = value ;
   }

   public String getgxTv_SdtImpresionHdrCv_SDT_Barenccli( )
   {
      return gxTv_SdtImpresionHdrCv_SDT_Barenccli ;
   }

   public void setgxTv_SdtImpresionHdrCv_SDT_Barenccli( String value )
   {
      gxTv_SdtImpresionHdrCv_SDT_N = (byte)(0) ;
      gxTv_SdtImpresionHdrCv_SDT_Barenccli = value ;
   }

   public app.SdtImpresionHdrCv_SDT_Numero getgxTv_SdtImpresionHdrCv_SDT_Numero( )
   {
      if ( gxTv_SdtImpresionHdrCv_SDT_Numero == null )
      {
         gxTv_SdtImpresionHdrCv_SDT_Numero = new app.SdtImpresionHdrCv_SDT_Numero(remoteHandle, context);
      }
      gxTv_SdtImpresionHdrCv_SDT_Numero_N = (byte)(0) ;
      gxTv_SdtImpresionHdrCv_SDT_N = (byte)(0) ;
      return gxTv_SdtImpresionHdrCv_SDT_Numero ;
   }

   public void setgxTv_SdtImpresionHdrCv_SDT_Numero( app.SdtImpresionHdrCv_SDT_Numero value )
   {
      gxTv_SdtImpresionHdrCv_SDT_Numero_N = (byte)(0) ;
      gxTv_SdtImpresionHdrCv_SDT_N = (byte)(0) ;
      gxTv_SdtImpresionHdrCv_SDT_Numero = value;
   }

   public void setgxTv_SdtImpresionHdrCv_SDT_Numero_SetNull( )
   {
      gxTv_SdtImpresionHdrCv_SDT_Numero_N = (byte)(1) ;
      gxTv_SdtImpresionHdrCv_SDT_Numero = (app.SdtImpresionHdrCv_SDT_Numero)null;
   }

   public boolean getgxTv_SdtImpresionHdrCv_SDT_Numero_IsNull( )
   {
      if ( gxTv_SdtImpresionHdrCv_SDT_Numero == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtImpresionHdrCv_SDT_Numero_N( )
   {
      return gxTv_SdtImpresionHdrCv_SDT_Numero_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtImpresionHdrCv_SDT_N = (byte)(1) ;
      gxTv_SdtImpresionHdrCv_SDT_Clinom = "" ;
      gxTv_SdtImpresionHdrCv_SDT_Barenccli = "" ;
      gxTv_SdtImpresionHdrCv_SDT_Numero_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtImpresionHdrCv_SDT_N ;
   }

   public app.SdtImpresionHdrCv_SDT Clone( )
   {
      return (app.SdtImpresionHdrCv_SDT)(clone()) ;
   }

   public void setStruct( app.StructSdtImpresionHdrCv_SDT struct )
   {
      setgxTv_SdtImpresionHdrCv_SDT_Clicod(struct.getClicod());
      setgxTv_SdtImpresionHdrCv_SDT_Clinom(struct.getClinom());
      setgxTv_SdtImpresionHdrCv_SDT_Barenccli(struct.getBarenccli());
      setgxTv_SdtImpresionHdrCv_SDT_Numero(new app.SdtImpresionHdrCv_SDT_Numero(struct.getNumero()));
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtImpresionHdrCv_SDT getStruct( )
   {
      app.StructSdtImpresionHdrCv_SDT struct = new app.StructSdtImpresionHdrCv_SDT ();
      struct.setClicod(getgxTv_SdtImpresionHdrCv_SDT_Clicod());
      struct.setClinom(getgxTv_SdtImpresionHdrCv_SDT_Clinom());
      struct.setBarenccli(getgxTv_SdtImpresionHdrCv_SDT_Barenccli());
      struct.setNumero(getgxTv_SdtImpresionHdrCv_SDT_Numero().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtImpresionHdrCv_SDT_N ;
   protected byte gxTv_SdtImpresionHdrCv_SDT_Numero_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtImpresionHdrCv_SDT_Clicod ;
   protected String gxTv_SdtImpresionHdrCv_SDT_Clinom ;
   protected String gxTv_SdtImpresionHdrCv_SDT_Barenccli ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected app.SdtImpresionHdrCv_SDT_Numero gxTv_SdtImpresionHdrCv_SDT_Numero=null ;
}

