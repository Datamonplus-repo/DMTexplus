package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTNORMAS extends GxSilentTrnSdt
{
   public SdtTNORMAS( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTNORMAS.class));
   }

   public SdtTNORMAS( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtTNORMAS");
      initialize( remoteHandle) ;
   }

   public SdtTNORMAS( int remoteHandle ,
                      StructSdtTNORMAS struct )
   {
      this(remoteHandle);
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

   public void Load( String AV396EmprCod ,
                     String AV13217NormaID )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV396EmprCod,AV13217NormaID});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"EmprCod", String.class}, new Object[]{"NormaID", String.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "TNORMAS");
      metadata.set("BT", "TXPNORMAS");
      metadata.set("PK", "[ \"NormaID\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtTNORMAS_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtTNORMAS_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NormaID") )
            {
               gxTv_SdtTNORMAS_Normaid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NormaDsc") )
            {
               gxTv_SdtTNORMAS_Normadsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NormaDscID") )
            {
               gxTv_SdtTNORMAS_Normadscid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTNORMAS_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTNORMAS_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod_Z") )
            {
               gxTv_SdtTNORMAS_Emprcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_Z") )
            {
               gxTv_SdtTNORMAS_Emprnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NormaID_Z") )
            {
               gxTv_SdtTNORMAS_Normaid_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NormaDsc_Z") )
            {
               gxTv_SdtTNORMAS_Normadsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NormaDscID_Z") )
            {
               gxTv_SdtTNORMAS_Normadscid_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_N") )
            {
               gxTv_SdtTNORMAS_Emprnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NormaDsc_N") )
            {
               gxTv_SdtTNORMAS_Normadsc_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "TNORMAS" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "TexplusNET" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtTNORMAS_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtTNORMAS_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("NormaID", gxTv_SdtTNORMAS_Normaid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("NormaDsc", gxTv_SdtTNORMAS_Normadsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("NormaDscID", gxTv_SdtTNORMAS_Normadscid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtTNORMAS_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTNORMAS_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprCod_Z", gxTv_SdtTNORMAS_Emprcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_Z", gxTv_SdtTNORMAS_Emprnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("NormaID_Z", gxTv_SdtTNORMAS_Normaid_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("NormaDsc_Z", gxTv_SdtTNORMAS_Normadsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("NormaDscID_Z", gxTv_SdtTNORMAS_Normadscid_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_N", GXutil.trim( GXutil.str( gxTv_SdtTNORMAS_Emprnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("NormaDsc_N", GXutil.trim( GXutil.str( gxTv_SdtTNORMAS_Normadsc_N, 1, 0)));
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
      AddObjectProperty("EmprCod", gxTv_SdtTNORMAS_Emprcod, false, includeNonInitialized);
      AddObjectProperty("EmprNom", gxTv_SdtTNORMAS_Emprnom, false, includeNonInitialized);
      AddObjectProperty("EmprNom_N", gxTv_SdtTNORMAS_Emprnom_N, false, includeNonInitialized);
      AddObjectProperty("NormaID", gxTv_SdtTNORMAS_Normaid, false, includeNonInitialized);
      AddObjectProperty("NormaDsc", gxTv_SdtTNORMAS_Normadsc, false, includeNonInitialized);
      AddObjectProperty("NormaDsc_N", gxTv_SdtTNORMAS_Normadsc_N, false, includeNonInitialized);
      AddObjectProperty("NormaDscID", gxTv_SdtTNORMAS_Normadscid, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTNORMAS_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtTNORMAS_Initialized, false, includeNonInitialized);
         AddObjectProperty("EmprCod_Z", gxTv_SdtTNORMAS_Emprcod_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_Z", gxTv_SdtTNORMAS_Emprnom_Z, false, includeNonInitialized);
         AddObjectProperty("NormaID_Z", gxTv_SdtTNORMAS_Normaid_Z, false, includeNonInitialized);
         AddObjectProperty("NormaDsc_Z", gxTv_SdtTNORMAS_Normadsc_Z, false, includeNonInitialized);
         AddObjectProperty("NormaDscID_Z", gxTv_SdtTNORMAS_Normadscid_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_N", gxTv_SdtTNORMAS_Emprnom_N, false, includeNonInitialized);
         AddObjectProperty("NormaDsc_N", gxTv_SdtTNORMAS_Normadsc_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.SdtTNORMAS sdt )
   {
      if ( sdt.IsDirty("EmprCod") )
      {
         gxTv_SdtTNORMAS_N = (byte)(0) ;
         gxTv_SdtTNORMAS_Emprcod = sdt.getgxTv_SdtTNORMAS_Emprcod() ;
      }
      if ( sdt.IsDirty("EmprNom") )
      {
         gxTv_SdtTNORMAS_Emprnom_N = sdt.getgxTv_SdtTNORMAS_Emprnom_N() ;
         gxTv_SdtTNORMAS_N = (byte)(0) ;
         gxTv_SdtTNORMAS_Emprnom = sdt.getgxTv_SdtTNORMAS_Emprnom() ;
      }
      if ( sdt.IsDirty("NormaID") )
      {
         gxTv_SdtTNORMAS_N = (byte)(0) ;
         gxTv_SdtTNORMAS_Normaid = sdt.getgxTv_SdtTNORMAS_Normaid() ;
      }
      if ( sdt.IsDirty("NormaDsc") )
      {
         gxTv_SdtTNORMAS_Normadsc_N = sdt.getgxTv_SdtTNORMAS_Normadsc_N() ;
         gxTv_SdtTNORMAS_N = (byte)(0) ;
         gxTv_SdtTNORMAS_Normadsc = sdt.getgxTv_SdtTNORMAS_Normadsc() ;
      }
      if ( sdt.IsDirty("NormaDscID") )
      {
         gxTv_SdtTNORMAS_N = (byte)(0) ;
         gxTv_SdtTNORMAS_Normadscid = sdt.getgxTv_SdtTNORMAS_Normadscid() ;
      }
   }

   public String getgxTv_SdtTNORMAS_Emprcod( )
   {
      return gxTv_SdtTNORMAS_Emprcod ;
   }

   public void setgxTv_SdtTNORMAS_Emprcod( String value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtTNORMAS_Emprcod, value) != 0 )
      {
         gxTv_SdtTNORMAS_Mode = "INS" ;
         this.setgxTv_SdtTNORMAS_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTNORMAS_Emprnom_Z_SetNull( );
         this.setgxTv_SdtTNORMAS_Normaid_Z_SetNull( );
         this.setgxTv_SdtTNORMAS_Normadsc_Z_SetNull( );
         this.setgxTv_SdtTNORMAS_Normadscid_Z_SetNull( );
      }
      SetDirty("Emprcod");
      gxTv_SdtTNORMAS_Emprcod = value ;
   }

   public String getgxTv_SdtTNORMAS_Emprnom( )
   {
      return gxTv_SdtTNORMAS_Emprnom ;
   }

   public void setgxTv_SdtTNORMAS_Emprnom( String value )
   {
      gxTv_SdtTNORMAS_Emprnom_N = (byte)(0) ;
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      SetDirty("Emprnom");
      gxTv_SdtTNORMAS_Emprnom = value ;
   }

   public void setgxTv_SdtTNORMAS_Emprnom_SetNull( )
   {
      gxTv_SdtTNORMAS_Emprnom_N = (byte)(1) ;
      gxTv_SdtTNORMAS_Emprnom = "" ;
      SetDirty("Emprnom");
   }

   public boolean getgxTv_SdtTNORMAS_Emprnom_IsNull( )
   {
      return (gxTv_SdtTNORMAS_Emprnom_N==1) ;
   }

   public String getgxTv_SdtTNORMAS_Normaid( )
   {
      return gxTv_SdtTNORMAS_Normaid ;
   }

   public void setgxTv_SdtTNORMAS_Normaid( String value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtTNORMAS_Normaid, value) != 0 )
      {
         gxTv_SdtTNORMAS_Mode = "INS" ;
         this.setgxTv_SdtTNORMAS_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTNORMAS_Emprnom_Z_SetNull( );
         this.setgxTv_SdtTNORMAS_Normaid_Z_SetNull( );
         this.setgxTv_SdtTNORMAS_Normadsc_Z_SetNull( );
         this.setgxTv_SdtTNORMAS_Normadscid_Z_SetNull( );
      }
      SetDirty("Normaid");
      gxTv_SdtTNORMAS_Normaid = value ;
   }

   public String getgxTv_SdtTNORMAS_Normadsc( )
   {
      return gxTv_SdtTNORMAS_Normadsc ;
   }

   public void setgxTv_SdtTNORMAS_Normadsc( String value )
   {
      gxTv_SdtTNORMAS_Normadsc_N = (byte)(0) ;
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      SetDirty("Normadsc");
      gxTv_SdtTNORMAS_Normadsc = value ;
   }

   public void setgxTv_SdtTNORMAS_Normadsc_SetNull( )
   {
      gxTv_SdtTNORMAS_Normadsc_N = (byte)(1) ;
      gxTv_SdtTNORMAS_Normadsc = "" ;
      SetDirty("Normadsc");
   }

   public boolean getgxTv_SdtTNORMAS_Normadsc_IsNull( )
   {
      return (gxTv_SdtTNORMAS_Normadsc_N==1) ;
   }

   public String getgxTv_SdtTNORMAS_Normadscid( )
   {
      return gxTv_SdtTNORMAS_Normadscid ;
   }

   public void setgxTv_SdtTNORMAS_Normadscid( String value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      SetDirty("Normadscid");
      gxTv_SdtTNORMAS_Normadscid = value ;
   }

   public void setgxTv_SdtTNORMAS_Normadscid_SetNull( )
   {
      gxTv_SdtTNORMAS_Normadscid = "" ;
      SetDirty("Normadscid");
   }

   public boolean getgxTv_SdtTNORMAS_Normadscid_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTNORMAS_Mode( )
   {
      return gxTv_SdtTNORMAS_Mode ;
   }

   public void setgxTv_SdtTNORMAS_Mode( String value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtTNORMAS_Mode = value ;
   }

   public void setgxTv_SdtTNORMAS_Mode_SetNull( )
   {
      gxTv_SdtTNORMAS_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtTNORMAS_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTNORMAS_Initialized( )
   {
      return gxTv_SdtTNORMAS_Initialized ;
   }

   public void setgxTv_SdtTNORMAS_Initialized( short value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtTNORMAS_Initialized = value ;
   }

   public void setgxTv_SdtTNORMAS_Initialized_SetNull( )
   {
      gxTv_SdtTNORMAS_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtTNORMAS_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTNORMAS_Emprcod_Z( )
   {
      return gxTv_SdtTNORMAS_Emprcod_Z ;
   }

   public void setgxTv_SdtTNORMAS_Emprcod_Z( String value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      SetDirty("Emprcod_Z");
      gxTv_SdtTNORMAS_Emprcod_Z = value ;
   }

   public void setgxTv_SdtTNORMAS_Emprcod_Z_SetNull( )
   {
      gxTv_SdtTNORMAS_Emprcod_Z = "" ;
      SetDirty("Emprcod_Z");
   }

   public boolean getgxTv_SdtTNORMAS_Emprcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTNORMAS_Emprnom_Z( )
   {
      return gxTv_SdtTNORMAS_Emprnom_Z ;
   }

   public void setgxTv_SdtTNORMAS_Emprnom_Z( String value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      SetDirty("Emprnom_Z");
      gxTv_SdtTNORMAS_Emprnom_Z = value ;
   }

   public void setgxTv_SdtTNORMAS_Emprnom_Z_SetNull( )
   {
      gxTv_SdtTNORMAS_Emprnom_Z = "" ;
      SetDirty("Emprnom_Z");
   }

   public boolean getgxTv_SdtTNORMAS_Emprnom_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTNORMAS_Normaid_Z( )
   {
      return gxTv_SdtTNORMAS_Normaid_Z ;
   }

   public void setgxTv_SdtTNORMAS_Normaid_Z( String value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      SetDirty("Normaid_Z");
      gxTv_SdtTNORMAS_Normaid_Z = value ;
   }

   public void setgxTv_SdtTNORMAS_Normaid_Z_SetNull( )
   {
      gxTv_SdtTNORMAS_Normaid_Z = "" ;
      SetDirty("Normaid_Z");
   }

   public boolean getgxTv_SdtTNORMAS_Normaid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTNORMAS_Normadsc_Z( )
   {
      return gxTv_SdtTNORMAS_Normadsc_Z ;
   }

   public void setgxTv_SdtTNORMAS_Normadsc_Z( String value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      SetDirty("Normadsc_Z");
      gxTv_SdtTNORMAS_Normadsc_Z = value ;
   }

   public void setgxTv_SdtTNORMAS_Normadsc_Z_SetNull( )
   {
      gxTv_SdtTNORMAS_Normadsc_Z = "" ;
      SetDirty("Normadsc_Z");
   }

   public boolean getgxTv_SdtTNORMAS_Normadsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTNORMAS_Normadscid_Z( )
   {
      return gxTv_SdtTNORMAS_Normadscid_Z ;
   }

   public void setgxTv_SdtTNORMAS_Normadscid_Z( String value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      SetDirty("Normadscid_Z");
      gxTv_SdtTNORMAS_Normadscid_Z = value ;
   }

   public void setgxTv_SdtTNORMAS_Normadscid_Z_SetNull( )
   {
      gxTv_SdtTNORMAS_Normadscid_Z = "" ;
      SetDirty("Normadscid_Z");
   }

   public boolean getgxTv_SdtTNORMAS_Normadscid_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTNORMAS_Emprnom_N( )
   {
      return gxTv_SdtTNORMAS_Emprnom_N ;
   }

   public void setgxTv_SdtTNORMAS_Emprnom_N( byte value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      SetDirty("Emprnom_N");
      gxTv_SdtTNORMAS_Emprnom_N = value ;
   }

   public void setgxTv_SdtTNORMAS_Emprnom_N_SetNull( )
   {
      gxTv_SdtTNORMAS_Emprnom_N = (byte)(0) ;
      SetDirty("Emprnom_N");
   }

   public boolean getgxTv_SdtTNORMAS_Emprnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTNORMAS_Normadsc_N( )
   {
      return gxTv_SdtTNORMAS_Normadsc_N ;
   }

   public void setgxTv_SdtTNORMAS_Normadsc_N( byte value )
   {
      gxTv_SdtTNORMAS_N = (byte)(0) ;
      SetDirty("Normadsc_N");
      gxTv_SdtTNORMAS_Normadsc_N = value ;
   }

   public void setgxTv_SdtTNORMAS_Normadsc_N_SetNull( )
   {
      gxTv_SdtTNORMAS_Normadsc_N = (byte)(0) ;
      SetDirty("Normadsc_N");
   }

   public boolean getgxTv_SdtTNORMAS_Normadsc_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.tnormas_bc obj;
      obj = new app.tnormas_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTNORMAS_Emprcod = "" ;
      gxTv_SdtTNORMAS_N = (byte)(1) ;
      gxTv_SdtTNORMAS_Emprnom = "" ;
      gxTv_SdtTNORMAS_Normaid = "" ;
      gxTv_SdtTNORMAS_Normadsc = "" ;
      gxTv_SdtTNORMAS_Normadscid = "" ;
      gxTv_SdtTNORMAS_Mode = "" ;
      gxTv_SdtTNORMAS_Emprcod_Z = "" ;
      gxTv_SdtTNORMAS_Emprnom_Z = "" ;
      gxTv_SdtTNORMAS_Normaid_Z = "" ;
      gxTv_SdtTNORMAS_Normadsc_Z = "" ;
      gxTv_SdtTNORMAS_Normadscid_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTNORMAS_N ;
   }

   public app.SdtTNORMAS Clone( )
   {
      app.SdtTNORMAS sdt;
      app.tnormas_bc obj;
      sdt = (app.SdtTNORMAS)(clone()) ;
      obj = (app.tnormas_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.StructSdtTNORMAS struct )
   {
      setgxTv_SdtTNORMAS_Emprcod(struct.getEmprcod());
      setgxTv_SdtTNORMAS_Emprnom(struct.getEmprnom());
      setgxTv_SdtTNORMAS_Normaid(struct.getNormaid());
      setgxTv_SdtTNORMAS_Normadsc(struct.getNormadsc());
      setgxTv_SdtTNORMAS_Normadscid(struct.getNormadscid());
      setgxTv_SdtTNORMAS_Mode(struct.getMode());
      setgxTv_SdtTNORMAS_Initialized(struct.getInitialized());
      setgxTv_SdtTNORMAS_Emprcod_Z(struct.getEmprcod_Z());
      setgxTv_SdtTNORMAS_Emprnom_Z(struct.getEmprnom_Z());
      setgxTv_SdtTNORMAS_Normaid_Z(struct.getNormaid_Z());
      setgxTv_SdtTNORMAS_Normadsc_Z(struct.getNormadsc_Z());
      setgxTv_SdtTNORMAS_Normadscid_Z(struct.getNormadscid_Z());
      setgxTv_SdtTNORMAS_Emprnom_N(struct.getEmprnom_N());
      setgxTv_SdtTNORMAS_Normadsc_N(struct.getNormadsc_N());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtTNORMAS getStruct( )
   {
      app.StructSdtTNORMAS struct = new app.StructSdtTNORMAS ();
      struct.setEmprcod(getgxTv_SdtTNORMAS_Emprcod());
      struct.setEmprnom(getgxTv_SdtTNORMAS_Emprnom());
      struct.setNormaid(getgxTv_SdtTNORMAS_Normaid());
      struct.setNormadsc(getgxTv_SdtTNORMAS_Normadsc());
      struct.setNormadscid(getgxTv_SdtTNORMAS_Normadscid());
      struct.setMode(getgxTv_SdtTNORMAS_Mode());
      struct.setInitialized(getgxTv_SdtTNORMAS_Initialized());
      struct.setEmprcod_Z(getgxTv_SdtTNORMAS_Emprcod_Z());
      struct.setEmprnom_Z(getgxTv_SdtTNORMAS_Emprnom_Z());
      struct.setNormaid_Z(getgxTv_SdtTNORMAS_Normaid_Z());
      struct.setNormadsc_Z(getgxTv_SdtTNORMAS_Normadsc_Z());
      struct.setNormadscid_Z(getgxTv_SdtTNORMAS_Normadscid_Z());
      struct.setEmprnom_N(getgxTv_SdtTNORMAS_Emprnom_N());
      struct.setNormadsc_N(getgxTv_SdtTNORMAS_Normadsc_N());
      return struct ;
   }

   private byte gxTv_SdtTNORMAS_N ;
   private byte gxTv_SdtTNORMAS_Emprnom_N ;
   private byte gxTv_SdtTNORMAS_Normadsc_N ;
   private short gxTv_SdtTNORMAS_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_SdtTNORMAS_Emprcod ;
   private String gxTv_SdtTNORMAS_Emprnom ;
   private String gxTv_SdtTNORMAS_Normaid ;
   private String gxTv_SdtTNORMAS_Normadsc ;
   private String gxTv_SdtTNORMAS_Mode ;
   private String gxTv_SdtTNORMAS_Emprcod_Z ;
   private String gxTv_SdtTNORMAS_Emprnom_Z ;
   private String gxTv_SdtTNORMAS_Normaid_Z ;
   private String gxTv_SdtTNORMAS_Normadsc_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtTNORMAS_Normadscid ;
   private String gxTv_SdtTNORMAS_Normadscid_Z ;
}

