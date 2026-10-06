package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtControlCalidad_CC1_SDT_Item extends GxUserType
{
   public SdtControlCalidad_CC1_SDT_Item( )
   {
      this(  new ModelContext(SdtControlCalidad_CC1_SDT_Item.class));
   }

   public SdtControlCalidad_CC1_SDT_Item( ModelContext context )
   {
      super( context, "SdtControlCalidad_CC1_SDT_Item");
   }

   public SdtControlCalidad_CC1_SDT_Item( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtControlCalidad_CC1_SDT_Item");
   }

   public SdtControlCalidad_CC1_SDT_Item( StructSdtControlCalidad_CC1_SDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cctlin") )
            {
               gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cctlindsc") )
            {
               gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cctlindc2") )
            {
               gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindc2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCMetodo") )
            {
               gxTv_SdtControlCalidad_CC1_SDT_Item_Ccmetodo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCEspecif2") )
            {
               gxTv_SdtControlCalidad_CC1_SDT_Item_Ccespecif2 = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCVal") )
            {
               gxTv_SdtControlCalidad_CC1_SDT_Item_Ccval = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCTValDsc") )
            {
               gxTv_SdtControlCalidad_CC1_SDT_Item_Cctvaldsc = oReader.getValue() ;
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
         sName = "ControlCalidad_CC1_SDT.Item" ;
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
      oWriter.writeElement("Cctlin", GXutil.trim( GXutil.str( gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cctlindsc", gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Cctlindc2", gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindc2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCMetodo", gxTv_SdtControlCalidad_CC1_SDT_Item_Ccmetodo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCEspecif2", gxTv_SdtControlCalidad_CC1_SDT_Item_Ccespecif2);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCVal", gxTv_SdtControlCalidad_CC1_SDT_Item_Ccval);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCTValDsc", gxTv_SdtControlCalidad_CC1_SDT_Item_Cctvaldsc);
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
      AddObjectProperty("Cctlin", gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlin, false, false);
      AddObjectProperty("Cctlindsc", gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindsc, false, false);
      AddObjectProperty("Cctlindc2", gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindc2, false, false);
      AddObjectProperty("CCMetodo", gxTv_SdtControlCalidad_CC1_SDT_Item_Ccmetodo, false, false);
      AddObjectProperty("CCEspecif2", gxTv_SdtControlCalidad_CC1_SDT_Item_Ccespecif2, false, false);
      AddObjectProperty("CCVal", gxTv_SdtControlCalidad_CC1_SDT_Item_Ccval, false, false);
      AddObjectProperty("CCTValDsc", gxTv_SdtControlCalidad_CC1_SDT_Item_Cctvaldsc, false, false);
   }

   public short getgxTv_SdtControlCalidad_CC1_SDT_Item_Cctlin( )
   {
      return gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlin ;
   }

   public void setgxTv_SdtControlCalidad_CC1_SDT_Item_Cctlin( short value )
   {
      gxTv_SdtControlCalidad_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlin = value ;
   }

   public String getgxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindsc( )
   {
      return gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindsc ;
   }

   public void setgxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindsc( String value )
   {
      gxTv_SdtControlCalidad_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindsc = value ;
   }

   public String getgxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindc2( )
   {
      return gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindc2 ;
   }

   public void setgxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindc2( String value )
   {
      gxTv_SdtControlCalidad_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindc2 = value ;
   }

   public String getgxTv_SdtControlCalidad_CC1_SDT_Item_Ccmetodo( )
   {
      return gxTv_SdtControlCalidad_CC1_SDT_Item_Ccmetodo ;
   }

   public void setgxTv_SdtControlCalidad_CC1_SDT_Item_Ccmetodo( String value )
   {
      gxTv_SdtControlCalidad_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Ccmetodo = value ;
   }

   public String getgxTv_SdtControlCalidad_CC1_SDT_Item_Ccespecif2( )
   {
      return gxTv_SdtControlCalidad_CC1_SDT_Item_Ccespecif2 ;
   }

   public void setgxTv_SdtControlCalidad_CC1_SDT_Item_Ccespecif2( String value )
   {
      gxTv_SdtControlCalidad_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Ccespecif2 = value ;
   }

   public String getgxTv_SdtControlCalidad_CC1_SDT_Item_Ccval( )
   {
      return gxTv_SdtControlCalidad_CC1_SDT_Item_Ccval ;
   }

   public void setgxTv_SdtControlCalidad_CC1_SDT_Item_Ccval( String value )
   {
      gxTv_SdtControlCalidad_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Ccval = value ;
   }

   public String getgxTv_SdtControlCalidad_CC1_SDT_Item_Cctvaldsc( )
   {
      return gxTv_SdtControlCalidad_CC1_SDT_Item_Cctvaldsc ;
   }

   public void setgxTv_SdtControlCalidad_CC1_SDT_Item_Cctvaldsc( String value )
   {
      gxTv_SdtControlCalidad_CC1_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Cctvaldsc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtControlCalidad_CC1_SDT_Item_N = (byte)(1) ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindsc = "" ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindc2 = "" ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Ccmetodo = "" ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Ccespecif2 = "" ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Ccval = "" ;
      gxTv_SdtControlCalidad_CC1_SDT_Item_Cctvaldsc = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtControlCalidad_CC1_SDT_Item_N ;
   }

   public app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item Clone( )
   {
      return (app.controlcalidadhtd.SdtControlCalidad_CC1_SDT_Item)(clone()) ;
   }

   public void setStruct( app.controlcalidadhtd.StructSdtControlCalidad_CC1_SDT_Item struct )
   {
      setgxTv_SdtControlCalidad_CC1_SDT_Item_Cctlin(struct.getCctlin());
      setgxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindsc(struct.getCctlindsc());
      setgxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindc2(struct.getCctlindc2());
      setgxTv_SdtControlCalidad_CC1_SDT_Item_Ccmetodo(struct.getCcmetodo());
      setgxTv_SdtControlCalidad_CC1_SDT_Item_Ccespecif2(struct.getCcespecif2());
      setgxTv_SdtControlCalidad_CC1_SDT_Item_Ccval(struct.getCcval());
      setgxTv_SdtControlCalidad_CC1_SDT_Item_Cctvaldsc(struct.getCctvaldsc());
   }

   @SuppressWarnings("unchecked")
   public app.controlcalidadhtd.StructSdtControlCalidad_CC1_SDT_Item getStruct( )
   {
      app.controlcalidadhtd.StructSdtControlCalidad_CC1_SDT_Item struct = new app.controlcalidadhtd.StructSdtControlCalidad_CC1_SDT_Item ();
      struct.setCctlin(getgxTv_SdtControlCalidad_CC1_SDT_Item_Cctlin());
      struct.setCctlindsc(getgxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindsc());
      struct.setCctlindc2(getgxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindc2());
      struct.setCcmetodo(getgxTv_SdtControlCalidad_CC1_SDT_Item_Ccmetodo());
      struct.setCcespecif2(getgxTv_SdtControlCalidad_CC1_SDT_Item_Ccespecif2());
      struct.setCcval(getgxTv_SdtControlCalidad_CC1_SDT_Item_Ccval());
      struct.setCctvaldsc(getgxTv_SdtControlCalidad_CC1_SDT_Item_Cctvaldsc());
      return struct ;
   }

   protected byte gxTv_SdtControlCalidad_CC1_SDT_Item_N ;
   protected short gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlin ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindsc ;
   protected String gxTv_SdtControlCalidad_CC1_SDT_Item_Cctlindc2 ;
   protected String gxTv_SdtControlCalidad_CC1_SDT_Item_Ccmetodo ;
   protected String gxTv_SdtControlCalidad_CC1_SDT_Item_Ccespecif2 ;
   protected String gxTv_SdtControlCalidad_CC1_SDT_Item_Ccval ;
   protected String gxTv_SdtControlCalidad_CC1_SDT_Item_Cctvaldsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

