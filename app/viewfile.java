package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class viewfile extends GXProcedure
{
   public viewfile( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( viewfile.class ), "" );
   }

   public viewfile( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 )
   {
      viewfile.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      viewfile.this.AV12FilePath = aP0;
      viewfile.this.AV10Directory = aP1;
      viewfile.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16TomcatPath = AV17AppTool.servletinfo() ;
      AV19AppName = new GXSimpleCollection<String>(String.class, "internal", "", GxRegex.Split(AV18HttpRequest.getScriptPath(),"/")) ;
      AV22BaseUrl = AV18HttpRequest.getBaseURL() ;
      if ( GxRegex.IsMatch(AV12FilePath,"/") )
      {
         AV8Arquivo = new GXSimpleCollection<String>(String.class, "internal", "", GxRegex.Split(AV12FilePath,"/")) ;
      }
      else
      {
         AV8Arquivo = new GXSimpleCollection<String>(String.class, "internal", "", GxRegex.Split(AV12FilePath,"\\\\")) ;
      }
      if ( AV8Arquivo.size() != 0 )
      {
         AV21FileName = (String)AV8Arquivo.elementAt(-1+AV8Arquivo.size()) ;
      }
      AV23Link = AV22BaseUrl + httpContext.getMessage( "/webpdf/", "") + AV10Directory + AV21FileName ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = viewfile.this.AV23Link;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV23Link = "" ;
      AV16TomcatPath = "" ;
      AV17AppTool = new app.SdtAppTool(remoteHandle, context);
      AV19AppName = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18HttpRequest = httpContext.getHttpRequest();
      AV22BaseUrl = "" ;
      AV8Arquivo = new GXSimpleCollection<String>(String.class, "internal", "");
      AV21FileName = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV12FilePath ;
   private String AV10Directory ;
   private String AV23Link ;
   private String AV16TomcatPath ;
   private String AV22BaseUrl ;
   private String AV21FileName ;
   private com.genexus.internet.HttpRequest AV18HttpRequest ;
   private app.SdtAppTool AV17AppTool ;
   private String[] aP2 ;
   private GXSimpleCollection<String> AV19AppName ;
   private GXSimpleCollection<String> AV8Arquivo ;
}

