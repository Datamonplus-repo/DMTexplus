package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.toperarprompt", "/app.toperarprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class toperarprompt extends GXWebObjectStub
{
   public toperarprompt( )
   {
   }

   public toperarprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( toperarprompt.class ));
   }

   public toperarprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new toperarprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new toperarprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona MANTENIMIENTO DE OPERARIOS";
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

