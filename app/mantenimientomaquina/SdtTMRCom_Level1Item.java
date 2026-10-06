package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTMRCom_Level1Item extends GxSilentTrnSdt
{
   public SdtTMRCom_Level1Item( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTMRCom_Level1Item.class));
   }

   public SdtTMRCom_Level1Item( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtTMRCom_Level1Item");
      initialize( remoteHandle) ;
   }

   public SdtTMRCom_Level1Item( int remoteHandle ,
                                StructSdtTMRCom_Level1Item struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public SdtTMRCom_Level1Item( )
   {
      super( new ModelContext(SdtTMRCom_Level1Item.class), "SdtTMRCom_Level1Item");
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
      return (Object[][])(new Object[][]{new Object[]{"MRComCod", int.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Level1Item");
      metadata.set("BT", "TXPMRCom1");
      metadata.set("PK", "[ \"MRComCod\" ]");
      metadata.set("PKAssigned", "[ \"MRComCod\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] },{ \"FK\":[ \"EmprCod\",\"MRCod\" ],\"FKMap\":[ \"MRComCod-MRCod\" ] },{ \"FK\":[ \"EmprCod\",\"MRPriCod\" ],\"FKMap\":[  ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRComCod") )
            {
               gxTv_SdtTMRCom_Level1Item_Mrcomcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRComNom") )
            {
               gxTv_SdtTMRCom_Level1Item_Mrcomnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTMRCom_Level1Item_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Modified") )
            {
               gxTv_SdtTMRCom_Level1Item_Modified = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTMRCom_Level1Item_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRComCod_Z") )
            {
               gxTv_SdtTMRCom_Level1Item_Mrcomcod_Z = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRComNom_Z") )
            {
               gxTv_SdtTMRCom_Level1Item_Mrcomnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MRComNom_N") )
            {
               gxTv_SdtTMRCom_Level1Item_Mrcomnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "TMRCom.Level1Item" ;
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
      oWriter.writeElement("MRComCod", GXutil.trim( GXutil.str( gxTv_SdtTMRCom_Level1Item_Mrcomcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MRComNom", gxTv_SdtTMRCom_Level1Item_Mrcomnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtTMRCom_Level1Item_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Modified", GXutil.trim( GXutil.str( gxTv_SdtTMRCom_Level1Item_Modified, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTMRCom_Level1Item_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MRComCod_Z", GXutil.trim( GXutil.str( gxTv_SdtTMRCom_Level1Item_Mrcomcod_Z, 8, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MRComNom_Z", gxTv_SdtTMRCom_Level1Item_Mrcomnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("MRComNom_N", GXutil.trim( GXutil.str( gxTv_SdtTMRCom_Level1Item_Mrcomnom_N, 1, 0)));
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
      AddObjectProperty("MRComCod", gxTv_SdtTMRCom_Level1Item_Mrcomcod, false, includeNonInitialized);
      AddObjectProperty("MRComNom", gxTv_SdtTMRCom_Level1Item_Mrcomnom, false, includeNonInitialized);
      AddObjectProperty("MRComNom_N", gxTv_SdtTMRCom_Level1Item_Mrcomnom_N, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTMRCom_Level1Item_Mode, false, includeNonInitialized);
         AddObjectProperty("Modified", gxTv_SdtTMRCom_Level1Item_Modified, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtTMRCom_Level1Item_Initialized, false, includeNonInitialized);
         AddObjectProperty("MRComCod_Z", gxTv_SdtTMRCom_Level1Item_Mrcomcod_Z, false, includeNonInitialized);
         AddObjectProperty("MRComNom_Z", gxTv_SdtTMRCom_Level1Item_Mrcomnom_Z, false, includeNonInitialized);
         AddObjectProperty("MRComNom_N", gxTv_SdtTMRCom_Level1Item_Mrcomnom_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.mantenimientomaquina.SdtTMRCom_Level1Item sdt )
   {
      if ( sdt.IsDirty("MRComCod") )
      {
         gxTv_SdtTMRCom_Level1Item_N = (byte)(0) ;
         gxTv_SdtTMRCom_Level1Item_Mrcomcod = sdt.getgxTv_SdtTMRCom_Level1Item_Mrcomcod() ;
      }
      if ( sdt.IsDirty("MRComNom") )
      {
         gxTv_SdtTMRCom_Level1Item_Mrcomnom_N = sdt.getgxTv_SdtTMRCom_Level1Item_Mrcomnom_N() ;
         gxTv_SdtTMRCom_Level1Item_N = (byte)(0) ;
         gxTv_SdtTMRCom_Level1Item_Mrcomnom = sdt.getgxTv_SdtTMRCom_Level1Item_Mrcomnom() ;
      }
   }

   public int getgxTv_SdtTMRCom_Level1Item_Mrcomcod( )
   {
      return gxTv_SdtTMRCom_Level1Item_Mrcomcod ;
   }

   public void setgxTv_SdtTMRCom_Level1Item_Mrcomcod( int value )
   {
      gxTv_SdtTMRCom_Level1Item_N = (byte)(0) ;
      gxTv_SdtTMRCom_Level1Item_Modified = (short)(1) ;
      SetDirty("Mrcomcod");
      gxTv_SdtTMRCom_Level1Item_Mrcomcod = value ;
   }

   public String getgxTv_SdtTMRCom_Level1Item_Mrcomnom( )
   {
      return gxTv_SdtTMRCom_Level1Item_Mrcomnom ;
   }

   public void setgxTv_SdtTMRCom_Level1Item_Mrcomnom( String value )
   {
      gxTv_SdtTMRCom_Level1Item_Mrcomnom_N = (byte)(0) ;
      gxTv_SdtTMRCom_Level1Item_N = (byte)(0) ;
      gxTv_SdtTMRCom_Level1Item_Modified = (short)(1) ;
      SetDirty("Mrcomnom");
      gxTv_SdtTMRCom_Level1Item_Mrcomnom = value ;
   }

   public void setgxTv_SdtTMRCom_Level1Item_Mrcomnom_SetNull( )
   {
      gxTv_SdtTMRCom_Level1Item_Mrcomnom_N = (byte)(1) ;
      gxTv_SdtTMRCom_Level1Item_Mrcomnom = "" ;
      SetDirty("Mrcomnom");
   }

   public boolean getgxTv_SdtTMRCom_Level1Item_Mrcomnom_IsNull( )
   {
      return (gxTv_SdtTMRCom_Level1Item_Mrcomnom_N==1) ;
   }

   public String getgxTv_SdtTMRCom_Level1Item_Mode( )
   {
      return gxTv_SdtTMRCom_Level1Item_Mode ;
   }

   public void setgxTv_SdtTMRCom_Level1Item_Mode( String value )
   {
      gxTv_SdtTMRCom_Level1Item_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtTMRCom_Level1Item_Mode = value ;
   }

   public void setgxTv_SdtTMRCom_Level1Item_Mode_SetNull( )
   {
      gxTv_SdtTMRCom_Level1Item_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtTMRCom_Level1Item_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTMRCom_Level1Item_Modified( )
   {
      return gxTv_SdtTMRCom_Level1Item_Modified ;
   }

   public void setgxTv_SdtTMRCom_Level1Item_Modified( short value )
   {
      gxTv_SdtTMRCom_Level1Item_N = (byte)(0) ;
      SetDirty("Modified");
      gxTv_SdtTMRCom_Level1Item_Modified = value ;
   }

   public void setgxTv_SdtTMRCom_Level1Item_Modified_SetNull( )
   {
      gxTv_SdtTMRCom_Level1Item_Modified = (short)(0) ;
      SetDirty("Modified");
   }

   public boolean getgxTv_SdtTMRCom_Level1Item_Modified_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTMRCom_Level1Item_Initialized( )
   {
      return gxTv_SdtTMRCom_Level1Item_Initialized ;
   }

   public void setgxTv_SdtTMRCom_Level1Item_Initialized( short value )
   {
      gxTv_SdtTMRCom_Level1Item_N = (byte)(0) ;
      gxTv_SdtTMRCom_Level1Item_Modified = (short)(1) ;
      SetDirty("Initialized");
      gxTv_SdtTMRCom_Level1Item_Initialized = value ;
   }

   public void setgxTv_SdtTMRCom_Level1Item_Initialized_SetNull( )
   {
      gxTv_SdtTMRCom_Level1Item_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtTMRCom_Level1Item_Initialized_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTMRCom_Level1Item_Mrcomcod_Z( )
   {
      return gxTv_SdtTMRCom_Level1Item_Mrcomcod_Z ;
   }

   public void setgxTv_SdtTMRCom_Level1Item_Mrcomcod_Z( int value )
   {
      gxTv_SdtTMRCom_Level1Item_N = (byte)(0) ;
      gxTv_SdtTMRCom_Level1Item_Modified = (short)(1) ;
      SetDirty("Mrcomcod_Z");
      gxTv_SdtTMRCom_Level1Item_Mrcomcod_Z = value ;
   }

   public void setgxTv_SdtTMRCom_Level1Item_Mrcomcod_Z_SetNull( )
   {
      gxTv_SdtTMRCom_Level1Item_Mrcomcod_Z = 0 ;
      SetDirty("Mrcomcod_Z");
   }

   public boolean getgxTv_SdtTMRCom_Level1Item_Mrcomcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTMRCom_Level1Item_Mrcomnom_Z( )
   {
      return gxTv_SdtTMRCom_Level1Item_Mrcomnom_Z ;
   }

   public void setgxTv_SdtTMRCom_Level1Item_Mrcomnom_Z( String value )
   {
      gxTv_SdtTMRCom_Level1Item_N = (byte)(0) ;
      gxTv_SdtTMRCom_Level1Item_Modified = (short)(1) ;
      SetDirty("Mrcomnom_Z");
      gxTv_SdtTMRCom_Level1Item_Mrcomnom_Z = value ;
   }

   public void setgxTv_SdtTMRCom_Level1Item_Mrcomnom_Z_SetNull( )
   {
      gxTv_SdtTMRCom_Level1Item_Mrcomnom_Z = "" ;
      SetDirty("Mrcomnom_Z");
   }

   public boolean getgxTv_SdtTMRCom_Level1Item_Mrcomnom_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTMRCom_Level1Item_Mrcomnom_N( )
   {
      return gxTv_SdtTMRCom_Level1Item_Mrcomnom_N ;
   }

   public void setgxTv_SdtTMRCom_Level1Item_Mrcomnom_N( byte value )
   {
      gxTv_SdtTMRCom_Level1Item_N = (byte)(0) ;
      gxTv_SdtTMRCom_Level1Item_Modified = (short)(1) ;
      SetDirty("Mrcomnom_N");
      gxTv_SdtTMRCom_Level1Item_Mrcomnom_N = value ;
   }

   public void setgxTv_SdtTMRCom_Level1Item_Mrcomnom_N_SetNull( )
   {
      gxTv_SdtTMRCom_Level1Item_Mrcomnom_N = (byte)(0) ;
      SetDirty("Mrcomnom_N");
   }

   public boolean getgxTv_SdtTMRCom_Level1Item_Mrcomnom_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtTMRCom_Level1Item_N = (byte)(1) ;
      gxTv_SdtTMRCom_Level1Item_Mrcomnom = "" ;
      gxTv_SdtTMRCom_Level1Item_Mode = "" ;
      gxTv_SdtTMRCom_Level1Item_Mrcomnom_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTMRCom_Level1Item_N ;
   }

   public app.mantenimientomaquina.SdtTMRCom_Level1Item Clone( )
   {
      return (app.mantenimientomaquina.SdtTMRCom_Level1Item)(clone()) ;
   }

   public void setStruct( app.mantenimientomaquina.StructSdtTMRCom_Level1Item struct )
   {
      setgxTv_SdtTMRCom_Level1Item_Mrcomcod(struct.getMrcomcod());
      setgxTv_SdtTMRCom_Level1Item_Mrcomnom(struct.getMrcomnom());
      setgxTv_SdtTMRCom_Level1Item_Mode(struct.getMode());
      setgxTv_SdtTMRCom_Level1Item_Modified(struct.getModified());
      setgxTv_SdtTMRCom_Level1Item_Initialized(struct.getInitialized());
      setgxTv_SdtTMRCom_Level1Item_Mrcomcod_Z(struct.getMrcomcod_Z());
      setgxTv_SdtTMRCom_Level1Item_Mrcomnom_Z(struct.getMrcomnom_Z());
      setgxTv_SdtTMRCom_Level1Item_Mrcomnom_N(struct.getMrcomnom_N());
   }

   @SuppressWarnings("unchecked")
   public app.mantenimientomaquina.StructSdtTMRCom_Level1Item getStruct( )
   {
      app.mantenimientomaquina.StructSdtTMRCom_Level1Item struct = new app.mantenimientomaquina.StructSdtTMRCom_Level1Item ();
      struct.setMrcomcod(getgxTv_SdtTMRCom_Level1Item_Mrcomcod());
      struct.setMrcomnom(getgxTv_SdtTMRCom_Level1Item_Mrcomnom());
      struct.setMode(getgxTv_SdtTMRCom_Level1Item_Mode());
      struct.setModified(getgxTv_SdtTMRCom_Level1Item_Modified());
      struct.setInitialized(getgxTv_SdtTMRCom_Level1Item_Initialized());
      struct.setMrcomcod_Z(getgxTv_SdtTMRCom_Level1Item_Mrcomcod_Z());
      struct.setMrcomnom_Z(getgxTv_SdtTMRCom_Level1Item_Mrcomnom_Z());
      struct.setMrcomnom_N(getgxTv_SdtTMRCom_Level1Item_Mrcomnom_N());
      return struct ;
   }

   private byte gxTv_SdtTMRCom_Level1Item_N ;
   private byte gxTv_SdtTMRCom_Level1Item_Mrcomnom_N ;
   private short gxTv_SdtTMRCom_Level1Item_Modified ;
   private short gxTv_SdtTMRCom_Level1Item_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtTMRCom_Level1Item_Mrcomcod ;
   private int gxTv_SdtTMRCom_Level1Item_Mrcomcod_Z ;
   private String gxTv_SdtTMRCom_Level1Item_Mrcomnom ;
   private String gxTv_SdtTMRCom_Level1Item_Mode ;
   private String gxTv_SdtTMRCom_Level1Item_Mrcomnom_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
}

