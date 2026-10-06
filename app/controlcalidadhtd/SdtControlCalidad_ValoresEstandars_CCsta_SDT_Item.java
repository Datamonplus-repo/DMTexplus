package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item extends GxUserType
{
   public SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item( )
   {
      this(  new ModelContext(SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item.class));
   }

   public SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item( ModelContext context )
   {
      super( context, "SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item");
   }

   public SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item( int remoteHandle ,
                                                             ModelContext context )
   {
      super( remoteHandle, context, "SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item");
   }

   public SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item( StructSdtControlCalidad_ValoresEstandars_CCsta_SDT_Item struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCtlin") )
            {
               gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCtlindsc") )
            {
               gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlindsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCsauto") )
            {
               gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsauto = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCsvtol") )
            {
               gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsvtol = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCsmin") )
            {
               gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmin = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Ccsmax") )
            {
               gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmax = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCvdsc") )
            {
               gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccvdsc = oReader.getValue() ;
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
         sName = "ControlCalidad_ValoresEstandars_CCsta_SDT.Item" ;
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
      oWriter.writeElement("CCtlin", GXutil.trim( GXutil.str( gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCtlindsc", gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlindsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCsauto", GXutil.trim( GXutil.str( gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsauto, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCsvtol", GXutil.trim( GXutil.strNoRound( gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsvtol, 5, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCsmin", gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmin);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Ccsmax", gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmax);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCvdsc", gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccvdsc);
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
      AddObjectProperty("CCtlin", gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlin, false, false);
      AddObjectProperty("CCtlindsc", gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlindsc, false, false);
      AddObjectProperty("CCsauto", gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsauto, false, false);
      AddObjectProperty("CCsvtol", gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsvtol, false, false);
      AddObjectProperty("CCsmin", gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmin, false, false);
      AddObjectProperty("Ccsmax", gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmax, false, false);
      AddObjectProperty("CCvdsc", gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccvdsc, false, false);
   }

   public short getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlin( )
   {
      return gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlin ;
   }

   public void setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlin( short value )
   {
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlin = value ;
   }

   public String getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlindsc( )
   {
      return gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlindsc ;
   }

   public void setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlindsc( String value )
   {
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlindsc = value ;
   }

   public byte getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsauto( )
   {
      return gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsauto ;
   }

   public void setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsauto( byte value )
   {
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsauto = value ;
   }

   public java.math.BigDecimal getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsvtol( )
   {
      return gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsvtol ;
   }

   public void setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsvtol( java.math.BigDecimal value )
   {
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsvtol = value ;
   }

   public String getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmin( )
   {
      return gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmin ;
   }

   public void setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmin( String value )
   {
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmin = value ;
   }

   public String getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmax( )
   {
      return gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmax ;
   }

   public void setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmax( String value )
   {
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmax = value ;
   }

   public String getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccvdsc( )
   {
      return gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccvdsc ;
   }

   public void setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccvdsc( String value )
   {
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_N = (byte)(0) ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccvdsc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_N = (byte)(1) ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlindsc = "" ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsvtol = DecimalUtil.ZERO ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmin = "" ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmax = "" ;
      gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccvdsc = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_N ;
   }

   public app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item Clone( )
   {
      return (app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)(clone()) ;
   }

   public void setStruct( app.controlcalidadhtd.StructSdtControlCalidad_ValoresEstandars_CCsta_SDT_Item struct )
   {
      setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlin(struct.getCctlin());
      setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlindsc(struct.getCctlindsc());
      setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsauto(struct.getCcsauto());
      setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsvtol(struct.getCcsvtol());
      setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmin(struct.getCcsmin());
      setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmax(struct.getCcsmax());
      setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccvdsc(struct.getCcvdsc());
   }

   @SuppressWarnings("unchecked")
   public app.controlcalidadhtd.StructSdtControlCalidad_ValoresEstandars_CCsta_SDT_Item getStruct( )
   {
      app.controlcalidadhtd.StructSdtControlCalidad_ValoresEstandars_CCsta_SDT_Item struct = new app.controlcalidadhtd.StructSdtControlCalidad_ValoresEstandars_CCsta_SDT_Item ();
      struct.setCctlin(getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlin());
      struct.setCctlindsc(getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlindsc());
      struct.setCcsauto(getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsauto());
      struct.setCcsvtol(getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsvtol());
      struct.setCcsmin(getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmin());
      struct.setCcsmax(getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmax());
      struct.setCcvdsc(getgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccvdsc());
      return struct ;
   }

   protected byte gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_N ;
   protected byte gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsauto ;
   protected short gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlin ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsvtol ;
   protected String gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlindsc ;
   protected String gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmin ;
   protected String gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmax ;
   protected String gxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccvdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

