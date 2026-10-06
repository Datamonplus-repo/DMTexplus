package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTProduccionMaquinasFases_FasesItem extends GxUserType
{
   public SdtSDTProduccionMaquinasFases_FasesItem( )
   {
      this(  new ModelContext(SdtSDTProduccionMaquinasFases_FasesItem.class));
   }

   public SdtSDTProduccionMaquinasFases_FasesItem( ModelContext context )
   {
      super( context, "SdtSDTProduccionMaquinasFases_FasesItem");
   }

   public SdtSDTProduccionMaquinasFases_FasesItem( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTProduccionMaquinasFases_FasesItem");
   }

   public SdtSDTProduccionMaquinasFases_FasesItem( StructSdtSDTProduccionMaquinasFases_FasesItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasDsc") )
            {
               gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Fasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tiempo") )
            {
               gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Tiempo = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Kilosproduccion") )
            {
               gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Kilosproduccion = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetrosProduccion") )
            {
               gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Metrosproduccion = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTProduccionMaquinasFases.FasesItem" ;
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
      oWriter.writeElement("FasDsc", gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Fasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Tiempo", GXutil.trim( GXutil.str( gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Tiempo, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Kilosproduccion", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Kilosproduccion, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetrosProduccion", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Metrosproduccion, 9, 2)));
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
      AddObjectProperty("FasDsc", gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Fasdsc, false, false);
      AddObjectProperty("Tiempo", gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Tiempo, false, false);
      AddObjectProperty("Kilosproduccion", gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Kilosproduccion, false, false);
      AddObjectProperty("MetrosProduccion", gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Metrosproduccion, false, false);
   }

   public String getgxTv_SdtSDTProduccionMaquinasFases_FasesItem_Fasdsc( )
   {
      return gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Fasdsc ;
   }

   public void setgxTv_SdtSDTProduccionMaquinasFases_FasesItem_Fasdsc( String value )
   {
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Fasdsc = value ;
   }

   public short getgxTv_SdtSDTProduccionMaquinasFases_FasesItem_Tiempo( )
   {
      return gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Tiempo ;
   }

   public void setgxTv_SdtSDTProduccionMaquinasFases_FasesItem_Tiempo( short value )
   {
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Tiempo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTProduccionMaquinasFases_FasesItem_Kilosproduccion( )
   {
      return gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Kilosproduccion ;
   }

   public void setgxTv_SdtSDTProduccionMaquinasFases_FasesItem_Kilosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Kilosproduccion = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTProduccionMaquinasFases_FasesItem_Metrosproduccion( )
   {
      return gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Metrosproduccion ;
   }

   public void setgxTv_SdtSDTProduccionMaquinasFases_FasesItem_Metrosproduccion( java.math.BigDecimal value )
   {
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Metrosproduccion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Fasdsc = "" ;
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_N = (byte)(1) ;
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Kilosproduccion = DecimalUtil.ZERO ;
      gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Metrosproduccion = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTProduccionMaquinasFases_FasesItem_N ;
   }

   public app.SdtSDTProduccionMaquinasFases_FasesItem Clone( )
   {
      return (app.SdtSDTProduccionMaquinasFases_FasesItem)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTProduccionMaquinasFases_FasesItem struct )
   {
      setgxTv_SdtSDTProduccionMaquinasFases_FasesItem_Fasdsc(struct.getFasdsc());
      setgxTv_SdtSDTProduccionMaquinasFases_FasesItem_Tiempo(struct.getTiempo());
      setgxTv_SdtSDTProduccionMaquinasFases_FasesItem_Kilosproduccion(struct.getKilosproduccion());
      setgxTv_SdtSDTProduccionMaquinasFases_FasesItem_Metrosproduccion(struct.getMetrosproduccion());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTProduccionMaquinasFases_FasesItem getStruct( )
   {
      app.StructSdtSDTProduccionMaquinasFases_FasesItem struct = new app.StructSdtSDTProduccionMaquinasFases_FasesItem ();
      struct.setFasdsc(getgxTv_SdtSDTProduccionMaquinasFases_FasesItem_Fasdsc());
      struct.setTiempo(getgxTv_SdtSDTProduccionMaquinasFases_FasesItem_Tiempo());
      struct.setKilosproduccion(getgxTv_SdtSDTProduccionMaquinasFases_FasesItem_Kilosproduccion());
      struct.setMetrosproduccion(getgxTv_SdtSDTProduccionMaquinasFases_FasesItem_Metrosproduccion());
      return struct ;
   }

   protected byte gxTv_SdtSDTProduccionMaquinasFases_FasesItem_N ;
   protected short gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Tiempo ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Kilosproduccion ;
   protected java.math.BigDecimal gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Metrosproduccion ;
   protected String gxTv_SdtSDTProduccionMaquinasFases_FasesItem_Fasdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

