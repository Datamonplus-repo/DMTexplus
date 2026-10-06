package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informesalmacentejidoencrudo", "/app.informesalmacentejidoencrudo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informesalmacentejidoencrudo extends GXWebObjectStub
{
   public informesalmacentejidoencrudo( )
   {
   }

   public informesalmacentejidoencrudo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informesalmacentejidoencrudo.class ));
   }

   public informesalmacentejidoencrudo( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informesalmacentejidoencrudo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informesalmacentejidoencrudo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informes Almacen Tejido en Crudo";
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

