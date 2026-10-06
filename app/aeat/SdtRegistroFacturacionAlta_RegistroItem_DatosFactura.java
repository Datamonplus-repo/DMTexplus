package app.aeat ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtRegistroFacturacionAlta_RegistroItem_DatosFactura extends GxUserType
{
   public SdtRegistroFacturacionAlta_RegistroItem_DatosFactura( )
   {
      this(  new ModelContext(SdtRegistroFacturacionAlta_RegistroItem_DatosFactura.class));
   }

   public SdtRegistroFacturacionAlta_RegistroItem_DatosFactura( ModelContext context )
   {
      super( context, "SdtRegistroFacturacionAlta_RegistroItem_DatosFactura");
   }

   public SdtRegistroFacturacionAlta_RegistroItem_DatosFactura( int remoteHandle ,
                                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtRegistroFacturacionAlta_RegistroItem_DatosFactura");
   }

   public SdtRegistroFacturacionAlta_RegistroItem_DatosFactura( StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "DescripcionOperacion") )
            {
               gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Descripcionoperacion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ImporteTotal") )
            {
               gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Importetotal = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Impuestos") )
            {
               if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos == null )
               {
                  gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos = new app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos.readxml(oReader, "Impuestos") ;
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
         sName = "RegistroFacturacionAlta.RegistroItem.DatosFactura" ;
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
      oWriter.writeElement("DescripcionOperacion", gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Descripcionoperacion);
      if ( GXutil.strcmp(sNameSpace, "https://www.agenciatributaria.gob.es/sif/verifactu") != 0 )
      {
         oWriter.writeAttribute("xmlns", "https://www.agenciatributaria.gob.es/sif/verifactu");
      }
      oWriter.writeElement("ImporteTotal", gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Importetotal);
      if ( GXutil.strcmp(sNameSpace, "https://www.agenciatributaria.gob.es/sif/verifactu") != 0 )
      {
         oWriter.writeAttribute("xmlns", "https://www.agenciatributaria.gob.es/sif/verifactu");
      }
      if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos != null )
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
         gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos.writexml(oWriter, "Impuestos", sNameSpace1);
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
      AddObjectProperty("DescripcionOperacion", gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Descripcionoperacion, false, false);
      AddObjectProperty("ImporteTotal", gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Importetotal, false, false);
      if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos != null )
      {
         AddObjectProperty("Impuestos", gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos, false, false);
      }
   }

   public String getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Descripcionoperacion( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Descripcionoperacion ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Descripcionoperacion( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Descripcionoperacion = value ;
   }

   public String getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Importetotal( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Importetotal ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Importetotal( String value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Importetotal = value ;
   }

   public app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos( )
   {
      if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos == null )
      {
         gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos = new app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos(remoteHandle, context);
      }
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_N = (byte)(0) ;
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos( app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos = value;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_SetNull( )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos = (app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos)null;
   }

   public boolean getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IsNull( )
   {
      if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_N( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Descripcionoperacion = "" ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Importetotal = "" ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_N ;
   }

   public app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura Clone( )
   {
      return (app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura)(clone()) ;
   }

   public void setStruct( app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura struct )
   {
      setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Descripcionoperacion(struct.getDescripcionoperacion());
      setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Importetotal(struct.getImportetotal());
      setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos(new app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos(struct.getImpuestos()));
   }

   @SuppressWarnings("unchecked")
   public app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura getStruct( )
   {
      app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura struct = new app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura ();
      struct.setDescripcionoperacion(getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Descripcionoperacion());
      struct.setImportetotal(getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Importetotal());
      struct.setImpuestos(getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_N ;
   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Descripcionoperacion ;
   protected String gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Importetotal ;
   protected app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos=null ;
}

