package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.ttipcolgeneral", "/app.formulaciontinte.ttipcolgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipcolgeneral extends GXWebObjectStub
{
   public ttipcolgeneral( )
   {
   }

   public ttipcolgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipcolgeneral.class ));
   }

   public ttipcolgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipcolgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipcolgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPCOLGeneral";
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

