package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbdet2", "/app.talbdet2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbdet2 extends GXWebObjectStub
{
   public talbdet2( )
   {
   }

   public talbdet2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbdet2.class ));
   }

   public talbdet2( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbdet2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbdet2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Almacen Entradas Tela (Detail)";
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

