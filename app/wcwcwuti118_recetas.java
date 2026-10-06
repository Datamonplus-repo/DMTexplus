package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwcwuti118_recetas", "/app.wcwcwuti118_recetas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwcwuti118_recetas extends GXWebObjectStub
{
   public wcwcwuti118_recetas( )
   {
   }

   public wcwcwuti118_recetas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwcwuti118_recetas.class ));
   }

   public wcwcwuti118_recetas( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwcwuti118_recetas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwcwuti118_recetas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recetas (Historico)";
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

