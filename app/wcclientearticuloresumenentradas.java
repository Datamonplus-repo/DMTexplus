package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcclientearticuloresumenentradas", "/app.wcclientearticuloresumenentradas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcclientearticuloresumenentradas extends GXWebObjectStub
{
   public wcclientearticuloresumenentradas( )
   {
   }

   public wcclientearticuloresumenentradas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcclientearticuloresumenentradas.class ));
   }

   public wcclientearticuloresumenentradas( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcclientearticuloresumenentradas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcclientearticuloresumenentradas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCCliente Articulo Resumen Entradas";
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

