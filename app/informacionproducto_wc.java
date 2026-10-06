package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informacionproducto_wc", "/app.informacionproducto_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informacionproducto_wc extends GXWebObjectStub
{
   public informacionproducto_wc( )
   {
   }

   public informacionproducto_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informacionproducto_wc.class ));
   }

   public informacionproducto_wc( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informacionproducto_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informacionproducto_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Mantenimiento Productos Quimicos";
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

