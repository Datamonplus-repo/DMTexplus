package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem extends GxUserType
{
   public SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem( )
   {
      this(  new ModelContext(SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem.class));
   }

   public SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem( ModelContext context )
   {
      super( context, "SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem");
   }

   public SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem( int remoteHandle ,
                                                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem");
   }

   public SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem( StructSdtSDTProduccionParosResumen_ParosItem_RepeticionesItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "NumeroParos") )
            {
               gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Numeroparos = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TiempoParos") )
            {
               gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Tiempoparos = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HhmmParos") )
            {
               gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Hhmmparos = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTProduccionParosResumen.ParosItem.RepeticionesItem" ;
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
      oWriter.writeElement("NumeroParos", GXutil.trim( GXutil.str( gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Numeroparos, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TiempoParos", GXutil.trim( GXutil.str( gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Tiempoparos, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HhmmParos", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Hhmmparos, 7, 2)));
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
      AddObjectProperty("NumeroParos", gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Numeroparos, false, false);
      AddObjectProperty("TiempoParos", gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Tiempoparos, false, false);
      AddObjectProperty("HhmmParos", gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Hhmmparos, false, false);
   }

   public short getgxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Numeroparos( )
   {
      return gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Numeroparos ;
   }

   public void setgxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Numeroparos( short value )
   {
      gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Numeroparos = value ;
   }

   public int getgxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Tiempoparos( )
   {
      return gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Tiempoparos ;
   }

   public void setgxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Tiempoparos( int value )
   {
      gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Tiempoparos = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Hhmmparos( )
   {
      return gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Hhmmparos ;
   }

   public void setgxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Hhmmparos( java.math.BigDecimal value )
   {
      gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Hhmmparos = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_N = (byte)(1) ;
      gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Hhmmparos = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_N ;
   }

   public app.SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem Clone( )
   {
      return (app.SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTProduccionParosResumen_ParosItem_RepeticionesItem struct )
   {
      setgxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Numeroparos(struct.getNumeroparos());
      setgxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Tiempoparos(struct.getTiempoparos());
      setgxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Hhmmparos(struct.getHhmmparos());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTProduccionParosResumen_ParosItem_RepeticionesItem getStruct( )
   {
      app.StructSdtSDTProduccionParosResumen_ParosItem_RepeticionesItem struct = new app.StructSdtSDTProduccionParosResumen_ParosItem_RepeticionesItem ();
      struct.setNumeroparos(getgxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Numeroparos());
      struct.setTiempoparos(getgxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Tiempoparos());
      struct.setHhmmparos(getgxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Hhmmparos());
      return struct ;
   }

   protected byte gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_N ;
   protected short gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Numeroparos ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Tiempoparos ;
   protected java.math.BigDecimal gxTv_SdtSDTProduccionParosResumen_ParosItem_RepeticionesItem_Hhmmparos ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

