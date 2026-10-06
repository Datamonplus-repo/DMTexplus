package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpedobslpedidwc", "/app.tpedobslpedidwc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpedobslpedidwc extends GXWebObjectStub
{
   public tpedobslpedidwc( )
   {
   }

   public tpedobslpedidwc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpedobslpedidwc.class ));
   }

   public tpedobslpedidwc( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpedobslpedidwc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpedobslpedidwc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPEDOBSLPEDIDWC";
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

