package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccionanalisis", "/app.produccionanalisis"})
@jakarta.servlet.annotation.MultipartConfig
public final  class produccionanalisis extends GXWebObjectStub
{
   public produccionanalisis( )
   {
   }

   public produccionanalisis( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( produccionanalisis.class ));
   }

   public produccionanalisis( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.produccionanalisis_impl pgm = new app.produccionanalisis_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new produccionanalisis_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new produccionanalisis_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Produccion Analisis";
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

