package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbdet1", "/app.talbdet1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbdet1 extends GXWebObjectStub
{
   public talbdet1( )
   {
   }

   public talbdet1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbdet1.class ));
   }

   public talbdet1( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbdet1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbdet1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Almacen Entradas Tela (Header)";
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

