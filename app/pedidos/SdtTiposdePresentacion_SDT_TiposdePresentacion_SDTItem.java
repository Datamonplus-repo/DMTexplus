package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem extends GxUserType
{
   public SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem( )
   {
      this(  new ModelContext(SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem.class));
   }

   public SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem( ModelContext context )
   {
      super( context, "SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem");
   }

   public SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem( int remoteHandle ,
                                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem");
   }

   public SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem( StructSdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Seleccion") )
            {
               gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Seleccion = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tipprecod") )
            {
               gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tipprecod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipPreDsc") )
            {
               gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tippredsc = oReader.getValue() ;
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
         sName = "TiposdePresentacion_SDT.TiposdePresentacion_SDTItem" ;
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
      oWriter.writeElement("Seleccion", GXutil.booltostr( gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Seleccion));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Tipprecod", GXutil.trim( GXutil.str( gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tipprecod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipPreDsc", gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tippredsc);
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
      AddObjectProperty("Seleccion", gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Seleccion, false, false);
      AddObjectProperty("Tipprecod", gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tipprecod, false, false);
      AddObjectProperty("TipPreDsc", gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tippredsc, false, false);
   }

   public boolean getgxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Seleccion( )
   {
      return gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Seleccion ;
   }

   public void setgxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Seleccion( boolean value )
   {
      gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_N = (byte)(0) ;
      gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Seleccion = value ;
   }

   public short getgxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tipprecod( )
   {
      return gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tipprecod ;
   }

   public void setgxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tipprecod( short value )
   {
      gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_N = (byte)(0) ;
      gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tipprecod = value ;
   }

   public String getgxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tippredsc( )
   {
      return gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tippredsc ;
   }

   public void setgxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tippredsc( String value )
   {
      gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_N = (byte)(0) ;
      gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tippredsc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_N = (byte)(1) ;
      gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tippredsc = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_N ;
   }

   public app.pedidos.SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem Clone( )
   {
      return (app.pedidos.SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem)(clone()) ;
   }

   public void setStruct( app.pedidos.StructSdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem struct )
   {
      setgxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Seleccion(struct.getSeleccion());
      setgxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tipprecod(struct.getTipprecod());
      setgxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tippredsc(struct.getTippredsc());
   }

   @SuppressWarnings("unchecked")
   public app.pedidos.StructSdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem getStruct( )
   {
      app.pedidos.StructSdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem struct = new app.pedidos.StructSdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem ();
      struct.setSeleccion(getgxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Seleccion());
      struct.setTipprecod(getgxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tipprecod());
      struct.setTippredsc(getgxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tippredsc());
      return struct ;
   }

   protected byte gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_N ;
   protected short gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tipprecod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tippredsc ;
   protected String sTagName ;
   protected boolean gxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Seleccion ;
   protected boolean readElement ;
   protected boolean formatError ;
}

