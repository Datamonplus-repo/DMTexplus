package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnotre", "/app.tnotre"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnotre extends GXWebObjectStub
{
   public tnotre( )
   {
   }

   public tnotre( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnotre.class ));
   }

   public tnotre( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnotre_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnotre_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "NOTAS DE RETORNO";
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

