package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tprdfabww", "/app.stocksquimicos.tprdfabww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprdfabww extends GXWebObjectStub
{
   public tprdfabww( )
   {
   }

   public tprdfabww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprdfabww.class ));
   }

   public tprdfabww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprdfabww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprdfabww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Fabricantes Productos Quimicos";
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

