package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.wchistoricorecetas", "/app.formulaciontinte.wchistoricorecetas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wchistoricorecetas extends GXWebObjectStub
{
   public wchistoricorecetas( )
   {
   }

   public wchistoricorecetas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wchistoricorecetas.class ));
   }

   public wchistoricorecetas( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wchistoricorecetas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wchistoricorecetas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recetas Historico";
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

