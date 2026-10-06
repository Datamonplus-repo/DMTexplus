package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tsustangeneral", "/app.stocksquimicos.tsustangeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tsustangeneral extends GXWebObjectStub
{
   public tsustangeneral( )
   {
   }

   public tsustangeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tsustangeneral.class ));
   }

   public tsustangeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tsustangeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tsustangeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TSUSTANGeneral";
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

