package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtChartSDT_Item extends GxUserType
{
   public SdtChartSDT_Item( )
   {
      this(  new ModelContext(SdtChartSDT_Item.class));
   }

   public SdtChartSDT_Item( ModelContext context )
   {
      super( context, "SdtChartSDT_Item");
   }

   public SdtChartSDT_Item( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle, context, "SdtChartSDT_Item");
   }

   public SdtChartSDT_Item( StructSdtChartSDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Dato") )
            {
               gxTv_SdtChartSDT_Item_Dato = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Valor") )
            {
               gxTv_SdtChartSDT_Item_Valor = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "ChartSDT.Item" ;
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
      oWriter.writeElement("Dato", gxTv_SdtChartSDT_Item_Dato);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Valor", GXutil.trim( GXutil.strNoRound( gxTv_SdtChartSDT_Item_Valor, 12, 2)));
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
      AddObjectProperty("Dato", gxTv_SdtChartSDT_Item_Dato, false, false);
      AddObjectProperty("Valor", gxTv_SdtChartSDT_Item_Valor, false, false);
   }

   public String getgxTv_SdtChartSDT_Item_Dato( )
   {
      return gxTv_SdtChartSDT_Item_Dato ;
   }

   public void setgxTv_SdtChartSDT_Item_Dato( String value )
   {
      gxTv_SdtChartSDT_Item_N = (byte)(0) ;
      gxTv_SdtChartSDT_Item_Dato = value ;
   }

   public java.math.BigDecimal getgxTv_SdtChartSDT_Item_Valor( )
   {
      return gxTv_SdtChartSDT_Item_Valor ;
   }

   public void setgxTv_SdtChartSDT_Item_Valor( java.math.BigDecimal value )
   {
      gxTv_SdtChartSDT_Item_N = (byte)(0) ;
      gxTv_SdtChartSDT_Item_Valor = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtChartSDT_Item_Dato = "" ;
      gxTv_SdtChartSDT_Item_N = (byte)(1) ;
      gxTv_SdtChartSDT_Item_Valor = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtChartSDT_Item_N ;
   }

   public app.ingenieria.SdtChartSDT_Item Clone( )
   {
      return (app.ingenieria.SdtChartSDT_Item)(clone()) ;
   }

   public void setStruct( app.ingenieria.StructSdtChartSDT_Item struct )
   {
      setgxTv_SdtChartSDT_Item_Dato(struct.getDato());
      setgxTv_SdtChartSDT_Item_Valor(struct.getValor());
   }

   @SuppressWarnings("unchecked")
   public app.ingenieria.StructSdtChartSDT_Item getStruct( )
   {
      app.ingenieria.StructSdtChartSDT_Item struct = new app.ingenieria.StructSdtChartSDT_Item ();
      struct.setDato(getgxTv_SdtChartSDT_Item_Dato());
      struct.setValor(getgxTv_SdtChartSDT_Item_Valor());
      return struct ;
   }

   protected byte gxTv_SdtChartSDT_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtChartSDT_Item_Valor ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtChartSDT_Item_Dato ;
}

