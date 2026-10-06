package app.aeat ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtRegistroFacturacionAlta extends GxUserType
{
   public SdtRegistroFacturacionAlta( )
   {
      this(  new ModelContext(SdtRegistroFacturacionAlta.class));
   }

   public SdtRegistroFacturacionAlta( ModelContext context )
   {
      super( context, "SdtRegistroFacturacionAlta");
   }

   public SdtRegistroFacturacionAlta( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtRegistroFacturacionAlta");
   }

   public SdtRegistroFacturacionAlta( StructSdtRegistroFacturacionAlta struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cabecera") )
            {
               if ( gxTv_SdtRegistroFacturacionAlta_Cabecera == null )
               {
                  gxTv_SdtRegistroFacturacionAlta_Cabecera = new app.aeat.SdtRegistroFacturacionAlta_Cabecera(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtRegistroFacturacionAlta_Cabecera.readxml(oReader, "Cabecera") ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Registro") )
            {
               if ( gxTv_SdtRegistroFacturacionAlta_Registro == null )
               {
                  gxTv_SdtRegistroFacturacionAlta_Registro = new GXBaseCollection<app.aeat.SdtRegistroFacturacionAlta_RegistroItem>(app.aeat.SdtRegistroFacturacionAlta_RegistroItem.class, "RegistroFacturacionAlta.RegistroItem", "https://www.agenciatributaria.gob.es/sif/verifactu", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtRegistroFacturacionAlta_Registro.readxmlcollection(oReader, "Registro", "RegistroItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Registro") )
               {
                  GXSoapError = oReader.read() ;
               }
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
         sName = "RegistroFacturacionAlta" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "https://www.agenciatributaria.gob.es/sif/verifactu" ;
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
      if ( gxTv_SdtRegistroFacturacionAlta_Cabecera != null )
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
         gxTv_SdtRegistroFacturacionAlta_Cabecera.writexml(oWriter, "Cabecera", sNameSpace1);
      }
      if ( gxTv_SdtRegistroFacturacionAlta_Registro != null )
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
         gxTv_SdtRegistroFacturacionAlta_Registro.writexmlcollection(oWriter, "Registro", sNameSpace1, "RegistroItem", sNameSpace1);
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
      if ( gxTv_SdtRegistroFacturacionAlta_Cabecera != null )
      {
         AddObjectProperty("Cabecera", gxTv_SdtRegistroFacturacionAlta_Cabecera, false, false);
      }
      if ( gxTv_SdtRegistroFacturacionAlta_Registro != null )
      {
         AddObjectProperty("Registro", gxTv_SdtRegistroFacturacionAlta_Registro, false, false);
      }
   }

   public app.aeat.SdtRegistroFacturacionAlta_Cabecera getgxTv_SdtRegistroFacturacionAlta_Cabecera( )
   {
      if ( gxTv_SdtRegistroFacturacionAlta_Cabecera == null )
      {
         gxTv_SdtRegistroFacturacionAlta_Cabecera = new app.aeat.SdtRegistroFacturacionAlta_Cabecera(remoteHandle, context);
      }
      gxTv_SdtRegistroFacturacionAlta_Cabecera_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_N = (byte)(0) ;
      return gxTv_SdtRegistroFacturacionAlta_Cabecera ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_Cabecera( app.aeat.SdtRegistroFacturacionAlta_Cabecera value )
   {
      gxTv_SdtRegistroFacturacionAlta_Cabecera_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera = value;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_Cabecera_SetNull( )
   {
      gxTv_SdtRegistroFacturacionAlta_Cabecera_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_Cabecera = (app.aeat.SdtRegistroFacturacionAlta_Cabecera)null;
   }

   public boolean getgxTv_SdtRegistroFacturacionAlta_Cabecera_IsNull( )
   {
      if ( gxTv_SdtRegistroFacturacionAlta_Cabecera == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtRegistroFacturacionAlta_Cabecera_N( )
   {
      return gxTv_SdtRegistroFacturacionAlta_Cabecera_N ;
   }

   public GXBaseCollection<app.aeat.SdtRegistroFacturacionAlta_RegistroItem> getgxTv_SdtRegistroFacturacionAlta_Registro( )
   {
      if ( gxTv_SdtRegistroFacturacionAlta_Registro == null )
      {
         gxTv_SdtRegistroFacturacionAlta_Registro = new GXBaseCollection<app.aeat.SdtRegistroFacturacionAlta_RegistroItem>(app.aeat.SdtRegistroFacturacionAlta_RegistroItem.class, "RegistroFacturacionAlta.RegistroItem", "https://www.agenciatributaria.gob.es/sif/verifactu", remoteHandle);
      }
      gxTv_SdtRegistroFacturacionAlta_Registro_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_N = (byte)(0) ;
      return gxTv_SdtRegistroFacturacionAlta_Registro ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_Registro( GXBaseCollection<app.aeat.SdtRegistroFacturacionAlta_RegistroItem> value )
   {
      gxTv_SdtRegistroFacturacionAlta_Registro_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_N = (byte)(0) ;
      gxTv_SdtRegistroFacturacionAlta_Registro = value ;
   }

   public void setgxTv_SdtRegistroFacturacionAlta_Registro_SetNull( )
   {
      gxTv_SdtRegistroFacturacionAlta_Registro_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_Registro = null ;
   }

   public boolean getgxTv_SdtRegistroFacturacionAlta_Registro_IsNull( )
   {
      if ( gxTv_SdtRegistroFacturacionAlta_Registro == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtRegistroFacturacionAlta_Registro_N( )
   {
      return gxTv_SdtRegistroFacturacionAlta_Registro_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtRegistroFacturacionAlta_Cabecera_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_N = (byte)(1) ;
      gxTv_SdtRegistroFacturacionAlta_Registro_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtRegistroFacturacionAlta_N ;
   }

   public app.aeat.SdtRegistroFacturacionAlta Clone( )
   {
      return (app.aeat.SdtRegistroFacturacionAlta)(clone()) ;
   }

   public void setStruct( app.aeat.StructSdtRegistroFacturacionAlta struct )
   {
      setgxTv_SdtRegistroFacturacionAlta_Cabecera(new app.aeat.SdtRegistroFacturacionAlta_Cabecera(struct.getCabecera()));
      GXBaseCollection<app.aeat.SdtRegistroFacturacionAlta_RegistroItem> gxTv_SdtRegistroFacturacionAlta_Registro_aux = new GXBaseCollection<app.aeat.SdtRegistroFacturacionAlta_RegistroItem>(app.aeat.SdtRegistroFacturacionAlta_RegistroItem.class, "RegistroFacturacionAlta.RegistroItem", "https://www.agenciatributaria.gob.es/sif/verifactu", remoteHandle);
      Vector<app.aeat.StructSdtRegistroFacturacionAlta_RegistroItem> gxTv_SdtRegistroFacturacionAlta_Registro_aux1 = struct.getRegistro();
      if (gxTv_SdtRegistroFacturacionAlta_Registro_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtRegistroFacturacionAlta_Registro_aux1.size(); i++)
         {
            gxTv_SdtRegistroFacturacionAlta_Registro_aux.add(new app.aeat.SdtRegistroFacturacionAlta_RegistroItem(gxTv_SdtRegistroFacturacionAlta_Registro_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtRegistroFacturacionAlta_Registro(gxTv_SdtRegistroFacturacionAlta_Registro_aux);
   }

   @SuppressWarnings("unchecked")
   public app.aeat.StructSdtRegistroFacturacionAlta getStruct( )
   {
      app.aeat.StructSdtRegistroFacturacionAlta struct = new app.aeat.StructSdtRegistroFacturacionAlta ();
      struct.setCabecera(getgxTv_SdtRegistroFacturacionAlta_Cabecera().getStruct());
      struct.setRegistro(getgxTv_SdtRegistroFacturacionAlta_Registro().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtRegistroFacturacionAlta_Cabecera_N ;
   protected byte gxTv_SdtRegistroFacturacionAlta_N ;
   protected byte gxTv_SdtRegistroFacturacionAlta_Registro_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.aeat.SdtRegistroFacturacionAlta_RegistroItem> gxTv_SdtRegistroFacturacionAlta_Registro_aux ;
   protected GXBaseCollection<app.aeat.SdtRegistroFacturacionAlta_RegistroItem> gxTv_SdtRegistroFacturacionAlta_Registro=null ;
   protected app.aeat.SdtRegistroFacturacionAlta_Cabecera gxTv_SdtRegistroFacturacionAlta_Cabecera=null ;
}

