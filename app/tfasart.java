package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfasart", "/app.tfasart"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfasart extends GXWebObjectStub
{
   public tfasart( )
   {
   }

   public tfasart( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfasart.class ));
   }

   public tfasart( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfasart_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfasart_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Precios/Fases Artextil";
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

