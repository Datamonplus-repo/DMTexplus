package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttippregeneral", "/app.ficherosbasicos.ttippregeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttippregeneral extends GXWebObjectStub
{
   public ttippregeneral( )
   {
   }

   public ttippregeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttippregeneral.class ));
   }

   public ttippregeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttippregeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttippregeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPPREGeneral";
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

