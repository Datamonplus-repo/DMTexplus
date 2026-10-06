package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInformeComprasMes extends GxUserType
{
   public SdtSDTInformeComprasMes( )
   {
      this(  new ModelContext(SdtSDTInformeComprasMes.class));
   }

   public SdtSDTInformeComprasMes( ModelContext context )
   {
      super( context, "SdtSDTInformeComprasMes");
   }

   public SdtSDTInformeComprasMes( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInformeComprasMes");
   }

   public SdtSDTInformeComprasMes( StructSdtSDTInformeComprasMes struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Producto") )
            {
               gxTv_SdtSDTInformeComprasMes_Producto = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Descripcion") )
            {
               gxTv_SdtSDTInformeComprasMes_Descripcion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Proveedor") )
            {
               gxTv_SdtSDTInformeComprasMes_Proveedor = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Nombre") )
            {
               gxTv_SdtSDTInformeComprasMes_Nombre = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Meses") )
            {
               if ( gxTv_SdtSDTInformeComprasMes_Meses == null )
               {
                  gxTv_SdtSDTInformeComprasMes_Meses = new GXBaseCollection<app.SdtSDTInformeComprasMes_MesesItem>(app.SdtSDTInformeComprasMes_MesesItem.class, "SDTInformeComprasMes.MesesItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTInformeComprasMes_Meses.readxmlcollection(oReader, "Meses", "MesesItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Meses") )
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
         sName = "SDTInformeComprasMes" ;
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
      oWriter.writeElement("Producto", gxTv_SdtSDTInformeComprasMes_Producto);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Descripcion", gxTv_SdtSDTInformeComprasMes_Descripcion);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Proveedor", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeComprasMes_Proveedor, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Nombre", gxTv_SdtSDTInformeComprasMes_Nombre);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTInformeComprasMes_Meses != null )
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
         gxTv_SdtSDTInformeComprasMes_Meses.writexmlcollection(oWriter, "Meses", sNameSpace1, "MesesItem", sNameSpace1);
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
      AddObjectProperty("Producto", gxTv_SdtSDTInformeComprasMes_Producto, false, false);
      AddObjectProperty("Descripcion", gxTv_SdtSDTInformeComprasMes_Descripcion, false, false);
      AddObjectProperty("Proveedor", gxTv_SdtSDTInformeComprasMes_Proveedor, false, false);
      AddObjectProperty("Nombre", gxTv_SdtSDTInformeComprasMes_Nombre, false, false);
      if ( gxTv_SdtSDTInformeComprasMes_Meses != null )
      {
         AddObjectProperty("Meses", gxTv_SdtSDTInformeComprasMes_Meses, false, false);
      }
   }

   public String getgxTv_SdtSDTInformeComprasMes_Producto( )
   {
      return gxTv_SdtSDTInformeComprasMes_Producto ;
   }

   public void setgxTv_SdtSDTInformeComprasMes_Producto( String value )
   {
      gxTv_SdtSDTInformeComprasMes_N = (byte)(0) ;
      gxTv_SdtSDTInformeComprasMes_Producto = value ;
   }

   public String getgxTv_SdtSDTInformeComprasMes_Descripcion( )
   {
      return gxTv_SdtSDTInformeComprasMes_Descripcion ;
   }

   public void setgxTv_SdtSDTInformeComprasMes_Descripcion( String value )
   {
      gxTv_SdtSDTInformeComprasMes_N = (byte)(0) ;
      gxTv_SdtSDTInformeComprasMes_Descripcion = value ;
   }

   public int getgxTv_SdtSDTInformeComprasMes_Proveedor( )
   {
      return gxTv_SdtSDTInformeComprasMes_Proveedor ;
   }

   public void setgxTv_SdtSDTInformeComprasMes_Proveedor( int value )
   {
      gxTv_SdtSDTInformeComprasMes_N = (byte)(0) ;
      gxTv_SdtSDTInformeComprasMes_Proveedor = value ;
   }

   public String getgxTv_SdtSDTInformeComprasMes_Nombre( )
   {
      return gxTv_SdtSDTInformeComprasMes_Nombre ;
   }

   public void setgxTv_SdtSDTInformeComprasMes_Nombre( String value )
   {
      gxTv_SdtSDTInformeComprasMes_N = (byte)(0) ;
      gxTv_SdtSDTInformeComprasMes_Nombre = value ;
   }

   public GXBaseCollection<app.SdtSDTInformeComprasMes_MesesItem> getgxTv_SdtSDTInformeComprasMes_Meses( )
   {
      if ( gxTv_SdtSDTInformeComprasMes_Meses == null )
      {
         gxTv_SdtSDTInformeComprasMes_Meses = new GXBaseCollection<app.SdtSDTInformeComprasMes_MesesItem>(app.SdtSDTInformeComprasMes_MesesItem.class, "SDTInformeComprasMes.MesesItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTInformeComprasMes_Meses_N = (byte)(0) ;
      gxTv_SdtSDTInformeComprasMes_N = (byte)(0) ;
      return gxTv_SdtSDTInformeComprasMes_Meses ;
   }

   public void setgxTv_SdtSDTInformeComprasMes_Meses( GXBaseCollection<app.SdtSDTInformeComprasMes_MesesItem> value )
   {
      gxTv_SdtSDTInformeComprasMes_Meses_N = (byte)(0) ;
      gxTv_SdtSDTInformeComprasMes_N = (byte)(0) ;
      gxTv_SdtSDTInformeComprasMes_Meses = value ;
   }

   public void setgxTv_SdtSDTInformeComprasMes_Meses_SetNull( )
   {
      gxTv_SdtSDTInformeComprasMes_Meses_N = (byte)(1) ;
      gxTv_SdtSDTInformeComprasMes_Meses = null ;
   }

   public boolean getgxTv_SdtSDTInformeComprasMes_Meses_IsNull( )
   {
      if ( gxTv_SdtSDTInformeComprasMes_Meses == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTInformeComprasMes_Meses_N( )
   {
      return gxTv_SdtSDTInformeComprasMes_Meses_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInformeComprasMes_Producto = "" ;
      gxTv_SdtSDTInformeComprasMes_N = (byte)(1) ;
      gxTv_SdtSDTInformeComprasMes_Descripcion = "" ;
      gxTv_SdtSDTInformeComprasMes_Nombre = "" ;
      gxTv_SdtSDTInformeComprasMes_Meses_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInformeComprasMes_N ;
   }

   public app.SdtSDTInformeComprasMes Clone( )
   {
      return (app.SdtSDTInformeComprasMes)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTInformeComprasMes struct )
   {
      setgxTv_SdtSDTInformeComprasMes_Producto(struct.getProducto());
      setgxTv_SdtSDTInformeComprasMes_Descripcion(struct.getDescripcion());
      setgxTv_SdtSDTInformeComprasMes_Proveedor(struct.getProveedor());
      setgxTv_SdtSDTInformeComprasMes_Nombre(struct.getNombre());
      GXBaseCollection<app.SdtSDTInformeComprasMes_MesesItem> gxTv_SdtSDTInformeComprasMes_Meses_aux = new GXBaseCollection<app.SdtSDTInformeComprasMes_MesesItem>(app.SdtSDTInformeComprasMes_MesesItem.class, "SDTInformeComprasMes.MesesItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTInformeComprasMes_MesesItem> gxTv_SdtSDTInformeComprasMes_Meses_aux1 = struct.getMeses();
      if (gxTv_SdtSDTInformeComprasMes_Meses_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTInformeComprasMes_Meses_aux1.size(); i++)
         {
            gxTv_SdtSDTInformeComprasMes_Meses_aux.add(new app.SdtSDTInformeComprasMes_MesesItem(gxTv_SdtSDTInformeComprasMes_Meses_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTInformeComprasMes_Meses(gxTv_SdtSDTInformeComprasMes_Meses_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTInformeComprasMes getStruct( )
   {
      app.StructSdtSDTInformeComprasMes struct = new app.StructSdtSDTInformeComprasMes ();
      struct.setProducto(getgxTv_SdtSDTInformeComprasMes_Producto());
      struct.setDescripcion(getgxTv_SdtSDTInformeComprasMes_Descripcion());
      struct.setProveedor(getgxTv_SdtSDTInformeComprasMes_Proveedor());
      struct.setNombre(getgxTv_SdtSDTInformeComprasMes_Nombre());
      struct.setMeses(getgxTv_SdtSDTInformeComprasMes_Meses().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTInformeComprasMes_N ;
   protected byte gxTv_SdtSDTInformeComprasMes_Meses_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTInformeComprasMes_Proveedor ;
   protected String gxTv_SdtSDTInformeComprasMes_Producto ;
   protected String gxTv_SdtSDTInformeComprasMes_Descripcion ;
   protected String gxTv_SdtSDTInformeComprasMes_Nombre ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTInformeComprasMes_MesesItem> gxTv_SdtSDTInformeComprasMes_Meses_aux ;
   protected GXBaseCollection<app.SdtSDTInformeComprasMes_MesesItem> gxTv_SdtSDTInformeComprasMes_Meses=null ;
}

