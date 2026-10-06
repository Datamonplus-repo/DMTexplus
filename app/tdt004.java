package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdt004", "/app.tdt004"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdt004 extends GXWebObjectStub
{
   public tdt004( )
   {
   }

   public tdt004( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdt004.class ));
   }

   public tdt004( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdt004_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdt004_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PQUIMICOS F(PEDIDO)";
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

