package app.devops ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getmirrorversion extends GXProcedure
{
   public getmirrorversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getmirrorversion.class ), "" );
   }

   public getmirrorversion( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      getmirrorversion.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      getmirrorversion.this.aP0 = aP0;
      getmirrorversion.this.aP1 = aP1;
      getmirrorversion.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9MirrorVersion = httpContext.getMessage( "<p style=\"padding: 5px;\">DatamonPlus - Copyright <strong>##YEAR##</strong> (Revisión <strong>##DATE##</strong> (U<strong>##BUILD##</strong>))</p>", "") ;
      /* User Code */
       AV13Path = System.getProperty("catalina.base");
      /* User Code */
       AV28osName = System.getProperty("os.name");
      /* User Code */
       AV29osVersion = System.getProperty("os.version");
      /* User Code */
       AV30osArch = System.getProperty("os.arch");
      AV18NameApp = AV14HttpRequest.getScriptPath() ;
      AV18NameApp = GXutil.strReplace( AV18NameApp, "/", "") ;
      if ( GxRegex.IsMatch(AV28osName,httpContext.getMessage( "Windows", "")) )
      {
         AV31Bar = "\\" ;
      }
      else
      {
         AV31Bar = "/" ;
      }
      AV17PathBuild += AV13Path + AV31Bar + "webapps" + AV31Bar + AV18NameApp + AV31Bar + "static" + AV31Bar + "release" + AV31Bar + "build.txt" ;
      AV23PathRelease += AV13Path + AV31Bar + "webapps" + AV31Bar + AV18NameApp + AV31Bar + "static" + AV31Bar + "release" + AV31Bar ;
      AV10File.setSource( AV17PathBuild );
      if ( AV10File.exists() )
      {
         AV15Rows = new GXSimpleCollection<String>(String.class, "internal", "", AV10File.readAllLines()) ;
         AV21i = (short)(0) ;
         AV34GXV1 = 1 ;
         while ( AV34GXV1 <= AV15Rows.size() )
         {
            AV16Row = (String)AV15Rows.elementAt(-1+AV34GXV1) ;
            AV21i = (short)(AV21i+1) ;
            AV20R = new GXSimpleCollection<String>(String.class, "internal", "", GxRegex.Split(AV16Row,"=")) ;
            if ( AV21i == 1 )
            {
               AV19BuildVersion.setgxTv_SdtBuildVersion_Build_number( (String)AV20R.elementAt(-1+2) );
            }
            else if ( AV21i == 2 )
            {
               AV19BuildVersion.setgxTv_SdtBuildVersion_Product( (String)AV20R.elementAt(-1+2) );
            }
            else if ( AV21i == 3 )
            {
               AV19BuildVersion.setgxTv_SdtBuildVersion_Date( (String)AV20R.elementAt(-1+2) );
            }
            AV20R.clear();
            AV34GXV1 = (int)(AV34GXV1+1) ;
         }
         AV9MirrorVersion = GXutil.strReplace( AV9MirrorVersion, httpContext.getMessage( "##DATE##", ""), AV19BuildVersion.getgxTv_SdtBuildVersion_Date()) ;
         AV9MirrorVersion = GXutil.strReplace( AV9MirrorVersion, httpContext.getMessage( "##BUILD##", ""), AV19BuildVersion.getgxTv_SdtBuildVersion_Build_number()) ;
         AV9MirrorVersion = GXutil.strReplace( AV9MirrorVersion, httpContext.getMessage( "##YEAR##", ""), GXutil.substring( AV19BuildVersion.getgxTv_SdtBuildVersion_Date(), 1, 4)) ;
         AV26Build = AV19BuildVersion.getgxTv_SdtBuildVersion_Build_number() ;
         AV23PathRelease += AV19BuildVersion.getgxTv_SdtBuildVersion_Build_number() + "_" + AV19BuildVersion.getgxTv_SdtBuildVersion_Product() + httpContext.getMessage( ".txt", "") ;
         AV10File.close();
         AV24FileRelease.setSource( AV23PathRelease );
         if ( AV24FileRelease.exists() )
         {
            AV25DocRelease = AV24FileRelease.readAllText("") ;
         }
         AV24FileRelease.close();
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = getmirrorversion.this.AV9MirrorVersion;
      this.aP1[0] = getmirrorversion.this.AV26Build;
      this.aP2[0] = getmirrorversion.this.AV25DocRelease;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9MirrorVersion = "" ;
      AV26Build = "" ;
      AV25DocRelease = "" ;
      AV13Path = "" ;
      AV28osName = "" ;
      AV29osVersion = "" ;
      AV30osArch = "" ;
      AV18NameApp = "" ;
      AV14HttpRequest = httpContext.getHttpRequest();
      AV31Bar = "" ;
      AV17PathBuild = "" ;
      AV23PathRelease = "" ;
      AV10File = new com.genexus.util.GXFile();
      AV15Rows = new GXSimpleCollection<String>(String.class, "internal", "");
      AV16Row = "" ;
      AV20R = new GXSimpleCollection<String>(String.class, "internal", "");
      AV19BuildVersion = new app.devops.SdtBuildVersion(remoteHandle, context);
      AV24FileRelease = new com.genexus.util.GXFile();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV21i ;
   private short Gx_err ;
   private int AV34GXV1 ;
   private String AV31Bar ;
   private String AV25DocRelease ;
   private String AV9MirrorVersion ;
   private String AV26Build ;
   private String AV13Path ;
   private String AV28osName ;
   private String AV29osVersion ;
   private String AV30osArch ;
   private String AV18NameApp ;
   private String AV17PathBuild ;
   private String AV23PathRelease ;
   private String AV16Row ;
   private com.genexus.internet.HttpRequest AV14HttpRequest ;
   private com.genexus.util.GXFile AV10File ;
   private com.genexus.util.GXFile AV24FileRelease ;
   private app.devops.SdtBuildVersion AV19BuildVersion ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private GXSimpleCollection<String> AV15Rows ;
   private GXSimpleCollection<String> AV20R ;
}

