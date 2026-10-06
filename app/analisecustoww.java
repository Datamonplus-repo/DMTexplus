package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.analisecustoww", "/app.analisecustoww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class analisecustoww extends GXWebObjectStub
{
   public analisecustoww( )
   {
   }

   public analisecustoww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( analisecustoww.class ));
   }

   public analisecustoww( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.analisecustoww_impl pgm = new app.analisecustoww_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new analisecustoww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new analisecustoww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Analise Custo";
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

}

