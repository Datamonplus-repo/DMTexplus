package app.devops ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTBuild extends GxUserType
{
   public SdtSDTBuild( )
   {
      this(  new ModelContext(SdtSDTBuild.class));
   }

   public SdtSDTBuild( ModelContext context )
   {
      super( context, "SdtSDTBuild");
   }

   public SdtSDTBuild( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTBuild");
   }

   public SdtSDTBuild( StructSdtSDTBuild struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "app") )
            {
               gxTv_SdtSDTBuild_App = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "latestVersion") )
            {
               gxTv_SdtSDTBuild_Latestversion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "mandatory") )
            {
               gxTv_SdtSDTBuild_Mandatory = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "artifact") )
            {
               if ( gxTv_SdtSDTBuild_Artifact == null )
               {
                  gxTv_SdtSDTBuild_Artifact = new app.devops.SdtSDTBuild_artifact(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtSDTBuild_Artifact.readxml(oReader, "artifact") ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "releaseNotes") )
            {
               gxTv_SdtSDTBuild_Releasenotes = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "signatureUrl") )
            {
               gxTv_SdtSDTBuild_Signatureurl = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "allArtifacts") )
            {
               if ( gxTv_SdtSDTBuild_Allartifacts == null )
               {
                  gxTv_SdtSDTBuild_Allartifacts = new GXBaseCollection<app.devops.SdtSDTBuild_allArtifactsItem>(app.devops.SdtSDTBuild_allArtifactsItem.class, "SDTBuild.allArtifactsItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTBuild_Allartifacts.readxmlcollection(oReader, "allArtifacts", "allArtifactsItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "allArtifacts") )
               {
                  GXSoapError = oReader.read() ;
               }
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
         sName = "SDTBuild" ;
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
      oWriter.writeElement("app", gxTv_SdtSDTBuild_App);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("latestVersion", gxTv_SdtSDTBuild_Latestversion);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("mandatory", GXutil.booltostr( gxTv_SdtSDTBuild_Mandatory));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTBuild_Artifact != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtSDTBuild_Artifact.writexml(oWriter, "artifact", sNameSpace1);
      }
      oWriter.writeElement("releaseNotes", gxTv_SdtSDTBuild_Releasenotes);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("signatureUrl", gxTv_SdtSDTBuild_Signatureurl);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTBuild_Allartifacts != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtSDTBuild_Allartifacts.writexmlcollection(oWriter, "allArtifacts", sNameSpace1, "allArtifactsItem", sNameSpace1);
      }
      oWriter.writeEndElement();
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
      AddObjectProperty("app", gxTv_SdtSDTBuild_App, false, false);
      AddObjectProperty("latestVersion", gxTv_SdtSDTBuild_Latestversion, false, false);
      AddObjectProperty("mandatory", gxTv_SdtSDTBuild_Mandatory, false, false);
      if ( gxTv_SdtSDTBuild_Artifact != null )
      {
         AddObjectProperty("artifact", gxTv_SdtSDTBuild_Artifact, false, false);
      }
      AddObjectProperty("releaseNotes", gxTv_SdtSDTBuild_Releasenotes, false, false);
      AddObjectProperty("signatureUrl", gxTv_SdtSDTBuild_Signatureurl, false, false);
      if ( gxTv_SdtSDTBuild_Allartifacts != null )
      {
         AddObjectProperty("allArtifacts", gxTv_SdtSDTBuild_Allartifacts, false, false);
      }
   }

   public String getgxTv_SdtSDTBuild_App( )
   {
      return gxTv_SdtSDTBuild_App ;
   }

   public void setgxTv_SdtSDTBuild_App( String value )
   {
      gxTv_SdtSDTBuild_N = (byte)(0) ;
      gxTv_SdtSDTBuild_App = value ;
   }

   public String getgxTv_SdtSDTBuild_Latestversion( )
   {
      return gxTv_SdtSDTBuild_Latestversion ;
   }

   public void setgxTv_SdtSDTBuild_Latestversion( String value )
   {
      gxTv_SdtSDTBuild_N = (byte)(0) ;
      gxTv_SdtSDTBuild_Latestversion = value ;
   }

   public boolean getgxTv_SdtSDTBuild_Mandatory( )
   {
      return gxTv_SdtSDTBuild_Mandatory ;
   }

   public void setgxTv_SdtSDTBuild_Mandatory( boolean value )
   {
      gxTv_SdtSDTBuild_N = (byte)(0) ;
      gxTv_SdtSDTBuild_Mandatory = value ;
   }

   public app.devops.SdtSDTBuild_artifact getgxTv_SdtSDTBuild_Artifact( )
   {
      if ( gxTv_SdtSDTBuild_Artifact == null )
      {
         gxTv_SdtSDTBuild_Artifact = new app.devops.SdtSDTBuild_artifact(remoteHandle, context);
      }
      gxTv_SdtSDTBuild_Artifact_N = (byte)(0) ;
      gxTv_SdtSDTBuild_N = (byte)(0) ;
      return gxTv_SdtSDTBuild_Artifact ;
   }

   public void setgxTv_SdtSDTBuild_Artifact( app.devops.SdtSDTBuild_artifact value )
   {
      gxTv_SdtSDTBuild_Artifact_N = (byte)(0) ;
      gxTv_SdtSDTBuild_N = (byte)(0) ;
      gxTv_SdtSDTBuild_Artifact = value;
   }

   public void setgxTv_SdtSDTBuild_Artifact_SetNull( )
   {
      gxTv_SdtSDTBuild_Artifact_N = (byte)(1) ;
      gxTv_SdtSDTBuild_Artifact = (app.devops.SdtSDTBuild_artifact)null;
   }

   public boolean getgxTv_SdtSDTBuild_Artifact_IsNull( )
   {
      if ( gxTv_SdtSDTBuild_Artifact == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTBuild_Artifact_N( )
   {
      return gxTv_SdtSDTBuild_Artifact_N ;
   }

   public String getgxTv_SdtSDTBuild_Releasenotes( )
   {
      return gxTv_SdtSDTBuild_Releasenotes ;
   }

   public void setgxTv_SdtSDTBuild_Releasenotes( String value )
   {
      gxTv_SdtSDTBuild_N = (byte)(0) ;
      gxTv_SdtSDTBuild_Releasenotes = value ;
   }

   public String getgxTv_SdtSDTBuild_Signatureurl( )
   {
      return gxTv_SdtSDTBuild_Signatureurl ;
   }

   public void setgxTv_SdtSDTBuild_Signatureurl( String value )
   {
      gxTv_SdtSDTBuild_N = (byte)(0) ;
      gxTv_SdtSDTBuild_Signatureurl = value ;
   }

   public GXBaseCollection<app.devops.SdtSDTBuild_allArtifactsItem> getgxTv_SdtSDTBuild_Allartifacts( )
   {
      if ( gxTv_SdtSDTBuild_Allartifacts == null )
      {
         gxTv_SdtSDTBuild_Allartifacts = new GXBaseCollection<app.devops.SdtSDTBuild_allArtifactsItem>(app.devops.SdtSDTBuild_allArtifactsItem.class, "SDTBuild.allArtifactsItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTBuild_Allartifacts_N = (byte)(0) ;
      gxTv_SdtSDTBuild_N = (byte)(0) ;
      return gxTv_SdtSDTBuild_Allartifacts ;
   }

   public void setgxTv_SdtSDTBuild_Allartifacts( GXBaseCollection<app.devops.SdtSDTBuild_allArtifactsItem> value )
   {
      gxTv_SdtSDTBuild_Allartifacts_N = (byte)(0) ;
      gxTv_SdtSDTBuild_N = (byte)(0) ;
      gxTv_SdtSDTBuild_Allartifacts = value ;
   }

   public void setgxTv_SdtSDTBuild_Allartifacts_SetNull( )
   {
      gxTv_SdtSDTBuild_Allartifacts_N = (byte)(1) ;
      gxTv_SdtSDTBuild_Allartifacts = null ;
   }

   public boolean getgxTv_SdtSDTBuild_Allartifacts_IsNull( )
   {
      if ( gxTv_SdtSDTBuild_Allartifacts == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTBuild_Allartifacts_N( )
   {
      return gxTv_SdtSDTBuild_Allartifacts_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTBuild_App = "" ;
      gxTv_SdtSDTBuild_N = (byte)(1) ;
      gxTv_SdtSDTBuild_Latestversion = "" ;
      gxTv_SdtSDTBuild_Artifact_N = (byte)(1) ;
      gxTv_SdtSDTBuild_Releasenotes = "" ;
      gxTv_SdtSDTBuild_Signatureurl = "" ;
      gxTv_SdtSDTBuild_Allartifacts_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTBuild_N ;
   }

   public app.devops.SdtSDTBuild Clone( )
   {
      return (app.devops.SdtSDTBuild)(clone()) ;
   }

   public void setStruct( app.devops.StructSdtSDTBuild struct )
   {
      setgxTv_SdtSDTBuild_App(struct.getApp());
      setgxTv_SdtSDTBuild_Latestversion(struct.getLatestversion());
      setgxTv_SdtSDTBuild_Mandatory(struct.getMandatory());
      setgxTv_SdtSDTBuild_Artifact(new app.devops.SdtSDTBuild_artifact(struct.getArtifact()));
      setgxTv_SdtSDTBuild_Releasenotes(struct.getReleasenotes());
      setgxTv_SdtSDTBuild_Signatureurl(struct.getSignatureurl());
      GXBaseCollection<app.devops.SdtSDTBuild_allArtifactsItem> gxTv_SdtSDTBuild_Allartifacts_aux = new GXBaseCollection<app.devops.SdtSDTBuild_allArtifactsItem>(app.devops.SdtSDTBuild_allArtifactsItem.class, "SDTBuild.allArtifactsItem", "TexplusNET", remoteHandle);
      Vector<app.devops.StructSdtSDTBuild_allArtifactsItem> gxTv_SdtSDTBuild_Allartifacts_aux1 = struct.getAllartifacts();
      if (gxTv_SdtSDTBuild_Allartifacts_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTBuild_Allartifacts_aux1.size(); i++)
         {
            gxTv_SdtSDTBuild_Allartifacts_aux.add(new app.devops.SdtSDTBuild_allArtifactsItem(gxTv_SdtSDTBuild_Allartifacts_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTBuild_Allartifacts(gxTv_SdtSDTBuild_Allartifacts_aux);
   }

   @SuppressWarnings("unchecked")
   public app.devops.StructSdtSDTBuild getStruct( )
   {
      app.devops.StructSdtSDTBuild struct = new app.devops.StructSdtSDTBuild ();
      struct.setApp(getgxTv_SdtSDTBuild_App());
      struct.setLatestversion(getgxTv_SdtSDTBuild_Latestversion());
      struct.setMandatory(getgxTv_SdtSDTBuild_Mandatory());
      struct.setArtifact(getgxTv_SdtSDTBuild_Artifact().getStruct());
      struct.setReleasenotes(getgxTv_SdtSDTBuild_Releasenotes());
      struct.setSignatureurl(getgxTv_SdtSDTBuild_Signatureurl());
      struct.setAllartifacts(getgxTv_SdtSDTBuild_Allartifacts().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTBuild_N ;
   protected byte gxTv_SdtSDTBuild_Artifact_N ;
   protected byte gxTv_SdtSDTBuild_Allartifacts_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean gxTv_SdtSDTBuild_Mandatory ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTBuild_App ;
   protected String gxTv_SdtSDTBuild_Latestversion ;
   protected String gxTv_SdtSDTBuild_Releasenotes ;
   protected String gxTv_SdtSDTBuild_Signatureurl ;
   protected GXBaseCollection<app.devops.SdtSDTBuild_allArtifactsItem> gxTv_SdtSDTBuild_Allartifacts_aux ;
   protected GXBaseCollection<app.devops.SdtSDTBuild_allArtifactsItem> gxTv_SdtSDTBuild_Allartifacts=null ;
   protected app.devops.SdtSDTBuild_artifact gxTv_SdtSDTBuild_Artifact=null ;
}

