package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.creacionordencompraquimicos", "/app.comprasquimicos.creacionordencompraquimicos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class creacionordencompraquimicos extends GXWebObjectStub
{
   public creacionordencompraquimicos( )
   {
   }

   public creacionordencompraquimicos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( creacionordencompraquimicos.class ));
   }

   public creacionordencompraquimicos( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new creacionordencompraquimicos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new creacionordencompraquimicos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Creacion Orden Compra Quimicos";
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

