package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.entradaloteproducto", "/app.entradaloteproducto"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradaloteproducto extends GXWebObjectStub
{
   public entradaloteproducto( )
   {
   }

   public entradaloteproducto( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradaloteproducto.class ));
   }

   public entradaloteproducto( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradaloteproducto_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradaloteproducto_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Lote Producto";
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

