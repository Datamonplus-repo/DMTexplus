package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rlisbarg", "/app.rlisbarg"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rlisbarg extends GXWebObjectStub
{
   public rlisbarg( )
   {
   }

   public rlisbarg( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rlisbarg.class ));
   }

   public rlisbarg( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rlisbarg_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rlisbarg_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LISTADO HOJAS RUTA GRAFICA";
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

