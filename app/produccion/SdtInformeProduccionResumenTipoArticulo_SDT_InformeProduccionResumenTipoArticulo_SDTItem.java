package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem extends GxUserType
{
   public SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem( )
   {
      this(  new ModelContext(SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem.class));
   }

   public SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem( ModelContext context )
   {
      super( context, "SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem");
   }

   public SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem( int remoteHandle ,
                                                                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem");
   }

   public SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem( StructSdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtcod") )
            {
               gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipArtdsc") )
            {
               gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Kilos") )
            {
               gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Kilos = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Porkilos") )
            {
               gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Porkilos = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Metros") )
            {
               gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Metros = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Pormetros") )
            {
               gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Pormetros = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "InformeProduccionResumenTipoArticulo_SDT.InformeProduccionResumenTipoArticulo_SDTItem" ;
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
      oWriter.writeElement("TipArtcod", GXutil.trim( GXutil.str( gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipArtdsc", gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Kilos", GXutil.trim( GXutil.strNoRound( gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Kilos, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Porkilos", GXutil.trim( GXutil.strNoRound( gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Porkilos, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Metros", GXutil.trim( GXutil.strNoRound( gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Metros, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Pormetros", GXutil.trim( GXutil.strNoRound( gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Pormetros, 6, 2)));
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
      AddObjectProperty("TipArtcod", gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartcod, false, false);
      AddObjectProperty("TipArtdsc", gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartdsc, false, false);
      AddObjectProperty("Kilos", gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Kilos, false, false);
      AddObjectProperty("Porkilos", gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Porkilos, false, false);
      AddObjectProperty("Metros", gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Metros, false, false);
      AddObjectProperty("Pormetros", gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Pormetros, false, false);
   }

   public short getgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartcod( )
   {
      return gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartcod ;
   }

   public void setgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartcod( short value )
   {
      gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartcod = value ;
   }

   public String getgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartdsc( )
   {
      return gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartdsc ;
   }

   public void setgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartdsc( String value )
   {
      gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Kilos( )
   {
      return gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Kilos ;
   }

   public void setgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Kilos( java.math.BigDecimal value )
   {
      gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Kilos = value ;
   }

   public java.math.BigDecimal getgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Porkilos( )
   {
      return gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Porkilos ;
   }

   public void setgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Porkilos( java.math.BigDecimal value )
   {
      gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Porkilos = value ;
   }

   public java.math.BigDecimal getgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Metros( )
   {
      return gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Metros ;
   }

   public void setgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Metros( java.math.BigDecimal value )
   {
      gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Metros = value ;
   }

   public java.math.BigDecimal getgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Pormetros( )
   {
      return gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Pormetros ;
   }

   public void setgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Pormetros( java.math.BigDecimal value )
   {
      gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Pormetros = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_N = (byte)(1) ;
      gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartdsc = "" ;
      gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Kilos = DecimalUtil.ZERO ;
      gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Porkilos = DecimalUtil.ZERO ;
      gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Metros = DecimalUtil.ZERO ;
      gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Pormetros = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_N ;
   }

   public app.produccion.SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem Clone( )
   {
      return (app.produccion.SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem)(clone()) ;
   }

   public void setStruct( app.produccion.StructSdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem struct )
   {
      setgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartcod(struct.getTipartcod());
      setgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartdsc(struct.getTipartdsc());
      setgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Kilos(struct.getKilos());
      setgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Porkilos(struct.getPorkilos());
      setgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Metros(struct.getMetros());
      setgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Pormetros(struct.getPormetros());
   }

   @SuppressWarnings("unchecked")
   public app.produccion.StructSdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem getStruct( )
   {
      app.produccion.StructSdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem struct = new app.produccion.StructSdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem ();
      struct.setTipartcod(getgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartcod());
      struct.setTipartdsc(getgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartdsc());
      struct.setKilos(getgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Kilos());
      struct.setPorkilos(getgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Porkilos());
      struct.setMetros(getgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Metros());
      struct.setPormetros(getgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Pormetros());
      return struct ;
   }

   protected byte gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_N ;
   protected short gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartcod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Kilos ;
   protected java.math.BigDecimal gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Porkilos ;
   protected java.math.BigDecimal gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Metros ;
   protected java.math.BigDecimal gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Pormetros ;
   protected String gxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

