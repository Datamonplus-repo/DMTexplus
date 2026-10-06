package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtControlCalidad_CCDEF1_Mascara_Item extends GxUserType
{
   public SdtControlCalidad_CCDEF1_Mascara_Item( )
   {
      this(  new ModelContext(SdtControlCalidad_CCDEF1_Mascara_Item.class));
   }

   public SdtControlCalidad_CCDEF1_Mascara_Item( ModelContext context )
   {
      super( context, "SdtControlCalidad_CCDEF1_Mascara_Item");
   }

   public SdtControlCalidad_CCDEF1_Mascara_Item( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtControlCalidad_CCDEF1_Mascara_Item");
   }

   public SdtControlCalidad_CCDEF1_Mascara_Item( StructSdtControlCalidad_CCDEF1_Mascara_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Valor") )
            {
               gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Valor = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Descripcion") )
            {
               gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Descripcion = oReader.getValue() ;
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
         sName = "ControlCalidad_CCDEF1_Mascara.Item" ;
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
      oWriter.writeElement("Valor", gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Valor);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Descripcion", gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Descripcion);
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
      AddObjectProperty("Valor", gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Valor, false, false);
      AddObjectProperty("Descripcion", gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Descripcion, false, false);
   }

   public String getgxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Valor( )
   {
      return gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Valor ;
   }

   public void setgxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Valor( String value )
   {
      gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Valor = value ;
   }

   public String getgxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Descripcion( )
   {
      return gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Descripcion ;
   }

   public void setgxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Descripcion( String value )
   {
      gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Descripcion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Valor = "" ;
      gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_N = (byte)(1) ;
      gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Descripcion = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_N ;
   }

   public app.controlcalidadhtd.SdtControlCalidad_CCDEF1_Mascara_Item Clone( )
   {
      return (app.controlcalidadhtd.SdtControlCalidad_CCDEF1_Mascara_Item)(clone()) ;
   }

   public void setStruct( app.controlcalidadhtd.StructSdtControlCalidad_CCDEF1_Mascara_Item struct )
   {
      setgxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Valor(struct.getValor());
      setgxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Descripcion(struct.getDescripcion());
   }

   @SuppressWarnings("unchecked")
   public app.controlcalidadhtd.StructSdtControlCalidad_CCDEF1_Mascara_Item getStruct( )
   {
      app.controlcalidadhtd.StructSdtControlCalidad_CCDEF1_Mascara_Item struct = new app.controlcalidadhtd.StructSdtControlCalidad_CCDEF1_Mascara_Item ();
      struct.setValor(getgxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Valor());
      struct.setDescripcion(getgxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Descripcion());
      return struct ;
   }

   protected byte gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Valor ;
   protected String gxTv_SdtControlCalidad_CCDEF1_Mascara_Item_Descripcion ;
}

