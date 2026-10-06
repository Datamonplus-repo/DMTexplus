package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.webverhdrs", "/app.expedicionesautomatizadas.webverhdrs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webverhdrs extends GXWebObjectStub
{
   public webverhdrs( )
   {
   }

   public webverhdrs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webverhdrs.class ));
   }

   public webverhdrs( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(app.GXcfg.class);
      app.expedicionesautomatizadas.webverhdrs_impl pgm = new app.expedicionesautomatizadas.webverhdrs_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webverhdrs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webverhdrs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Table LHIPRO";
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

