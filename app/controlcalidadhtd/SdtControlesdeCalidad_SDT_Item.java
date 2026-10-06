package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtControlesdeCalidad_SDT_Item extends GxUserType
{
   public SdtControlesdeCalidad_SDT_Item( )
   {
      this(  new ModelContext(SdtControlesdeCalidad_SDT_Item.class));
   }

   public SdtControlesdeCalidad_SDT_Item( ModelContext context )
   {
      super( context, "SdtControlesdeCalidad_SDT_Item");
   }

   public SdtControlesdeCalidad_SDT_Item( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtControlesdeCalidad_SDT_Item");
   }

   public SdtControlesdeCalidad_SDT_Item( StructSdtControlesdeCalidad_SDT_Item struct )
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
               gxTv_SdtControlesdeCalidad_SDT_Item_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cctcod") )
            {
               gxTv_SdtControlesdeCalidad_SDT_Item_Cctcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cctdsc") )
            {
               gxTv_SdtControlesdeCalidad_SDT_Item_Cctdsc = oReader.getValue() ;
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
         sName = "ControlesdeCalidad_SDT.Item" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtControlesdeCalidad_SDT_Item_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cctcod", GXutil.trim( GXutil.str( gxTv_SdtControlesdeCalidad_SDT_Item_Cctcod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cctdsc", gxTv_SdtControlesdeCalidad_SDT_Item_Cctdsc);
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
      AddObjectProperty("Seleccionar", gxTv_SdtControlesdeCalidad_SDT_Item_Seleccionar, false, false);
      AddObjectProperty("Cctcod", gxTv_SdtControlesdeCalidad_SDT_Item_Cctcod, false, false);
      AddObjectProperty("Cctdsc", gxTv_SdtControlesdeCalidad_SDT_Item_Cctdsc, false, false);
   }

   public boolean getgxTv_SdtControlesdeCalidad_SDT_Item_Seleccionar( )
   {
      return gxTv_SdtControlesdeCalidad_SDT_Item_Seleccionar ;
   }

   public void setgxTv_SdtControlesdeCalidad_SDT_Item_Seleccionar( boolean value )
   {
      gxTv_SdtControlesdeCalidad_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlesdeCalidad_SDT_Item_Seleccionar = value ;
   }

   public int getgxTv_SdtControlesdeCalidad_SDT_Item_Cctcod( )
   {
      return gxTv_SdtControlesdeCalidad_SDT_Item_Cctcod ;
   }

   public void setgxTv_SdtControlesdeCalidad_SDT_Item_Cctcod( int value )
   {
      gxTv_SdtControlesdeCalidad_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlesdeCalidad_SDT_Item_Cctcod = value ;
   }

   public String getgxTv_SdtControlesdeCalidad_SDT_Item_Cctdsc( )
   {
      return gxTv_SdtControlesdeCalidad_SDT_Item_Cctdsc ;
   }

   public void setgxTv_SdtControlesdeCalidad_SDT_Item_Cctdsc( String value )
   {
      gxTv_SdtControlesdeCalidad_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlesdeCalidad_SDT_Item_Cctdsc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtControlesdeCalidad_SDT_Item_N = (byte)(1) ;
      gxTv_SdtControlesdeCalidad_SDT_Item_Cctdsc = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtControlesdeCalidad_SDT_Item_N ;
   }

   public app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item Clone( )
   {
      return (app.controlcalidadhtd.SdtControlesdeCalidad_SDT_Item)(clone()) ;
   }

   public void setStruct( app.controlcalidadhtd.StructSdtControlesdeCalidad_SDT_Item struct )
   {
      setgxTv_SdtControlesdeCalidad_SDT_Item_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtControlesdeCalidad_SDT_Item_Cctcod(struct.getCctcod());
      setgxTv_SdtControlesdeCalidad_SDT_Item_Cctdsc(struct.getCctdsc());
   }

   @SuppressWarnings("unchecked")
   public app.controlcalidadhtd.StructSdtControlesdeCalidad_SDT_Item getStruct( )
   {
      app.controlcalidadhtd.StructSdtControlesdeCalidad_SDT_Item struct = new app.controlcalidadhtd.StructSdtControlesdeCalidad_SDT_Item ();
      struct.setSeleccionar(getgxTv_SdtControlesdeCalidad_SDT_Item_Seleccionar());
      struct.setCctcod(getgxTv_SdtControlesdeCalidad_SDT_Item_Cctcod());
      struct.setCctdsc(getgxTv_SdtControlesdeCalidad_SDT_Item_Cctdsc());
      return struct ;
   }

   protected byte gxTv_SdtControlesdeCalidad_SDT_Item_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtControlesdeCalidad_SDT_Item_Cctcod ;
   protected String gxTv_SdtControlesdeCalidad_SDT_Item_Cctdsc ;
   protected String sTagName ;
   protected boolean gxTv_SdtControlesdeCalidad_SDT_Item_Seleccionar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

