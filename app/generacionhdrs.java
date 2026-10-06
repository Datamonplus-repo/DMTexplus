package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.generacionhdrs", "/app.generacionhdrs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class generacionhdrs extends GXWebObjectStub
{
   public generacionhdrs( )
   {
   }

   public generacionhdrs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( generacionhdrs.class ));
   }

   public generacionhdrs( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new generacionhdrs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new generacionhdrs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Pedidos";
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

