package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSalidasManualesSDT extends GxUserType
{
   public SdtSalidasManualesSDT( )
   {
      this(  new ModelContext(SdtSalidasManualesSDT.class));
   }

   public SdtSalidasManualesSDT( ModelContext context )
   {
      super( context, "SdtSalidasManualesSDT");
   }

   public SdtSalidasManualesSDT( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtSalidasManualesSDT");
   }

   public SdtSalidasManualesSDT( StructSdtSalidasManualesSDT struct )
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
               if ( gxTv_SdtSalidasManualesSDT_Cabecera == null )
               {
                  gxTv_SdtSalidasManualesSDT_Cabecera = new app.SdtSalidasManualesSDT_Cabecera(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtSalidasManualesSDT_Cabecera.readxml(oReader, "Cabecera") ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Productos") )
            {
               if ( gxTv_SdtSalidasManualesSDT_Productos == null )
               {
                  gxTv_SdtSalidasManualesSDT_Productos = new GXBaseCollection<app.SdtSalidasManualesSDT_Producto>(app.SdtSalidasManualesSDT_Producto.class, "SalidasManualesSDT.Producto", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSalidasManualesSDT_Productos.readxmlcollection(oReader, "Productos", "Producto") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Productos") )
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
         sName = "SalidasManualesSDT" ;
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
      if ( gxTv_SdtSalidasManualesSDT_Cabecera != null )
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
         gxTv_SdtSalidasManualesSDT_Cabecera.writexml(oWriter, "Cabecera", sNameSpace1);
      }
      if ( gxTv_SdtSalidasManualesSDT_Productos != null )
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
         gxTv_SdtSalidasManualesSDT_Productos.writexmlcollection(oWriter, "Productos", sNameSpace1, "Producto", sNameSpace1);
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
      if ( gxTv_SdtSalidasManualesSDT_Cabecera != null )
      {
         AddObjectProperty("Cabecera", gxTv_SdtSalidasManualesSDT_Cabecera, false, false);
      }
      if ( gxTv_SdtSalidasManualesSDT_Productos != null )
      {
         AddObjectProperty("Productos", gxTv_SdtSalidasManualesSDT_Productos, false, false);
      }
   }

   public app.SdtSalidasManualesSDT_Cabecera getgxTv_SdtSalidasManualesSDT_Cabecera( )
   {
      if ( gxTv_SdtSalidasManualesSDT_Cabecera == null )
      {
         gxTv_SdtSalidasManualesSDT_Cabecera = new app.SdtSalidasManualesSDT_Cabecera(remoteHandle, context);
      }
      gxTv_SdtSalidasManualesSDT_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_N = (byte)(0) ;
      return gxTv_SdtSalidasManualesSDT_Cabecera ;
   }

   public void setgxTv_SdtSalidasManualesSDT_Cabecera( app.SdtSalidasManualesSDT_Cabecera value )
   {
      gxTv_SdtSalidasManualesSDT_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Cabecera = value;
   }

   public void setgxTv_SdtSalidasManualesSDT_Cabecera_SetNull( )
   {
      gxTv_SdtSalidasManualesSDT_Cabecera_N = (byte)(1) ;
      gxTv_SdtSalidasManualesSDT_Cabecera = (app.SdtSalidasManualesSDT_Cabecera)null;
   }

   public boolean getgxTv_SdtSalidasManualesSDT_Cabecera_IsNull( )
   {
      if ( gxTv_SdtSalidasManualesSDT_Cabecera == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSalidasManualesSDT_Cabecera_N( )
   {
      return gxTv_SdtSalidasManualesSDT_Cabecera_N ;
   }

   public GXBaseCollection<app.SdtSalidasManualesSDT_Producto> getgxTv_SdtSalidasManualesSDT_Productos( )
   {
      if ( gxTv_SdtSalidasManualesSDT_Productos == null )
      {
         gxTv_SdtSalidasManualesSDT_Productos = new GXBaseCollection<app.SdtSalidasManualesSDT_Producto>(app.SdtSalidasManualesSDT_Producto.class, "SalidasManualesSDT.Producto", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSalidasManualesSDT_Productos_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_N = (byte)(0) ;
      return gxTv_SdtSalidasManualesSDT_Productos ;
   }

   public void setgxTv_SdtSalidasManualesSDT_Productos( GXBaseCollection<app.SdtSalidasManualesSDT_Producto> value )
   {
      gxTv_SdtSalidasManualesSDT_Productos_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Productos = value ;
   }

   public void setgxTv_SdtSalidasManualesSDT_Productos_SetNull( )
   {
      gxTv_SdtSalidasManualesSDT_Productos_N = (byte)(1) ;
      gxTv_SdtSalidasManualesSDT_Productos = null ;
   }

   public boolean getgxTv_SdtSalidasManualesSDT_Productos_IsNull( )
   {
      if ( gxTv_SdtSalidasManualesSDT_Productos == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSalidasManualesSDT_Productos_N( )
   {
      return gxTv_SdtSalidasManualesSDT_Productos_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSalidasManualesSDT_Cabecera_N = (byte)(1) ;
      gxTv_SdtSalidasManualesSDT_N = (byte)(1) ;
      gxTv_SdtSalidasManualesSDT_Productos_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSalidasManualesSDT_N ;
   }

   public app.SdtSalidasManualesSDT Clone( )
   {
      return (app.SdtSalidasManualesSDT)(clone()) ;
   }

   public void setStruct( app.StructSdtSalidasManualesSDT struct )
   {
      setgxTv_SdtSalidasManualesSDT_Cabecera(new app.SdtSalidasManualesSDT_Cabecera(struct.getCabecera()));
      GXBaseCollection<app.SdtSalidasManualesSDT_Producto> gxTv_SdtSalidasManualesSDT_Productos_aux = new GXBaseCollection<app.SdtSalidasManualesSDT_Producto>(app.SdtSalidasManualesSDT_Producto.class, "SalidasManualesSDT.Producto", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSalidasManualesSDT_Producto> gxTv_SdtSalidasManualesSDT_Productos_aux1 = struct.getProductos();
      if (gxTv_SdtSalidasManualesSDT_Productos_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSalidasManualesSDT_Productos_aux1.size(); i++)
         {
            gxTv_SdtSalidasManualesSDT_Productos_aux.add(new app.SdtSalidasManualesSDT_Producto(gxTv_SdtSalidasManualesSDT_Productos_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSalidasManualesSDT_Productos(gxTv_SdtSalidasManualesSDT_Productos_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSalidasManualesSDT getStruct( )
   {
      app.StructSdtSalidasManualesSDT struct = new app.StructSdtSalidasManualesSDT ();
      struct.setCabecera(getgxTv_SdtSalidasManualesSDT_Cabecera().getStruct());
      struct.setProductos(getgxTv_SdtSalidasManualesSDT_Productos().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSalidasManualesSDT_Cabecera_N ;
   protected byte gxTv_SdtSalidasManualesSDT_N ;
   protected byte gxTv_SdtSalidasManualesSDT_Productos_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSalidasManualesSDT_Producto> gxTv_SdtSalidasManualesSDT_Productos_aux ;
   protected GXBaseCollection<app.SdtSalidasManualesSDT_Producto> gxTv_SdtSalidasManualesSDT_Productos=null ;
   protected app.SdtSalidasManualesSDT_Cabecera gxTv_SdtSalidasManualesSDT_Cabecera=null ;
}

