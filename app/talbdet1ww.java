package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbdet1ww", "/app.talbdet1ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbdet1ww extends GXWebObjectStub
{
   public talbdet1ww( )
   {
   }

   public talbdet1ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbdet1ww.class ));
   }

   public talbdet1ww( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbdet1ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbdet1ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento Almacen Entradas Tela (Header)";
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

