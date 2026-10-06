package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnwdp02", "/app.tnwdp02"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnwdp02 extends GXWebObjectStub
{
   public tnwdp02( )
   {
   }

   public tnwdp02( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnwdp02.class ));
   }

   public tnwdp02( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnwdp02_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnwdp02_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Pedidos Cliente (Detalle)";
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

