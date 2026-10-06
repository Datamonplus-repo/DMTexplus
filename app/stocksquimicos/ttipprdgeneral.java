package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipprdgeneral", "/app.stocksquimicos.ttipprdgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipprdgeneral extends GXWebObjectStub
{
   public ttipprdgeneral( )
   {
   }

   public ttipprdgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipprdgeneral.class ));
   }

   public ttipprdgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipprdgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipprdgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPPRDGeneral";
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

