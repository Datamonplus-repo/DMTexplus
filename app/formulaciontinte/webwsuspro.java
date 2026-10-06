package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.webwsuspro", "/app.formulaciontinte.webwsuspro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwsuspro extends GXWebObjectStub
{
   public webwsuspro( )
   {
   }

   public webwsuspro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwsuspro.class ));
   }

   public webwsuspro( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwsuspro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwsuspro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Sustitucion Proceso Quimico";
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

