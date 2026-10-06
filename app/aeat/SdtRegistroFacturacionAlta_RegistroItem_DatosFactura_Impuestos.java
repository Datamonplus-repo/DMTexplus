package app.aeat ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos extends GxUserType
{
   public SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos( )
   {
      this(  new ModelContext(SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos.class));
   }

   public SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos( ModelContext context )
   {
      super( context, "SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos");
   }

   public SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos( int remoteHandle ,
                                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos");
   }

   public SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos( StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "IVA") )
            {
               if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva == null )
               {
                  gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva = new app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva.readxml(oReader, "IVA") ;
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
         sName = "RegistroFacturacionAlta.RegistroItem.DatosFactura.Impuestos" ;
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
      if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva != null )
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
         gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva.writexml(oWriter, "IVA", sNameSpace1);
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
      if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva != null )
      {
         AddObjectProperty("IVA", gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva, false, false);
      }
   }

   public app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva( )
   {
      if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva == null )
      {
         gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva = new app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA(remoteHandle, context);
      }
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_N = (byte)(0) ;
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva( app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA value )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva = value;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva_SetNull( )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva = (app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA)null;
   }

   public boolean getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva_IsNull( )
   {
      if ( gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva_N( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_N ;
   }

   public app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos Clone( )
   {
      return (app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos)(clone()) ;
   }

   public void setStruct( app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos struct )
   {
      setgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva(new app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA(struct.getIva()));
   }

   @SuppressWarnings("unchecked")
   public app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos getStruct( )
   {
      app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos struct = new app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos ();
      struct.setIva(getgxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva_N ;
   protected byte gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected app.aeat.SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_IVA gxTv_SdtRegistroFacturacionAlta_RegistroItem_DatosFactura_Impuestos_Iva=null ;
}

