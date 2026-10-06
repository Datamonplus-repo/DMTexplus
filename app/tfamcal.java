package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfamcal", "/app.tfamcal"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfamcal extends GXWebObjectStub
{
   public tfamcal( )
   {
   }

   public tfamcal( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfamcal.class ));
   }

   public tfamcal( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfamcal_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfamcal_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CALIDADES funcion DE LA FAMILIA TIPO ARTICULO";
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

