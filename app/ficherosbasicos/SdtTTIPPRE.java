package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTTIPPRE extends GxSilentTrnSdt
{
   public SdtTTIPPRE( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTTIPPRE.class));
   }

   public SdtTTIPPRE( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtTTIPPRE");
      initialize( remoteHandle) ;
   }

   public SdtTTIPPRE( int remoteHandle ,
                      StructSdtTTIPPRE struct )
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
                     short AV1962TipPreCod )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV396EmprCod,Short.valueOf(AV1962TipPreCod)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"EmprCod", String.class}, new Object[]{"TipPreCod", short.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "FicherosBasicos\\TTIPPRE");
      metadata.set("BT", "TXPTIPPRE");
      metadata.set("PK", "[ \"TipPreCod\" ]");
      metadata.set("PKAssigned", "[ \"TipPreCod\" ]");
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
               gxTv_SdtTTIPPRE_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtTTIPPRE_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipPreCod") )
            {
               gxTv_SdtTTIPPRE_Tipprecod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipPreDsc") )
            {
               gxTv_SdtTTIPPRE_Tippredsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipPreDscID") )
            {
               gxTv_SdtTTIPPRE_Tippredscid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTTIPPRE_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTTIPPRE_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod_Z") )
            {
               gxTv_SdtTTIPPRE_Emprcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_Z") )
            {
               gxTv_SdtTTIPPRE_Emprnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipPreCod_Z") )
            {
               gxTv_SdtTTIPPRE_Tipprecod_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipPreDsc_Z") )
            {
               gxTv_SdtTTIPPRE_Tippredsc_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipPreDscID_Z") )
            {
               gxTv_SdtTTIPPRE_Tippredscid_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_N") )
            {
               gxTv_SdtTTIPPRE_Emprnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "TTIPPRE" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtTTIPPRE_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtTTIPPRE_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipPreCod", GXutil.trim( GXutil.str( gxTv_SdtTTIPPRE_Tipprecod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipPreDsc", gxTv_SdtTTIPPRE_Tippredsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipPreDscID", gxTv_SdtTTIPPRE_Tippredscid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtTTIPPRE_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTTIPPRE_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprCod_Z", gxTv_SdtTTIPPRE_Emprcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_Z", gxTv_SdtTTIPPRE_Emprnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipPreCod_Z", GXutil.trim( GXutil.str( gxTv_SdtTTIPPRE_Tipprecod_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipPreDsc_Z", gxTv_SdtTTIPPRE_Tippredsc_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TipPreDscID_Z", gxTv_SdtTTIPPRE_Tippredscid_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_N", GXutil.trim( GXutil.str( gxTv_SdtTTIPPRE_Emprnom_N, 1, 0)));
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
      AddObjectProperty("EmprCod", gxTv_SdtTTIPPRE_Emprcod, false, includeNonInitialized);
      AddObjectProperty("EmprNom", gxTv_SdtTTIPPRE_Emprnom, false, includeNonInitialized);
      AddObjectProperty("EmprNom_N", gxTv_SdtTTIPPRE_Emprnom_N, false, includeNonInitialized);
      AddObjectProperty("TipPreCod", gxTv_SdtTTIPPRE_Tipprecod, false, includeNonInitialized);
      AddObjectProperty("TipPreDsc", gxTv_SdtTTIPPRE_Tippredsc, false, includeNonInitialized);
      AddObjectProperty("TipPreDscID", gxTv_SdtTTIPPRE_Tippredscid, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTTIPPRE_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtTTIPPRE_Initialized, false, includeNonInitialized);
         AddObjectProperty("EmprCod_Z", gxTv_SdtTTIPPRE_Emprcod_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_Z", gxTv_SdtTTIPPRE_Emprnom_Z, false, includeNonInitialized);
         AddObjectProperty("TipPreCod_Z", gxTv_SdtTTIPPRE_Tipprecod_Z, false, includeNonInitialized);
         AddObjectProperty("TipPreDsc_Z", gxTv_SdtTTIPPRE_Tippredsc_Z, false, includeNonInitialized);
         AddObjectProperty("TipPreDscID_Z", gxTv_SdtTTIPPRE_Tippredscid_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_N", gxTv_SdtTTIPPRE_Emprnom_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.ficherosbasicos.SdtTTIPPRE sdt )
   {
      if ( sdt.IsDirty("EmprCod") )
      {
         gxTv_SdtTTIPPRE_N = (byte)(0) ;
         gxTv_SdtTTIPPRE_Emprcod = sdt.getgxTv_SdtTTIPPRE_Emprcod() ;
      }
      if ( sdt.IsDirty("EmprNom") )
      {
         gxTv_SdtTTIPPRE_Emprnom_N = sdt.getgxTv_SdtTTIPPRE_Emprnom_N() ;
         gxTv_SdtTTIPPRE_N = (byte)(0) ;
         gxTv_SdtTTIPPRE_Emprnom = sdt.getgxTv_SdtTTIPPRE_Emprnom() ;
      }
      if ( sdt.IsDirty("TipPreCod") )
      {
         gxTv_SdtTTIPPRE_N = (byte)(0) ;
         gxTv_SdtTTIPPRE_Tipprecod = sdt.getgxTv_SdtTTIPPRE_Tipprecod() ;
      }
      if ( sdt.IsDirty("TipPreDsc") )
      {
         gxTv_SdtTTIPPRE_N = (byte)(0) ;
         gxTv_SdtTTIPPRE_Tippredsc = sdt.getgxTv_SdtTTIPPRE_Tippredsc() ;
      }
      if ( sdt.IsDirty("TipPreDscID") )
      {
         gxTv_SdtTTIPPRE_N = (byte)(0) ;
         gxTv_SdtTTIPPRE_Tippredscid = sdt.getgxTv_SdtTTIPPRE_Tippredscid() ;
      }
   }

   public String getgxTv_SdtTTIPPRE_Emprcod( )
   {
      return gxTv_SdtTTIPPRE_Emprcod ;
   }

   public void setgxTv_SdtTTIPPRE_Emprcod( String value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtTTIPPRE_Emprcod, value) != 0 )
      {
         gxTv_SdtTTIPPRE_Mode = "INS" ;
         this.setgxTv_SdtTTIPPRE_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTTIPPRE_Emprnom_Z_SetNull( );
         this.setgxTv_SdtTTIPPRE_Tipprecod_Z_SetNull( );
         this.setgxTv_SdtTTIPPRE_Tippredsc_Z_SetNull( );
         this.setgxTv_SdtTTIPPRE_Tippredscid_Z_SetNull( );
      }
      SetDirty("Emprcod");
      gxTv_SdtTTIPPRE_Emprcod = value ;
   }

   public String getgxTv_SdtTTIPPRE_Emprnom( )
   {
      return gxTv_SdtTTIPPRE_Emprnom ;
   }

   public void setgxTv_SdtTTIPPRE_Emprnom( String value )
   {
      gxTv_SdtTTIPPRE_Emprnom_N = (byte)(0) ;
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      SetDirty("Emprnom");
      gxTv_SdtTTIPPRE_Emprnom = value ;
   }

   public void setgxTv_SdtTTIPPRE_Emprnom_SetNull( )
   {
      gxTv_SdtTTIPPRE_Emprnom_N = (byte)(1) ;
      gxTv_SdtTTIPPRE_Emprnom = "" ;
      SetDirty("Emprnom");
   }

   public boolean getgxTv_SdtTTIPPRE_Emprnom_IsNull( )
   {
      return (gxTv_SdtTTIPPRE_Emprnom_N==1) ;
   }

   public short getgxTv_SdtTTIPPRE_Tipprecod( )
   {
      return gxTv_SdtTTIPPRE_Tipprecod ;
   }

   public void setgxTv_SdtTTIPPRE_Tipprecod( short value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      if ( gxTv_SdtTTIPPRE_Tipprecod != value )
      {
         gxTv_SdtTTIPPRE_Mode = "INS" ;
         this.setgxTv_SdtTTIPPRE_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTTIPPRE_Emprnom_Z_SetNull( );
         this.setgxTv_SdtTTIPPRE_Tipprecod_Z_SetNull( );
         this.setgxTv_SdtTTIPPRE_Tippredsc_Z_SetNull( );
         this.setgxTv_SdtTTIPPRE_Tippredscid_Z_SetNull( );
      }
      SetDirty("Tipprecod");
      gxTv_SdtTTIPPRE_Tipprecod = value ;
   }

   public String getgxTv_SdtTTIPPRE_Tippredsc( )
   {
      return gxTv_SdtTTIPPRE_Tippredsc ;
   }

   public void setgxTv_SdtTTIPPRE_Tippredsc( String value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      SetDirty("Tippredsc");
      gxTv_SdtTTIPPRE_Tippredsc = value ;
   }

   public String getgxTv_SdtTTIPPRE_Tippredscid( )
   {
      return gxTv_SdtTTIPPRE_Tippredscid ;
   }

   public void setgxTv_SdtTTIPPRE_Tippredscid( String value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      SetDirty("Tippredscid");
      gxTv_SdtTTIPPRE_Tippredscid = value ;
   }

   public void setgxTv_SdtTTIPPRE_Tippredscid_SetNull( )
   {
      gxTv_SdtTTIPPRE_Tippredscid = "" ;
      SetDirty("Tippredscid");
   }

   public boolean getgxTv_SdtTTIPPRE_Tippredscid_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTIPPRE_Mode( )
   {
      return gxTv_SdtTTIPPRE_Mode ;
   }

   public void setgxTv_SdtTTIPPRE_Mode( String value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtTTIPPRE_Mode = value ;
   }

   public void setgxTv_SdtTTIPPRE_Mode_SetNull( )
   {
      gxTv_SdtTTIPPRE_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtTTIPPRE_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTTIPPRE_Initialized( )
   {
      return gxTv_SdtTTIPPRE_Initialized ;
   }

   public void setgxTv_SdtTTIPPRE_Initialized( short value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtTTIPPRE_Initialized = value ;
   }

   public void setgxTv_SdtTTIPPRE_Initialized_SetNull( )
   {
      gxTv_SdtTTIPPRE_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtTTIPPRE_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTIPPRE_Emprcod_Z( )
   {
      return gxTv_SdtTTIPPRE_Emprcod_Z ;
   }

   public void setgxTv_SdtTTIPPRE_Emprcod_Z( String value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      SetDirty("Emprcod_Z");
      gxTv_SdtTTIPPRE_Emprcod_Z = value ;
   }

   public void setgxTv_SdtTTIPPRE_Emprcod_Z_SetNull( )
   {
      gxTv_SdtTTIPPRE_Emprcod_Z = "" ;
      SetDirty("Emprcod_Z");
   }

   public boolean getgxTv_SdtTTIPPRE_Emprcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTIPPRE_Emprnom_Z( )
   {
      return gxTv_SdtTTIPPRE_Emprnom_Z ;
   }

   public void setgxTv_SdtTTIPPRE_Emprnom_Z( String value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      SetDirty("Emprnom_Z");
      gxTv_SdtTTIPPRE_Emprnom_Z = value ;
   }

   public void setgxTv_SdtTTIPPRE_Emprnom_Z_SetNull( )
   {
      gxTv_SdtTTIPPRE_Emprnom_Z = "" ;
      SetDirty("Emprnom_Z");
   }

   public boolean getgxTv_SdtTTIPPRE_Emprnom_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTTIPPRE_Tipprecod_Z( )
   {
      return gxTv_SdtTTIPPRE_Tipprecod_Z ;
   }

   public void setgxTv_SdtTTIPPRE_Tipprecod_Z( short value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      SetDirty("Tipprecod_Z");
      gxTv_SdtTTIPPRE_Tipprecod_Z = value ;
   }

   public void setgxTv_SdtTTIPPRE_Tipprecod_Z_SetNull( )
   {
      gxTv_SdtTTIPPRE_Tipprecod_Z = (short)(0) ;
      SetDirty("Tipprecod_Z");
   }

   public boolean getgxTv_SdtTTIPPRE_Tipprecod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTIPPRE_Tippredsc_Z( )
   {
      return gxTv_SdtTTIPPRE_Tippredsc_Z ;
   }

   public void setgxTv_SdtTTIPPRE_Tippredsc_Z( String value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      SetDirty("Tippredsc_Z");
      gxTv_SdtTTIPPRE_Tippredsc_Z = value ;
   }

   public void setgxTv_SdtTTIPPRE_Tippredsc_Z_SetNull( )
   {
      gxTv_SdtTTIPPRE_Tippredsc_Z = "" ;
      SetDirty("Tippredsc_Z");
   }

   public boolean getgxTv_SdtTTIPPRE_Tippredsc_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTIPPRE_Tippredscid_Z( )
   {
      return gxTv_SdtTTIPPRE_Tippredscid_Z ;
   }

   public void setgxTv_SdtTTIPPRE_Tippredscid_Z( String value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      SetDirty("Tippredscid_Z");
      gxTv_SdtTTIPPRE_Tippredscid_Z = value ;
   }

   public void setgxTv_SdtTTIPPRE_Tippredscid_Z_SetNull( )
   {
      gxTv_SdtTTIPPRE_Tippredscid_Z = "" ;
      SetDirty("Tippredscid_Z");
   }

   public boolean getgxTv_SdtTTIPPRE_Tippredscid_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTIPPRE_Emprnom_N( )
   {
      return gxTv_SdtTTIPPRE_Emprnom_N ;
   }

   public void setgxTv_SdtTTIPPRE_Emprnom_N( byte value )
   {
      gxTv_SdtTTIPPRE_N = (byte)(0) ;
      SetDirty("Emprnom_N");
      gxTv_SdtTTIPPRE_Emprnom_N = value ;
   }

   public void setgxTv_SdtTTIPPRE_Emprnom_N_SetNull( )
   {
      gxTv_SdtTTIPPRE_Emprnom_N = (byte)(0) ;
      SetDirty("Emprnom_N");
   }

   public boolean getgxTv_SdtTTIPPRE_Emprnom_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.ficherosbasicos.ttippre_bc obj;
      obj = new app.ficherosbasicos.ttippre_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTTIPPRE_Emprcod = "" ;
      gxTv_SdtTTIPPRE_N = (byte)(1) ;
      gxTv_SdtTTIPPRE_Emprnom = "" ;
      gxTv_SdtTTIPPRE_Tippredsc = "" ;
      gxTv_SdtTTIPPRE_Tippredscid = "" ;
      gxTv_SdtTTIPPRE_Mode = "" ;
      gxTv_SdtTTIPPRE_Emprcod_Z = "" ;
      gxTv_SdtTTIPPRE_Emprnom_Z = "" ;
      gxTv_SdtTTIPPRE_Tippredsc_Z = "" ;
      gxTv_SdtTTIPPRE_Tippredscid_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTTIPPRE_N ;
   }

   public app.ficherosbasicos.SdtTTIPPRE Clone( )
   {
      app.ficherosbasicos.SdtTTIPPRE sdt;
      app.ficherosbasicos.ttippre_bc obj;
      sdt = (app.ficherosbasicos.SdtTTIPPRE)(clone()) ;
      obj = (app.ficherosbasicos.ttippre_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.ficherosbasicos.StructSdtTTIPPRE struct )
   {
      setgxTv_SdtTTIPPRE_Emprcod(struct.getEmprcod());
      setgxTv_SdtTTIPPRE_Emprnom(struct.getEmprnom());
      setgxTv_SdtTTIPPRE_Tipprecod(struct.getTipprecod());
      setgxTv_SdtTTIPPRE_Tippredsc(struct.getTippredsc());
      setgxTv_SdtTTIPPRE_Tippredscid(struct.getTippredscid());
      setgxTv_SdtTTIPPRE_Mode(struct.getMode());
      setgxTv_SdtTTIPPRE_Initialized(struct.getInitialized());
      setgxTv_SdtTTIPPRE_Emprcod_Z(struct.getEmprcod_Z());
      setgxTv_SdtTTIPPRE_Emprnom_Z(struct.getEmprnom_Z());
      setgxTv_SdtTTIPPRE_Tipprecod_Z(struct.getTipprecod_Z());
      setgxTv_SdtTTIPPRE_Tippredsc_Z(struct.getTippredsc_Z());
      setgxTv_SdtTTIPPRE_Tippredscid_Z(struct.getTippredscid_Z());
      setgxTv_SdtTTIPPRE_Emprnom_N(struct.getEmprnom_N());
   }

   @SuppressWarnings("unchecked")
   public app.ficherosbasicos.StructSdtTTIPPRE getStruct( )
   {
      app.ficherosbasicos.StructSdtTTIPPRE struct = new app.ficherosbasicos.StructSdtTTIPPRE ();
      struct.setEmprcod(getgxTv_SdtTTIPPRE_Emprcod());
      struct.setEmprnom(getgxTv_SdtTTIPPRE_Emprnom());
      struct.setTipprecod(getgxTv_SdtTTIPPRE_Tipprecod());
      struct.setTippredsc(getgxTv_SdtTTIPPRE_Tippredsc());
      struct.setTippredscid(getgxTv_SdtTTIPPRE_Tippredscid());
      struct.setMode(getgxTv_SdtTTIPPRE_Mode());
      struct.setInitialized(getgxTv_SdtTTIPPRE_Initialized());
      struct.setEmprcod_Z(getgxTv_SdtTTIPPRE_Emprcod_Z());
      struct.setEmprnom_Z(getgxTv_SdtTTIPPRE_Emprnom_Z());
      struct.setTipprecod_Z(getgxTv_SdtTTIPPRE_Tipprecod_Z());
      struct.setTippredsc_Z(getgxTv_SdtTTIPPRE_Tippredsc_Z());
      struct.setTippredscid_Z(getgxTv_SdtTTIPPRE_Tippredscid_Z());
      struct.setEmprnom_N(getgxTv_SdtTTIPPRE_Emprnom_N());
      return struct ;
   }

   private byte gxTv_SdtTTIPPRE_N ;
   private byte gxTv_SdtTTIPPRE_Emprnom_N ;
   private short gxTv_SdtTTIPPRE_Tipprecod ;
   private short gxTv_SdtTTIPPRE_Initialized ;
   private short gxTv_SdtTTIPPRE_Tipprecod_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_SdtTTIPPRE_Emprcod ;
   private String gxTv_SdtTTIPPRE_Emprnom ;
   private String gxTv_SdtTTIPPRE_Tippredsc ;
   private String gxTv_SdtTTIPPRE_Mode ;
   private String gxTv_SdtTTIPPRE_Emprcod_Z ;
   private String gxTv_SdtTTIPPRE_Emprnom_Z ;
   private String gxTv_SdtTTIPPRE_Tippredsc_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtTTIPPRE_Tippredscid ;
   private String gxTv_SdtTTIPPRE_Tippredscid_Z ;
}

