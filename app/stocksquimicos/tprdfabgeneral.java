package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tprdfabgeneral", "/app.stocksquimicos.tprdfabgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprdfabgeneral extends GXWebObjectStub
{
   public tprdfabgeneral( )
   {
   }

   public tprdfabgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprdfabgeneral.class ));
   }

   public tprdfabgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprdfabgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprdfabgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPRDFABGeneral";
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

