package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtPrecios_cliente_mailsclientes_SDT_Item extends GxUserType
{
   public SdtPrecios_cliente_mailsclientes_SDT_Item( )
   {
      this(  new ModelContext(SdtPrecios_cliente_mailsclientes_SDT_Item.class));
   }

   public SdtPrecios_cliente_mailsclientes_SDT_Item( ModelContext context )
   {
      super( context, "SdtPrecios_cliente_mailsclientes_SDT_Item");
   }

   public SdtPrecios_cliente_mailsclientes_SDT_Item( int remoteHandle ,
                                                     ModelContext context )
   {
      super( remoteHandle, context, "SdtPrecios_cliente_mailsclientes_SDT_Item");
   }

   public SdtPrecios_cliente_mailsclientes_SDT_Item( StructSdtPrecios_cliente_mailsclientes_SDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Seleccionar") )
            {
               gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmailCliente") )
            {
               gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Emailcliente = oReader.getValue() ;
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
         sName = "Precios_cliente_mailsclientes_SDT.Item" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmailCliente", gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Emailcliente);
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
      AddObjectProperty("Seleccionar", gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Seleccionar, false, false);
      AddObjectProperty("EmailCliente", gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Emailcliente, false, false);
   }

   public boolean getgxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Seleccionar( )
   {
      return gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Seleccionar ;
   }

   public void setgxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Seleccionar( boolean value )
   {
      gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Seleccionar = value ;
   }

   public String getgxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Emailcliente( )
   {
      return gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Emailcliente ;
   }

   public void setgxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Emailcliente( String value )
   {
      gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Emailcliente = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_N = (byte)(1) ;
      gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Emailcliente = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_N ;
   }

   public app.facturacion.SdtPrecios_cliente_mailsclientes_SDT_Item Clone( )
   {
      return (app.facturacion.SdtPrecios_cliente_mailsclientes_SDT_Item)(clone()) ;
   }

   public void setStruct( app.facturacion.StructSdtPrecios_cliente_mailsclientes_SDT_Item struct )
   {
      setgxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Emailcliente(struct.getEmailcliente());
   }

   @SuppressWarnings("unchecked")
   public app.facturacion.StructSdtPrecios_cliente_mailsclientes_SDT_Item getStruct( )
   {
      app.facturacion.StructSdtPrecios_cliente_mailsclientes_SDT_Item struct = new app.facturacion.StructSdtPrecios_cliente_mailsclientes_SDT_Item ();
      struct.setSeleccionar(getgxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Seleccionar());
      struct.setEmailcliente(getgxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Emailcliente());
      return struct ;
   }

   protected byte gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Seleccionar ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Emailcliente ;
}

