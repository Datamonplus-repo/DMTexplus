package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipdef", "/app.ficherosbasicos.ttipdef"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipdef extends GXWebObjectStub
{
   public ttipdef( )
   {
   }

   public ttipdef( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipdef.class ));
   }

   public ttipdef( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipdef_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipdef_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipo Defecto";
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

