package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtControlCalidad_CCSTA_SDT_Item extends GxUserType
{
   public SdtControlCalidad_CCSTA_SDT_Item( )
   {
      this(  new ModelContext(SdtControlCalidad_CCSTA_SDT_Item.class));
   }

   public SdtControlCalidad_CCSTA_SDT_Item( ModelContext context )
   {
      super( context, "SdtControlCalidad_CCSTA_SDT_Item");
   }

   public SdtControlCalidad_CCSTA_SDT_Item( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtControlCalidad_CCSTA_SDT_Item");
   }

   public SdtControlCalidad_CCSTA_SDT_Item( StructSdtControlCalidad_CCSTA_SDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCTvallin") )
            {
               gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCTVal") )
            {
               gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctval = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCTValDsc") )
            {
               gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvaldsc = oReader.getValue() ;
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
         sName = "ControlCalidad_CCSTA_SDT.Item" ;
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
      oWriter.writeElement("CCTvallin", GXutil.trim( GXutil.str( gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCTVal", gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctval);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCTValDsc", gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvaldsc);
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
      AddObjectProperty("CCTvallin", gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin, false, false);
      AddObjectProperty("CCTVal", gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctval, false, false);
      AddObjectProperty("CCTValDsc", gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvaldsc, false, false);
   }

   public byte getgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin( )
   {
      return gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin ;
   }

   public void setgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin( byte value )
   {
      gxTv_SdtControlCalidad_CCSTA_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin = value ;
   }

   public String getgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctval( )
   {
      return gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctval ;
   }

   public void setgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctval( String value )
   {
      gxTv_SdtControlCalidad_CCSTA_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctval = value ;
   }

   public String getgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvaldsc( )
   {
      return gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvaldsc ;
   }

   public void setgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvaldsc( String value )
   {
      gxTv_SdtControlCalidad_CCSTA_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvaldsc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtControlCalidad_CCSTA_SDT_Item_N = (byte)(1) ;
      gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctval = "" ;
      gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvaldsc = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtControlCalidad_CCSTA_SDT_Item_N ;
   }

   public app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item Clone( )
   {
      return (app.controlcalidadhtd.SdtControlCalidad_CCSTA_SDT_Item)(clone()) ;
   }

   public void setStruct( app.controlcalidadhtd.StructSdtControlCalidad_CCSTA_SDT_Item struct )
   {
      setgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin(struct.getCctvallin());
      setgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctval(struct.getCctval());
      setgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvaldsc(struct.getCctvaldsc());
   }

   @SuppressWarnings("unchecked")
   public app.controlcalidadhtd.StructSdtControlCalidad_CCSTA_SDT_Item getStruct( )
   {
      app.controlcalidadhtd.StructSdtControlCalidad_CCSTA_SDT_Item struct = new app.controlcalidadhtd.StructSdtControlCalidad_CCSTA_SDT_Item ();
      struct.setCctvallin(getgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin());
      struct.setCctval(getgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctval());
      struct.setCctvaldsc(getgxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvaldsc());
      return struct ;
   }

   protected byte gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvallin ;
   protected byte gxTv_SdtControlCalidad_CCSTA_SDT_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctval ;
   protected String gxTv_SdtControlCalidad_CCSTA_SDT_Item_Cctvaldsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

