package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTProductosEtiquetas extends GxUserType
{
   public SdtSDTProductosEtiquetas( )
   {
      this(  new ModelContext(SdtSDTProductosEtiquetas.class));
   }

   public SdtSDTProductosEtiquetas( ModelContext context )
   {
      super( context, "SdtSDTProductosEtiquetas");
   }

   public SdtSDTProductosEtiquetas( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTProductosEtiquetas");
   }

   public SdtSDTProductosEtiquetas( StructSdtSDTProductosEtiquetas struct )
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
               gxTv_SdtSDTProductosEtiquetas_Producto = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Netiquetas") )
            {
               gxTv_SdtSDTProductosEtiquetas_Netiquetas = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "LinEnt") )
            {
               gxTv_SdtSDTProductosEtiquetas_Linent = (short)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDTProductosEtiquetas" ;
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
      oWriter.writeElement("Producto", gxTv_SdtSDTProductosEtiquetas_Producto);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Netiquetas", GXutil.trim( GXutil.str( gxTv_SdtSDTProductosEtiquetas_Netiquetas, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("LinEnt", GXutil.trim( GXutil.str( gxTv_SdtSDTProductosEtiquetas_Linent, 4, 0)));
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
      AddObjectProperty("Producto", gxTv_SdtSDTProductosEtiquetas_Producto, false, false);
      AddObjectProperty("Netiquetas", gxTv_SdtSDTProductosEtiquetas_Netiquetas, false, false);
      AddObjectProperty("LinEnt", gxTv_SdtSDTProductosEtiquetas_Linent, false, false);
   }

   public String getgxTv_SdtSDTProductosEtiquetas_Producto( )
   {
      return gxTv_SdtSDTProductosEtiquetas_Producto ;
   }

   public void setgxTv_SdtSDTProductosEtiquetas_Producto( String value )
   {
      gxTv_SdtSDTProductosEtiquetas_N = (byte)(0) ;
      gxTv_SdtSDTProductosEtiquetas_Producto = value ;
   }

   public short getgxTv_SdtSDTProductosEtiquetas_Netiquetas( )
   {
      return gxTv_SdtSDTProductosEtiquetas_Netiquetas ;
   }

   public void setgxTv_SdtSDTProductosEtiquetas_Netiquetas( short value )
   {
      gxTv_SdtSDTProductosEtiquetas_N = (byte)(0) ;
      gxTv_SdtSDTProductosEtiquetas_Netiquetas = value ;
   }

   public short getgxTv_SdtSDTProductosEtiquetas_Linent( )
   {
      return gxTv_SdtSDTProductosEtiquetas_Linent ;
   }

   public void setgxTv_SdtSDTProductosEtiquetas_Linent( short value )
   {
      gxTv_SdtSDTProductosEtiquetas_N = (byte)(0) ;
      gxTv_SdtSDTProductosEtiquetas_Linent = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTProductosEtiquetas_Producto = "" ;
      gxTv_SdtSDTProductosEtiquetas_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTProductosEtiquetas_N ;
   }

   public app.SdtSDTProductosEtiquetas Clone( )
   {
      return (app.SdtSDTProductosEtiquetas)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTProductosEtiquetas struct )
   {
      setgxTv_SdtSDTProductosEtiquetas_Producto(struct.getProducto());
      setgxTv_SdtSDTProductosEtiquetas_Netiquetas(struct.getNetiquetas());
      setgxTv_SdtSDTProductosEtiquetas_Linent(struct.getLinent());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTProductosEtiquetas getStruct( )
   {
      app.StructSdtSDTProductosEtiquetas struct = new app.StructSdtSDTProductosEtiquetas ();
      struct.setProducto(getgxTv_SdtSDTProductosEtiquetas_Producto());
      struct.setNetiquetas(getgxTv_SdtSDTProductosEtiquetas_Netiquetas());
      struct.setLinent(getgxTv_SdtSDTProductosEtiquetas_Linent());
      return struct ;
   }

   protected byte gxTv_SdtSDTProductosEtiquetas_N ;
   protected short gxTv_SdtSDTProductosEtiquetas_Netiquetas ;
   protected short gxTv_SdtSDTProductosEtiquetas_Linent ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTProductosEtiquetas_Producto ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

