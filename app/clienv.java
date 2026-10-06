package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.clienv", "/app.clienv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class clienv extends GXWebObjectStub
{
   public clienv( )
   {
   }

   public clienv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( clienv.class ));
   }

   public clienv( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new clienv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new clienv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CLIENTE: DOMICILIO DE ENVIOS";
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

