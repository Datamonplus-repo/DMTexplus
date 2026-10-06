package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtAppTool extends GxUserType
{
   public SdtAppTool( )
   {
      this(  new ModelContext(SdtAppTool.class));
   }

   public SdtAppTool( ModelContext context )
   {
      super( context, "SdtAppTool");
   }

   public SdtAppTool( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtAppTool");
   }

   public SdtAppTool( StructSdtAppTool struct )
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

   public String qrcode( int gxTp_width ,
                         int gxTp_height ,
                         String gxTp_data )
   {
      String returnqrcode;
      if ( AppTool_externalReference == null )
      {
         AppTool_externalReference = new app.tools.tools() ;
      }
      returnqrcode = "";
      returnqrcode = AppTool_externalReference.qrcode(gxTp_width, gxTp_height, gxTp_data) ;
      return returnqrcode ;
   }

   public String hashat( String gxTp_path ,
                         String gxTp_data )
   {
      String returnhashat;
      if ( AppTool_externalReference == null )
      {
         AppTool_externalReference = new app.tools.tools() ;
      }
      returnhashat = "";
      returnhashat = AppTool_externalReference.hashAt(gxTp_path, gxTp_data) ;
      return returnhashat ;
   }

   public String merge( String gxTp_jsonInputPath ,
                        String gxTp_PathPdf ,
                        boolean gxTp_isDeleted )
   {
      String returnmerge;
      if ( AppTool_externalReference == null )
      {
         AppTool_externalReference = new app.tools.tools() ;
      }
      returnmerge = "";
      returnmerge = AppTool_externalReference.merge(gxTp_jsonInputPath, gxTp_PathPdf, gxTp_isDeleted) ;
      return returnmerge ;
   }

   public String qrcodecm( int gxTp_inch ,
                           String gxTp_data ,
                           String gxTp_path )
   {
      String returnqrcodecm;
      if ( AppTool_externalReference == null )
      {
         AppTool_externalReference = new app.tools.tools() ;
      }
      returnqrcodecm = "";
      returnqrcodecm = AppTool_externalReference.qrcodeCM(gxTp_inch, gxTp_data, gxTp_path) ;
      return returnqrcodecm ;
   }

   public String servletinfo( )
   {
      String returnservletinfo;
      if ( AppTool_externalReference == null )
      {
         AppTool_externalReference = new app.tools.tools() ;
      }
      returnservletinfo = "";
      returnservletinfo = AppTool_externalReference.servletInfo() ;
      return returnservletinfo ;
   }

   public String listprinter( )
   {
      String returnlistprinter;
      if ( AppTool_externalReference == null )
      {
         AppTool_externalReference = new app.tools.tools() ;
      }
      returnlistprinter = "";
      returnlistprinter = AppTool_externalReference.listprinter() ;
      return returnlistprinter ;
   }

   public String printto( String gxTp_path ,
                          String gxTp_printer ,
                          byte gxTp_copies ,
                          boolean gxTp_color ,
                          boolean gxTp_landscape )
   {
      String returnprintto;
      if ( AppTool_externalReference == null )
      {
         AppTool_externalReference = new app.tools.tools() ;
      }
      returnprintto = "";
      returnprintto = AppTool_externalReference.printto(gxTp_path, gxTp_printer, gxTp_copies, gxTp_color, gxTp_landscape) ;
      return returnprintto ;
   }

   public String email( String gxTp_json )
   {
      String returnemail;
      if ( AppTool_externalReference == null )
      {
         AppTool_externalReference = new app.tools.tools() ;
      }
      returnemail = "";
      returnemail = AppTool_externalReference.email(gxTp_json) ;
      return returnemail ;
   }

   public String base64tofile( String gxTp_base64 ,
                               String gxTp_destino )
   {
      String returnbase64tofile;
      if ( AppTool_externalReference == null )
      {
         AppTool_externalReference = new app.tools.tools() ;
      }
      returnbase64tofile = "";
      returnbase64tofile = AppTool_externalReference.Base64ToFile(gxTp_base64, gxTp_destino) ;
      return returnbase64tofile ;
   }

   public String applytemplateexcel( String gxTp_templatePath ,
                                     String gxTp_excelPath ,
                                     String gxTp_outPath )
   {
      String returnapplytemplateexcel;
      if ( AppTool_externalReference == null )
      {
         AppTool_externalReference = new app.tools.tools() ;
      }
      returnapplytemplateexcel = "";
      returnapplytemplateexcel = AppTool_externalReference.ApplyTemplateExcel(gxTp_templatePath, gxTp_excelPath, gxTp_outPath) ;
      return returnapplytemplateexcel ;
   }

   public String zip( String gxTp_sourcePath  ,
                      String gxTp_zipFilePath )
   {
      String returnzip;
      if ( AppTool_externalReference == null )
      {
         AppTool_externalReference = new app.tools.tools() ;
      }
      returnzip = "";
      returnzip = AppTool_externalReference.zip(gxTp_sourcePath , gxTp_zipFilePath) ;
      return returnzip ;
   }

   public String unzip( String gxTp_zipFilePath ,
                        String gxTp_destDirectory )
   {
      String returnunzip;
      if ( AppTool_externalReference == null )
      {
         AppTool_externalReference = new app.tools.tools() ;
      }
      returnunzip = "";
      returnunzip = AppTool_externalReference.unzip(gxTp_zipFilePath, gxTp_destDirectory) ;
      return returnunzip ;
   }

   public String deletedirectory( String gxTp_Path )
   {
      String returndeletedirectory;
      if ( AppTool_externalReference == null )
      {
         AppTool_externalReference = new app.tools.tools() ;
      }
      returndeletedirectory = "";
      returndeletedirectory = AppTool_externalReference.deleteDirectory(gxTp_Path) ;
      return returndeletedirectory ;
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1;
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
   }

   public app.tools.tools getExternalInstance( )
   {
      if ( AppTool_externalReference == null )
      {
         AppTool_externalReference = new app.tools.tools() ;
      }
      return AppTool_externalReference ;
   }

   public void setExternalInstance( app.tools.tools value )
   {
      AppTool_externalReference = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
   }

   public app.SdtAppTool Clone( )
   {
      return (app.SdtAppTool)(clone()) ;
   }

   public void setStruct( app.StructSdtAppTool struct )
   {
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtAppTool getStruct( )
   {
      app.StructSdtAppTool struct = new app.StructSdtAppTool ();
      return struct ;
   }

   protected app.tools.tools AppTool_externalReference=null ;
}

