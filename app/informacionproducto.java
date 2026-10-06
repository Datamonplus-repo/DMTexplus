package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informacionproducto", "/app.informacionproducto"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informacionproducto extends GXWebObjectStub
{
   public informacionproducto( )
   {
   }

   public informacionproducto( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informacionproducto.class ));
   }

   public informacionproducto( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informacionproducto_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informacionproducto_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informacion Producto";
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

