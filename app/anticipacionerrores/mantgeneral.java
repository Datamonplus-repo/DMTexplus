package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.anticipacionerrores.mantgeneral", "/app.anticipacionerrores.mantgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantgeneral extends GXWebObjectStub
{
   public mantgeneral( )
   {
   }

   public mantgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantgeneral.class ));
   }

   public mantgeneral( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MAnt General";
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

