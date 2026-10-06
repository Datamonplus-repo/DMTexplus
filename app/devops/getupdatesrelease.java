package app.devops ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getupdatesrelease extends GXProcedure
{
   public getupdatesrelease( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getupdatesrelease.class ), "" );
   }

   public getupdatesrelease( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String aP0 )
   {
      getupdatesrelease.this.AV12Version = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8HttpClient.setHost( httpContext.getMessage( "dmanager.api.datamonplus.com", "") );
      AV8HttpClient.setSecure( (byte)(1) );
      AV8HttpClient.setBaseURL( httpContext.getMessage( "/api/cicd-updates/releases/", "") );
      AV8HttpClient.addHeader(httpContext.getMessage( "accept", ""), "*/*");
      AV8HttpClient.execute("GET", GXutil.format( httpContext.getMessage( "by-version?kb=texplusnet&version=%1", ""), GXutil.trim( AV12Version), "", "", "", "", "", "", "", ""));
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info("------------------------------------", AV15Pgmname) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(AV8HttpClient.getString(), AV15Pgmname) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info("------------------------------------", AV15Pgmname) ;
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      AV8HttpClient.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8HttpClient = new com.genexus.internet.HttpClient();
      AV15Pgmname = "" ;
      AV15Pgmname = "DevOps.GetUpdatesRelease" ;
      /* GeneXus formulas. */
      AV15Pgmname = "DevOps.GetUpdatesRelease" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV15Pgmname ;
   private String AV12Version ;
   private com.genexus.internet.HttpClient AV8HttpClient ;
}

