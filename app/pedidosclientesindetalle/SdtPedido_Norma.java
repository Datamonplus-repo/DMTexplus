package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtPedido_Norma extends GxSilentTrnSdt
{
   public SdtPedido_Norma( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtPedido_Norma.class));
   }

   public SdtPedido_Norma( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtPedido_Norma");
      initialize( remoteHandle) ;
   }

   public SdtPedido_Norma( int remoteHandle ,
                           StructSdtPedido_Norma struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public SdtPedido_Norma( )
   {
      super( new ModelContext(SdtPedido_Norma.class), "SdtPedido_Norma");
      initialize( ) ;
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"DisNormID", String.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Norma");
      metadata.set("BT", "TXPDISNOR");
      metadata.set("PK", "[ \"DisNormID\" ]");
      metadata.set("PKAssigned", "[ \"DisNormID\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"DisCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"NormaID\" ],\"FKMap\":[ \"DisNormID-NormaID\" ] } ]");
      metadata.set("AllowInsert", "True");
      metadata.set("AllowUpdate", "True");
      metadata.set("AllowDelete", "True");
      return metadata ;
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNormID") )
            {
               gxTv_SdtPedido_Norma_Disnormid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNormDsc") )
            {
               gxTv_SdtPedido_Norma_Disnormdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNormSt") )
            {
               gxTv_SdtPedido_Norma_Disnormst = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNormNC") )
            {
               gxTv_SdtPedido_Norma_Disnormnc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtPedido_Norma_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Modified") )
            {
               gxTv_SdtPedido_Norma_Modified = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtPedido_Norma_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNormID_Z") )
            {
               gxTv_SdtPedido_Norma_Disnormid_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNormDsc_Z") )
            {
               gxTv_SdtPedido_Norma_Disnormdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNormSt_Z") )
            {
               gxTv_SdtPedido_Norma_Disnormst_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNormNC_Z") )
            {
               gxTv_SdtPedido_Norma_Disnormnc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DisNormDsc_N") )
            {
               gxTv_SdtPedido_Norma_Disnormdsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "Pedido.Norma" ;
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
      oWriter.writeElement("DisNormID", gxTv_SdtPedido_Norma_Disnormid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNormDsc", gxTv_SdtPedido_Norma_Disnormdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNormSt", gxTv_SdtPedido_Norma_Disnormst);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DisNormNC", gxTv_SdtPedido_Norma_Disnormnc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtPedido_Norma_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Modified", GXutil.trim( GXutil.str( gxTv_SdtPedido_Norma_Modified, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtPedido_Norma_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisNormID_Z", gxTv_SdtPedido_Norma_Disnormid_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisNormDsc_Z", gxTv_SdtPedido_Norma_Disnormdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisNormSt_Z", gxTv_SdtPedido_Norma_Disnormst_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisNormNC_Z", gxTv_SdtPedido_Norma_Disnormnc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DisNormDsc_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Norma_Disnormdsc_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
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
      AddObjectProperty("DisNormID", gxTv_SdtPedido_Norma_Disnormid, false, includeNonInitialized);
      AddObjectProperty("DisNormDsc", gxTv_SdtPedido_Norma_Disnormdsc, false, includeNonInitialized);
      AddObjectProperty("DisNormDsc_N", gxTv_SdtPedido_Norma_Disnormdsc_N, false, includeNonInitialized);
      AddObjectProperty("DisNormSt", gxTv_SdtPedido_Norma_Disnormst, false, includeNonInitialized);
      AddObjectProperty("DisNormNC", gxTv_SdtPedido_Norma_Disnormnc, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtPedido_Norma_Mode, false, includeNonInitialized);
         AddObjectProperty("Modified", gxTv_SdtPedido_Norma_Modified, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtPedido_Norma_Initialized, false, includeNonInitialized);
         AddObjectProperty("DisNormID_Z", gxTv_SdtPedido_Norma_Disnormid_Z, false, includeNonInitialized);
         AddObjectProperty("DisNormDsc_Z", gxTv_SdtPedido_Norma_Disnormdsc_Z, false, includeNonInitialized);
         AddObjectProperty("DisNormSt_Z", gxTv_SdtPedido_Norma_Disnormst_Z, false, includeNonInitialized);
         AddObjectProperty("DisNormNC_Z", gxTv_SdtPedido_Norma_Disnormnc_Z, false, includeNonInitialized);
         AddObjectProperty("DisNormDsc_N", gxTv_SdtPedido_Norma_Disnormdsc_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.pedidosclientesindetalle.SdtPedido_Norma sdt )
   {
      if ( sdt.IsDirty("DisNormID") )
      {
         gxTv_SdtPedido_Norma_N = (byte)(0) ;
         gxTv_SdtPedido_Norma_Disnormid = sdt.getgxTv_SdtPedido_Norma_Disnormid() ;
      }
      if ( sdt.IsDirty("DisNormDsc") )
      {
         gxTv_SdtPedido_Norma_Disnormdsc_N = sdt.getgxTv_SdtPedido_Norma_Disnormdsc_N() ;
         gxTv_SdtPedido_Norma_N = (byte)(0) ;
         gxTv_SdtPedido_Norma_Disnormdsc = sdt.getgxTv_SdtPedido_Norma_Disnormdsc() ;
      }
      if ( sdt.IsDirty("DisNormSt") )
      {
         gxTv_SdtPedido_Norma_N = (byte)(0) ;
         gxTv_SdtPedido_Norma_Disnormst = sdt.getgxTv_SdtPedido_Norma_Disnormst() ;
      }
      if ( sdt.IsDirty("DisNormNC") )
      {
         gxTv_SdtPedido_Norma_N = (byte)(0) ;
         gxTv_SdtPedido_Norma_Disnormnc = sdt.getgxTv_SdtPedido_Norma_Disnormnc() ;
      }
   }

   public String getgxTv_SdtPedido_Norma_Disnormid( )
   {
      return gxTv_SdtPedido_Norma_Disnormid ;
   }

   public void setgxTv_SdtPedido_Norma_Disnormid( String value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Modified = (short)(1) ;
      SetDirty("Disnormid");
      gxTv_SdtPedido_Norma_Disnormid = value ;
   }

   public String getgxTv_SdtPedido_Norma_Disnormdsc( )
   {
      return gxTv_SdtPedido_Norma_Disnormdsc ;
   }

   public void setgxTv_SdtPedido_Norma_Disnormdsc( String value )
   {
      gxTv_SdtPedido_Norma_Disnormdsc_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Modified = (short)(1) ;
      SetDirty("Disnormdsc");
      gxTv_SdtPedido_Norma_Disnormdsc = value ;
   }

   public void setgxTv_SdtPedido_Norma_Disnormdsc_SetNull( )
   {
      gxTv_SdtPedido_Norma_Disnormdsc_N = (byte)(1) ;
      gxTv_SdtPedido_Norma_Disnormdsc = "" ;
      SetDirty("Disnormdsc");
   }

   public boolean getgxTv_SdtPedido_Norma_Disnormdsc_IsNull( )
   {
      return (gxTv_SdtPedido_Norma_Disnormdsc_N==1) ;
   }

   public String getgxTv_SdtPedido_Norma_Disnormst( )
   {
      return gxTv_SdtPedido_Norma_Disnormst ;
   }

   public void setgxTv_SdtPedido_Norma_Disnormst( String value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Modified = (short)(1) ;
      SetDirty("Disnormst");
      gxTv_SdtPedido_Norma_Disnormst = value ;
   }

   public String getgxTv_SdtPedido_Norma_Disnormnc( )
   {
      return gxTv_SdtPedido_Norma_Disnormnc ;
   }

   public void setgxTv_SdtPedido_Norma_Disnormnc( String value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Modified = (short)(1) ;
      SetDirty("Disnormnc");
      gxTv_SdtPedido_Norma_Disnormnc = value ;
   }

   public String getgxTv_SdtPedido_Norma_Mode( )
   {
      return gxTv_SdtPedido_Norma_Mode ;
   }

   public void setgxTv_SdtPedido_Norma_Mode( String value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtPedido_Norma_Mode = value ;
   }

   public void setgxTv_SdtPedido_Norma_Mode_SetNull( )
   {
      gxTv_SdtPedido_Norma_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtPedido_Norma_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Norma_Modified( )
   {
      return gxTv_SdtPedido_Norma_Modified ;
   }

   public void setgxTv_SdtPedido_Norma_Modified( short value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      SetDirty("Modified");
      gxTv_SdtPedido_Norma_Modified = value ;
   }

   public void setgxTv_SdtPedido_Norma_Modified_SetNull( )
   {
      gxTv_SdtPedido_Norma_Modified = (short)(0) ;
      SetDirty("Modified");
   }

   public boolean getgxTv_SdtPedido_Norma_Modified_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Norma_Initialized( )
   {
      return gxTv_SdtPedido_Norma_Initialized ;
   }

   public void setgxTv_SdtPedido_Norma_Initialized( short value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Modified = (short)(1) ;
      SetDirty("Initialized");
      gxTv_SdtPedido_Norma_Initialized = value ;
   }

   public void setgxTv_SdtPedido_Norma_Initialized_SetNull( )
   {
      gxTv_SdtPedido_Norma_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtPedido_Norma_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Norma_Disnormid_Z( )
   {
      return gxTv_SdtPedido_Norma_Disnormid_Z ;
   }

   public void setgxTv_SdtPedido_Norma_Disnormid_Z( String value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Modified = (short)(1) ;
      SetDirty("Disnormid_Z");
      gxTv_SdtPedido_Norma_Disnormid_Z = value ;
   }

   public void setgxTv_SdtPedido_Norma_Disnormid_Z_SetNull( )
   {
      gxTv_SdtPedido_Norma_Disnormid_Z = "" ;
      SetDirty("Disnormid_Z");
   }

   public boolean getgxTv_SdtPedido_Norma_Disnormid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Norma_Disnormdsc_Z( )
   {
      return gxTv_SdtPedido_Norma_Disnormdsc_Z ;
   }

   public void setgxTv_SdtPedido_Norma_Disnormdsc_Z( String value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Modified = (short)(1) ;
      SetDirty("Disnormdsc_Z");
      gxTv_SdtPedido_Norma_Disnormdsc_Z = value ;
   }

   public void setgxTv_SdtPedido_Norma_Disnormdsc_Z_SetNull( )
   {
      gxTv_SdtPedido_Norma_Disnormdsc_Z = "" ;
      SetDirty("Disnormdsc_Z");
   }

   public boolean getgxTv_SdtPedido_Norma_Disnormdsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Norma_Disnormst_Z( )
   {
      return gxTv_SdtPedido_Norma_Disnormst_Z ;
   }

   public void setgxTv_SdtPedido_Norma_Disnormst_Z( String value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Modified = (short)(1) ;
      SetDirty("Disnormst_Z");
      gxTv_SdtPedido_Norma_Disnormst_Z = value ;
   }

   public void setgxTv_SdtPedido_Norma_Disnormst_Z_SetNull( )
   {
      gxTv_SdtPedido_Norma_Disnormst_Z = "" ;
      SetDirty("Disnormst_Z");
   }

   public boolean getgxTv_SdtPedido_Norma_Disnormst_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Norma_Disnormnc_Z( )
   {
      return gxTv_SdtPedido_Norma_Disnormnc_Z ;
   }

   public void setgxTv_SdtPedido_Norma_Disnormnc_Z( String value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Modified = (short)(1) ;
      SetDirty("Disnormnc_Z");
      gxTv_SdtPedido_Norma_Disnormnc_Z = value ;
   }

   public void setgxTv_SdtPedido_Norma_Disnormnc_Z_SetNull( )
   {
      gxTv_SdtPedido_Norma_Disnormnc_Z = "" ;
      SetDirty("Disnormnc_Z");
   }

   public boolean getgxTv_SdtPedido_Norma_Disnormnc_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Norma_Disnormdsc_N( )
   {
      return gxTv_SdtPedido_Norma_Disnormdsc_N ;
   }

   public void setgxTv_SdtPedido_Norma_Disnormdsc_N( byte value )
   {
      gxTv_SdtPedido_Norma_N = (byte)(0) ;
      gxTv_SdtPedido_Norma_Modified = (short)(1) ;
      SetDirty("Disnormdsc_N");
      gxTv_SdtPedido_Norma_Disnormdsc_N = value ;
   }

   public void setgxTv_SdtPedido_Norma_Disnormdsc_N_SetNull( )
   {
      gxTv_SdtPedido_Norma_Disnormdsc_N = (byte)(0) ;
      SetDirty("Disnormdsc_N");
   }

   public boolean getgxTv_SdtPedido_Norma_Disnormdsc_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtPedido_Norma_Disnormid = "" ;
      gxTv_SdtPedido_Norma_N = (byte)(1) ;
      gxTv_SdtPedido_Norma_Disnormdsc = "" ;
      gxTv_SdtPedido_Norma_Disnormst = "" ;
      gxTv_SdtPedido_Norma_Disnormnc = "" ;
      gxTv_SdtPedido_Norma_Mode = "" ;
      gxTv_SdtPedido_Norma_Disnormid_Z = "" ;
      gxTv_SdtPedido_Norma_Disnormdsc_Z = "" ;
      gxTv_SdtPedido_Norma_Disnormst_Z = "" ;
      gxTv_SdtPedido_Norma_Disnormnc_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtPedido_Norma_N ;
   }

   public app.pedidosclientesindetalle.SdtPedido_Norma Clone( )
   {
      return (app.pedidosclientesindetalle.SdtPedido_Norma)(clone()) ;
   }

   public void setStruct( app.pedidosclientesindetalle.StructSdtPedido_Norma struct )
   {
      setgxTv_SdtPedido_Norma_Disnormid(struct.getDisnormid());
      setgxTv_SdtPedido_Norma_Disnormdsc(struct.getDisnormdsc());
      setgxTv_SdtPedido_Norma_Disnormst(struct.getDisnormst());
      setgxTv_SdtPedido_Norma_Disnormnc(struct.getDisnormnc());
      setgxTv_SdtPedido_Norma_Mode(struct.getMode());
      setgxTv_SdtPedido_Norma_Modified(struct.getModified());
      setgxTv_SdtPedido_Norma_Initialized(struct.getInitialized());
      setgxTv_SdtPedido_Norma_Disnormid_Z(struct.getDisnormid_Z());
      setgxTv_SdtPedido_Norma_Disnormdsc_Z(struct.getDisnormdsc_Z());
      setgxTv_SdtPedido_Norma_Disnormst_Z(struct.getDisnormst_Z());
      setgxTv_SdtPedido_Norma_Disnormnc_Z(struct.getDisnormnc_Z());
      setgxTv_SdtPedido_Norma_Disnormdsc_N(struct.getDisnormdsc_N());
   }

   @SuppressWarnings("unchecked")
   public app.pedidosclientesindetalle.StructSdtPedido_Norma getStruct( )
   {
      app.pedidosclientesindetalle.StructSdtPedido_Norma struct = new app.pedidosclientesindetalle.StructSdtPedido_Norma ();
      struct.setDisnormid(getgxTv_SdtPedido_Norma_Disnormid());
      struct.setDisnormdsc(getgxTv_SdtPedido_Norma_Disnormdsc());
      struct.setDisnormst(getgxTv_SdtPedido_Norma_Disnormst());
      struct.setDisnormnc(getgxTv_SdtPedido_Norma_Disnormnc());
      struct.setMode(getgxTv_SdtPedido_Norma_Mode());
      struct.setModified(getgxTv_SdtPedido_Norma_Modified());
      struct.setInitialized(getgxTv_SdtPedido_Norma_Initialized());
      struct.setDisnormid_Z(getgxTv_SdtPedido_Norma_Disnormid_Z());
      struct.setDisnormdsc_Z(getgxTv_SdtPedido_Norma_Disnormdsc_Z());
      struct.setDisnormst_Z(getgxTv_SdtPedido_Norma_Disnormst_Z());
      struct.setDisnormnc_Z(getgxTv_SdtPedido_Norma_Disnormnc_Z());
      struct.setDisnormdsc_N(getgxTv_SdtPedido_Norma_Disnormdsc_N());
      return struct ;
   }

   private byte gxTv_SdtPedido_Norma_N ;
   private byte gxTv_SdtPedido_Norma_Disnormdsc_N ;
   private short gxTv_SdtPedido_Norma_Modified ;
   private short gxTv_SdtPedido_Norma_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_SdtPedido_Norma_Disnormid ;
   private String gxTv_SdtPedido_Norma_Disnormdsc ;
   private String gxTv_SdtPedido_Norma_Disnormst ;
   private String gxTv_SdtPedido_Norma_Disnormnc ;
   private String gxTv_SdtPedido_Norma_Mode ;
   private String gxTv_SdtPedido_Norma_Disnormid_Z ;
   private String gxTv_SdtPedido_Norma_Disnormdsc_Z ;
   private String gxTv_SdtPedido_Norma_Disnormst_Z ;
   private String gxTv_SdtPedido_Norma_Disnormnc_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
}

