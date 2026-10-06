package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tmetpedprompt", "/app.stocksquimicos.tmetpedprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmetpedprompt extends GXWebObjectStub
{
   public tmetpedprompt( )
   {
   }

   public tmetpedprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmetpedprompt.class ));
   }

   public tmetpedprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmetpedprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmetpedprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona METODO PEDIDO DEL PRODUCTO";
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

