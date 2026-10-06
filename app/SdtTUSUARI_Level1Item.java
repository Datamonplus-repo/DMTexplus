package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTUSUARI_Level1Item extends GxSilentTrnSdt
{
   public SdtTUSUARI_Level1Item( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTUSUARI_Level1Item.class));
   }

   public SdtTUSUARI_Level1Item( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtTUSUARI_Level1Item");
      initialize( remoteHandle) ;
   }

   public SdtTUSUARI_Level1Item( int remoteHandle ,
                                 StructSdtTUSUARI_Level1Item struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public SdtTUSUARI_Level1Item( )
   {
      super( new ModelContext(SdtTUSUARI_Level1Item.class), "SdtTUSUARI_Level1Item");
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
      return (Object[][])(new Object[][]{new Object[]{"GrpId", String.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "Level1Item");
      metadata.set("BT", "TXPUSUGRP");
      metadata.set("PK", "[ \"GrpId\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"GrpId\" ],\"FKMap\":[  ] },{ \"FK\":[ \"UsurCod\" ],\"FKMap\":[  ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "GrpId") )
            {
               gxTv_SdtTUSUARI_Level1Item_Grpid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GrpTxt") )
            {
               gxTv_SdtTUSUARI_Level1Item_Grptxt = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GrpPri") )
            {
               gxTv_SdtTUSUARI_Level1Item_Grppri = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTUSUARI_Level1Item_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Modified") )
            {
               gxTv_SdtTUSUARI_Level1Item_Modified = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTUSUARI_Level1Item_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GrpId_Z") )
            {
               gxTv_SdtTUSUARI_Level1Item_Grpid_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GrpTxt_Z") )
            {
               gxTv_SdtTUSUARI_Level1Item_Grptxt_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GrpPri_Z") )
            {
               gxTv_SdtTUSUARI_Level1Item_Grppri_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GrpTxt_N") )
            {
               gxTv_SdtTUSUARI_Level1Item_Grptxt_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "TUSUARI.Level1Item" ;
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
      oWriter.writeElement("GrpId", gxTv_SdtTUSUARI_Level1Item_Grpid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GrpTxt", gxTv_SdtTUSUARI_Level1Item_Grptxt);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("GrpPri", GXutil.trim( GXutil.str( gxTv_SdtTUSUARI_Level1Item_Grppri, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtTUSUARI_Level1Item_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Modified", GXutil.trim( GXutil.str( gxTv_SdtTUSUARI_Level1Item_Modified, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTUSUARI_Level1Item_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("GrpId_Z", gxTv_SdtTUSUARI_Level1Item_Grpid_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("GrpTxt_Z", gxTv_SdtTUSUARI_Level1Item_Grptxt_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("GrpPri_Z", GXutil.trim( GXutil.str( gxTv_SdtTUSUARI_Level1Item_Grppri_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("GrpTxt_N", GXutil.trim( GXutil.str( gxTv_SdtTUSUARI_Level1Item_Grptxt_N, 1, 0)));
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
      AddObjectProperty("GrpId", gxTv_SdtTUSUARI_Level1Item_Grpid, false, includeNonInitialized);
      AddObjectProperty("GrpTxt", gxTv_SdtTUSUARI_Level1Item_Grptxt, false, includeNonInitialized);
      AddObjectProperty("GrpTxt_N", gxTv_SdtTUSUARI_Level1Item_Grptxt_N, false, includeNonInitialized);
      AddObjectProperty("GrpPri", gxTv_SdtTUSUARI_Level1Item_Grppri, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTUSUARI_Level1Item_Mode, false, includeNonInitialized);
         AddObjectProperty("Modified", gxTv_SdtTUSUARI_Level1Item_Modified, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtTUSUARI_Level1Item_Initialized, false, includeNonInitialized);
         AddObjectProperty("GrpId_Z", gxTv_SdtTUSUARI_Level1Item_Grpid_Z, false, includeNonInitialized);
         AddObjectProperty("GrpTxt_Z", gxTv_SdtTUSUARI_Level1Item_Grptxt_Z, false, includeNonInitialized);
         AddObjectProperty("GrpPri_Z", gxTv_SdtTUSUARI_Level1Item_Grppri_Z, false, includeNonInitialized);
         AddObjectProperty("GrpTxt_N", gxTv_SdtTUSUARI_Level1Item_Grptxt_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.SdtTUSUARI_Level1Item sdt )
   {
      if ( sdt.IsDirty("GrpId") )
      {
         gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
         gxTv_SdtTUSUARI_Level1Item_Grpid = sdt.getgxTv_SdtTUSUARI_Level1Item_Grpid() ;
      }
      if ( sdt.IsDirty("GrpTxt") )
      {
         gxTv_SdtTUSUARI_Level1Item_Grptxt_N = sdt.getgxTv_SdtTUSUARI_Level1Item_Grptxt_N() ;
         gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
         gxTv_SdtTUSUARI_Level1Item_Grptxt = sdt.getgxTv_SdtTUSUARI_Level1Item_Grptxt() ;
      }
      if ( sdt.IsDirty("GrpPri") )
      {
         gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
         gxTv_SdtTUSUARI_Level1Item_Grppri = sdt.getgxTv_SdtTUSUARI_Level1Item_Grppri() ;
      }
   }

   public String getgxTv_SdtTUSUARI_Level1Item_Grpid( )
   {
      return gxTv_SdtTUSUARI_Level1Item_Grpid ;
   }

   public void setgxTv_SdtTUSUARI_Level1Item_Grpid( String value )
   {
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1Item_Modified = (short)(1) ;
      SetDirty("Grpid");
      gxTv_SdtTUSUARI_Level1Item_Grpid = value ;
   }

   public String getgxTv_SdtTUSUARI_Level1Item_Grptxt( )
   {
      return gxTv_SdtTUSUARI_Level1Item_Grptxt ;
   }

   public void setgxTv_SdtTUSUARI_Level1Item_Grptxt( String value )
   {
      gxTv_SdtTUSUARI_Level1Item_Grptxt_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1Item_Modified = (short)(1) ;
      SetDirty("Grptxt");
      gxTv_SdtTUSUARI_Level1Item_Grptxt = value ;
   }

   public void setgxTv_SdtTUSUARI_Level1Item_Grptxt_SetNull( )
   {
      gxTv_SdtTUSUARI_Level1Item_Grptxt_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Level1Item_Grptxt = "" ;
      SetDirty("Grptxt");
   }

   public boolean getgxTv_SdtTUSUARI_Level1Item_Grptxt_IsNull( )
   {
      return (gxTv_SdtTUSUARI_Level1Item_Grptxt_N==1) ;
   }

   public byte getgxTv_SdtTUSUARI_Level1Item_Grppri( )
   {
      return gxTv_SdtTUSUARI_Level1Item_Grppri ;
   }

   public void setgxTv_SdtTUSUARI_Level1Item_Grppri( byte value )
   {
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1Item_Modified = (short)(1) ;
      SetDirty("Grppri");
      gxTv_SdtTUSUARI_Level1Item_Grppri = value ;
   }

   public String getgxTv_SdtTUSUARI_Level1Item_Mode( )
   {
      return gxTv_SdtTUSUARI_Level1Item_Mode ;
   }

   public void setgxTv_SdtTUSUARI_Level1Item_Mode( String value )
   {
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtTUSUARI_Level1Item_Mode = value ;
   }

   public void setgxTv_SdtTUSUARI_Level1Item_Mode_SetNull( )
   {
      gxTv_SdtTUSUARI_Level1Item_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtTUSUARI_Level1Item_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTUSUARI_Level1Item_Modified( )
   {
      return gxTv_SdtTUSUARI_Level1Item_Modified ;
   }

   public void setgxTv_SdtTUSUARI_Level1Item_Modified( short value )
   {
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
      SetDirty("Modified");
      gxTv_SdtTUSUARI_Level1Item_Modified = value ;
   }

   public void setgxTv_SdtTUSUARI_Level1Item_Modified_SetNull( )
   {
      gxTv_SdtTUSUARI_Level1Item_Modified = (short)(0) ;
      SetDirty("Modified");
   }

   public boolean getgxTv_SdtTUSUARI_Level1Item_Modified_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTUSUARI_Level1Item_Initialized( )
   {
      return gxTv_SdtTUSUARI_Level1Item_Initialized ;
   }

   public void setgxTv_SdtTUSUARI_Level1Item_Initialized( short value )
   {
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1Item_Modified = (short)(1) ;
      SetDirty("Initialized");
      gxTv_SdtTUSUARI_Level1Item_Initialized = value ;
   }

   public void setgxTv_SdtTUSUARI_Level1Item_Initialized_SetNull( )
   {
      gxTv_SdtTUSUARI_Level1Item_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtTUSUARI_Level1Item_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTUSUARI_Level1Item_Grpid_Z( )
   {
      return gxTv_SdtTUSUARI_Level1Item_Grpid_Z ;
   }

   public void setgxTv_SdtTUSUARI_Level1Item_Grpid_Z( String value )
   {
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1Item_Modified = (short)(1) ;
      SetDirty("Grpid_Z");
      gxTv_SdtTUSUARI_Level1Item_Grpid_Z = value ;
   }

   public void setgxTv_SdtTUSUARI_Level1Item_Grpid_Z_SetNull( )
   {
      gxTv_SdtTUSUARI_Level1Item_Grpid_Z = "" ;
      SetDirty("Grpid_Z");
   }

   public boolean getgxTv_SdtTUSUARI_Level1Item_Grpid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTUSUARI_Level1Item_Grptxt_Z( )
   {
      return gxTv_SdtTUSUARI_Level1Item_Grptxt_Z ;
   }

   public void setgxTv_SdtTUSUARI_Level1Item_Grptxt_Z( String value )
   {
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1Item_Modified = (short)(1) ;
      SetDirty("Grptxt_Z");
      gxTv_SdtTUSUARI_Level1Item_Grptxt_Z = value ;
   }

   public void setgxTv_SdtTUSUARI_Level1Item_Grptxt_Z_SetNull( )
   {
      gxTv_SdtTUSUARI_Level1Item_Grptxt_Z = "" ;
      SetDirty("Grptxt_Z");
   }

   public boolean getgxTv_SdtTUSUARI_Level1Item_Grptxt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTUSUARI_Level1Item_Grppri_Z( )
   {
      return gxTv_SdtTUSUARI_Level1Item_Grppri_Z ;
   }

   public void setgxTv_SdtTUSUARI_Level1Item_Grppri_Z( byte value )
   {
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1Item_Modified = (short)(1) ;
      SetDirty("Grppri_Z");
      gxTv_SdtTUSUARI_Level1Item_Grppri_Z = value ;
   }

   public void setgxTv_SdtTUSUARI_Level1Item_Grppri_Z_SetNull( )
   {
      gxTv_SdtTUSUARI_Level1Item_Grppri_Z = (byte)(0) ;
      SetDirty("Grppri_Z");
   }

   public boolean getgxTv_SdtTUSUARI_Level1Item_Grppri_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTUSUARI_Level1Item_Grptxt_N( )
   {
      return gxTv_SdtTUSUARI_Level1Item_Grptxt_N ;
   }

   public void setgxTv_SdtTUSUARI_Level1Item_Grptxt_N( byte value )
   {
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(0) ;
      gxTv_SdtTUSUARI_Level1Item_Modified = (short)(1) ;
      SetDirty("Grptxt_N");
      gxTv_SdtTUSUARI_Level1Item_Grptxt_N = value ;
   }

   public void setgxTv_SdtTUSUARI_Level1Item_Grptxt_N_SetNull( )
   {
      gxTv_SdtTUSUARI_Level1Item_Grptxt_N = (byte)(0) ;
      SetDirty("Grptxt_N");
   }

   public boolean getgxTv_SdtTUSUARI_Level1Item_Grptxt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtTUSUARI_Level1Item_Grpid = "" ;
      gxTv_SdtTUSUARI_Level1Item_N = (byte)(1) ;
      gxTv_SdtTUSUARI_Level1Item_Grptxt = "" ;
      gxTv_SdtTUSUARI_Level1Item_Mode = "" ;
      gxTv_SdtTUSUARI_Level1Item_Grpid_Z = "" ;
      gxTv_SdtTUSUARI_Level1Item_Grptxt_Z = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTUSUARI_Level1Item_N ;
   }

   public app.SdtTUSUARI_Level1Item Clone( )
   {
      return (app.SdtTUSUARI_Level1Item)(clone()) ;
   }

   public void setStruct( app.StructSdtTUSUARI_Level1Item struct )
   {
      setgxTv_SdtTUSUARI_Level1Item_Grpid(struct.getGrpid());
      setgxTv_SdtTUSUARI_Level1Item_Grptxt(struct.getGrptxt());
      setgxTv_SdtTUSUARI_Level1Item_Grppri(struct.getGrppri());
      setgxTv_SdtTUSUARI_Level1Item_Mode(struct.getMode());
      setgxTv_SdtTUSUARI_Level1Item_Modified(struct.getModified());
      setgxTv_SdtTUSUARI_Level1Item_Initialized(struct.getInitialized());
      setgxTv_SdtTUSUARI_Level1Item_Grpid_Z(struct.getGrpid_Z());
      setgxTv_SdtTUSUARI_Level1Item_Grptxt_Z(struct.getGrptxt_Z());
      setgxTv_SdtTUSUARI_Level1Item_Grppri_Z(struct.getGrppri_Z());
      setgxTv_SdtTUSUARI_Level1Item_Grptxt_N(struct.getGrptxt_N());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtTUSUARI_Level1Item getStruct( )
   {
      app.StructSdtTUSUARI_Level1Item struct = new app.StructSdtTUSUARI_Level1Item ();
      struct.setGrpid(getgxTv_SdtTUSUARI_Level1Item_Grpid());
      struct.setGrptxt(getgxTv_SdtTUSUARI_Level1Item_Grptxt());
      struct.setGrppri(getgxTv_SdtTUSUARI_Level1Item_Grppri());
      struct.setMode(getgxTv_SdtTUSUARI_Level1Item_Mode());
      struct.setModified(getgxTv_SdtTUSUARI_Level1Item_Modified());
      struct.setInitialized(getgxTv_SdtTUSUARI_Level1Item_Initialized());
      struct.setGrpid_Z(getgxTv_SdtTUSUARI_Level1Item_Grpid_Z());
      struct.setGrptxt_Z(getgxTv_SdtTUSUARI_Level1Item_Grptxt_Z());
      struct.setGrppri_Z(getgxTv_SdtTUSUARI_Level1Item_Grppri_Z());
      struct.setGrptxt_N(getgxTv_SdtTUSUARI_Level1Item_Grptxt_N());
      return struct ;
   }

   private byte gxTv_SdtTUSUARI_Level1Item_N ;
   private byte gxTv_SdtTUSUARI_Level1Item_Grppri ;
   private byte gxTv_SdtTUSUARI_Level1Item_Grppri_Z ;
   private byte gxTv_SdtTUSUARI_Level1Item_Grptxt_N ;
   private short gxTv_SdtTUSUARI_Level1Item_Modified ;
   private short gxTv_SdtTUSUARI_Level1Item_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private String gxTv_SdtTUSUARI_Level1Item_Grpid ;
   private String gxTv_SdtTUSUARI_Level1Item_Grptxt ;
   private String gxTv_SdtTUSUARI_Level1Item_Mode ;
   private String gxTv_SdtTUSUARI_Level1Item_Grpid_Z ;
   private String gxTv_SdtTUSUARI_Level1Item_Grptxt_Z ;
   private String sTagName ;
   private boolean readElement ;
   private boolean formatError ;
}

