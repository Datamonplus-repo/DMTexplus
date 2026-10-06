package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.seleccionloteproducto", "/app.seleccionloteproducto"})
@jakarta.servlet.annotation.MultipartConfig
public final  class seleccionloteproducto extends GXWebObjectStub
{
   public seleccionloteproducto( )
   {
   }

   public seleccionloteproducto( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( seleccionloteproducto.class ));
   }

   public seleccionloteproducto( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new seleccionloteproducto_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new seleccionloteproducto_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seleccion Lote Producto";
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

