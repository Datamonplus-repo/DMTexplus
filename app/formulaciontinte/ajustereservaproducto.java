package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.ajustereservaproducto", "/app.formulaciontinte.ajustereservaproducto"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ajustereservaproducto extends GXWebObjectStub
{
   public ajustereservaproducto( )
   {
   }

   public ajustereservaproducto( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ajustereservaproducto.class ));
   }

   public ajustereservaproducto( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ajustereservaproducto_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ajustereservaproducto_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ajuste Reserva Producto";
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

