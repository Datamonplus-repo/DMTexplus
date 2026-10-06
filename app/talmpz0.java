package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talmpz0", "/app.talmpz0"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talmpz0 extends GXWebObjectStub
{
   public talmpz0( )
   {
   }

   public talmpz0( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talmpz0.class ));
   }

   public talmpz0( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talmpz0_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talmpz0_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "HISTORICO ALMACEN PIEZAS";
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

