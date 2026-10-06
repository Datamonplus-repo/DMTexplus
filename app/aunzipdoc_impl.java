package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class aunzipdoc_impl extends GXWebProcedure
{
   public aunzipdoc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10WordDocument = httpContext.getMessage( "C:\\Temp\\Modelo.docx", "") ;
      AV12BaseFolder = httpContext.getMessage( "C:\\Temp\\", "") ;
      AV16WorkRoot = AV12BaseFolder + httpContext.getMessage( "Base\\", "") ;
      AV13ModelName = httpContext.getMessage( "Modelo", "") ;
      AV14UnzipFolder = AV16WorkRoot + AV13ModelName + "\\" ;
      AV15Directory.setSource( AV16WorkRoot );
      if ( ! AV15Directory.exists() )
      {
         AV15Directory.setSource( AV16WorkRoot );
         AV15Directory.create();
      }
      AV15Directory.setSource( AV14UnzipFolder );
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(httpContext.getMessage( "UnzipFolder : ", "")+AV14UnzipFolder, AV29Pgmname) ;
      AV15Directory.setSource( AV14UnzipFolder );
      AV15Directory.create();
      AV17Logs = AV9AppTools.unzip(AV10WordDocument, AV14UnzipFolder) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(AV17Logs, AV29Pgmname) ;
      AV23DocumentXmlPath = AV14UnzipFolder + httpContext.getMessage( "word\\document.xml", "") ;
      AV18File.setSource( AV23DocumentXmlPath );
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(AV18File.getAbsoluteName(), AV29Pgmname) ;
      if ( ! AV18File.exists() )
      {
         System.out.println( httpContext.getMessage( "Não encontrei word\\document.xml em ", "")+AV14UnzipFolder );
         httpContext.nUserReturn = (byte)(1) ;
         if ( httpContext.willRedirect( ) )
         {
            httpContext.redirect( httpContext.wjLoc );
            httpContext.wjLoc = "" ;
         }
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV22XmlText = "" ;
      AV18File.setSource( AV23DocumentXmlPath );
      AV18File.open("");
      while ( ! AV18File.getEof() )
      {
         AV20Lin = AV18File.readLine() ;
         AV22XmlText += AV20Lin + GXutil.newLine( ) ;
      }
      AV18File.close();
      if ( GxRegex.IsMatch(AV22XmlText,httpContext.getMessage( "[%CLIENTE(Case(2))%]", "")) )
      {
         AV22XmlText = GXutil.strReplace( AV22XmlText, httpContext.getMessage( "[%CLIENTE(Case(2))%]", ""), httpContext.getMessage( "VICTOR", "")) ;
      }
      AV21FileWrite.setSource( AV23DocumentXmlPath );
      AV21FileWrite.delete();
      AV21FileWrite.create();
      AV21FileWrite.writeAllText(AV22XmlText, "UTF-8");
      AV21FileWrite.close();
      AV18File.setSource( AV10WordDocument );
      if ( AV18File.exists() )
      {
         AV18File.delete();
      }
      AV17Logs = AV9AppTools.zip(AV14UnzipFolder, AV10WordDocument) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(AV17Logs, AV29Pgmname) ;
      AV17Logs = AV9AppTools.deletedirectory(AV14UnzipFolder) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(AV17Logs, AV29Pgmname) ;
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV10WordDocument = "" ;
      AV12BaseFolder = "" ;
      AV16WorkRoot = "" ;
      AV13ModelName = "" ;
      AV14UnzipFolder = "" ;
      AV15Directory = new com.genexus.util.GXDirectory();
      AV29Pgmname = "" ;
      AV17Logs = "" ;
      AV9AppTools = new app.SdtAppTool(remoteHandle, context);
      AV23DocumentXmlPath = "" ;
      AV18File = new com.genexus.util.GXFile();
      AV22XmlText = "" ;
      AV20Lin = "" ;
      AV21FileWrite = new com.genexus.util.GXFile();
      AV29Pgmname = "AunZipDoc" ;
      /* GeneXus formulas. */
      AV29Pgmname = "AunZipDoc" ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV29Pgmname ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String AV22XmlText ;
   private String AV10WordDocument ;
   private String AV12BaseFolder ;
   private String AV16WorkRoot ;
   private String AV13ModelName ;
   private String AV14UnzipFolder ;
   private String AV17Logs ;
   private String AV23DocumentXmlPath ;
   private String AV20Lin ;
   private com.genexus.util.GXFile AV18File ;
   private com.genexus.util.GXFile AV21FileWrite ;
   private com.genexus.util.GXDirectory AV15Directory ;
   private app.SdtAppTool AV9AppTools ;
}

