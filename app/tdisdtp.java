package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdisdtp", "/app.tdisdtp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdisdtp extends GXWebObjectStub
{
   public tdisdtp( )
   {
   }

   public tdisdtp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdisdtp.class ));
   }

   public tdisdtp( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdisdtp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdisdtp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PEDIDO CON DETALLE PIEZAS 2ª";
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

