package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtPrecioporColor_SDT_Item extends GxUserType
{
   public SdtPrecioporColor_SDT_Item( )
   {
      this(  new ModelContext(SdtPrecioporColor_SDT_Item.class));
   }

   public SdtPrecioporColor_SDT_Item( ModelContext context )
   {
      super( context, "SdtPrecioporColor_SDT_Item");
   }

   public SdtPrecioporColor_SDT_Item( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtPrecioporColor_SDT_Item");
   }

   public SdtPrecioporColor_SDT_Item( StructSdtPrecioporColor_SDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtPrecioporColor_SDT_Item_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtPrecioporColor_SDT_Item_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FormulaColor") )
            {
               gxTv_SdtPrecioporColor_SDT_Item_Formulacolor = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
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
         sName = "PrecioporColor_SDT.Item" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtPrecioporColor_SDT_Item_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtPrecioporColor_SDT_Item_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FormulaColor", GXutil.booltostr( gxTv_SdtPrecioporColor_SDT_Item_Formulacolor));
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
      AddObjectProperty("Clicod", gxTv_SdtPrecioporColor_SDT_Item_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtPrecioporColor_SDT_Item_Clinom, false, false);
      AddObjectProperty("FormulaColor", gxTv_SdtPrecioporColor_SDT_Item_Formulacolor, false, false);
   }

   public int getgxTv_SdtPrecioporColor_SDT_Item_Clicod( )
   {
      return gxTv_SdtPrecioporColor_SDT_Item_Clicod ;
   }

   public void setgxTv_SdtPrecioporColor_SDT_Item_Clicod( int value )
   {
      gxTv_SdtPrecioporColor_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_SDT_Item_Clicod = value ;
   }

   public String getgxTv_SdtPrecioporColor_SDT_Item_Clinom( )
   {
      return gxTv_SdtPrecioporColor_SDT_Item_Clinom ;
   }

   public void setgxTv_SdtPrecioporColor_SDT_Item_Clinom( String value )
   {
      gxTv_SdtPrecioporColor_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_SDT_Item_Clinom = value ;
   }

   public boolean getgxTv_SdtPrecioporColor_SDT_Item_Formulacolor( )
   {
      return gxTv_SdtPrecioporColor_SDT_Item_Formulacolor ;
   }

   public void setgxTv_SdtPrecioporColor_SDT_Item_Formulacolor( boolean value )
   {
      gxTv_SdtPrecioporColor_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_SDT_Item_Formulacolor = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtPrecioporColor_SDT_Item_N = (byte)(1) ;
      gxTv_SdtPrecioporColor_SDT_Item_Clinom = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtPrecioporColor_SDT_Item_N ;
   }

   public app.facturacion.SdtPrecioporColor_SDT_Item Clone( )
   {
      return (app.facturacion.SdtPrecioporColor_SDT_Item)(clone()) ;
   }

   public void setStruct( app.facturacion.StructSdtPrecioporColor_SDT_Item struct )
   {
      setgxTv_SdtPrecioporColor_SDT_Item_Clicod(struct.getClicod());
      setgxTv_SdtPrecioporColor_SDT_Item_Clinom(struct.getClinom());
      setgxTv_SdtPrecioporColor_SDT_Item_Formulacolor(struct.getFormulacolor());
   }

   @SuppressWarnings("unchecked")
   public app.facturacion.StructSdtPrecioporColor_SDT_Item getStruct( )
   {
      app.facturacion.StructSdtPrecioporColor_SDT_Item struct = new app.facturacion.StructSdtPrecioporColor_SDT_Item ();
      struct.setClicod(getgxTv_SdtPrecioporColor_SDT_Item_Clicod());
      struct.setClinom(getgxTv_SdtPrecioporColor_SDT_Item_Clinom());
      struct.setFormulacolor(getgxTv_SdtPrecioporColor_SDT_Item_Formulacolor());
      return struct ;
   }

   protected byte gxTv_SdtPrecioporColor_SDT_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtPrecioporColor_SDT_Item_Clicod ;
   protected String gxTv_SdtPrecioporColor_SDT_Item_Clinom ;
   protected String sTagName ;
   protected boolean gxTv_SdtPrecioporColor_SDT_Item_Formulacolor ;
   protected boolean readElement ;
   protected boolean formatError ;
}

