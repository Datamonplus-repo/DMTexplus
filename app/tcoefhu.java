package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcoefhu", "/app.tcoefhu"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcoefhu extends GXWebObjectStub
{
   public tcoefhu( )
   {
   }

   public tcoefhu( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcoefhu.class ));
   }

   public tcoefhu( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcoefhu_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcoefhu_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "COEFICIENTE DE HUMEDAD";
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

