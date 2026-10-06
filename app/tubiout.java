package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tubiout", "/app.tubiout"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tubiout extends GXWebObjectStub
{
   public tubiout( )
   {
   }

   public tubiout( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tubiout.class ));
   }

   public tubiout( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tubiout_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tubiout_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "SALIDAS DE UBICACIONES";
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

