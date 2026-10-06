package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getbuildversion extends GXProcedure
{
   public getbuildversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getbuildversion.class ), "" );
   }

   public getbuildversion( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public app.devops.SdtBuildVersion executeUdp( )
   {
      getbuildversion.this.aP0 = new app.devops.SdtBuildVersion[] {new app.devops.SdtBuildVersion()};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( app.devops.SdtBuildVersion[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( app.devops.SdtBuildVersion[] aP0 )
   {
      getbuildversion.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Path = AV8AppTool.servletinfo() ;
      AV17NameApp = AV13HttpRequest.getScriptPath() ;
      AV17NameApp = GXutil.strReplace( AV17NameApp, "/", "") ;
      AV16PathBuild += AV12Path + httpContext.getMessage( "webapps\\", "") + AV17NameApp + httpContext.getMessage( "\\static\\release\\build.txt", "") ;
      AV22PathRelease += AV12Path + httpContext.getMessage( "webapps\\", "") + AV17NameApp + httpContext.getMessage( "\\static\\release\\", "") ;
      AV9File.setSource( AV16PathBuild );
      if ( AV9File.exists() )
      {
         AV14Rows = new GXSimpleCollection<String>(String.class, "internal", "", AV9File.readAllLines()) ;
         AV20i = (short)(0) ;
         AV27GXV1 = 1 ;
         while ( AV27GXV1 <= AV14Rows.size() )
         {
            AV15Row = (String)AV14Rows.elementAt(-1+AV27GXV1) ;
            AV20i = (short)(AV20i+1) ;
            AV19R = new GXSimpleCollection<String>(String.class, "internal", "", GxRegex.Split(AV15Row,"=")) ;
            if ( AV20i == 1 )
            {
               AV18BuildVersion.setgxTv_SdtBuildVersion_Build_number( (String)AV19R.elementAt(-1+2) );
            }
            else if ( AV20i == 2 )
            {
               AV18BuildVersion.setgxTv_SdtBuildVersion_Product( (String)AV19R.elementAt(-1+2) );
            }
            else if ( AV20i == 3 )
            {
               AV18BuildVersion.setgxTv_SdtBuildVersion_Date( (String)AV19R.elementAt(-1+2) );
            }
            AV19R.clear();
            AV27GXV1 = (int)(AV27GXV1+1) ;
         }
         AV9File.close();
         AV22PathRelease += AV18BuildVersion.getgxTv_SdtBuildVersion_Build_number() + "_" + AV18BuildVersion.getgxTv_SdtBuildVersion_Product() + httpContext.getMessage( ".txt", "") ;
         AV23FileRelease.setSource( AV22PathRelease );
         if ( AV23FileRelease.exists() )
         {
            AV24DocRelease = AV23FileRelease.readAllText("") ;
            AV18BuildVersion.setgxTv_SdtBuildVersion_Release( AV24DocRelease );
         }
         System.out.println( "-------------------------" );
         System.out.println( AV18BuildVersion.toJSonString(false, true) );
         System.out.println( "-------------------------" );
         AV23FileRelease.close();
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = getbuildversion.this.AV18BuildVersion;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18BuildVersion = new app.devops.SdtBuildVersion(remoteHandle, context);
      AV12Path = "" ;
      AV8AppTool = new app.SdtAppTool(remoteHandle, context);
      AV17NameApp = "" ;
      AV13HttpRequest = httpContext.getHttpRequest();
      AV16PathBuild = "" ;
      AV22PathRelease = "" ;
      AV9File = new com.genexus.util.GXFile();
      AV14Rows = new GXSimpleCollection<String>(String.class, "internal", "");
      AV15Row = "" ;
      AV19R = new GXSimpleCollection<String>(String.class, "internal", "");
      AV23FileRelease = new com.genexus.util.GXFile();
      AV24DocRelease = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV20i ;
   private short Gx_err ;
   private int AV27GXV1 ;
   private String AV24DocRelease ;
   private String AV12Path ;
   private String AV17NameApp ;
   private String AV16PathBuild ;
   private String AV22PathRelease ;
   private String AV15Row ;
   private com.genexus.internet.HttpRequest AV13HttpRequest ;
   private com.genexus.util.GXFile AV9File ;
   private com.genexus.util.GXFile AV23FileRelease ;
   private app.SdtAppTool AV8AppTool ;
   private app.devops.SdtBuildVersion[] aP0 ;
   private GXSimpleCollection<String> AV14Rows ;
   private GXSimpleCollection<String> AV19R ;
   private app.devops.SdtBuildVersion AV18BuildVersion ;
}

