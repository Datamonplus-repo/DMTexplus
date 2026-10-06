package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tturnos", "/app.tturnos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tturnos extends GXWebObjectStub
{
   public tturnos( )
   {
   }

   public tturnos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tturnos.class ));
   }

   public tturnos( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tturnos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tturnos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TURNOS";
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

