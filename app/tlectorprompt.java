package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tlectorprompt", "/app.tlectorprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlectorprompt extends GXWebObjectStub
{
   public tlectorprompt( )
   {
   }

   public tlectorprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlectorprompt.class ));
   }

   public tlectorprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlectorprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlectorprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Mantenimiento tabla LECTOR";
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

