package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttipent", "/app.ttipent"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipent extends GXWebObjectStub
{
   public ttipent( )
   {
   }

   public ttipent( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipent.class ));
   }

   public ttipent( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipent_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipent_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TIPOS DE ENTRADAS";
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

