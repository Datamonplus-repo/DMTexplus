package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmetpidefectos", "/app.tmetpidefectos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmetpidefectos extends GXWebObjectStub
{
   public tmetpidefectos( )
   {
   }

   public tmetpidefectos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmetpidefectos.class ));
   }

   public tmetpidefectos( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmetpidefectos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmetpidefectos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "defectos";
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

