package app.aeat ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtRegistroFacturacionAlta_Cabecera extends GxUserType
{
   public SdtRegistroFacturacionAlta_Cabecera( )
   {
      this(  new ModelContext(SdtRegistroFacturacionAlta_Cabecera.class));
   }

   public SdtRegistroFacturacionAlta_Cabecera( ModelContext context )
   {
      super( context, "SdtRegistroFacturacionAlta_Cabecera");
   }

   public SdtRegistroFacturacionAlta_Cabecera( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle, context, "SdtRegistroFacturacionAlta_Cabecera");
   }

   public SdtRegistroFacturacionAlta_Cabecera( StructSdtRegistroFacturacionAlta_Cabecera struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Version") )
            {
               gxTv_SdtRegistroFacturacionAlta_Cabecera_Version = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Emisor") )
            {
               if ( gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor == null )
               {
                  gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor = new app.aeat.SdtRegistroFacturacionAlta_Cabecera_Emisor(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor.readxml(oReader, "Emisor") ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FechaEnvio") )
            {
               gxTv_SdtRegistroFacturacionAlta_Cabecera_Fechaenvio = oReader.getValue() ;
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
         sName = "RegistroFacturacionAlta.Cabecera" ;
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
      oWriter.writeElement("Version", gxTv_SdtRegistroFacturacionAlta_Cabecera_Version);
      if ( GXutil.strcmp(sNameSpace, "https://www.agenciatributaria.gob.es/sif/verifactu") != 0 )
      {
         oWriter.writeAttribute("xmlns", "https://www.agenciatributaria.gob.es/sif/verifactu");
      }
      if ( gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "https://www.agenciatributaria.gob.es/sif/verifactu") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "https://www.agenciatributaria.gob.es/sif/verifactu" ;
         }
         else
         {
            sNameSpace1 = "https://www.agenciatributaria.gob.es/sif/verifactu" ;
         }
         gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor.writexml(oWriter, "Emisor", sNameSpace1);
      }
      oWriter.writeElement("FechaEnvio", gxTv_SdtRegistroFacturacionAlta_Cabecera_Fechaenvio);
      if ( GXutil.strcmp(sNameSpace, "https://www.agenciatributaria.gob.es/sif/verifactu") != 0 )
      {
         oWriter.writeAttribute("xmlns", "https://www.agenciatributaria.gob.es/sif/verifactu");
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
      AddObjectProperty("Version", gxTv_SdtRegistroFacturacionAlta_Cabecera_Version, false, false);
      if ( gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor != null )
      {
         AddObjectProperty("Emisor", gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor, false, false);
      }
      AddObjectProperty("FechaEnvio", gxTv_SdtRegistroFacturacionAlta_Cabecera_Fechaenvio, false, false);
   }

   public String getgxTv_SdtRegistroFacturacionAlta_Cabecera_Version( )
   {
      return gxTv_SdtRegistroFacturacionAlta_Cabecera_Version ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_Cabecera_Version( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_Cabecera_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Version = value ;
   }

   public app.aeat.SdtRegistroFacturacionAlta_Cabecera_Emisor getgxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor( )
   {
      if ( gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor == null )
      {
         gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor = new app.aeat.SdtRegistroFacturacionAlta_Cabecera_Emisor(remoteHandle, context);
      }
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera_N = (byte)(0) ;
      return gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor( app.aeat.SdtRegistroFacturacionAlta_Cabecera_Emisor value )
   {
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor = value;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_SetNull( )
   {
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor = (app.aeat.SdtRegistroFacturacionAlta_Cabecera_Emisor)null;
   }

   public boolean getgxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_IsNull( )
   {
      if ( gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_N( )
   {
      return gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_N ;
   }

   public String getgxTv_SdtRegistroFacturacionAlta_Cabecera_Fechaenvio( )
   {
      return gxTv_SdtRegistroFacturacionAlta_Cabecera_Fechaenvio ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_Cabecera_Fechaenvio( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_Cabecera_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Fechaenvio = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Version = "" ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera_Fechaenvio = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtRegistroFacturacionAlta_Cabecera_N ;
   }

   public app.aeat.SdtRegistroFacturacionAlta_Cabecera Clone( )
   {
      return (app.aeat.SdtRegistroFacturacionAlta_Cabecera)(clone()) ;
   }

   public void setStruct( app.aeat.StructSdtRegistroFacturacionAlta_Cabecera struct )
   {
      setgxTv_SdtRegistroFacturacionAlta_Cabecera_Version(struct.getVersion());
      setgxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor(new app.aeat.SdtRegistroFacturacionAlta_Cabecera_Emisor(struct.getEmisor()));
      setgxTv_SdtRegistroFacturacionAlta_Cabecera_Fechaenvio(struct.getFechaenvio());
   }

   @SuppressWarnings("unchecked")
   public app.aeat.StructSdtRegistroFacturacionAlta_Cabecera getStruct( )
   {
      app.aeat.StructSdtRegistroFacturacionAlta_Cabecera struct = new app.aeat.StructSdtRegistroFacturacionAlta_Cabecera ();
      struct.setVersion(getgxTv_SdtRegistroFacturacionAlta_Cabecera_Version());
      struct.setEmisor(getgxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor().getStruct());
      struct.setFechaenvio(getgxTv_SdtRegistroFacturacionAlta_Cabecera_Fechaenvio());
      return struct ;
   }

   protected byte gxTv_SdtRegistroFacturacionAlta_Cabecera_N ;
   protected byte gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtRegistroFacturacionAlta_Cabecera_Version ;
   protected String gxTv_SdtRegistroFacturacionAlta_Cabecera_Fechaenvio ;
   protected app.aeat.SdtRegistroFacturacionAlta_Cabecera_Emisor gxTv_SdtRegistroFacturacionAlta_Cabecera_Emisor=null ;
}

