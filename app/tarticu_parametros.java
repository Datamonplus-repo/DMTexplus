package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tarticu_parametros", "/app.tarticu_parametros"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tarticu_parametros extends GXWebObjectStub
{
   public tarticu_parametros( )
   {
   }

   public tarticu_parametros( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tarticu_parametros.class ));
   }

   public tarticu_parametros( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tarticu_parametros_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tarticu_parametros_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Fases Proceso";
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

