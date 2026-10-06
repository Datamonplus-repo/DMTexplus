package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpedido_trnww", "/app.tpedido_trnww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpedido_trnww extends GXWebObjectStub
{
   public tpedido_trnww( )
   {
   }

   public tpedido_trnww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpedido_trnww.class ));
   }

   public tpedido_trnww( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpedido_trnww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpedido_trnww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Orden de compra de Quimicos";
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

