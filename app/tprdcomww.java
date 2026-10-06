package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprdcomww", "/app.tprdcomww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprdcomww extends GXWebObjectStub
{
   public tprdcomww( )
   {
   }

   public tprdcomww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprdcomww.class ));
   }

   public tprdcomww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprdcomww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprdcomww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Producto Compuesto";
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

