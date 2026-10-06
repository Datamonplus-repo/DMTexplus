package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtPedido_Defecto extends GxSilentTrnSdt
{
   public SdtPedido_Defecto( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtPedido_Defecto.class));
   }

   public SdtPedido_Defecto( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle, context, "SdtPedido_Defecto");
      initialize( remoteHandle) ;
   }

   public SdtPedido_Defecto( int remoteHandle ,
                             StructSdtPedido_Defecto struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public SdtPedido_Defecto( )
   {
      super( new ModelContext(SdtPedido_Defecto.class), "SdtPedido_Defecto");
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
      return (Object[][])(new Object[][]{new Object[]{"TipDefCod", short.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Defecto");
      metadata.set("BT", "TXPDISDEF");
      metadata.set("PK", "[ \"TipDefCod\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"DisCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"TipDefCod\" ],\"FKMap\":[  ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDefCod") )
            {
               gxTv_SdtPedido_Defecto_Tipdefcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDefDsc") )
            {
               gxTv_SdtPedido_Defecto_Tipdefdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DefPor") )
            {
               gxTv_SdtPedido_Defecto_Defpor = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtPedido_Defecto_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Modified") )
            {
               gxTv_SdtPedido_Defecto_Modified = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtPedido_Defecto_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDefCod_Z") )
            {
               gxTv_SdtPedido_Defecto_Tipdefcod_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDefDsc_Z") )
            {
               gxTv_SdtPedido_Defecto_Tipdefdsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DefPor_Z") )
            {
               gxTv_SdtPedido_Defecto_Defpor_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDefCod_N") )
            {
               gxTv_SdtPedido_Defecto_Tipdefcod_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipDefDsc_N") )
            {
               gxTv_SdtPedido_Defecto_Tipdefdsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "Pedido.Defecto" ;
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
      oWriter.writeElement("TipDefCod", GXutil.trim( GXutil.str( gxTv_SdtPedido_Defecto_Tipdefcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipDefDsc", gxTv_SdtPedido_Defecto_Tipdefdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DefPor", GXutil.trim( GXutil.str( gxTv_SdtPedido_Defecto_Defpor, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtPedido_Defecto_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Modified", GXutil.trim( GXutil.str( gxTv_SdtPedido_Defecto_Modified, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtPedido_Defecto_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipDefCod_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Defecto_Tipdefcod_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipDefDsc_Z", gxTv_SdtPedido_Defecto_Tipdefdsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("DefPor_Z", GXutil.trim( GXutil.str( gxTv_SdtPedido_Defecto_Defpor_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipDefCod_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Defecto_Tipdefcod_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipDefDsc_N", GXutil.trim( GXutil.str( gxTv_SdtPedido_Defecto_Tipdefdsc_N, 1, 0)));
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
      AddObjectProperty("TipDefCod", gxTv_SdtPedido_Defecto_Tipdefcod, false, includeNonInitialized);
      AddObjectProperty("TipDefCod_N", gxTv_SdtPedido_Defecto_Tipdefcod_N, false, includeNonInitialized);
      AddObjectProperty("TipDefDsc", gxTv_SdtPedido_Defecto_Tipdefdsc, false, includeNonInitialized);
      AddObjectProperty("TipDefDsc_N", gxTv_SdtPedido_Defecto_Tipdefdsc_N, false, includeNonInitialized);
      AddObjectProperty("DefPor", gxTv_SdtPedido_Defecto_Defpor, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtPedido_Defecto_Mode, false, includeNonInitialized);
         AddObjectProperty("Modified", gxTv_SdtPedido_Defecto_Modified, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtPedido_Defecto_Initialized, false, includeNonInitialized);
         AddObjectProperty("TipDefCod_Z", gxTv_SdtPedido_Defecto_Tipdefcod_Z, false, includeNonInitialized);
         AddObjectProperty("TipDefDsc_Z", gxTv_SdtPedido_Defecto_Tipdefdsc_Z, false, includeNonInitialized);
         AddObjectProperty("DefPor_Z", gxTv_SdtPedido_Defecto_Defpor_Z, false, includeNonInitialized);
         AddObjectProperty("TipDefCod_N", gxTv_SdtPedido_Defecto_Tipdefcod_N, false, includeNonInitialized);
         AddObjectProperty("TipDefDsc_N", gxTv_SdtPedido_Defecto_Tipdefdsc_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.pedidosclientesindetalle.SdtPedido_Defecto sdt )
   {
      if ( sdt.IsDirty("TipDefCod") )
      {
         gxTv_SdtPedido_Defecto_N = (byte)(0) ;
         gxTv_SdtPedido_Defecto_Tipdefcod = sdt.getgxTv_SdtPedido_Defecto_Tipdefcod() ;
      }
      if ( sdt.IsDirty("TipDefDsc") )
      {
         gxTv_SdtPedido_Defecto_Tipdefdsc_N = sdt.getgxTv_SdtPedido_Defecto_Tipdefdsc_N() ;
         gxTv_SdtPedido_Defecto_N = (byte)(0) ;
         gxTv_SdtPedido_Defecto_Tipdefdsc = sdt.getgxTv_SdtPedido_Defecto_Tipdefdsc() ;
      }
      if ( sdt.IsDirty("DefPor") )
      {
         gxTv_SdtPedido_Defecto_N = (byte)(0) ;
         gxTv_SdtPedido_Defecto_Defpor = sdt.getgxTv_SdtPedido_Defecto_Defpor() ;
      }
   }

   public short getgxTv_SdtPedido_Defecto_Tipdefcod( )
   {
      return gxTv_SdtPedido_Defecto_Tipdefcod ;
   }

   public void setgxTv_SdtPedido_Defecto_Tipdefcod( short value )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_Modified = (short)(1) ;
      SetDirty("Tipdefcod");
      gxTv_SdtPedido_Defecto_Tipdefcod = value ;
   }

   public String getgxTv_SdtPedido_Defecto_Tipdefdsc( )
   {
      return gxTv_SdtPedido_Defecto_Tipdefdsc ;
   }

   public void setgxTv_SdtPedido_Defecto_Tipdefdsc( String value )
   {
      gxTv_SdtPedido_Defecto_Tipdefdsc_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_Modified = (short)(1) ;
      SetDirty("Tipdefdsc");
      gxTv_SdtPedido_Defecto_Tipdefdsc = value ;
   }

   public void setgxTv_SdtPedido_Defecto_Tipdefdsc_SetNull( )
   {
      gxTv_SdtPedido_Defecto_Tipdefdsc_N = (byte)(1) ;
      gxTv_SdtPedido_Defecto_Tipdefdsc = "" ;
      SetDirty("Tipdefdsc");
   }

   public boolean getgxTv_SdtPedido_Defecto_Tipdefdsc_IsNull( )
   {
      return (gxTv_SdtPedido_Defecto_Tipdefdsc_N==1) ;
   }

   public short getgxTv_SdtPedido_Defecto_Defpor( )
   {
      return gxTv_SdtPedido_Defecto_Defpor ;
   }

   public void setgxTv_SdtPedido_Defecto_Defpor( short value )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_Modified = (short)(1) ;
      SetDirty("Defpor");
      gxTv_SdtPedido_Defecto_Defpor = value ;
   }

   public String getgxTv_SdtPedido_Defecto_Mode( )
   {
      return gxTv_SdtPedido_Defecto_Mode ;
   }

   public void setgxTv_SdtPedido_Defecto_Mode( String value )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtPedido_Defecto_Mode = value ;
   }

   public void setgxTv_SdtPedido_Defecto_Mode_SetNull( )
   {
      gxTv_SdtPedido_Defecto_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtPedido_Defecto_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Defecto_Modified( )
   {
      return gxTv_SdtPedido_Defecto_Modified ;
   }

   public void setgxTv_SdtPedido_Defecto_Modified( short value )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      SetDirty("Modified");
      gxTv_SdtPedido_Defecto_Modified = value ;
   }

   public void setgxTv_SdtPedido_Defecto_Modified_SetNull( )
   {
      gxTv_SdtPedido_Defecto_Modified = (short)(0) ;
      SetDirty("Modified");
   }

   public boolean getgxTv_SdtPedido_Defecto_Modified_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Defecto_Initialized( )
   {
      return gxTv_SdtPedido_Defecto_Initialized ;
   }

   public void setgxTv_SdtPedido_Defecto_Initialized( short value )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_Modified = (short)(1) ;
      SetDirty("Initialized");
      gxTv_SdtPedido_Defecto_Initialized = value ;
   }

   public void setgxTv_SdtPedido_Defecto_Initialized_SetNull( )
   {
      gxTv_SdtPedido_Defecto_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtPedido_Defecto_Initialized_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Defecto_Tipdefcod_Z( )
   {
      return gxTv_SdtPedido_Defecto_Tipdefcod_Z ;
   }

   public void setgxTv_SdtPedido_Defecto_Tipdefcod_Z( short value )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_Modified = (short)(1) ;
      SetDirty("Tipdefcod_Z");
      gxTv_SdtPedido_Defecto_Tipdefcod_Z = value ;
   }

   public void setgxTv_SdtPedido_Defecto_Tipdefcod_Z_SetNull( )
   {
      gxTv_SdtPedido_Defecto_Tipdefcod_Z = (short)(0) ;
      SetDirty("Tipdefcod_Z");
   }

   public boolean getgxTv_SdtPedido_Defecto_Tipdefcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtPedido_Defecto_Tipdefdsc_Z( )
   {
      return gxTv_SdtPedido_Defecto_Tipdefdsc_Z ;
   }

   public void setgxTv_SdtPedido_Defecto_Tipdefdsc_Z( String value )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_Modified = (short)(1) ;
      SetDirty("Tipdefdsc_Z");
      gxTv_SdtPedido_Defecto_Tipdefdsc_Z = value ;
   }

   public void setgxTv_SdtPedido_Defecto_Tipdefdsc_Z_SetNull( )
   {
      gxTv_SdtPedido_Defecto_Tipdefdsc_Z = "" ;
      SetDirty("Tipdefdsc_Z");
   }

   public boolean getgxTv_SdtPedido_Defecto_Tipdefdsc_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtPedido_Defecto_Defpor_Z( )
   {
      return gxTv_SdtPedido_Defecto_Defpor_Z ;
   }

   public void setgxTv_SdtPedido_Defecto_Defpor_Z( short value )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_Modified = (short)(1) ;
      SetDirty("Defpor_Z");
      gxTv_SdtPedido_Defecto_Defpor_Z = value ;
   }

   public void setgxTv_SdtPedido_Defecto_Defpor_Z_SetNull( )
   {
      gxTv_SdtPedido_Defecto_Defpor_Z = (short)(0) ;
      SetDirty("Defpor_Z");
   }

   public boolean getgxTv_SdtPedido_Defecto_Defpor_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Defecto_Tipdefcod_N( )
   {
      return gxTv_SdtPedido_Defecto_Tipdefcod_N ;
   }

   public void setgxTv_SdtPedido_Defecto_Tipdefcod_N( byte value )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_Modified = (short)(1) ;
      SetDirty("Tipdefcod_N");
      gxTv_SdtPedido_Defecto_Tipdefcod_N = value ;
   }

   public void setgxTv_SdtPedido_Defecto_Tipdefcod_N_SetNull( )
   {
      gxTv_SdtPedido_Defecto_Tipdefcod_N = (byte)(0) ;
      SetDirty("Tipdefcod_N");
   }

   public boolean getgxTv_SdtPedido_Defecto_Tipdefcod_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtPedido_Defecto_Tipdefdsc_N( )
   {
      return gxTv_SdtPedido_Defecto_Tipdefdsc_N ;
   }

   public void setgxTv_SdtPedido_Defecto_Tipdefdsc_N( byte value )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto_Modified = (short)(1) ;
      SetDirty("Tipdefdsc_N");
      gxTv_SdtPedido_Defecto_Tipdefdsc_N = value ;
   }

   public void setgxTv_SdtPedido_Defecto_Tipdefdsc_N_SetNull( )
   {
      gxTv_SdtPedido_Defecto_Tipdefdsc_N = (byte)(0) ;
      SetDirty("Tipdefdsc_N");
   }

   public boolean getgxTv_SdtPedido_Defecto_Tipdefdsc_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtPedido_Defecto_N = (byte)(1) ;
      gxTv_SdtPedido_Defecto_Tipdefdsc = "" ;
      gxTv_SdtPedido_Defecto_Mode = "" ;
      gxTv_SdtPedido_Defecto_Tipdefdsc_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtPedido_Defecto_N ;
   }

   public app.pedidosclientesindetalle.SdtPedido_Defecto Clone( )
   {
      return (app.pedidosclientesindetalle.SdtPedido_Defecto)(clone()) ;
   }

   public void setStruct( app.pedidosclientesindetalle.StructSdtPedido_Defecto struct )
   {
      setgxTv_SdtPedido_Defecto_Tipdefcod(struct.getTipdefcod());
      setgxTv_SdtPedido_Defecto_Tipdefdsc(struct.getTipdefdsc());
      setgxTv_SdtPedido_Defecto_Defpor(struct.getDefpor());
      setgxTv_SdtPedido_Defecto_Mode(struct.getMode());
      setgxTv_SdtPedido_Defecto_Modified(struct.getModified());
      setgxTv_SdtPedido_Defecto_Initialized(struct.getInitialized());
      setgxTv_SdtPedido_Defecto_Tipdefcod_Z(struct.getTipdefcod_Z());
      setgxTv_SdtPedido_Defecto_Tipdefdsc_Z(struct.getTipdefdsc_Z());
      setgxTv_SdtPedido_Defecto_Defpor_Z(struct.getDefpor_Z());
      setgxTv_SdtPedido_Defecto_Tipdefcod_N(struct.getTipdefcod_N());
      setgxTv_SdtPedido_Defecto_Tipdefdsc_N(struct.getTipdefdsc_N());
   }

   @SuppressWarnings("unchecked")
   public app.pedidosclientesindetalle.StructSdtPedido_Defecto getStruct( )
   {
      app.pedidosclientesindetalle.StructSdtPedido_Defecto struct = new app.pedidosclientesindetalle.StructSdtPedido_Defecto ();
      struct.setTipdefcod(getgxTv_SdtPedido_Defecto_Tipdefcod());
      struct.setTipdefdsc(getgxTv_SdtPedido_Defecto_Tipdefdsc());
      struct.setDefpor(getgxTv_SdtPedido_Defecto_Defpor());
      struct.setMode(getgxTv_SdtPedido_Defecto_Mode());
      struct.setModified(getgxTv_SdtPedido_Defecto_Modified());
      struct.setInitialized(getgxTv_SdtPedido_Defecto_Initialized());
      struct.setTipdefcod_Z(getgxTv_SdtPedido_Defecto_Tipdefcod_Z());
      struct.setTipdefdsc_Z(getgxTv_SdtPedido_Defecto_Tipdefdsc_Z());
      struct.setDefpor_Z(getgxTv_SdtPedido_Defecto_Defpor_Z());
      struct.setTipdefcod_N(getgxTv_SdtPedido_Defecto_Tipdefcod_N());
      struct.setTipdefdsc_N(getgxTv_SdtPedido_Defecto_Tipdefdsc_N());
      return struct ;
   }

   private byte gxTv_SdtPedido_Defecto_N ;
   private byte gxTv_SdtPedido_Defecto_Tipdefcod_N ;
   private byte gxTv_SdtPedido_Defecto_Tipdefdsc_N ;
   private short gxTv_SdtPedido_Defecto_Tipdefcod ;
   private short gxTv_SdtPedido_Defecto_Defpor ;
   private short gxTv_SdtPedido_Defecto_Modified ;
   private short gxTv_SdtPedido_Defecto_Initialized ;
   private short gxTv_SdtPedido_Defecto_Tipdefcod_Z ;
   private short gxTv_SdtPedido_Defecto_Defpor_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_SdtPedido_Defecto_Tipdefdsc ;
   private String gxTv_SdtPedido_Defecto_Mode ;
   private String gxTv_SdtPedido_Defecto_Tipdefdsc_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
}

