package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talmpz3", "/app.talmpz3"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talmpz3 extends GXWebObjectStub
{
   public talmpz3( )
   {
   }

   public talmpz3( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talmpz3.class ));
   }

   public talmpz3( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talmpz3_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talmpz3_impl(context).cleanup();
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

