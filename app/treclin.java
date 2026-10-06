package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.treclin", "/app.treclin"})
@jakarta.servlet.annotation.MultipartConfig
public final  class treclin extends GXWebObjectStub
{
   public treclin( )
   {
   }

   public treclin( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( treclin.class ));
   }

   public treclin( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new treclin_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new treclin_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Productos en Receta";
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

