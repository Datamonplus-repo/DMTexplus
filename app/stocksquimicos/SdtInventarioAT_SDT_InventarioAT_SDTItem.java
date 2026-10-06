package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtInventarioAT_SDT_InventarioAT_SDTItem extends GxUserType
{
   public SdtInventarioAT_SDT_InventarioAT_SDTItem( )
   {
      this(  new ModelContext(SdtInventarioAT_SDT_InventarioAT_SDTItem.class));
   }

   public SdtInventarioAT_SDT_InventarioAT_SDTItem( ModelContext context )
   {
      super( context, "SdtInventarioAT_SDT_InventarioAT_SDTItem");
   }

   public SdtInventarioAT_SDT_InventarioAT_SDTItem( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtInventarioAT_SDT_InventarioAT_SDTItem");
   }

   public SdtInventarioAT_SDT_InventarioAT_SDTItem( StructSdtInventarioAT_SDT_InventarioAT_SDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProductCategory") )
            {
               gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcategory = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProductCode") )
            {
               gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProductDescription") )
            {
               gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productdescription = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProductNumberCode") )
            {
               gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productnumbercode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClosingStockQuantity") )
            {
               gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockquantity = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UnitOfMeasure") )
            {
               gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Unitofmeasure = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClosingStockValue") )
            {
               gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockvalue = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "InventarioAT_SDT.InventarioAT_SDTItem" ;
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
      oWriter.writeElement("ProductCategory", gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcategory);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProductCode", gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcode);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProductDescription", gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productdescription);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProductNumberCode", gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productnumbercode);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ClosingStockQuantity", GXutil.trim( GXutil.strNoRound( gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockquantity, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("UnitOfMeasure", gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Unitofmeasure);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ClosingStockValue", GXutil.trim( GXutil.strNoRound( gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockvalue, 13, 5)));
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
      AddObjectProperty("ProductCategory", gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcategory, false, false);
      AddObjectProperty("ProductCode", gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcode, false, false);
      AddObjectProperty("ProductDescription", gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productdescription, false, false);
      AddObjectProperty("ProductNumberCode", gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productnumbercode, false, false);
      AddObjectProperty("ClosingStockQuantity", gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockquantity, false, false);
      AddObjectProperty("UnitOfMeasure", gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Unitofmeasure, false, false);
      AddObjectProperty("ClosingStockValue", gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockvalue, false, false);
   }

   public String getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcategory( )
   {
      return gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcategory ;
   }

   public void setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcategory( String value )
   {
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_N = (byte)(0) ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcategory = value ;
   }

   public String getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcode( )
   {
      return gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcode ;
   }

   public void setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcode( String value )
   {
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_N = (byte)(0) ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcode = value ;
   }

   public String getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productdescription( )
   {
      return gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productdescription ;
   }

   public void setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productdescription( String value )
   {
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_N = (byte)(0) ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productdescription = value ;
   }

   public String getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productnumbercode( )
   {
      return gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productnumbercode ;
   }

   public void setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productnumbercode( String value )
   {
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_N = (byte)(0) ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productnumbercode = value ;
   }

   public java.math.BigDecimal getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockquantity( )
   {
      return gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockquantity ;
   }

   public void setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockquantity( java.math.BigDecimal value )
   {
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_N = (byte)(0) ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockquantity = value ;
   }

   public String getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Unitofmeasure( )
   {
      return gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Unitofmeasure ;
   }

   public void setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Unitofmeasure( String value )
   {
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_N = (byte)(0) ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Unitofmeasure = value ;
   }

   public java.math.BigDecimal getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockvalue( )
   {
      return gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockvalue ;
   }

   public void setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockvalue( java.math.BigDecimal value )
   {
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_N = (byte)(0) ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockvalue = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcategory = "" ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_N = (byte)(1) ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcode = "" ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productdescription = "" ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productnumbercode = "" ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockquantity = DecimalUtil.ZERO ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Unitofmeasure = "" ;
      gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockvalue = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_N ;
   }

   public app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem Clone( )
   {
      return (app.stocksquimicos.SdtInventarioAT_SDT_InventarioAT_SDTItem)(clone()) ;
   }

   public void setStruct( app.stocksquimicos.StructSdtInventarioAT_SDT_InventarioAT_SDTItem struct )
   {
      setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcategory(struct.getProductcategory());
      setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcode(struct.getProductcode());
      setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productdescription(struct.getProductdescription());
      setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productnumbercode(struct.getProductnumbercode());
      setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockquantity(struct.getClosingstockquantity());
      setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Unitofmeasure(struct.getUnitofmeasure());
      setgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockvalue(struct.getClosingstockvalue());
   }

   @SuppressWarnings("unchecked")
   public app.stocksquimicos.StructSdtInventarioAT_SDT_InventarioAT_SDTItem getStruct( )
   {
      app.stocksquimicos.StructSdtInventarioAT_SDT_InventarioAT_SDTItem struct = new app.stocksquimicos.StructSdtInventarioAT_SDT_InventarioAT_SDTItem ();
      struct.setProductcategory(getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcategory());
      struct.setProductcode(getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcode());
      struct.setProductdescription(getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productdescription());
      struct.setProductnumbercode(getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productnumbercode());
      struct.setClosingstockquantity(getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockquantity());
      struct.setUnitofmeasure(getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Unitofmeasure());
      struct.setClosingstockvalue(getgxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockvalue());
      return struct ;
   }

   protected byte gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockquantity ;
   protected java.math.BigDecimal gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Closingstockvalue ;
   protected String gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcategory ;
   protected String gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productcode ;
   protected String gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productdescription ;
   protected String gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Productnumbercode ;
   protected String gxTv_SdtInventarioAT_SDT_InventarioAT_SDTItem_Unitofmeasure ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

