package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcclienteresumenentradas", "/app.wcclienteresumenentradas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcclienteresumenentradas extends GXWebObjectStub
{
   public wcclienteresumenentradas( )
   {
   }

   public wcclienteresumenentradas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcclienteresumenentradas.class ));
   }

   public wcclienteresumenentradas( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcclienteresumenentradas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcclienteresumenentradas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCCliente Resumen Entradas";
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

