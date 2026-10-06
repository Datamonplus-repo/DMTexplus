package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTProductosConsumos extends GxUserType
{
   public SdtSDTProductosConsumos( )
   {
      this(  new ModelContext(SdtSDTProductosConsumos.class));
   }

   public SdtSDTProductosConsumos( ModelContext context )
   {
      super( context, "SdtSDTProductosConsumos");
   }

   public SdtSDTProductosConsumos( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTProductosConsumos");
   }

   public SdtSDTProductosConsumos( StructSdtSDTProductosConsumos struct )
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
               gxTv_SdtSDTProductosConsumos_Producto = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cantidad") )
            {
               gxTv_SdtSDTProductosConsumos_Cantidad = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTProductosConsumos" ;
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
      oWriter.writeElement("Producto", gxTv_SdtSDTProductosConsumos_Producto);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cantidad", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTProductosConsumos_Cantidad, 11, 3)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
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
      AddObjectProperty("Producto", gxTv_SdtSDTProductosConsumos_Producto, false, false);
      AddObjectProperty("Cantidad", gxTv_SdtSDTProductosConsumos_Cantidad, false, false);
   }

   public String getgxTv_SdtSDTProductosConsumos_Producto( )
   {
      return gxTv_SdtSDTProductosConsumos_Producto ;
   }

   public void setgxTv_SdtSDTProductosConsumos_Producto( String value )
   {
      gxTv_SdtSDTProductosConsumos_N = (byte)(0) ;
      gxTv_SdtSDTProductosConsumos_Producto = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTProductosConsumos_Cantidad( )
   {
      return gxTv_SdtSDTProductosConsumos_Cantidad ;
   }

   public void setgxTv_SdtSDTProductosConsumos_Cantidad( java.math.BigDecimal value )
   {
      gxTv_SdtSDTProductosConsumos_N = (byte)(0) ;
      gxTv_SdtSDTProductosConsumos_Cantidad = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTProductosConsumos_Producto = "" ;
      gxTv_SdtSDTProductosConsumos_N = (byte)(1) ;
      gxTv_SdtSDTProductosConsumos_Cantidad = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTProductosConsumos_N ;
   }

   public app.SdtSDTProductosConsumos Clone( )
   {
      return (app.SdtSDTProductosConsumos)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTProductosConsumos struct )
   {
      setgxTv_SdtSDTProductosConsumos_Producto(struct.getProducto());
      setgxTv_SdtSDTProductosConsumos_Cantidad(struct.getCantidad());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTProductosConsumos getStruct( )
   {
      app.StructSdtSDTProductosConsumos struct = new app.StructSdtSDTProductosConsumos ();
      struct.setProducto(getgxTv_SdtSDTProductosConsumos_Producto());
      struct.setCantidad(getgxTv_SdtSDTProductosConsumos_Cantidad());
      return struct ;
   }

   protected byte gxTv_SdtSDTProductosConsumos_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTProductosConsumos_Cantidad ;
   protected String gxTv_SdtSDTProductosConsumos_Producto ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

