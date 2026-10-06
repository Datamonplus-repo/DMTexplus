package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.disalb__trn", "/app.pedidos.disalb__trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class disalb__trn extends GXWebObjectStub
{
   public disalb__trn( )
   {
   }

   public disalb__trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( disalb__trn.class ));
   }

   public disalb__trn( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new disalb__trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new disalb__trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada de Almacen";
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

