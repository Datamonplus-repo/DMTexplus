package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tobsforgeneral", "/app.formulaciontinte.tobsforgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tobsforgeneral extends GXWebObjectStub
{
   public tobsforgeneral( )
   {
   }

   public tobsforgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tobsforgeneral.class ));
   }

   public tobsforgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tobsforgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tobsforgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TOBSFORGeneral";
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

